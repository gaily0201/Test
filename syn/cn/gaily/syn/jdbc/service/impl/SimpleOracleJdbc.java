package cn.gaily.syn.jdbc.service.impl;

import java.sql.Connection;

import cn.gaily.syn.jdbc.service.ISimpleJdbc;

public class SimpleOracleJdbc implements ISimpleJdbc {

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
	public boolean canConnection() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
