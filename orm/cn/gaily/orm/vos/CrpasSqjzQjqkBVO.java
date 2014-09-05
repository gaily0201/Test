package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzQjqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_qjqk_b")
public class CrpasSqjzQjqkBVO {
	/**
	* PK_SQJZ_H 社区矫正主表_主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="char",dataLength=20,nullAble="N",comment="社区矫正主表_主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
	/**
	* PK_SQJZ_QJQK_B 子表主键
	*/
	@Column(columnName="pk_sqjz_qjqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SQJZ_QJQK_B = "pk_sqjz_qjqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_XM 姓名
	*/
	@Column(columnName="v_xm",dataType="varchar",dataLength=50,nullAble="Y",comment="姓名")
	private String V_XM = "v_xm";
	/**
	* C_SSDW 所属单位
	*/
	@Column(columnName="c_ssdw",dataType="varchar",dataLength=50,nullAble="Y",comment="所属单位")
	private String C_SSDW = "c_ssdw";
	/**
	* V_SSDWMC 所属单位名称
	*/
	@Column(columnName="v_ssdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="所属单位名称")
	private String V_SSDWMC = "v_ssdwmc";
	/**
	* D_QJRQ 请假日期
	*/
	@Column(columnName="d_qjrq",dataType="char",dataLength=19,nullAble="Y",comment="请假日期")
	private String D_QJRQ = "d_qjrq";
	/**
	* V_QJMD 请假目的地
	*/
	@Column(columnName="v_qjmd",dataType="varchar",dataLength=50,nullAble="Y",comment="请假目的地")
	private String V_QJMD = "v_qjmd";
	/**
	* C_PZR 批准人
	*/
	@Column(columnName="c_pzr",dataType="varchar",dataLength=20,nullAble="Y",comment="批准人")
	private String C_PZR = "c_pzr";
	/**
	* V_PZRXM 批准人姓名
	*/
	@Column(columnName="v_pzrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="批准人姓名")
	private String V_PZRXM = "v_pzrxm";
	/**
	* T_JQKSSJ 假期起始时间
	*/
	@Column(columnName="t_jqkssj",dataType="char",dataLength=19,nullAble="Y",comment="假期起始时间")
	private String T_JQKSSJ = "t_jqkssj";
	/**
	* T_JQJSSJ 假期终止时间
	*/
	@Column(columnName="t_jqjssj",dataType="char",dataLength=19,nullAble="Y",comment="假期终止时间")
	private String T_JQJSSJ = "t_jqjssj";
	/**
	* B_SFXJ 是否销假
	*/
	@Column(columnName="b_sfxj",dataType="char",dataLength=1,nullAble="Y",comment="是否销假")
	private String B_SFXJ = "b_sfxj";
	/**
	* V_SY 事由
	*/
	@Column(columnName="v_sy",dataType="varchar",dataLength=2000,nullAble="Y",comment="事由")
	private String V_SY = "v_sy";
	/**
	* V_JZBH 矫正对象编号
	*/
	@Column(columnName="v_jzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正对象编号")
	private String V_JZBH = "v_jzbh";
	/**
	* getPk_sqjz_h(void) 
	*/
	public String getPk_sqjz_h(){
		return this.PK_SQJZ_H;
	}
	/**
	*setPk_sqjz_h(java.lang.String)
	*/
	public void setPk_sqjz_h(String pk_sqjz_h){
		this.PK_SQJZ_H=pk_sqjz_h;
	}
	/**
	* getPk_sqjz_qjqk_b(void) 
	*/
	public String getPk_sqjz_qjqk_b(){
		return this.PK_SQJZ_QJQK_B;
	}
	/**
	*setPk_sqjz_qjqk_b(java.lang.String)
	*/
	public void setPk_sqjz_qjqk_b(String pk_sqjz_qjqk_b){
		this.PK_SQJZ_QJQK_B=pk_sqjz_qjqk_b;
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
	* getV_xm(void) 
	*/
	public String getV_xm(){
		return this.V_XM;
	}
	/**
	*setV_xm(java.lang.String)
	*/
	public void setV_xm(String v_xm){
		this.V_XM=v_xm;
	}
	/**
	* getC_ssdw(void) 
	*/
	public String getC_ssdw(){
		return this.C_SSDW;
	}
	/**
	*setC_ssdw(java.lang.String)
	*/
	public void setC_ssdw(String c_ssdw){
		this.C_SSDW=c_ssdw;
	}
	/**
	* getV_ssdwmc(void) 
	*/
	public String getV_ssdwmc(){
		return this.V_SSDWMC;
	}
	/**
	*setV_ssdwmc(java.lang.String)
	*/
	public void setV_ssdwmc(String v_ssdwmc){
		this.V_SSDWMC=v_ssdwmc;
	}
	/**
	* getD_qjrq(void) 
	*/
	public String getD_qjrq(){
		return this.D_QJRQ;
	}
	/**
	*setD_qjrq(java.lang.String)
	*/
	public void setD_qjrq(String d_qjrq){
		this.D_QJRQ=d_qjrq;
	}
	/**
	* getV_qjmd(void) 
	*/
	public String getV_qjmd(){
		return this.V_QJMD;
	}
	/**
	*setV_qjmd(java.lang.String)
	*/
	public void setV_qjmd(String v_qjmd){
		this.V_QJMD=v_qjmd;
	}
	/**
	* getC_pzr(void) 
	*/
	public String getC_pzr(){
		return this.C_PZR;
	}
	/**
	*setC_pzr(java.lang.String)
	*/
	public void setC_pzr(String c_pzr){
		this.C_PZR=c_pzr;
	}
	/**
	* getV_pzrxm(void) 
	*/
	public String getV_pzrxm(){
		return this.V_PZRXM;
	}
	/**
	*setV_pzrxm(java.lang.String)
	*/
	public void setV_pzrxm(String v_pzrxm){
		this.V_PZRXM=v_pzrxm;
	}
	/**
	* getT_jqkssj(void) 
	*/
	public String getT_jqkssj(){
		return this.T_JQKSSJ;
	}
	/**
	*setT_jqkssj(java.lang.String)
	*/
	public void setT_jqkssj(String t_jqkssj){
		this.T_JQKSSJ=t_jqkssj;
	}
	/**
	* getT_jqjssj(void) 
	*/
	public String getT_jqjssj(){
		return this.T_JQJSSJ;
	}
	/**
	*setT_jqjssj(java.lang.String)
	*/
	public void setT_jqjssj(String t_jqjssj){
		this.T_JQJSSJ=t_jqjssj;
	}
	/**
	* getB_sfxj(void) 
	*/
	public String getB_sfxj(){
		return this.B_SFXJ;
	}
	/**
	*setB_sfxj(java.lang.String)
	*/
	public void setB_sfxj(String b_sfxj){
		this.B_SFXJ=b_sfxj;
	}
	/**
	* getV_sy(void) 
	*/
	public String getV_sy(){
		return this.V_SY;
	}
	/**
	*setV_sy(java.lang.String)
	*/
	public void setV_sy(String v_sy){
		this.V_SY=v_sy;
	}
	/**
	* getV_jzbh(void) 
	*/
	public String getV_jzbh(){
		return this.V_JZBH;
	}
	/**
	*setV_jzbh(java.lang.String)
	*/
	public void setV_jzbh(String v_jzbh){
		this.V_JZBH=v_jzbh;
	}


}