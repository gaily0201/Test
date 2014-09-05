package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasKsYsqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ks_ysqk_b")
public class CrpasKsYsqkBVO {
	/**
	* PK_KS_YSQK_B 子表主键
	*/
	@Column(columnName="pk_ks_ysqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_KS_YSQK_B = "pk_ks_ysqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="Y",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_JBFY 经办法院
	*/
	@Column(columnName="c_jbfy",dataType="varchar",dataLength=20,nullAble="Y",comment="经办法院")
	private String C_JBFY = "c_jbfy";
	/**
	* V_JBFYMC 经办法院名称
	*/
	@Column(columnName="v_jbfymc",dataType="varchar",dataLength=200,nullAble="Y",comment="经办法院名称")
	private String V_JBFYMC = "v_jbfymc";
	/**
	* V_AH 案号
	*/
	@Column(columnName="v_ah",dataType="varchar",dataLength=200,nullAble="Y",comment="案号")
	private String V_AH = "v_ah";
	/**
	* C_AY 案由
	*/
	@Column(columnName="c_ay",dataType="varchar",dataLength=20,nullAble="Y",comment="案由")
	private String C_AY = "c_ay";
	/**
	* V_AYMC 案由名称
	*/
	@Column(columnName="v_aymc",dataType="varchar",dataLength=200,nullAble="Y",comment="案由名称")
	private String V_AYMC = "v_aymc";
	/**
	* C_SPCX 审判程序
	*/
	@Column(columnName="c_spcx",dataType="varchar",dataLength=20,nullAble="Y",comment="审判程序")
	private String C_SPCX = "c_spcx";
	/**
	* V_SPCXMC 审判程序名称
	*/
	@Column(columnName="v_spcxmc",dataType="varchar",dataLength=200,nullAble="Y",comment="审判程序名称")
	private String V_SPCXMC = "v_spcxmc";
	/**
	* D_LARQ 立案日期
	*/
	@Column(columnName="d_larq",dataType="char",dataLength=19,nullAble="Y",comment="立案日期")
	private String D_LARQ = "d_larq";
	/**
	* D_JARQ 结案日期
	*/
	@Column(columnName="d_jarq",dataType="char",dataLength=19,nullAble="Y",comment="结案日期")
	private String D_JARQ = "d_jarq";
	/**
	* C_JAFS 结案方式
	*/
	@Column(columnName="c_jafs",dataType="varchar",dataLength=20,nullAble="Y",comment="结案方式")
	private String C_JAFS = "c_jafs";
	/**
	* V_JAFSMC 结案方式名称
	*/
	@Column(columnName="v_jafsmc",dataType="varchar",dataLength=200,nullAble="Y",comment="结案方式名称")
	private String V_JAFSMC = "v_jafsmc";
	/**
	* D_SXRQ 生效日期
	*/
	@Column(columnName="d_sxrq",dataType="char",dataLength=19,nullAble="Y",comment="生效日期")
	private String D_SXRQ = "d_sxrq";
	/**
	* V_TQXALY 提起新案理由
	*/
	@Column(columnName="v_tqxaly",dataType="varchar",dataLength=20,nullAble="Y",comment="提起新案理由")
	private String V_TQXALY = "v_tqxaly";
	/**
	* D_TQXARQ 提起新案日期
	*/
	@Column(columnName="d_tqxarq",dataType="char",dataLength=19,nullAble="Y",comment="提起新案日期")
	private String D_TQXARQ = "d_tqxarq";
	/**
	* V_SXFLWSBH 生效法律文书编号
	*/
	@Column(columnName="v_sxflwsbh",dataType="varchar",dataLength=200,nullAble="Y",comment="生效法律文书编号")
	private String V_SXFLWSBH = "v_sxflwsbh";
	/**
	* C_YCPLX 原裁判类型
	*/
	@Column(columnName="c_ycplx",dataType="varchar",dataLength=20,nullAble="Y",comment="原裁判类型")
	private String C_YCPLX = "c_ycplx";
	/**
	* PK_KS_H 抗诉信息主表_主键
	*/
	@Column(columnName="pk_ks_h",dataType="char",dataLength=20,nullAble="N",comment="抗诉信息主表_主键")
	private String PK_KS_H = "pk_ks_h";
	/**
	* getPk_ks_ysqk_b(void) 
	*/
	public String getPk_ks_ysqk_b(){
		return this.PK_KS_YSQK_B;
	}
	/**
	*setPk_ks_ysqk_b(java.lang.String)
	*/
	public void setPk_ks_ysqk_b(String pk_ks_ysqk_b){
		this.PK_KS_YSQK_B=pk_ks_ysqk_b;
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
	* getC_jbfy(void) 
	*/
	public String getC_jbfy(){
		return this.C_JBFY;
	}
	/**
	*setC_jbfy(java.lang.String)
	*/
	public void setC_jbfy(String c_jbfy){
		this.C_JBFY=c_jbfy;
	}
	/**
	* getV_jbfymc(void) 
	*/
	public String getV_jbfymc(){
		return this.V_JBFYMC;
	}
	/**
	*setV_jbfymc(java.lang.String)
	*/
	public void setV_jbfymc(String v_jbfymc){
		this.V_JBFYMC=v_jbfymc;
	}
	/**
	* getV_ah(void) 
	*/
	public String getV_ah(){
		return this.V_AH;
	}
	/**
	*setV_ah(java.lang.String)
	*/
	public void setV_ah(String v_ah){
		this.V_AH=v_ah;
	}
	/**
	* getC_ay(void) 
	*/
	public String getC_ay(){
		return this.C_AY;
	}
	/**
	*setC_ay(java.lang.String)
	*/
	public void setC_ay(String c_ay){
		this.C_AY=c_ay;
	}
	/**
	* getV_aymc(void) 
	*/
	public String getV_aymc(){
		return this.V_AYMC;
	}
	/**
	*setV_aymc(java.lang.String)
	*/
	public void setV_aymc(String v_aymc){
		this.V_AYMC=v_aymc;
	}
	/**
	* getC_spcx(void) 
	*/
	public String getC_spcx(){
		return this.C_SPCX;
	}
	/**
	*setC_spcx(java.lang.String)
	*/
	public void setC_spcx(String c_spcx){
		this.C_SPCX=c_spcx;
	}
	/**
	* getV_spcxmc(void) 
	*/
	public String getV_spcxmc(){
		return this.V_SPCXMC;
	}
	/**
	*setV_spcxmc(java.lang.String)
	*/
	public void setV_spcxmc(String v_spcxmc){
		this.V_SPCXMC=v_spcxmc;
	}
	/**
	* getD_larq(void) 
	*/
	public String getD_larq(){
		return this.D_LARQ;
	}
	/**
	*setD_larq(java.lang.String)
	*/
	public void setD_larq(String d_larq){
		this.D_LARQ=d_larq;
	}
	/**
	* getD_jarq(void) 
	*/
	public String getD_jarq(){
		return this.D_JARQ;
	}
	/**
	*setD_jarq(java.lang.String)
	*/
	public void setD_jarq(String d_jarq){
		this.D_JARQ=d_jarq;
	}
	/**
	* getC_jafs(void) 
	*/
	public String getC_jafs(){
		return this.C_JAFS;
	}
	/**
	*setC_jafs(java.lang.String)
	*/
	public void setC_jafs(String c_jafs){
		this.C_JAFS=c_jafs;
	}
	/**
	* getV_jafsmc(void) 
	*/
	public String getV_jafsmc(){
		return this.V_JAFSMC;
	}
	/**
	*setV_jafsmc(java.lang.String)
	*/
	public void setV_jafsmc(String v_jafsmc){
		this.V_JAFSMC=v_jafsmc;
	}
	/**
	* getD_sxrq(void) 
	*/
	public String getD_sxrq(){
		return this.D_SXRQ;
	}
	/**
	*setD_sxrq(java.lang.String)
	*/
	public void setD_sxrq(String d_sxrq){
		this.D_SXRQ=d_sxrq;
	}
	/**
	* getV_tqxaly(void) 
	*/
	public String getV_tqxaly(){
		return this.V_TQXALY;
	}
	/**
	*setV_tqxaly(java.lang.String)
	*/
	public void setV_tqxaly(String v_tqxaly){
		this.V_TQXALY=v_tqxaly;
	}
	/**
	* getD_tqxarq(void) 
	*/
	public String getD_tqxarq(){
		return this.D_TQXARQ;
	}
	/**
	*setD_tqxarq(java.lang.String)
	*/
	public void setD_tqxarq(String d_tqxarq){
		this.D_TQXARQ=d_tqxarq;
	}
	/**
	* getV_sxflwsbh(void) 
	*/
	public String getV_sxflwsbh(){
		return this.V_SXFLWSBH;
	}
	/**
	*setV_sxflwsbh(java.lang.String)
	*/
	public void setV_sxflwsbh(String v_sxflwsbh){
		this.V_SXFLWSBH=v_sxflwsbh;
	}
	/**
	* getC_ycplx(void) 
	*/
	public String getC_ycplx(){
		return this.C_YCPLX;
	}
	/**
	*setC_ycplx(java.lang.String)
	*/
	public void setC_ycplx(String c_ycplx){
		this.C_YCPLX=c_ycplx;
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