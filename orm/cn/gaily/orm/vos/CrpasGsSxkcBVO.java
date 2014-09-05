package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGsSxkcBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gs_sxkc_b")
public class CrpasGsSxkcBVO {
	/**
	* PK_GS_SXKC_B 子表主键
	*/
	@Column(columnName="pk_gs_sxkc_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GS_SXKC_B = "pk_gs_sxkc_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_KCLX 扣除类型
	*/
	@Column(columnName="c_kclx",dataType="varchar",dataLength=20,nullAble="Y",comment="扣除类型")
	private String C_KCLX = "c_kclx";
	/**
	* V_ZZSY 中止事由
	*/
	@Column(columnName="v_zzsy",dataType="varchar",dataLength=20,nullAble="Y",comment="中止事由")
	private String V_ZZSY = "v_zzsy";
	/**
	* V_YCSLSY 延期审理事由
	*/
	@Column(columnName="v_ycslsy",dataType="varchar",dataLength=20,nullAble="Y",comment="延期审理事由")
	private String V_YCSLSY = "v_ycslsy";
	/**
	* V_QTSY 其他事由
	*/
	@Column(columnName="v_qtsy",dataType="varchar",dataLength=20,nullAble="Y",comment="其他事由")
	private String V_QTSY = "v_qtsy";
	/**
	* D_QSRQ 起始日期
	*/
	@Column(columnName="d_qsrq",dataType="char",dataLength=19,nullAble="Y",comment="起始日期")
	private String D_QSRQ = "d_qsrq";
	/**
	* D_JSRQ 结束日期
	*/
	@Column(columnName="d_jsrq",dataType="char",dataLength=19,nullAble="Y",comment="结束日期")
	private String D_JSRQ = "d_jsrq";
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
	* getPk_gs_sxkc_b(void) 
	*/
	public String getPk_gs_sxkc_b(){
		return this.PK_GS_SXKC_B;
	}
	/**
	*setPk_gs_sxkc_b(java.lang.String)
	*/
	public void setPk_gs_sxkc_b(String pk_gs_sxkc_b){
		this.PK_GS_SXKC_B=pk_gs_sxkc_b;
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
	* getC_kclx(void) 
	*/
	public String getC_kclx(){
		return this.C_KCLX;
	}
	/**
	*setC_kclx(java.lang.String)
	*/
	public void setC_kclx(String c_kclx){
		this.C_KCLX=c_kclx;
	}
	/**
	* getV_zzsy(void) 
	*/
	public String getV_zzsy(){
		return this.V_ZZSY;
	}
	/**
	*setV_zzsy(java.lang.String)
	*/
	public void setV_zzsy(String v_zzsy){
		this.V_ZZSY=v_zzsy;
	}
	/**
	* getV_ycslsy(void) 
	*/
	public String getV_ycslsy(){
		return this.V_YCSLSY;
	}
	/**
	*setV_ycslsy(java.lang.String)
	*/
	public void setV_ycslsy(String v_ycslsy){
		this.V_YCSLSY=v_ycslsy;
	}
	/**
	* getV_qtsy(void) 
	*/
	public String getV_qtsy(){
		return this.V_QTSY;
	}
	/**
	*setV_qtsy(java.lang.String)
	*/
	public void setV_qtsy(String v_qtsy){
		this.V_QTSY=v_qtsy;
	}
	/**
	* getD_qsrq(void) 
	*/
	public String getD_qsrq(){
		return this.D_QSRQ;
	}
	/**
	*setD_qsrq(java.lang.String)
	*/
	public void setD_qsrq(String d_qsrq){
		this.D_QSRQ=d_qsrq;
	}
	/**
	* getD_jsrq(void) 
	*/
	public String getD_jsrq(){
		return this.D_JSRQ;
	}
	/**
	*setD_jsrq(java.lang.String)
	*/
	public void setD_jsrq(String d_jsrq){
		this.D_JSRQ=d_jsrq;
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