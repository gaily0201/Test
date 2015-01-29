package cn.gaily.syn.jdbc.service.impl;

import java.sql.Connection;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;

public class SimpleOracleDataSource implements ISimpleDataSource {

	@Override
	public int init() throws Exception {
		return 0;
	}

	@Override
	public Connection getConnection() throws Exception {
		return null;
	}

	@Override
	public void realease(Connection conn) throws Exception {

	}

	@Override
	public void realRealse() throws Exception {

	}

}
