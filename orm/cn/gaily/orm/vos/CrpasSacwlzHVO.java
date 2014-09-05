package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSacwlzHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sacwlz_h")
public class CrpasSacwlzHVO {
	/**
	* V_AJMC 平台案件名称
	*/
	@Column(columnName="v_ajmc",dataType="varchar",dataLength=100,nullAble="Y",comment="平台案件名称")
	private String V_AJMC = "v_ajmc";
	/**
	* ID id
	*/
	@Column(columnName="id",dataType="char",dataLength=20,nullAble="N",comment="id")
	private String ID = "id";
	/**
	* CODE code
	*/
	@Column(columnName="code",dataType="varchar",dataLength=50,nullAble="Y",comment="code")
	private String CODE = "code";
	/**
	* NAME name
	*/
	@Column(columnName="name",dataType="varchar",dataLength=50,nullAble="Y",comment="name")
	private String NAME = "name";
	/**
	* V_JSDWMC 接收单位名称
	*/
	@Column(columnName="v_jsdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="接收单位名称")
	private String V_JSDWMC = "v_jsdwmc";
	/**
	* PK_GROUP 集团
	*/
	@Column(columnName="pk_group",dataType="varchar",dataLength=20,nullAble="N",comment="集团")
	private String PK_GROUP = "pk_group";
	/**
	* PK_ORG 组织
	*/
	@Column(columnName="pk_org",dataType="varchar",dataLength=20,nullAble="Y",comment="组织")
	private String PK_ORG = "pk_org";
	/**
	* PK_ORG_V 组织版本
	*/
	@Column(columnName="pk_org_v",dataType="varchar",dataLength=20,nullAble="Y",comment="组织版本")
	private String PK_ORG_V = "pk_org_v";
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
	* MAKETIME 制单时间
	*/
	@Column(columnName="maketime",dataType="char",dataLength=19,nullAble="Y",comment="制单时间")
	private String MAKETIME = "maketime";
	/**
	* LASTMAKETIME 最后修改时间
	*/
	@Column(columnName="lastmaketime",dataType="char",dataLength=19,nullAble="Y",comment="最后修改时间")
	private String LASTMAKETIME = "lastmaketime";
	/**
	* ROWNO 行号
	*/
	@Column(columnName="rowno",dataType="varchar",dataLength=50,nullAble="Y",comment="行号")
	private String ROWNO = "rowno";
	/**
	* BILLID 单据ID
	*/
	@Column(columnName="billid",dataType="varchar",dataLength=50,nullAble="Y",comment="单据ID")
	private String BILLID = "billid";
	/**
	* BILLNO 单据号
	*/
	@Column(columnName="billno",dataType="varchar",dataLength=50,nullAble="Y",comment="单据号")
	private String BILLNO = "billno";
	/**
	* PKORG 所属组织
	*/
	@Column(columnName="pkorg",dataType="varchar",dataLength=50,nullAble="Y",comment="所属组织")
	private String PKORG = "pkorg";
	/**
	* BUSITYPE 业务类型
	*/
	@Column(columnName="busitype",dataType="varchar",dataLength=50,nullAble="Y",comment="业务类型")
	private String BUSITYPE = "busitype";
	/**
	* BILLMAKER 制单人
	*/
	@Column(columnName="billmaker",dataType="varchar",dataLength=50,nullAble="Y",comment="制单人")
	private String BILLMAKER = "billmaker";
	/**
	* APPROVER 审批人
	*/
	@Column(columnName="approver",dataType="varchar",dataLength=50,nullAble="Y",comment="审批人")
	private String APPROVER = "approver";
	/**
	* APPROVESTATUS 审批状态
	*/
	@Column(columnName="approvestatus",dataType="int",dataLength=50,nullAble="Y",comment="审批状态")
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
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
	/**
	* BILLTYPE 单据类型
	*/
	@Column(columnName="billtype",dataType="varchar",dataLength=50,nullAble="Y",comment="单据类型")
	private String BILLTYPE = "billtype";
	/**
	* TRANSTYPEPK 交易类型pk
	*/
	@Column(columnName="transtypepk",dataType="char",dataLength=20,nullAble="Y",comment="交易类型pk")
	private String TRANSTYPEPK = "transtypepk";
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
	* EMENDENUM 修订枚举
	*/
	@Column(columnName="emendenum",dataType="int",dataLength=50,nullAble="Y",comment="修订枚举")
	private String EMENDENUM = "emendenum";
	/**
	* BILLVERSIONPK 单据版本pk
	*/
	@Column(columnName="billversionpk",dataType="varchar",dataLength=50,nullAble="Y",comment="单据版本pk")
	private String BILLVERSIONPK = "billversionpk";
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
	* PK_SACWLZ_H 主键
	*/
	@Column(columnName="pk_sacwlz_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_SACWLZ_H = "pk_sacwlz_h";
	/**
	* V_PTAJLX 平台案件类型
	*/
	@Column(columnName="v_ptajlx",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件类型")
	private String V_PTAJLX = "v_ptajlx";
	/**
	* V_PTAJZJ 平台案件主键
	*/
	@Column(columnName="v_ptajzj",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件主键")
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
	* V_SACWXX 涉案财物信息
	*/
	@Column(columnName="v_sacwxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="涉案财物信息")
	private String V_SACWXX = "v_sacwxx";
	/**
	* V_LRRXM 录入人姓名
	*/
	@Column(columnName="v_lrrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="录入人姓名")
	private String V_LRRXM = "v_lrrxm";
	/**
	* C_LRX 录入人id
	*/
	@Column(columnName="c_lrx",dataType="varchar",dataLength=20,nullAble="Y",comment="录入人id")
	private String C_LRX = "c_lrx";
	/**
	* T_LRSJ 录入时间
	*/
	@Column(columnName="t_lrsj",dataType="char",dataLength=19,nullAble="Y",comment="录入时间")
	private String T_LRSJ = "t_lrsj";
	/**
	* C_LRDW 录入单位
	*/
	@Column(columnName="c_lrdw",dataType="varchar",dataLength=20,nullAble="Y",comment="录入单位")
	private String C_LRDW = "c_lrdw";
	/**
	* C_JSDW 接收单位
	*/
	@Column(columnName="c_jsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="接收单位")
	private String C_JSDW = "c_jsdw";
	/**
	* V_JSRXM 接收人姓名
	*/
	@Column(columnName="v_jsrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="接收人姓名")
	private String V_JSRXM = "v_jsrxm";
	/**
	* C_JSR 接收人
	*/
	@Column(columnName="c_jsr",dataType="varchar",dataLength=20,nullAble="Y",comment="接收人")
	private String C_JSR = "c_jsr";
	/**
	* T_JSSJ 接收时间
	*/
	@Column(columnName="t_jssj",dataType="char",dataLength=19,nullAble="Y",comment="接收时间")
	private String T_JSSJ = "t_jssj";
	/**
	* V_CLXX 处理信息
	*/
	@Column(columnName="v_clxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="处理信息")
	private String V_CLXX = "v_clxx";
	/**
	* T_CLSJ 处理时间
	*/
	@Column(columnName="t_clsj",dataType="char",dataLength=19,nullAble="Y",comment="处理时间")
	private String T_CLSJ = "t_clsj";
	/**
	* BILLDATE 单据日期
	*/
	@Column(columnName="billdate",dataType="char",dataLength=19,nullAble="Y",comment="单据日期")
	private String BILLDATE = "billdate";
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
	* getId(void) 
	*/
	public String getId(){
		return this.ID;
	}
	/**
	*setId(java.lang.String)
	*/
	public void setId(String id){
		this.ID=id;
	}
	/**
	* getCode(void) 
	*/
	public String getCode(){
		return this.CODE;
	}
	/**
	*setCode(java.lang.String)
	*/
	public void setCode(String code){
		this.CODE=code;
	}
	/**
	* getName(void) 
	*/
	public String getName(){
		return this.NAME;
	}
	/**
	*setName(java.lang.String)
	*/
	public void setName(String name){
		this.NAME=name;
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
	* getMaketime(void) 
	*/
	public String getMaketime(){
		return this.MAKETIME;
	}
	/**
	*setMaketime(java.lang.String)
	*/
	public void setMaketime(String maketime){
		this.MAKETIME=maketime;
	}
	/**
	* getLastmaketime(void) 
	*/
	public String getLastmaketime(){
		return this.LASTMAKETIME;
	}
	/**
	*setLastmaketime(java.lang.String)
	*/
	public void setLastmaketime(String lastmaketime){
		this.LASTMAKETIME=lastmaketime;
	}
	/**
	* getRowno(void) 
	*/
	public String getRowno(){
		return this.ROWNO;
	}
	/**
	*setRowno(java.lang.String)
	*/
	public void setRowno(String rowno){
		this.ROWNO=rowno;
	}
	/**
	* getBillid(void) 
	*/
	public String getBillid(){
		return this.BILLID;
	}
	/**
	*setBillid(java.lang.String)
	*/
	public void setBillid(String billid){
		this.BILLID=billid;
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
	* getPkorg(void) 
	*/
	public String getPkorg(){
		return this.PKORG;
	}
	/**
	*setPkorg(java.lang.String)
	*/
	public void setPkorg(String pkorg){
		this.PKORG=pkorg;
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
	* getPk_sacwlz_h(void) 
	*/
	public String getPk_sacwlz_h(){
		return this.PK_SACWLZ_H;
	}
	/**
	*setPk_sacwlz_h(java.lang.String)
	*/
	public void setPk_sacwlz_h(String pk_sacwlz_h){
		this.PK_SACWLZ_H=pk_sacwlz_h;
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
	* getV_sacwxx(void) 
	*/
	public String getV_sacwxx(){
		return this.V_SACWXX;
	}
	/**
	*setV_sacwxx(java.lang.String)
	*/
	public void setV_sacwxx(String v_sacwxx){
		this.V_SACWXX=v_sacwxx;
	}
	/**
	* getV_lrrxm(void) 
	*/
	public String getV_lrrxm(){
		return this.V_LRRXM;
	}
	/**
	*setV_lrrxm(java.lang.String)
	*/
	public void setV_lrrxm(String v_lrrxm){
		this.V_LRRXM=v_lrrxm;
	}
	/**
	* getC_lrx(void) 
	*/
	public String getC_lrx(){
		return this.C_LRX;
	}
	/**
	*setC_lrx(java.lang.String)
	*/
	public void setC_lrx(String c_lrx){
		this.C_LRX=c_lrx;
	}
	/**
	* getT_lrsj(void) 
	*/
	public String getT_lrsj(){
		return this.T_LRSJ;
	}
	/**
	*setT_lrsj(java.lang.String)
	*/
	public void setT_lrsj(String t_lrsj){
		this.T_LRSJ=t_lrsj;
	}
	/**
	* getC_lrdw(void) 
	*/
	public String getC_lrdw(){
		return this.C_LRDW;
	}
	/**
	*setC_lrdw(java.lang.String)
	*/
	public void setC_lrdw(String c_lrdw){
		this.C_LRDW=c_lrdw;
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
	* getT_jssj(void) 
	*/
	public String getT_jssj(){
		return this.T_JSSJ;
	}
	/**
	*setT_jssj(java.lang.String)
	*/
	public void setT_jssj(String t_jssj){
		this.T_JSSJ=t_jssj;
	}
	/**
	* getV_clxx(void) 
	*/
	public String getV_clxx(){
		return this.V_CLXX;
	}
	/**
	*setV_clxx(java.lang.String)
	*/
	public void setV_clxx(String v_clxx){
		this.V_CLXX=v_clxx;
	}
	/**
	* getT_clsj(void) 
	*/
	public String getT_clsj(){
		return this.T_CLSJ;
	}
	/**
	*setT_clsj(java.lang.String)
	*/
	public void setT_clsj(String t_clsj){
		this.T_CLSJ=t_clsj;
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


}