package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGsPjqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gs_pjqk_b")
public class CrpasGsPjqkBVO {
	/**
	* PK_GS_PJQK_B 子表主键
	*/
	@Column(columnName="pk_gs_pjqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GS_PJQK_B = "pk_gs_pjqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_BGR 被告人id
	*/
	@Column(columnName="c_bgr",dataType="char",dataLength=20,nullAble="Y",comment="被告人id")
	private String C_BGR = "c_bgr";
	/**
	* V_BGRXM 被告人姓名
	*/
	@Column(columnName="v_bgrxm",dataType="varchar",dataLength=200,nullAble="Y",comment="被告人姓名")
	private String V_BGRXM = "v_bgrxm";
	/**
	* V_JCHBGQZCS 解除或变更强制措施
	*/
	@Column(columnName="v_jchbgqzcs",dataType="varchar",dataLength=20,nullAble="Y",comment="解除或变更强制措施")
	private String V_JCHBGQZCS = "v_jchbgqzcs";
	/**
	* V_BKZKWCL 被扣赃款物处理
	*/
	@Column(columnName="v_bkzkwcl",dataType="varchar",dataLength=20,nullAble="Y",comment="被扣赃款物处理")
	private String V_BKZKWCL = "v_bkzkwcl";
	/**
	* N_FHBHRCWZJ 发还被害人财物折价
	*/
	@Column(columnName="n_fhbhrcwzj",dataType="decimal",dataLength=20,nullAble="Y",comment="发还被害人财物折价")
	private String N_FHBHRCWZJ = "n_fhbhrcwzj";
	/**
	* N_MSZKZWZJ 没收赃款赃物折价
	*/
	@Column(columnName="n_mszkzwzj",dataType="decimal",dataLength=20,nullAble="Y",comment="没收赃款赃物折价")
	private String N_MSZKZWZJ = "n_mszkzwzj";
	/**
	* V_QTCWCL 其它财物处理
	*/
	@Column(columnName="v_qtcwcl",dataType="varchar",dataLength=20,nullAble="Y",comment="其它财物处理")
	private String V_QTCWCL = "v_qtcwcl";
	/**
	* D_XFJFZXRQ 刑罚交付执行日期
	*/
	@Column(columnName="d_xfjfzxrq",dataType="char",dataLength=19,nullAble="Y",comment="刑罚交付执行日期")
	private String D_XFJFZXRQ = "d_xfjfzxrq";
	/**
	* D_CCXJSZXRQ 财产刑即时执行日期
	*/
	@Column(columnName="d_ccxjszxrq",dataType="char",dataLength=19,nullAble="Y",comment="财产刑即时执行日期")
	private String D_CCXJSZXRQ = "d_ccxjszxrq";
	/**
	* N_CCXJSZXJE 财产刑即时执行金额
	*/
	@Column(columnName="n_ccxjszxje",dataType="decimal",dataLength=20,nullAble="Y",comment="财产刑即时执行金额")
	private String N_CCXJSZXJE = "n_ccxjszxje";
	/**
	* B_CCXSFZXWB 财产刑是否执行完毕
	*/
	@Column(columnName="b_ccxsfzxwb",dataType="char",dataLength=1,nullAble="Y",comment="财产刑是否执行完毕")
	private String B_CCXSFZXWB = "b_ccxsfzxwb";
	/**
	* V_GPYY 改判原因
	*/
	@Column(columnName="v_gpyy",dataType="varchar",dataLength=20,nullAble="Y",comment="改判原因")
	private String V_GPYY = "v_gpyy";
	/**
	* C_GAJ_XYR 嫌疑人id
	*/
	@Column(columnName="c_gaj_xyr",dataType="char",dataLength=20,nullAble="Y",comment="嫌疑人id")
	private String C_GAJ_XYR = "c_gaj_xyr";
	/**
	* V_BGRBH 被告人编号
	*/
	@Column(columnName="v_bgrbh",dataType="varchar",dataLength=50,nullAble="Y",comment="被告人编号")
	private String V_BGRBH = "v_bgrbh";
	/**
	* PK_GS_H 公诉信息主表_主键
	*/
	@Column(columnName="pk_gs_h",dataType="char",dataLength=20,nullAble="N",comment="公诉信息主表_主键")
	private String PK_GS_H = "pk_gs_h";
	/**
	* getPk_gs_pjqk_b(void) 
	*/
	public String getPk_gs_pjqk_b(){
		return this.PK_GS_PJQK_B;
	}
	/**
	*setPk_gs_pjqk_b(java.lang.String)
	*/
	public void setPk_gs_pjqk_b(String pk_gs_pjqk_b){
		this.PK_GS_PJQK_B=pk_gs_pjqk_b;
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
	* getC_bgr(void) 
	*/
	public String getC_bgr(){
		return this.C_BGR;
	}
	/**
	*setC_bgr(java.lang.String)
	*/
	public void setC_bgr(String c_bgr){
		this.C_BGR=c_bgr;
	}
	/**
	* getV_bgrxm(void) 
	*/
	public String getV_bgrxm(){
		return this.V_BGRXM;
	}
	/**
	*setV_bgrxm(java.lang.String)
	*/
	public void setV_bgrxm(String v_bgrxm){
		this.V_BGRXM=v_bgrxm;
	}
	/**
	* getV_jchbgqzcs(void) 
	*/
	public String getV_jchbgqzcs(){
		return this.V_JCHBGQZCS;
	}
	/**
	*setV_jchbgqzcs(java.lang.String)
	*/
	public void setV_jchbgqzcs(String v_jchbgqzcs){
		this.V_JCHBGQZCS=v_jchbgqzcs;
	}
	/**
	* getV_bkzkwcl(void) 
	*/
	public String getV_bkzkwcl(){
		return this.V_BKZKWCL;
	}
	/**
	*setV_bkzkwcl(java.lang.String)
	*/
	public void setV_bkzkwcl(String v_bkzkwcl){
		this.V_BKZKWCL=v_bkzkwcl;
	}
	/**
	* getN_fhbhrcwzj(void) 
	*/
	public String getN_fhbhrcwzj(){
		return this.N_FHBHRCWZJ;
	}
	/**
	*setN_fhbhrcwzj(java.lang.String)
	*/
	public void setN_fhbhrcwzj(String n_fhbhrcwzj){
		this.N_FHBHRCWZJ=n_fhbhrcwzj;
	}
	/**
	* getN_mszkzwzj(void) 
	*/
	public String getN_mszkzwzj(){
		return this.N_MSZKZWZJ;
	}
	/**
	*setN_mszkzwzj(java.lang.String)
	*/
	public void setN_mszkzwzj(String n_mszkzwzj){
		this.N_MSZKZWZJ=n_mszkzwzj;
	}
	/**
	* getV_qtcwcl(void) 
	*/
	public String getV_qtcwcl(){
		return this.V_QTCWCL;
	}
	/**
	*setV_qtcwcl(java.lang.String)
	*/
	public void setV_qtcwcl(String v_qtcwcl){
		this.V_QTCWCL=v_qtcwcl;
	}
	/**
	* getD_xfjfzxrq(void) 
	*/
	public String getD_xfjfzxrq(){
		return this.D_XFJFZXRQ;
	}
	/**
	*setD_xfjfzxrq(java.lang.String)
	*/
	public void setD_xfjfzxrq(String d_xfjfzxrq){
		this.D_XFJFZXRQ=d_xfjfzxrq;
	}
	/**
	* getD_ccxjszxrq(void) 
	*/
	public String getD_ccxjszxrq(){
		return this.D_CCXJSZXRQ;
	}
	/**
	*setD_ccxjszxrq(java.lang.String)
	*/
	public void setD_ccxjszxrq(String d_ccxjszxrq){
		this.D_CCXJSZXRQ=d_ccxjszxrq;
	}
	/**
	* getN_ccxjszxje(void) 
	*/
	public String getN_ccxjszxje(){
		return this.N_CCXJSZXJE;
	}
	/**
	*setN_ccxjszxje(java.lang.String)
	*/
	public void setN_ccxjszxje(String n_ccxjszxje){
		this.N_CCXJSZXJE=n_ccxjszxje;
	}
	/**
	* getB_ccxsfzxwb(void) 
	*/
	public String getB_ccxsfzxwb(){
		return this.B_CCXSFZXWB;
	}
	/**
	*setB_ccxsfzxwb(java.lang.String)
	*/
	public void setB_ccxsfzxwb(String b_ccxsfzxwb){
		this.B_CCXSFZXWB=b_ccxsfzxwb;
	}
	/**
	* getV_gpyy(void) 
	*/
	public String getV_gpyy(){
		return this.V_GPYY;
	}
	/**
	*setV_gpyy(java.lang.String)
	*/
	public void setV_gpyy(String v_gpyy){
		this.V_GPYY=v_gpyy;
	}
	/**
	* getC_gaj_xyr(void) 
	*/
	public String getC_gaj_xyr(){
		return this.C_GAJ_XYR;
	}
	/**
	*setC_gaj_xyr(java.lang.String)
	*/
	public void setC_gaj_xyr(String c_gaj_xyr){
		this.C_GAJ_XYR=c_gaj_xyr;
	}
	/**
	* getV_bgrbh(void) 
	*/
	public String getV_bgrbh(){
		return this.V_BGRBH;
	}
	/**
	*setV_bgrbh(java.lang.String)
	*/
	public void setV_bgrbh(String v_bgrbh){
		this.V_BGRBH=v_bgrbh;
	}
	/**
	* getPk_gs_h(void) 
	*/
	public String getPk_gs_h(){
		return this.PK_GS_H;
	}
	/**
	*setPk_gs_h(java.lang.String)
	*/
	public void setPk_gs_h(String pk_gs_h){
		this.PK_GS_H=pk_gs_h;
	}


}