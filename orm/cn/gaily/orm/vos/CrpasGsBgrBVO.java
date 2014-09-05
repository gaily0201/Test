package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGsBgrBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gs_bgr_b")
public class CrpasGsBgrBVO {
	/**
	* PK_GS_BGR_B 子表主键
	*/
	@Column(columnName="pk_gs_bgr_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GS_BGR_B = "pk_gs_bgr_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_BGR 被告人
	*/
	@Column(columnName="c_bgr",dataType="char",dataLength=20,nullAble="Y",comment="被告人")
	private String C_BGR = "c_bgr";
	/**
	* V_BGRXM 被告人姓名
	*/
	@Column(columnName="v_bgrxm",dataType="varchar",dataLength=200,nullAble="Y",comment="被告人姓名")
	private String V_BGRXM = "v_bgrxm";
	/**
	* C_BGRLB 被告人类别
	*/
	@Column(columnName="c_bgrlb",dataType="varchar",dataLength=20,nullAble="Y",comment="被告人类别")
	private String C_BGRLB = "c_bgrlb";
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
	* V_DWFZZJZRR 单位犯罪直接责任人
	*/
	@Column(columnName="v_dwfzzjzrr",dataType="varchar",dataLength=200,nullAble="Y",comment="单位犯罪直接责任人")
	private String V_DWFZZJZRR = "v_dwfzzjzrr";
	/**
	* V_XWNL 行为能力
	*/
	@Column(columnName="v_xwnl",dataType="varchar",dataLength=200,nullAble="Y",comment="行为能力")
	private String V_XWNL = "v_xwnl";
	/**
	* B_SFHY 是否怀孕
	*/
	@Column(columnName="b_sfhy",dataType="char",dataLength=1,nullAble="Y",comment="是否怀孕")
	private String B_SFHY = "b_sfhy";
	/**
	* B_SFLC 是否流产
	*/
	@Column(columnName="b_sflc",dataType="char",dataLength=1,nullAble="Y",comment="是否流产")
	private String B_SFLC = "b_sflc";
	/**
	* V_JSFLYZYY 接受法律援助原因
	*/
	@Column(columnName="v_jsflyzyy",dataType="varchar",dataLength=200,nullAble="Y",comment="接受法律援助原因")
	private String V_JSFLYZYY = "v_jsflyzyy";
	/**
	* B_SFCYHXJSKYQ 是否处于缓刑假释考验期
	*/
	@Column(columnName="b_sfcyhxjskyq",dataType="char",dataLength=1,nullAble="Y",comment="是否处于缓刑假释考验期")
	private String B_SFCYHXJSKYQ = "b_sfcyhxjskyq";
	/**
	* B_SFCXHXJS 是否撤销缓刑假释
	*/
	@Column(columnName="b_sfcxhxjs",dataType="char",dataLength=1,nullAble="Y",comment="是否撤销缓刑假释")
	private String B_SFCXHXJS = "b_sfcxhxjs";
	/**
	* C_GAJ_XYR 嫌疑人id
	*/
	@Column(columnName="c_gaj_xyr",dataType="varchar",dataLength=20,nullAble="Y",comment="嫌疑人id")
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
	* getPk_gs_bgr_b(void) 
	*/
	public String getPk_gs_bgr_b(){
		return this.PK_GS_BGR_B;
	}
	/**
	*setPk_gs_bgr_b(java.lang.String)
	*/
	public void setPk_gs_bgr_b(String pk_gs_bgr_b){
		this.PK_GS_BGR_B=pk_gs_bgr_b;
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
	* getC_bgrlb(void) 
	*/
	public String getC_bgrlb(){
		return this.C_BGRLB;
	}
	/**
	*setC_bgrlb(java.lang.String)
	*/
	public void setC_bgrlb(String c_bgrlb){
		this.C_BGRLB=c_bgrlb;
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
	* getV_dwfzzjzrr(void) 
	*/
	public String getV_dwfzzjzrr(){
		return this.V_DWFZZJZRR;
	}
	/**
	*setV_dwfzzjzrr(java.lang.String)
	*/
	public void setV_dwfzzjzrr(String v_dwfzzjzrr){
		this.V_DWFZZJZRR=v_dwfzzjzrr;
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
	* getB_sfhy(void) 
	*/
	public String getB_sfhy(){
		return this.B_SFHY;
	}
	/**
	*setB_sfhy(java.lang.String)
	*/
	public void setB_sfhy(String b_sfhy){
		this.B_SFHY=b_sfhy;
	}
	/**
	* getB_sflc(void) 
	*/
	public String getB_sflc(){
		return this.B_SFLC;
	}
	/**
	*setB_sflc(java.lang.String)
	*/
	public void setB_sflc(String b_sflc){
		this.B_SFLC=b_sflc;
	}
	/**
	* getV_jsflyzyy(void) 
	*/
	public String getV_jsflyzyy(){
		return this.V_JSFLYZYY;
	}
	/**
	*setV_jsflyzyy(java.lang.String)
	*/
	public void setV_jsflyzyy(String v_jsflyzyy){
		this.V_JSFLYZYY=v_jsflyzyy;
	}
	/**
	* getB_sfcyhxjskyq(void) 
	*/
	public String getB_sfcyhxjskyq(){
		return this.B_SFCYHXJSKYQ;
	}
	/**
	*setB_sfcyhxjskyq(java.lang.String)
	*/
	public void setB_sfcyhxjskyq(String b_sfcyhxjskyq){
		this.B_SFCYHXJSKYQ=b_sfcyhxjskyq;
	}
	/**
	* getB_sfcxhxjs(void) 
	*/
	public String getB_sfcxhxjs(){
		return this.B_SFCXHXJS;
	}
	/**
	*setB_sfcxhxjs(java.lang.String)
	*/
	public void setB_sfcxhxjs(String b_sfcxhxjs){
		this.B_SFCXHXJS=b_sfcxhxjs;
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