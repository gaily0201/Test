package cn.gaily.xchange;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <p>Title: XChange2DB</P>
 * <p>Description: 数据交换插入数据库类</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-3
 */
public class XChange2DB{

	
	private static Connection  		 conn ;
	private static Statement 		 st;
	private static PreparedStatement pst ;
	private static ResultSet 		 rs;
	
	private static String DB_USERNAME = "";
	private static String DB_PASSWORD = "";
	private static String LOG_TABLENAME = "";
	
	private static String checkTableExistSql = "SELECT COUNT(1) FROM USER_TABLES WHERE TABLE_NAME=?";
	private static String checkRecordExistSql = "SELECT COUNT(1) FROM ? WHERE ?=?";
	
	static {
		DB_USERNAME		=PubUtils.getProperty("DB_USERNAME");
		DB_PASSWORD		=PubUtils.getProperty("DB_PASSWORD");
		LOG_TABLENAME	=PubUtils.getProperty("LOG_TABLENAME");

		try {
			conn = JdbcUtils.getConnectionThrowable(DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			log2db("获取数据库链接失败", e.getMessage()+", 获取数据库链接失败, 数据库名为:"+DB_USERNAME+",密码为:"+DB_PASSWORD);
		}
	}
	
	/**
	 * <p>方法名称：execSqls</p>
	 * <p>方法描述： 执行sql入口方法, 一批sql放在同一个事务中操作</p>
	 * @param sqls 构建好的sql语句
	 * @author xiaoh
	 * @throws SQLException 
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	public static void execSqls(List<String> sqls) {
		Savepoint sp = null;
		
		if(sqls==null||sqls.size()<=0){
			return;
		}
		
		try {
			if(conn==null||conn.isClosed()){
				try {
					conn = JdbcUtils.getConnectionThrowable(DB_USERNAME, DB_PASSWORD);
				} catch (SQLException e) {
					log2db("获取数据库链接失败", e.getMessage()+", 获取数据库链接失败, 数据库名为:"+DB_USERNAME+",密码为:"+DB_PASSWORD);
				}
			}
		} catch (SQLException e2) {
			throw new RuntimeException("连接出错！");
		}
		try {
			conn.setAutoCommit(false);
			sp = conn.setSavepoint();
			
			st = conn.createStatement();
			for(String sql :sqls){
				st.executeUpdate(sql);
			}
			conn.commit();
			
		}
		catch (SQLException e) {
			StringBuilder sb = new StringBuilder();
			for(String sql:sqls){
				sb.append(sql).append("  ");
			}
			try {
				conn.rollback(sp);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			log2db("插入数据库出现异常", e.getMessage()+"批量执行的sql为："+sb.toString().replaceAll("(", "||").replaceAll(")", "||"));
		} finally{
			JdbcUtils.release(conn, st, null);
		}
		
	}
	
	
	/**
	 * <p>方法名称：buildIstUpdtSql</p>
	 * <p>方法描述：通过构建的字段值map,表名构建INSERT语句或UPADATE语句</p>
	 * @param objs			同一类型的实体数组
	 * @param tableName		表名				与实体的数据库表相对应
	 * @param pkColumn		表pk字段名称		构建Insert语句时不需传入
	 * @return sql			返回insert语句
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	public static List<String> buildIstUpdtSql(Object[] objs, String tableName, String pkColumn){
		if(objs==null||objs.length<=0){
			throw new RuntimeException("未传入实体！");
		}
		List<Map<String,String>> valueMaps = new ArrayList<Map<String,String>>();
		Map<String,String> map = null;
		for(Object obj:objs){
			map = conveteEntity(obj);
			valueMaps.add(map);
		}
		
		if(valueMaps==null||valueMaps.size()<=0){
			throw new RuntimeException("传入实体失败！");
		}
		//保存sql
		List<String> sqls = new ArrayList<String>();
		String pkValue = "";
		for(Map<String,String> valueMap :valueMaps){
			pkValue = valueMap.get(pkColumn);
			boolean recordExist = recordExist(tableName, pkColumn, pkValue);
			String sql = null;
			Iterator<Entry<String, String>> it = valueMap.entrySet().iterator();
			Entry<String,String> entry = null;
			String field = null;
			String value = null;
	
			if(!recordExist){
				StringBuilder fieldSb = new StringBuilder("INSERT INTO ");
				fieldSb.append(tableName.toUpperCase()).append("(");
				StringBuilder valueSb = new StringBuilder("VALUES('");
				while(it.hasNext()){
					entry = it.next();
					field = entry.getKey();
					value = entry.getValue();
					fieldSb.append(field).append(",");
					valueSb.append(value).append("','");
				}
				fieldSb.deleteCharAt(fieldSb.length()-1);
				valueSb.delete(valueSb.length()-2, valueSb.length());
				valueSb.append(") ");
				fieldSb.append(") ");
				sql = fieldSb.append(valueSb).toString();
				sqls.add(sql);
			}
			
			if(recordExist){
				StringBuilder fieldSb = new StringBuilder("UPDATE ");
				fieldSb.append(tableName.toUpperCase()).append(" SET ");
				StringBuilder whereSb = new StringBuilder(" WHERE ");
				if(PubUtils.isEmpty(pkColumn)||PubUtils.isEmpty(pkValue)){
					throw new RuntimeException("必须传入pk字段和pk值");
				}
				boolean containsPk = false;
				while(it.hasNext()){
					entry = it.next();
					field = entry.getKey();
					value = entry.getValue();
					if(!PubUtils.isEmpty(pkColumn) && field.toUpperCase().equals(pkColumn.toUpperCase())){
						whereSb.append(field).append("='").append(value).append("'");
						containsPk = true;
						continue;
					}
					fieldSb.append(field).append("='").append(value).append("',");
				}
				fieldSb.deleteCharAt(fieldSb.length()-1);
				if(!containsPk){
					whereSb.append(pkColumn).append("='").append(pkValue).append("'");
				}
				
				fieldSb.append(whereSb);
				sql = fieldSb.toString();
				sqls.add(sql);
			}
		}
		return sqls;
	}
	
	/**
	 * <p>方法名称：	conveteEntity</p>
	 * <p>方法描述：	将实体文件转换成map对象, map中存放key:字段名,value:字段值
	 * 				注意：传入的实体的属性要和数据库中的字段对应, 否则转换失败</p>
	 * @param obj	待转换对象
	 * @return map	map中存放key:字段名,value:字段值
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	private static Map<String, String> conveteEntity(Object obj){
		Map<String,Method> methodMap = new HashMap<String,Method>();
		Field[] fields =  obj.getClass().getDeclaredFields();
		Method[] methods =  obj.getClass().getDeclaredMethods();
		String methodName = null;
		for(Method m: methods){
			methodName = m.getName();
			if(methodName.startsWith("get")){
				methodMap.put(methodName.substring(3, methodName.length()).toLowerCase(), m);
			}
		}
		
		String fieldName = null;
		Method execMethod = null;
		Map<String,String> resultMap = new HashMap<String,String>();
		for(Field f: fields){
			fieldName = f.getName().toLowerCase();
			execMethod = methodMap.get(fieldName);
			if(execMethod==null){
				continue;
			}
			execMethod.setAccessible(true);
			String value = null;
			try {
				value = (String) execMethod.invoke(obj, new Object[]{});
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			if(PubUtils.isEmpty(value)){
				continue;
			}
			resultMap.put(fieldName, value);
		}
		return resultMap;
	}
	
	
	/**
	 * <p>方法名称：recordExist</p>
	 * <p>方法描述：检测某表中的某条数据是否已经存在</p>
	 * @param tableName	  表名
	 * @param pkColumn	  唯一标识字段名
	 * @param pkValue    唯一标识字段值
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	private static boolean recordExist(String tableName, String pkColumn, String pkValue){
		if(!tableExist(tableName)){
			throw new RuntimeException("传入的表在数据库中不存在！");
		}
		if(PubUtils.isEmpty(pkColumn)||PubUtils.isEmpty(pkValue)){
			return false;
		}
		try {
			if(conn==null||conn.isClosed()){
				conn = JdbcUtils.getConnection(DB_USERNAME, DB_PASSWORD);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		String sql = "SELECT COUNT(1) FROM "+tableName+" WHERE "+pkColumn+"='"+pkValue+"'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
//			pst = conn.prepareStatement(checkRecordExistSql);
//			pst.setString(1, tableName.toUpperCase());
//			pst.setString(2, pkColumn);
//			pst.setString(3, pkValue);
//			rs = pst.executeQuery();
			if(!rs.next()||rs.getInt(1)!=1){
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(conn, pst, rs);
		}
		
		return true;
	}
	
	
	/**
	 * <p>方法名称：tableExist</p>
	 * <p>方法描述：检测数据表是否存在</p>
	 * @param tableName	表名
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	private static boolean tableExist(String tableName){
		if(PubUtils.isEmpty(tableName)){
			return false;
		}
		try {
			if(conn==null||conn.isClosed()){
				conn = JdbcUtils.getConnection(DB_USERNAME, DB_PASSWORD);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			pst = conn.prepareStatement(checkTableExistSql);
			pst.setString(1, tableName.toUpperCase());
			rs = pst.executeQuery();
			if(!rs.next()|| rs.getInt(1)!=1){
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(conn, pst, rs);
		}
		
		return true;
	}
	
	/**
	 * <p>方法名称：log2db</p>
	 * <p>方法描述：记录日志结果到数据库中</p>
	 * @param brief		简略信息
	 * @param detail	详细信息
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	private static void log2db(String brief,String detail){
		XChangeLog log = new XChangeLog();
		log.setPk(PubUtils.getSequence());
		log.setLogger("");
		log.setLogtime(DateFormat.getDateTimeInstance().format(new Date()));
		log.setTs(DateFormat.getDateTimeInstance().format(new Date()));
		log.setType("1"); //新增为1,修改未解决为2,修改解决为0
		log.setError(brief);
		log.setDetail(filterCharacter(detail));
		List<String> sqls = null;
		String sql = null;
		try {
			sqls = buildIstUpdtSql(new XChangeLog[]{log}, LOG_TABLENAME, null);
			if(sqls!=null&& sqls.size()==1){
				sql = sqls.get(0);
			}
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		}
		System.out.println(sql);
		if(PubUtils.isEmpty(sql)){
			return;
		}
		boolean closed = true;
		try{
			closed = conn.isClosed();
		}catch (SQLException e) {
			throw new RuntimeException("连接异常！");
		}
		if(closed){
			conn = JdbcUtils.getConnection(DB_USERNAME, DB_PASSWORD);
		}
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtils.release(conn, st, null);
		}
		
	}
	
	/**
	 * <p>方法名称：filterCharacter</p>
	 * <p>方法描述：过滤字符</p>
	 * @param value
	 * @return
	 * @author xiaoh
	 * @since  2014-9-5
	 * <p> history 2014-9-5 xiaoh  创建   <p>
	 */
	private static String filterCharacter(String value){
		if(PubUtils.isEmpty(value)){
			return "";
		}
		if(value.contains("(")){
			value = value.replaceAll("(", "");
		}
		if(value.contains(")")){
			value = value.replaceAll(")", "");
		}
		return value;
	}
	
}

