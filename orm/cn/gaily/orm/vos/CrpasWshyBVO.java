package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasWshyBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_wshy_b")
public class CrpasWshyBVO {
	/**
	* PK_WSHY_B 子表主键
	*/
	@Column(columnName="pk_wshy_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_WSHY_B = "pk_wshy_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_WSBH 文书文号
	*/
	@Column(columnName="v_wsbh",dataType="varchar",dataLength=50,nullAble="Y",comment="文书文号")
	private String V_WSBH = "v_wsbh";
	/**
	* C_HYBM 换押部门
	*/
	@Column(columnName="c_hybm",dataType="char",dataLength=20,nullAble="Y",comment="换押部门")
	private String C_HYBM = "c_hybm";
	/**
	* V_HYBMMC 换押部门名称
	*/
	@Column(columnName="v_hybmmc",dataType="varchar",dataLength=50,nullAble="Y",comment="换押部门名称")
	private String V_HYBMMC = "v_hybmmc";
	/**
	* D_HYRQ 换押日期
	*/
	@Column(columnName="d_hyrq",dataType="char",dataLength=19,nullAble="Y",comment="换押日期")
	private String D_HYRQ = "d_hyrq";
	/**
	* T_HYSJ 换押时间
	*/
	@Column(columnName="t_hysj",dataType="char",dataLength=19,nullAble="Y",comment="换押时间")
	private String T_HYSJ = "t_hysj";
	/**
	* V_HYYY 换押原因
	*/
	@Column(columnName="v_hyyy",dataType="varchar",dataLength=50,nullAble="Y",comment="换押原因")
	private String V_HYYY = "v_hyyy";
	/**
	* C_HYLX 换押类型
	*/
	@Column(columnName="c_hylx",dataType="varchar",dataLength=20,nullAble="Y",comment="换押类型")
	private String C_HYLX = "c_hylx";
	/**
	* C_HYZT 换押状态
	*/
	@Column(columnName="c_hyzt",dataType="varchar",dataLength=20,nullAble="Y",comment="换押状态")
	private String C_HYZT = "c_hyzt";
	/**
	* D_JSRQ 接收日期
	*/
	@Column(columnName="d_jsrq",dataType="char",dataLength=19,nullAble="Y",comment="接收日期")
	private String D_JSRQ = "d_jsrq";
	/**
	* C_YCJYLY 延长羁押理由
	*/
	@Column(columnName="c_ycjyly",dataType="varchar",dataLength=20,nullAble="Y",comment="延长羁押理由")
	private String C_YCJYLY = "c_ycjyly";
	/**
	* T_YCSJ 延长时间
	*/
	@Column(columnName="t_ycsj",dataType="varchar",dataLength=50,nullAble="Y",comment="延长时间")
	private String T_YCSJ = "t_ycsj";
	/**
	* C_JSR 接收人
	*/
	@Column(columnName="c_jsr",dataType="char",dataLength=20,nullAble="Y",comment="接收人")
	private String C_JSR = "c_jsr";
	/**
	* V_JSRXM 接收人姓名
	*/
	@Column(columnName="v_jsrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="接收人姓名")
	private String V_JSRXM = "v_jsrxm";
	/**
	* C_CZR 操作人
	*/
	@Column(columnName="c_czr",dataType="char",dataLength=20,nullAble="Y",comment="操作人")
	private String C_CZR = "c_czr";
	/**
	* V_CZRXM 操作人姓名
	*/
	@Column(columnName="v_czrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="操作人姓名")
	private String V_CZRXM = "v_czrxm";
	/**
	* C_CZBM 操作部门
	*/
	@Column(columnName="c_czbm",dataType="char",dataLength=20,nullAble="Y",comment="操作部门")
	private String C_CZBM = "c_czbm";
	/**
	* V_CZBMMC 操作部门名称
	*/
	@Column(columnName="v_czbmmc",dataType="varchar",dataLength=50,nullAble="Y",comment="操作部门名称")
	private String V_CZBMMC = "v_czbmmc";
	/**
	* V_GYQX 关押期限（办案期限）
	*/
	@Column(columnName="v_gyqx",dataType="varchar",dataLength=50,nullAble="Y",comment="关押期限（办案期限）")
	private String V_GYQX = "v_gyqx";
	/**
	* V_TAR 同案人
	*/
	@Column(columnName="v_tar",dataType="varchar",dataLength=50,nullAble="Y",comment="同案人")
	private String V_TAR = "v_tar";
	/**
	* PK_HYXT_H 换押协同主键
	*/
	@Column(columnName="pk_hyxt_h",dataType="char",dataLength=20,nullAble="Y",comment="换押协同主键")
	private String PK_HYXT_H = "pk_hyxt_h";
	/**
	* C_YSDW 移送单位
	*/
	@Column(columnName="c_ysdw",dataType="varchar",dataLength=20,nullAble="Y",comment="移送单位")
	private String C_YSDW = "c_ysdw";
	/**
	* C_YSDWMC 移送单位名称
	*/
	@Column(columnName="c_ysdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="移送单位名称")
	private String C_YSDWMC = "c_ysdwmc";
	/**
	* C_JSDW 接收单位
	*/
	@Column(columnName="c_jsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="接收单位")
	private String C_JSDW = "c_jsdw";
	/**
	* C_JSDWMC 接收单位名称
	*/
	@Column(columnName="c_jsdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="接收单位名称")
	private String C_JSDWMC = "c_jsdwmc";
	/**
	* PK_WSHY_H 网上换押主表_主键
	*/
	@Column(columnName="pk_wshy_h",dataType="char",dataLength=20,nullAble="N",comment="网上换押主表_主键")
	private String PK_WSHY_H = "pk_wshy_h";
	/**
	* getPk_wshy_b(void) 
	*/
	public String getPk_wshy_b(){
		return this.PK_WSHY_B;
	}
	/**
	*setPk_wshy_b(java.lang.String)
	*/
	public void setPk_wshy_b(String pk_wshy_b){
		this.PK_WSHY_B=pk_wshy_b;
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
	* getV_wsbh(void) 
	*/
	public String getV_wsbh(){
		return this.V_WSBH;
	}
	/**
	*setV_wsbh(java.lang.String)
	*/
	public void setV_wsbh(String v_wsbh){
		this.V_WSBH=v_wsbh;
	}
	/**
	* getC_hybm(void) 
	*/
	public String getC_hybm(){
		return this.C_HYBM;
	}
	/**
	*setC_hybm(java.lang.String)
	*/
	public void setC_hybm(String c_hybm){
		this.C_HYBM=c_hybm;
	}
	/**
	* getV_hybmmc(void) 
	*/
	public String getV_hybmmc(){
		return this.V_HYBMMC;
	}
	/**
	*setV_hybmmc(java.lang.String)
	*/
	public void setV_hybmmc(String v_hybmmc){
		this.V_HYBMMC=v_hybmmc;
	}
	/**
	* getD_hyrq(void) 
	*/
	public String getD_hyrq(){
		return this.D_HYRQ;
	}
	/**
	*setD_hyrq(java.lang.String)
	*/
	public void setD_hyrq(String d_hyrq){
		this.D_HYRQ=d_hyrq;
	}
	/**
	* getT_hysj(void) 
	*/
	public String getT_hysj(){
		return this.T_HYSJ;
	}
	/**
	*setT_hysj(java.lang.String)
	*/
	public void setT_hysj(String t_hysj){
		this.T_HYSJ=t_hysj;
	}
	/**
	* getV_hyyy(void) 
	*/
	public String getV_hyyy(){
		return this.V_HYYY;
	}
	/**
	*setV_hyyy(java.lang.String)
	*/
	public void setV_hyyy(String v_hyyy){
		this.V_HYYY=v_hyyy;
	}
	/**
	* getC_hylx(void) 
	*/
	public String getC_hylx(){
		return this.C_HYLX;
	}
	/**
	*setC_hylx(java.lang.String)
	*/
	public void setC_hylx(String c_hylx){
		this.C_HYLX=c_hylx;
	}
	/**
	* getC_hyzt(void) 
	*/
	public String getC_hyzt(){
		return this.C_HYZT;
	}
	/**
	*setC_hyzt(java.lang.String)
	*/
	public void setC_hyzt(String c_hyzt){
		this.C_HYZT=c_hyzt;
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
	* getC_ycjyly(void) 
	*/
	public String getC_ycjyly(){
		return this.C_YCJYLY;
	}
	/**
	*setC_ycjyly(java.lang.String)
	*/
	public void setC_ycjyly(String c_ycjyly){
		this.C_YCJYLY=c_ycjyly;
	}
	/**
	* getT_ycsj(void) 
	*/
	public String getT_ycsj(){
		return this.T_YCSJ;
	}
	/**
	*setT_ycsj(java.lang.String)
	*/
	public void setT_ycsj(String t_ycsj){
		this.T_YCSJ=t_ycsj;
	}
	/**
	* getC_jsr(void) 
	*/
	public String getC_jsr(){
		return this.C_JSR;
	}
	/**
	*setC_jsr(java.lang.String)
	*/
	public void setC_jsr(String c_jsr){
		this.C_JSR=c_jsr;
	}
	/**
	* getV_jsrxm(void) 
	*/
	public String getV_jsrxm(){
		return this.V_JSRXM;
	}
	/**
	*setV_jsrxm(java.lang.String)
	*/
	public void setV_jsrxm(String v_jsrxm){
		this.V_JSRXM=v_jsrxm;
	}
	/**
	* getC_czr(void) 
	*/
	public String getC_czr(){
		return this.C_CZR;
	}
	/**
	*setC_czr(java.lang.String)
	*/
	public void setC_czr(String c_czr){
		this.C_CZR=c_czr;
	}
	/**
	* getV_czrxm(void) 
	*/
	public String getV_czrxm(){
		return this.V_CZRXM;
	}
	/**
	*setV_czrxm(java.lang.String)
	*/
	public void setV_czrxm(String v_czrxm){
		this.V_CZRXM=v_czrxm;
	}
	/**
	* getC_czbm(void) 
	*/
	public String getC_czbm(){
		return this.C_CZBM;
	}
	/**
	*setC_czbm(java.lang.String)
	*/
	public void setC_czbm(String c_czbm){
		this.C_CZBM=c_czbm;
	}
	/**
	* getV_czbmmc(void) 
	*/
	public String getV_czbmmc(){
		return this.V_CZBMMC;
	}
	/**
	*setV_czbmmc(java.lang.String)
	*/
	public void setV_czbmmc(String v_czbmmc){
		this.V_CZBMMC=v_czbmmc;
	}
	/**
	* getV_gyqx(void) 
	*/
	public String getV_gyqx(){
		return this.V_GYQX;
	}
	/**
	*setV_gyqx(java.lang.String)
	*/
	public void setV_gyqx(String v_gyqx){
		this.V_GYQX=v_gyqx;
	}
	/**
	* getV_tar(void) 
	*/
	public String getV_tar(){
		return this.V_TAR;
	}
	/**
	*setV_tar(java.lang.String)
	*/
	public void setV_tar(String v_tar){
		this.V_TAR=v_tar;
	}
	/**
	* getPk_hyxt_h(void) 
	*/
	public String getPk_hyxt_h(){
		return this.PK_HYXT_H;
	}
	/**
	*setPk_hyxt_h(java.lang.String)
	*/
	public void setPk_hyxt_h(String pk_hyxt_h){
		this.PK_HYXT_H=pk_hyxt_h;
	}
	/**
	* getC_ysdw(void) 
	*/
	public String getC_ysdw(){
		return this.C_YSDW;
	}
	/**
	*setC_ysdw(java.lang.String)
	*/
	public void setC_ysdw(String c_ysdw){
		this.C_YSDW=c_ysdw;
	}
	/**
	* getC_ysdwmc(void) 
	*/
	public String getC_ysdwmc(){
		return this.C_YSDWMC;
	}
	/**
	*setC_ysdwmc(java.lang.String)
	*/
	public void setC_ysdwmc(String c_ysdwmc){
		this.C_YSDWMC=c_ysdwmc;
	}
	/**
	* getC_jsdw(void) 
	*/
	public String getC_jsdw(){
		return this.C_JSDW;
	}
	/**
	*setC_jsdw(java.lang.String)
	*/
	public void setC_jsdw(String c_jsdw){
		this.C_JSDW=c_jsdw;
	}
	/**
	* getC_jsdwmc(void) 
	*/
	public String getC_jsdwmc(){
		return this.C_JSDWMC;
	}
	/**
	*setC_jsdwmc(java.lang.String)
	*/
	public void setC_jsdwmc(String c_jsdwmc){
		this.C_JSDWMC=c_jsdwmc;
	}
	/**
	* getPk_wshy_h(void) 
	*/
	public String getPk_wshy_h(){
		return this.PK_WSHY_H;
	}
	/**
	*setPk_wshy_h(java.lang.String)
	*/
	public void setPk_wshy_h(String pk_wshy_h){
		this.PK_WSHY_H=pk_wshy_h;
	}


}