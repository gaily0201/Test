package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSpgxHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_spgx_h")
public class CrpasSpgxHVO {
	/**
	* V_BSQDWMC 被申请单位名称
	*/
	@Column(columnName="v_bsqdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="被申请单位名称")
	private String V_BSQDWMC = "v_bsqdwmc";
	/**
	* C_BSQDW 被申请单位id
	*/
	@Column(columnName="c_bsqdw",dataType="char",dataLength=20,nullAble="Y",comment="被申请单位id")
	private String C_BSQDW = "c_bsqdw";
	/**
	* V_BSQAH 被申请案号
	*/
	@Column(columnName="v_bsqah",dataType="varchar",dataLength=50,nullAble="Y",comment="被申请案号")
	private String V_BSQAH = "v_bsqah";
	/**
	* V_SQGXXX 申请共享信息
	*/
	@Column(columnName="v_sqgxxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="申请共享信息")
	private String V_SQGXXX = "v_sqgxxx";
	/**
	* V_SQRXM 申请人姓名
	*/
	@Column(columnName="v_sqrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="申请人姓名")
	private String V_SQRXM = "v_sqrxm";
	/**
	* C_SQR 申请人id
	*/
	@Column(columnName="c_sqr",dataType="char",dataLength=20,nullAble="Y",comment="申请人id")
	private String C_SQR = "c_sqr";
	/**
	* V_SQDWMC 申请单位名称
	*/
	@Column(columnName="v_sqdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="申请单位名称")
	private String V_SQDWMC = "v_sqdwmc";
	/**
	* C_SQDW 申请单位id
	*/
	@Column(columnName="c_sqdw",dataType="char",dataLength=20,nullAble="Y",comment="申请单位id")
	private String C_SQDW = "c_sqdw";
	/**
	* D_SQRQ 申请日期
	*/
	@Column(columnName="d_sqrq",dataType="char",dataLength=19,nullAble="Y",comment="申请日期")
	private String D_SQRQ = "d_sqrq";
	/**
	* C_SQSHJG 申请审核结果
	*/
	@Column(columnName="c_sqshjg",dataType="char",dataLength=20,nullAble="Y",comment="申请审核结果")
	private String C_SQSHJG = "c_sqshjg";
	/**
	* V_BTYGXLY 不同意共享理由
	*/
	@Column(columnName="v_btygxly",dataType="varchar",dataLength=2000,nullAble="Y",comment="不同意共享理由")
	private String V_BTYGXLY = "v_btygxly";
	/**
	* C_SHR 审核人id
	*/
	@Column(columnName="c_shr",dataType="char",dataLength=20,nullAble="Y",comment="审核人id")
	private String C_SHR = "c_shr";
	/**
	* V_SHRXM 审核人姓名
	*/
	@Column(columnName="v_shrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="审核人姓名")
	private String V_SHRXM = "v_shrxm";
	/**
	* D_SHRQ 审核日期
	*/
	@Column(columnName="d_shrq",dataType="char",dataLength=19,nullAble="Y",comment="审核日期")
	private String D_SHRQ = "d_shrq";
	/**
	* V_CKFS 信息查看方式
	*/
	@Column(columnName="v_ckfs",dataType="varchar",dataLength=2000,nullAble="Y",comment="信息查看方式")
	private String V_CKFS = "v_ckfs";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
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
	* PK_SPGX_H 主键
	*/
	@Column(columnName="pk_spgx_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_SPGX_H = "pk_spgx_h";
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
	* getV_bsqdwmc(void) 
	*/
	public String getV_bsqdwmc(){
		return this.V_BSQDWMC;
	}
	/**
	*setV_bsqdwmc(java.lang.String)
	*/
	public void setV_bsqdwmc(String v_bsqdwmc){
		this.V_BSQDWMC=v_bsqdwmc;
	}
	/**
	* getC_bsqdw(void) 
	*/
	public String getC_bsqdw(){
		return this.C_BSQDW;
	}
	/**
	*setC_bsqdw(java.lang.String)
	*/
	public void setC_bsqdw(String c_bsqdw){
		this.C_BSQDW=c_bsqdw;
	}
	/**
	* getV_bsqah(void) 
	*/
	public String getV_bsqah(){
		return this.V_BSQAH;
	}
	/**
	*setV_bsqah(java.lang.String)
	*/
	public void setV_bsqah(String v_bsqah){
		this.V_BSQAH=v_bsqah;
	}
	/**
	* getV_sqgxxx(void) 
	*/
	public String getV_sqgxxx(){
		return this.V_SQGXXX;
	}
	/**
	*setV_sqgxxx(java.lang.String)
	*/
	public void setV_sqgxxx(String v_sqgxxx){
		this.V_SQGXXX=v_sqgxxx;
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
	* getD_sqrq(void) 
	*/
	public String getD_sqrq(){
		return this.D_SQRQ;
	}
	/**
	*setD_sqrq(java.lang.String)
	*/
	public void setD_sqrq(String d_sqrq){
		this.D_SQRQ=d_sqrq;
	}
	/**
	* getC_sqshjg(void) 
	*/
	public String getC_sqshjg(){
		return this.C_SQSHJG;
	}
	/**
	*setC_sqshjg(java.lang.String)
	*/
	public void setC_sqshjg(String c_sqshjg){
		this.C_SQSHJG=c_sqshjg;
	}
	/**
	* getV_btygxly(void) 
	*/
	public String getV_btygxly(){
		return this.V_BTYGXLY;
	}
	/**
	*setV_btygxly(java.lang.String)
	*/
	public void setV_btygxly(String v_btygxly){
		this.V_BTYGXLY=v_btygxly;
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
	* getD_shrq(void) 
	*/
	public String getD_shrq(){
		return this.D_SHRQ;
	}
	/**
	*setD_shrq(java.lang.String)
	*/
	public void setD_shrq(String d_shrq){
		this.D_SHRQ=d_shrq;
	}
	/**
	* getV_ckfs(void) 
	*/
	public String getV_ckfs(){
		return this.V_CKFS;
	}
	/**
	*setV_ckfs(java.lang.String)
	*/
	public void setV_ckfs(String v_ckfs){
		this.V_CKFS=v_ckfs;
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
	* getPk_spgx_h(void) 
	*/
	public String getPk_spgx_h(){
		return this.PK_SPGX_H;
	}
	/**
	*setPk_spgx_h(java.lang.String)
	*/
	public void setPk_spgx_h(String pk_spgx_h){
		this.PK_SPGX_H=pk_spgx_h;
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


}