package cn.gaily.syn.jdbc.service.impl;

import java.sql.Connection;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;
import cn.gaily.syn.jdbc.service.ISimpleJdbcSession;

public class SimpleMysqlSession implements ISimpleDataSource,
		ISimpleJdbcSession {

	@Override
	public String getPkName(ISimpleDataSource datasource, String tableName)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasTable(ISimpleDataSource datasource) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasColumn(ISimpleDataSource datasource, String tableName)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRecordCount(ISimpleDataSource datasource, String tableName)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int executeSql(ISimpleDataSource datasource, String sql)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int init() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void realease(Connection conn) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void realRealse() throws Exception {
		// TODO Auto-generated method stub

	}

}
