package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasYctsHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ycts_h")
public class CrpasYctsHVO {
	/**
	* KSHBH 看守所编号
	*/
	@Column(columnName="kshbh",dataType="varchar",dataLength=20,nullAble="Y",comment="看守所编号")
	private String KSHBH = "kshbh";
	/**
	* C_YYDX 提请对象id
	*/
	@Column(columnName="c_yydx",dataType="char",dataLength=20,nullAble="Y",comment="提请对象id")
	private String C_YYDX = "c_yydx";
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
	* PK_YCTS_H 主键
	*/
	@Column(columnName="pk_ycts_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_YCTS_H = "pk_ycts_h";
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
	* V_TSSBH 提审室编号
	*/
	@Column(columnName="v_tssbh",dataType="varchar",dataLength=20,nullAble="Y",comment="提审室编号")
	private String V_TSSBH = "v_tssbh";
	/**
	* D_YYRQ 预约日期
	*/
	@Column(columnName="d_yyrq",dataType="char",dataLength=19,nullAble="Y",comment="预约日期")
	private String D_YYRQ = "d_yyrq";
	/**
	* T_YYSYKSSJ 预约使用开始时间
	*/
	@Column(columnName="t_yysykssj",dataType="char",dataLength=8,nullAble="Y",comment="预约使用开始时间")
	private String T_YYSYKSSJ = "t_yysykssj";
	/**
	* T_YYSYJSSJ 预约使用结束时间
	*/
	@Column(columnName="t_yysyjssj",dataType="char",dataLength=8,nullAble="Y",comment="预约使用结束时间")
	private String T_YYSYJSSJ = "t_yysyjssj";
	/**
	* C_YYR 预约人
	*/
	@Column(columnName="c_yyr",dataType="char",dataLength=20,nullAble="Y",comment="预约人")
	private String C_YYR = "c_yyr";
	/**
	* V_YYRXM 预约人姓名
	*/
	@Column(columnName="v_yyrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="预约人姓名")
	private String V_YYRXM = "v_yyrxm";
	/**
	* C_YYSYDW 预约使用单位
	*/
	@Column(columnName="c_yysydw",dataType="varchar",dataLength=20,nullAble="Y",comment="预约使用单位")
	private String C_YYSYDW = "c_yysydw";
	/**
	* V_YYSYDWMC 预约使用单位名称
	*/
	@Column(columnName="v_yysydwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="预约使用单位名称")
	private String V_YYSYDWMC = "v_yysydwmc";
	/**
	* V_YYDX 预约对象
	*/
	@Column(columnName="v_yydx",dataType="varchar",dataLength=50,nullAble="Y",comment="预约对象")
	private String V_YYDX = "v_yydx";
	/**
	* V_YYMD 预约目的
	*/
	@Column(columnName="v_yymd",dataType="varchar",dataLength=50,nullAble="Y",comment="预约目的")
	private String V_YYMD = "v_yymd";
	/**
	* B_SFSC 是否删除
	*/
	@Column(columnName="b_sfsc",dataType="char",dataLength=1,nullAble="Y",comment="是否删除")
	private String B_SFSC = "b_sfsc";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=200,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
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
	* V_AJMC 案件名称
	*/
	@Column(columnName="v_ajmc",dataType="varchar",dataLength=50,nullAble="Y",comment="案件名称")
	private String V_AJMC = "v_ajmc";
	/**
	* V_PTBH 平台案件编号
	*/
	@Column(columnName="v_ptbh",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件编号")
	private String V_PTBH = "v_ptbh";
	/**
	* getKshbh(void) 
	*/
	public String getKshbh(){
		return this.KSHBH;
	}
	/**
	*setKshbh(java.lang.String)
	*/
	public void setKshbh(String kshbh){
		this.KSHBH=kshbh;
	}
	/**
	* getC_yydx(void) 
	*/
	public String getC_yydx(){
		return this.C_YYDX;
	}
	/**
	*setC_yydx(java.lang.String)
	*/
	public void setC_yydx(String c_yydx){
		this.C_YYDX=c_yydx;
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
	* getPk_ycts_h(void) 
	*/
	public String getPk_ycts_h(){
		return this.PK_YCTS_H;
	}
	/**
	*setPk_ycts_h(java.lang.String)
	*/
	public void setPk_ycts_h(String pk_ycts_h){
		this.PK_YCTS_H=pk_ycts_h;
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
	* getV_tssbh(void) 
	*/
	public String getV_tssbh(){
		return this.V_TSSBH;
	}
	/**
	*setV_tssbh(java.lang.String)
	*/
	public void setV_tssbh(String v_tssbh){
		this.V_TSSBH=v_tssbh;
	}
	/**
	* getD_yyrq(void) 
	*/
	public String getD_yyrq(){
		return this.D_YYRQ;
	}
	/**
	*setD_yyrq(java.lang.String)
	*/
	public void setD_yyrq(String d_yyrq){
		this.D_YYRQ=d_yyrq;
	}
	/**
	* getT_yysykssj(void) 
	*/
	public String getT_yysykssj(){
		return this.T_YYSYKSSJ;
	}
	/**
	*setT_yysykssj(java.lang.String)
	*/
	public void setT_yysykssj(String t_yysykssj){
		this.T_YYSYKSSJ=t_yysykssj;
	}
	/**
	* getT_yysyjssj(void) 
	*/
	public String getT_yysyjssj(){
		return this.T_YYSYJSSJ;
	}
	/**
	*setT_yysyjssj(java.lang.String)
	*/
	public void setT_yysyjssj(String t_yysyjssj){
		this.T_YYSYJSSJ=t_yysyjssj;
	}
	/**
	* getC_yyr(void) 
	*/
	public String getC_yyr(){
		return this.C_YYR;
	}
	/**
	*setC_yyr(java.lang.String)
	*/
	public void setC_yyr(String c_yyr){
		this.C_YYR=c_yyr;
	}
	/**
	* getV_yyrxm(void) 
	*/
	public String getV_yyrxm(){
		return this.V_YYRXM;
	}
	/**
	*setV_yyrxm(java.lang.String)
	*/
	public void setV_yyrxm(String v_yyrxm){
		this.V_YYRXM=v_yyrxm;
	}
	/**
	* getC_yysydw(void) 
	*/
	public String getC_yysydw(){
		return this.C_YYSYDW;
	}
	/**
	*setC_yysydw(java.lang.String)
	*/
	public void setC_yysydw(String c_yysydw){
		this.C_YYSYDW=c_yysydw;
	}
	/**
	* getV_yysydwmc(void) 
	*/
	public String getV_yysydwmc(){
		return this.V_YYSYDWMC;
	}
	/**
	*setV_yysydwmc(java.lang.String)
	*/
	public void setV_yysydwmc(String v_yysydwmc){
		this.V_YYSYDWMC=v_yysydwmc;
	}
	/**
	* getV_yydx(void) 
	*/
	public String getV_yydx(){
		return this.V_YYDX;
	}
	/**
	*setV_yydx(java.lang.String)
	*/
	public void setV_yydx(String v_yydx){
		this.V_YYDX=v_yydx;
	}
	/**
	* getV_yymd(void) 
	*/
	public String getV_yymd(){
		return this.V_YYMD;
	}
	/**
	*setV_yymd(java.lang.String)
	*/
	public void setV_yymd(String v_yymd){
		this.V_YYMD=v_yymd;
	}
	/**
	* getB_sfsc(void) 
	*/
	public String getB_sfsc(){
		return this.B_SFSC;
	}
	/**
	*setB_sfsc(java.lang.String)
	*/
	public void setB_sfsc(String b_sfsc){
		this.B_SFSC=b_sfsc;
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


}