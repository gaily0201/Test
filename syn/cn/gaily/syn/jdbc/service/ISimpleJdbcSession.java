package cn.gaily.syn.jdbc.service;

/**
 * <p>Title: ISimpleJdbcSession</P>
 * <p>Description: 数据库工具类接口</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public interface ISimpleJdbcSession {

	public String getPkName(ISimpleDataSource datasource, String tableName) throws Exception;
	
	public boolean hasTable(ISimpleDataSource datasource) throws Exception;
	
	public boolean hasColumn(ISimpleDataSource datasource, String tableName) throws Exception;
	
	public int getRecordCount(ISimpleDataSource datasource,String tableName) throws Exception;
	
	public int executeSql(ISimpleDataSource datasource,String sql) throws Exception;
}
