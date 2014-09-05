package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzSxhbBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_sxhb_b")
public class CrpasSqjzSxhbBVO {
	/**
	* PK_SQJZ_H 社区矫正主表_主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="char",dataLength=20,nullAble="N",comment="社区矫正主表_主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
	/**
	* PK_SQJZ_SXHB_B 子表主键
	*/
	@Column(columnName="pk_sqjz_sxhb_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SQJZ_SXHB_B = "pk_sqjz_sxhb_b";
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
	* D_HBRQ 汇报日期
	*/
	@Column(columnName="d_hbrq",dataType="char",dataLength=19,nullAble="Y",comment="汇报日期")
	private String D_HBRQ = "d_hbrq";
	/**
	* V_HBNR 汇报内容
	*/
	@Column(columnName="v_hbnr",dataType="varchar",dataLength=2000,nullAble="Y",comment="汇报内容")
	private String V_HBNR = "v_hbnr";
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
	* getPk_sqjz_sxhb_b(void) 
	*/
	public String getPk_sqjz_sxhb_b(){
		return this.PK_SQJZ_SXHB_B;
	}
	/**
	*setPk_sqjz_sxhb_b(java.lang.String)
	*/
	public void setPk_sqjz_sxhb_b(String pk_sqjz_sxhb_b){
		this.PK_SQJZ_SXHB_B=pk_sqjz_sxhb_b;
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
	* getD_hbrq(void) 
	*/
	public String getD_hbrq(){
		return this.D_HBRQ;
	}
	/**
	*setD_hbrq(java.lang.String)
	*/
	public void setD_hbrq(String d_hbrq){
		this.D_HBRQ=d_hbrq;
	}
	/**
	* getV_hbnr(void) 
	*/
	public String getV_hbnr(){
		return this.V_HBNR;
	}
	/**
	*setV_hbnr(java.lang.String)
	*/
	public void setV_hbnr(String v_hbnr){
		this.V_HBNR=v_hbnr;
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