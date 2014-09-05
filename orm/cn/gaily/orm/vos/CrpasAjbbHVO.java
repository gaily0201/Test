package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasAjbbHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ajbb_h")
public class CrpasAjbbHVO {
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
	* PK_AJBB_H 主键
	*/
	@Column(columnName="pk_ajbb_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_AJBB_H = "pk_ajbb_h";
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
	* V_AJBBXX 案件报备信息
	*/
	@Column(columnName="v_ajbbxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="案件报备信息")
	private String V_AJBBXX = "v_ajbbxx";
	/**
	* C_BBR 报备人
	*/
	@Column(columnName="c_bbr",dataType="char",dataLength=20,nullAble="Y",comment="报备人")
	private String C_BBR = "c_bbr";
	/**
	* V_BBRXM 报备人姓名
	*/
	@Column(columnName="v_bbrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="报备人姓名")
	private String V_BBRXM = "v_bbrxm";
	/**
	* C_BBDW 报备单位
	*/
	@Column(columnName="c_bbdw",dataType="varchar",dataLength=20,nullAble="Y",comment="报备单位")
	private String C_BBDW = "c_bbdw";
	/**
	* V_BBDWMC 报备单位名称
	*/
	@Column(columnName="v_bbdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="报备单位名称")
	private String V_BBDWMC = "v_bbdwmc";
	/**
	* D_BBRQ 报备日期
	*/
	@Column(columnName="d_bbrq",dataType="char",dataLength=19,nullAble="Y",comment="报备日期")
	private String D_BBRQ = "d_bbrq";
	/**
	* V_GLAH 关联案号
	*/
	@Column(columnName="v_glah",dataType="varchar",dataLength=50,nullAble="Y",comment="关联案号")
	private String V_GLAH = "v_glah";
	/**
	* D_GLRQ 关联日期
	*/
	@Column(columnName="d_glrq",dataType="char",dataLength=19,nullAble="Y",comment="关联日期")
	private String D_GLRQ = "d_glrq";
	/**
	* C_GLCZR 关联操作人
	*/
	@Column(columnName="c_glczr",dataType="char",dataLength=20,nullAble="Y",comment="关联操作人")
	private String C_GLCZR = "c_glczr";
	/**
	* V_GLCZRXM 关联操作人姓名
	*/
	@Column(columnName="v_glczrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="关联操作人姓名")
	private String V_GLCZRXM = "v_glczrxm";
	/**
	* C_GLCZDW 关联操作单位
	*/
	@Column(columnName="c_glczdw",dataType="char",dataLength=20,nullAble="Y",comment="关联操作单位")
	private String C_GLCZDW = "c_glczdw";
	/**
	* V_GLCZDWMC 关联操作单位名称
	*/
	@Column(columnName="v_glczdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="关联操作单位名称")
	private String V_GLCZDWMC = "v_glczdwmc";
	/**
	* C_BBAJZT 报备案件状态
	*/
	@Column(columnName="c_bbajzt",dataType="varchar",dataLength=20,nullAble="Y",comment="报备案件状态")
	private String C_BBAJZT = "c_bbajzt";
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
	@Column(columnName="t_xtwcsj",dataType="varchar",dataLength=50,nullAble="Y",comment="协同完成时间")
	private String T_XTWCSJ = "t_xtwcsj";
	/**
	* C_XTZT 协同状态
	*/
	@Column(columnName="c_xtzt",dataType="varchar",dataLength=20,nullAble="Y",comment="协同状态")
	private String C_XTZT = "c_xtzt";
	/**
	* T_GLAJLASJ 关键案件立案时间
	*/
	@Column(columnName="t_glajlasj",dataType="char",dataLength=19,nullAble="Y",comment="关键案件立案时间")
	private String T_GLAJLASJ = "t_glajlasj";
	/**
	* V_BBBH 报备编号
	*/
	@Column(columnName="v_bbbh",dataType="varchar",dataLength=50,nullAble="Y",comment="报备编号")
	private String V_BBBH = "v_bbbh";
	/**
	* V_AJBH 案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* V_AJMC 案件名称
	*/
	@Column(columnName="v_ajmc",dataType="varchar",dataLength=200,nullAble="Y",comment="案件名称")
	private String V_AJMC = "v_ajmc";
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
	* getPk_ajbb_h(void) 
	*/
	public String getPk_ajbb_h(){
		return this.PK_AJBB_H;
	}
	/**
	*setPk_ajbb_h(java.lang.String)
	*/
	public void setPk_ajbb_h(String pk_ajbb_h){
		this.PK_AJBB_H=pk_ajbb_h;
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
	* getV_ajbbxx(void) 
	*/
	public String getV_ajbbxx(){
		return this.V_AJBBXX;
	}
	/**
	*setV_ajbbxx(java.lang.String)
	*/
	public void setV_ajbbxx(String v_ajbbxx){
		this.V_AJBBXX=v_ajbbxx;
	}
	/**
	* getC_bbr(void) 
	*/
	public String getC_bbr(){
		return this.C_BBR;
	}
	/**
	*setC_bbr(java.lang.String)
	*/
	public void setC_bbr(String c_bbr){
		this.C_BBR=c_bbr;
	}
	/**
	* getV_bbrxm(void) 
	*/
	public String getV_bbrxm(){
		return this.V_BBRXM;
	}
	/**
	*setV_bbrxm(java.lang.String)
	*/
	public void setV_bbrxm(String v_bbrxm){
		this.V_BBRXM=v_bbrxm;
	}
	/**
	* getC_bbdw(void) 
	*/
	public String getC_bbdw(){
		return this.C_BBDW;
	}
	/**
	*setC_bbdw(java.lang.String)
	*/
	public void setC_bbdw(String c_bbdw){
		this.C_BBDW=c_bbdw;
	}
	/**
	* getV_bbdwmc(void) 
	*/
	public String getV_bbdwmc(){
		return this.V_BBDWMC;
	}
	/**
	*setV_bbdwmc(java.lang.String)
	*/
	public void setV_bbdwmc(String v_bbdwmc){
		this.V_BBDWMC=v_bbdwmc;
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
	* getV_glah(void) 
	*/
	public String getV_glah(){
		return this.V_GLAH;
	}
	/**
	*setV_glah(java.lang.String)
	*/
	public void setV_glah(String v_glah){
		this.V_GLAH=v_glah;
	}
	/**
	* getD_glrq(void) 
	*/
	public String getD_glrq(){
		return this.D_GLRQ;
	}
	/**
	*setD_glrq(java.lang.String)
	*/
	public void setD_glrq(String d_glrq){
		this.D_GLRQ=d_glrq;
	}
	/**
	* getC_glczr(void) 
	*/
	public String getC_glczr(){
		return this.C_GLCZR;
	}
	/**
	*setC_glczr(java.lang.String)
	*/
	public void setC_glczr(String c_glczr){
		this.C_GLCZR=c_glczr;
	}
	/**
	* getV_glczrxm(void) 
	*/
	public String getV_glczrxm(){
		return this.V_GLCZRXM;
	}
	/**
	*setV_glczrxm(java.lang.String)
	*/
	public void setV_glczrxm(String v_glczrxm){
		this.V_GLCZRXM=v_glczrxm;
	}
	/**
	* getC_glczdw(void) 
	*/
	public String getC_glczdw(){
		return this.C_GLCZDW;
	}
	/**
	*setC_glczdw(java.lang.String)
	*/
	public void setC_glczdw(String c_glczdw){
		this.C_GLCZDW=c_glczdw;
	}
	/**
	* getV_glczdwmc(void) 
	*/
	public String getV_glczdwmc(){
		return this.V_GLCZDWMC;
	}
	/**
	*setV_glczdwmc(java.lang.String)
	*/
	public void setV_glczdwmc(String v_glczdwmc){
		this.V_GLCZDWMC=v_glczdwmc;
	}
	/**
	* getC_bbajzt(void) 
	*/
	public String getC_bbajzt(){
		return this.C_BBAJZT;
	}
	/**
	*setC_bbajzt(java.lang.String)
	*/
	public void setC_bbajzt(String c_bbajzt){
		this.C_BBAJZT=c_bbajzt;
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
	* getT_glajlasj(void) 
	*/
	public String getT_glajlasj(){
		return this.T_GLAJLASJ;
	}
	/**
	*setT_glajlasj(java.lang.String)
	*/
	public void setT_glajlasj(String t_glajlasj){
		this.T_GLAJLASJ=t_glajlasj;
	}
	/**
	* getV_bbbh(void) 
	*/
	public String getV_bbbh(){
		return this.V_BBBH;
	}
	/**
	*setV_bbbh(java.lang.String)
	*/
	public void setV_bbbh(String v_bbbh){
		this.V_BBBH=v_bbbh;
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


}