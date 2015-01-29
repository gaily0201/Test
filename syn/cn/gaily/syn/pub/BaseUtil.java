package cn.gaily.syn.pub;

import cn.gaily.syn.pub.entity.AggConfigVO;
import cn.gaily.syn.pub.entity.DBConfigVO;
import cn.gaily.syn.pub.entity.TabConfigVO;

/**
 * <p>Title: BaseUtil</P>
 * <p>Description: 基础工具类</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class BaseUtil {

	/**
	 * <p>方法名称：isEmpty</p>
	 * <p>方法描述：字符串是否为空</p>
	 * @author xiaoh
	 * @since  2014-9-14
	 * <p> history 2014-9-14 xiaoh  创建   <p>
	*/
	public static final boolean isEmpty(String str) {
	 return str == null || str.trim().length() == 0;
	}
	/**
	 * <p>方法名称：isNotEmpty</p>
	 * <p>方法描述：字符串是否不为空</p>
	 * @author xiaoh
	 * @since  2014-9-14
	 * <p> history 2014-9-14 xiaoh  创建   <p>
	 */
	public static final boolean isNotEmpty(String str) {
	 return !isEmpty(str);
	}
	
	
	@SuppressWarnings("static-access")
	public static final boolean isValidConfig(AggConfigVO config){
		if(config==null){
			return false;
		}
		if(config.getParent()==null|| (config.getChildrens()==null||config.getChildrens().length<=0)){
			return false;
		}
		DBConfigVO parent = config.getParent();
		TabConfigVO[] chidrens = config.getChildrens();
		
		if(isEmpty(parent.getSRCDBNAME())||isEmpty(parent.getSRCIP())||
				isEmpty(parent.getSRCPASSWORD())||isEmpty(parent.getSRCPORT())||isEmpty(parent.getSRCUSERNAME())){
			return false;
		}
		if(isEmpty(parent.getDESCDBNAME())||isEmpty(parent.getDESCIP())||
				isEmpty(parent.getDESCPASSWORD())||isEmpty(parent.getDESCPORT())||isEmpty(parent.getDESCUSERNAME())){
			return false;
		}
		for(TabConfigVO c: chidrens){
			if(isEmpty(c.getTabName())){
				return false;
			}
		}
		return true;
	}
	
}
