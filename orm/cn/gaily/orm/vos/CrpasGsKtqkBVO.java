package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGsKtqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gs_ktqk_b")
public class CrpasGsKtqkBVO {
	/**
	* PK_GS_KTQK_B 子表主键
	*/
	@Column(columnName="pk_gs_ktqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GS_KTQK_B = "pk_gs_ktqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_FYYT 法庭用途
	*/
	@Column(columnName="c_fyyt",dataType="varchar",dataLength=20,nullAble="Y",comment="法庭用途")
	private String C_FYYT = "c_fyyt";
	/**
	* N_TC 庭次
	*/
	@Column(columnName="n_tc",dataType="int",dataLength=0,nullAble="Y",comment="庭次")
	private String N_TC = "n_tc";
	/**
	* T_KSSJ 开始时间
	*/
	@Column(columnName="t_kssj",dataType="char",dataLength=19,nullAble="Y",comment="开始时间")
	private String T_KSSJ = "t_kssj";
	/**
	* T_JSSJ 结束时间
	*/
	@Column(columnName="t_jssj",dataType="char",dataLength=19,nullAble="Y",comment="结束时间")
	private String T_JSSJ = "t_jssj";
	/**
	* V_KTDD 开庭地点
	*/
	@Column(columnName="v_ktdd",dataType="varchar",dataLength=200,nullAble="Y",comment="开庭地点")
	private String V_KTDD = "v_ktdd";
	/**
	* B_SFGGKT 是否公开开庭
	*/
	@Column(columnName="b_sfggkt",dataType="char",dataLength=1,nullAble="Y",comment="是否公开开庭")
	private String B_SFGGKT = "b_sfggkt";
	/**
	* V_DTDSR 到庭当事人
	*/
	@Column(columnName="v_dtdsr",dataType="varchar",dataLength=200,nullAble="Y",comment="到庭当事人")
	private String V_DTDSR = "v_dtdsr";
	/**
	* V_JBDTDSR 拒不到庭当事人
	*/
	@Column(columnName="v_jbdtdsr",dataType="varchar",dataLength=200,nullAble="Y",comment="拒不到庭当事人")
	private String V_JBDTDSR = "v_jbdtdsr";
	/**
	* V_WZDLYZTTTDSR 无正当理由中途退庭当事人
	*/
	@Column(columnName="v_wzdlyztttdsr",dataType="varchar",dataLength=200,nullAble="Y",comment="无正当理由中途退庭当事人")
	private String V_WZDLYZTTTDSR = "v_wzdlyztttdsr";
	/**
	* V_DTSSDLR 到庭诉讼代理人
	*/
	@Column(columnName="v_dtssdlr",dataType="varchar",dataLength=200,nullAble="Y",comment="到庭诉讼代理人")
	private String V_DTSSDLR = "v_dtssdlr";
	/**
	* V_CTZZDZR 出庭作证的证人
	*/
	@Column(columnName="v_ctzzdzr",dataType="varchar",dataLength=200,nullAble="Y",comment="出庭作证的证人")
	private String V_CTZZDZR = "v_ctzzdzr";
	/**
	* B_BHRSFZWZBH 辩护人是否做无罪辩护
	*/
	@Column(columnName="b_bhrsfzwzbh",dataType="char",dataLength=1,nullAble="Y",comment="辩护人是否做无罪辩护")
	private String B_BHRSFZWZBH = "b_bhrsfzwzbh";
	/**
	* V_JJJXBHHDL 拒绝继续辩护或代理
	*/
	@Column(columnName="v_jjjxbhhdl",dataType="char",dataLength=1,nullAble="Y",comment="拒绝继续辩护或代理")
	private String V_JJJXBHHDL = "v_jjjxbhhdl";
	/**
	* V_DWXC 对外宣传
	*/
	@Column(columnName="v_dwxc",dataType="varchar",dataLength=20,nullAble="Y",comment="对外宣传")
	private String V_DWXC = "v_dwxc";
	/**
	* N_PTRS 旁听人数
	*/
	@Column(columnName="n_ptrs",dataType="int",dataLength=0,nullAble="Y",comment="旁听人数")
	private String N_PTRS = "n_ptrs";
	/**
	* N_RDDBPTRS 人大代笔旁听人数
	*/
	@Column(columnName="n_rddbptrs",dataType="int",dataLength=0,nullAble="Y",comment="人大代笔旁听人数")
	private String N_RDDBPTRS = "n_rddbptrs";
	/**
	* N_ZXWYPTRS 政协委员旁听人数
	*/
	@Column(columnName="n_zxwyptrs",dataType="int",dataLength=0,nullAble="Y",comment="政协委员旁听人数")
	private String N_ZXWYPTRS = "n_zxwyptrs";
	/**
	* B_SWHWYSFDTTA 审委会委员是否到庭听案
	*/
	@Column(columnName="b_swhwysfdtta",dataType="char",dataLength=1,nullAble="Y",comment="审委会委员是否到庭听案")
	private String B_SWHWYSFDTTA = "b_swhwysfdtta";
	/**
	* V_XPQK 宣判情况
	*/
	@Column(columnName="v_xpqk",dataType="varchar",dataLength=20,nullAble="Y",comment="宣判情况")
	private String V_XPQK = "v_xpqk";
	/**
	* V_BL 笔录
	*/
	@Column(columnName="v_bl",dataType="varchar",dataLength=2000,nullAble="Y",comment="笔录")
	private String V_BL = "v_bl";
	/**
	* V_TZCJQK 听证裁决情况
	*/
	@Column(columnName="v_tzcjqk",dataType="varchar",dataLength=20,nullAble="Y",comment="听证裁决情况")
	private String V_TZCJQK = "v_tzcjqk";
	/**
	* PK_GS_H 公诉信息主表_主键
	*/
	@Column(columnName="pk_gs_h",dataType="char",dataLength=20,nullAble="N",comment="公诉信息主表_主键")
	private String PK_GS_H = "pk_gs_h";
	/**
	* getPk_gs_ktqk_b(void) 
	*/
	public String getPk_gs_ktqk_b(){
		return this.PK_GS_KTQK_B;
	}
	/**
	*setPk_gs_ktqk_b(java.lang.String)
	*/
	public void setPk_gs_ktqk_b(String pk_gs_ktqk_b){
		this.PK_GS_KTQK_B=pk_gs_ktqk_b;
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
	* getC_fyyt(void) 
	*/
	public String getC_fyyt(){
		return this.C_FYYT;
	}
	/**
	*setC_fyyt(java.lang.String)
	*/
	public void setC_fyyt(String c_fyyt){
		this.C_FYYT=c_fyyt;
	}
	/**
	* getN_tc(void) 
	*/
	public String getN_tc(){
		return this.N_TC;
	}
	/**
	*setN_tc(java.lang.String)
	*/
	public void setN_tc(String n_tc){
		this.N_TC=n_tc;
	}
	/**
	* getT_kssj(void) 
	*/
	public String getT_kssj(){
		return this.T_KSSJ;
	}
	/**
	*setT_kssj(java.lang.String)
	*/
	public void setT_kssj(String t_kssj){
		this.T_KSSJ=t_kssj;
	}
	/**
	* getT_jssj(void) 
	*/
	public String getT_jssj(){
		return this.T_JSSJ;
	}
	/**
	*setT_jssj(java.lang.String)
	*/
	public void setT_jssj(String t_jssj){
		this.T_JSSJ=t_jssj;
	}
	/**
	* getV_ktdd(void) 
	*/
	public String getV_ktdd(){
		return this.V_KTDD;
	}
	/**
	*setV_ktdd(java.lang.String)
	*/
	public void setV_ktdd(String v_ktdd){
		this.V_KTDD=v_ktdd;
	}
	/**
	* getB_sfggkt(void) 
	*/
	public String getB_sfggkt(){
		return this.B_SFGGKT;
	}
	/**
	*setB_sfggkt(java.lang.String)
	*/
	public void setB_sfggkt(String b_sfggkt){
		this.B_SFGGKT=b_sfggkt;
	}
	/**
	* getV_dtdsr(void) 
	*/
	public String getV_dtdsr(){
		return this.V_DTDSR;
	}
	/**
	*setV_dtdsr(java.lang.String)
	*/
	public void setV_dtdsr(String v_dtdsr){
		this.V_DTDSR=v_dtdsr;
	}
	/**
	* getV_jbdtdsr(void) 
	*/
	public String getV_jbdtdsr(){
		return this.V_JBDTDSR;
	}
	/**
	*setV_jbdtdsr(java.lang.String)
	*/
	public void setV_jbdtdsr(String v_jbdtdsr){
		this.V_JBDTDSR=v_jbdtdsr;
	}
	/**
	* getV_wzdlyztttdsr(void) 
	*/
	public String getV_wzdlyztttdsr(){
		return this.V_WZDLYZTTTDSR;
	}
	/**
	*setV_wzdlyztttdsr(java.lang.String)
	*/
	public void setV_wzdlyztttdsr(String v_wzdlyztttdsr){
		this.V_WZDLYZTTTDSR=v_wzdlyztttdsr;
	}
	/**
	* getV_dtssdlr(void) 
	*/
	public String getV_dtssdlr(){
		return this.V_DTSSDLR;
	}
	/**
	*setV_dtssdlr(java.lang.String)
	*/
	public void setV_dtssdlr(String v_dtssdlr){
		this.V_DTSSDLR=v_dtssdlr;
	}
	/**
	* getV_ctzzdzr(void) 
	*/
	public String getV_ctzzdzr(){
		return this.V_CTZZDZR;
	}
	/**
	*setV_ctzzdzr(java.lang.String)
	*/
	public void setV_ctzzdzr(String v_ctzzdzr){
		this.V_CTZZDZR=v_ctzzdzr;
	}
	/**
	* getB_bhrsfzwzbh(void) 
	*/
	public String getB_bhrsfzwzbh(){
		return this.B_BHRSFZWZBH;
	}
	/**
	*setB_bhrsfzwzbh(java.lang.String)
	*/
	public void setB_bhrsfzwzbh(String b_bhrsfzwzbh){
		this.B_BHRSFZWZBH=b_bhrsfzwzbh;
	}
	/**
	* getV_jjjxbhhdl(void) 
	*/
	public String getV_jjjxbhhdl(){
		return this.V_JJJXBHHDL;
	}
	/**
	*setV_jjjxbhhdl(java.lang.String)
	*/
	public void setV_jjjxbhhdl(String v_jjjxbhhdl){
		this.V_JJJXBHHDL=v_jjjxbhhdl;
	}
	/**
	* getV_dwxc(void) 
	*/
	public String getV_dwxc(){
		return this.V_DWXC;
	}
	/**
	*setV_dwxc(java.lang.String)
	*/
	public void setV_dwxc(String v_dwxc){
		this.V_DWXC=v_dwxc;
	}
	/**
	* getN_ptrs(void) 
	*/
	public String getN_ptrs(){
		return this.N_PTRS;
	}
	/**
	*setN_ptrs(java.lang.String)
	*/
	public void setN_ptrs(String n_ptrs){
		this.N_PTRS=n_ptrs;
	}
	/**
	* getN_rddbptrs(void) 
	*/
	public String getN_rddbptrs(){
		return this.N_RDDBPTRS;
	}
	/**
	*setN_rddbptrs(java.lang.String)
	*/
	public void setN_rddbptrs(String n_rddbptrs){
		this.N_RDDBPTRS=n_rddbptrs;
	}
	/**
	* getN_zxwyptrs(void) 
	*/
	public String getN_zxwyptrs(){
		return this.N_ZXWYPTRS;
	}
	/**
	*setN_zxwyptrs(java.lang.String)
	*/
	public void setN_zxwyptrs(String n_zxwyptrs){
		this.N_ZXWYPTRS=n_zxwyptrs;
	}
	/**
	* getB_swhwysfdtta(void) 
	*/
	public String getB_swhwysfdtta(){
		return this.B_SWHWYSFDTTA;
	}
	/**
	*setB_swhwysfdtta(java.lang.String)
	*/
	public void setB_swhwysfdtta(String b_swhwysfdtta){
		this.B_SWHWYSFDTTA=b_swhwysfdtta;
	}
	/**
	* getV_xpqk(void) 
	*/
	public String getV_xpqk(){
		return this.V_XPQK;
	}
	/**
	*setV_xpqk(java.lang.String)
	*/
	public void setV_xpqk(String v_xpqk){
		this.V_XPQK=v_xpqk;
	}
	/**
	* getV_bl(void) 
	*/
	public String getV_bl(){
		return this.V_BL;
	}
	/**
	*setV_bl(java.lang.String)
	*/
	public void setV_bl(String v_bl){
		this.V_BL=v_bl;
	}
	/**
	* getV_tzcjqk(void) 
	*/
	public String getV_tzcjqk(){
		return this.V_TZCJQK;
	}
	/**
	*setV_tzcjqk(java.lang.String)
	*/
	public void setV_tzcjqk(String v_tzcjqk){
		this.V_TZCJQK=v_tzcjqk;
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