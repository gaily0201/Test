package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGsSxycBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gs_sxyc_b")
public class CrpasGsSxycBVO {
	/**
	* PK_GS_SXYC_B 子表主键
	*/
	@Column(columnName="pk_gs_sxyc_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GS_SXYC_B = "pk_gs_sxyc_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_YCYY 延长原因
	*/
	@Column(columnName="v_ycyy",dataType="varchar",dataLength=20,nullAble="Y",comment="延长原因")
	private String V_YCYY = "v_ycyy";
	/**
	* D_SQRQ 申请日期
	*/
	@Column(columnName="d_sqrq",dataType="char",dataLength=19,nullAble="Y",comment="申请日期")
	private String D_SQRQ = "d_sqrq";
	/**
	* C_PZJG 批准机关
	*/
	@Column(columnName="c_pzjg",dataType="varchar",dataLength=20,nullAble="Y",comment="批准机关")
	private String C_PZJG = "c_pzjg";
	/**
	* V_PZJGMC 批准机关名称
	*/
	@Column(columnName="v_pzjgmc",dataType="varchar",dataLength=200,nullAble="Y",comment="批准机关名称")
	private String V_PZJGMC = "v_pzjgmc";
	/**
	* D_PZRQ 批准日期
	*/
	@Column(columnName="d_pzrq",dataType="char",dataLength=19,nullAble="Y",comment="批准日期")
	private String D_PZRQ = "d_pzrq";
	/**
	* D_KSRQ 开始日期
	*/
	@Column(columnName="d_ksrq",dataType="char",dataLength=19,nullAble="Y",comment="开始日期")
	private String D_KSRQ = "d_ksrq";
	/**
	* V_YCQJ 延长期间
	*/
	@Column(columnName="v_ycqj",dataType="varchar",dataLength=20,nullAble="Y",comment="延长期间")
	private String V_YCQJ = "v_ycqj";
	/**
	* V_XGWS 相关文书
	*/
	@Column(columnName="v_xgws",dataType="varchar",dataLength=200,nullAble="Y",comment="相关文书")
	private String V_XGWS = "v_xgws";
	/**
	* PK_GS_H 公诉信息主表_主键
	*/
	@Column(columnName="pk_gs_h",dataType="char",dataLength=20,nullAble="N",comment="公诉信息主表_主键")
	private String PK_GS_H = "pk_gs_h";
	/**
	* getPk_gs_sxyc_b(void) 
	*/
	public String getPk_gs_sxyc_b(){
		return this.PK_GS_SXYC_B;
	}
	/**
	*setPk_gs_sxyc_b(java.lang.String)
	*/
	public void setPk_gs_sxyc_b(String pk_gs_sxyc_b){
		this.PK_GS_SXYC_B=pk_gs_sxyc_b;
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
	* getV_ycyy(void) 
	*/
	public String getV_ycyy(){
		return this.V_YCYY;
	}
	/**
	*setV_ycyy(java.lang.String)
	*/
	public void setV_ycyy(String v_ycyy){
		this.V_YCYY=v_ycyy;
	}
	/**
	* getD_sqrq(void) 
	*/
	public String getD_sqrq(){
		return this.D_SQRQ;
	}
	/**
	*setD_sqrq(java.lang.String)
	*/
	public void setD_sqrq(String d_sqrq){
		this.D_SQRQ=d_sqrq;
	}
	/**
	* getC_pzjg(void) 
	*/
	public String getC_pzjg(){
		return this.C_PZJG;
	}
	/**
	*setC_pzjg(java.lang.String)
	*/
	public void setC_pzjg(String c_pzjg){
		this.C_PZJG=c_pzjg;
	}
	/**
	* getV_pzjgmc(void) 
	*/
	public String getV_pzjgmc(){
		return this.V_PZJGMC;
	}
	/**
	*setV_pzjgmc(java.lang.String)
	*/
	public void setV_pzjgmc(String v_pzjgmc){
		this.V_PZJGMC=v_pzjgmc;
	}
	/**
	* getD_pzrq(void) 
	*/
	public String getD_pzrq(){
		return this.D_PZRQ;
	}
	/**
	*setD_pzrq(java.lang.String)
	*/
	public void setD_pzrq(String d_pzrq){
		this.D_PZRQ=d_pzrq;
	}
	/**
	* getD_ksrq(void) 
	*/
	public String getD_ksrq(){
		return this.D_KSRQ;
	}
	/**
	*setD_ksrq(java.lang.String)
	*/
	public void setD_ksrq(String d_ksrq){
		this.D_KSRQ=d_ksrq;
	}
	/**
	* getV_ycqj(void) 
	*/
	public String getV_ycqj(){
		return this.V_YCQJ;
	}
	/**
	*setV_ycqj(java.lang.String)
	*/
	public void setV_ycqj(String v_ycqj){
		this.V_YCQJ=v_ycqj;
	}
	/**
	* getV_xgws(void) 
	*/
	public String getV_xgws(){
		return this.V_XGWS;
	}
	/**
	*setV_xgws(java.lang.String)
	*/
	public void setV_xgws(String v_xgws){
		this.V_XGWS=v_xgws;
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