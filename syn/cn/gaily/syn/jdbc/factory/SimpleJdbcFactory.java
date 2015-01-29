package cn.gaily.syn.jdbc.factory;

import cn.gaily.syn.jdbc.service.ISimpleJdbc;
import cn.gaily.syn.jdbc.service.impl.SimpleMssqlJdbc;
import cn.gaily.syn.jdbc.service.impl.SimpleMysqlJdbc;
import cn.gaily.syn.jdbc.service.impl.SimpleOracleJdbc;
import cn.gaily.syn.pub.PubConstant;

/**
 * <p>Title: SimpleJdbcFactory</P>
 * <p>Description:  jdbc工具类工厂</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class SimpleJdbcFactory {

	private SimpleJdbcFactory(){};
	
	private static SimpleJdbcFactory factory;
	
	public static SimpleJdbcFactory getInstance(){
		if(factory==null){
			factory = new SimpleJdbcFactory();
		}
		return factory;
	}
	
	public static ISimpleJdbc getJdbcInstance(int dbtype){
		switch(dbtype){
			case PubConstant.DBType.ORACLE:
				return new SimpleOracleJdbc();
			case PubConstant.DBType.MYSQL:
				return new SimpleMysqlJdbc();
			case PubConstant.DBType.MSSQL:
				return new SimpleMssqlJdbc();
			default:
				return null;
		}
	}
	
}
