package cn.gaily.orm.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.javabean.IBean;
import cn.gaily.orm.pub.JdbcUtils;
import cn.gaily.orm.pub.NamingStrategy;
import cn.gaily.orm.pub.PubUtils;
import cn.gaily.orm.pub.ResourceManager;
import cn.gaily.orm.vos.OrgOrgsVO;

/**
 * <p>Title: BackupHelper</P>
 * <p>Description: 备份数据库文件,保存在文本中</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-9
 */
public class BackupHelper {
	
	private static Connection  		 conn ;
	private static Statement 		 st;
	private static PreparedStatement pst ;
	private static ResultSet 		 rs;
	
	private static NamingStrategy name = NamingStrategy.LOWERUPPER;
	
	/**
	 * <p>方法名称：backup</p>
	 * <p>方法描述：备份数据,保存到本地文件</p>
	 * @param bean	实体名
	 * @param filePath	保存文件路径及文件名
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	public static void backup(Class<? extends IBean> bean, File filePath){
		
		if(bean==null|| filePath==null){
			throw new RuntimeException("传入的参数有误！");
		}
		
		//获取表名
		Annotation[] annos = bean.getAnnotations();
		Table tableAnno = null;
		String tableName = null;
		if(annos.length==1&&annos[0].annotationType()==Table.class){
			tableAnno = (Table) annos[0];
			tableName = tableAnno.tableName();
		}
		if(PubUtils.isEmpty(tableName)){
			String beanName = bean.getSimpleName();
			tableName = beanName.substring(0, beanName.length()-2);
			tableName = name.naming(tableName);
		}
		
		//获取字段
		List<String> fieldList = new ArrayList<String>();
		Field[] fields = bean.getDeclaredFields();
		if(fields==null||fields.length<=0){
			throw new RuntimeException("获取字段有误！");
		}
		for(Field field:fields){
			fieldList.add(field.getName().toUpperCase());
		}
		
		conn = JdbcUtils.getConnection(ResourceManager.DB_USERNAME, ResourceManager.DB_PASSWORD, ResourceManager.DB_IP);
		
		List<IBean> resultList = new ArrayList<IBean>();
		Map<String,Method> methodMap = new HashMap<String,Method>();
		
		int totalRecord = getTotalRecord(tableName);
		String querySql = null;
		if(totalRecord<=1000){
			querySql = getQueryAllSql(tableName, fieldList, 0, -1);
			resultList = getResultList(bean, fieldList, resultList, querySql);
			buildAndWriteFile(filePath, tableName, resultList);

		}
		
		int start = 0;
		int round = 0;
		while(totalRecord>1000&&start<=totalRecord){
			querySql = getQueryAllSql(tableName, fieldList,1000*round, 1000);
			resultList = getResultList(bean, fieldList, resultList, querySql);
			round++;
			buildAndWriteFile(filePath, tableName, resultList);
			resultList.clear();
			System.out.println(round*1000);
		}
	}
	
	
	
	private static void buildAndWriteFile(File filePath, String tableName, List<IBean> resultList) {
		if(resultList.size()<=0){ //未构建成功对象或该表中没有值
			return;
		}
		
		List<String> sqls = new ArrayList<String>();
		String sql = null;
		for(IBean entity: resultList){
			sql = buildSql(entity, tableName);
			if(PubUtils.isNotEmpty(sql)){
				sqls.add(sql);
			}
		}
		try {
			writeToFile(sqls, filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<IBean> getResultList(Class<? extends IBean> bean, List<String> fieldList, List<IBean> resultList, String querySql) {
		Map<String, Method> methodMap;
		IBean  instance = null;
		Method[] methods = null;
		Method method = null;
		try {
			methods = bean.getDeclaredMethods();
			methodMap = getMethodMap(methods);
			st = conn.createStatement();
			rs = st.executeQuery(querySql);
			while(rs.next()){
				instance = bean.newInstance();
				for(String field: fieldList){
					method = methodMap.get(field.toLowerCase());
					if(method!=null){
						method.invoke(instance, rs.getString(field));
					}
				}
				resultList.add(instance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(null, st, rs);
		}
		return resultList;
	}

	
	/**
	 * <p>方法名称：getTotalRecord</p>
	 * <p>方法描述：获取总记录数</p>
	 * @param tableName
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	private static int getTotalRecord(String tableName) {
		try {
			if(conn==null ||conn.isClosed()){
				conn = JdbcUtils.getConnection(ResourceManager.DB_USERNAME, ResourceManager.DB_PASSWORD, ResourceManager.DB_IP);
			}
			st = conn.createStatement();
			rs = st.executeQuery("SELECT COUNT(1) FROM "+tableName);
			if(rs.next()&&rs.getInt(1)>0){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(null, st, rs);
		}
		return 0;
	}


	/**
	 * <p>方法名称：writeToFile</p>
	 * <p>方法描述：写入文件</p>
	 * @param sqls
	 * @param filePath
	 * @throws IOException
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	private static void writeToFile(List<String> sqls, File file) throws IOException {
		if(sqls.size()<=0||file==null){
			return;
		}
		if(!file.exists()){
			if(file.getAbsolutePath().contains(".")){
				file.getParentFile().mkdirs();
			}
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream(file, true);
			osw = new OutputStreamWriter(fos, "GBK");
			for(String sql: sqls){
				osw.append(sql);
				osw.append("\r");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			osw.flush();
			osw.close();
			fos.close();
		}
	}






	/**
	 * <p>方法名称：buildSql</p>
	 * <p>方法描述：构建sql语句</p>
	 * @param entity
	 * @param tableName
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	private static String buildSql(IBean entity, String tableName) {
		StringBuilder sb = new StringBuilder("INSERT INTO ");
		sb.append(tableName).append("(");
		StringBuilder valueSb = new StringBuilder(" VALUES(");
		
		Method[] methods = entity.getClass().getDeclaredMethods();
		Map<String,Method> methodMap = new HashMap<String,Method>();
		List<Method> methodList = new ArrayList<Method>();
		String methodName = null;
		for(Method m: methods){
			methodName = m.getName();
			if(methodName.startsWith("get")){
//				methodMap.put(methodName.substring(methodName.length()-3, methodName.length()).toLowerCase(), m);
				methodList.add(m);
			}
		}
		Field field = null;
		String type = null;
		Column column = null;
		for(Method m: methodList){
			methodName = m.getName();
			methodName = methodName.substring(3,methodName.length()).toLowerCase();
			try {
				field = entity.getClass().getDeclaredField(methodName.toUpperCase());
				column = field.getAnnotation(Column.class);
				type = column.dataType();
			} catch (NoSuchFieldException e1) {
				e1.printStackTrace();
			} catch (SecurityException e1) {
				e1.printStackTrace();
			}
			
			try {
				String value = (String) m.invoke(entity, null);
				if(PubUtils.isNotEmpty(value)){
					sb.append(methodName);
					sb.append(",");
					if("int".equals(type)){
						valueSb.append(value).append(",");
					}else{
						valueSb.append("'").append(value).append("',");
					}
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append(") "); 
		valueSb.deleteCharAt(valueSb.length()-1);
		valueSb.append(")");
		sb.append(valueSb).append(";");

		return sb.toString();
	}

	private static Map<String, Method> getMethodMap(Method[] methods) {
		Map<String,Method> methodMap = new HashMap<String,Method>();
		String methodName =null;
		for(Method m:methods){
			methodName = m.getName();
			if(methodName.startsWith("set")){
				methodMap.put(methodName.substring(3, methodName.length()).toLowerCase(), m);
			}
		}
		return methodMap;
	}

	/**
	 * <p>方法名称：getQueryAllSql</p>
	 * <p>方法描述：获取查询数据的sql语句,可分页</p>
	 * @param tableName
	 * @param fieldList
	 * @param startRecord
	 * @param perLength
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	private static String getQueryAllSql(String tableName, List<String> fieldList, int startRecord, int perLength) {
		StringBuilder sb = new StringBuilder("SELECT ");
		for(String field:fieldList){
			sb.append(field.trim().toUpperCase());
			sb.append(",");
		}
		sb.delete(sb.length()-1, sb.length());
		sb.append(" FROM ");
		sb.append(tableName.trim().toUpperCase());
		String innerSql = sb.toString();
		if(perLength==-1){
			return innerSql;
		}
		StringBuilder pageSql = new StringBuilder("SELECT RESULT.* FROM ");
		pageSql.append(" (SELECT T.*,ROWNUM RN FROM (").append(innerSql).append(") T WHERE ROWNUM<=").append(startRecord+perLength); 
		pageSql.append(") RESULT WHERE RN>").append(startRecord);
		return pageSql.toString();
	}
	
	
	public static void main(String[] args) {
		File file = new File("c:\\org_orgs.sql");
		if(file.exists()){
			file.delete();
		}
		backup(OrgOrgsVO.class, file);
	}
	
	
	
	
}