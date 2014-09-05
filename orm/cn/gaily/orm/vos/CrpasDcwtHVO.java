package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasDcwtHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_dcwt_h")
public class CrpasDcwtHVO {
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
	* PK_DCWT_H 主键
	*/
	@Column(columnName="pk_dcwt_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_DCWT_H = "pk_dcwt_h";
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
	* C_DCLX 调查类型
	*/
	@Column(columnName="c_dclx",dataType="varchar",dataLength=20,nullAble="Y",comment="调查类型")
	private String C_DCLX = "c_dclx";
	/**
	* V_WTDCAH 委托调查案号
	*/
	@Column(columnName="v_wtdcah",dataType="varchar",dataLength=50,nullAble="Y",comment="委托调查案号")
	private String V_WTDCAH = "v_wtdcah";
	/**
	* V_WTDCNR 委托调查内容
	*/
	@Column(columnName="v_wtdcnr",dataType="varchar",dataLength=2000,nullAble="Y",comment="委托调查内容")
	private String V_WTDCNR = "v_wtdcnr";
	/**
	* C_WTSQR 委托申请人
	*/
	@Column(columnName="c_wtsqr",dataType="varchar",dataLength=20,nullAble="Y",comment="委托申请人")
	private String C_WTSQR = "c_wtsqr";
	/**
	* V_WTSQRXM 委托申请人姓名
	*/
	@Column(columnName="v_wtsqrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="委托申请人姓名")
	private String V_WTSQRXM = "v_wtsqrxm";
	/**
	* D_WTSQRQ 委托申请日期
	*/
	@Column(columnName="d_wtsqrq",dataType="char",dataLength=19,nullAble="Y",comment="委托申请日期")
	private String D_WTSQRQ = "d_wtsqrq";
	/**
	* D_JSSQRQ 接收申请日期
	*/
	@Column(columnName="d_jssqrq",dataType="char",dataLength=19,nullAble="Y",comment="接收申请日期")
	private String D_JSSQRQ = "d_jssqrq";
	/**
	* C_FPSFS 分派司法所
	*/
	@Column(columnName="c_fpsfs",dataType="varchar",dataLength=20,nullAble="Y",comment="分派司法所")
	private String C_FPSFS = "c_fpsfs";
	/**
	* V_FPSFSMC 分派司法所名称
	*/
	@Column(columnName="v_fpsfsmc",dataType="varchar",dataLength=50,nullAble="Y",comment="分派司法所名称")
	private String V_FPSFSMC = "v_fpsfsmc";
	/**
	* D_FPRQ 分派日期
	*/
	@Column(columnName="d_fprq",dataType="char",dataLength=19,nullAble="Y",comment="分派日期")
	private String D_FPRQ = "d_fprq";
	/**
	* C_FPR 分派人
	*/
	@Column(columnName="c_fpr",dataType="varchar",dataLength=20,nullAble="Y",comment="分派人")
	private String C_FPR = "c_fpr";
	/**
	* V_FPRXM 分派人姓名
	*/
	@Column(columnName="v_fprxm",dataType="varchar",dataLength=50,nullAble="Y",comment="分派人姓名")
	private String V_FPRXM = "v_fprxm";
	/**
	* V_DCFKXX 调查反馈信息
	*/
	@Column(columnName="v_dcfkxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="调查反馈信息")
	private String V_DCFKXX = "v_dcfkxx";
	/**
	* C_DCFKR 调查反馈人
	*/
	@Column(columnName="c_dcfkr",dataType="varchar",dataLength=50,nullAble="Y",comment="调查反馈人")
	private String C_DCFKR = "c_dcfkr";
	/**
	* V_DCFKRXM 调查反馈人姓名
	*/
	@Column(columnName="v_dcfkrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="调查反馈人姓名")
	private String V_DCFKRXM = "v_dcfkrxm";
	/**
	* D_DCFKRQ 调查反馈日期
	*/
	@Column(columnName="d_dcfkrq",dataType="char",dataLength=19,nullAble="Y",comment="调查反馈日期")
	private String D_DCFKRQ = "d_dcfkrq";
	/**
	* C_BDCR 被调查人id
	*/
	@Column(columnName="c_bdcr",dataType="char",dataLength=20,nullAble="Y",comment="被调查人id")
	private String C_BDCR = "c_bdcr";
	/**
	* V_AJBS 案件标识
	*/
	@Column(columnName="v_ajbs",dataType="varchar",dataLength=50,nullAble="Y",comment="案件标识")
	private String V_AJBS = "v_ajbs";
	/**
	* V_XM 姓名
	*/
	@Column(columnName="v_xm",dataType="varchar",dataLength=20,nullAble="Y",comment="姓名")
	private String V_XM = "v_xm";
	/**
	* C_XB 性别
	*/
	@Column(columnName="c_xb",dataType="varchar",dataLength=20,nullAble="Y",comment="性别")
	private String C_XB = "c_xb";
	/**
	* N_NL 年龄
	*/
	@Column(columnName="n_nl",dataType="int",dataLength=0,nullAble="Y",comment="年龄")
	private String N_NL = "n_nl";
	/**
	* C_WHCD 文化程度
	*/
	@Column(columnName="c_whcd",dataType="varchar",dataLength=20,nullAble="Y",comment="文化程度")
	private String C_WHCD = "c_whcd";
	/**
	* D_CSRQ 出生日期
	*/
	@Column(columnName="d_csrq",dataType="char",dataLength=19,nullAble="Y",comment="出生日期")
	private String D_CSRQ = "d_csrq";
	/**
	* V_HJD 户籍地
	*/
	@Column(columnName="v_hjd",dataType="varchar",dataLength=50,nullAble="Y",comment="户籍地")
	private String V_HJD = "v_hjd";
	/**
	* V_LXFS 联系方式
	*/
	@Column(columnName="v_lxfs",dataType="varchar",dataLength=50,nullAble="Y",comment="联系方式")
	private String V_LXFS = "v_lxfs";
	/**
	* V_DZ 地址
	*/
	@Column(columnName="v_dz",dataType="varchar",dataLength=50,nullAble="Y",comment="地址")
	private String V_DZ = "v_dz";
	/**
	* V_XYGZDW 现（原）工作单位
	*/
	@Column(columnName="v_xygzdw",dataType="varchar",dataLength=50,nullAble="Y",comment="现（原）工作单位")
	private String V_XYGZDW = "v_xygzdw";
	/**
	* B_SFQBHS 是否取保候审
	*/
	@Column(columnName="b_sfqbhs",dataType="char",dataLength=1,nullAble="Y",comment="是否取保候审")
	private String B_SFQBHS = "b_sfqbhs";
	/**
	* B_SFZY 是否在押
	*/
	@Column(columnName="b_sfzy",dataType="char",dataLength=1,nullAble="Y",comment="是否在押")
	private String B_SFZY = "b_sfzy";
	/**
	* V_JBAQ 基本案情
	*/
	@Column(columnName="v_jbaq",dataType="varchar",dataLength=2000,nullAble="Y",comment="基本案情")
	private String V_JBAQ = "v_jbaq";
	/**
	* V_BQSYY 被起诉原因
	*/
	@Column(columnName="v_bqsyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="被起诉原因")
	private String V_BQSYY = "v_bqsyy";
	/**
	* V_WTWS 委托文书
	*/
	@Column(columnName="v_wtws",dataType="varchar",dataLength=2000,nullAble="Y",comment="委托文书")
	private String V_WTWS = "v_wtws";
	/**
	* V_SQDCBG 诉前调查报告
	*/
	@Column(columnName="v_sqdcbg",dataType="varchar",dataLength=2000,nullAble="Y",comment="诉前调查报告")
	private String V_SQDCBG = "v_sqdcbg";
	/**
	* V_SHENQDCBG 审前调查报告
	*/
	@Column(columnName="v_shenqdcbg",dataType="varchar",dataLength=2000,nullAble="Y",comment="审前调查报告")
	private String V_SHENQDCBG = "v_shenqdcbg";
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
	* V_DCWTBH 调查委托编号
	*/
	@Column(columnName="v_dcwtbh",dataType="varchar",dataLength=50,nullAble="Y",comment="调查委托编号")
	private String V_DCWTBH = "v_dcwtbh";
	/**
	* C_WTSQDW 委托申请单位编号
	*/
	@Column(columnName="c_wtsqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="委托申请单位编号")
	private String C_WTSQDW = "c_wtsqdw";
	/**
	* V_WTSQDWMC 委托申请单位
	*/
	@Column(columnName="v_wtsqdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="委托申请单位")
	private String V_WTSQDWMC = "v_wtsqdwmc";
	/**
	* C_JSSQDW 接收申请单位编号
	*/
	@Column(columnName="c_jssqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="接收申请单位编号")
	private String C_JSSQDW = "c_jssqdw";
	/**
	* V_JSSQDWMC 接收申请单位
	*/
	@Column(columnName="v_jssqdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="接收申请单位")
	private String V_JSSQDWMC = "v_jssqdwmc";
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
	* getPk_dcwt_h(void) 
	*/
	public String getPk_dcwt_h(){
		return this.PK_DCWT_H;
	}
	/**
	*setPk_dcwt_h(java.lang.String)
	*/
	public void setPk_dcwt_h(String pk_dcwt_h){
		this.PK_DCWT_H=pk_dcwt_h;
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
	* getC_dclx(void) 
	*/
	public String getC_dclx(){
		return this.C_DCLX;
	}
	/**
	*setC_dclx(java.lang.String)
	*/
	public void setC_dclx(String c_dclx){
		this.C_DCLX=c_dclx;
	}
	/**
	* getV_wtdcah(void) 
	*/
	public String getV_wtdcah(){
		return this.V_WTDCAH;
	}
	/**
	*setV_wtdcah(java.lang.String)
	*/
	public void setV_wtdcah(String v_wtdcah){
		this.V_WTDCAH=v_wtdcah;
	}
	/**
	* getV_wtdcnr(void) 
	*/
	public String getV_wtdcnr(){
		return this.V_WTDCNR;
	}
	/**
	*setV_wtdcnr(java.lang.String)
	*/
	public void setV_wtdcnr(String v_wtdcnr){
		this.V_WTDCNR=v_wtdcnr;
	}
	/**
	* getC_wtsqr(void) 
	*/
	public String getC_wtsqr(){
		return this.C_WTSQR;
	}
	/**
	*setC_wtsqr(java.lang.String)
	*/
	public void setC_wtsqr(String c_wtsqr){
		this.C_WTSQR=c_wtsqr;
	}
	/**
	* getV_wtsqrxm(void) 
	*/
	public String getV_wtsqrxm(){
		return this.V_WTSQRXM;
	}
	/**
	*setV_wtsqrxm(java.lang.String)
	*/
	public void setV_wtsqrxm(String v_wtsqrxm){
		this.V_WTSQRXM=v_wtsqrxm;
	}
	/**
	* getD_wtsqrq(void) 
	*/
	public String getD_wtsqrq(){
		return this.D_WTSQRQ;
	}
	/**
	*setD_wtsqrq(java.lang.String)
	*/
	public void setD_wtsqrq(String d_wtsqrq){
		this.D_WTSQRQ=d_wtsqrq;
	}
	/**
	* getD_jssqrq(void) 
	*/
	public String getD_jssqrq(){
		return this.D_JSSQRQ;
	}
	/**
	*setD_jssqrq(java.lang.String)
	*/
	public void setD_jssqrq(String d_jssqrq){
		this.D_JSSQRQ=d_jssqrq;
	}
	/**
	* getC_fpsfs(void) 
	*/
	public String getC_fpsfs(){
		return this.C_FPSFS;
	}
	/**
	*setC_fpsfs(java.lang.String)
	*/
	public void setC_fpsfs(String c_fpsfs){
		this.C_FPSFS=c_fpsfs;
	}
	/**
	* getV_fpsfsmc(void) 
	*/
	public String getV_fpsfsmc(){
		return this.V_FPSFSMC;
	}
	/**
	*setV_fpsfsmc(java.lang.String)
	*/
	public void setV_fpsfsmc(String v_fpsfsmc){
		this.V_FPSFSMC=v_fpsfsmc;
	}
	/**
	* getD_fprq(void) 
	*/
	public String getD_fprq(){
		return this.D_FPRQ;
	}
	/**
	*setD_fprq(java.lang.String)
	*/
	public void setD_fprq(String d_fprq){
		this.D_FPRQ=d_fprq;
	}
	/**
	* getC_fpr(void) 
	*/
	public String getC_fpr(){
		return this.C_FPR;
	}
	/**
	*setC_fpr(java.lang.String)
	*/
	public void setC_fpr(String c_fpr){
		this.C_FPR=c_fpr;
	}
	/**
	* getV_fprxm(void) 
	*/
	public String getV_fprxm(){
		return this.V_FPRXM;
	}
	/**
	*setV_fprxm(java.lang.String)
	*/
	public void setV_fprxm(String v_fprxm){
		this.V_FPRXM=v_fprxm;
	}
	/**
	* getV_dcfkxx(void) 
	*/
	public String getV_dcfkxx(){
		return this.V_DCFKXX;
	}
	/**
	*setV_dcfkxx(java.lang.String)
	*/
	public void setV_dcfkxx(String v_dcfkxx){
		this.V_DCFKXX=v_dcfkxx;
	}
	/**
	* getC_dcfkr(void) 
	*/
	public String getC_dcfkr(){
		return this.C_DCFKR;
	}
	/**
	*setC_dcfkr(java.lang.String)
	*/
	public void setC_dcfkr(String c_dcfkr){
		this.C_DCFKR=c_dcfkr;
	}
	/**
	* getV_dcfkrxm(void) 
	*/
	public String getV_dcfkrxm(){
		return this.V_DCFKRXM;
	}
	/**
	*setV_dcfkrxm(java.lang.String)
	*/
	public void setV_dcfkrxm(String v_dcfkrxm){
		this.V_DCFKRXM=v_dcfkrxm;
	}
	/**
	* getD_dcfkrq(void) 
	*/
	public String getD_dcfkrq(){
		return this.D_DCFKRQ;
	}
	/**
	*setD_dcfkrq(java.lang.String)
	*/
	public void setD_dcfkrq(String d_dcfkrq){
		this.D_DCFKRQ=d_dcfkrq;
	}
	/**
	* getC_bdcr(void) 
	*/
	public String getC_bdcr(){
		return this.C_BDCR;
	}
	/**
	*setC_bdcr(java.lang.String)
	*/
	public void setC_bdcr(String c_bdcr){
		this.C_BDCR=c_bdcr;
	}
	/**
	* getV_ajbs(void) 
	*/
	public String getV_ajbs(){
		return this.V_AJBS;
	}
	/**
	*setV_ajbs(java.lang.String)
	*/
	public void setV_ajbs(String v_ajbs){
		this.V_AJBS=v_ajbs;
	}
	/**
	* getV_xm(void) 
	*/
	public String getV_xm(){
		return this.V_XM;
	}
	/**
	*setV_xm(java.lang.String)
	*/
	public void setV_xm(String v_xm){
		this.V_XM=v_xm;
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
	* getN_nl(void) 
	*/
	public String getN_nl(){
		return this.N_NL;
	}
	/**
	*setN_nl(java.lang.String)
	*/
	public void setN_nl(String n_nl){
		this.N_NL=n_nl;
	}
	/**
	* getC_whcd(void) 
	*/
	public String getC_whcd(){
		return this.C_WHCD;
	}
	/**
	*setC_whcd(java.lang.String)
	*/
	public void setC_whcd(String c_whcd){
		this.C_WHCD=c_whcd;
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
	* getV_hjd(void) 
	*/
	public String getV_hjd(){
		return this.V_HJD;
	}
	/**
	*setV_hjd(java.lang.String)
	*/
	public void setV_hjd(String v_hjd){
		this.V_HJD=v_hjd;
	}
	/**
	* getV_lxfs(void) 
	*/
	public String getV_lxfs(){
		return this.V_LXFS;
	}
	/**
	*setV_lxfs(java.lang.String)
	*/
	public void setV_lxfs(String v_lxfs){
		this.V_LXFS=v_lxfs;
	}
	/**
	* getV_dz(void) 
	*/
	public String getV_dz(){
		return this.V_DZ;
	}
	/**
	*setV_dz(java.lang.String)
	*/
	public void setV_dz(String v_dz){
		this.V_DZ=v_dz;
	}
	/**
	* getV_xygzdw(void) 
	*/
	public String getV_xygzdw(){
		return this.V_XYGZDW;
	}
	/**
	*setV_xygzdw(java.lang.String)
	*/
	public void setV_xygzdw(String v_xygzdw){
		this.V_XYGZDW=v_xygzdw;
	}
	/**
	* getB_sfqbhs(void) 
	*/
	public String getB_sfqbhs(){
		return this.B_SFQBHS;
	}
	/**
	*setB_sfqbhs(java.lang.String)
	*/
	public void setB_sfqbhs(String b_sfqbhs){
		this.B_SFQBHS=b_sfqbhs;
	}
	/**
	* getB_sfzy(void) 
	*/
	public String getB_sfzy(){
		return this.B_SFZY;
	}
	/**
	*setB_sfzy(java.lang.String)
	*/
	public void setB_sfzy(String b_sfzy){
		this.B_SFZY=b_sfzy;
	}
	/**
	* getV_jbaq(void) 
	*/
	public String getV_jbaq(){
		return this.V_JBAQ;
	}
	/**
	*setV_jbaq(java.lang.String)
	*/
	public void setV_jbaq(String v_jbaq){
		this.V_JBAQ=v_jbaq;
	}
	/**
	* getV_bqsyy(void) 
	*/
	public String getV_bqsyy(){
		return this.V_BQSYY;
	}
	/**
	*setV_bqsyy(java.lang.String)
	*/
	public void setV_bqsyy(String v_bqsyy){
		this.V_BQSYY=v_bqsyy;
	}
	/**
	* getV_wtws(void) 
	*/
	public String getV_wtws(){
		return this.V_WTWS;
	}
	/**
	*setV_wtws(java.lang.String)
	*/
	public void setV_wtws(String v_wtws){
		this.V_WTWS=v_wtws;
	}
	/**
	* getV_sqdcbg(void) 
	*/
	public String getV_sqdcbg(){
		return this.V_SQDCBG;
	}
	/**
	*setV_sqdcbg(java.lang.String)
	*/
	public void setV_sqdcbg(String v_sqdcbg){
		this.V_SQDCBG=v_sqdcbg;
	}
	/**
	* getV_shenqdcbg(void) 
	*/
	public String getV_shenqdcbg(){
		return this.V_SHENQDCBG;
	}
	/**
	*setV_shenqdcbg(java.lang.String)
	*/
	public void setV_shenqdcbg(String v_shenqdcbg){
		this.V_SHENQDCBG=v_shenqdcbg;
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
	* getV_dcwtbh(void) 
	*/
	public String getV_dcwtbh(){
		return this.V_DCWTBH;
	}
	/**
	*setV_dcwtbh(java.lang.String)
	*/
	public void setV_dcwtbh(String v_dcwtbh){
		this.V_DCWTBH=v_dcwtbh;
	}
	/**
	* getC_wtsqdw(void) 
	*/
	public String getC_wtsqdw(){
		return this.C_WTSQDW;
	}
	/**
	*setC_wtsqdw(java.lang.String)
	*/
	public void setC_wtsqdw(String c_wtsqdw){
		this.C_WTSQDW=c_wtsqdw;
	}
	/**
	* getV_wtsqdwmc(void) 
	*/
	public String getV_wtsqdwmc(){
		return this.V_WTSQDWMC;
	}
	/**
	*setV_wtsqdwmc(java.lang.String)
	*/
	public void setV_wtsqdwmc(String v_wtsqdwmc){
		this.V_WTSQDWMC=v_wtsqdwmc;
	}
	/**
	* getC_jssqdw(void) 
	*/
	public String getC_jssqdw(){
		return this.C_JSSQDW;
	}
	/**
	*setC_jssqdw(java.lang.String)
	*/
	public void setC_jssqdw(String c_jssqdw){
		this.C_JSSQDW=c_jssqdw;
	}
	/**
	* getV_jssqdwmc(void) 
	*/
	public String getV_jssqdwmc(){
		return this.V_JSSQDWMC;
	}
	/**
	*setV_jssqdwmc(java.lang.String)
	*/
	public void setV_jssqdwmc(String v_jssqdwmc){
		this.V_JSSQDWMC=v_jssqdwmc;
	}


}