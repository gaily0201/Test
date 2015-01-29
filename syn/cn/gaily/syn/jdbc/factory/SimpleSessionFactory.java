package cn.gaily.syn.jdbc.factory;

import cn.gaily.syn.jdbc.service.ISimpleJdbcSession;
import cn.gaily.syn.jdbc.service.impl.SimpleMssqlSession;
import cn.gaily.syn.jdbc.service.impl.SimpleMysqlSession;
import cn.gaily.syn.jdbc.service.impl.SimpleOracleSession;
import cn.gaily.syn.pub.PubConstant;

public class SimpleSessionFactory {

	private SimpleSessionFactory(){}
	
	private static SimpleSessionFactory factory;
	
	public static SimpleSessionFactory getInstance(){
		if(factory==null){
			factory = new SimpleSessionFactory();
		}
		return factory;
	}
	
	public static ISimpleJdbcSession getSession(int dbtype){
		switch(dbtype){
		case PubConstant.DBType.ORACLE:
			return new SimpleOracleSession();
		case PubConstant.DBType.MYSQL:
			return new SimpleMysqlSession();
		case PubConstant.DBType.MSSQL:
			return new SimpleMssqlSession();
		default:
			return null;
	}
	}
	
}
