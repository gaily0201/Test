package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasWshyHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_wshy_h")
public class CrpasWshyHVO {
	/**
	* C_SYR 送押人
	*/
	@Column(columnName="c_syr",dataType="char",dataLength=20,nullAble="Y",comment="送押人")
	private String C_SYR = "c_syr";
	/**
	* V_ZWBH1 指纹编号1
	*/
	@Column(columnName="v_zwbh1",dataType="varchar",dataLength=50,nullAble="Y",comment="指纹编号1")
	private String V_ZWBH1 = "v_zwbh1";
	/**
	* V_ZWBH2 指纹编号2
	*/
	@Column(columnName="v_zwbh2",dataType="varchar",dataLength=50,nullAble="Y",comment="指纹编号2")
	private String V_ZWBH2 = "v_zwbh2";
	/**
	* V_GYQX 关押期限
	*/
	@Column(columnName="v_gyqx",dataType="varchar",dataLength=50,nullAble="Y",comment="关押期限")
	private String V_GYQX = "v_gyqx";
	/**
	* D_DBRQ 逮捕日期
	*/
	@Column(columnName="d_dbrq",dataType="char",dataLength=19,nullAble="Y",comment="逮捕日期")
	private String D_DBRQ = "d_dbrq";
	/**
	* D_JLRQ 拘留日期
	*/
	@Column(columnName="d_jlrq",dataType="char",dataLength=19,nullAble="Y",comment="拘留日期")
	private String D_JLRQ = "d_jlrq";
	/**
	* D_JYRQ 羁押日期
	*/
	@Column(columnName="d_jyrq",dataType="char",dataLength=19,nullAble="Y",comment="羁押日期")
	private String D_JYRQ = "d_jyrq";
	/**
	* V_SYPZ 收押凭证
	*/
	@Column(columnName="v_sypz",dataType="varchar",dataLength=2000,nullAble="Y",comment="收押凭证")
	private String V_SYPZ = "v_sypz";
	/**
	* D_SDRQ 收到日期
	*/
	@Column(columnName="d_sdrq",dataType="char",dataLength=19,nullAble="Y",comment="收到日期")
	private String D_SDRQ = "d_sdrq";
	/**
	* C_ZLDW 转来单位
	*/
	@Column(columnName="c_zldw",dataType="char",dataLength=20,nullAble="Y",comment="转来单位")
	private String C_ZLDW = "c_zldw";
	/**
	* V_ZLDWMC 转来单位名称
	*/
	@Column(columnName="v_zldwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="转来单位名称")
	private String V_ZLDWMC = "v_zldwmc";
	/**
	* C_SYDW 送押单位
	*/
	@Column(columnName="c_sydw",dataType="char",dataLength=20,nullAble="Y",comment="送押单位")
	private String C_SYDW = "c_sydw";
	/**
	* V_SYDWMC 送押单位名称
	*/
	@Column(columnName="v_sydwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="送押单位名称")
	private String V_SYDWMC = "v_sydwmc";
	/**
	* V_SYRMC 送押人名称
	*/
	@Column(columnName="v_syrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="送押人名称")
	private String V_SYRMC = "v_syrmc";
	/**
	* C_CYLB 成员类别
	*/
	@Column(columnName="c_cylb",dataType="varchar",dataLength=20,nullAble="Y",comment="成员类别")
	private String C_CYLB = "c_cylb";
	/**
	* C_WXDJ 危险等级
	*/
	@Column(columnName="c_wxdj",dataType="varchar",dataLength=20,nullAble="Y",comment="危险等级")
	private String C_WXDJ = "c_wxdj";
	/**
	* B_SFZXF 是否重刑犯
	*/
	@Column(columnName="b_sfzxf",dataType="char",dataLength=1,nullAble="Y",comment="是否重刑犯")
	private String B_SFZXF = "b_sfzxf";
	/**
	* D_CSRQ 出所日期
	*/
	@Column(columnName="d_csrq",dataType="char",dataLength=19,nullAble="Y",comment="出所日期")
	private String D_CSRQ = "d_csrq";
	/**
	* V_CSYY 出所原因
	*/
	@Column(columnName="v_csyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="出所原因")
	private String V_CSYY = "v_csyy";
	/**
	* V_CSQX 出所去向
	*/
	@Column(columnName="v_csqx",dataType="varchar",dataLength=50,nullAble="Y",comment="出所去向")
	private String V_CSQX = "v_csqx";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
	/**
	* V_RYBH 人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=100,nullAble="Y",comment="人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* V_KSSRYBH 看守所人员编号
	*/
	@Column(columnName="v_kssrybh",dataType="varchar",dataLength=100,nullAble="Y",comment="看守所人员编号")
	private String V_KSSRYBH = "v_kssrybh";
	/**
	* C_SSKSS 所属看守所
	*/
	@Column(columnName="c_sskss",dataType="varchar",dataLength=20,nullAble="Y",comment="所属看守所")
	private String C_SSKSS = "c_sskss";
	/**
	* V_SSKSSMC 所属看守所名称
	*/
	@Column(columnName="v_sskssmc",dataType="varchar",dataLength=100,nullAble="Y",comment="所属看守所名称")
	private String V_SSKSSMC = "v_sskssmc";
	/**
	* BILLNO 单据号
	*/
	@Column(columnName="billno",dataType="varchar",dataLength=50,nullAble="Y",comment="单据号")
	private String BILLNO = "billno";
	/**
	* BUSITYPE 业务类型
	*/
	@Column(columnName="busitype",dataType="varchar",dataLength=50,nullAble="Y",comment="业务类型")
	private String BUSITYPE = "busitype";
	/**
	* BILLTYPE 单据类型
	*/
	@Column(columnName="billtype",dataType="varchar",dataLength=50,nullAble="Y",comment="单据类型")
	private String BILLTYPE = "billtype";
	/**
	* BILLMAKER 制单人
	*/
	@Column(columnName="billmaker",dataType="varchar",dataLength=20,nullAble="Y",comment="制单人")
	private String BILLMAKER = "billmaker";
	/**
	* BILLDATE 单据日期
	*/
	@Column(columnName="billdate",dataType="char",dataLength=19,nullAble="Y",comment="单据日期")
	private String BILLDATE = "billdate";
	/**
	* APPROVER 审批人
	*/
	@Column(columnName="approver",dataType="varchar",dataLength=20,nullAble="Y",comment="审批人")
	private String APPROVER = "approver";
	/**
	* APPROVESTATUS 审批状态
	*/
	@Column(columnName="approvestatus",dataType="int",dataLength=0,nullAble="Y",comment="审批状态")
	private String APPROVESTATUS = "approvestatus";
	/**
	* APPROVENOTE 审批批语
	*/
	@Column(columnName="approvenote",dataType="varchar",dataLength=50,nullAble="Y",comment="审批批语")
	private String APPROVENOTE = "approvenote";
	/**
	* APPROVEDATE 审批时间
	*/
	@Column(columnName="approvedate",dataType="char",dataLength=19,nullAble="Y",comment="审批时间")
	private String APPROVEDATE = "approvedate";
	/**
	* SRCBILLTYPE 来源单据类型
	*/
	@Column(columnName="srcbilltype",dataType="varchar",dataLength=50,nullAble="Y",comment="来源单据类型")
	private String SRCBILLTYPE = "srcbilltype";
	/**
	* SRCBILLID 来源单据id
	*/
	@Column(columnName="srcbillid",dataType="varchar",dataLength=50,nullAble="Y",comment="来源单据id")
	private String SRCBILLID = "srcbillid";
	/**
	* CREATOR 创建人
	*/
	@Column(columnName="creator",dataType="varchar",dataLength=20,nullAble="Y",comment="创建人")
	private String CREATOR = "creator";
	/**
	* CREATIONTIME 创建时间
	*/
	@Column(columnName="creationtime",dataType="char",dataLength=19,nullAble="Y",comment="创建时间")
	private String CREATIONTIME = "creationtime";
	/**
	* MODIFIER 修改人
	*/
	@Column(columnName="modifier",dataType="varchar",dataLength=20,nullAble="Y",comment="修改人")
	private String MODIFIER = "modifier";
	/**
	* MODIFIEDTIME 修改时间
	*/
	@Column(columnName="modifiedtime",dataType="char",dataLength=19,nullAble="Y",comment="修改时间")
	private String MODIFIEDTIME = "modifiedtime";
	/**
	* PK_ORG 组织
	*/
	@Column(columnName="pk_org",dataType="varchar",dataLength=20,nullAble="Y",comment="组织")
	private String PK_ORG = "pk_org";
	/**
	* PK_ORG_V 组织版本信息
	*/
	@Column(columnName="pk_org_v",dataType="varchar",dataLength=50,nullAble="Y",comment="组织版本信息")
	private String PK_ORG_V = "pk_org_v";
	/**
	* PK_GROUP 集团
	*/
	@Column(columnName="pk_group",dataType="varchar",dataLength=20,nullAble="Y",comment="集团")
	private String PK_GROUP = "pk_group";
	/**
	* TRANSTYPEPK 交易类型pk
	*/
	@Column(columnName="transtypepk",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型pk")
	private String TRANSTYPEPK = "transtypepk";
	/**
	* EMENDENUM 修订枚举
	*/
	@Column(columnName="emendenum",dataType="int",dataLength=0,nullAble="Y",comment="修订枚举")
	private String EMENDENUM = "emendenum";
	/**
	* BILLVERSIONPK 单据版本pk
	*/
	@Column(columnName="billversionpk",dataType="varchar",dataLength=50,nullAble="Y",comment="单据版本pk")
	private String BILLVERSIONPK = "billversionpk";
	/**
	* PK_WSHY_H 主键
	*/
	@Column(columnName="pk_wshy_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_WSHY_H = "pk_wshy_h";
	/**
	* V_PTAJLX 平台案件类型
	*/
	@Column(columnName="v_ptajlx",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件类型")
	private String V_PTAJLX = "v_ptajlx";
	/**
	* V_PTAJZJ 平台案件主键
	*/
	@Column(columnName="v_ptajzj",dataType="char",dataLength=20,nullAble="Y",comment="平台案件主键")
	private String V_PTAJZJ = "v_ptajzj";
	/**
	* C_XYR 嫌疑人
	*/
	@Column(columnName="c_xyr",dataType="char",dataLength=20,nullAble="Y",comment="嫌疑人")
	private String C_XYR = "c_xyr";
	/**
	* V_XYRXM 嫌疑人姓名
	*/
	@Column(columnName="v_xyrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="嫌疑人姓名")
	private String V_XYRXM = "v_xyrxm";
	/**
	* V_JSH 监室号
	*/
	@Column(columnName="v_jsh",dataType="varchar",dataLength=50,nullAble="Y",comment="监室号")
	private String V_JSH = "v_jsh";
	/**
	* C_GJY 管教员
	*/
	@Column(columnName="c_gjy",dataType="char",dataLength=20,nullAble="Y",comment="管教员")
	private String C_GJY = "c_gjy";
	/**
	* V_GJYXM 管教员姓名
	*/
	@Column(columnName="v_gjyxm",dataType="varchar",dataLength=50,nullAble="Y",comment="管教员姓名")
	private String V_GJYXM = "v_gjyxm";
	/**
	* T_RSSJ 入所时间
	*/
	@Column(columnName="t_rssj",dataType="char",dataLength=19,nullAble="Y",comment="入所时间")
	private String T_RSSJ = "t_rssj";
	/**
	* V_RSYY 入所原因
	*/
	@Column(columnName="v_rsyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="入所原因")
	private String V_RSYY = "v_rsyy";
	/**
	* N_SJGYTS 实际关押天数
	*/
	@Column(columnName="n_sjgyts",dataType="int",dataLength=0,nullAble="Y",comment="实际关押天数")
	private String N_SJGYTS = "n_sjgyts";
	/**
	* V_DAH 档案号
	*/
	@Column(columnName="v_dah",dataType="varchar",dataLength=50,nullAble="Y",comment="档案号")
	private String V_DAH = "v_dah";
	/**
	* getC_syr(void) 
	*/
	public String getC_syr(){
		return this.C_SYR;
	}
	/**
	*setC_syr(java.lang.String)
	*/
	public void setC_syr(String c_syr){
		this.C_SYR=c_syr;
	}
	/**
	* getV_zwbh1(void) 
	*/
	public String getV_zwbh1(){
		return this.V_ZWBH1;
	}
	/**
	*setV_zwbh1(java.lang.String)
	*/
	public void setV_zwbh1(String v_zwbh1){
		this.V_ZWBH1=v_zwbh1;
	}
	/**
	* getV_zwbh2(void) 
	*/
	public String getV_zwbh2(){
		return this.V_ZWBH2;
	}
	/**
	*setV_zwbh2(java.lang.String)
	*/
	public void setV_zwbh2(String v_zwbh2){
		this.V_ZWBH2=v_zwbh2;
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
	* getD_dbrq(void) 
	*/
	public String getD_dbrq(){
		return this.D_DBRQ;
	}
	/**
	*setD_dbrq(java.lang.String)
	*/
	public void setD_dbrq(String d_dbrq){
		this.D_DBRQ=d_dbrq;
	}
	/**
	* getD_jlrq(void) 
	*/
	public String getD_jlrq(){
		return this.D_JLRQ;
	}
	/**
	*setD_jlrq(java.lang.String)
	*/
	public void setD_jlrq(String d_jlrq){
		this.D_JLRQ=d_jlrq;
	}
	/**
	* getD_jyrq(void) 
	*/
	public String getD_jyrq(){
		return this.D_JYRQ;
	}
	/**
	*setD_jyrq(java.lang.String)
	*/
	public void setD_jyrq(String d_jyrq){
		this.D_JYRQ=d_jyrq;
	}
	/**
	* getV_sypz(void) 
	*/
	public String getV_sypz(){
		return this.V_SYPZ;
	}
	/**
	*setV_sypz(java.lang.String)
	*/
	public void setV_sypz(String v_sypz){
		this.V_SYPZ=v_sypz;
	}
	/**
	* getD_sdrq(void) 
	*/
	public String getD_sdrq(){
		return this.D_SDRQ;
	}
	/**
	*setD_sdrq(java.lang.String)
	*/
	public void setD_sdrq(String d_sdrq){
		this.D_SDRQ=d_sdrq;
	}
	/**
	* getC_zldw(void) 
	*/
	public String getC_zldw(){
		return this.C_ZLDW;
	}
	/**
	*setC_zldw(java.lang.String)
	*/
	public void setC_zldw(String c_zldw){
		this.C_ZLDW=c_zldw;
	}
	/**
	* getV_zldwmc(void) 
	*/
	public String getV_zldwmc(){
		return this.V_ZLDWMC;
	}
	/**
	*setV_zldwmc(java.lang.String)
	*/
	public void setV_zldwmc(String v_zldwmc){
		this.V_ZLDWMC=v_zldwmc;
	}
	/**
	* getC_sydw(void) 
	*/
	public String getC_sydw(){
		return this.C_SYDW;
	}
	/**
	*setC_sydw(java.lang.String)
	*/
	public void setC_sydw(String c_sydw){
		this.C_SYDW=c_sydw;
	}
	/**
	* getV_sydwmc(void) 
	*/
	public String getV_sydwmc(){
		return this.V_SYDWMC;
	}
	/**
	*setV_sydwmc(java.lang.String)
	*/
	public void setV_sydwmc(String v_sydwmc){
		this.V_SYDWMC=v_sydwmc;
	}
	/**
	* getV_syrmc(void) 
	*/
	public String getV_syrmc(){
		return this.V_SYRMC;
	}
	/**
	*setV_syrmc(java.lang.String)
	*/
	public void setV_syrmc(String v_syrmc){
		this.V_SYRMC=v_syrmc;
	}
	/**
	* getC_cylb(void) 
	*/
	public String getC_cylb(){
		return this.C_CYLB;
	}
	/**
	*setC_cylb(java.lang.String)
	*/
	public void setC_cylb(String c_cylb){
		this.C_CYLB=c_cylb;
	}
	/**
	* getC_wxdj(void) 
	*/
	public String getC_wxdj(){
		return this.C_WXDJ;
	}
	/**
	*setC_wxdj(java.lang.String)
	*/
	public void setC_wxdj(String c_wxdj){
		this.C_WXDJ=c_wxdj;
	}
	/**
	* getB_sfzxf(void) 
	*/
	public String getB_sfzxf(){
		return this.B_SFZXF;
	}
	/**
	*setB_sfzxf(java.lang.String)
	*/
	public void setB_sfzxf(String b_sfzxf){
		this.B_SFZXF=b_sfzxf;
	}
	/**
	* getD_csrq(void) 
	*/
	public String getD_csrq(){
		return this.D_CSRQ;
	}
	/**
	*setD_csrq(java.lang.String)
	*/
	public void setD_csrq(String d_csrq){
		this.D_CSRQ=d_csrq;
	}
	/**
	* getV_csyy(void) 
	*/
	public String getV_csyy(){
		return this.V_CSYY;
	}
	/**
	*setV_csyy(java.lang.String)
	*/
	public void setV_csyy(String v_csyy){
		this.V_CSYY=v_csyy;
	}
	/**
	* getV_csqx(void) 
	*/
	public String getV_csqx(){
		return this.V_CSQX;
	}
	/**
	*setV_csqx(java.lang.String)
	*/
	public void setV_csqx(String v_csqx){
		this.V_CSQX=v_csqx;
	}
	/**
	* getTranstype(void) 
	*/
	public String getTranstype(){
		return this.TRANSTYPE;
	}
	/**
	*setTranstype(java.lang.String)
	*/
	public void setTranstype(String transtype){
		this.TRANSTYPE=transtype;
	}
	/**
	* getV_rybh(void) 
	*/
	public String getV_rybh(){
		return this.V_RYBH;
	}
	/**
	*setV_rybh(java.lang.String)
	*/
	public void setV_rybh(String v_rybh){
		this.V_RYBH=v_rybh;
	}
	/**
	* getV_kssrybh(void) 
	*/
	public String getV_kssrybh(){
		return this.V_KSSRYBH;
	}
	/**
	*setV_kssrybh(java.lang.String)
	*/
	public void setV_kssrybh(String v_kssrybh){
		this.V_KSSRYBH=v_kssrybh;
	}
	/**
	* getC_sskss(void) 
	*/
	public String getC_sskss(){
		return this.C_SSKSS;
	}
	/**
	*setC_sskss(java.lang.String)
	*/
	public void setC_sskss(String c_sskss){
		this.C_SSKSS=c_sskss;
	}
	/**
	* getV_sskssmc(void) 
	*/
	public String getV_sskssmc(){
		return this.V_SSKSSMC;
	}
	/**
	*setV_sskssmc(java.lang.String)
	*/
	public void setV_sskssmc(String v_sskssmc){
		this.V_SSKSSMC=v_sskssmc;
	}
	/**
	* getBillno(void) 
	*/
	public String getBillno(){
		return this.BILLNO;
	}
	/**
	*setBillno(java.lang.String)
	*/
	public void setBillno(String billno){
		this.BILLNO=billno;
	}
	/**
	* getBusitype(void) 
	*/
	public String getBusitype(){
		return this.BUSITYPE;
	}
	/**
	*setBusitype(java.lang.String)
	*/
	public void setBusitype(String busitype){
		this.BUSITYPE=busitype;
	}
	/**
	* getBilltype(void) 
	*/
	public String getBilltype(){
		return this.BILLTYPE;
	}
	/**
	*setBilltype(java.lang.String)
	*/
	public void setBilltype(String billtype){
		this.BILLTYPE=billtype;
	}
	/**
	* getBillmaker(void) 
	*/
	public String getBillmaker(){
		return this.BILLMAKER;
	}
	/**
	*setBillmaker(java.lang.String)
	*/
	public void setBillmaker(String billmaker){
		this.BILLMAKER=billmaker;
	}
	/**
	* getBilldate(void) 
	*/
	public String getBilldate(){
		return this.BILLDATE;
	}
	/**
	*setBilldate(java.lang.String)
	*/
	public void setBilldate(String billdate){
		this.BILLDATE=billdate;
	}
	/**
	* getApprover(void) 
	*/
	public String getApprover(){
		return this.APPROVER;
	}
	/**
	*setApprover(java.lang.String)
	*/
	public void setApprover(String approver){
		this.APPROVER=approver;
	}
	/**
	* getApprovestatus(void) 
	*/
	public String getApprovestatus(){
		return this.APPROVESTATUS;
	}
	/**
	*setApprovestatus(java.lang.String)
	*/
	public void setApprovestatus(String approvestatus){
		this.APPROVESTATUS=approvestatus;
	}
	/**
	* getApprovenote(void) 
	*/
	public String getApprovenote(){
		return this.APPROVENOTE;
	}
	/**
	*setApprovenote(java.lang.String)
	*/
	public void setApprovenote(String approvenote){
		this.APPROVENOTE=approvenote;
	}
	/**
	* getApprovedate(void) 
	*/
	public String getApprovedate(){
		return this.APPROVEDATE;
	}
	/**
	*setApprovedate(java.lang.String)
	*/
	public void setApprovedate(String approvedate){
		this.APPROVEDATE=approvedate;
	}
	/**
	* getSrcbilltype(void) 
	*/
	public String getSrcbilltype(){
		return this.SRCBILLTYPE;
	}
	/**
	*setSrcbilltype(java.lang.String)
	*/
	public void setSrcbilltype(String srcbilltype){
		this.SRCBILLTYPE=srcbilltype;
	}
	/**
	* getSrcbillid(void) 
	*/
	public String getSrcbillid(){
		return this.SRCBILLID;
	}
	/**
	*setSrcbillid(java.lang.String)
	*/
	public void setSrcbillid(String srcbillid){
		this.SRCBILLID=srcbillid;
	}
	/**
	* getCreator(void) 
	*/
	public String getCreator(){
		return this.CREATOR;
	}
	/**
	*setCreator(java.lang.String)
	*/
	public void setCreator(String creator){
		this.CREATOR=creator;
	}
	/**
	* getCreationtime(void) 
	*/
	public String getCreationtime(){
		return this.CREATIONTIME;
	}
	/**
	*setCreationtime(java.lang.String)
	*/
	public void setCreationtime(String creationtime){
		this.CREATIONTIME=creationtime;
	}
	/**
	* getModifier(void) 
	*/
	public String getModifier(){
		return this.MODIFIER;
	}
	/**
	*setModifier(java.lang.String)
	*/
	public void setModifier(String modifier){
		this.MODIFIER=modifier;
	}
	/**
	* getModifiedtime(void) 
	*/
	public String getModifiedtime(){
		return this.MODIFIEDTIME;
	}
	/**
	*setModifiedtime(java.lang.String)
	*/
	public void setModifiedtime(String modifiedtime){
		this.MODIFIEDTIME=modifiedtime;
	}
	/**
	* getPk_org(void) 
	*/
	public String getPk_org(){
		return this.PK_ORG;
	}
	/**
	*setPk_org(java.lang.String)
	*/
	public void setPk_org(String pk_org){
		this.PK_ORG=pk_org;
	}
	/**
	* getPk_org_v(void) 
	*/
	public String getPk_org_v(){
		return this.PK_ORG_V;
	}
	/**
	*setPk_org_v(java.lang.String)
	*/
	public void setPk_org_v(String pk_org_v){
		this.PK_ORG_V=pk_org_v;
	}
	/**
	* getPk_group(void) 
	*/
	public String getPk_group(){
		return this.PK_GROUP;
	}
	/**
	*setPk_group(java.lang.String)
	*/
	public void setPk_group(String pk_group){
		this.PK_GROUP=pk_group;
	}
	/**
	* getTranstypepk(void) 
	*/
	public String getTranstypepk(){
		return this.TRANSTYPEPK;
	}
	/**
	*setTranstypepk(java.lang.String)
	*/
	public void setTranstypepk(String transtypepk){
		this.TRANSTYPEPK=transtypepk;
	}
	/**
	* getEmendenum(void) 
	*/
	public String getEmendenum(){
		return this.EMENDENUM;
	}
	/**
	*setEmendenum(java.lang.String)
	*/
	public void setEmendenum(String emendenum){
		this.EMENDENUM=emendenum;
	}
	/**
	* getBillversionpk(void) 
	*/
	public String getBillversionpk(){
		return this.BILLVERSIONPK;
	}
	/**
	*setBillversionpk(java.lang.String)
	*/
	public void setBillversionpk(String billversionpk){
		this.BILLVERSIONPK=billversionpk;
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
	/**
	* getV_ptajlx(void) 
	*/
	public String getV_ptajlx(){
		return this.V_PTAJLX;
	}
	/**
	*setV_ptajlx(java.lang.String)
	*/
	public void setV_ptajlx(String v_ptajlx){
		this.V_PTAJLX=v_ptajlx;
	}
	/**
	* getV_ptajzj(void) 
	*/
	public String getV_ptajzj(){
		return this.V_PTAJZJ;
	}
	/**
	*setV_ptajzj(java.lang.String)
	*/
	public void setV_ptajzj(String v_ptajzj){
		this.V_PTAJZJ=v_ptajzj;
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
	* getV_jsh(void) 
	*/
	public String getV_jsh(){
		return this.V_JSH;
	}
	/**
	*setV_jsh(java.lang.String)
	*/
	public void setV_jsh(String v_jsh){
		this.V_JSH=v_jsh;
	}
	/**
	* getC_gjy(void) 
	*/
	public String getC_gjy(){
		return this.C_GJY;
	}
	/**
	*setC_gjy(java.lang.String)
	*/
	public void setC_gjy(String c_gjy){
		this.C_GJY=c_gjy;
	}
	/**
	* getV_gjyxm(void) 
	*/
	public String getV_gjyxm(){
		return this.V_GJYXM;
	}
	/**
	*setV_gjyxm(java.lang.String)
	*/
	public void setV_gjyxm(String v_gjyxm){
		this.V_GJYXM=v_gjyxm;
	}
	/**
	* getT_rssj(void) 
	*/
	public String getT_rssj(){
		return this.T_RSSJ;
	}
	/**
	*setT_rssj(java.lang.String)
	*/
	public void setT_rssj(String t_rssj){
		this.T_RSSJ=t_rssj;
	}
	/**
	* getV_rsyy(void) 
	*/
	public String getV_rsyy(){
		return this.V_RSYY;
	}
	/**
	*setV_rsyy(java.lang.String)
	*/
	public void setV_rsyy(String v_rsyy){
		this.V_RSYY=v_rsyy;
	}
	/**
	* getN_sjgyts(void) 
	*/
	public String getN_sjgyts(){
		return this.N_SJGYTS;
	}
	/**
	*setN_sjgyts(java.lang.String)
	*/
	public void setN_sjgyts(String n_sjgyts){
		this.N_SJGYTS=n_sjgyts;
	}
	/**
	* getV_dah(void) 
	*/
	public String getV_dah(){
		return this.V_DAH;
	}
	/**
	*setV_dah(java.lang.String)
	*/
	public void setV_dah(String v_dah){
		this.V_DAH=v_dah;
	}


}