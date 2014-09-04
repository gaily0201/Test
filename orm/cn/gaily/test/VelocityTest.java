package cn.gaily.test;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import cn.gaily.pub.JdbcUtils;
import cn.gaily.pub.PubUtils;

public class VelocityTest {

	
	public static final String querySql = "SELECT COLUMN_NAME FROM USER_TAB_COLUMNS A WHERE TABLE_NAME=? ORDER BY COLUMN_ID ASC";
	
	public static Connection conn ;
	public static PreparedStatement  pst;
	public static ResultSet  rs;
	
	public static final String DB_USERNAME="uap63";
	public static final String DB_PASSWORD="1";
	public static final String TABLENAME ="ORG_ORGS";
	/**
	 * <p>方法名称：main</p>
	 * <p>方法描述：</p>
	 * @param args
	 * @author xiaoh
	 * @throws IOException 
	 * @since  2014-9-4
	 * <p> history 2014-9-4 xiaoh  创建   <p>
	 */
	public static void main(String[] args) throws IOException {
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		
		Template t = ve.getTemplate("orm/cn/gaily/test/test.vm", "UTF-8");
		
		VelocityContext context = new VelocityContext();
		
		List<String> columns = getColumns(TABLENAME);
		List<String> methods = convertFirst(columns);
		
		String tableName = charToUppercase(TABLENAME, new int[]{0});
		String nowDate = DateFormat.getDateInstance().format(new Date());
		
		context.put("tableName", tableName);
		context.put("nowDate", nowDate);
		context.put("columns", columns);
		context.put("methods", methods);
		
		StringWriter sw = new StringWriter();
		t.merge(context, sw);
		System.out.println(sw.toString());
		
//		System.out.println(System.getProperty("user.dir"));
		
		sw.flush();
		sw.close();
	}
	
	
	public static List<String> getColumns(String tableName){
		if(PubUtils.isEmpty(tableName)){
			return null;
		}
		List<String> columns = new ArrayList<String>();
		conn = JdbcUtils.getConnection(DB_USERNAME, DB_PASSWORD);
		try {
			pst = conn.prepareStatement(querySql);
			pst.setString(1, tableName.toUpperCase());
			rs = pst.executeQuery();
			String column = "";
			ColumnObj obj = null;
			while(rs.next()){
				column = rs.getString(1);
				if(PubUtils.isEmpty(column)){
					continue;
				}
				columns.add(column);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(conn, pst, rs);
		}
		return columns;
	}
	
	
	public static List<String> convertFirst(List<String> list){
		if(list==null||list.size()<=0){
			return null;
		}
		List<String> result = new ArrayList<String>();
		for(String value :list){
			result.add(charToUppercase(value, new int[]{0}));
		}
		return result;
	}
	
	
	public static String charToUppercase(String value, int[] num){
		if(PubUtils.isEmpty(value)){
			return "";
		}
		StringBuilder sb = null;
		if(value.contains("_")){
			sb = new StringBuilder(value);
			sb.deleteCharAt(value.indexOf("_"));
			value = sb.toString();
		}
		char[] values = value.toLowerCase().toCharArray();
		int length = values.length;
		for(int i: num){
			if(i>length){
				return values.toString();
			}
		}
		for(int i=0;i<num.length;i++){
			values[num[i]] = (values[num[i]]+"").toUpperCase().toCharArray()[0]; 
		}
		
		return String.valueOf(values);
	}
	
//	public static void main(String[] args){
//		String s = "sfjasSFSFFSVLKJ";
//		System.out.println(charToUppercase(s,new int[]{1,s.length()-1} ));
//	}
	

}

class ColumnObj{
	private String column;
	private String ucolumn;
	private String comment;
	public ColumnObj(){}
	public ColumnObj(String column,String ucolumn,String comment){
		this.column=column;
		this.ucolumn=ucolumn;
		this.comment=comment;
	}
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public String getUcolumn() {
		return ucolumn;
	}
	public void setUcolumn(String ucolumn) {
		this.ucolumn = ucolumn;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}



