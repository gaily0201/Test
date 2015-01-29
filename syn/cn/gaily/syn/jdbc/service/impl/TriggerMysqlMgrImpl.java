package cn.gaily.syn.jdbc.service.impl;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;
import cn.gaily.syn.jdbc.service.ITriggerManagerService;

public class TriggerMysqlMgrImpl implements ITriggerManagerService {

	@Override
	public boolean generate(ISimpleDataSource datasource, String tableName)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drop(ISimpleDataSource datasource, String tableName)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTepTabExist(ISimpleDataSource datasource, String tableName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableTable(ISimpleDataSource datasource, String tableName,
			int enableType) {
		// TODO Auto-generated method stub
		return false;
	}

}
