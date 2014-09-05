package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzXxqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_xxqk_b")
public class CrpasSqjzXxqkBVO {
	/**
	* PK_SQJZ_H 社区矫正主表_主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="char",dataLength=20,nullAble="N",comment="社区矫正主表_主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
	/**
	* PK_SQJZ_XXQK_B 子表主键
	*/
	@Column(columnName="pk_sqjz_xxqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SQJZ_XXQK_B = "pk_sqjz_xxqk_b";
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
	* T_XXSJ 学习时间
	*/
	@Column(columnName="t_xxsj",dataType="char",dataLength=19,nullAble="Y",comment="学习时间")
	private String T_XXSJ = "t_xxsj";
	/**
	* V_XXNR 学习内容
	*/
	@Column(columnName="v_xxnr",dataType="varchar",dataLength=2000,nullAble="Y",comment="学习内容")
	private String V_XXNR = "v_xxnr";
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
	* getPk_sqjz_xxqk_b(void) 
	*/
	public String getPk_sqjz_xxqk_b(){
		return this.PK_SQJZ_XXQK_B;
	}
	/**
	*setPk_sqjz_xxqk_b(java.lang.String)
	*/
	public void setPk_sqjz_xxqk_b(String pk_sqjz_xxqk_b){
		this.PK_SQJZ_XXQK_B=pk_sqjz_xxqk_b;
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
	* getT_xxsj(void) 
	*/
	public String getT_xxsj(){
		return this.T_XXSJ;
	}
	/**
	*setT_xxsj(java.lang.String)
	*/
	public void setT_xxsj(String t_xxsj){
		this.T_XXSJ=t_xxsj;
	}
	/**
	* getV_xxnr(void) 
	*/
	public String getV_xxnr(){
		return this.V_XXNR;
	}
	/**
	*setV_xxnr(java.lang.String)
	*/
	public void setV_xxnr(String v_xxnr){
		this.V_XXNR=v_xxnr;
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