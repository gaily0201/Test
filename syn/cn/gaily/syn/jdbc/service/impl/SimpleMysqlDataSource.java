package cn.gaily.syn.jdbc.service.impl;

import java.sql.Connection;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;

public class SimpleMysqlDataSource implements ISimpleDataSource {

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
