package cn.gaily.syn.jdbc.service.impl;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;
import cn.gaily.syn.jdbc.service.ISimpleJdbcSession;

public class SimpleMssqlSession implements ISimpleJdbcSession {

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

}
