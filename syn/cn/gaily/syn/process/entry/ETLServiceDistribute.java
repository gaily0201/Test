package cn.gaily.syn.process.entry;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

import cn.gaily.syn.jdbc.service.ISimpleDataSource;
import cn.gaily.syn.pub.BaseUtil;
import cn.gaily.syn.pub.PubConstant;
import cn.gaily.syn.pub.entity.AggConfigVO;

/**
 * <p>Title: ExchangeExecutor</P>
 * <p>Description: 同步数据执行器</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class ETLServiceDistribute implements Runnable {
	
	private AggConfigVO config = null; 
	
	public ETLServiceDistribute(AggConfigVO config){
		this.config = config;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		boolean isValidConfig = BaseUtil.isValidConfig(config);
		if(!isValidConfig){
			throw new RuntimeException("invalid config, "+config.toString());
		}
		//开始执行任务, 分不同方式：触发器，非触发器；不同类型：单向，双向
		int 	synType 	= config.getParent().getSYNTYPE();
		int 	srcDbtype 	= config.getParent().getSRCDBTYPE();
		int 	desDbtype   = config.getParent().getDESCDBTYPE();
		
		ISimpleDataSource[] datasources  = DataSourcePool.getDataSources(config.getParent().getPK());
		ISimpleDataSource srcds = datasources[0];
		ISimpleDataSource desds = datasources[1];
		
		distribute(config, srcds, desds);
	}

	
	
	
	private void distribute(AggConfigVO config, ISimpleDataSource srcds, ISimpleDataSource desds) {
		int synType = config.getParent().getSYNTYPE();
		ArrayBlockingQueue<Map<String,Object>> valueList = new ArrayBlockingQueue<Map<String,Object>>(PubConstant.BATCH_SIZE,true);
		boolean canBatch = false;
		if(synType==PubConstant.SynType.SRC_DESC){
			String[] tabNames = config.getTabNames();
			for(String tabName:tabNames){
//				valueList = queryTempData(srcds, PubConstant.TEMP_PREFIX+tabName);
//				canBatch= isCanBatch(valueList);
				
			}
		}else if(synType==PubConstant.SynType.DESC_SRC){

		}else if(synType==PubConstant.SynType.BOTH_SYN){
			
		}else{
			return;
		}
	}
	
	
	
	
}
