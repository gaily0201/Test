package cn.gaily.frame;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cn.smart.SmartChineseAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;
import cn.gaily.pub.PubUtils;
import cn.gaily.pub.ResourceManager;

public class BuildFileIndexService {

	private static Analyzer analyzer = new SmartChineseAnalyzer(Version.LUCENE_4_9);
	private static IndexWriterConfig config  = null;
	private static IndexReader reader = null;
	private static IndexWriter writer = null;
	private static Directory directory = null;
	private static boolean create = true;
	private static String[] QUERY_FIELDS = new String[]{"name","path","date"};
	ExecutorService subpool = Executors.newFixedThreadPool(20);
	
	public void buildIndex() {
		final BuildFileIndexService service = new BuildFileIndexService();
		File[] files = File.listRoots();
		System.out.println(files.length);
		ExecutorService pool = Executors.newCachedThreadPool();
		for(File f: files){
			final File ff = f;
			pool.execute(new Runnable(){
				@Override
				public void run() {
					try {
						service.listFiles(ff);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
	
	
	
	
	ThreadLocal<ArrayList<String>> threadlocal = new ThreadLocal<ArrayList<String>>();
	
	private File listFiles(File directory) throws IOException{
		File[] files = null;
		
		if(threadlocal.get()==null){
			threadlocal.set(new ArrayList<String>());
		}
		
		if(directory.isDirectory()){
			files = directory.listFiles();
			if(files==null){
				return null;
			}
			threadlocal.get().add(directory.getName()+"|||"+directory.getAbsolutePath()+"|||"+directory.lastModified());
//			System.out.println(Thread.currentThread().getName()+"--"+directory.getAbsolutePath());
			for(File f: files){
				final File ff = f;
				Runnable task = new Runnable(){
					public void run() {
						try {
							listFiles(ff);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				};
				subpool.execute(task);
			}
		}else{
			threadlocal.get().add(directory.getName()+",,,"+directory.getAbsolutePath()+",,,"+directory.lastModified());
//			System.out.println(Thread.currentThread().getName()+"--"+directory.getAbsolutePath());
		}
		
		if(threadlocal.get().size()>1000){
			buildLuceneIndex(threadlocal.get());
			System.out.println(Thread.currentThread().getName()+"write");
			threadlocal.get().clear();
		}
		return null;
	}
	
	
	private void buildLuceneIndex(List<String> list) throws IOException{
		synchronized (BuildFileIndexService.class) {
			config = new IndexWriterConfig(Version.LUCENE_4_9, analyzer);
			config.setOpenMode(OpenMode.CREATE_OR_APPEND);
			File path = new File(ResourceManager.SYS_FILE_INDEX);
			if(!path.exists()){
				path.mkdirs();
			}
			
			try {
				directory = SimpleFSDirectory.open(path);
				writer = new IndexWriter(directory,config);
				Document doc = null;
				String[] vv = null;
				Field nameField = null;
				Field pathfield = null;
				Field datefield = null;
				for(String value: list){
					doc = new Document();
					vv = value.split(",,,");
					if(vv.length<3){
						continue;
					}
					nameField = new TextField(QUERY_FIELDS[0],vv[0],Store.YES);
					pathfield = new TextField(QUERY_FIELDS[1],vv[1],Store.YES);
					datefield = new TextField(QUERY_FIELDS[2],vv[2],Store.NO);
					doc.add(nameField);
					doc.add(pathfield);
					doc.add(datefield);
					writer.addDocument(doc,analyzer);
					doc = null;
				}
				writer.commit();
			}catch (Exception e) {
				e.printStackTrace();
			}finally{
//				if(directory!=null){
//					directory.close();
//				}
				if(writer!=null){
					writer.close();
				}
			}
		}
	}
	
	
	public List<Vector<String>> query(String keyword){
		MultiFieldQueryParser parser = new MultiFieldQueryParser(Version.LUCENE_4_9, QUERY_FIELDS, analyzer);
		if(keyword==null||PubUtils.isEmpty(keyword)){
			return null;
		}
		Vector<String> vector = null;
		List<Vector<String>> list =new ArrayList<Vector<String>>();
		
		File path = new File(ResourceManager.SYS_FILE_INDEX);
		try{
			directory  = new SimpleFSDirectory(path);
			IndexReader reader = DirectoryReader.open(directory);
			IndexSearcher searcher  =new IndexSearcher(reader);
			
			Query query = parser.parse(keyword);
			
			TopDocs docs = searcher.search(query, null , ResourceManager.QUERY_SIZE);
			ScoreDoc[] scores = docs.scoreDocs;
			int i=0;
			Document document =null;
			if(scores!=null && scores.length>0){
				for(ScoreDoc score: scores){
					document = searcher.doc(score.doc);
					vector = new Vector<String>();
					for(int j=0;j<QUERY_FIELDS.length;j++){
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
	
	
	
	
//	private void deleteAllIndex(File path) throws IOException {
//		Directory directory = new SimpleFSDirectory(path);
//		config.setTermIndexInterval(IndexWriterConfig.DISABLE_AUTO_FLUSH);
//		
//		writer = new IndexWriter(directory, config);
//		try {
//			writer.deleteAll();
//			writer.commit();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
}
