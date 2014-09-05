package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSsxsysHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ssxsys_h")
public class CrpasSsxsysHVO {
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
	* PK_SSXSYS_H 主键
	*/
	@Column(columnName="pk_ssxsys_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_SSXSYS_H = "pk_ssxsys_h";
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
	* V_SSXSXX 诉讼线索信息
	*/
	@Column(columnName="v_ssxsxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="诉讼线索信息")
	private String V_SSXSXX = "v_ssxsxx";
	/**
	* C_SSXSYSDW 诉讼线索移送单位
	*/
	@Column(columnName="c_ssxsysdw",dataType="varchar",dataLength=20,nullAble="Y",comment="诉讼线索移送单位")
	private String C_SSXSYSDW = "c_ssxsysdw";
	/**
	* V_SSXSYSDWMC 诉讼线索移送单位名称
	*/
	@Column(columnName="v_ssxsysdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="诉讼线索移送单位名称")
	private String V_SSXSYSDWMC = "v_ssxsysdwmc";
	/**
	* C_SSXSYSR 诉讼线索移送人
	*/
	@Column(columnName="c_ssxsysr",dataType="varchar",dataLength=20,nullAble="Y",comment="诉讼线索移送人")
	private String C_SSXSYSR = "c_ssxsysr";
	/**
	* V_SSXSYSRXM 诉讼线索移送人姓名
	*/
	@Column(columnName="v_ssxsysrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="诉讼线索移送人姓名")
	private String V_SSXSYSRXM = "v_ssxsysrxm";
	/**
	* D_YSRQ 移送日期
	*/
	@Column(columnName="d_ysrq",dataType="char",dataLength=19,nullAble="Y",comment="移送日期")
	private String D_YSRQ = "d_ysrq";
	/**
	* C_JSDW 接收单位
	*/
	@Column(columnName="c_jsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="接收单位")
	private String C_JSDW = "c_jsdw";
	/**
	* V_JSDWMC 接收单位名称
	*/
	@Column(columnName="v_jsdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="接收单位名称")
	private String V_JSDWMC = "v_jsdwmc";
	/**
	* C_JSR 接收人
	*/
	@Column(columnName="c_jsr",dataType="varchar",dataLength=20,nullAble="Y",comment="接收人")
	private String C_JSR = "c_jsr";
	/**
	* V_JSRXM 接收人姓名
	*/
	@Column(columnName="v_jsrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="接收人姓名")
	private String V_JSRXM = "v_jsrxm";
	/**
	* D_JSRQ 接收日期
	*/
	@Column(columnName="d_jsrq",dataType="char",dataLength=19,nullAble="Y",comment="接收日期")
	private String D_JSRQ = "d_jsrq";
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
	* V_XSBH 线索编号
	*/
	@Column(columnName="v_xsbh",dataType="varchar",dataLength=50,nullAble="Y",comment="线索编号")
	private String V_XSBH = "v_xsbh";
	/**
	* V_XSMC 线索名称
	*/
	@Column(columnName="v_xsmc",dataType="varchar",dataLength=100,nullAble="Y",comment="线索名称")
	private String V_XSMC = "v_xsmc";
	/**
	* C_XSLB 线索类别
	*/
	@Column(columnName="c_xslb",dataType="varchar",dataLength=20,nullAble="Y",comment="线索类别")
	private String C_XSLB = "c_xslb";
	/**
	* C_XSLY 线索来源
	*/
	@Column(columnName="c_xsly",dataType="varchar",dataLength=20,nullAble="Y",comment="线索来源")
	private String C_XSLY = "c_xsly";
	/**
	* C_XSLINGY 涉案领域
	*/
	@Column(columnName="c_xslingy",dataType="varchar",dataLength=20,nullAble="Y",comment="涉案领域")
	private String C_XSLINGY = "c_xslingy";
	/**
	* V_XSQTLY 涉案其他领域
	*/
	@Column(columnName="v_xsqtly",dataType="varchar",dataLength=200,nullAble="Y",comment="涉案其他领域")
	private String V_XSQTLY = "v_xsqtly";
	/**
	* C_XSFL 线索分类
	*/
	@Column(columnName="c_xsfl",dataType="varchar",dataLength=20,nullAble="Y",comment="线索分类")
	private String C_XSFL = "c_xsfl";
	/**
	* B_SFSJZDZRSG 是否涉及重大责任事故
	*/
	@Column(columnName="b_sfsjzdzrsg",dataType="char",dataLength=1,nullAble="Y",comment="是否涉及重大责任事故")
	private String B_SFSJZDZRSG = "b_sfsjzdzrsg";
	/**
	* C_SGLX 事故类型
	*/
	@Column(columnName="c_sglx",dataType="varchar",dataLength=20,nullAble="Y",comment="事故类型")
	private String C_SGLX = "c_sglx";
	/**
	* B_SFYAXS 是否要案线索
	*/
	@Column(columnName="b_sfyaxs",dataType="char",dataLength=1,nullAble="Y",comment="是否要案线索")
	private String B_SFYAXS = "b_sfyaxs";
	/**
	* V_BJBRXM 被举报人姓名
	*/
	@Column(columnName="v_bjbrxm",dataType="varchar",dataLength=300,nullAble="Y",comment="被举报人姓名")
	private String V_BJBRXM = "v_bjbrxm";
	/**
	* V_SXZYWT 涉嫌主要问题
	*/
	@Column(columnName="v_sxzywt",dataType="varchar",dataLength=300,nullAble="Y",comment="涉嫌主要问题")
	private String V_SXZYWT = "v_sxzywt";
	/**
	* D_XSJBRQ 线索举报日期
	*/
	@Column(columnName="d_xsjbrq",dataType="char",dataLength=19,nullAble="Y",comment="线索举报日期")
	private String D_XSJBRQ = "d_xsjbrq";
	/**
	* C_SLLX 受理类型
	*/
	@Column(columnName="c_sllx",dataType="varchar",dataLength=20,nullAble="Y",comment="受理类型")
	private String C_SLLX = "c_sllx";
	/**
	* C_BALB 备案类别
	*/
	@Column(columnName="c_balb",dataType="varchar",dataLength=20,nullAble="Y",comment="备案类别")
	private String C_BALB = "c_balb";
	/**
	* D_BBRQ 报备日期
	*/
	@Column(columnName="d_bbrq",dataType="char",dataLength=19,nullAble="Y",comment="报备日期")
	private String D_BBRQ = "d_bbrq";
	/**
	* D_CCKSRQ 初查开始日期
	*/
	@Column(columnName="d_ccksrq",dataType="char",dataLength=19,nullAble="Y",comment="初查开始日期")
	private String D_CCKSRQ = "d_ccksrq";
	/**
	* D_CCWCRQ 初查完成日期
	*/
	@Column(columnName="d_ccwcrq",dataType="char",dataLength=19,nullAble="Y",comment="初查完成日期")
	private String D_CCWCRQ = "d_ccwcrq";
	/**
	* C_CCJG 初查结果
	*/
	@Column(columnName="c_ccjg",dataType="varchar",dataLength=20,nullAble="Y",comment="初查结果")
	private String C_CCJG = "c_ccjg";
	/**
	* V_CCQKZY 初查情况摘要
	*/
	@Column(columnName="v_ccqkzy",dataType="varchar",dataLength=2000,nullAble="Y",comment="初查情况摘要")
	private String V_CCQKZY = "v_ccqkzy";
	/**
	* C_XSCLJG 线索处理结果
	*/
	@Column(columnName="c_xscljg",dataType="varchar",dataLength=20,nullAble="Y",comment="线索处理结果")
	private String C_XSCLJG = "c_xscljg";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=4000,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
	/**
	* V_FZ 附注
	*/
	@Column(columnName="v_fz",dataType="varchar",dataLength=2000,nullAble="Y",comment="附注")
	private String V_FZ = "v_fz";
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
	* getV_ssxsxx(void) 
	*/
	public String getV_ssxsxx(){
		return this.V_SSXSXX;
	}
	/**
	*setV_ssxsxx(java.lang.String)
	*/
	public void setV_ssxsxx(String v_ssxsxx){
		this.V_SSXSXX=v_ssxsxx;
	}
	/**
	* getC_ssxsysdw(void) 
	*/
	public String getC_ssxsysdw(){
		return this.C_SSXSYSDW;
	}
	/**
	*setC_ssxsysdw(java.lang.String)
	*/
	public void setC_ssxsysdw(String c_ssxsysdw){
		this.C_SSXSYSDW=c_ssxsysdw;
	}
	/**
	* getV_ssxsysdwmc(void) 
	*/
	public String getV_ssxsysdwmc(){
		return this.V_SSXSYSDWMC;
	}
	/**
	*setV_ssxsysdwmc(java.lang.String)
	*/
	public void setV_ssxsysdwmc(String v_ssxsysdwmc){
		this.V_SSXSYSDWMC=v_ssxsysdwmc;
	}
	/**
	* getC_ssxsysr(void) 
	*/
	public String getC_ssxsysr(){
		return this.C_SSXSYSR;
	}
	/**
	*setC_ssxsysr(java.lang.String)
	*/
	public void setC_ssxsysr(String c_ssxsysr){
		this.C_SSXSYSR=c_ssxsysr;
	}
	/**
	* getV_ssxsysrxm(void) 
	*/
	public String getV_ssxsysrxm(){
		return this.V_SSXSYSRXM;
	}
	/**
	*setV_ssxsysrxm(java.lang.String)
	*/
	public void setV_ssxsysrxm(String v_ssxsysrxm){
		this.V_SSXSYSRXM=v_ssxsysrxm;
	}
	/**
	* getD_ysrq(void) 
	*/
	public String getD_ysrq(){
		return this.D_YSRQ;
	}
	/**
	*setD_ysrq(java.lang.String)
	*/
	public void setD_ysrq(String d_ysrq){
		this.D_YSRQ=d_ysrq;
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
	* getV_xsbh(void) 
	*/
	public String getV_xsbh(){
		return this.V_XSBH;
	}
	/**
	*setV_xsbh(java.lang.String)
	*/
	public void setV_xsbh(String v_xsbh){
		this.V_XSBH=v_xsbh;
	}
	/**
	* getV_xsmc(void) 
	*/
	public String getV_xsmc(){
		return this.V_XSMC;
	}
	/**
	*setV_xsmc(java.lang.String)
	*/
	public void setV_xsmc(String v_xsmc){
		this.V_XSMC=v_xsmc;
	}
	/**
	* getC_xslb(void) 
	*/
	public String getC_xslb(){
		return this.C_XSLB;
	}
	/**
	*setC_xslb(java.lang.String)
	*/
	public void setC_xslb(String c_xslb){
		this.C_XSLB=c_xslb;
	}
	/**
	* getC_xsly(void) 
	*/
	public String getC_xsly(){
		return this.C_XSLY;
	}
	/**
	*setC_xsly(java.lang.String)
	*/
	public void setC_xsly(String c_xsly){
		this.C_XSLY=c_xsly;
	}
	/**
	* getC_xslingy(void) 
	*/
	public String getC_xslingy(){
		return this.C_XSLINGY;
	}
	/**
	*setC_xslingy(java.lang.String)
	*/
	public void setC_xslingy(String c_xslingy){
		this.C_XSLINGY=c_xslingy;
	}
	/**
	* getV_xsqtly(void) 
	*/
	public String getV_xsqtly(){
		return this.V_XSQTLY;
	}
	/**
	*setV_xsqtly(java.lang.String)
	*/
	public void setV_xsqtly(String v_xsqtly){
		this.V_XSQTLY=v_xsqtly;
	}
	/**
	* getC_xsfl(void) 
	*/
	public String getC_xsfl(){
		return this.C_XSFL;
	}
	/**
	*setC_xsfl(java.lang.String)
	*/
	public void setC_xsfl(String c_xsfl){
		this.C_XSFL=c_xsfl;
	}
	/**
	* getB_sfsjzdzrsg(void) 
	*/
	public String getB_sfsjzdzrsg(){
		return this.B_SFSJZDZRSG;
	}
	/**
	*setB_sfsjzdzrsg(java.lang.String)
	*/
	public void setB_sfsjzdzrsg(String b_sfsjzdzrsg){
		this.B_SFSJZDZRSG=b_sfsjzdzrsg;
	}
	/**
	* getC_sglx(void) 
	*/
	public String getC_sglx(){
		return this.C_SGLX;
	}
	/**
	*setC_sglx(java.lang.String)
	*/
	public void setC_sglx(String c_sglx){
		this.C_SGLX=c_sglx;
	}
	/**
	* getB_sfyaxs(void) 
	*/
	public String getB_sfyaxs(){
		return this.B_SFYAXS;
	}
	/**
	*setB_sfyaxs(java.lang.String)
	*/
	public void setB_sfyaxs(String b_sfyaxs){
		this.B_SFYAXS=b_sfyaxs;
	}
	/**
	* getV_bjbrxm(void) 
	*/
	public String getV_bjbrxm(){
		return this.V_BJBRXM;
	}
	/**
	*setV_bjbrxm(java.lang.String)
	*/
	public void setV_bjbrxm(String v_bjbrxm){
		this.V_BJBRXM=v_bjbrxm;
	}
	/**
	* getV_sxzywt(void) 
	*/
	public String getV_sxzywt(){
		return this.V_SXZYWT;
	}
	/**
	*setV_sxzywt(java.lang.String)
	*/
	public void setV_sxzywt(String v_sxzywt){
		this.V_SXZYWT=v_sxzywt;
	}
	/**
	* getD_xsjbrq(void) 
	*/
	public String getD_xsjbrq(){
		return this.D_XSJBRQ;
	}
	/**
	*setD_xsjbrq(java.lang.String)
	*/
	public void setD_xsjbrq(String d_xsjbrq){
		this.D_XSJBRQ=d_xsjbrq;
	}
	/**
	* getC_sllx(void) 
	*/
	public String getC_sllx(){
		return this.C_SLLX;
	}
	/**
	*setC_sllx(java.lang.String)
	*/
	public void setC_sllx(String c_sllx){
		this.C_SLLX=c_sllx;
	}
	/**
	* getC_balb(void) 
	*/
	public String getC_balb(){
		return this.C_BALB;
	}
	/**
	*setC_balb(java.lang.String)
	*/
	public void setC_balb(String c_balb){
		this.C_BALB=c_balb;
	}
	/**
	* getD_bbrq(void) 
	*/
	public String getD_bbrq(){
		return this.D_BBRQ;
	}
	/**
	*setD_bbrq(java.lang.String)
	*/
	public void setD_bbrq(String d_bbrq){
		this.D_BBRQ=d_bbrq;
	}
	/**
	* getD_ccksrq(void) 
	*/
	public String getD_ccksrq(){
		return this.D_CCKSRQ;
	}
	/**
	*setD_ccksrq(java.lang.String)
	*/
	public void setD_ccksrq(String d_ccksrq){
		this.D_CCKSRQ=d_ccksrq;
	}
	/**
	* getD_ccwcrq(void) 
	*/
	public String getD_ccwcrq(){
		return this.D_CCWCRQ;
	}
	/**
	*setD_ccwcrq(java.lang.String)
	*/
	public void setD_ccwcrq(String d_ccwcrq){
		this.D_CCWCRQ=d_ccwcrq;
	}
	/**
	* getC_ccjg(void) 
	*/
	public String getC_ccjg(){
		return this.C_CCJG;
	}
	/**
	*setC_ccjg(java.lang.String)
	*/
	public void setC_ccjg(String c_ccjg){
		this.C_CCJG=c_ccjg;
	}
	/**
	* getV_ccqkzy(void) 
	*/
	public String getV_ccqkzy(){
		return this.V_CCQKZY;
	}
	/**
	*setV_ccqkzy(java.lang.String)
	*/
	public void setV_ccqkzy(String v_ccqkzy){
		this.V_CCQKZY=v_ccqkzy;
	}
	/**
	* getC_xscljg(void) 
	*/
	public String getC_xscljg(){
		return this.C_XSCLJG;
	}
	/**
	*setC_xscljg(java.lang.String)
	*/
	public void setC_xscljg(String c_xscljg){
		this.C_XSCLJG=c_xscljg;
	}
	/**
	* getV_bz(void) 
	*/
	public String getV_bz(){
		return this.V_BZ;
	}
	/**
	*setV_bz(java.lang.String)
	*/
	public void setV_bz(String v_bz){
		this.V_BZ=v_bz;
	}
	/**
	* getV_fz(void) 
	*/
	public String getV_fz(){
		return this.V_FZ;
	}
	/**
	*setV_fz(java.lang.String)
	*/
	public void setV_fz(String v_fz){
		this.V_FZ=v_fz;
	}


}