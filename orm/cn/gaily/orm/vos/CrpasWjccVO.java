package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasWjccVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_wjcc")
public class CrpasWjccVO {
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
	@Column(columnName="approvestatus",dataType="varchar",dataLength=50,nullAble="Y",comment="审批状态")
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
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
	/**
	* PK_WJCC 主键
	*/
	@Column(columnName="pk_wjcc",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_WJCC = "pk_wjcc";
	/**
	* V_PTZJ 平台主键
	*/
	@Column(columnName="v_ptzj",dataType="varchar",dataLength=100,nullAble="Y",comment="平台主键")
	private String V_PTZJ = "v_ptzj";
	/**
	* V_AJBH 案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=100,nullAble="Y",comment="案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* V_YWDJLX 业务单据类型
	*/
	@Column(columnName="v_ywdjlx",dataType="varchar",dataLength=100,nullAble="Y",comment="业务单据类型")
	private String V_YWDJLX = "v_ywdjlx";
	/**
	* C_UPLOADUSER 上传人
	*/
	@Column(columnName="c_uploaduser",dataType="varchar",dataLength=20,nullAble="Y",comment="上传人")
	private String C_UPLOADUSER = "c_uploaduser";
	/**
	* T_UPLOADTIME 上传时间
	*/
	@Column(columnName="t_uploadtime",dataType="char",dataLength=19,nullAble="Y",comment="上传时间")
	private String T_UPLOADTIME = "t_uploadtime";
	/**
	* C_UPLOADORG 上传单位
	*/
	@Column(columnName="c_uploadorg",dataType="varchar",dataLength=20,nullAble="Y",comment="上传单位")
	private String C_UPLOADORG = "c_uploadorg";
	/**
	* B_ISDOC 是否文件
	*/
	@Column(columnName="b_isdoc",dataType="char",dataLength=1,nullAble="Y",comment="是否文件")
	private String B_ISDOC = "b_isdoc";
	/**
	* B_ISFOLDER 是否目录
	*/
	@Column(columnName="b_isfolder",dataType="char",dataLength=1,nullAble="Y",comment="是否目录")
	private String B_ISFOLDER = "b_isfolder";
	/**
	* V_YWDJZJ 业务单据主键
	*/
	@Column(columnName="v_ywdjzj",dataType="varchar",dataLength=100,nullAble="Y",comment="业务单据主键")
	private String V_YWDJZJ = "v_ywdjzj";
	/**
	* V_SAVETYPE 存储方式
	*/
	@Column(columnName="v_savetype",dataType="varchar",dataLength=100,nullAble="Y",comment="存储方式")
	private String V_SAVETYPE = "v_savetype";
	/**
	* V_FILETYPE 文件类型
	*/
	@Column(columnName="v_filetype",dataType="varchar",dataLength=100,nullAble="Y",comment="文件类型")
	private String V_FILETYPE = "v_filetype";
	/**
	* V_FILENAME 文件名称
	*/
	@Column(columnName="v_filename",dataType="varchar",dataLength=100,nullAble="Y",comment="文件名称")
	private String V_FILENAME = "v_filename";
	/**
	* V_FILEPATH 文件路径
	*/
	@Column(columnName="v_filepath",dataType="varchar",dataLength=100,nullAble="Y",comment="文件路径")
	private String V_FILEPATH = "v_filepath";
	/**
	* V_FILELENGTH 文件大小
	*/
	@Column(columnName="v_filelength",dataType="varchar",dataLength=100,nullAble="Y",comment="文件大小")
	private String V_FILELENGTH = "v_filelength";
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
	* getPk_wjcc(void) 
	*/
	public String getPk_wjcc(){
		return this.PK_WJCC;
	}
	/**
	*setPk_wjcc(java.lang.String)
	*/
	public void setPk_wjcc(String pk_wjcc){
		this.PK_WJCC=pk_wjcc;
	}
	/**
	* getV_ptzj(void) 
	*/
	public String getV_ptzj(){
		return this.V_PTZJ;
	}
	/**
	*setV_ptzj(java.lang.String)
	*/
	public void setV_ptzj(String v_ptzj){
		this.V_PTZJ=v_ptzj;
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
	* getV_ywdjlx(void) 
	*/
	public String getV_ywdjlx(){
		return this.V_YWDJLX;
	}
	/**
	*setV_ywdjlx(java.lang.String)
	*/
	public void setV_ywdjlx(String v_ywdjlx){
		this.V_YWDJLX=v_ywdjlx;
	}
	/**
	* getC_uploaduser(void) 
	*/
	public String getC_uploaduser(){
		return this.C_UPLOADUSER;
	}
	/**
	*setC_uploaduser(java.lang.String)
	*/
	public void setC_uploaduser(String c_uploaduser){
		this.C_UPLOADUSER=c_uploaduser;
	}
	/**
	* getT_uploadtime(void) 
	*/
	public String getT_uploadtime(){
		return this.T_UPLOADTIME;
	}
	/**
	*setT_uploadtime(java.lang.String)
	*/
	public void setT_uploadtime(String t_uploadtime){
		this.T_UPLOADTIME=t_uploadtime;
	}
	/**
	* getC_uploadorg(void) 
	*/
	public String getC_uploadorg(){
		return this.C_UPLOADORG;
	}
	/**
	*setC_uploadorg(java.lang.String)
	*/
	public void setC_uploadorg(String c_uploadorg){
		this.C_UPLOADORG=c_uploadorg;
	}
	/**
	* getB_isdoc(void) 
	*/
	public String getB_isdoc(){
		return this.B_ISDOC;
	}
	/**
	*setB_isdoc(java.lang.String)
	*/
	public void setB_isdoc(String b_isdoc){
		this.B_ISDOC=b_isdoc;
	}
	/**
	* getB_isfolder(void) 
	*/
	public String getB_isfolder(){
		return this.B_ISFOLDER;
	}
	/**
	*setB_isfolder(java.lang.String)
	*/
	public void setB_isfolder(String b_isfolder){
		this.B_ISFOLDER=b_isfolder;
	}
	/**
	* getV_ywdjzj(void) 
	*/
	public String getV_ywdjzj(){
		return this.V_YWDJZJ;
	}
	/**
	*setV_ywdjzj(java.lang.String)
	*/
	public void setV_ywdjzj(String v_ywdjzj){
		this.V_YWDJZJ=v_ywdjzj;
	}
	/**
	* getV_savetype(void) 
	*/
	public String getV_savetype(){
		return this.V_SAVETYPE;
	}
	/**
	*setV_savetype(java.lang.String)
	*/
	public void setV_savetype(String v_savetype){
		this.V_SAVETYPE=v_savetype;
	}
	/**
	* getV_filetype(void) 
	*/
	public String getV_filetype(){
		return this.V_FILETYPE;
	}
	/**
	*setV_filetype(java.lang.String)
	*/
	public void setV_filetype(String v_filetype){
		this.V_FILETYPE=v_filetype;
	}
	/**
	* getV_filename(void) 
	*/
	public String getV_filename(){
		return this.V_FILENAME;
	}
	/**
	*setV_filename(java.lang.String)
	*/
	public void setV_filename(String v_filename){
		this.V_FILENAME=v_filename;
	}
	/**
	* getV_filepath(void) 
	*/
	public String getV_filepath(){
		return this.V_FILEPATH;
	}
	/**
	*setV_filepath(java.lang.String)
	*/
	public void setV_filepath(String v_filepath){
		this.V_FILEPATH=v_filepath;
	}
	/**
	* getV_filelength(void) 
	*/
	public String getV_filelength(){
		return this.V_FILELENGTH;
	}
	/**
	*setV_filelength(java.lang.String)
	*/
	public void setV_filelength(String v_filelength){
		this.V_FILELENGTH=v_filelength;
	}


}