package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasFlyzHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_flyz_h")
public class CrpasFlyzHVO {
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
	* EMENDENUM 修改枚举
	*/
	@Column(columnName="emendenum",dataType="int",dataLength=0,nullAble="Y",comment="修改枚举")
	private String EMENDENUM = "emendenum";
	/**
	* BILLVERSIONPK 单据版本pk
	*/
	@Column(columnName="billversionpk",dataType="varchar",dataLength=50,nullAble="Y",comment="单据版本pk")
	private String BILLVERSIONPK = "billversionpk";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
	/**
	* C_XTFQDW 协同发起单位
	*/
	@Column(columnName="c_xtfqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="协同发起单位")
	private String C_XTFQDW = "c_xtfqdw";
	/**
	* C_XTFQR 协同发起人
	*/
	@Column(columnName="c_xtfqr",dataType="varchar",dataLength=20,nullAble="Y",comment="协同发起人")
	private String C_XTFQR = "c_xtfqr";
	/**
	* T_XTFQSJ 协同发起时间
	*/
	@Column(columnName="t_xtfqsj",dataType="char",dataLength=19,nullAble="Y",comment="协同发起时间")
	private String T_XTFQSJ = "t_xtfqsj";
	/**
	* C_XTJSDW 协同接收单位
	*/
	@Column(columnName="c_xtjsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="协同接收单位")
	private String C_XTJSDW = "c_xtjsdw";
	/**
	* C_XTJSR 协同接收人
	*/
	@Column(columnName="c_xtjsr",dataType="varchar",dataLength=20,nullAble="Y",comment="协同接收人")
	private String C_XTJSR = "c_xtjsr";
	/**
	* T_XTJSSJ 协同接收时间
	*/
	@Column(columnName="t_xtjssj",dataType="char",dataLength=19,nullAble="Y",comment="协同接收时间")
	private String T_XTJSSJ = "t_xtjssj";
	/**
	* T_XTWCSJ 协同完成时间
	*/
	@Column(columnName="t_xtwcsj",dataType="char",dataLength=19,nullAble="Y",comment="协同完成时间")
	private String T_XTWCSJ = "t_xtwcsj";
	/**
	* C_XTZT 协同状态
	*/
	@Column(columnName="c_xtzt",dataType="varchar",dataLength=20,nullAble="Y",comment="协同状态")
	private String C_XTZT = "c_xtzt";
	/**
	* PK_FLYZ_H 主键
	*/
	@Column(columnName="pk_flyz_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_FLYZ_H = "pk_flyz_h";
	/**
	* V_PTAJLX 平台案件类型
	*/
	@Column(columnName="v_ptajlx",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件类型")
	private String V_PTAJLX = "v_ptajlx";
	/**
	* V_PTAJZJ 平台案件主键
	*/
	@Column(columnName="v_ptajzj",dataType="varchar",dataLength=20,nullAble="Y",comment="平台案件主键")
	private String V_PTAJZJ = "v_ptajzj";
	/**
	* V_PTBH 平台案件编号
	*/
	@Column(columnName="v_ptbh",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件编号")
	private String V_PTBH = "v_ptbh";
	/**
	* V_AJBH 案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* V_SQXX 申请信息
	*/
	@Column(columnName="v_sqxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="申请信息")
	private String V_SQXX = "v_sqxx";
	/**
	* T_SQSJ 申请时间
	*/
	@Column(columnName="t_sqsj",dataType="char",dataLength=19,nullAble="Y",comment="申请时间")
	private String T_SQSJ = "t_sqsj";
	/**
	* C_SHJG 审核结果
	*/
	@Column(columnName="c_shjg",dataType="varchar",dataLength=20,nullAble="Y",comment="审核结果")
	private String C_SHJG = "c_shjg";
	/**
	* V_THXX 退回信息
	*/
	@Column(columnName="v_thxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="退回信息")
	private String V_THXX = "v_thxx";
	/**
	* V_SHRXM 审核人姓名
	*/
	@Column(columnName="v_shrxm",dataType="varchar",dataLength=100,nullAble="Y",comment="审核人姓名")
	private String V_SHRXM = "v_shrxm";
	/**
	* C_SHR 审核人
	*/
	@Column(columnName="c_shr",dataType="varchar",dataLength=20,nullAble="Y",comment="审核人")
	private String C_SHR = "c_shr";
	/**
	* T_SHSJ 审核时间
	*/
	@Column(columnName="t_shsj",dataType="char",dataLength=19,nullAble="Y",comment="审核时间")
	private String T_SHSJ = "t_shsj";
	/**
	* V_ZPLVSXM 指派律师姓名
	*/
	@Column(columnName="v_zplvsxm",dataType="varchar",dataLength=100,nullAble="Y",comment="指派律师姓名")
	private String V_ZPLVSXM = "v_zplvsxm";
	/**
	* V_LSSWS 律师事务所
	*/
	@Column(columnName="v_lssws",dataType="varchar",dataLength=100,nullAble="Y",comment="律师事务所")
	private String V_LSSWS = "v_lssws";
	/**
	* T_ZPSJ 指派时间
	*/
	@Column(columnName="t_zpsj",dataType="char",dataLength=19,nullAble="Y",comment="指派时间")
	private String T_ZPSJ = "t_zpsj";
	/**
	* V_FKRXM 反馈人姓名
	*/
	@Column(columnName="v_fkrxm",dataType="varchar",dataLength=100,nullAble="Y",comment="反馈人姓名")
	private String V_FKRXM = "v_fkrxm";
	/**
	* C_FKR 反馈人id
	*/
	@Column(columnName="c_fkr",dataType="varchar",dataLength=20,nullAble="Y",comment="反馈人id")
	private String C_FKR = "c_fkr";
	/**
	* V_FKNR 反馈内容
	*/
	@Column(columnName="v_fknr",dataType="varchar",dataLength=200,nullAble="Y",comment="反馈内容")
	private String V_FKNR = "v_fknr";
	/**
	* T_FKSJ 反馈时间
	*/
	@Column(columnName="t_fksj",dataType="char",dataLength=19,nullAble="Y",comment="反馈时间")
	private String T_FKSJ = "t_fksj";
	/**
	* V_SQBH 申请编号
	*/
	@Column(columnName="v_sqbh",dataType="varchar",dataLength=50,nullAble="Y",comment="申请编号")
	private String V_SQBH = "v_sqbh";
	/**
	* V_XYRBH 嫌疑人编号
	*/
	@Column(columnName="v_xyrbh",dataType="varchar",dataLength=50,nullAble="Y",comment="嫌疑人编号")
	private String V_XYRBH = "v_xyrbh";
	/**
	* V_SQYZRXM 申请援助人姓名
	*/
	@Column(columnName="v_sqyzrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="申请援助人姓名")
	private String V_SQYZRXM = "v_sqyzrxm";
	/**
	* C_SQDW 申请单位编号
	*/
	@Column(columnName="c_sqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="申请单位编号")
	private String C_SQDW = "c_sqdw";
	/**
	* V_SQDWMC 申请单位
	*/
	@Column(columnName="v_sqdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="申请单位")
	private String V_SQDWMC = "v_sqdwmc";
	/**
	* V_SQJBR 申请经办人
	*/
	@Column(columnName="v_sqjbr",dataType="varchar",dataLength=20,nullAble="Y",comment="申请经办人")
	private String V_SQJBR = "v_sqjbr";
	/**
	* C_JSDW 接收单位编号
	*/
	@Column(columnName="c_jsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="接收单位编号")
	private String C_JSDW = "c_jsdw";
	/**
	* V_JSDWMC 接收单位
	*/
	@Column(columnName="v_jsdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="接收单位")
	private String V_JSDWMC = "v_jsdwmc";
	/**
	* V_ZPLSZYZH 指派律师执业证号
	*/
	@Column(columnName="v_zplszyzh",dataType="varchar",dataLength=50,nullAble="Y",comment="指派律师执业证号")
	private String V_ZPLSZYZH = "v_zplszyzh";
	/**
	* V_LSJGDM 律所机构代码
	*/
	@Column(columnName="v_lsjgdm",dataType="varchar",dataLength=50,nullAble="Y",comment="律所机构代码")
	private String V_LSJGDM = "v_lsjgdm";
	/**
	* C_SQLX 申请类型
	*/
	@Column(columnName="c_sqlx",dataType="varchar",dataLength=20,nullAble="Y",comment="申请类型")
	private String C_SQLX = "c_sqlx";
	/**
	* C_YZQX 援助期限
	*/
	@Column(columnName="c_yzqx",dataType="varchar",dataLength=20,nullAble="Y",comment="援助期限")
	private String C_YZQX = "c_yzqx";
	/**
	* T_JASJ 结案时间
	*/
	@Column(columnName="t_jasj",dataType="char",dataLength=19,nullAble="Y",comment="结案时间")
	private String T_JASJ = "t_jasj";
	/**
	* C_BJJD 报结阶段
	*/
	@Column(columnName="c_bjjd",dataType="varchar",dataLength=20,nullAble="Y",comment="报结阶段")
	private String C_BJJD = "c_bjjd";
	/**
	* C_JADW 结案单位
	*/
	@Column(columnName="c_jadw",dataType="varchar",dataLength=20,nullAble="Y",comment="结案单位")
	private String C_JADW = "c_jadw";
	/**
	* V_JAWSH 结案文书号
	*/
	@Column(columnName="v_jawsh",dataType="varchar",dataLength=100,nullAble="Y",comment="结案文书号")
	private String V_JAWSH = "v_jawsh";
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
	@Column(columnName="approvestatus",dataType="varchar",dataLength=20,nullAble="Y",comment="审批状态")
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
	* getC_xtfqdw(void) 
	*/
	public String getC_xtfqdw(){
		return this.C_XTFQDW;
	}
	/**
	*setC_xtfqdw(java.lang.String)
	*/
	public void setC_xtfqdw(String c_xtfqdw){
		this.C_XTFQDW=c_xtfqdw;
	}
	/**
	* getC_xtfqr(void) 
	*/
	public String getC_xtfqr(){
		return this.C_XTFQR;
	}
	/**
	*setC_xtfqr(java.lang.String)
	*/
	public void setC_xtfqr(String c_xtfqr){
		this.C_XTFQR=c_xtfqr;
	}
	/**
	* getT_xtfqsj(void) 
	*/
	public String getT_xtfqsj(){
		return this.T_XTFQSJ;
	}
	/**
	*setT_xtfqsj(java.lang.String)
	*/
	public void setT_xtfqsj(String t_xtfqsj){
		this.T_XTFQSJ=t_xtfqsj;
	}
	/**
	* getC_xtjsdw(void) 
	*/
	public String getC_xtjsdw(){
		return this.C_XTJSDW;
	}
	/**
	*setC_xtjsdw(java.lang.String)
	*/
	public void setC_xtjsdw(String c_xtjsdw){
		this.C_XTJSDW=c_xtjsdw;
	}
	/**
	* getC_xtjsr(void) 
	*/
	public String getC_xtjsr(){
		return this.C_XTJSR;
	}
	/**
	*setC_xtjsr(java.lang.String)
	*/
	public void setC_xtjsr(String c_xtjsr){
		this.C_XTJSR=c_xtjsr;
	}
	/**
	* getT_xtjssj(void) 
	*/
	public String getT_xtjssj(){
		return this.T_XTJSSJ;
	}
	/**
	*setT_xtjssj(java.lang.String)
	*/
	public void setT_xtjssj(String t_xtjssj){
		this.T_XTJSSJ=t_xtjssj;
	}
	/**
	* getT_xtwcsj(void) 
	*/
	public String getT_xtwcsj(){
		return this.T_XTWCSJ;
	}
	/**
	*setT_xtwcsj(java.lang.String)
	*/
	public void setT_xtwcsj(String t_xtwcsj){
		this.T_XTWCSJ=t_xtwcsj;
	}
	/**
	* getC_xtzt(void) 
	*/
	public String getC_xtzt(){
		return this.C_XTZT;
	}
	/**
	*setC_xtzt(java.lang.String)
	*/
	public void setC_xtzt(String c_xtzt){
		this.C_XTZT=c_xtzt;
	}
	/**
	* getPk_flyz_h(void) 
	*/
	public String getPk_flyz_h(){
		return this.PK_FLYZ_H;
	}
	/**
	*setPk_flyz_h(java.lang.String)
	*/
	public void setPk_flyz_h(String pk_flyz_h){
		this.PK_FLYZ_H=pk_flyz_h;
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
	* getV_ptbh(void) 
	*/
	public String getV_ptbh(){
		return this.V_PTBH;
	}
	/**
	*setV_ptbh(java.lang.String)
	*/
	public void setV_ptbh(String v_ptbh){
		this.V_PTBH=v_ptbh;
	}
	/**
	* getV_ajbh(void) 
	*/
	public String getV_ajbh(){
		return this.V_AJBH;
	}
	/**
	*setV_ajbh(java.lang.String)
	*/
	public void setV_ajbh(String v_ajbh){
		this.V_AJBH=v_ajbh;
	}
	/**
	* getV_sqxx(void) 
	*/
	public String getV_sqxx(){
		return this.V_SQXX;
	}
	/**
	*setV_sqxx(java.lang.String)
	*/
	public void setV_sqxx(String v_sqxx){
		this.V_SQXX=v_sqxx;
	}
	/**
	* getT_sqsj(void) 
	*/
	public String getT_sqsj(){
		return this.T_SQSJ;
	}
	/**
	*setT_sqsj(java.lang.String)
	*/
	public void setT_sqsj(String t_sqsj){
		this.T_SQSJ=t_sqsj;
	}
	/**
	* getC_shjg(void) 
	*/
	public String getC_shjg(){
		return this.C_SHJG;
	}
	/**
	*setC_shjg(java.lang.String)
	*/
	public void setC_shjg(String c_shjg){
		this.C_SHJG=c_shjg;
	}
	/**
	* getV_thxx(void) 
	*/
	public String getV_thxx(){
		return this.V_THXX;
	}
	/**
	*setV_thxx(java.lang.String)
	*/
	public void setV_thxx(String v_thxx){
		this.V_THXX=v_thxx;
	}
	/**
	* getV_shrxm(void) 
	*/
	public String getV_shrxm(){
		return this.V_SHRXM;
	}
	/**
	*setV_shrxm(java.lang.String)
	*/
	public void setV_shrxm(String v_shrxm){
		this.V_SHRXM=v_shrxm;
	}
	/**
	* getC_shr(void) 
	*/
	public String getC_shr(){
		return this.C_SHR;
	}
	/**
	*setC_shr(java.lang.String)
	*/
	public void setC_shr(String c_shr){
		this.C_SHR=c_shr;
	}
	/**
	* getT_shsj(void) 
	*/
	public String getT_shsj(){
		return this.T_SHSJ;
	}
	/**
	*setT_shsj(java.lang.String)
	*/
	public void setT_shsj(String t_shsj){
		this.T_SHSJ=t_shsj;
	}
	/**
	* getV_zplvsxm(void) 
	*/
	public String getV_zplvsxm(){
		return this.V_ZPLVSXM;
	}
	/**
	*setV_zplvsxm(java.lang.String)
	*/
	public void setV_zplvsxm(String v_zplvsxm){
		this.V_ZPLVSXM=v_zplvsxm;
	}
	/**
	* getV_lssws(void) 
	*/
	public String getV_lssws(){
		return this.V_LSSWS;
	}
	/**
	*setV_lssws(java.lang.String)
	*/
	public void setV_lssws(String v_lssws){
		this.V_LSSWS=v_lssws;
	}
	/**
	* getT_zpsj(void) 
	*/
	public String getT_zpsj(){
		return this.T_ZPSJ;
	}
	/**
	*setT_zpsj(java.lang.String)
	*/
	public void setT_zpsj(String t_zpsj){
		this.T_ZPSJ=t_zpsj;
	}
	/**
	* getV_fkrxm(void) 
	*/
	public String getV_fkrxm(){
		return this.V_FKRXM;
	}
	/**
	*setV_fkrxm(java.lang.String)
	*/
	public void setV_fkrxm(String v_fkrxm){
		this.V_FKRXM=v_fkrxm;
	}
	/**
	* getC_fkr(void) 
	*/
	public String getC_fkr(){
		return this.C_FKR;
	}
	/**
	*setC_fkr(java.lang.String)
	*/
	public void setC_fkr(String c_fkr){
		this.C_FKR=c_fkr;
	}
	/**
	* getV_fknr(void) 
	*/
	public String getV_fknr(){
		return this.V_FKNR;
	}
	/**
	*setV_fknr(java.lang.String)
	*/
	public void setV_fknr(String v_fknr){
		this.V_FKNR=v_fknr;
	}
	/**
	* getT_fksj(void) 
	*/
	public String getT_fksj(){
		return this.T_FKSJ;
	}
	/**
	*setT_fksj(java.lang.String)
	*/
	public void setT_fksj(String t_fksj){
		this.T_FKSJ=t_fksj;
	}
	/**
	* getV_sqbh(void) 
	*/
	public String getV_sqbh(){
		return this.V_SQBH;
	}
	/**
	*setV_sqbh(java.lang.String)
	*/
	public void setV_sqbh(String v_sqbh){
		this.V_SQBH=v_sqbh;
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
	* getV_sqyzrxm(void) 
	*/
	public String getV_sqyzrxm(){
		return this.V_SQYZRXM;
	}
	/**
	*setV_sqyzrxm(java.lang.String)
	*/
	public void setV_sqyzrxm(String v_sqyzrxm){
		this.V_SQYZRXM=v_sqyzrxm;
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
	* getV_sqjbr(void) 
	*/
	public String getV_sqjbr(){
		return this.V_SQJBR;
	}
	/**
	*setV_sqjbr(java.lang.String)
	*/
	public void setV_sqjbr(String v_sqjbr){
		this.V_SQJBR=v_sqjbr;
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
	* getV_jsdwmc(void) 
	*/
	public String getV_jsdwmc(){
		return this.V_JSDWMC;
	}
	/**
	*setV_jsdwmc(java.lang.String)
	*/
	public void setV_jsdwmc(String v_jsdwmc){
		this.V_JSDWMC=v_jsdwmc;
	}
	/**
	* getV_zplszyzh(void) 
	*/
	public String getV_zplszyzh(){
		return this.V_ZPLSZYZH;
	}
	/**
	*setV_zplszyzh(java.lang.String)
	*/
	public void setV_zplszyzh(String v_zplszyzh){
		this.V_ZPLSZYZH=v_zplszyzh;
	}
	/**
	* getV_lsjgdm(void) 
	*/
	public String getV_lsjgdm(){
		return this.V_LSJGDM;
	}
	/**
	*setV_lsjgdm(java.lang.String)
	*/
	public void setV_lsjgdm(String v_lsjgdm){
		this.V_LSJGDM=v_lsjgdm;
	}
	/**
	* getC_sqlx(void) 
	*/
	public String getC_sqlx(){
		return this.C_SQLX;
	}
	/**
	*setC_sqlx(java.lang.String)
	*/
	public void setC_sqlx(String c_sqlx){
		this.C_SQLX=c_sqlx;
	}
	/**
	* getC_yzqx(void) 
	*/
	public String getC_yzqx(){
		return this.C_YZQX;
	}
	/**
	*setC_yzqx(java.lang.String)
	*/
	public void setC_yzqx(String c_yzqx){
		this.C_YZQX=c_yzqx;
	}
	/**
	* getT_jasj(void) 
	*/
	public String getT_jasj(){
		return this.T_JASJ;
	}
	/**
	*setT_jasj(java.lang.String)
	*/
	public void setT_jasj(String t_jasj){
		this.T_JASJ=t_jasj;
	}
	/**
	* getC_bjjd(void) 
	*/
	public String getC_bjjd(){
		return this.C_BJJD;
	}
	/**
	*setC_bjjd(java.lang.String)
	*/
	public void setC_bjjd(String c_bjjd){
		this.C_BJJD=c_bjjd;
	}
	/**
	* getC_jadw(void) 
	*/
	public String getC_jadw(){
		return this.C_JADW;
	}
	/**
	*setC_jadw(java.lang.String)
	*/
	public void setC_jadw(String c_jadw){
		this.C_JADW=c_jadw;
	}
	/**
	* getV_jawsh(void) 
	*/
	public String getV_jawsh(){
		return this.V_JAWSH;
	}
	/**
	*setV_jawsh(java.lang.String)
	*/
	public void setV_jawsh(String v_jawsh){
		this.V_JAWSH=v_jawsh;
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


}