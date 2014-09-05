package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasXxgxHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_xxgx_h")
public class CrpasXxgxHVO {
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
	* PK_XXGX_H 主键
	*/
	@Column(columnName="pk_xxgx_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_XXGX_H = "pk_xxgx_h";
	/**
	* V_PTAJLX 平台案件类型
	*/
	@Column(columnName="v_ptajlx",dataType="varchar",dataLength=20,nullAble="Y",comment="平台案件类型")
	private String V_PTAJLX = "v_ptajlx";
	/**
	* V_PTAJZJ 平台案件主键
	*/
	@Column(columnName="v_ptajzj",dataType="char",dataLength=20,nullAble="Y",comment="平台案件主键")
	private String V_PTAJZJ = "v_ptajzj";
	/**
	* C_GXXXLX 共享信息类型
	*/
	@Column(columnName="c_gxxxlx",dataType="varchar",dataLength=20,nullAble="Y",comment="共享信息类型")
	private String C_GXXXLX = "c_gxxxlx";
	/**
	* V_GXSQXX 共享申请信息
	*/
	@Column(columnName="v_gxsqxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="共享申请信息")
	private String V_GXSQXX = "v_gxsqxx";
	/**
	* V_SQRXM 申请人姓名
	*/
	@Column(columnName="v_sqrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="申请人姓名")
	private String V_SQRXM = "v_sqrxm";
	/**
	* C_SQR 申请人
	*/
	@Column(columnName="c_sqr",dataType="varchar",dataLength=20,nullAble="Y",comment="申请人")
	private String C_SQR = "c_sqr";
	/**
	* T_SQSJ 申请时间
	*/
	@Column(columnName="t_sqsj",dataType="char",dataLength=19,nullAble="Y",comment="申请时间")
	private String T_SQSJ = "t_sqsj";
	/**
	* B_SFTYGX 是否同意共享
	*/
	@Column(columnName="b_sftygx",dataType="varchar",dataLength=20,nullAble="Y",comment="是否同意共享")
	private String B_SFTYGX = "b_sftygx";
	/**
	* V_GXXXFKNR 共享信息反馈内容
	*/
	@Column(columnName="v_gxxxfknr",dataType="varchar",dataLength=2000,nullAble="Y",comment="共享信息反馈内容")
	private String V_GXXXFKNR = "v_gxxxfknr";
	/**
	* V_FKRXM 反馈人姓名
	*/
	@Column(columnName="v_fkrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="反馈人姓名")
	private String V_FKRXM = "v_fkrxm";
	/**
	* C_FKR 反馈人
	*/
	@Column(columnName="c_fkr",dataType="varchar",dataLength=20,nullAble="Y",comment="反馈人")
	private String C_FKR = "c_fkr";
	/**
	* T_FKSJ 反馈时间
	*/
	@Column(columnName="t_fksj",dataType="char",dataLength=19,nullAble="Y",comment="反馈时间")
	private String T_FKSJ = "t_fksj";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
	/**
	* V_PTBH 平台案件编号
	*/
	@Column(columnName="v_ptbh",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件编号")
	private String V_PTBH = "v_ptbh";
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
	* C_XXGXZL 信息共享种类
	*/
	@Column(columnName="c_xxgxzl",dataType="varchar",dataLength=20,nullAble="Y",comment="信息共享种类")
	private String C_XXGXZL = "c_xxgxzl";
	/**
	* V_GXXXBH 共享信息编号
	*/
	@Column(columnName="v_gxxxbh",dataType="varchar",dataLength=50,nullAble="Y",comment="共享信息编号")
	private String V_GXXXBH = "v_gxxxbh";
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
	* C_FKDW 反馈单位编号
	*/
	@Column(columnName="c_fkdw",dataType="varchar",dataLength=20,nullAble="Y",comment="反馈单位编号")
	private String C_FKDW = "c_fkdw";
	/**
	* V_FKDWMC 反馈单位
	*/
	@Column(columnName="v_fkdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="反馈单位")
	private String V_FKDWMC = "v_fkdwmc";
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
	* getPk_xxgx_h(void) 
	*/
	public String getPk_xxgx_h(){
		return this.PK_XXGX_H;
	}
	/**
	*setPk_xxgx_h(java.lang.String)
	*/
	public void setPk_xxgx_h(String pk_xxgx_h){
		this.PK_XXGX_H=pk_xxgx_h;
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
	* getC_gxxxlx(void) 
	*/
	public String getC_gxxxlx(){
		return this.C_GXXXLX;
	}
	/**
	*setC_gxxxlx(java.lang.String)
	*/
	public void setC_gxxxlx(String c_gxxxlx){
		this.C_GXXXLX=c_gxxxlx;
	}
	/**
	* getV_gxsqxx(void) 
	*/
	public String getV_gxsqxx(){
		return this.V_GXSQXX;
	}
	/**
	*setV_gxsqxx(java.lang.String)
	*/
	public void setV_gxsqxx(String v_gxsqxx){
		this.V_GXSQXX=v_gxsqxx;
	}
	/**
	* getV_sqrxm(void) 
	*/
	public String getV_sqrxm(){
		return this.V_SQRXM;
	}
	/**
	*setV_sqrxm(java.lang.String)
	*/
	public void setV_sqrxm(String v_sqrxm){
		this.V_SQRXM=v_sqrxm;
	}
	/**
	* getC_sqr(void) 
	*/
	public String getC_sqr(){
		return this.C_SQR;
	}
	/**
	*setC_sqr(java.lang.String)
	*/
	public void setC_sqr(String c_sqr){
		this.C_SQR=c_sqr;
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
	* getB_sftygx(void) 
	*/
	public String getB_sftygx(){
		return this.B_SFTYGX;
	}
	/**
	*setB_sftygx(java.lang.String)
	*/
	public void setB_sftygx(String b_sftygx){
		this.B_SFTYGX=b_sftygx;
	}
	/**
	* getV_gxxxfknr(void) 
	*/
	public String getV_gxxxfknr(){
		return this.V_GXXXFKNR;
	}
	/**
	*setV_gxxxfknr(java.lang.String)
	*/
	public void setV_gxxxfknr(String v_gxxxfknr){
		this.V_GXXXFKNR=v_gxxxfknr;
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
	* getC_xxgxzl(void) 
	*/
	public String getC_xxgxzl(){
		return this.C_XXGXZL;
	}
	/**
	*setC_xxgxzl(java.lang.String)
	*/
	public void setC_xxgxzl(String c_xxgxzl){
		this.C_XXGXZL=c_xxgxzl;
	}
	/**
	* getV_gxxxbh(void) 
	*/
	public String getV_gxxxbh(){
		return this.V_GXXXBH;
	}
	/**
	*setV_gxxxbh(java.lang.String)
	*/
	public void setV_gxxxbh(String v_gxxxbh){
		this.V_GXXXBH=v_gxxxbh;
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
	* getC_fkdw(void) 
	*/
	public String getC_fkdw(){
		return this.C_FKDW;
	}
	/**
	*setC_fkdw(java.lang.String)
	*/
	public void setC_fkdw(String c_fkdw){
		this.C_FKDW=c_fkdw;
	}
	/**
	* getV_fkdwmc(void) 
	*/
	public String getV_fkdwmc(){
		return this.V_FKDWMC;
	}
	/**
	*setV_fkdwmc(java.lang.String)
	*/
	public void setV_fkdwmc(String v_fkdwmc){
		this.V_FKDWMC=v_fkdwmc;
	}


}