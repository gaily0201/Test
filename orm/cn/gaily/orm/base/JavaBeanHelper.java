package cn.gaily.orm.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import cn.gaily.orm.javabean.FieldBean;
import cn.gaily.orm.pub.JdbcUtils;
import cn.gaily.orm.pub.NamingStrategy;
import cn.gaily.orm.pub.PubUtils;
import cn.gaily.orm.pub.ResourceManager;

/**
 * <p>Title: JavaBeanHelper</P>
 * <p>Description: 生成实体文件工具类</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public class JavaBeanHelper {

	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs;
	
	private static String entityTempletPath = "orm/cn/gaily/orm/templet/Entity.vm";

	private static NamingStrategy name = NamingStrategy.UPPERFIRST;
	
	/**
	 * <p>方法名称：buildEntity</p>
	 * <p>方法描述：构建实体方法</p>
	 * @param tableName
	 * @author xiaoh
	 * @throws IOException 
	 * @since  2014-9-5
	 * <p> history 2014-9-5 xiaoh  创建   <p>
	 */
	public void buildEntity(String tableName){
		List<FieldBean> fieldList = getFields(tableName);
		if(fieldList==null||fieldList.size()<=0){
			throw new RuntimeException("字段实体未构建成功！");
		}
		
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		Template t = ve.getTemplate(entityTempletPath, ResourceManager.VE_CHARACTER);

		VelocityContext vc = new VelocityContext();
		vc.put("realTableName", tableName);
		vc.put("entityName", name.naming(tableName));
		vc.put("fields", fieldList);
		
		File file = new File(System.getProperty("user.dir")+"\\orm\\cn\\gaily\\orm\\vos\\",name.naming(tableName)+"VO.java");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException("IO异常");
			}
		}
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			t.merge(vc, fw);
			fw.flush();fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * <p>方法名称：getFields</p>
	 * <p>方法描述：根据表名获取所有的字段实体</p>
	 * @param tableName
	 * @return
	 * @author xiaoh
	 * @since  2014-9-5
	 * <p> history 2014-9-5 xiaoh  创建   <p>
	 */
	private static List<FieldBean> getFields(String tableName){
		if(PubUtils.isEmpty(tableName)){
			return null;
		}
		List<FieldBean> fieldList = null;
		try {
			if(conn==null||conn.isClosed()){
				conn = JdbcUtils.getConnection(ResourceManager.DB_USERNAME, ResourceManager.DB_PASSWORD, ResourceManager.DB_IP);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		fieldList = new ArrayList<FieldBean>();
		FieldBean field = null;
		try {
			pst = conn.prepareStatement(ResourceManager.queryFiledSql);
			pst.setString(1, tableName.toUpperCase());
			rs = pst.executeQuery();
			while(rs.next()){
				field = new FieldBean();
				field.setColumnName(PubUtils.getString(rs.getString(1)).toLowerCase());
				field.setDataType(PubUtils.getString(rs.getString(2)));
				field.setDataLength(PubUtils.getString(rs.getString(3)));
				field.setNullAble(PubUtils.getString(rs.getString(4)));
				field.setComment(PubUtils.getString(rs.getString(5)));
				fieldList.add(field);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JdbcUtils.release(conn, pst, rs);
		}
		
		return fieldList;
	}
}
