package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzZacfqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_zacfqk_b")
public class CrpasSqjzZacfqkBVO {
	/**
	* PK_SQJZ_ZACFQK_B 子表主键
	*/
	@Column(columnName="pk_sqjz_zacfqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SQJZ_ZACFQK_B = "pk_sqjz_zacfqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_ZACFSQXX 治安处罚申请信息
	*/
	@Column(columnName="v_zacfsqxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="治安处罚申请信息")
	private String V_ZACFSQXX = "v_zacfsqxx";
	/**
	* C_ZACFSQR 治安处罚申请人
	*/
	@Column(columnName="c_zacfsqr",dataType="varchar",dataLength=20,nullAble="Y",comment="治安处罚申请人")
	private String C_ZACFSQR = "c_zacfsqr";
	/**
	* V_ZACFSQXM 治安处罚申请人姓名
	*/
	@Column(columnName="v_zacfsqxm",dataType="varchar",dataLength=50,nullAble="Y",comment="治安处罚申请人姓名")
	private String V_ZACFSQXM = "v_zacfsqxm";
	/**
	* D_ZACFSQRQ 治安处罚申请日期
	*/
	@Column(columnName="d_zacfsqrq",dataType="char",dataLength=19,nullAble="Y",comment="治安处罚申请日期")
	private String D_ZACFSQRQ = "d_zacfsqrq";
	/**
	* C_QXSPJG 区县审批结果
	*/
	@Column(columnName="c_qxspjg",dataType="varchar",dataLength=50,nullAble="Y",comment="区县审批结果")
	private String C_QXSPJG = "c_qxspjg";
	/**
	* C_QXSPR 区县审批人
	*/
	@Column(columnName="c_qxspr",dataType="varchar",dataLength=20,nullAble="Y",comment="区县审批人")
	private String C_QXSPR = "c_qxspr";
	/**
	* V_QXSPRXM 区县审批人姓名
	*/
	@Column(columnName="v_qxsprxm",dataType="varchar",dataLength=50,nullAble="Y",comment="区县审批人姓名")
	private String V_QXSPRXM = "v_qxsprxm";
	/**
	* D_QXSPRQ 区县审批日期
	*/
	@Column(columnName="d_qxsprq",dataType="char",dataLength=19,nullAble="Y",comment="区县审批日期")
	private String D_QXSPRQ = "d_qxsprq";
	/**
	* V_QXSPXX 区县审批信息
	*/
	@Column(columnName="v_qxspxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="区县审批信息")
	private String V_QXSPXX = "v_qxspxx";
	/**
	* V_ZACFXX 治安处罚信息
	*/
	@Column(columnName="v_zacfxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="治安处罚信息")
	private String V_ZACFXX = "v_zacfxx";
	/**
	* V_JZBH 矫正对象编号
	*/
	@Column(columnName="v_jzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正对象编号")
	private String V_JZBH = "v_jzbh";
	/**
	* PK_ZACFXT_H 治安处罚协同主键
	*/
	@Column(columnName="pk_zacfxt_h",dataType="varchar",dataLength=50,nullAble="Y",comment="治安处罚协同主键")
	private String PK_ZACFXT_H = "pk_zacfxt_h";
	/**
	* C_SQDW 治安处罚申请单位
	*/
	@Column(columnName="c_sqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="治安处罚申请单位")
	private String C_SQDW = "c_sqdw";
	/**
	* V_SQDWMC 治安处罚申请单位名称
	*/
	@Column(columnName="v_sqdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="治安处罚申请单位名称")
	private String V_SQDWMC = "v_sqdwmc";
	/**
	* V_GAJBH 公安局编号
	*/
	@Column(columnName="v_gajbh",dataType="varchar",dataLength=100,nullAble="Y",comment="公安局编号")
	private String V_GAJBH = "v_gajbh";
	/**
	* V_GAJMC 公安局
	*/
	@Column(columnName="v_gajmc",dataType="varchar",dataLength=100,nullAble="Y",comment="公安局")
	private String V_GAJMC = "v_gajmc";
	/**
	* V_GAJZXR 公安执行人
	*/
	@Column(columnName="v_gajzxr",dataType="varchar",dataLength=100,nullAble="Y",comment="公安执行人")
	private String V_GAJZXR = "v_gajzxr";
	/**
	* D_GASJRQ 公安执行日期
	*/
	@Column(columnName="d_gasjrq",dataType="char",dataLength=19,nullAble="Y",comment="公安执行日期")
	private String D_GASJRQ = "d_gasjrq";
	/**
	* V_QXSPDWMC 区县审批单位名称
	*/
	@Column(columnName="v_qxspdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="区县审批单位名称")
	private String V_QXSPDWMC = "v_qxspdwmc";
	/**
	* C_QXSPDW 区县审批单位
	*/
	@Column(columnName="c_qxspdw",dataType="varchar",dataLength=20,nullAble="Y",comment="区县审批单位")
	private String C_QXSPDW = "c_qxspdw";
	/**
	* PK_SQJZ_H 社区矫正主表_主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="char",dataLength=20,nullAble="N",comment="社区矫正主表_主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
	/**
	* getPk_sqjz_zacfqk_b(void) 
	*/
	public String getPk_sqjz_zacfqk_b(){
		return this.PK_SQJZ_ZACFQK_B;
	}
	/**
	*setPk_sqjz_zacfqk_b(java.lang.String)
	*/
	public void setPk_sqjz_zacfqk_b(String pk_sqjz_zacfqk_b){
		this.PK_SQJZ_ZACFQK_B=pk_sqjz_zacfqk_b;
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
	* getV_zacfsqxx(void) 
	*/
	public String getV_zacfsqxx(){
		return this.V_ZACFSQXX;
	}
	/**
	*setV_zacfsqxx(java.lang.String)
	*/
	public void setV_zacfsqxx(String v_zacfsqxx){
		this.V_ZACFSQXX=v_zacfsqxx;
	}
	/**
	* getC_zacfsqr(void) 
	*/
	public String getC_zacfsqr(){
		return this.C_ZACFSQR;
	}
	/**
	*setC_zacfsqr(java.lang.String)
	*/
	public void setC_zacfsqr(String c_zacfsqr){
		this.C_ZACFSQR=c_zacfsqr;
	}
	/**
	* getV_zacfsqxm(void) 
	*/
	public String getV_zacfsqxm(){
		return this.V_ZACFSQXM;
	}
	/**
	*setV_zacfsqxm(java.lang.String)
	*/
	public void setV_zacfsqxm(String v_zacfsqxm){
		this.V_ZACFSQXM=v_zacfsqxm;
	}
	/**
	* getD_zacfsqrq(void) 
	*/
	public String getD_zacfsqrq(){
		return this.D_ZACFSQRQ;
	}
	/**
	*setD_zacfsqrq(java.lang.String)
	*/
	public void setD_zacfsqrq(String d_zacfsqrq){
		this.D_ZACFSQRQ=d_zacfsqrq;
	}
	/**
	* getC_qxspjg(void) 
	*/
	public String getC_qxspjg(){
		return this.C_QXSPJG;
	}
	/**
	*setC_qxspjg(java.lang.String)
	*/
	public void setC_qxspjg(String c_qxspjg){
		this.C_QXSPJG=c_qxspjg;
	}
	/**
	* getC_qxspr(void) 
	*/
	public String getC_qxspr(){
		return this.C_QXSPR;
	}
	/**
	*setC_qxspr(java.lang.String)
	*/
	public void setC_qxspr(String c_qxspr){
		this.C_QXSPR=c_qxspr;
	}
	/**
	* getV_qxsprxm(void) 
	*/
	public String getV_qxsprxm(){
		return this.V_QXSPRXM;
	}
	/**
	*setV_qxsprxm(java.lang.String)
	*/
	public void setV_qxsprxm(String v_qxsprxm){
		this.V_QXSPRXM=v_qxsprxm;
	}
	/**
	* getD_qxsprq(void) 
	*/
	public String getD_qxsprq(){
		return this.D_QXSPRQ;
	}
	/**
	*setD_qxsprq(java.lang.String)
	*/
	public void setD_qxsprq(String d_qxsprq){
		this.D_QXSPRQ=d_qxsprq;
	}
	/**
	* getV_qxspxx(void) 
	*/
	public String getV_qxspxx(){
		return this.V_QXSPXX;
	}
	/**
	*setV_qxspxx(java.lang.String)
	*/
	public void setV_qxspxx(String v_qxspxx){
		this.V_QXSPXX=v_qxspxx;
	}
	/**
	* getV_zacfxx(void) 
	*/
	public String getV_zacfxx(){
		return this.V_ZACFXX;
	}
	/**
	*setV_zacfxx(java.lang.String)
	*/
	public void setV_zacfxx(String v_zacfxx){
		this.V_ZACFXX=v_zacfxx;
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
	/**
	* getPk_zacfxt_h(void) 
	*/
	public String getPk_zacfxt_h(){
		return this.PK_ZACFXT_H;
	}
	/**
	*setPk_zacfxt_h(java.lang.String)
	*/
	public void setPk_zacfxt_h(String pk_zacfxt_h){
		this.PK_ZACFXT_H=pk_zacfxt_h;
	}
	/**
	* getC_sqdw(void) 
	*/
	public String getC_sqdw(){
		return this.C_SQDW;
	}
	/**
	*setC_sqdw(java.lang.String)
	*/
	public void setC_sqdw(String c_sqdw){
		this.C_SQDW=c_sqdw;
	}
	/**
	* getV_sqdwmc(void) 
	*/
	public String getV_sqdwmc(){
		return this.V_SQDWMC;
	}
	/**
	*setV_sqdwmc(java.lang.String)
	*/
	public void setV_sqdwmc(String v_sqdwmc){
		this.V_SQDWMC=v_sqdwmc;
	}
	/**
	* getV_gajbh(void) 
	*/
	public String getV_gajbh(){
		return this.V_GAJBH;
	}
	/**
	*setV_gajbh(java.lang.String)
	*/
	public void setV_gajbh(String v_gajbh){
		this.V_GAJBH=v_gajbh;
	}
	/**
	* getV_gajmc(void) 
	*/
	public String getV_gajmc(){
		return this.V_GAJMC;
	}
	/**
	*setV_gajmc(java.lang.String)
	*/
	public void setV_gajmc(String v_gajmc){
		this.V_GAJMC=v_gajmc;
	}
	/**
	* getV_gajzxr(void) 
	*/
	public String getV_gajzxr(){
		return this.V_GAJZXR;
	}
	/**
	*setV_gajzxr(java.lang.String)
	*/
	public void setV_gajzxr(String v_gajzxr){
		this.V_GAJZXR=v_gajzxr;
	}
	/**
	* getD_gasjrq(void) 
	*/
	public String getD_gasjrq(){
		return this.D_GASJRQ;
	}
	/**
	*setD_gasjrq(java.lang.String)
	*/
	public void setD_gasjrq(String d_gasjrq){
		this.D_GASJRQ=d_gasjrq;
	}
	/**
	* getV_qxspdwmc(void) 
	*/
	public String getV_qxspdwmc(){
		return this.V_QXSPDWMC;
	}
	/**
	*setV_qxspdwmc(java.lang.String)
	*/
	public void setV_qxspdwmc(String v_qxspdwmc){
		this.V_QXSPDWMC=v_qxspdwmc;
	}
	/**
	* getC_qxspdw(void) 
	*/
	public String getC_qxspdw(){
		return this.C_QXSPDW;
	}
	/**
	*setC_qxspdw(java.lang.String)
	*/
	public void setC_qxspdw(String c_qxspdw){
		this.C_QXSPDW=c_qxspdw;
	}
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


}