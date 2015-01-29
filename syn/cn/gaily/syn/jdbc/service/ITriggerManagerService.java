package cn.gaily.syn.jdbc.service;

public interface ITriggerManagerService {

	public boolean generate(ISimpleDataSource datasource,String tableName) throws Exception;
	
	public boolean drop(ISimpleDataSource datasource,String tableName) throws Exception;
	
	public boolean isTepTabExist(ISimpleDataSource datasource, String tableName);
	
	public boolean enableTable(ISimpleDataSource datasource,String tableName, int enableType);
}
