package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzJzqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_jzqk_b")
public class CrpasSqjzJzqkBVO {
	/**
	* PK_SQJZ_H 社区矫正主表_主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="char",dataLength=20,nullAble="N",comment="社区矫正主表_主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
	/**
	* PK_SQJZ_QZQK_B 子表主键
	*/
	@Column(columnName="pk_sqjz_qzqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SQJZ_QZQK_B = "pk_sqjz_qzqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_JZDW 矫正单位
	*/
	@Column(columnName="c_jzdw",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正单位")
	private String C_JZDW = "c_jzdw";
	/**
	* V_JZDWMC 矫正单位名称
	*/
	@Column(columnName="v_jzdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正单位名称")
	private String V_JZDWMC = "v_jzdwmc";
	/**
	* V_XM 姓名
	*/
	@Column(columnName="v_xm",dataType="varchar",dataLength=50,nullAble="Y",comment="姓名")
	private String V_XM = "v_xm";
	/**
	* V_JG 籍贯
	*/
	@Column(columnName="v_jg",dataType="varchar",dataLength=50,nullAble="Y",comment="籍贯")
	private String V_JG = "v_jg";
	/**
	* C_XB 性别
	*/
	@Column(columnName="c_xb",dataType="varchar",dataLength=50,nullAble="Y",comment="性别")
	private String C_XB = "c_xb";
	/**
	* V_ZM 罪名
	*/
	@Column(columnName="v_zm",dataType="varchar",dataLength=50,nullAble="Y",comment="罪名")
	private String V_ZM = "v_zm";
	/**
	* C_ZJLX 矫正类型
	*/
	@Column(columnName="c_zjlx",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正类型")
	private String C_ZJLX = "c_zjlx";
	/**
	* V_JTZZ 家庭住址
	*/
	@Column(columnName="v_jtzz",dataType="varchar",dataLength=50,nullAble="Y",comment="家庭住址")
	private String V_JTZZ = "v_jtzz";
	/**
	* V_QKFX 情况分析
	*/
	@Column(columnName="v_qkfx",dataType="varchar",dataLength=2000,nullAble="Y",comment="情况分析")
	private String V_QKFX = "v_qkfx";
	/**
	* V_GZSL 工作思路
	*/
	@Column(columnName="v_gzsl",dataType="varchar",dataLength=2000,nullAble="Y",comment="工作思路")
	private String V_GZSL = "v_gzsl";
	/**
	* V_JZCS 矫正措施
	*/
	@Column(columnName="v_jzcs",dataType="varchar",dataLength=2000,nullAble="Y",comment="矫正措施")
	private String V_JZCS = "v_jzcs";
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
	* getPk_sqjz_qzqk_b(void) 
	*/
	public String getPk_sqjz_qzqk_b(){
		return this.PK_SQJZ_QZQK_B;
	}
	/**
	*setPk_sqjz_qzqk_b(java.lang.String)
	*/
	public void setPk_sqjz_qzqk_b(String pk_sqjz_qzqk_b){
		this.PK_SQJZ_QZQK_B=pk_sqjz_qzqk_b;
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
	* getC_jzdw(void) 
	*/
	public String getC_jzdw(){
		return this.C_JZDW;
	}
	/**
	*setC_jzdw(java.lang.String)
	*/
	public void setC_jzdw(String c_jzdw){
		this.C_JZDW=c_jzdw;
	}
	/**
	* getV_jzdwmc(void) 
	*/
	public String getV_jzdwmc(){
		return this.V_JZDWMC;
	}
	/**
	*setV_jzdwmc(java.lang.String)
	*/
	public void setV_jzdwmc(String v_jzdwmc){
		this.V_JZDWMC=v_jzdwmc;
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
	* getV_jg(void) 
	*/
	public String getV_jg(){
		return this.V_JG;
	}
	/**
	*setV_jg(java.lang.String)
	*/
	public void setV_jg(String v_jg){
		this.V_JG=v_jg;
	}
	/**
	* getC_xb(void) 
	*/
	public String getC_xb(){
		return this.C_XB;
	}
	/**
	*setC_xb(java.lang.String)
	*/
	public void setC_xb(String c_xb){
		this.C_XB=c_xb;
	}
	/**
	* getV_zm(void) 
	*/
	public String getV_zm(){
		return this.V_ZM;
	}
	/**
	*setV_zm(java.lang.String)
	*/
	public void setV_zm(String v_zm){
		this.V_ZM=v_zm;
	}
	/**
	* getC_zjlx(void) 
	*/
	public String getC_zjlx(){
		return this.C_ZJLX;
	}
	/**
	*setC_zjlx(java.lang.String)
	*/
	public void setC_zjlx(String c_zjlx){
		this.C_ZJLX=c_zjlx;
	}
	/**
	* getV_jtzz(void) 
	*/
	public String getV_jtzz(){
		return this.V_JTZZ;
	}
	/**
	*setV_jtzz(java.lang.String)
	*/
	public void setV_jtzz(String v_jtzz){
		this.V_JTZZ=v_jtzz;
	}
	/**
	* getV_qkfx(void) 
	*/
	public String getV_qkfx(){
		return this.V_QKFX;
	}
	/**
	*setV_qkfx(java.lang.String)
	*/
	public void setV_qkfx(String v_qkfx){
		this.V_QKFX=v_qkfx;
	}
	/**
	* getV_gzsl(void) 
	*/
	public String getV_gzsl(){
		return this.V_GZSL;
	}
	/**
	*setV_gzsl(java.lang.String)
	*/
	public void setV_gzsl(String v_gzsl){
		this.V_GZSL=v_gzsl;
	}
	/**
	* getV_jzcs(void) 
	*/
	public String getV_jzcs(){
		return this.V_JZCS;
	}
	/**
	*setV_jzcs(java.lang.String)
	*/
	public void setV_jzcs(String v_jzcs){
		this.V_JZCS=v_jzcs;
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