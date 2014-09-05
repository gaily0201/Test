package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzJxqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_jxqk_b")
public class CrpasSqjzJxqkBVO {
	/**
	* V_FYCBBM 法院承办部门
	*/
	@Column(columnName="v_fycbbm",dataType="varchar",dataLength=100,nullAble="Y",comment="法院承办部门")
	private String V_FYCBBM = "v_fycbbm";
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
	* V_SQDWMC 申请单位名称
	*/
	@Column(columnName="v_sqdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="申请单位名称")
	private String V_SQDWMC = "v_sqdwmc";
	/**
	* C_SJSPDW 市级审批单位
	*/
	@Column(columnName="c_sjspdw",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审批单位")
	private String C_SJSPDW = "c_sjspdw";
	/**
	* V_SJSPDWMC 市级审批单位名称
	*/
	@Column(columnName="v_sjspdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="市级审批单位名称")
	private String V_SJSPDWMC = "v_sjspdwmc";
	/**
	* C_CDFY 裁定法院
	*/
	@Column(columnName="c_cdfy",dataType="varchar",dataLength=20,nullAble="Y",comment="裁定法院")
	private String C_CDFY = "c_cdfy";
	/**
	* V_FYCBR 法院承办人
	*/
	@Column(columnName="v_fycbr",dataType="varchar",dataLength=100,nullAble="Y",comment="法院承办人")
	private String V_FYCBR = "v_fycbr";
	/**
	* D_CDRQ 裁定日期
	*/
	@Column(columnName="d_cdrq",dataType="char",dataLength=19,nullAble="Y",comment="裁定日期")
	private String D_CDRQ = "d_cdrq";
	/**
	* C_CDJG 裁定结果
	*/
	@Column(columnName="c_cdjg",dataType="varchar",dataLength=20,nullAble="Y",comment="裁定结果")
	private String C_CDJG = "c_cdjg";
	/**
	* V_CDFYMC 裁定法院名称
	*/
	@Column(columnName="v_cdfymc",dataType="varchar",dataLength=100,nullAble="Y",comment="裁定法院名称")
	private String V_CDFYMC = "v_cdfymc";
	/**
	* PK_SQJZ_JXQK_B 子表主键
	*/
	@Column(columnName="pk_sqjz_jxqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SQJZ_JXQK_B = "pk_sqjz_jxqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_JXSQXX 减刑申请信息
	*/
	@Column(columnName="v_jxsqxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="减刑申请信息")
	private String V_JXSQXX = "v_jxsqxx";
	/**
	* C_JXSQR 减刑申请人
	*/
	@Column(columnName="c_jxsqr",dataType="varchar",dataLength=20,nullAble="Y",comment="减刑申请人")
	private String C_JXSQR = "c_jxsqr";
	/**
	* V_JXSQRXM 减刑申请人姓名
	*/
	@Column(columnName="v_jxsqrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="减刑申请人姓名")
	private String V_JXSQRXM = "v_jxsqrxm";
	/**
	* D_JXSQRQ 减刑申请日期
	*/
	@Column(columnName="d_jxsqrq",dataType="char",dataLength=19,nullAble="Y",comment="减刑申请日期")
	private String D_JXSQRQ = "d_jxsqrq";
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
	* C_SJSPJG 市级审批结果
	*/
	@Column(columnName="c_sjspjg",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审批结果")
	private String C_SJSPJG = "c_sjspjg";
	/**
	* C_SJSPR 市级审批人
	*/
	@Column(columnName="c_sjspr",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审批人")
	private String C_SJSPR = "c_sjspr";
	/**
	* V_SJSPRXM 市级审批人姓名
	*/
	@Column(columnName="v_sjsprxm",dataType="varchar",dataLength=50,nullAble="Y",comment="市级审批人姓名")
	private String V_SJSPRXM = "v_sjsprxm";
	/**
	* D_SJSPRQ 市级审批日期
	*/
	@Column(columnName="d_sjsprq",dataType="char",dataLength=19,nullAble="Y",comment="市级审批日期")
	private String D_SJSPRQ = "d_sjsprq";
	/**
	* V_SJSPXX 市级审批信息
	*/
	@Column(columnName="v_sjspxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="市级审批信息")
	private String V_SJSPXX = "v_sjspxx";
	/**
	* V_FYCDXX 法院裁定信息
	*/
	@Column(columnName="v_fycdxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="法院裁定信息")
	private String V_FYCDXX = "v_fycdxx";
	/**
	* V_JZBH 矫正对象编号
	*/
	@Column(columnName="v_jzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正对象编号")
	private String V_JZBH = "v_jzbh";
	/**
	* PK_JXXT_H 减刑协同表主键
	*/
	@Column(columnName="pk_jxxt_h",dataType="char",dataLength=20,nullAble="Y",comment="减刑协同表主键")
	private String PK_JXXT_H = "pk_jxxt_h";
	/**
	* C_SQDW 申请单位
	*/
	@Column(columnName="c_sqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="申请单位")
	private String C_SQDW = "c_sqdw";
	/**
	* getV_fycbbm(void) 
	*/
	public String getV_fycbbm(){
		return this.V_FYCBBM;
	}
	/**
	*setV_fycbbm(java.lang.String)
	*/
	public void setV_fycbbm(String v_fycbbm){
		this.V_FYCBBM=v_fycbbm;
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
	* getC_sjspdw(void) 
	*/
	public String getC_sjspdw(){
		return this.C_SJSPDW;
	}
	/**
	*setC_sjspdw(java.lang.String)
	*/
	public void setC_sjspdw(String c_sjspdw){
		this.C_SJSPDW=c_sjspdw;
	}
	/**
	* getV_sjspdwmc(void) 
	*/
	public String getV_sjspdwmc(){
		return this.V_SJSPDWMC;
	}
	/**
	*setV_sjspdwmc(java.lang.String)
	*/
	public void setV_sjspdwmc(String v_sjspdwmc){
		this.V_SJSPDWMC=v_sjspdwmc;
	}
	/**
	* getC_cdfy(void) 
	*/
	public String getC_cdfy(){
		return this.C_CDFY;
	}
	/**
	*setC_cdfy(java.lang.String)
	*/
	public void setC_cdfy(String c_cdfy){
		this.C_CDFY=c_cdfy;
	}
	/**
	* getV_fycbr(void) 
	*/
	public String getV_fycbr(){
		return this.V_FYCBR;
	}
	/**
	*setV_fycbr(java.lang.String)
	*/
	public void setV_fycbr(String v_fycbr){
		this.V_FYCBR=v_fycbr;
	}
	/**
	* getD_cdrq(void) 
	*/
	public String getD_cdrq(){
		return this.D_CDRQ;
	}
	/**
	*setD_cdrq(java.lang.String)
	*/
	public void setD_cdrq(String d_cdrq){
		this.D_CDRQ=d_cdrq;
	}
	/**
	* getC_cdjg(void) 
	*/
	public String getC_cdjg(){
		return this.C_CDJG;
	}
	/**
	*setC_cdjg(java.lang.String)
	*/
	public void setC_cdjg(String c_cdjg){
		this.C_CDJG=c_cdjg;
	}
	/**
	* getV_cdfymc(void) 
	*/
	public String getV_cdfymc(){
		return this.V_CDFYMC;
	}
	/**
	*setV_cdfymc(java.lang.String)
	*/
	public void setV_cdfymc(String v_cdfymc){
		this.V_CDFYMC=v_cdfymc;
	}
	/**
	* getPk_sqjz_jxqk_b(void) 
	*/
	public String getPk_sqjz_jxqk_b(){
		return this.PK_SQJZ_JXQK_B;
	}
	/**
	*setPk_sqjz_jxqk_b(java.lang.String)
	*/
	public void setPk_sqjz_jxqk_b(String pk_sqjz_jxqk_b){
		this.PK_SQJZ_JXQK_B=pk_sqjz_jxqk_b;
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
	* getV_jxsqxx(void) 
	*/
	public String getV_jxsqxx(){
		return this.V_JXSQXX;
	}
	/**
	*setV_jxsqxx(java.lang.String)
	*/
	public void setV_jxsqxx(String v_jxsqxx){
		this.V_JXSQXX=v_jxsqxx;
	}
	/**
	* getC_jxsqr(void) 
	*/
	public String getC_jxsqr(){
		return this.C_JXSQR;
	}
	/**
	*setC_jxsqr(java.lang.String)
	*/
	public void setC_jxsqr(String c_jxsqr){
		this.C_JXSQR=c_jxsqr;
	}
	/**
	* getV_jxsqrxm(void) 
	*/
	public String getV_jxsqrxm(){
		return this.V_JXSQRXM;
	}
	/**
	*setV_jxsqrxm(java.lang.String)
	*/
	public void setV_jxsqrxm(String v_jxsqrxm){
		this.V_JXSQRXM=v_jxsqrxm;
	}
	/**
	* getD_jxsqrq(void) 
	*/
	public String getD_jxsqrq(){
		return this.D_JXSQRQ;
	}
	/**
	*setD_jxsqrq(java.lang.String)
	*/
	public void setD_jxsqrq(String d_jxsqrq){
		this.D_JXSQRQ=d_jxsqrq;
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
	* getC_sjspjg(void) 
	*/
	public String getC_sjspjg(){
		return this.C_SJSPJG;
	}
	/**
	*setC_sjspjg(java.lang.String)
	*/
	public void setC_sjspjg(String c_sjspjg){
		this.C_SJSPJG=c_sjspjg;
	}
	/**
	* getC_sjspr(void) 
	*/
	public String getC_sjspr(){
		return this.C_SJSPR;
	}
	/**
	*setC_sjspr(java.lang.String)
	*/
	public void setC_sjspr(String c_sjspr){
		this.C_SJSPR=c_sjspr;
	}
	/**
	* getV_sjsprxm(void) 
	*/
	public String getV_sjsprxm(){
		return this.V_SJSPRXM;
	}
	/**
	*setV_sjsprxm(java.lang.String)
	*/
	public void setV_sjsprxm(String v_sjsprxm){
		this.V_SJSPRXM=v_sjsprxm;
	}
	/**
	* getD_sjsprq(void) 
	*/
	public String getD_sjsprq(){
		return this.D_SJSPRQ;
	}
	/**
	*setD_sjsprq(java.lang.String)
	*/
	public void setD_sjsprq(String d_sjsprq){
		this.D_SJSPRQ=d_sjsprq;
	}
	/**
	* getV_sjspxx(void) 
	*/
	public String getV_sjspxx(){
		return this.V_SJSPXX;
	}
	/**
	*setV_sjspxx(java.lang.String)
	*/
	public void setV_sjspxx(String v_sjspxx){
		this.V_SJSPXX=v_sjspxx;
	}
	/**
	* getV_fycdxx(void) 
	*/
	public String getV_fycdxx(){
		return this.V_FYCDXX;
	}
	/**
	*setV_fycdxx(java.lang.String)
	*/
	public void setV_fycdxx(String v_fycdxx){
		this.V_FYCDXX=v_fycdxx;
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
	* getPk_jxxt_h(void) 
	*/
	public String getPk_jxxt_h(){
		return this.PK_JXXT_H;
	}
	/**
	*setPk_jxxt_h(java.lang.String)
	*/
	public void setPk_jxxt_h(String pk_jxxt_h){
		this.PK_JXXT_H=pk_jxxt_h;
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


}