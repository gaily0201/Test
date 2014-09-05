package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSqjzHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sqjz_h")
public class CrpasSqjzHVO {
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
	* PK_SQJZ_H 主键
	*/
	@Column(columnName="pk_sqjz_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_SQJZ_H = "pk_sqjz_h";
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
	* C_SSDW 所属司法局
	*/
	@Column(columnName="c_ssdw",dataType="varchar",dataLength=20,nullAble="Y",comment="所属司法局")
	private String C_SSDW = "c_ssdw";
	/**
	* V_SSDWMC 所属司法局名称
	*/
	@Column(columnName="v_ssdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="所属司法局名称")
	private String V_SSDWMC = "v_ssdwmc";
	/**
	* V_XM 姓名
	*/
	@Column(columnName="v_xm",dataType="varchar",dataLength=50,nullAble="Y",comment="姓名")
	private String V_XM = "v_xm";
	/**
	* V_BM 别名
	*/
	@Column(columnName="v_bm",dataType="varchar",dataLength=50,nullAble="Y",comment="别名")
	private String V_BM = "v_bm";
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
	* C_WHCD 文化程度
	*/
	@Column(columnName="c_whcd",dataType="varchar",dataLength=50,nullAble="Y",comment="文化程度")
	private String C_WHCD = "c_whcd";
	/**
	* C_YZZMM 原政治面貌
	*/
	@Column(columnName="c_yzzmm",dataType="varchar",dataLength=50,nullAble="Y",comment="原政治面貌")
	private String C_YZZMM = "c_yzzmm";
	/**
	* V_JG 籍贯
	*/
	@Column(columnName="v_jg",dataType="varchar",dataLength=50,nullAble="Y",comment="籍贯")
	private String V_JG = "v_jg";
	/**
	* V_HJSZD 户籍所在地
	*/
	@Column(columnName="v_hjszd",dataType="varchar",dataLength=50,nullAble="Y",comment="户籍所在地")
	private String V_HJSZD = "v_hjszd";
	/**
	* C_HYZK 婚姻状况
	*/
	@Column(columnName="c_hyzk",dataType="varchar",dataLength=50,nullAble="Y",comment="婚姻状况")
	private String C_HYZK = "c_hyzk";
	/**
	* V_SFZHM 身份证号码
	*/
	@Column(columnName="v_sfzhm",dataType="varchar",dataLength=50,nullAble="Y",comment="身份证号码")
	private String V_SFZHM = "v_sfzhm";
	/**
	* C_HKLX 户口类型
	*/
	@Column(columnName="c_hklx",dataType="varchar",dataLength=50,nullAble="Y",comment="户口类型")
	private String C_HKLX = "c_hklx";
	/**
	* V_YDW 原单位
	*/
	@Column(columnName="v_ydw",dataType="varchar",dataLength=50,nullAble="Y",comment="原单位")
	private String V_YDW = "v_ydw";
	/**
	* V_YZW 原职务
	*/
	@Column(columnName="v_yzw",dataType="varchar",dataLength=50,nullAble="Y",comment="原职务")
	private String V_YZW = "v_yzw";
	/**
	* V_JTZZ 家庭住址
	*/
	@Column(columnName="v_jtzz",dataType="varchar",dataLength=50,nullAble="Y",comment="家庭住址")
	private String V_JTZZ = "v_jtzz";
	/**
	* V_DWDH 单位电话
	*/
	@Column(columnName="v_dwdh",dataType="varchar",dataLength=50,nullAble="Y",comment="单位电话")
	private String V_DWDH = "v_dwdh";
	/**
	* V_LXDH 联系电话
	*/
	@Column(columnName="v_lxdh",dataType="varchar",dataLength=50,nullAble="Y",comment="联系电话")
	private String V_LXDH = "v_lxdh";
	/**
	* V_PJSH 判决书号
	*/
	@Column(columnName="v_pjsh",dataType="varchar",dataLength=50,nullAble="Y",comment="判决书号")
	private String V_PJSH = "v_pjsh";
	/**
	* C_PJJG 判决机关
	*/
	@Column(columnName="c_pjjg",dataType="varchar",dataLength=20,nullAble="Y",comment="判决机关")
	private String C_PJJG = "c_pjjg";
	/**
	* V_PJJGMC 判决机关名称
	*/
	@Column(columnName="v_pjjgmc",dataType="varchar",dataLength=50,nullAble="Y",comment="判决机关名称")
	private String V_PJJGMC = "v_pjjgmc";
	/**
	* D_PJRQ 判决日期
	*/
	@Column(columnName="d_pjrq",dataType="char",dataLength=19,nullAble="Y",comment="判决日期")
	private String D_PJRQ = "d_pjrq";
	/**
	* C_ZMLX 罪名类型
	*/
	@Column(columnName="c_zmlx",dataType="varchar",dataLength=20,nullAble="Y",comment="罪名类型")
	private String C_ZMLX = "c_zmlx";
	/**
	* C_XZ 刑种
	*/
	@Column(columnName="c_xz",dataType="varchar",dataLength=50,nullAble="Y",comment="刑种")
	private String C_XZ = "c_xz";
	/**
	* V_JTZM 具体罪名
	*/
	@Column(columnName="v_jtzm",dataType="varchar",dataLength=50,nullAble="Y",comment="具体罪名")
	private String V_JTZM = "v_jtzm";
	/**
	* V_YPXQ 原判刑期
	*/
	@Column(columnName="v_ypxq",dataType="varchar",dataLength=50,nullAble="Y",comment="原判刑期")
	private String V_YPXQ = "v_ypxq";
	/**
	* V_FJX 附加刑
	*/
	@Column(columnName="v_fjx",dataType="varchar",dataLength=20,nullAble="Y",comment="附加刑")
	private String V_FJX = "v_fjx";
	/**
	* T_XQKSSJ 刑期起始时间
	*/
	@Column(columnName="t_xqkssj",dataType="char",dataLength=19,nullAble="Y",comment="刑期起始时间")
	private String T_XQKSSJ = "t_xqkssj";
	/**
	* V_XQBD 刑期变动
	*/
	@Column(columnName="v_xqbd",dataType="varchar",dataLength=50,nullAble="Y",comment="刑期变动")
	private String V_XQBD = "v_xqbd";
	/**
	* T_XQZZSJ 刑期终止时间
	*/
	@Column(columnName="t_xqzzsj",dataType="char",dataLength=19,nullAble="Y",comment="刑期终止时间")
	private String T_XQZZSJ = "t_xqzzsj";
	/**
	* T_JZQSSJ 矫正起始时间
	*/
	@Column(columnName="t_jzqssj",dataType="char",dataLength=19,nullAble="Y",comment="矫正起始时间")
	private String T_JZQSSJ = "t_jzqssj";
	/**
	* C_JZZFRY 矫正执法人员
	*/
	@Column(columnName="c_jzzfry",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正执法人员")
	private String C_JZZFRY = "c_jzzfry";
	/**
	* V_JZZFRYXM 矫正执法人员姓名
	*/
	@Column(columnName="v_jzzfryxm",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正执法人员姓名")
	private String V_JZZFRYXM = "v_jzzfryxm";
	/**
	* T_JZZZSJ 矫正终止时间
	*/
	@Column(columnName="t_jzzzsj",dataType="char",dataLength=19,nullAble="Y",comment="矫正终止时间")
	private String T_JZZZSJ = "t_jzzzsj";
	/**
	* C_SQJZLX 社区矫正类型
	*/
	@Column(columnName="c_sqjzlx",dataType="varchar",dataLength=50,nullAble="Y",comment="社区矫正类型")
	private String C_SQJZLX = "c_sqjzlx";
	/**
	* V_ZYFZSS 主要犯罪事实
	*/
	@Column(columnName="v_zyfzss",dataType="varchar",dataLength=2000,nullAble="Y",comment="主要犯罪事实")
	private String V_ZYFZSS = "v_zyfzss";
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
	@Column(columnName="t_xtwcsj",dataType="char",dataLength=19,nullAble="Y",comment="协同完成时间")
	private String T_XTWCSJ = "t_xtwcsj";
	/**
	* C_XTZT 协同状态
	*/
	@Column(columnName="c_xtzt",dataType="varchar",dataLength=20,nullAble="Y",comment="协同状态")
	private String C_XTZT = "c_xtzt";
	/**
	* V_PTBH 平台案件编号
	*/
	@Column(columnName="v_ptbh",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件编号")
	private String V_PTBH = "v_ptbh";
	/**
	* V_AJBH 案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* V_GLBH 关联编号
	*/
	@Column(columnName="v_glbh",dataType="varchar",dataLength=50,nullAble="Y",comment="关联编号")
	private String V_GLBH = "v_glbh";
	/**
	* V_AJMC 案件名称
	*/
	@Column(columnName="v_ajmc",dataType="varchar",dataLength=50,nullAble="Y",comment="案件名称")
	private String V_AJMC = "v_ajmc";
	/**
	* V_JZBH 矫正对象编号
	*/
	@Column(columnName="v_jzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="矫正对象编号")
	private String V_JZBH = "v_jzbh";
	/**
	* V_RYZJ 人员主键
	*/
	@Column(columnName="v_ryzj",dataType="char",dataLength=20,nullAble="Y",comment="人员主键")
	private String V_RYZJ = "v_ryzj";
	/**
	* V_RYBH 人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=50,nullAble="Y",comment="人员编号")
	private String V_RYBH = "v_rybh";
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
	* getC_ssdw(void) 
	*/
	public String getC_ssdw(){
		return this.C_SSDW;
	}
	/**
	*setC_ssdw(java.lang.String)
	*/
	public void setC_ssdw(String c_ssdw){
		this.C_SSDW=c_ssdw;
	}
	/**
	* getV_ssdwmc(void) 
	*/
	public String getV_ssdwmc(){
		return this.V_SSDWMC;
	}
	/**
	*setV_ssdwmc(java.lang.String)
	*/
	public void setV_ssdwmc(String v_ssdwmc){
		this.V_SSDWMC=v_ssdwmc;
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
	* getV_bm(void) 
	*/
	public String getV_bm(){
		return this.V_BM;
	}
	/**
	*setV_bm(java.lang.String)
	*/
	public void setV_bm(String v_bm){
		this.V_BM=v_bm;
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
	* getC_yzzmm(void) 
	*/
	public String getC_yzzmm(){
		return this.C_YZZMM;
	}
	/**
	*setC_yzzmm(java.lang.String)
	*/
	public void setC_yzzmm(String c_yzzmm){
		this.C_YZZMM=c_yzzmm;
	}
	/**
	* getV_jg(void) 
	*/
	public String getV_jg(){
		return this.V_JG;
	}
	/**
	*setV_jg(java.lang.String)
	*/
	public void setV_jg(String v_jg){
		this.V_JG=v_jg;
	}
	/**
	* getV_hjszd(void) 
	*/
	public String getV_hjszd(){
		return this.V_HJSZD;
	}
	/**
	*setV_hjszd(java.lang.String)
	*/
	public void setV_hjszd(String v_hjszd){
		this.V_HJSZD=v_hjszd;
	}
	/**
	* getC_hyzk(void) 
	*/
	public String getC_hyzk(){
		return this.C_HYZK;
	}
	/**
	*setC_hyzk(java.lang.String)
	*/
	public void setC_hyzk(String c_hyzk){
		this.C_HYZK=c_hyzk;
	}
	/**
	* getV_sfzhm(void) 
	*/
	public String getV_sfzhm(){
		return this.V_SFZHM;
	}
	/**
	*setV_sfzhm(java.lang.String)
	*/
	public void setV_sfzhm(String v_sfzhm){
		this.V_SFZHM=v_sfzhm;
	}
	/**
	* getC_hklx(void) 
	*/
	public String getC_hklx(){
		return this.C_HKLX;
	}
	/**
	*setC_hklx(java.lang.String)
	*/
	public void setC_hklx(String c_hklx){
		this.C_HKLX=c_hklx;
	}
	/**
	* getV_ydw(void) 
	*/
	public String getV_ydw(){
		return this.V_YDW;
	}
	/**
	*setV_ydw(java.lang.String)
	*/
	public void setV_ydw(String v_ydw){
		this.V_YDW=v_ydw;
	}
	/**
	* getV_yzw(void) 
	*/
	public String getV_yzw(){
		return this.V_YZW;
	}
	/**
	*setV_yzw(java.lang.String)
	*/
	public void setV_yzw(String v_yzw){
		this.V_YZW=v_yzw;
	}
	/**
	* getV_jtzz(void) 
	*/
	public String getV_jtzz(){
		return this.V_JTZZ;
	}
	/**
	*setV_jtzz(java.lang.String)
	*/
	public void setV_jtzz(String v_jtzz){
		this.V_JTZZ=v_jtzz;
	}
	/**
	* getV_dwdh(void) 
	*/
	public String getV_dwdh(){
		return this.V_DWDH;
	}
	/**
	*setV_dwdh(java.lang.String)
	*/
	public void setV_dwdh(String v_dwdh){
		this.V_DWDH=v_dwdh;
	}
	/**
	* getV_lxdh(void) 
	*/
	public String getV_lxdh(){
		return this.V_LXDH;
	}
	/**
	*setV_lxdh(java.lang.String)
	*/
	public void setV_lxdh(String v_lxdh){
		this.V_LXDH=v_lxdh;
	}
	/**
	* getV_pjsh(void) 
	*/
	public String getV_pjsh(){
		return this.V_PJSH;
	}
	/**
	*setV_pjsh(java.lang.String)
	*/
	public void setV_pjsh(String v_pjsh){
		this.V_PJSH=v_pjsh;
	}
	/**
	* getC_pjjg(void) 
	*/
	public String getC_pjjg(){
		return this.C_PJJG;
	}
	/**
	*setC_pjjg(java.lang.String)
	*/
	public void setC_pjjg(String c_pjjg){
		this.C_PJJG=c_pjjg;
	}
	/**
	* getV_pjjgmc(void) 
	*/
	public String getV_pjjgmc(){
		return this.V_PJJGMC;
	}
	/**
	*setV_pjjgmc(java.lang.String)
	*/
	public void setV_pjjgmc(String v_pjjgmc){
		this.V_PJJGMC=v_pjjgmc;
	}
	/**
	* getD_pjrq(void) 
	*/
	public String getD_pjrq(){
		return this.D_PJRQ;
	}
	/**
	*setD_pjrq(java.lang.String)
	*/
	public void setD_pjrq(String d_pjrq){
		this.D_PJRQ=d_pjrq;
	}
	/**
	* getC_zmlx(void) 
	*/
	public String getC_zmlx(){
		return this.C_ZMLX;
	}
	/**
	*setC_zmlx(java.lang.String)
	*/
	public void setC_zmlx(String c_zmlx){
		this.C_ZMLX=c_zmlx;
	}
	/**
	* getC_xz(void) 
	*/
	public String getC_xz(){
		return this.C_XZ;
	}
	/**
	*setC_xz(java.lang.String)
	*/
	public void setC_xz(String c_xz){
		this.C_XZ=c_xz;
	}
	/**
	* getV_jtzm(void) 
	*/
	public String getV_jtzm(){
		return this.V_JTZM;
	}
	/**
	*setV_jtzm(java.lang.String)
	*/
	public void setV_jtzm(String v_jtzm){
		this.V_JTZM=v_jtzm;
	}
	/**
	* getV_ypxq(void) 
	*/
	public String getV_ypxq(){
		return this.V_YPXQ;
	}
	/**
	*setV_ypxq(java.lang.String)
	*/
	public void setV_ypxq(String v_ypxq){
		this.V_YPXQ=v_ypxq;
	}
	/**
	* getV_fjx(void) 
	*/
	public String getV_fjx(){
		return this.V_FJX;
	}
	/**
	*setV_fjx(java.lang.String)
	*/
	public void setV_fjx(String v_fjx){
		this.V_FJX=v_fjx;
	}
	/**
	* getT_xqkssj(void) 
	*/
	public String getT_xqkssj(){
		return this.T_XQKSSJ;
	}
	/**
	*setT_xqkssj(java.lang.String)
	*/
	public void setT_xqkssj(String t_xqkssj){
		this.T_XQKSSJ=t_xqkssj;
	}
	/**
	* getV_xqbd(void) 
	*/
	public String getV_xqbd(){
		return this.V_XQBD;
	}
	/**
	*setV_xqbd(java.lang.String)
	*/
	public void setV_xqbd(String v_xqbd){
		this.V_XQBD=v_xqbd;
	}
	/**
	* getT_xqzzsj(void) 
	*/
	public String getT_xqzzsj(){
		return this.T_XQZZSJ;
	}
	/**
	*setT_xqzzsj(java.lang.String)
	*/
	public void setT_xqzzsj(String t_xqzzsj){
		this.T_XQZZSJ=t_xqzzsj;
	}
	/**
	* getT_jzqssj(void) 
	*/
	public String getT_jzqssj(){
		return this.T_JZQSSJ;
	}
	/**
	*setT_jzqssj(java.lang.String)
	*/
	public void setT_jzqssj(String t_jzqssj){
		this.T_JZQSSJ=t_jzqssj;
	}
	/**
	* getC_jzzfry(void) 
	*/
	public String getC_jzzfry(){
		return this.C_JZZFRY;
	}
	/**
	*setC_jzzfry(java.lang.String)
	*/
	public void setC_jzzfry(String c_jzzfry){
		this.C_JZZFRY=c_jzzfry;
	}
	/**
	* getV_jzzfryxm(void) 
	*/
	public String getV_jzzfryxm(){
		return this.V_JZZFRYXM;
	}
	/**
	*setV_jzzfryxm(java.lang.String)
	*/
	public void setV_jzzfryxm(String v_jzzfryxm){
		this.V_JZZFRYXM=v_jzzfryxm;
	}
	/**
	* getT_jzzzsj(void) 
	*/
	public String getT_jzzzsj(){
		return this.T_JZZZSJ;
	}
	/**
	*setT_jzzzsj(java.lang.String)
	*/
	public void setT_jzzzsj(String t_jzzzsj){
		this.T_JZZZSJ=t_jzzzsj;
	}
	/**
	* getC_sqjzlx(void) 
	*/
	public String getC_sqjzlx(){
		return this.C_SQJZLX;
	}
	/**
	*setC_sqjzlx(java.lang.String)
	*/
	public void setC_sqjzlx(String c_sqjzlx){
		this.C_SQJZLX=c_sqjzlx;
	}
	/**
	* getV_zyfzss(void) 
	*/
	public String getV_zyfzss(){
		return this.V_ZYFZSS;
	}
	/**
	*setV_zyfzss(java.lang.String)
	*/
	public void setV_zyfzss(String v_zyfzss){
		this.V_ZYFZSS=v_zyfzss;
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
	* getV_glbh(void) 
	*/
	public String getV_glbh(){
		return this.V_GLBH;
	}
	/**
	*setV_glbh(java.lang.String)
	*/
	public void setV_glbh(String v_glbh){
		this.V_GLBH=v_glbh;
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
	* getV_ryzj(void) 
	*/
	public String getV_ryzj(){
		return this.V_RYZJ;
	}
	/**
	*setV_ryzj(java.lang.String)
	*/
	public void setV_ryzj(String v_ryzj){
		this.V_RYZJ=v_ryzj;
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


}