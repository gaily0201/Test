package cn.gaily.syn.process.entry;

import java.util.HashMap;
import java.util.Map;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;

/**
 * <p>Title: DataSourcePool</P>
 * <p>Description: 数据源管理池</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class DataSourcePool {

	private static Map<String, ISimpleDataSource[]> dspool = new HashMap<String, ISimpleDataSource[]>();
	
	//[0]->src; [1]->desc
	public static ISimpleDataSource[] getDataSources(String configPk){
		ISimpleDataSource[] dsArr = dspool.get(configPk);
		if(dsArr!=null&&dsArr.length>0){
			return dsArr;
		}
		return initDatasource(configPk);
	}


	/**
	 * <p>方法名称：initDatasource</p>
	 * <p>方法描述：初始化数据连接池</p>
	 * @param configPk
	 * @return
	 * @author xiaoh
	 * @since  2015-1-29
	 * <p> history 2015-1-29 xiaoh  创建   <p>
	 */
	private static ISimpleDataSource[] initDatasource(String configPk) {
		
		return null;
	}
	
}
