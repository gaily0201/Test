package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasWsyjBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_wsyj_b")
public class CrpasWsyjBVO {
	/**
	* PK_WSYJ_B 子表主键
	*/
	@Column(columnName="pk_wsyj_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_WSYJ_B = "pk_wsyj_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_JYMU 借阅目录
	*/
	@Column(columnName="v_jymu",dataType="varchar",dataLength=50,nullAble="Y",comment="借阅目录")
	private String V_JYMU = "v_jymu";
	/**
	* V_JYYH 借阅页号
	*/
	@Column(columnName="v_jyyh",dataType="varchar",dataLength=50,nullAble="Y",comment="借阅页号")
	private String V_JYYH = "v_jyyh";
	/**
	* V_JYYT 借阅用途
	*/
	@Column(columnName="v_jyyt",dataType="varchar",dataLength=50,nullAble="Y",comment="借阅用途")
	private String V_JYYT = "v_jyyt";
	/**
	* V_JYSHJG 借阅审批结果
	*/
	@Column(columnName="v_jyshjg",dataType="varchar",dataLength=50,nullAble="Y",comment="借阅审批结果")
	private String V_JYSHJG = "v_jyshjg";
	/**
	* V_WJZJ 文件主键
	*/
	@Column(columnName="v_wjzj",dataType="varchar",dataLength=50,nullAble="Y",comment="文件主键")
	private String V_WJZJ = "v_wjzj";
	/**
	* V_WJMC 文件名称
	*/
	@Column(columnName="v_wjmc",dataType="varchar",dataLength=50,nullAble="Y",comment="文件名称")
	private String V_WJMC = "v_wjmc";
	/**
	* B_SFKFZ 是否可复制
	*/
	@Column(columnName="b_sfkfz",dataType="char",dataLength=1,nullAble="Y",comment="是否可复制")
	private String B_SFKFZ = "b_sfkfz";
	/**
	* B_SFKXZ 是否可下载
	*/
	@Column(columnName="b_sfkxz",dataType="char",dataLength=1,nullAble="Y",comment="是否可下载")
	private String B_SFKXZ = "b_sfkxz";
	/**
	* B_SFKDY 是否可打印
	*/
	@Column(columnName="b_sfkdy",dataType="char",dataLength=1,nullAble="Y",comment="是否可打印")
	private String B_SFKDY = "b_sfkdy";
	/**
	* N_DYCS 打印次数
	*/
	@Column(columnName="n_dycs",dataType="int",dataLength=0,nullAble="Y",comment="打印次数")
	private String N_DYCS = "n_dycs";
	/**
	* PK_WSYJ_H 网上阅卷主表_主键
	*/
	@Column(columnName="pk_wsyj_h",dataType="char",dataLength=20,nullAble="N",comment="网上阅卷主表_主键")
	private String PK_WSYJ_H = "pk_wsyj_h";
	/**
	* getPk_wsyj_b(void) 
	*/
	public String getPk_wsyj_b(){
		return this.PK_WSYJ_B;
	}
	/**
	*setPk_wsyj_b(java.lang.String)
	*/
	public void setPk_wsyj_b(String pk_wsyj_b){
		this.PK_WSYJ_B=pk_wsyj_b;
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
	* getV_jymu(void) 
	*/
	public String getV_jymu(){
		return this.V_JYMU;
	}
	/**
	*setV_jymu(java.lang.String)
	*/
	public void setV_jymu(String v_jymu){
		this.V_JYMU=v_jymu;
	}
	/**
	* getV_jyyh(void) 
	*/
	public String getV_jyyh(){
		return this.V_JYYH;
	}
	/**
	*setV_jyyh(java.lang.String)
	*/
	public void setV_jyyh(String v_jyyh){
		this.V_JYYH=v_jyyh;
	}
	/**
	* getV_jyyt(void) 
	*/
	public String getV_jyyt(){
		return this.V_JYYT;
	}
	/**
	*setV_jyyt(java.lang.String)
	*/
	public void setV_jyyt(String v_jyyt){
		this.V_JYYT=v_jyyt;
	}
	/**
	* getV_jyshjg(void) 
	*/
	public String getV_jyshjg(){
		return this.V_JYSHJG;
	}
	/**
	*setV_jyshjg(java.lang.String)
	*/
	public void setV_jyshjg(String v_jyshjg){
		this.V_JYSHJG=v_jyshjg;
	}
	/**
	* getV_wjzj(void) 
	*/
	public String getV_wjzj(){
		return this.V_WJZJ;
	}
	/**
	*setV_wjzj(java.lang.String)
	*/
	public void setV_wjzj(String v_wjzj){
		this.V_WJZJ=v_wjzj;
	}
	/**
	* getV_wjmc(void) 
	*/
	public String getV_wjmc(){
		return this.V_WJMC;
	}
	/**
	*setV_wjmc(java.lang.String)
	*/
	public void setV_wjmc(String v_wjmc){
		this.V_WJMC=v_wjmc;
	}
	/**
	* getB_sfkfz(void) 
	*/
	public String getB_sfkfz(){
		return this.B_SFKFZ;
	}
	/**
	*setB_sfkfz(java.lang.String)
	*/
	public void setB_sfkfz(String b_sfkfz){
		this.B_SFKFZ=b_sfkfz;
	}
	/**
	* getB_sfkxz(void) 
	*/
	public String getB_sfkxz(){
		return this.B_SFKXZ;
	}
	/**
	*setB_sfkxz(java.lang.String)
	*/
	public void setB_sfkxz(String b_sfkxz){
		this.B_SFKXZ=b_sfkxz;
	}
	/**
	* getB_sfkdy(void) 
	*/
	public String getB_sfkdy(){
		return this.B_SFKDY;
	}
	/**
	*setB_sfkdy(java.lang.String)
	*/
	public void setB_sfkdy(String b_sfkdy){
		this.B_SFKDY=b_sfkdy;
	}
	/**
	* getN_dycs(void) 
	*/
	public String getN_dycs(){
		return this.N_DYCS;
	}
	/**
	*setN_dycs(java.lang.String)
	*/
	public void setN_dycs(String n_dycs){
		this.N_DYCS=n_dycs;
	}
	/**
	* getPk_wsyj_h(void) 
	*/
	public String getPk_wsyj_h(){
		return this.PK_WSYJ_H;
	}
	/**
	*setPk_wsyj_h(java.lang.String)
	*/
	public void setPk_wsyj_h(String pk_wsyj_h){
		this.PK_WSYJ_H=pk_wsyj_h;
	}


}