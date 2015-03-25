package cn.gaily.xchange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>Title: JdbcUtils</P>
 * <p>Description: 用于连接远程库的一个简单jdbc工具</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-8-6
 */
public class JdbcUtils{

	private static ResultSet  		rs 		= null;
	private static Connection 		conn 	= null;
	private static Statement 		st 		= null;
	private static String 		DRIVER 		= "";
	private static String 		URL 		= "";
	private static String 		DEFAULT_USERNAME 	= "";
	private static String 		DEFAULT_PASSWORD 	= "";
	
	public JdbcUtils(String username, String password){
		this.DEFAULT_USERNAME = username;
		this.DEFAULT_PASSWORD = password;
	}
	
	static{
		
		DRIVER = PubUtils.getProperty("DB_DRIVER");
		URL    = PubUtils.getProperty("DB_URL");
		DEFAULT_USERNAME=PubUtils.getProperty("DB_USERNAME");
		DEFAULT_PASSWORD=PubUtils.getProperty("DB_PASSWORD");
		
		try {
			if(!PubUtils.isEmpty(DRIVER)){
				Class.forName(DRIVER);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			release(conn, st, rs);
		}
	}
	
	public JdbcUtils(Connection conn, Statement st, ResultSet rs){
		this.conn = conn;
		this.st = st;
		this.rs = rs;
	}
	
	public static Connection getConnection(){
		return getConnection(DEFAULT_USERNAME, DEFAULT_PASSWORD);
	}
	
	public static Connection getConnection(String userName, String password){
		try {
			conn = DriverManager.getConnection(URL, userName, password);
		} catch (SQLException e) {
			release(conn, st, rs);
		}
		return conn;
	}
	public static Connection getConnectionThrowable(String userName, String password) throws SQLException{
		conn = DriverManager.getConnection(URL, userName, password);
		return conn;
	}
	public static Connection getConnection(String userName, String password, String ip ,String dbName){
		conn = null;
		try {
			String url = "jdbc:oracle:thin:@"+ip+":1521:"+dbName.toUpperCase();
			conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			release(conn, st, rs);
		}
		return conn;
	}
	
	public static Connection getConnection(String userName, String password, String ip){
		return getConnection(userName, password, ip, "ORCL");
	}
	
	public static void release(Connection conn, Statement st, ResultSet rs){
		if(rs!=null){
			try{
				rs.close();
				rs = null;
			} catch (SQLException e) {
			}
		}
		if(st!=null){
			try{
				st.close();
				st  =null;
			}catch(SQLException e){
			}
		}
		if(conn!=null){
			try{
				conn.close();
				conn = null;
			}catch(SQLException e){
			}
		}
}
	
}
