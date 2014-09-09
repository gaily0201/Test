package cn.gaily.orm.base;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.gaily.orm.pub.JdbcUtils;
import cn.gaily.orm.pub.PubUtils;
import cn.gaily.orm.pub.ResourceManager;
import cn.gaily.orm.vos.CrpasGajAjxxHVO;
import cn.gaily.orm.vos.OrgOrgsVO;
import cn.gaily.orm.vos.XchangelogVO;

/**
 * <p>Title: TestHelper</P>
 * <p>Description: 测试JavaBeanHelper</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public class TestHelper {

	public static void main(String[] args) {
//		testJavaBeanHelper();
//		testReflectTableHelper();
		testBackupHelper();
	}
	
	
	
	public static void testBackupHelper(){
		File file = new File("c:\\crpas_gaj_ajxx_h\\crpas_gaj_ajxx_h.sql");
		if(file.exists()){
			file.delete();
		}
		BackupHelper.backup(CrpasGajAjxxHVO.class, file);
	}
	
	/*
	 * 测试ReflectTableHelper  //注意数据源, 否则表可能被删
	 */
	public static void testReflectTableHelper(){
		String sql = ReflectTableHelper.reflectSql(XchangelogVO.class);
		ReflectTableHelper.exeCreate(sql);
	}
	
	/*
	 * 测试JavaBeanHepler
	 */
	public static void testJavaBeanHelper(){
		JavaBeanHelper helper = new JavaBeanHelper();
//		List<String> tables = getAllTables();
//		for(String s: tables){
//			helper.buildEntity(s);
//		}
		helper.buildEntity("crpas_gaj_ajxx_h");
	}
	
	
	public static List<String>  getAllTables(){
		Connection conn = JdbcUtils.getConnection(ResourceManager.DB_USERNAME, ResourceManager.DB_PASSWORD, ResourceManager.DB_IP);
		ResultSet rs = null;
		List<String> tables = new ArrayList<String>();
		String sql = "SELECT DISTINCT ID FROM MD_TABLE A WHERE SUBSTR(ID,0,5)='crpas'";
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				tables.add(PubUtils.getString(rs.getString(1)).toLowerCase());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tables;
	}
}
