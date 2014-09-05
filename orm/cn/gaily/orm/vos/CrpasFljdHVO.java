package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasFljdHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_fljd_h")
public class CrpasFljdHVO {
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
	* C_XTJSDW 协同接受单位
	*/
	@Column(columnName="c_xtjsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="协同接受单位")
	private String C_XTJSDW = "c_xtjsdw";
	/**
	* C_XTJSR 协同接受人
	*/
	@Column(columnName="c_xtjsr",dataType="varchar",dataLength=20,nullAble="Y",comment="协同接受人")
	private String C_XTJSR = "c_xtjsr";
	/**
	* T_XTJSSJ 协同接受时间
	*/
	@Column(columnName="t_xtjssj",dataType="char",dataLength=19,nullAble="Y",comment="协同接受时间")
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
	* PK_SSXSYS_H 主键
	*/
	@Column(columnName="pk_ssxsys_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_SSXSYS_H = "pk_ssxsys_h";
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
	* V_AJMC 案件名称
	*/
	@Column(columnName="v_ajmc",dataType="varchar",dataLength=100,nullAble="Y",comment="案件名称")
	private String V_AJMC = "v_ajmc";
	/**
	* D_JDSLRQ 监督受理日期
	*/
	@Column(columnName="d_jdslrq",dataType="char",dataLength=19,nullAble="Y",comment="监督受理日期")
	private String D_JDSLRQ = "d_jdslrq";
	/**
	* B_SFRMJDAJ 是否人民监督员案件
	*/
	@Column(columnName="b_sfrmjdaj",dataType="char",dataLength=1,nullAble="Y",comment="是否人民监督员案件")
	private String B_SFRMJDAJ = "b_sfrmjdaj";
	/**
	* C_LAJDLX 立案监督类型
	*/
	@Column(columnName="c_lajdlx",dataType="varchar",dataLength=20,nullAble="Y",comment="立案监督类型")
	private String C_LAJDLX = "c_lajdlx";
	/**
	* C_AJLY 案件来源
	*/
	@Column(columnName="c_ajly",dataType="varchar",dataLength=20,nullAble="Y",comment="案件来源")
	private String C_AJLY = "c_ajly";
	/**
	* D_YSJBRQ 移送交办日期
	*/
	@Column(columnName="d_ysjbrq",dataType="char",dataLength=19,nullAble="Y",comment="移送交办日期")
	private String D_YSJBRQ = "d_ysjbrq";
	/**
	* C_YSJBJCY 移送交办检察院id
	*/
	@Column(columnName="c_ysjbjcy",dataType="varchar",dataLength=20,nullAble="Y",comment="移送交办检察院id")
	private String C_YSJBJCY = "c_ysjbjcy";
	/**
	* V_YSJBJCYMC 移送交办检察院名称
	*/
	@Column(columnName="v_ysjbjcymc",dataType="varchar",dataLength=100,nullAble="Y",comment="移送交办检察院名称")
	private String V_YSJBJCYMC = "v_ysjbjcymc";
	/**
	* D_XKSBMFKJGRQ 向控申部门反馈结果日期
	*/
	@Column(columnName="d_xksbmfkjgrq",dataType="char",dataLength=19,nullAble="Y",comment="向控申部门反馈结果日期")
	private String D_XKSBMFKJGRQ = "d_xksbmfkjgrq";
	/**
	* B_SFGZAJ 是否关注案
	*/
	@Column(columnName="b_sfgzaj",dataType="char",dataLength=1,nullAble="Y",comment="是否关注案")
	private String B_SFGZAJ = "b_sfgzaj";
	/**
	* V_AJZY 案件摘要
	*/
	@Column(columnName="v_ajzy",dataType="varchar",dataLength=2000,nullAble="Y",comment="案件摘要")
	private String V_AJZY = "v_ajzy";
	/**
	* C_WFZCJG 违法侦查机关id
	*/
	@Column(columnName="c_wfzcjg",dataType="varchar",dataLength=20,nullAble="Y",comment="违法侦查机关id")
	private String C_WFZCJG = "c_wfzcjg";
	/**
	* V_WFZCJGMC 违法侦查机关名称
	*/
	@Column(columnName="v_wfzcjgmc",dataType="varchar",dataLength=100,nullAble="Y",comment="违法侦查机关名称")
	private String V_WFZCJGMC = "v_wfzcjgmc";
	/**
	* V_WFWSH 违法文书号
	*/
	@Column(columnName="v_wfwsh",dataType="varchar",dataLength=100,nullAble="Y",comment="违法文书号")
	private String V_WFWSH = "v_wfwsh";
	/**
	* D_YSZCJGRQ 移送侦查机关日期
	*/
	@Column(columnName="d_yszcjgrq",dataType="char",dataLength=19,nullAble="Y",comment="移送侦查机关日期")
	private String D_YSZCJGRQ = "d_yszcjgrq";
	/**
	* D_YQSMLYRQ 要求说明理由日期
	*/
	@Column(columnName="d_yqsmlyrq",dataType="char",dataLength=19,nullAble="Y",comment="要求说明理由日期")
	private String D_YQSMLYRQ = "d_yqsmlyrq";
	/**
	* D_ZCJGZDLARQ 侦查机关主动立案日期
	*/
	@Column(columnName="d_zcjgzdlarq",dataType="char",dataLength=19,nullAble="Y",comment="侦查机关主动立案日期")
	private String D_ZCJGZDLARQ = "d_zcjgzdlarq";
	/**
	* D_ZCJGZDCARQ 侦查机关主动撤案日期
	*/
	@Column(columnName="d_zcjgzdcarq",dataType="char",dataLength=19,nullAble="Y",comment="侦查机关主动撤案日期")
	private String D_ZCJGZDCARQ = "d_zcjgzdcarq";
	/**
	* D_ZCJGDFRQ 侦查机关答复日期
	*/
	@Column(columnName="d_zcjgdfrq",dataType="char",dataLength=19,nullAble="Y",comment="侦查机关答复日期")
	private String D_ZCJGDFRQ = "d_zcjgdfrq";
	/**
	* V_ZCJGDFLY 侦查机关答复理由
	*/
	@Column(columnName="v_zcjgdfly",dataType="varchar",dataLength=1000,nullAble="Y",comment="侦查机关答复理由")
	private String V_ZCJGDFLY = "v_zcjgdfly";
	/**
	* B_LYSFCL 理由是否成立
	*/
	@Column(columnName="b_lysfcl",dataType="char",dataLength=1,nullAble="Y",comment="理由是否成立")
	private String B_LYSFCL = "b_lysfcl";
	/**
	* D_TZLARQ 通知立案日期
	*/
	@Column(columnName="d_tzlarq",dataType="char",dataLength=19,nullAble="Y",comment="通知立案日期")
	private String D_TZLARQ = "d_tzlarq";
	/**
	* D_TZCARQ 通知撤案日期
	*/
	@Column(columnName="d_tzcarq",dataType="char",dataLength=19,nullAble="Y",comment="通知撤案日期")
	private String D_TZCARQ = "d_tzcarq";
	/**
	* D_ZCJGLARQ 侦查机关立案日期
	*/
	@Column(columnName="d_zcjglarq",dataType="char",dataLength=19,nullAble="Y",comment="侦查机关立案日期")
	private String D_ZCJGLARQ = "d_zcjglarq";
	/**
	* D_ZCJGCARQ 侦查机关撤案日期
	*/
	@Column(columnName="d_zcjgcarq",dataType="char",dataLength=19,nullAble="Y",comment="侦查机关撤案日期")
	private String D_ZCJGCARQ = "d_zcjgcarq";
	/**
	* D_CBRQ 催办日期
	*/
	@Column(columnName="d_cbrq",dataType="char",dataLength=19,nullAble="Y",comment="催办日期")
	private String D_CBRQ = "d_cbrq";
	/**
	* D_FJZWFTZSRQ 发纠正违法通知书日期
	*/
	@Column(columnName="d_fjzwftzsrq",dataType="char",dataLength=19,nullAble="Y",comment="发纠正违法通知书日期")
	private String D_FJZWFTZSRQ = "d_fjzwftzsrq";
	/**
	* V_JZWFTZSWH 纠正违法通知书文号
	*/
	@Column(columnName="v_jzwftzswh",dataType="varchar",dataLength=200,nullAble="Y",comment="纠正违法通知书文号")
	private String V_JZWFTZSWH = "v_jzwftzswh";
	/**
	* D_BSJYXSTJGAJGRQ 报上级院协商同级公安机关日期
	*/
	@Column(columnName="d_bsjyxstjgajgrq",dataType="char",dataLength=19,nullAble="Y",comment="报上级院协商同级公安机关日期")
	private String D_BSJYXSTJGAJGRQ = "d_bsjyxstjgajgrq";
	/**
	* D_BQZJSLLARQ 报请（移送）直接受理立案日期
	*/
	@Column(columnName="d_bqzjsllarq",dataType="char",dataLength=19,nullAble="Y",comment="报请（移送）直接受理立案日期")
	private String D_BQZJSLLARQ = "d_bqzjsllarq";
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
	* getPk_ssxsys_h(void) 
	*/
	public String getPk_ssxsys_h(){
		return this.PK_SSXSYS_H;
	}
	/**
	*setPk_ssxsys_h(java.lang.String)
	*/
	public void setPk_ssxsys_h(String pk_ssxsys_h){
		this.PK_SSXSYS_H=pk_ssxsys_h;
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
	* getV_ajmc(void) 
	*/
	public String getV_ajmc(){
		return this.V_AJMC;
	}
	/**
	*setV_ajmc(java.lang.String)
	*/
	public void setV_ajmc(String v_ajmc){
		this.V_AJMC=v_ajmc;
	}
	/**
	* getD_jdslrq(void) 
	*/
	public String getD_jdslrq(){
		return this.D_JDSLRQ;
	}
	/**
	*setD_jdslrq(java.lang.String)
	*/
	public void setD_jdslrq(String d_jdslrq){
		this.D_JDSLRQ=d_jdslrq;
	}
	/**
	* getB_sfrmjdaj(void) 
	*/
	public String getB_sfrmjdaj(){
		return this.B_SFRMJDAJ;
	}
	/**
	*setB_sfrmjdaj(java.lang.String)
	*/
	public void setB_sfrmjdaj(String b_sfrmjdaj){
		this.B_SFRMJDAJ=b_sfrmjdaj;
	}
	/**
	* getC_lajdlx(void) 
	*/
	public String getC_lajdlx(){
		return this.C_LAJDLX;
	}
	/**
	*setC_lajdlx(java.lang.String)
	*/
	public void setC_lajdlx(String c_lajdlx){
		this.C_LAJDLX=c_lajdlx;
	}
	/**
	* getC_ajly(void) 
	*/
	public String getC_ajly(){
		return this.C_AJLY;
	}
	/**
	*setC_ajly(java.lang.String)
	*/
	public void setC_ajly(String c_ajly){
		this.C_AJLY=c_ajly;
	}
	/**
	* getD_ysjbrq(void) 
	*/
	public String getD_ysjbrq(){
		return this.D_YSJBRQ;
	}
	/**
	*setD_ysjbrq(java.lang.String)
	*/
	public void setD_ysjbrq(String d_ysjbrq){
		this.D_YSJBRQ=d_ysjbrq;
	}
	/**
	* getC_ysjbjcy(void) 
	*/
	public String getC_ysjbjcy(){
		return this.C_YSJBJCY;
	}
	/**
	*setC_ysjbjcy(java.lang.String)
	*/
	public void setC_ysjbjcy(String c_ysjbjcy){
		this.C_YSJBJCY=c_ysjbjcy;
	}
	/**
	* getV_ysjbjcymc(void) 
	*/
	public String getV_ysjbjcymc(){
		return this.V_YSJBJCYMC;
	}
	/**
	*setV_ysjbjcymc(java.lang.String)
	*/
	public void setV_ysjbjcymc(String v_ysjbjcymc){
		this.V_YSJBJCYMC=v_ysjbjcymc;
	}
	/**
	* getD_xksbmfkjgrq(void) 
	*/
	public String getD_xksbmfkjgrq(){
		return this.D_XKSBMFKJGRQ;
	}
	/**
	*setD_xksbmfkjgrq(java.lang.String)
	*/
	public void setD_xksbmfkjgrq(String d_xksbmfkjgrq){
		this.D_XKSBMFKJGRQ=d_xksbmfkjgrq;
	}
	/**
	* getB_sfgzaj(void) 
	*/
	public String getB_sfgzaj(){
		return this.B_SFGZAJ;
	}
	/**
	*setB_sfgzaj(java.lang.String)
	*/
	public void setB_sfgzaj(String b_sfgzaj){
		this.B_SFGZAJ=b_sfgzaj;
	}
	/**
	* getV_ajzy(void) 
	*/
	public String getV_ajzy(){
		return this.V_AJZY;
	}
	/**
	*setV_ajzy(java.lang.String)
	*/
	public void setV_ajzy(String v_ajzy){
		this.V_AJZY=v_ajzy;
	}
	/**
	* getC_wfzcjg(void) 
	*/
	public String getC_wfzcjg(){
		return this.C_WFZCJG;
	}
	/**
	*setC_wfzcjg(java.lang.String)
	*/
	public void setC_wfzcjg(String c_wfzcjg){
		this.C_WFZCJG=c_wfzcjg;
	}
	/**
	* getV_wfzcjgmc(void) 
	*/
	public String getV_wfzcjgmc(){
		return this.V_WFZCJGMC;
	}
	/**
	*setV_wfzcjgmc(java.lang.String)
	*/
	public void setV_wfzcjgmc(String v_wfzcjgmc){
		this.V_WFZCJGMC=v_wfzcjgmc;
	}
	/**
	* getV_wfwsh(void) 
	*/
	public String getV_wfwsh(){
		return this.V_WFWSH;
	}
	/**
	*setV_wfwsh(java.lang.String)
	*/
	public void setV_wfwsh(String v_wfwsh){
		this.V_WFWSH=v_wfwsh;
	}
	/**
	* getD_yszcjgrq(void) 
	*/
	public String getD_yszcjgrq(){
		return this.D_YSZCJGRQ;
	}
	/**
	*setD_yszcjgrq(java.lang.String)
	*/
	public void setD_yszcjgrq(String d_yszcjgrq){
		this.D_YSZCJGRQ=d_yszcjgrq;
	}
	/**
	* getD_yqsmlyrq(void) 
	*/
	public String getD_yqsmlyrq(){
		return this.D_YQSMLYRQ;
	}
	/**
	*setD_yqsmlyrq(java.lang.String)
	*/
	public void setD_yqsmlyrq(String d_yqsmlyrq){
		this.D_YQSMLYRQ=d_yqsmlyrq;
	}
	/**
	* getD_zcjgzdlarq(void) 
	*/
	public String getD_zcjgzdlarq(){
		return this.D_ZCJGZDLARQ;
	}
	/**
	*setD_zcjgzdlarq(java.lang.String)
	*/
	public void setD_zcjgzdlarq(String d_zcjgzdlarq){
		this.D_ZCJGZDLARQ=d_zcjgzdlarq;
	}
	/**
	* getD_zcjgzdcarq(void) 
	*/
	public String getD_zcjgzdcarq(){
		return this.D_ZCJGZDCARQ;
	}
	/**
	*setD_zcjgzdcarq(java.lang.String)
	*/
	public void setD_zcjgzdcarq(String d_zcjgzdcarq){
		this.D_ZCJGZDCARQ=d_zcjgzdcarq;
	}
	/**
	* getD_zcjgdfrq(void) 
	*/
	public String getD_zcjgdfrq(){
		return this.D_ZCJGDFRQ;
	}
	/**
	*setD_zcjgdfrq(java.lang.String)
	*/
	public void setD_zcjgdfrq(String d_zcjgdfrq){
		this.D_ZCJGDFRQ=d_zcjgdfrq;
	}
	/**
	* getV_zcjgdfly(void) 
	*/
	public String getV_zcjgdfly(){
		return this.V_ZCJGDFLY;
	}
	/**
	*setV_zcjgdfly(java.lang.String)
	*/
	public void setV_zcjgdfly(String v_zcjgdfly){
		this.V_ZCJGDFLY=v_zcjgdfly;
	}
	/**
	* getB_lysfcl(void) 
	*/
	public String getB_lysfcl(){
		return this.B_LYSFCL;
	}
	/**
	*setB_lysfcl(java.lang.String)
	*/
	public void setB_lysfcl(String b_lysfcl){
		this.B_LYSFCL=b_lysfcl;
	}
	/**
	* getD_tzlarq(void) 
	*/
	public String getD_tzlarq(){
		return this.D_TZLARQ;
	}
	/**
	*setD_tzlarq(java.lang.String)
	*/
	public void setD_tzlarq(String d_tzlarq){
		this.D_TZLARQ=d_tzlarq;
	}
	/**
	* getD_tzcarq(void) 
	*/
	public String getD_tzcarq(){
		return this.D_TZCARQ;
	}
	/**
	*setD_tzcarq(java.lang.String)
	*/
	public void setD_tzcarq(String d_tzcarq){
		this.D_TZCARQ=d_tzcarq;
	}
	/**
	* getD_zcjglarq(void) 
	*/
	public String getD_zcjglarq(){
		return this.D_ZCJGLARQ;
	}
	/**
	*setD_zcjglarq(java.lang.String)
	*/
	public void setD_zcjglarq(String d_zcjglarq){
		this.D_ZCJGLARQ=d_zcjglarq;
	}
	/**
	* getD_zcjgcarq(void) 
	*/
	public String getD_zcjgcarq(){
		return this.D_ZCJGCARQ;
	}
	/**
	*setD_zcjgcarq(java.lang.String)
	*/
	public void setD_zcjgcarq(String d_zcjgcarq){
		this.D_ZCJGCARQ=d_zcjgcarq;
	}
	/**
	* getD_cbrq(void) 
	*/
	public String getD_cbrq(){
		return this.D_CBRQ;
	}
	/**
	*setD_cbrq(java.lang.String)
	*/
	public void setD_cbrq(String d_cbrq){
		this.D_CBRQ=d_cbrq;
	}
	/**
	* getD_fjzwftzsrq(void) 
	*/
	public String getD_fjzwftzsrq(){
		return this.D_FJZWFTZSRQ;
	}
	/**
	*setD_fjzwftzsrq(java.lang.String)
	*/
	public void setD_fjzwftzsrq(String d_fjzwftzsrq){
		this.D_FJZWFTZSRQ=d_fjzwftzsrq;
	}
	/**
	* getV_jzwftzswh(void) 
	*/
	public String getV_jzwftzswh(){
		return this.V_JZWFTZSWH;
	}
	/**
	*setV_jzwftzswh(java.lang.String)
	*/
	public void setV_jzwftzswh(String v_jzwftzswh){
		this.V_JZWFTZSWH=v_jzwftzswh;
	}
	/**
	* getD_bsjyxstjgajgrq(void) 
	*/
	public String getD_bsjyxstjgajgrq(){
		return this.D_BSJYXSTJGAJGRQ;
	}
	/**
	*setD_bsjyxstjgajgrq(java.lang.String)
	*/
	public void setD_bsjyxstjgajgrq(String d_bsjyxstjgajgrq){
		this.D_BSJYXSTJGAJGRQ=d_bsjyxstjgajgrq;
	}
	/**
	* getD_bqzjsllarq(void) 
	*/
	public String getD_bqzjsllarq(){
		return this.D_BQZJSLLARQ;
	}
	/**
	*setD_bqzjsllarq(java.lang.String)
	*/
	public void setD_bqzjsllarq(String d_bqzjsllarq){
		this.D_BQZJSLLARQ=d_bqzjsllarq;
	}


}