package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasLajdHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_lajd_h")
public class CrpasLajdHVO {
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
	* PK_LAJD_H 主键
	*/
	@Column(columnName="pk_lajd_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_LAJD_H = "pk_lajd_h";
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
	* V_AJJDXX 案件监督信息
	*/
	@Column(columnName="v_ajjdxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="案件监督信息")
	private String V_AJJDXX = "v_ajjdxx";
	/**
	* B_SFYLAJD 是否已立案监督
	*/
	@Column(columnName="b_sfylajd",dataType="char",dataLength=1,nullAble="Y",comment="是否已立案监督")
	private String B_SFYLAJD = "b_sfylajd";
	/**
	* C_TJR 提交人
	*/
	@Column(columnName="c_tjr",dataType="char",dataLength=20,nullAble="Y",comment="提交人")
	private String C_TJR = "c_tjr";
	/**
	* V_TJRXM 提交人姓名
	*/
	@Column(columnName="v_tjrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="提交人姓名")
	private String V_TJRXM = "v_tjrxm";
	/**
	* C_TJDW 提交单位
	*/
	@Column(columnName="c_tjdw",dataType="char",dataLength=20,nullAble="Y",comment="提交单位")
	private String C_TJDW = "c_tjdw";
	/**
	* V_TJDWMC 提交单位名称
	*/
	@Column(columnName="v_tjdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="提交单位名称")
	private String V_TJDWMC = "v_tjdwmc";
	/**
	* D_TJRQ 提交日期
	*/
	@Column(columnName="d_tjrq",dataType="char",dataLength=19,nullAble="Y",comment="提交日期")
	private String D_TJRQ = "d_tjrq";
	/**
	* C_JSR 接收人
	*/
	@Column(columnName="c_jsr",dataType="char",dataLength=20,nullAble="Y",comment="接收人")
	private String C_JSR = "c_jsr";
	/**
	* V_JSRMC 接收人姓名
	*/
	@Column(columnName="v_jsrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="接收人姓名")
	private String V_JSRMC = "v_jsrmc";
	/**
	* C_JSDW 接收单位
	*/
	@Column(columnName="c_jsdw",dataType="char",dataLength=20,nullAble="Y",comment="接收单位")
	private String C_JSDW = "c_jsdw";
	/**
	* V_JSDWMC 接收单位名称
	*/
	@Column(columnName="v_jsdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="接收单位名称")
	private String V_JSDWMC = "v_jsdwmc";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
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
	* getPk_lajd_h(void) 
	*/
	public String getPk_lajd_h(){
		return this.PK_LAJD_H;
	}
	/**
	*setPk_lajd_h(java.lang.String)
	*/
	public void setPk_lajd_h(String pk_lajd_h){
		this.PK_LAJD_H=pk_lajd_h;
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
	* getV_ajjdxx(void) 
	*/
	public String getV_ajjdxx(){
		return this.V_AJJDXX;
	}
	/**
	*setV_ajjdxx(java.lang.String)
	*/
	public void setV_ajjdxx(String v_ajjdxx){
		this.V_AJJDXX=v_ajjdxx;
	}
	/**
	* getB_sfylajd(void) 
	*/
	public String getB_sfylajd(){
		return this.B_SFYLAJD;
	}
	/**
	*setB_sfylajd(java.lang.String)
	*/
	public void setB_sfylajd(String b_sfylajd){
		this.B_SFYLAJD=b_sfylajd;
	}
	/**
	* getC_tjr(void) 
	*/
	public String getC_tjr(){
		return this.C_TJR;
	}
	/**
	*setC_tjr(java.lang.String)
	*/
	public void setC_tjr(String c_tjr){
		this.C_TJR=c_tjr;
	}
	/**
	* getV_tjrxm(void) 
	*/
	public String getV_tjrxm(){
		return this.V_TJRXM;
	}
	/**
	*setV_tjrxm(java.lang.String)
	*/
	public void setV_tjrxm(String v_tjrxm){
		this.V_TJRXM=v_tjrxm;
	}
	/**
	* getC_tjdw(void) 
	*/
	public String getC_tjdw(){
		return this.C_TJDW;
	}
	/**
	*setC_tjdw(java.lang.String)
	*/
	public void setC_tjdw(String c_tjdw){
		this.C_TJDW=c_tjdw;
	}
	/**
	* getV_tjdwmc(void) 
	*/
	public String getV_tjdwmc(){
		return this.V_TJDWMC;
	}
	/**
	*setV_tjdwmc(java.lang.String)
	*/
	public void setV_tjdwmc(String v_tjdwmc){
		this.V_TJDWMC=v_tjdwmc;
	}
	/**
	* getD_tjrq(void) 
	*/
	public String getD_tjrq(){
		return this.D_TJRQ;
	}
	/**
	*setD_tjrq(java.lang.String)
	*/
	public void setD_tjrq(String d_tjrq){
		this.D_TJRQ=d_tjrq;
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
	* getV_jsrmc(void) 
	*/
	public String getV_jsrmc(){
		return this.V_JSRMC;
	}
	/**
	*setV_jsrmc(java.lang.String)
	*/
	public void setV_jsrmc(String v_jsrmc){
		this.V_JSRMC=v_jsrmc;
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


}