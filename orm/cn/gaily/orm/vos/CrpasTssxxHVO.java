package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasTssxxHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_tssxx_h")
public class CrpasTssxxHVO {
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
	* PK_TSSXX_H 主键
	*/
	@Column(columnName="pk_tssxx_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_TSSXX_H = "pk_tssxx_h";
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
	* BILLDATE 单据日期
	*/
	@Column(columnName="billdate",dataType="char",dataLength=19,nullAble="Y",comment="单据日期")
	private String BILLDATE = "billdate";
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
	* C_KSSJGBH 看守所机构编号
	*/
	@Column(columnName="c_kssjgbh",dataType="varchar",dataLength=20,nullAble="Y",comment="看守所机构编号")
	private String C_KSSJGBH = "c_kssjgbh";
	/**
	* V_KSSMC 看守所名称
	*/
	@Column(columnName="v_kssmc",dataType="varchar",dataLength=50,nullAble="Y",comment="看守所名称")
	private String V_KSSMC = "v_kssmc";
	/**
	* C_SSDQ 所属地区
	*/
	@Column(columnName="c_ssdq",dataType="varchar",dataLength=20,nullAble="Y",comment="所属地区")
	private String C_SSDQ = "c_ssdq";
	/**
	* V_TSSBH 提审室编号
	*/
	@Column(columnName="v_tssbh",dataType="varchar",dataLength=50,nullAble="Y",comment="提审室编号")
	private String V_TSSBH = "v_tssbh";
	/**
	* V_TSSMC 提审室名称
	*/
	@Column(columnName="v_tssmc",dataType="varchar",dataLength=50,nullAble="Y",comment="提审室名称")
	private String V_TSSMC = "v_tssmc";
	/**
	* V_TSSGLBMBH 提审室管理部门编号
	*/
	@Column(columnName="v_tssglbmbh",dataType="varchar",dataLength=50,nullAble="Y",comment="提审室管理部门编号")
	private String V_TSSGLBMBH = "v_tssglbmbh";
	/**
	* V_TSSGLBMMC 提审室管理部门名称
	*/
	@Column(columnName="v_tssglbmmc",dataType="varchar",dataLength=50,nullAble="Y",comment="提审室管理部门名称")
	private String V_TSSGLBMMC = "v_tssglbmmc";
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
	* getPk_tssxx_h(void) 
	*/
	public String getPk_tssxx_h(){
		return this.PK_TSSXX_H;
	}
	/**
	*setPk_tssxx_h(java.lang.String)
	*/
	public void setPk_tssxx_h(String pk_tssxx_h){
		this.PK_TSSXX_H=pk_tssxx_h;
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
	* getC_kssjgbh(void) 
	*/
	public String getC_kssjgbh(){
		return this.C_KSSJGBH;
	}
	/**
	*setC_kssjgbh(java.lang.String)
	*/
	public void setC_kssjgbh(String c_kssjgbh){
		this.C_KSSJGBH=c_kssjgbh;
	}
	/**
	* getV_kssmc(void) 
	*/
	public String getV_kssmc(){
		return this.V_KSSMC;
	}
	/**
	*setV_kssmc(java.lang.String)
	*/
	public void setV_kssmc(String v_kssmc){
		this.V_KSSMC=v_kssmc;
	}
	/**
	* getC_ssdq(void) 
	*/
	public String getC_ssdq(){
		return this.C_SSDQ;
	}
	/**
	*setC_ssdq(java.lang.String)
	*/
	public void setC_ssdq(String c_ssdq){
		this.C_SSDQ=c_ssdq;
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
	* getV_tssmc(void) 
	*/
	public String getV_tssmc(){
		return this.V_TSSMC;
	}
	/**
	*setV_tssmc(java.lang.String)
	*/
	public void setV_tssmc(String v_tssmc){
		this.V_TSSMC=v_tssmc;
	}
	/**
	* getV_tssglbmbh(void) 
	*/
	public String getV_tssglbmbh(){
		return this.V_TSSGLBMBH;
	}
	/**
	*setV_tssglbmbh(java.lang.String)
	*/
	public void setV_tssglbmbh(String v_tssglbmbh){
		this.V_TSSGLBMBH=v_tssglbmbh;
	}
	/**
	* getV_tssglbmmc(void) 
	*/
	public String getV_tssglbmmc(){
		return this.V_TSSGLBMMC;
	}
	/**
	*setV_tssglbmmc(java.lang.String)
	*/
	public void setV_tssglbmmc(String v_tssglbmmc){
		this.V_TSSGLBMMC=v_tssglbmmc;
	}


}