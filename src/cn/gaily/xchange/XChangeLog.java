package cn.gaily.xchange;

/**
 * <p>Title: XChangeLog</P>
 * <p>Description: 日志实体,与UAP VO无关</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-3
 */
public class XChangeLog {
	
	/**
	 * 主键
	 */
	public   String PK="pk";
	/**
	 * 详细信息
	 */
	public   String DETAIL="detail";
	/**
	 * 简略信息
	 */
	public   String ERROR="error";
	/**
	 * 登记人
	 */
	public   String LOGGER="logger";
	/**
	 * 登记人
	 */
	public   String LOGTIME="logtime";
	/**
	 * 处理人
	 */
	public   String PROCER="procer";
	/**
	 * 处理时间
	 */
	public   String PROCTIME="proctime";
	/**
	 * 类型 	新增为1,修改未解决为2,修改解决为0
	 */
	public   String TYPE="type";
	/**
	 * 时间戳
	 */
	public   String TS="ts";
	
	
	/**
	 * @return the pk
	 */
	public   String getPk() {
		return PK;
	}
	/**
	 * @param pk the pk to set
	 */
	public   void setPk(String pk) {
		PK = pk;
	}
	/**
	 * @return the detail
	 */
	public   String getDetail() {
		return DETAIL;
	}
	/**
	 * @param detail the detail to set
	 */
	public   void setDetail(String detail) {
		DETAIL = detail;
	}
	/**
	 * @return the error
	 */
	public   String getError() {
		return ERROR;
	}
	/**
	 * @param error the error to set
	 */
	public   void setError(String error) {
		ERROR = error;
	}
	/**
	 * @return the logger
	 */
	public   String getLogger() {
		return LOGGER;
	}
	/**
	 * @param logger the logger to set
	 */
	public   void setLogger(String logger) {
		LOGGER = logger;
	}
	/**
	 * @return the logtime
	 */
	public   String getLogtime() {
		return LOGTIME;
	}
	/**
	 * @param logtime the logtime to set
	 */
	public   void setLogtime(String logtime) {
		LOGTIME = logtime;
	}
	/**
	 * @return the procer
	 */
	public   String getProcer() {
		return PROCER;
	}
	/**
	 * @param procer the procer to set
	 */
	public   void setProcer(String procer) {
		PROCER = procer;
	}
	/**
	 * @return the proctime
	 */
	public   String getProctime() {
		return PROCTIME;
	}
	/**
	 * @param proctime the proctime to set
	 */
	public   void setProctime(String proctime) {
		PROCTIME = proctime;
	}
	/**
	 * @return the type
	 */
	public   String getType() {
		return TYPE;
	}
	/**
	 * @param type the type to set
	 */
	public   void setType(String type) {
		TYPE = type;
	}
	/**
	 * @return the ts
	 */
	public   String getTs() {
		return TS;
	}
	/**
	 * @param ts the ts to set
	 */
	public   void setTs(String ts) {
		TS = ts;
	}
	
	
	

}