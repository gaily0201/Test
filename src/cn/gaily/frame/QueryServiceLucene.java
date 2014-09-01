package cn.gaily.frame;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;

import cn.gaily.pub.JdbcUtils;
import cn.gaily.pub.PubUtils;
import cn.gaily.pub.ResourceManager;

public class QueryServiceLucene implements ResourceManager{
	private static Connection conn  =null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	private static Analyzer analyzer = new SmartChineseAnalyzer(Version.LUCENE_4_9);
	private static IndexWriter writer = null;
	private static IndexWriterConfig config  = null;
	private static IndexReader reader = null;
	private static Directory directory = null;
	private static boolean create = true;
	
	private static String[] QUERY_FIELDS = null;
	private static String QUERY_COMMENT_SQL = null;
	
	/**
	 * <p>方法名称：init</p>
	 * <p>方法描述：获取配置文件信息</p>
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	public static void init(){
		String arr = PubUtils.getProperty("COMMENT_TABLENAMES");
		if(PubUtils.isNotEmpty(arr.trim())){
			QUERY_FIELDS = arr.trim().split(SPLIT_PREFIX);
		}
		QUERY_COMMENT_SQL = PubUtils.getProperty("QUERY_COMMENT_SQL");
		if(PubUtils.isEmpty(QUERY_COMMENT_SQL)){
			throw new RuntimeException("设置出错，无法初始化！");
		}
	}
	
	static{
		init();
	}
	
	/**
	 * <p>方法名称：testQuery</p>
	 * <p>方法描述：测试数据库连接</p>
	 * @param susername
	 * @param spassword
	 * @param ip
	 * @param dbName
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	public static boolean testQuery(String susername, String spassword, String ip, String dbName) {
		conn = null;
		conn = JdbcUtils.getConnection(susername, spassword, ip, dbName);
		if(conn==null){
			return false;
		}
		JdbcUtils.release(conn, null, null);
		return true;
	}


	/**
	 * <p>方法名称：initQueryData</p>
	 * <p>方法描述：初始化查询数据,并创建lucene索引</p>
	 * @param suser
	 * @param spassword
	 * @param sip
	 * @param dbName
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	public static boolean initQueryData(String suser, String spassword, String sip, String dbName, int i) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		conn = JdbcUtils.getConnection(suser,spassword, sip, dbName);
		if(conn==null){
			return false;
		}
		try {
			st = conn.createStatement();
			rs = st.executeQuery(QUERY_COMMENT_SQL);
			if(i==0){
				buildBlurIndex(rs);
			}else if(i==1){
				buildExcatIndex(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} finally{
			JdbcUtils.release(conn, st, rs);
		}
		
		return true;
	}

	/**
	 * <p>方法名称：buildLuceneIndex</p>
	 * <p>方法描述：创建精确查询索引</p>
	 * @param rs2	数据库查询结果集
	 * @author xiaoh
	 * @since  2014-8-24
	 * <p> history 2014-8-24 xiaoh  创建   <p>
	 */
	private static void buildExcatIndex(ResultSet rs) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		buildLuceneIndex(rs, StringField.class);
	}
	/**
	 * <p>方法名称：buildBlurIndex</p>
	 * <p>方法描述：创建模糊查询索引</p>
	 * @param rs2	数据库查询结果集
	 * @author xiaoh
	 * @since  2014-8-24
	 * <p> history 2014-8-24 xiaoh  创建   <p>
	 */
	private static void buildBlurIndex(ResultSet rs) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		buildLuceneIndex(rs, TextField.class);
	}
	
	/**
	 * <p>方法名称：buildLuceneIndex</p>
	 * <p>方法描述：创建索引</p>
	 * @param rs
	 * @param fieldClass
	 * @author xiaoh
	 * @since  2014-8-29
	 * <p> history 2014-8-29 xiaoh  创建   <p>
	 */
	private static void buildLuceneIndex(ResultSet rs, Class<? extends Field> fieldClass) throws IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		File path = new File(ResourceManager.INDEX_PATH);
		if(!path.exists()){
			path.mkdirs();
		}
		File[] files = path.listFiles();
		if(files.length>0){
			create = false;
		}
		
		try {
			directory = SimpleFSDirectory.open(path);
			config = new IndexWriterConfig(Version.LUCENE_4_9, analyzer);
			
			if(create){
				config.setOpenMode(OpenMode.CREATE);
				writer = new IndexWriter(directory, config);
			}else{
				config.setOpenMode(OpenMode.CREATE_OR_APPEND);
				deleteAllIndex(path);
			}
			Document doc = null;
			Constructor<? extends Field> constructor = fieldClass.getDeclaredConstructor(String.class, String.class, Store.class);
			while(rs!=null && rs.next()){
				doc = new Document();
				for(int i=1;i<QUERY_FIELDS.length;i++){
					if(rs.getString(i)==null||PubUtils.isEmpty(rs.getString(i))){
						continue;
					}
					Field field =constructor.newInstance(new Object[]{QUERY_FIELDS[i], rs.getString(i), Store.YES});
					doc.add(field);
				}
				writer.addDocument(doc,analyzer);
				doc = null;
			}
			writer.commit();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(directory!=null){
				directory.close();
			}
			if(writer!=null){
				writer.close();
			}
		}
	}
	
	
	/**
	 * <p>方法名称：deleteAllIndex</p>
	 * <p>方法描述：删除目录下所有索引</p>
	 * @throws IOException
	 * @author xiaoh
	 * @since  2014-8-24
	 * <p> history 2014-8-24 xiaoh  创建   <p>
	 */
	public static void deleteAllIndex(File path) throws IOException {
		Directory directory = new SimpleFSDirectory(path);
		config.setTermIndexInterval(IndexWriterConfig.DISABLE_AUTO_FLUSH);
		
		writer = new IndexWriter(directory, config);
		try {
			writer.deleteAll();
			writer.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	/**
	 * <p>方法名称：queryByKeyword</p>
	 * <p>方法描述：查询某一列</p>
	 * @param keyword
	 * @param column
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	public static List<Vector<String>> queryByKeyword(String keyword, int column){
		if(column==0){
			return null;
		}
		QueryParser parser = new QueryParser(Version.LUCENE_4_9, QUERY_FIELDS[column], analyzer);
		return query(keyword, parser);
	}
	
	/**
	 * <p>方法名称：queryAll</p>
	 * <p>方法描述：查询所有字段</p>
	 * @param keyword
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	public static List<Vector<String>> queryAll(String keyword){
		MultiFieldQueryParser parser = new MultiFieldQueryParser(Version.LUCENE_4_9, QUERY_FIELDS, analyzer);
		return query(keyword, parser);
	}
	

	/**
	 * <p>方法名称：query</p>
	 * <p>方法描述：lucene查询方法</p>
	 * @param keyword 关键字
	 * @param parser 查询转换器
	 * @return
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	public static List<Vector<String>> query(String keyword, QueryParser parser){
		if(keyword==null||PubUtils.isEmpty(keyword)){
			return null;
		}
		Vector<String> vector = null;
		List<Vector<String>> list =new ArrayList<Vector<String>>();
		
		File path = new File(ResourceManager.INDEX_PATH);
		try{
			directory  = new SimpleFSDirectory(path);
			IndexReader reader = DirectoryReader.open(directory);
			IndexSearcher searcher  =new IndexSearcher(reader);
			
//			MultiFieldQueryParser parser = new MultiFieldQueryParser(Version.LUCENE_4_9,QUERY_FIELD, analyzer);
			Query query = parser.parse(keyword);
			
			TopDocs docs = searcher.search(query, null , ResourceManager.QUERY_SIZE);
			ScoreDoc[] scores = docs.scoreDocs;
			int i=0;
			Document document =null;
			if(scores!=null && scores.length>0){
				for(ScoreDoc score: scores){
					document = searcher.doc(score.doc);
					vector = new Vector<String>();
					vector.addElement(++i +"");
					for(int j=1;j<QUERY_FIELDS.length;j++){
						vector.addElement(document.get(QUERY_FIELDS[j]));
					}
					list.add(vector);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			return list;
		}finally{
			try {
				if(reader!=null){
					reader.close();
				}
				if(directory!=null){
					directory.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
