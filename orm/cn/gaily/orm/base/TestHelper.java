package cn.gaily.orm.base;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.gaily.orm.pub.JdbcUtils;
import cn.gaily.orm.pub.PubUtils;
import cn.gaily.orm.pub.ResourceManager;

/**
 * <p>Title: TestHelper</P>
 * <p>Description: 测试JavaBeanHelper</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public class TestHelper {

	public static void main(String[] args) {
		JavaBeanHelper helper = new JavaBeanHelper();
		List<String> tables = getAllTables();
		for(String s: tables){
			helper.buildEntity(s);
		}
//		helper.buildEntity("crpas_gaj_ajxx_h");
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
