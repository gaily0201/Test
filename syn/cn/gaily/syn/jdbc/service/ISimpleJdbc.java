package cn.gaily.syn.jdbc.service;

import java.sql.Connection;

/**
 * <p>Title: ISimpleJdbc</P>
 * <p>Description: 统一jdbc接口</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public interface ISimpleJdbc {

	public Connection getConnection() throws Exception;
	
	public void realease(Connection conn) throws Exception;
	
	public boolean canConnection() throws Exception;
}
