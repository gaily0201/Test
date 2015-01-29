package cn.gaily.syn.process.entry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.gaily.syn.pub.PubConstant;
import cn.gaily.syn.pub.entity.AggConfigVO;

/**
 * <p>Title: ETLExchangeTask</P>
 * <p>Description: 数据同步执行入口</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class ETLExchangeTask {

	public void executeTask() throws Exception{
		AggConfigVO[] configs = getConfigs();
		if(configs==null||configs.length<=0){
			return;
		}
		ExecutorService pool = Executors.newFixedThreadPool(PubConstant.THREAD_POOL_SIZE);
		for(int i=0;i<configs.length;i++){
			pool.execute(new ETLServiceDistribute(configs[i]));
		}
		while(!pool.isTerminated()){
			Thread.sleep(2000);
		}
		pool.shutdown();
	}
	
	private AggConfigVO[] getConfigs() {
		return null;
	}
}
