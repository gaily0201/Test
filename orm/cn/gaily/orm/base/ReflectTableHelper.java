package cn.gaily.orm.base;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.javabean.FieldBean;
import cn.gaily.orm.javabean.IBean;
import cn.gaily.orm.pub.JdbcUtils;
import cn.gaily.orm.pub.NamingStrategy;
import cn.gaily.orm.pub.PubUtils;
import cn.gaily.orm.pub.ResourceManager;

/**
 * <p>Title: ReflectTableHelper</P>
 * <p>Description: 通过自动生成的实体建数据库表, 注：只生成实体表, 不注册元数据表; 
 * 				      注意数据源, 否则表可能被删!!!</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-9
 */
public class ReflectTableHelper {

	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	
	private static NamingStrategy name = NamingStrategy.LOWERUPPER;
	
	/**
	 * <p>方法名称：reflectSql</p>
	 * <p>方法描述：构建建表sql</p>
	 * @param bean
	 * @return
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	public static String reflectSql(Class<? extends IBean> bean){
		if(bean==null){
			throw new RuntimeException("传入的实体为空!");
		}
		
		
		String tableName = null;
		Annotation[] tableNameAnnos = bean.getDeclaredAnnotations();
		if(tableNameAnnos!=null &&tableNameAnnos.length>0){
			Table tableNameAnno = (Table)tableNameAnnos[0];
			tableName = tableNameAnno.tableName();
		}
		if(PubUtils.isEmpty(tableName)){
			//传入实体表名注解为空，生成表名
			String beanName = bean.getSimpleName();
			tableName = beanName.substring(0, beanName.length()-2);
			tableName = name.naming(tableName);
		}
		
		
		Field[] fields = bean.getDeclaredFields();
		if(fields==null || fields.length<=0){
			throw new RuntimeException("实体中没有找到字段!");
		}
		FieldBean fieldBean = null;
		List<FieldBean> fieldBeanList = new ArrayList<FieldBean>();
		for(Field field : fields){
			Annotation[] annos = field.getDeclaredAnnotations();
			if(annos.length==1&&annos[0].annotationType()==Column.class){
				fieldBean = new FieldBean();
				Column column = (Column) annos[0];
				fieldBean.setColumnName(column.columnName());
				fieldBean.setDataType(column.dataType());
				fieldBean.setDataLength(String.valueOf(column.dataLength()));
				fieldBean.setComment(column.comment());
				fieldBean.setNullAble(column.nullAble());
				fieldBean.setPrimaryKey("N");
				fieldBeanList.add(fieldBean);
			}
			if(annos.length==2){
				fieldBean = new FieldBean();
				Column column = null;
				for(Annotation anno:annos){
					if(anno.annotationType()==Column.class){
						column = (Column) anno;
						break;
					}
				}
				fieldBean.setColumnName(column.columnName());
				fieldBean.setDataType(column.dataType());
				fieldBean.setDataLength(String.valueOf(column.dataLength()));
				fieldBean.setComment(column.comment());
				fieldBean.setNullAble(column.nullAble());
				fieldBean.setPrimaryKey("Y");				
				fieldBeanList.add(fieldBean);
			}
		}
		
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		Template t = ve.getTemplate(ResourceManager.createTableTempletPath, ResourceManager.VE_CHARACTER);
		VelocityContext  vc = new VelocityContext();
		vc.put("tableName", tableName);
		vc.put("fields", fieldBeanList);
		
		StringWriter sw = new StringWriter();
		t.merge(vc, sw);
		System.out.println(sw.toString());
		System.out.println(getTableName(sw.toString()));
		return sw.toString();
	}
	
	
	/**
	 * <p>方法名称：exeCreate</p>
	 * <p>方法描述：执行建表语句</p>
	 * @param sql
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	public static boolean exeCreate(String sql){
		if(PubUtils.isEmpty(sql)){
			throw new RuntimeException("传入的sql有误！");
		}
		conn = JdbcUtils.getConnection(ResourceManager.DB_USERNAME, ResourceManager.DB_PASSWORD, ResourceManager.DB_IP);
		
		//判断表名是否存在,存在则删除原表
		String tableName = getTableName(sql);
		try {
			conn.setAutoCommit(false);
			pst = conn.prepareStatement(ResourceManager.checkTableExistSql);
			pst.setString(1, tableName);
			rs = pst.executeQuery();
			if(rs.next()&&rs.getInt(1)==1){
				st = conn.createStatement();
				st.executeUpdate("DROP TABLE "+ tableName);
			}
			conn.commit();
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		} finally{
			JdbcUtils.release(null, pst, rs);
		}
		
		//执行建表语句
		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally{
			JdbcUtils.release(conn, st, null);
		}
		return true;
	}
	
	/**
	 * <p>方法名称：getTableName</p>
	 * <p>方法描述：通过建表语句获取表名</p>
	 * @param createSql
	 * @author xiaoh
	 * @since  2014-9-9
	 * <p> history 2014-9-9 xiaoh  创建   <p>
	 */
	public static String getTableName(String createSql){
		int start = createSql.indexOf("TABLE");
		int end = createSql.indexOf("(");
		String tableName =createSql.substring(start+5, end);
		tableName = tableName.trim().toUpperCase();
		if(PubUtils.isEmpty(tableName)){
			throw new RuntimeException("从建表语句中获取表名失败！");
		}
		return tableName;
	}
	
}
