package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSaryxxRxzpBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_saryxx_rxzp_b")
public class CrpasSaryxxRxzpBVO {
	/**
	* PK_SARYXX_RXZP_B 子表主键
	*/
	@Column(columnName="pk_saryxx_rxzp_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SARYXX_RXZP_B = "pk_saryxx_rxzp_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="Y",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_ZPBH 照片编号
	*/
	@Column(columnName="v_zpbh",dataType="varchar",dataLength=50,nullAble="Y",comment="照片编号")
	private String V_ZPBH = "v_zpbh";
	/**
	* V_RYBH 人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=50,nullAble="Y",comment="人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* I_RXZP 人像照片
	*/
	@Column(columnName="i_rxzp",dataType="image",dataLength=0,nullAble="Y",comment="人像照片")
	private String I_RXZP = "i_rxzp";
	/**
	* C_TXLY 图像来源
	*/
	@Column(columnName="c_txly",dataType="varchar",dataLength=50,nullAble="Y",comment="图像来源")
	private String C_TXLY = "c_txly";
	/**
	* V_TXSM 图像说明
	*/
	@Column(columnName="v_txsm",dataType="varchar",dataLength=100,nullAble="Y",comment="图像说明")
	private String V_TXSM = "v_txsm";
	/**
	* T_WRITETIME 录入时间
	*/
	@Column(columnName="t_writetime",dataType="char",dataLength=19,nullAble="Y",comment="录入时间")
	private String T_WRITETIME = "t_writetime";
	/**
	* C_RXFW 人像范围
	*/
	@Column(columnName="c_rxfw",dataType="varchar",dataLength=20,nullAble="Y",comment="人像范围")
	private String C_RXFW = "c_rxfw";
	/**
	* V_LSBH 临时编号
	*/
	@Column(columnName="v_lsbh",dataType="varchar",dataLength=50,nullAble="Y",comment="临时编号")
	private String V_LSBH = "v_lsbh";
	/**
	* C_DJR 业务登记人id
	*/
	@Column(columnName="c_djr",dataType="varchar",dataLength=20,nullAble="Y",comment="业务登记人id")
	private String C_DJR = "c_djr";
	/**
	* T_DJSJ 业务登记时间
	*/
	@Column(columnName="t_djsj",dataType="char",dataLength=19,nullAble="Y",comment="业务登记时间")
	private String T_DJSJ = "t_djsj";
	/**
	* C_DJDW 业务登记单位id
	*/
	@Column(columnName="c_djdw",dataType="varchar",dataLength=20,nullAble="Y",comment="业务登记单位id")
	private String C_DJDW = "c_djdw";
	/**
	* V_DJDWMC 业务登记单位名称
	*/
	@Column(columnName="v_djdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="业务登记单位名称")
	private String V_DJDWMC = "v_djdwmc";
	/**
	* V_DJRXM 业务登记人姓名
	*/
	@Column(columnName="v_djrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="业务登记人姓名")
	private String V_DJRXM = "v_djrxm";
	/**
	* T_XGSJ 业务修改时间
	*/
	@Column(columnName="t_xgsj",dataType="char",dataLength=19,nullAble="Y",comment="业务修改时间")
	private String T_XGSJ = "t_xgsj";
	/**
	* C_XGR 业务修改人id
	*/
	@Column(columnName="c_xgr",dataType="varchar",dataLength=20,nullAble="Y",comment="业务修改人id")
	private String C_XGR = "c_xgr";
	/**
	* C_XGDW 业务修改单位id
	*/
	@Column(columnName="c_xgdw",dataType="varchar",dataLength=20,nullAble="Y",comment="业务修改单位id")
	private String C_XGDW = "c_xgdw";
	/**
	* V_XGRXM 业务修改人姓名
	*/
	@Column(columnName="v_xgrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="业务修改人姓名")
	private String V_XGRXM = "v_xgrxm";
	/**
	* V_XGDWMC 业务修改单位名称
	*/
	@Column(columnName="v_xgdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="业务修改单位名称")
	private String V_XGDWMC = "v_xgdwmc";
	/**
	* PK_SARYXX_H 涉案人员信息主表_主键
	*/
	@Column(columnName="pk_saryxx_h",dataType="char",dataLength=20,nullAble="N",comment="涉案人员信息主表_主键")
	private String PK_SARYXX_H = "pk_saryxx_h";
	/**
	* getPk_saryxx_rxzp_b(void) 
	*/
	public String getPk_saryxx_rxzp_b(){
		return this.PK_SARYXX_RXZP_B;
	}
	/**
	*setPk_saryxx_rxzp_b(java.lang.String)
	*/
	public void setPk_saryxx_rxzp_b(String pk_saryxx_rxzp_b){
		this.PK_SARYXX_RXZP_B=pk_saryxx_rxzp_b;
	}
	/**
	* getVrowno(void) 
	*/
	public String getVrowno(){
		return this.VROWNO;
	}
	/**
	*setVrowno(java.lang.String)
	*/
	public void setVrowno(String vrowno){
		this.VROWNO=vrowno;
	}
	/**
	* getV_zpbh(void) 
	*/
	public String getV_zpbh(){
		return this.V_ZPBH;
	}
	/**
	*setV_zpbh(java.lang.String)
	*/
	public void setV_zpbh(String v_zpbh){
		this.V_ZPBH=v_zpbh;
	}
	/**
	* getV_rybh(void) 
	*/
	public String getV_rybh(){
		return this.V_RYBH;
	}
	/**
	*setV_rybh(java.lang.String)
	*/
	public void setV_rybh(String v_rybh){
		this.V_RYBH=v_rybh;
	}
	/**
	* getI_rxzp(void) 
	*/
	public String getI_rxzp(){
		return this.I_RXZP;
	}
	/**
	*setI_rxzp(java.lang.String)
	*/
	public void setI_rxzp(String i_rxzp){
		this.I_RXZP=i_rxzp;
	}
	/**
	* getC_txly(void) 
	*/
	public String getC_txly(){
		return this.C_TXLY;
	}
	/**
	*setC_txly(java.lang.String)
	*/
	public void setC_txly(String c_txly){
		this.C_TXLY=c_txly;
	}
	/**
	* getV_txsm(void) 
	*/
	public String getV_txsm(){
		return this.V_TXSM;
	}
	/**
	*setV_txsm(java.lang.String)
	*/
	public void setV_txsm(String v_txsm){
		this.V_TXSM=v_txsm;
	}
	/**
	* getT_writetime(void) 
	*/
	public String getT_writetime(){
		return this.T_WRITETIME;
	}
	/**
	*setT_writetime(java.lang.String)
	*/
	public void setT_writetime(String t_writetime){
		this.T_WRITETIME=t_writetime;
	}
	/**
	* getC_rxfw(void) 
	*/
	public String getC_rxfw(){
		return this.C_RXFW;
	}
	/**
	*setC_rxfw(java.lang.String)
	*/
	public void setC_rxfw(String c_rxfw){
		this.C_RXFW=c_rxfw;
	}
	/**
	* getV_lsbh(void) 
	*/
	public String getV_lsbh(){
		return this.V_LSBH;
	}
	/**
	*setV_lsbh(java.lang.String)
	*/
	public void setV_lsbh(String v_lsbh){
		this.V_LSBH=v_lsbh;
	}
	/**
	* getC_djr(void) 
	*/
	public String getC_djr(){
		return this.C_DJR;
	}
	/**
	*setC_djr(java.lang.String)
	*/
	public void setC_djr(String c_djr){
		this.C_DJR=c_djr;
	}
	/**
	* getT_djsj(void) 
	*/
	public String getT_djsj(){
		return this.T_DJSJ;
	}
	/**
	*setT_djsj(java.lang.String)
	*/
	public void setT_djsj(String t_djsj){
		this.T_DJSJ=t_djsj;
	}
	/**
	* getC_djdw(void) 
	*/
	public String getC_djdw(){
		return this.C_DJDW;
	}
	/**
	*setC_djdw(java.lang.String)
	*/
	public void setC_djdw(String c_djdw){
		this.C_DJDW=c_djdw;
	}
	/**
	* getV_djdwmc(void) 
	*/
	public String getV_djdwmc(){
		return this.V_DJDWMC;
	}
	/**
	*setV_djdwmc(java.lang.String)
	*/
	public void setV_djdwmc(String v_djdwmc){
		this.V_DJDWMC=v_djdwmc;
	}
	/**
	* getV_djrxm(void) 
	*/
	public String getV_djrxm(){
		return this.V_DJRXM;
	}
	/**
	*setV_djrxm(java.lang.String)
	*/
	public void setV_djrxm(String v_djrxm){
		this.V_DJRXM=v_djrxm;
	}
	/**
	* getT_xgsj(void) 
	*/
	public String getT_xgsj(){
		return this.T_XGSJ;
	}
	/**
	*setT_xgsj(java.lang.String)
	*/
	public void setT_xgsj(String t_xgsj){
		this.T_XGSJ=t_xgsj;
	}
	/**
	* getC_xgr(void) 
	*/
	public String getC_xgr(){
		return this.C_XGR;
	}
	/**
	*setC_xgr(java.lang.String)
	*/
	public void setC_xgr(String c_xgr){
		this.C_XGR=c_xgr;
	}
	/**
	* getC_xgdw(void) 
	*/
	public String getC_xgdw(){
		return this.C_XGDW;
	}
	/**
	*setC_xgdw(java.lang.String)
	*/
	public void setC_xgdw(String c_xgdw){
		this.C_XGDW=c_xgdw;
	}
	/**
	* getV_xgrxm(void) 
	*/
	public String getV_xgrxm(){
		return this.V_XGRXM;
	}
	/**
	*setV_xgrxm(java.lang.String)
	*/
	public void setV_xgrxm(String v_xgrxm){
		this.V_XGRXM=v_xgrxm;
	}
	/**
	* getV_xgdwmc(void) 
	*/
	public String getV_xgdwmc(){
		return this.V_XGDWMC;
	}
	/**
	*setV_xgdwmc(java.lang.String)
	*/
	public void setV_xgdwmc(String v_xgdwmc){
		this.V_XGDWMC=v_xgdwmc;
	}
	/**
	* getPk_saryxx_h(void) 
	*/
	public String getPk_saryxx_h(){
		return this.PK_SARYXX_H;
	}
	/**
	*setPk_saryxx_h(java.lang.String)
	*/
	public void setPk_saryxx_h(String pk_saryxx_h){
		this.PK_SARYXX_H=pk_saryxx_h;
	}


}