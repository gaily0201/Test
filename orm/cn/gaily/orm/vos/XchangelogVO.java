package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;
import cn.gaily.orm.javabean.IBean;

/**
 * <p>Title: XchangelogVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="xchangelog")
public class XchangelogVO implements IBean{
	/**
	* PK 
	*/
	@PrimaryKey
	@Column(columnName="pk",dataType="CHAR",dataLength=20,nullAble="N",comment="")
	private String PK = "pk";
	/**
	* TYPE 
	*/
	@Column(columnName="type",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String TYPE = "type";
	/**
	* ERROR 
	*/
	@Column(columnName="error",dataType="VARCHAR2",dataLength=200,nullAble="Y",comment="")
	private String ERROR = "error";
	/**
	* DETAIL 
	*/
	@Column(columnName="detail",dataType="VARCHAR2",dataLength=2000,nullAble="Y",comment="")
	private String DETAIL = "detail";
	/**
	* LOGGER 
	*/
	@Column(columnName="logger",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String LOGGER = "logger";
	/**
	* LOGTIME 
	*/
	@Column(columnName="logtime",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String LOGTIME = "logtime";
	/**
	* PROCER 
	*/
	@Column(columnName="procer",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String PROCER = "procer";
	/**
	* PROCTIME 
	*/
	@Column(columnName="proctime",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String PROCTIME = "proctime";
	/**
	* TS 
	*/
	@Column(columnName="ts",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String TS = "ts";
	/**
	* DR 
	*/
	@Column(columnName="dr",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String DR = "dr";
	/**
	* getPk(void) 
	*/
	public String getPk(){
		return this.PK;
	}
	/**
	*setPk(java.lang.String)
	*/
	public void setPk(String pk){
		this.PK=pk;
	}
	/**
	* getType(void) 
	*/
	public String getType(){
		return this.TYPE;
	}
	/**
	*setType(java.lang.String)
	*/
	public void setType(String type){
		this.TYPE=type;
	}
	/**
	* getError(void) 
	*/
	public String getError(){
		return this.ERROR;
	}
	/**
	*setError(java.lang.String)
	*/
	public void setError(String error){
		this.ERROR=error;
	}
	/**
	* getDetail(void) 
	*/
	public String getDetail(){
		return this.DETAIL;
	}
	/**
	*setDetail(java.lang.String)
	*/
	public void setDetail(String detail){
		this.DETAIL=detail;
	}
	/**
	* getLogger(void) 
	*/
	public String getLogger(){
		return this.LOGGER;
	}
	/**
	*setLogger(java.lang.String)
	*/
	public void setLogger(String logger){
		this.LOGGER=logger;
	}
	/**
	* getLogtime(void) 
	*/
	public String getLogtime(){
		return this.LOGTIME;
	}
	/**
	*setLogtime(java.lang.String)
	*/
	public void setLogtime(String logtime){
		this.LOGTIME=logtime;
	}
	/**
	* getProcer(void) 
	*/
	public String getProcer(){
		return this.PROCER;
	}
	/**
	*setProcer(java.lang.String)
	*/
	public void setProcer(String procer){
		this.PROCER=procer;
	}
	/**
	* getProctime(void) 
	*/
	public String getProctime(){
		return this.PROCTIME;
	}
	/**
	*setProctime(java.lang.String)
	*/
	public void setProctime(String proctime){
		this.PROCTIME=proctime;
	}
	/**
	* getTs(void) 
	*/
	public String getTs(){
		return this.TS;
	}
	/**
	*setTs(java.lang.String)
	*/
	public void setTs(String ts){
		this.TS=ts;
	}
	/**
	* getDr(void) 
	*/
	public String getDr(){
		return this.DR;
	}
	/**
	*setDr(java.lang.String)
	*/
	public void setDr(String dr){
		this.DR=dr;
	}


}