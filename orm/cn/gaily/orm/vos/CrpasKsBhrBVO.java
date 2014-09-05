package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasKsBhrBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ks_bhr_b")
public class CrpasKsBhrBVO {
	/**
	* PK_KS_BHR_B 子表主键
	*/
	@Column(columnName="pk_ks_bhr_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_KS_BHR_B = "pk_ks_bhr_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="Y",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_GAJ_BHR 被害人id
	*/
	@Column(columnName="c_gaj_bhr",dataType="varchar",dataLength=20,nullAble="Y",comment="被害人id")
	private String C_GAJ_BHR = "c_gaj_bhr";
	/**
	* V_BHRBH 被害人编号
	*/
	@Column(columnName="v_bhrbh",dataType="varchar",dataLength=50,nullAble="Y",comment="被害人编号")
	private String V_BHRBH = "v_bhrbh";
	/**
	* C_BHR 被害人
	*/
	@Column(columnName="c_bhr",dataType="varchar",dataLength=20,nullAble="Y",comment="被害人")
	private String C_BHR = "c_bhr";
	/**
	* V_BGRXM 被害人姓名
	*/
	@Column(columnName="v_bgrxm",dataType="varchar",dataLength=200,nullAble="Y",comment="被害人姓名")
	private String V_BGRXM = "v_bgrxm";
	/**
	* C_YSSSDW 一审诉讼地位
	*/
	@Column(columnName="c_ysssdw",dataType="varchar",dataLength=20,nullAble="Y",comment="一审诉讼地位")
	private String C_YSSSDW = "c_ysssdw";
	/**
	* C_ESSSDW 二审诉讼地位
	*/
	@Column(columnName="c_esssdw",dataType="varchar",dataLength=20,nullAble="Y",comment="二审诉讼地位")
	private String C_ESSSDW = "c_esssdw";
	/**
	* C_ZSSSDW 再审诉讼地位
	*/
	@Column(columnName="c_zsssdw",dataType="varchar",dataLength=20,nullAble="Y",comment="再审诉讼地位")
	private String C_ZSSSDW = "c_zsssdw";
	/**
	* V_XWNL 行为能力
	*/
	@Column(columnName="v_xwnl",dataType="varchar",dataLength=20,nullAble="Y",comment="行为能力")
	private String V_XWNL = "v_xwnl";
	/**
	* V_SWQK 伤亡情况
	*/
	@Column(columnName="v_swqk",dataType="varchar",dataLength=200,nullAble="Y",comment="伤亡情况")
	private String V_SWQK = "v_swqk";
	/**
	* V_ZHR 致害人
	*/
	@Column(columnName="v_zhr",dataType="varchar",dataLength=200,nullAble="Y",comment="致害人")
	private String V_ZHR = "v_zhr";
	/**
	* N_WZSSJE 物质损失金额
	*/
	@Column(columnName="n_wzssje",dataType="decimal",dataLength=20,nullAble="Y",comment="物质损失金额")
	private String N_WZSSJE = "n_wzssje";
	/**
	* N_TCMSPCJE 提出民事赔偿金额
	*/
	@Column(columnName="n_tcmspcje",dataType="decimal",dataLength=20,nullAble="Y",comment="提出民事赔偿金额")
	private String N_TCMSPCJE = "n_tcmspcje";
	/**
	* V_DWJSSFJZYY 单位接受司法救助原因
	*/
	@Column(columnName="v_dwjssfjzyy",dataType="varchar",dataLength=20,nullAble="Y",comment="单位接受司法救助原因")
	private String V_DWJSSFJZYY = "v_dwjssfjzyy";
	/**
	* PK_KS_H 抗诉信息主表_主键
	*/
	@Column(columnName="pk_ks_h",dataType="char",dataLength=20,nullAble="N",comment="抗诉信息主表_主键")
	private String PK_KS_H = "pk_ks_h";
	/**
	* getPk_ks_bhr_b(void) 
	*/
	public String getPk_ks_bhr_b(){
		return this.PK_KS_BHR_B;
	}
	/**
	*setPk_ks_bhr_b(java.lang.String)
	*/
	public void setPk_ks_bhr_b(String pk_ks_bhr_b){
		this.PK_KS_BHR_B=pk_ks_bhr_b;
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
	* getC_gaj_bhr(void) 
	*/
	public String getC_gaj_bhr(){
		return this.C_GAJ_BHR;
	}
	/**
	*setC_gaj_bhr(java.lang.String)
	*/
	public void setC_gaj_bhr(String c_gaj_bhr){
		this.C_GAJ_BHR=c_gaj_bhr;
	}
	/**
	* getV_bhrbh(void) 
	*/
	public String getV_bhrbh(){
		return this.V_BHRBH;
	}
	/**
	*setV_bhrbh(java.lang.String)
	*/
	public void setV_bhrbh(String v_bhrbh){
		this.V_BHRBH=v_bhrbh;
	}
	/**
	* getC_bhr(void) 
	*/
	public String getC_bhr(){
		return this.C_BHR;
	}
	/**
	*setC_bhr(java.lang.String)
	*/
	public void setC_bhr(String c_bhr){
		this.C_BHR=c_bhr;
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
	* getC_ysssdw(void) 
	*/
	public String getC_ysssdw(){
		return this.C_YSSSDW;
	}
	/**
	*setC_ysssdw(java.lang.String)
	*/
	public void setC_ysssdw(String c_ysssdw){
		this.C_YSSSDW=c_ysssdw;
	}
	/**
	* getC_esssdw(void) 
	*/
	public String getC_esssdw(){
		return this.C_ESSSDW;
	}
	/**
	*setC_esssdw(java.lang.String)
	*/
	public void setC_esssdw(String c_esssdw){
		this.C_ESSSDW=c_esssdw;
	}
	/**
	* getC_zsssdw(void) 
	*/
	public String getC_zsssdw(){
		return this.C_ZSSSDW;
	}
	/**
	*setC_zsssdw(java.lang.String)
	*/
	public void setC_zsssdw(String c_zsssdw){
		this.C_ZSSSDW=c_zsssdw;
	}
	/**
	* getV_xwnl(void) 
	*/
	public String getV_xwnl(){
		return this.V_XWNL;
	}
	/**
	*setV_xwnl(java.lang.String)
	*/
	public void setV_xwnl(String v_xwnl){
		this.V_XWNL=v_xwnl;
	}
	/**
	* getV_swqk(void) 
	*/
	public String getV_swqk(){
		return this.V_SWQK;
	}
	/**
	*setV_swqk(java.lang.String)
	*/
	public void setV_swqk(String v_swqk){
		this.V_SWQK=v_swqk;
	}
	/**
	* getV_zhr(void) 
	*/
	public String getV_zhr(){
		return this.V_ZHR;
	}
	/**
	*setV_zhr(java.lang.String)
	*/
	public void setV_zhr(String v_zhr){
		this.V_ZHR=v_zhr;
	}
	/**
	* getN_wzssje(void) 
	*/
	public String getN_wzssje(){
		return this.N_WZSSJE;
	}
	/**
	*setN_wzssje(java.lang.String)
	*/
	public void setN_wzssje(String n_wzssje){
		this.N_WZSSJE=n_wzssje;
	}
	/**
	* getN_tcmspcje(void) 
	*/
	public String getN_tcmspcje(){
		return this.N_TCMSPCJE;
	}
	/**
	*setN_tcmspcje(java.lang.String)
	*/
	public void setN_tcmspcje(String n_tcmspcje){
		this.N_TCMSPCJE=n_tcmspcje;
	}
	/**
	* getV_dwjssfjzyy(void) 
	*/
	public String getV_dwjssfjzyy(){
		return this.V_DWJSSFJZYY;
	}
	/**
	*setV_dwjssfjzyy(java.lang.String)
	*/
	public void setV_dwjssfjzyy(String v_dwjssfjzyy){
		this.V_DWJSSFJZYY=v_dwjssfjzyy;
	}
	/**
	* getPk_ks_h(void) 
	*/
	public String getPk_ks_h(){
		return this.PK_KS_H;
	}
	/**
	*setPk_ks_h(java.lang.String)
	*/
	public void setPk_ks_h(String pk_ks_h){
		this.PK_KS_H=pk_ks_h;
	}


}