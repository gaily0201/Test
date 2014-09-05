package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasHyxtHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_hyxt_h")
public class CrpasHyxtHVO {
	/**
	* V_JSDWMC 接收单位名称
	*/
	@Column(columnName="v_jsdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="接收单位名称")
	private String V_JSDWMC = "v_jsdwmc";
	/**
	* C_SSKSS 所属看守所
	*/
	@Column(columnName="c_sskss",dataType="varchar",dataLength=20,nullAble="Y",comment="所属看守所")
	private String C_SSKSS = "c_sskss";
	/**
	* V_SSKSSMC 所属看守所名称
	*/
	@Column(columnName="v_sskssmc",dataType="varchar",dataLength=100,nullAble="Y",comment="所属看守所名称")
	private String V_SSKSSMC = "v_sskssmc";
	/**
	* C_XYR 嫌疑人
	*/
	@Column(columnName="c_xyr",dataType="varchar",dataLength=50,nullAble="Y",comment="嫌疑人")
	private String C_XYR = "c_xyr";
	/**
	* V_XYRXM 嫌疑人姓名
	*/
	@Column(columnName="v_xyrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="嫌疑人姓名")
	private String V_XYRXM = "v_xyrxm";
	/**
	* V_RYBH 人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=100,nullAble="Y",comment="人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* V_KSSRYBH 看守做人员编号
	*/
	@Column(columnName="v_kssrybh",dataType="varchar",dataLength=100,nullAble="Y",comment="看守做人员编号")
	private String V_KSSRYBH = "v_kssrybh";
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
	* PK_HYXT_H 主键
	*/
	@Column(columnName="pk_hyxt_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_HYXT_H = "pk_hyxt_h";
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
	@Column(columnName="v_ptajzj",dataType="char",dataLength=20,nullAble="Y",comment="平台案件主键")
	private String V_PTAJZJ = "v_ptajzj";
	/**
	* PK_WSHY_H 在押信息主键
	*/
	@Column(columnName="pk_wshy_h",dataType="char",dataLength=20,nullAble="Y",comment="在押信息主键")
	private String PK_WSHY_H = "pk_wshy_h";
	/**
	* V_WSBH 文书文号
	*/
	@Column(columnName="v_wsbh",dataType="varchar",dataLength=50,nullAble="Y",comment="文书文号")
	private String V_WSBH = "v_wsbh";
	/**
	* C_HYBM 换押部门
	*/
	@Column(columnName="c_hybm",dataType="varchar",dataLength=20,nullAble="Y",comment="换押部门")
	private String C_HYBM = "c_hybm";
	/**
	* V_HYBMMC 换押部门名称
	*/
	@Column(columnName="v_hybmmc",dataType="varchar",dataLength=50,nullAble="Y",comment="换押部门名称")
	private String V_HYBMMC = "v_hybmmc";
	/**
	* D_HYRQ 换押日期
	*/
	@Column(columnName="d_hyrq",dataType="char",dataLength=19,nullAble="Y",comment="换押日期")
	private String D_HYRQ = "d_hyrq";
	/**
	* T_HYSJ 换押时间
	*/
	@Column(columnName="t_hysj",dataType="char",dataLength=19,nullAble="Y",comment="换押时间")
	private String T_HYSJ = "t_hysj";
	/**
	* V_HYYY 换押原因
	*/
	@Column(columnName="v_hyyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="换押原因")
	private String V_HYYY = "v_hyyy";
	/**
	* C_HYLX 换押类型
	*/
	@Column(columnName="c_hylx",dataType="varchar",dataLength=20,nullAble="Y",comment="换押类型")
	private String C_HYLX = "c_hylx";
	/**
	* C_HYZT 换押状态
	*/
	@Column(columnName="c_hyzt",dataType="varchar",dataLength=20,nullAble="Y",comment="换押状态")
	private String C_HYZT = "c_hyzt";
	/**
	* D_JSRQ 接收日期
	*/
	@Column(columnName="d_jsrq",dataType="char",dataLength=19,nullAble="Y",comment="接收日期")
	private String D_JSRQ = "d_jsrq";
	/**
	* C_YCJYLY 延长羁押理由
	*/
	@Column(columnName="c_ycjyly",dataType="varchar",dataLength=2000,nullAble="Y",comment="延长羁押理由")
	private String C_YCJYLY = "c_ycjyly";
	/**
	* T_YCSJ 延长时间
	*/
	@Column(columnName="t_ycsj",dataType="varchar",dataLength=50,nullAble="Y",comment="延长时间")
	private String T_YCSJ = "t_ycsj";
	/**
	* C_JSR 接收人
	*/
	@Column(columnName="c_jsr",dataType="char",dataLength=20,nullAble="Y",comment="接收人")
	private String C_JSR = "c_jsr";
	/**
	* V_JSRXM 接收人姓名
	*/
	@Column(columnName="v_jsrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="接收人姓名")
	private String V_JSRXM = "v_jsrxm";
	/**
	* C_CZR 操作人
	*/
	@Column(columnName="c_czr",dataType="char",dataLength=20,nullAble="Y",comment="操作人")
	private String C_CZR = "c_czr";
	/**
	* V_CZRXM 操作人姓名
	*/
	@Column(columnName="v_czrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="操作人姓名")
	private String V_CZRXM = "v_czrxm";
	/**
	* C_CZBM 操作部门
	*/
	@Column(columnName="c_czbm",dataType="varchar",dataLength=20,nullAble="Y",comment="操作部门")
	private String C_CZBM = "c_czbm";
	/**
	* V_CZBMMC 操作部门名称
	*/
	@Column(columnName="v_czbmmc",dataType="varchar",dataLength=50,nullAble="Y",comment="操作部门名称")
	private String V_CZBMMC = "v_czbmmc";
	/**
	* V_GYQX 关押期限（办案期限）
	*/
	@Column(columnName="v_gyqx",dataType="varchar",dataLength=50,nullAble="Y",comment="关押期限（办案期限）")
	private String V_GYQX = "v_gyqx";
	/**
	* V_TAR 同案人
	*/
	@Column(columnName="v_tar",dataType="varchar",dataLength=50,nullAble="Y",comment="同案人")
	private String V_TAR = "v_tar";
	/**
	* C_YSDW 移送单位
	*/
	@Column(columnName="c_ysdw",dataType="varchar",dataLength=20,nullAble="Y",comment="移送单位")
	private String C_YSDW = "c_ysdw";
	/**
	* V_YSDWMC 移送单位名称
	*/
	@Column(columnName="v_ysdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="移送单位名称")
	private String V_YSDWMC = "v_ysdwmc";
	/**
	* C_JSDW 接收单位
	*/
	@Column(columnName="c_jsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="接收单位")
	private String C_JSDW = "c_jsdw";
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
	* getC_sskss(void) 
	*/
	public String getC_sskss(){
		return this.C_SSKSS;
	}
	/**
	*setC_sskss(java.lang.String)
	*/
	public void setC_sskss(String c_sskss){
		this.C_SSKSS=c_sskss;
	}
	/**
	* getV_sskssmc(void) 
	*/
	public String getV_sskssmc(){
		return this.V_SSKSSMC;
	}
	/**
	*setV_sskssmc(java.lang.String)
	*/
	public void setV_sskssmc(String v_sskssmc){
		this.V_SSKSSMC=v_sskssmc;
	}
	/**
	* getC_xyr(void) 
	*/
	public String getC_xyr(){
		return this.C_XYR;
	}
	/**
	*setC_xyr(java.lang.String)
	*/
	public void setC_xyr(String c_xyr){
		this.C_XYR=c_xyr;
	}
	/**
	* getV_xyrxm(void) 
	*/
	public String getV_xyrxm(){
		return this.V_XYRXM;
	}
	/**
	*setV_xyrxm(java.lang.String)
	*/
	public void setV_xyrxm(String v_xyrxm){
		this.V_XYRXM=v_xyrxm;
	}
	/**
	* getV_rybh(void) 
	*/
	public String getV_rybh(){
		return this.V_RYBH;
	}
	/**
	*setV_rybh(java.lang.String)
	*/
	public void setV_rybh(String v_rybh){
		this.V_RYBH=v_rybh;
	}
	/**
	* getV_kssrybh(void) 
	*/
	public String getV_kssrybh(){
		return this.V_KSSRYBH;
	}
	/**
	*setV_kssrybh(java.lang.String)
	*/
	public void setV_kssrybh(String v_kssrybh){
		this.V_KSSRYBH=v_kssrybh;
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
	* getPk_hyxt_h(void) 
	*/
	public String getPk_hyxt_h(){
		return this.PK_HYXT_H;
	}
	/**
	*setPk_hyxt_h(java.lang.String)
	*/
	public void setPk_hyxt_h(String pk_hyxt_h){
		this.PK_HYXT_H=pk_hyxt_h;
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
	* getPk_wshy_h(void) 
	*/
	public String getPk_wshy_h(){
		return this.PK_WSHY_H;
	}
	/**
	*setPk_wshy_h(java.lang.String)
	*/
	public void setPk_wshy_h(String pk_wshy_h){
		this.PK_WSHY_H=pk_wshy_h;
	}
	/**
	* getV_wsbh(void) 
	*/
	public String getV_wsbh(){
		return this.V_WSBH;
	}
	/**
	*setV_wsbh(java.lang.String)
	*/
	public void setV_wsbh(String v_wsbh){
		this.V_WSBH=v_wsbh;
	}
	/**
	* getC_hybm(void) 
	*/
	public String getC_hybm(){
		return this.C_HYBM;
	}
	/**
	*setC_hybm(java.lang.String)
	*/
	public void setC_hybm(String c_hybm){
		this.C_HYBM=c_hybm;
	}
	/**
	* getV_hybmmc(void) 
	*/
	public String getV_hybmmc(){
		return this.V_HYBMMC;
	}
	/**
	*setV_hybmmc(java.lang.String)
	*/
	public void setV_hybmmc(String v_hybmmc){
		this.V_HYBMMC=v_hybmmc;
	}
	/**
	* getD_hyrq(void) 
	*/
	public String getD_hyrq(){
		return this.D_HYRQ;
	}
	/**
	*setD_hyrq(java.lang.String)
	*/
	public void setD_hyrq(String d_hyrq){
		this.D_HYRQ=d_hyrq;
	}
	/**
	* getT_hysj(void) 
	*/
	public String getT_hysj(){
		return this.T_HYSJ;
	}
	/**
	*setT_hysj(java.lang.String)
	*/
	public void setT_hysj(String t_hysj){
		this.T_HYSJ=t_hysj;
	}
	/**
	* getV_hyyy(void) 
	*/
	public String getV_hyyy(){
		return this.V_HYYY;
	}
	/**
	*setV_hyyy(java.lang.String)
	*/
	public void setV_hyyy(String v_hyyy){
		this.V_HYYY=v_hyyy;
	}
	/**
	* getC_hylx(void) 
	*/
	public String getC_hylx(){
		return this.C_HYLX;
	}
	/**
	*setC_hylx(java.lang.String)
	*/
	public void setC_hylx(String c_hylx){
		this.C_HYLX=c_hylx;
	}
	/**
	* getC_hyzt(void) 
	*/
	public String getC_hyzt(){
		return this.C_HYZT;
	}
	/**
	*setC_hyzt(java.lang.String)
	*/
	public void setC_hyzt(String c_hyzt){
		this.C_HYZT=c_hyzt;
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
	* getC_ycjyly(void) 
	*/
	public String getC_ycjyly(){
		return this.C_YCJYLY;
	}
	/**
	*setC_ycjyly(java.lang.String)
	*/
	public void setC_ycjyly(String c_ycjyly){
		this.C_YCJYLY=c_ycjyly;
	}
	/**
	* getT_ycsj(void) 
	*/
	public String getT_ycsj(){
		return this.T_YCSJ;
	}
	/**
	*setT_ycsj(java.lang.String)
	*/
	public void setT_ycsj(String t_ycsj){
		this.T_YCSJ=t_ycsj;
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
	* getC_czr(void) 
	*/
	public String getC_czr(){
		return this.C_CZR;
	}
	/**
	*setC_czr(java.lang.String)
	*/
	public void setC_czr(String c_czr){
		this.C_CZR=c_czr;
	}
	/**
	* getV_czrxm(void) 
	*/
	public String getV_czrxm(){
		return this.V_CZRXM;
	}
	/**
	*setV_czrxm(java.lang.String)
	*/
	public void setV_czrxm(String v_czrxm){
		this.V_CZRXM=v_czrxm;
	}
	/**
	* getC_czbm(void) 
	*/
	public String getC_czbm(){
		return this.C_CZBM;
	}
	/**
	*setC_czbm(java.lang.String)
	*/
	public void setC_czbm(String c_czbm){
		this.C_CZBM=c_czbm;
	}
	/**
	* getV_czbmmc(void) 
	*/
	public String getV_czbmmc(){
		return this.V_CZBMMC;
	}
	/**
	*setV_czbmmc(java.lang.String)
	*/
	public void setV_czbmmc(String v_czbmmc){
		this.V_CZBMMC=v_czbmmc;
	}
	/**
	* getV_gyqx(void) 
	*/
	public String getV_gyqx(){
		return this.V_GYQX;
	}
	/**
	*setV_gyqx(java.lang.String)
	*/
	public void setV_gyqx(String v_gyqx){
		this.V_GYQX=v_gyqx;
	}
	/**
	* getV_tar(void) 
	*/
	public String getV_tar(){
		return this.V_TAR;
	}
	/**
	*setV_tar(java.lang.String)
	*/
	public void setV_tar(String v_tar){
		this.V_TAR=v_tar;
	}
	/**
	* getC_ysdw(void) 
	*/
	public String getC_ysdw(){
		return this.C_YSDW;
	}
	/**
	*setC_ysdw(java.lang.String)
	*/
	public void setC_ysdw(String c_ysdw){
		this.C_YSDW=c_ysdw;
	}
	/**
	* getV_ysdwmc(void) 
	*/
	public String getV_ysdwmc(){
		return this.V_YSDWMC;
	}
	/**
	*setV_ysdwmc(java.lang.String)
	*/
	public void setV_ysdwmc(String v_ysdwmc){
		this.V_YSDWMC=v_ysdwmc;
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


}