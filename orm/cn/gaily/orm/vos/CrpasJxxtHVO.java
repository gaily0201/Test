package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasJxxtHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_jxxt_h")
public class CrpasJxxtHVO {
	/**
	* BILLNO 单据号
	*/
	@Column(columnName="billno",dataType="varchar",dataLength=50,nullAble="Y",comment="单据号")
	private String BILLNO = "billno";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
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
	@Column(columnName="emendenum",dataType="int",dataLength=50,nullAble="Y",comment="修订枚举")
	private String EMENDENUM = "emendenum";
	/**
	* BILLVERSIONPK 单据版本pk
	*/
	@Column(columnName="billversionpk",dataType="varchar",dataLength=50,nullAble="Y",comment="单据版本pk")
	private String BILLVERSIONPK = "billversionpk";
	/**
	* PK_JXXT_H 主键
	*/
	@Column(columnName="pk_jxxt_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_JXXT_H = "pk_jxxt_h";
	/**
	* V_PTBH 平台案件编号
	*/
	@Column(columnName="v_ptbh",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件编号")
	private String V_PTBH = "v_ptbh";
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
	* PK_SQJZ_H 矫正单主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正单主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
	/**
	* V_JZBH 矫正对象编号
	*/
	@Column(columnName="v_jzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正对象编号")
	private String V_JZBH = "v_jzbh";
	/**
	* V_XM 姓名
	*/
	@Column(columnName="v_xm",dataType="varchar",dataLength=50,nullAble="Y",comment="姓名")
	private String V_XM = "v_xm";
	/**
	* C_XB 性别
	*/
	@Column(columnName="c_xb",dataType="varchar",dataLength=20,nullAble="Y",comment="性别")
	private String C_XB = "c_xb";
	/**
	* C_MZ 民族
	*/
	@Column(columnName="c_mz",dataType="varchar",dataLength=20,nullAble="Y",comment="民族")
	private String C_MZ = "c_mz";
	/**
	* D_CSRQ 出生日期
	*/
	@Column(columnName="d_csrq",dataType="char",dataLength=19,nullAble="Y",comment="出生日期")
	private String D_CSRQ = "d_csrq";
	/**
	* V_JXSQXX 减刑申请信息
	*/
	@Column(columnName="v_jxsqxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="减刑申请信息")
	private String V_JXSQXX = "v_jxsqxx";
	/**
	* C_JXSQR 减刑申请人
	*/
	@Column(columnName="c_jxsqr",dataType="varchar",dataLength=20,nullAble="Y",comment="减刑申请人")
	private String C_JXSQR = "c_jxsqr";
	/**
	* V_JXSQRXM 减刑申请人姓名
	*/
	@Column(columnName="v_jxsqrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="减刑申请人姓名")
	private String V_JXSQRXM = "v_jxsqrxm";
	/**
	* D_JXSQRQ 减刑申请日期
	*/
	@Column(columnName="d_jxsqrq",dataType="char",dataLength=19,nullAble="Y",comment="减刑申请日期")
	private String D_JXSQRQ = "d_jxsqrq";
	/**
	* C_SQDW 申请单位
	*/
	@Column(columnName="c_sqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="申请单位")
	private String C_SQDW = "c_sqdw";
	/**
	* V_SQDWMC 申请单位名称
	*/
	@Column(columnName="v_sqdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="申请单位名称")
	private String V_SQDWMC = "v_sqdwmc";
	/**
	* C_QXSPJG 区县审批结果
	*/
	@Column(columnName="c_qxspjg",dataType="varchar",dataLength=20,nullAble="Y",comment="区县审批结果")
	private String C_QXSPJG = "c_qxspjg";
	/**
	* C_QXSPDW 区县审批单位
	*/
	@Column(columnName="c_qxspdw",dataType="varchar",dataLength=20,nullAble="Y",comment="区县审批单位")
	private String C_QXSPDW = "c_qxspdw";
	/**
	* V_QXSPDWMC 区县审批单位名称
	*/
	@Column(columnName="v_qxspdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="区县审批单位名称")
	private String V_QXSPDWMC = "v_qxspdwmc";
	/**
	* C_QXSPR 区县审批人
	*/
	@Column(columnName="c_qxspr",dataType="varchar",dataLength=20,nullAble="Y",comment="区县审批人")
	private String C_QXSPR = "c_qxspr";
	/**
	* V_QXSPRXM 区县审批人姓名
	*/
	@Column(columnName="v_qxsprxm",dataType="varchar",dataLength=50,nullAble="Y",comment="区县审批人姓名")
	private String V_QXSPRXM = "v_qxsprxm";
	/**
	* D_QXSPRQ 区县审批日期
	*/
	@Column(columnName="d_qxsprq",dataType="char",dataLength=19,nullAble="Y",comment="区县审批日期")
	private String D_QXSPRQ = "d_qxsprq";
	/**
	* V_QXSPXX 区县审批信息
	*/
	@Column(columnName="v_qxspxx",dataType="varchar",dataLength=200,nullAble="Y",comment="区县审批信息")
	private String V_QXSPXX = "v_qxspxx";
	/**
	* C_SJSPJG 市级审批结果
	*/
	@Column(columnName="c_sjspjg",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审批结果")
	private String C_SJSPJG = "c_sjspjg";
	/**
	* C_SJSPDW 市级审批单位
	*/
	@Column(columnName="c_sjspdw",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审批单位")
	private String C_SJSPDW = "c_sjspdw";
	/**
	* V_SJSPDWMC 市级审批单位名称
	*/
	@Column(columnName="v_sjspdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="市级审批单位名称")
	private String V_SJSPDWMC = "v_sjspdwmc";
	/**
	* C_SJSPR 市级审批人
	*/
	@Column(columnName="c_sjspr",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审批人")
	private String C_SJSPR = "c_sjspr";
	/**
	* V_SJSPRXM 市级审批人姓名
	*/
	@Column(columnName="v_sjsprxm",dataType="varchar",dataLength=50,nullAble="Y",comment="市级审批人姓名")
	private String V_SJSPRXM = "v_sjsprxm";
	/**
	* D_SJSPRQ 市级审批日期
	*/
	@Column(columnName="d_sjsprq",dataType="char",dataLength=19,nullAble="Y",comment="市级审批日期")
	private String D_SJSPRQ = "d_sjsprq";
	/**
	* V_SJSPXX 市级审批信息
	*/
	@Column(columnName="v_sjspxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="市级审批信息")
	private String V_SJSPXX = "v_sjspxx";
	/**
	* C_CDFY 裁定法院
	*/
	@Column(columnName="c_cdfy",dataType="varchar",dataLength=20,nullAble="Y",comment="裁定法院")
	private String C_CDFY = "c_cdfy";
	/**
	* V_CDFYMC 裁定法院名称
	*/
	@Column(columnName="v_cdfymc",dataType="varchar",dataLength=100,nullAble="Y",comment="裁定法院名称")
	private String V_CDFYMC = "v_cdfymc";
	/**
	* V_FYCBBM 法院承办部门
	*/
	@Column(columnName="v_fycbbm",dataType="varchar",dataLength=100,nullAble="Y",comment="法院承办部门")
	private String V_FYCBBM = "v_fycbbm";
	/**
	* V_FYCBR 法院承办人
	*/
	@Column(columnName="v_fycbr",dataType="varchar",dataLength=100,nullAble="Y",comment="法院承办人")
	private String V_FYCBR = "v_fycbr";
	/**
	* D_CDRQ 裁定日期
	*/
	@Column(columnName="d_cdrq",dataType="char",dataLength=19,nullAble="Y",comment="裁定日期")
	private String D_CDRQ = "d_cdrq";
	/**
	* C_CDJG 裁定结果
	*/
	@Column(columnName="c_cdjg",dataType="varchar",dataLength=20,nullAble="Y",comment="裁定结果")
	private String C_CDJG = "c_cdjg";
	/**
	* V_FYCDXX 法院裁定信息
	*/
	@Column(columnName="v_fycdxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="法院裁定信息")
	private String V_FYCDXX = "v_fycdxx";
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
	* getPk_jxxt_h(void) 
	*/
	public String getPk_jxxt_h(){
		return this.PK_JXXT_H;
	}
	/**
	*setPk_jxxt_h(java.lang.String)
	*/
	public void setPk_jxxt_h(String pk_jxxt_h){
		this.PK_JXXT_H=pk_jxxt_h;
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
	* getPk_sqjz_h(void) 
	*/
	public String getPk_sqjz_h(){
		return this.PK_SQJZ_H;
	}
	/**
	*setPk_sqjz_h(java.lang.String)
	*/
	public void setPk_sqjz_h(String pk_sqjz_h){
		this.PK_SQJZ_H=pk_sqjz_h;
	}
	/**
	* getV_jzbh(void) 
	*/
	public String getV_jzbh(){
		return this.V_JZBH;
	}
	/**
	*setV_jzbh(java.lang.String)
	*/
	public void setV_jzbh(String v_jzbh){
		this.V_JZBH=v_jzbh;
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
	* getC_mz(void) 
	*/
	public String getC_mz(){
		return this.C_MZ;
	}
	/**
	*setC_mz(java.lang.String)
	*/
	public void setC_mz(String c_mz){
		this.C_MZ=c_mz;
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
	* getV_jxsqxx(void) 
	*/
	public String getV_jxsqxx(){
		return this.V_JXSQXX;
	}
	/**
	*setV_jxsqxx(java.lang.String)
	*/
	public void setV_jxsqxx(String v_jxsqxx){
		this.V_JXSQXX=v_jxsqxx;
	}
	/**
	* getC_jxsqr(void) 
	*/
	public String getC_jxsqr(){
		return this.C_JXSQR;
	}
	/**
	*setC_jxsqr(java.lang.String)
	*/
	public void setC_jxsqr(String c_jxsqr){
		this.C_JXSQR=c_jxsqr;
	}
	/**
	* getV_jxsqrxm(void) 
	*/
	public String getV_jxsqrxm(){
		return this.V_JXSQRXM;
	}
	/**
	*setV_jxsqrxm(java.lang.String)
	*/
	public void setV_jxsqrxm(String v_jxsqrxm){
		this.V_JXSQRXM=v_jxsqrxm;
	}
	/**
	* getD_jxsqrq(void) 
	*/
	public String getD_jxsqrq(){
		return this.D_JXSQRQ;
	}
	/**
	*setD_jxsqrq(java.lang.String)
	*/
	public void setD_jxsqrq(String d_jxsqrq){
		this.D_JXSQRQ=d_jxsqrq;
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
	* getC_qxspjg(void) 
	*/
	public String getC_qxspjg(){
		return this.C_QXSPJG;
	}
	/**
	*setC_qxspjg(java.lang.String)
	*/
	public void setC_qxspjg(String c_qxspjg){
		this.C_QXSPJG=c_qxspjg;
	}
	/**
	* getC_qxspdw(void) 
	*/
	public String getC_qxspdw(){
		return this.C_QXSPDW;
	}
	/**
	*setC_qxspdw(java.lang.String)
	*/
	public void setC_qxspdw(String c_qxspdw){
		this.C_QXSPDW=c_qxspdw;
	}
	/**
	* getV_qxspdwmc(void) 
	*/
	public String getV_qxspdwmc(){
		return this.V_QXSPDWMC;
	}
	/**
	*setV_qxspdwmc(java.lang.String)
	*/
	public void setV_qxspdwmc(String v_qxspdwmc){
		this.V_QXSPDWMC=v_qxspdwmc;
	}
	/**
	* getC_qxspr(void) 
	*/
	public String getC_qxspr(){
		return this.C_QXSPR;
	}
	/**
	*setC_qxspr(java.lang.String)
	*/
	public void setC_qxspr(String c_qxspr){
		this.C_QXSPR=c_qxspr;
	}
	/**
	* getV_qxsprxm(void) 
	*/
	public String getV_qxsprxm(){
		return this.V_QXSPRXM;
	}
	/**
	*setV_qxsprxm(java.lang.String)
	*/
	public void setV_qxsprxm(String v_qxsprxm){
		this.V_QXSPRXM=v_qxsprxm;
	}
	/**
	* getD_qxsprq(void) 
	*/
	public String getD_qxsprq(){
		return this.D_QXSPRQ;
	}
	/**
	*setD_qxsprq(java.lang.String)
	*/
	public void setD_qxsprq(String d_qxsprq){
		this.D_QXSPRQ=d_qxsprq;
	}
	/**
	* getV_qxspxx(void) 
	*/
	public String getV_qxspxx(){
		return this.V_QXSPXX;
	}
	/**
	*setV_qxspxx(java.lang.String)
	*/
	public void setV_qxspxx(String v_qxspxx){
		this.V_QXSPXX=v_qxspxx;
	}
	/**
	* getC_sjspjg(void) 
	*/
	public String getC_sjspjg(){
		return this.C_SJSPJG;
	}
	/**
	*setC_sjspjg(java.lang.String)
	*/
	public void setC_sjspjg(String c_sjspjg){
		this.C_SJSPJG=c_sjspjg;
	}
	/**
	* getC_sjspdw(void) 
	*/
	public String getC_sjspdw(){
		return this.C_SJSPDW;
	}
	/**
	*setC_sjspdw(java.lang.String)
	*/
	public void setC_sjspdw(String c_sjspdw){
		this.C_SJSPDW=c_sjspdw;
	}
	/**
	* getV_sjspdwmc(void) 
	*/
	public String getV_sjspdwmc(){
		return this.V_SJSPDWMC;
	}
	/**
	*setV_sjspdwmc(java.lang.String)
	*/
	public void setV_sjspdwmc(String v_sjspdwmc){
		this.V_SJSPDWMC=v_sjspdwmc;
	}
	/**
	* getC_sjspr(void) 
	*/
	public String getC_sjspr(){
		return this.C_SJSPR;
	}
	/**
	*setC_sjspr(java.lang.String)
	*/
	public void setC_sjspr(String c_sjspr){
		this.C_SJSPR=c_sjspr;
	}
	/**
	* getV_sjsprxm(void) 
	*/
	public String getV_sjsprxm(){
		return this.V_SJSPRXM;
	}
	/**
	*setV_sjsprxm(java.lang.String)
	*/
	public void setV_sjsprxm(String v_sjsprxm){
		this.V_SJSPRXM=v_sjsprxm;
	}
	/**
	* getD_sjsprq(void) 
	*/
	public String getD_sjsprq(){
		return this.D_SJSPRQ;
	}
	/**
	*setD_sjsprq(java.lang.String)
	*/
	public void setD_sjsprq(String d_sjsprq){
		this.D_SJSPRQ=d_sjsprq;
	}
	/**
	* getV_sjspxx(void) 
	*/
	public String getV_sjspxx(){
		return this.V_SJSPXX;
	}
	/**
	*setV_sjspxx(java.lang.String)
	*/
	public void setV_sjspxx(String v_sjspxx){
		this.V_SJSPXX=v_sjspxx;
	}
	/**
	* getC_cdfy(void) 
	*/
	public String getC_cdfy(){
		return this.C_CDFY;
	}
	/**
	*setC_cdfy(java.lang.String)
	*/
	public void setC_cdfy(String c_cdfy){
		this.C_CDFY=c_cdfy;
	}
	/**
	* getV_cdfymc(void) 
	*/
	public String getV_cdfymc(){
		return this.V_CDFYMC;
	}
	/**
	*setV_cdfymc(java.lang.String)
	*/
	public void setV_cdfymc(String v_cdfymc){
		this.V_CDFYMC=v_cdfymc;
	}
	/**
	* getV_fycbbm(void) 
	*/
	public String getV_fycbbm(){
		return this.V_FYCBBM;
	}
	/**
	*setV_fycbbm(java.lang.String)
	*/
	public void setV_fycbbm(String v_fycbbm){
		this.V_FYCBBM=v_fycbbm;
	}
	/**
	* getV_fycbr(void) 
	*/
	public String getV_fycbr(){
		return this.V_FYCBR;
	}
	/**
	*setV_fycbr(java.lang.String)
	*/
	public void setV_fycbr(String v_fycbr){
		this.V_FYCBR=v_fycbr;
	}
	/**
	* getD_cdrq(void) 
	*/
	public String getD_cdrq(){
		return this.D_CDRQ;
	}
	/**
	*setD_cdrq(java.lang.String)
	*/
	public void setD_cdrq(String d_cdrq){
		this.D_CDRQ=d_cdrq;
	}
	/**
	* getC_cdjg(void) 
	*/
	public String getC_cdjg(){
		return this.C_CDJG;
	}
	/**
	*setC_cdjg(java.lang.String)
	*/
	public void setC_cdjg(String c_cdjg){
		this.C_CDJG=c_cdjg;
	}
	/**
	* getV_fycdxx(void) 
	*/
	public String getV_fycdxx(){
		return this.V_FYCDXX;
	}
	/**
	*setV_fycdxx(java.lang.String)
	*/
	public void setV_fycdxx(String v_fycdxx){
		this.V_FYCDXX=v_fycdxx;
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


}