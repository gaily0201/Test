package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasWsyjHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_wsyj_h")
public class CrpasWsyjHVO {
	/**
	* V_ZYZH 职业证号
	*/
	@Column(columnName="v_zyzh",dataType="varchar",dataLength=100,nullAble="Y",comment="职业证号")
	private String V_ZYZH = "v_zyzh";
	/**
	* V_LSSWS 律师事务所
	*/
	@Column(columnName="v_lssws",dataType="varchar",dataLength=100,nullAble="Y",comment="律师事务所")
	private String V_LSSWS = "v_lssws";
	/**
	* V_DLDX 代理对象
	*/
	@Column(columnName="v_dldx",dataType="varchar",dataLength=2000,nullAble="Y",comment="代理对象")
	private String V_DLDX = "v_dldx";
	/**
	* N_YJQX 阅卷期限(小时)
	*/
	@Column(columnName="n_yjqx",dataType="int",dataLength=0,nullAble="Y",comment="阅卷期限(小时)")
	private String N_YJQX = "n_yjqx";
	/**
	* C_DLSQDW 代理申请单位
	*/
	@Column(columnName="c_dlsqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="代理申请单位")
	private String C_DLSQDW = "c_dlsqdw";
	/**
	* C_SHDW 审核单位
	*/
	@Column(columnName="c_shdw",dataType="varchar",dataLength=20,nullAble="Y",comment="审核单位")
	private String C_SHDW = "c_shdw";
	/**
	* C_YJZZ 阅卷状态
	*/
	@Column(columnName="c_yjzz",dataType="varchar",dataLength=20,nullAble="Y",comment="阅卷状态")
	private String C_YJZZ = "c_yjzz";
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
	* PK_WSYJ_H 主键
	*/
	@Column(columnName="pk_wsyj_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_WSYJ_H = "pk_wsyj_h";
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
	* V_SQXX 申请信息
	*/
	@Column(columnName="v_sqxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="申请信息")
	private String V_SQXX = "v_sqxx";
	/**
	* C_SQR 申请人
	*/
	@Column(columnName="c_sqr",dataType="varchar",dataLength=20,nullAble="Y",comment="申请人")
	private String C_SQR = "c_sqr";
	/**
	* V_SQRXM 申请人姓名
	*/
	@Column(columnName="v_sqrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="申请人姓名")
	private String V_SQRXM = "v_sqrxm";
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
	* C_SHR 审核人
	*/
	@Column(columnName="c_shr",dataType="varchar",dataLength=20,nullAble="Y",comment="审核人")
	private String C_SHR = "c_shr";
	/**
	* V_SHRXM 审核人姓名
	*/
	@Column(columnName="v_shrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="审核人姓名")
	private String V_SHRXM = "v_shrxm";
	/**
	* T_SHSJ 审核时间
	*/
	@Column(columnName="t_shsj",dataType="char",dataLength=19,nullAble="Y",comment="审核时间")
	private String T_SHSJ = "t_shsj";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
	/**
	* V_YJBH 阅卷编号
	*/
	@Column(columnName="v_yjbh",dataType="varchar",dataLength=100,nullAble="Y",comment="阅卷编号")
	private String V_YJBH = "v_yjbh";
	/**
	* V_YJMM 阅卷密码
	*/
	@Column(columnName="v_yjmm",dataType="varchar",dataLength=100,nullAble="Y",comment="阅卷密码")
	private String V_YJMM = "v_yjmm";
	/**
	* V_GLAH 关联案号
	*/
	@Column(columnName="v_glah",dataType="varchar",dataLength=100,nullAble="Y",comment="关联案号")
	private String V_GLAH = "v_glah";
	/**
	* V_GLAJMC 关联案件名称
	*/
	@Column(columnName="v_glajmc",dataType="varchar",dataLength=100,nullAble="Y",comment="关联案件名称")
	private String V_GLAJMC = "v_glajmc";
	/**
	* V_GLAJZJ 关联案件主键
	*/
	@Column(columnName="v_glajzj",dataType="varchar",dataLength=100,nullAble="Y",comment="关联案件主键")
	private String V_GLAJZJ = "v_glajzj";
	/**
	* V_LSXM 律师姓名
	*/
	@Column(columnName="v_lsxm",dataType="varchar",dataLength=100,nullAble="Y",comment="律师姓名")
	private String V_LSXM = "v_lsxm";
	/**
	* getV_zyzh(void) 
	*/
	public String getV_zyzh(){
		return this.V_ZYZH;
	}
	/**
	*setV_zyzh(java.lang.String)
	*/
	public void setV_zyzh(String v_zyzh){
		this.V_ZYZH=v_zyzh;
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
	* getV_dldx(void) 
	*/
	public String getV_dldx(){
		return this.V_DLDX;
	}
	/**
	*setV_dldx(java.lang.String)
	*/
	public void setV_dldx(String v_dldx){
		this.V_DLDX=v_dldx;
	}
	/**
	* getN_yjqx(void) 
	*/
	public String getN_yjqx(){
		return this.N_YJQX;
	}
	/**
	*setN_yjqx(java.lang.String)
	*/
	public void setN_yjqx(String n_yjqx){
		this.N_YJQX=n_yjqx;
	}
	/**
	* getC_dlsqdw(void) 
	*/
	public String getC_dlsqdw(){
		return this.C_DLSQDW;
	}
	/**
	*setC_dlsqdw(java.lang.String)
	*/
	public void setC_dlsqdw(String c_dlsqdw){
		this.C_DLSQDW=c_dlsqdw;
	}
	/**
	* getC_shdw(void) 
	*/
	public String getC_shdw(){
		return this.C_SHDW;
	}
	/**
	*setC_shdw(java.lang.String)
	*/
	public void setC_shdw(String c_shdw){
		this.C_SHDW=c_shdw;
	}
	/**
	* getC_yjzz(void) 
	*/
	public String getC_yjzz(){
		return this.C_YJZZ;
	}
	/**
	*setC_yjzz(java.lang.String)
	*/
	public void setC_yjzz(String c_yjzz){
		this.C_YJZZ=c_yjzz;
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
	* getPk_wsyj_h(void) 
	*/
	public String getPk_wsyj_h(){
		return this.PK_WSYJ_H;
	}
	/**
	*setPk_wsyj_h(java.lang.String)
	*/
	public void setPk_wsyj_h(String pk_wsyj_h){
		this.PK_WSYJ_H=pk_wsyj_h;
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
	* getV_yjbh(void) 
	*/
	public String getV_yjbh(){
		return this.V_YJBH;
	}
	/**
	*setV_yjbh(java.lang.String)
	*/
	public void setV_yjbh(String v_yjbh){
		this.V_YJBH=v_yjbh;
	}
	/**
	* getV_yjmm(void) 
	*/
	public String getV_yjmm(){
		return this.V_YJMM;
	}
	/**
	*setV_yjmm(java.lang.String)
	*/
	public void setV_yjmm(String v_yjmm){
		this.V_YJMM=v_yjmm;
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
	* getV_glajmc(void) 
	*/
	public String getV_glajmc(){
		return this.V_GLAJMC;
	}
	/**
	*setV_glajmc(java.lang.String)
	*/
	public void setV_glajmc(String v_glajmc){
		this.V_GLAJMC=v_glajmc;
	}
	/**
	* getV_glajzj(void) 
	*/
	public String getV_glajzj(){
		return this.V_GLAJZJ;
	}
	/**
	*setV_glajzj(java.lang.String)
	*/
	public void setV_glajzj(String v_glajzj){
		this.V_GLAJZJ=v_glajzj;
	}
	/**
	* getV_lsxm(void) 
	*/
	public String getV_lsxm(){
		return this.V_LSXM;
	}
	/**
	*setV_lsxm(java.lang.String)
	*/
	public void setV_lsxm(String v_lsxm){
		this.V_LSXM=v_lsxm;
	}


}