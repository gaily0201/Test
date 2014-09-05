package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasBaosuBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_baosu_b")
public class CrpasBaosuBVO {
	/**
	* PK_BAOSU_B 子表主键
	*/
	@Column(columnName="pk_baosu_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_BAOSU_B = "pk_baosu_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_XYR 嫌疑人id
	*/
	@Column(columnName="c_xyr",dataType="char",dataLength=20,nullAble="Y",comment="嫌疑人id")
	private String C_XYR = "c_xyr";
	/**
	* V_XYRXM 嫌疑人姓名
	*/
	@Column(columnName="v_xyrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="嫌疑人姓名")
	private String V_XYRXM = "v_xyrxm";
	/**
	* C_XB 性别
	*/
	@Column(columnName="c_xb",dataType="varchar",dataLength=20,nullAble="Y",comment="性别")
	private String C_XB = "c_xb";
	/**
	* V_SFZHM 身份证号码
	*/
	@Column(columnName="v_sfzhm",dataType="varchar",dataLength=50,nullAble="Y",comment="身份证号码")
	private String V_SFZHM = "v_sfzhm";
	/**
	* V_CSZY 从事职业
	*/
	@Column(columnName="v_cszy",dataType="varchar",dataLength=50,nullAble="Y",comment="从事职业")
	private String V_CSZY = "v_cszy";
	/**
	* V_DQZZ 当前住址
	*/
	@Column(columnName="v_dqzz",dataType="varchar",dataLength=100,nullAble="Y",comment="当前住址")
	private String V_DQZZ = "v_dqzz";
	/**
	* V_HJDZ 户籍地址
	*/
	@Column(columnName="v_hjdz",dataType="varchar",dataLength=100,nullAble="Y",comment="户籍地址")
	private String V_HJDZ = "v_hjdz";
	/**
	* C_QZCS 强制措施
	*/
	@Column(columnName="c_qzcs",dataType="varchar",dataLength=20,nullAble="Y",comment="强制措施")
	private String C_QZCS = "c_qzcs";
	/**
	* C_TQAY 提请案由
	*/
	@Column(columnName="c_tqay",dataType="varchar",dataLength=20,nullAble="Y",comment="提请案由")
	private String C_TQAY = "c_tqay";
	/**
	* C_TQAYLB 提请案由类别
	*/
	@Column(columnName="c_tqaylb",dataType="varchar",dataLength=20,nullAble="Y",comment="提请案由类别")
	private String C_TQAYLB = "c_tqaylb";
	/**
	* V_CJAY 次级案由
	*/
	@Column(columnName="v_cjay",dataType="varchar",dataLength=500,nullAble="Y",comment="次级案由")
	private String V_CJAY = "v_cjay";
	/**
	* C_CLJG 处理结果
	*/
	@Column(columnName="c_cljg",dataType="char",dataLength=500,nullAble="Y",comment="处理结果")
	private String C_CLJG = "c_cljg";
	/**
	* C_CBR_SDAY 承办人_审定案由
	*/
	@Column(columnName="c_cbr_sday",dataType="char",dataLength=200,nullAble="Y",comment="承办人_审定案由")
	private String C_CBR_SDAY = "c_cbr_sday";
	/**
	* C_CBR_SDJL 承办人_审定结论
	*/
	@Column(columnName="c_cbr_sdjl",dataType="varchar",dataLength=200,nullAble="Y",comment="承办人_审定结论")
	private String C_CBR_SDJL = "c_cbr_sdjl";
	/**
	* C_CBR_SDLY 承办人_审定理由
	*/
	@Column(columnName="c_cbr_sdly",dataType="varchar",dataLength=200,nullAble="Y",comment="承办人_审定理由")
	private String C_CBR_SDLY = "c_cbr_sdly";
	/**
	* T_CBR_SDSJ 承办人_审定时间
	*/
	@Column(columnName="t_cbr_sdsj",dataType="char",dataLength=19,nullAble="Y",comment="承办人_审定时间")
	private String T_CBR_SDSJ = "t_cbr_sdsj";
	/**
	* C_BM_SDAY 部门_审定案由
	*/
	@Column(columnName="c_bm_sday",dataType="char",dataLength=200,nullAble="Y",comment="部门_审定案由")
	private String C_BM_SDAY = "c_bm_sday";
	/**
	* C_BM_SDJL 部门_审定结论
	*/
	@Column(columnName="c_bm_sdjl",dataType="varchar",dataLength=200,nullAble="Y",comment="部门_审定结论")
	private String C_BM_SDJL = "c_bm_sdjl";
	/**
	* C_BM_SDLY 部门_审定理由
	*/
	@Column(columnName="c_bm_sdly",dataType="varchar",dataLength=200,nullAble="Y",comment="部门_审定理由")
	private String C_BM_SDLY = "c_bm_sdly";
	/**
	* T_BM_SDSJ 部门_审定时间
	*/
	@Column(columnName="t_bm_sdsj",dataType="char",dataLength=19,nullAble="Y",comment="部门_审定时间")
	private String T_BM_SDSJ = "t_bm_sdsj";
	/**
	* V_KSTLYJ 科室讨论意见
	*/
	@Column(columnName="v_kstlyj",dataType="varchar",dataLength=2000,nullAble="Y",comment="科室讨论意见")
	private String V_KSTLYJ = "v_kstlyj";
	/**
	* C_JWH_SDAY 检委会_审定案由
	*/
	@Column(columnName="c_jwh_sday",dataType="char",dataLength=200,nullAble="Y",comment="检委会_审定案由")
	private String C_JWH_SDAY = "c_jwh_sday";
	/**
	* C_JWH_SDJL 检委会_审定结论
	*/
	@Column(columnName="c_jwh_sdjl",dataType="varchar",dataLength=200,nullAble="Y",comment="检委会_审定结论")
	private String C_JWH_SDJL = "c_jwh_sdjl";
	/**
	* C_JWH_SDLY 检委会_审定理由
	*/
	@Column(columnName="c_jwh_sdly",dataType="varchar",dataLength=200,nullAble="Y",comment="检委会_审定理由")
	private String C_JWH_SDLY = "c_jwh_sdly";
	/**
	* T_JWH_SDSJ 检委会_审定时间
	*/
	@Column(columnName="t_jwh_sdsj",dataType="char",dataLength=19,nullAble="Y",comment="检委会_审定时间")
	private String T_JWH_SDSJ = "t_jwh_sdsj";
	/**
	* V_JWHYJ 检委会意见
	*/
	@Column(columnName="v_jwhyj",dataType="varchar",dataLength=2000,nullAble="Y",comment="检委会意见")
	private String V_JWHYJ = "v_jwhyj";
	/**
	* V_JCY_XYRBH 检察院嫌疑人唯一编号
	*/
	@Column(columnName="v_jcy_xyrbh",dataType="varchar",dataLength=200,nullAble="Y",comment="检察院嫌疑人唯一编号")
	private String V_JCY_XYRBH = "v_jcy_xyrbh";
	/**
	* V_JCY_AJBH 检察院案件唯一编号
	*/
	@Column(columnName="v_jcy_ajbh",dataType="varchar",dataLength=200,nullAble="Y",comment="检察院案件唯一编号")
	private String V_JCY_AJBH = "v_jcy_ajbh";
	/**
	* V_XYRXH 嫌疑人序号
	*/
	@Column(columnName="v_xyrxh",dataType="varchar",dataLength=200,nullAble="Y",comment="嫌疑人序号")
	private String V_XYRXH = "v_xyrxh";
	/**
	* V_XYRBH 嫌疑人编号
	*/
	@Column(columnName="v_xyrbh",dataType="varchar",dataLength=50,nullAble="Y",comment="嫌疑人编号")
	private String V_XYRBH = "v_xyrbh";
	/**
	* C_BQSYY 不起诉原因
	*/
	@Column(columnName="c_bqsyy",dataType="varchar",dataLength=20,nullAble="Y",comment="不起诉原因")
	private String C_BQSYY = "c_bqsyy";
	/**
	* C_FYJG 复议结果
	*/
	@Column(columnName="c_fyjg",dataType="varchar",dataLength=20,nullAble="Y",comment="复议结果")
	private String C_FYJG = "c_fyjg";
	/**
	* C_FYBQSYY 复议不起诉原因
	*/
	@Column(columnName="c_fybqsyy",dataType="varchar",dataLength=20,nullAble="Y",comment="复议不起诉原因")
	private String C_FYBQSYY = "c_fybqsyy";
	/**
	* C_FHJG 复核结果
	*/
	@Column(columnName="c_fhjg",dataType="varchar",dataLength=20,nullAble="Y",comment="复核结果")
	private String C_FHJG = "c_fhjg";
	/**
	* C_FHBQSYY 复核不起诉原因
	*/
	@Column(columnName="c_fhbqsyy",dataType="varchar",dataLength=20,nullAble="Y",comment="复核不起诉原因")
	private String C_FHBQSYY = "c_fhbqsyy";
	/**
	* PK_BAOSU_H 报诉信息主表_主键
	*/
	@Column(columnName="pk_baosu_h",dataType="char",dataLength=20,nullAble="N",comment="报诉信息主表_主键")
	private String PK_BAOSU_H = "pk_baosu_h";
	/**
	* getPk_baosu_b(void) 
	*/
	public String getPk_baosu_b(){
		return this.PK_BAOSU_B;
	}
	/**
	*setPk_baosu_b(java.lang.String)
	*/
	public void setPk_baosu_b(String pk_baosu_b){
		this.PK_BAOSU_B=pk_baosu_b;
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
	* getC_xyr(void) 
	*/
	public String getC_xyr(){
		return this.C_XYR;
	}
	/**
	*setC_xyr(java.lang.String)
	*/
	public void setC_xyr(String c_xyr){
		this.C_XYR=c_xyr;
	}
	/**
	* getV_xyrxm(void) 
	*/
	public String getV_xyrxm(){
		return this.V_XYRXM;
	}
	/**
	*setV_xyrxm(java.lang.String)
	*/
	public void setV_xyrxm(String v_xyrxm){
		this.V_XYRXM=v_xyrxm;
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
	* getV_sfzhm(void) 
	*/
	public String getV_sfzhm(){
		return this.V_SFZHM;
	}
	/**
	*setV_sfzhm(java.lang.String)
	*/
	public void setV_sfzhm(String v_sfzhm){
		this.V_SFZHM=v_sfzhm;
	}
	/**
	* getV_cszy(void) 
	*/
	public String getV_cszy(){
		return this.V_CSZY;
	}
	/**
	*setV_cszy(java.lang.String)
	*/
	public void setV_cszy(String v_cszy){
		this.V_CSZY=v_cszy;
	}
	/**
	* getV_dqzz(void) 
	*/
	public String getV_dqzz(){
		return this.V_DQZZ;
	}
	/**
	*setV_dqzz(java.lang.String)
	*/
	public void setV_dqzz(String v_dqzz){
		this.V_DQZZ=v_dqzz;
	}
	/**
	* getV_hjdz(void) 
	*/
	public String getV_hjdz(){
		return this.V_HJDZ;
	}
	/**
	*setV_hjdz(java.lang.String)
	*/
	public void setV_hjdz(String v_hjdz){
		this.V_HJDZ=v_hjdz;
	}
	/**
	* getC_qzcs(void) 
	*/
	public String getC_qzcs(){
		return this.C_QZCS;
	}
	/**
	*setC_qzcs(java.lang.String)
	*/
	public void setC_qzcs(String c_qzcs){
		this.C_QZCS=c_qzcs;
	}
	/**
	* getC_tqay(void) 
	*/
	public String getC_tqay(){
		return this.C_TQAY;
	}
	/**
	*setC_tqay(java.lang.String)
	*/
	public void setC_tqay(String c_tqay){
		this.C_TQAY=c_tqay;
	}
	/**
	* getC_tqaylb(void) 
	*/
	public String getC_tqaylb(){
		return this.C_TQAYLB;
	}
	/**
	*setC_tqaylb(java.lang.String)
	*/
	public void setC_tqaylb(String c_tqaylb){
		this.C_TQAYLB=c_tqaylb;
	}
	/**
	* getV_cjay(void) 
	*/
	public String getV_cjay(){
		return this.V_CJAY;
	}
	/**
	*setV_cjay(java.lang.String)
	*/
	public void setV_cjay(String v_cjay){
		this.V_CJAY=v_cjay;
	}
	/**
	* getC_cljg(void) 
	*/
	public String getC_cljg(){
		return this.C_CLJG;
	}
	/**
	*setC_cljg(java.lang.String)
	*/
	public void setC_cljg(String c_cljg){
		this.C_CLJG=c_cljg;
	}
	/**
	* getC_cbr_sday(void) 
	*/
	public String getC_cbr_sday(){
		return this.C_CBR_SDAY;
	}
	/**
	*setC_cbr_sday(java.lang.String)
	*/
	public void setC_cbr_sday(String c_cbr_sday){
		this.C_CBR_SDAY=c_cbr_sday;
	}
	/**
	* getC_cbr_sdjl(void) 
	*/
	public String getC_cbr_sdjl(){
		return this.C_CBR_SDJL;
	}
	/**
	*setC_cbr_sdjl(java.lang.String)
	*/
	public void setC_cbr_sdjl(String c_cbr_sdjl){
		this.C_CBR_SDJL=c_cbr_sdjl;
	}
	/**
	* getC_cbr_sdly(void) 
	*/
	public String getC_cbr_sdly(){
		return this.C_CBR_SDLY;
	}
	/**
	*setC_cbr_sdly(java.lang.String)
	*/
	public void setC_cbr_sdly(String c_cbr_sdly){
		this.C_CBR_SDLY=c_cbr_sdly;
	}
	/**
	* getT_cbr_sdsj(void) 
	*/
	public String getT_cbr_sdsj(){
		return this.T_CBR_SDSJ;
	}
	/**
	*setT_cbr_sdsj(java.lang.String)
	*/
	public void setT_cbr_sdsj(String t_cbr_sdsj){
		this.T_CBR_SDSJ=t_cbr_sdsj;
	}
	/**
	* getC_bm_sday(void) 
	*/
	public String getC_bm_sday(){
		return this.C_BM_SDAY;
	}
	/**
	*setC_bm_sday(java.lang.String)
	*/
	public void setC_bm_sday(String c_bm_sday){
		this.C_BM_SDAY=c_bm_sday;
	}
	/**
	* getC_bm_sdjl(void) 
	*/
	public String getC_bm_sdjl(){
		return this.C_BM_SDJL;
	}
	/**
	*setC_bm_sdjl(java.lang.String)
	*/
	public void setC_bm_sdjl(String c_bm_sdjl){
		this.C_BM_SDJL=c_bm_sdjl;
	}
	/**
	* getC_bm_sdly(void) 
	*/
	public String getC_bm_sdly(){
		return this.C_BM_SDLY;
	}
	/**
	*setC_bm_sdly(java.lang.String)
	*/
	public void setC_bm_sdly(String c_bm_sdly){
		this.C_BM_SDLY=c_bm_sdly;
	}
	/**
	* getT_bm_sdsj(void) 
	*/
	public String getT_bm_sdsj(){
		return this.T_BM_SDSJ;
	}
	/**
	*setT_bm_sdsj(java.lang.String)
	*/
	public void setT_bm_sdsj(String t_bm_sdsj){
		this.T_BM_SDSJ=t_bm_sdsj;
	}
	/**
	* getV_kstlyj(void) 
	*/
	public String getV_kstlyj(){
		return this.V_KSTLYJ;
	}
	/**
	*setV_kstlyj(java.lang.String)
	*/
	public void setV_kstlyj(String v_kstlyj){
		this.V_KSTLYJ=v_kstlyj;
	}
	/**
	* getC_jwh_sday(void) 
	*/
	public String getC_jwh_sday(){
		return this.C_JWH_SDAY;
	}
	/**
	*setC_jwh_sday(java.lang.String)
	*/
	public void setC_jwh_sday(String c_jwh_sday){
		this.C_JWH_SDAY=c_jwh_sday;
	}
	/**
	* getC_jwh_sdjl(void) 
	*/
	public String getC_jwh_sdjl(){
		return this.C_JWH_SDJL;
	}
	/**
	*setC_jwh_sdjl(java.lang.String)
	*/
	public void setC_jwh_sdjl(String c_jwh_sdjl){
		this.C_JWH_SDJL=c_jwh_sdjl;
	}
	/**
	* getC_jwh_sdly(void) 
	*/
	public String getC_jwh_sdly(){
		return this.C_JWH_SDLY;
	}
	/**
	*setC_jwh_sdly(java.lang.String)
	*/
	public void setC_jwh_sdly(String c_jwh_sdly){
		this.C_JWH_SDLY=c_jwh_sdly;
	}
	/**
	* getT_jwh_sdsj(void) 
	*/
	public String getT_jwh_sdsj(){
		return this.T_JWH_SDSJ;
	}
	/**
	*setT_jwh_sdsj(java.lang.String)
	*/
	public void setT_jwh_sdsj(String t_jwh_sdsj){
		this.T_JWH_SDSJ=t_jwh_sdsj;
	}
	/**
	* getV_jwhyj(void) 
	*/
	public String getV_jwhyj(){
		return this.V_JWHYJ;
	}
	/**
	*setV_jwhyj(java.lang.String)
	*/
	public void setV_jwhyj(String v_jwhyj){
		this.V_JWHYJ=v_jwhyj;
	}
	/**
	* getV_jcy_xyrbh(void) 
	*/
	public String getV_jcy_xyrbh(){
		return this.V_JCY_XYRBH;
	}
	/**
	*setV_jcy_xyrbh(java.lang.String)
	*/
	public void setV_jcy_xyrbh(String v_jcy_xyrbh){
		this.V_JCY_XYRBH=v_jcy_xyrbh;
	}
	/**
	* getV_jcy_ajbh(void) 
	*/
	public String getV_jcy_ajbh(){
		return this.V_JCY_AJBH;
	}
	/**
	*setV_jcy_ajbh(java.lang.String)
	*/
	public void setV_jcy_ajbh(String v_jcy_ajbh){
		this.V_JCY_AJBH=v_jcy_ajbh;
	}
	/**
	* getV_xyrxh(void) 
	*/
	public String getV_xyrxh(){
		return this.V_XYRXH;
	}
	/**
	*setV_xyrxh(java.lang.String)
	*/
	public void setV_xyrxh(String v_xyrxh){
		this.V_XYRXH=v_xyrxh;
	}
	/**
	* getV_xyrbh(void) 
	*/
	public String getV_xyrbh(){
		return this.V_XYRBH;
	}
	/**
	*setV_xyrbh(java.lang.String)
	*/
	public void setV_xyrbh(String v_xyrbh){
		this.V_XYRBH=v_xyrbh;
	}
	/**
	* getC_bqsyy(void) 
	*/
	public String getC_bqsyy(){
		return this.C_BQSYY;
	}
	/**
	*setC_bqsyy(java.lang.String)
	*/
	public void setC_bqsyy(String c_bqsyy){
		this.C_BQSYY=c_bqsyy;
	}
	/**
	* getC_fyjg(void) 
	*/
	public String getC_fyjg(){
		return this.C_FYJG;
	}
	/**
	*setC_fyjg(java.lang.String)
	*/
	public void setC_fyjg(String c_fyjg){
		this.C_FYJG=c_fyjg;
	}
	/**
	* getC_fybqsyy(void) 
	*/
	public String getC_fybqsyy(){
		return this.C_FYBQSYY;
	}
	/**
	*setC_fybqsyy(java.lang.String)
	*/
	public void setC_fybqsyy(String c_fybqsyy){
		this.C_FYBQSYY=c_fybqsyy;
	}
	/**
	* getC_fhjg(void) 
	*/
	public String getC_fhjg(){
		return this.C_FHJG;
	}
	/**
	*setC_fhjg(java.lang.String)
	*/
	public void setC_fhjg(String c_fhjg){
		this.C_FHJG=c_fhjg;
	}
	/**
	* getC_fhbqsyy(void) 
	*/
	public String getC_fhbqsyy(){
		return this.C_FHBQSYY;
	}
	/**
	*setC_fhbqsyy(java.lang.String)
	*/
	public void setC_fhbqsyy(String c_fhbqsyy){
		this.C_FHBQSYY=c_fhbqsyy;
	}
	/**
	* getPk_baosu_h(void) 
	*/
	public String getPk_baosu_h(){
		return this.PK_BAOSU_H;
	}
	/**
	*setPk_baosu_h(java.lang.String)
	*/
	public void setPk_baosu_h(String pk_baosu_h){
		this.PK_BAOSU_H=pk_baosu_h;
	}


}