package cn.gaily.syn.process.service;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;

/**
 * <p>Title: IETLService</P>
 * <p>Description: 数据同步服务接口</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public interface IETLService {

	/**
	 * <p>方法名称：executeSingle</p>
	 * <p>方法描述：执行单条语句</p>
	 * @param datasource
	 * @param tableName
	 * @return
	 * @throws Exception
	 * @author xiaoh
	 * @since  2015-1-29
	 * <p> history 2015-1-29 xiaoh  创建   <p>
	 */
	public String[] executeSingle(ISimpleDataSource datasource, String tableName) throws Exception;
	
	/**
	 * <p>方法名称：executeBatch</p>
	 * <p>方法描述：批量执行</p>
	 * @param datasource
	 * @param tableName
	 * @return
	 * @throws Exception
	 * @author xiaoh
	 * @since  2015-1-29
	 * <p> history 2015-1-29 xiaoh  创建   <p>
	 */
	public String[] executeBatch(ISimpleDataSource datasource, String tableName) throws Exception;
}
