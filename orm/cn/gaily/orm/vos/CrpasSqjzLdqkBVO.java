package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzLdqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_ldqk_b")
public class CrpasSqjzLdqkBVO {
	/**
	* PK_SQJZ_H 社区矫正主表_主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="char",dataLength=20,nullAble="N",comment="社区矫正主表_主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
	/**
	* PK_SQJZ_LDQK_B 子表主键
	*/
	@Column(columnName="pk_sqjz_ldqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SQJZ_LDQK_B = "pk_sqjz_ldqk_b";
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
	@Column(columnName="c_ssdw",dataType="varchar",dataLength=20,nullAble="Y",comment="所属单位")
	private String C_SSDW = "c_ssdw";
	/**
	* V_SSDWMC 所属单位名称
	*/
	@Column(columnName="v_ssdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="所属单位名称")
	private String V_SSDWMC = "v_ssdwmc";
	/**
	* T_LDSJ 劳动时间
	*/
	@Column(columnName="t_ldsj",dataType="char",dataLength=19,nullAble="Y",comment="劳动时间")
	private String T_LDSJ = "t_ldsj";
	/**
	* V_LDNR 劳动内容
	*/
	@Column(columnName="v_ldnr",dataType="varchar",dataLength=2000,nullAble="Y",comment="劳动内容")
	private String V_LDNR = "v_ldnr";
	/**
	* V_LDDD 劳动地点
	*/
	@Column(columnName="v_lddd",dataType="varchar",dataLength=200,nullAble="Y",comment="劳动地点")
	private String V_LDDD = "v_lddd";
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
	* getPk_sqjz_ldqk_b(void) 
	*/
	public String getPk_sqjz_ldqk_b(){
		return this.PK_SQJZ_LDQK_B;
	}
	/**
	*setPk_sqjz_ldqk_b(java.lang.String)
	*/
	public void setPk_sqjz_ldqk_b(String pk_sqjz_ldqk_b){
		this.PK_SQJZ_LDQK_B=pk_sqjz_ldqk_b;
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
	* getT_ldsj(void) 
	*/
	public String getT_ldsj(){
		return this.T_LDSJ;
	}
	/**
	*setT_ldsj(java.lang.String)
	*/
	public void setT_ldsj(String t_ldsj){
		this.T_LDSJ=t_ldsj;
	}
	/**
	* getV_ldnr(void) 
	*/
	public String getV_ldnr(){
		return this.V_LDNR;
	}
	/**
	*setV_ldnr(java.lang.String)
	*/
	public void setV_ldnr(String v_ldnr){
		this.V_LDNR=v_ldnr;
	}
	/**
	* getV_lddd(void) 
	*/
	public String getV_lddd(){
		return this.V_LDDD;
	}
	/**
	*setV_lddd(java.lang.String)
	*/
	public void setV_lddd(String v_lddd){
		this.V_LDDD=v_lddd;
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