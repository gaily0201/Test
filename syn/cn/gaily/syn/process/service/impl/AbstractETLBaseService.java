package cn.gaily.syn.process.service.impl;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;
import cn.gaily.syn.process.service.IETLService;

public abstract class AbstractETLBaseService implements IETLService {

	@Override
	public String[] executeSingle(ISimpleDataSource datasource, String tableName) throws Exception {
		return null;
	}

	@Override
	public String[] executeBatch(ISimpleDataSource datasource, String tableName) throws Exception {
		return null;
	}

}
