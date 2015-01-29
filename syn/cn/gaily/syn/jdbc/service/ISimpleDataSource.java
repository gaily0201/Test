package cn.gaily.syn.jdbc.service;

import java.sql.Connection;

/**
 * <p>Title: ISimpleDataSource</P>
 * <p>Description: 数据源连接池接口</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public interface ISimpleDataSource {

	public int init() throws Exception;
	
	public Connection getConnection() throws Exception;

	public void realease(Connection conn) throws Exception;
	
	public void realRealse() throws Exception;
}
