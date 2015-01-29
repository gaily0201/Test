package cn.gaily.syn.jdbc.service.impl;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;
import cn.gaily.syn.jdbc.service.ITriggerManagerService;

public class TriggerOracleMgrImpl implements ITriggerManagerService {

	@Override
	public boolean generate(ISimpleDataSource datasource, String tableName) throws Exception {
		return false;
	}

	@Override
	public boolean drop(ISimpleDataSource datasource, String tableName) throws Exception {
		return false;
	}

	@Override
	public boolean isTepTabExist(ISimpleDataSource datasource, String tableName) {
		return false;
	}

	@Override
	public boolean enableTable(ISimpleDataSource datasource, String tableName, int enableType) {
		return false;
	}

}
