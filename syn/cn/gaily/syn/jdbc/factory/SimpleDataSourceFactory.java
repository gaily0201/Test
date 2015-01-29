package cn.gaily.syn.jdbc.factory;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;
import cn.gaily.syn.jdbc.service.impl.SimpleMssqlDataSouce;
import cn.gaily.syn.jdbc.service.impl.SimpleMysqlDataSource;
import cn.gaily.syn.jdbc.service.impl.SimpleOracleDataSource;
import cn.gaily.syn.pub.PubConstant;

public class SimpleDataSourceFactory {

	private SimpleDataSourceFactory(){};
	
	private static  SimpleDataSourceFactory factory;
	
	public static SimpleDataSourceFactory getInstance(){
		if(factory==null){
			factory = new SimpleDataSourceFactory();
		}
		return factory;
	}
	
	public static ISimpleDataSource getDataSource(int dbtype){
		switch(dbtype){
			case PubConstant.DBType.ORACLE:
				return new SimpleOracleDataSource();
			case PubConstant.DBType.MYSQL:
				return new SimpleMysqlDataSource();
			case PubConstant.DBType.MSSQL:
				return new SimpleMssqlDataSouce();
			default:
				return null;
		}
	}
}
