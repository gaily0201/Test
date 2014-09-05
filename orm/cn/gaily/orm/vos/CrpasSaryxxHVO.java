package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSaryxxHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_saryxx_h")
public class CrpasSaryxxHVO {
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
	* BILLNO 单据号
	*/
	@Column(columnName="billno",dataType="varchar",dataLength=50,nullAble="Y",comment="单据号")
	private String BILLNO = "billno";
	/**
	* BILLVERSIONPK 单据版本pk
	*/
	@Column(columnName="billversionpk",dataType="varchar",dataLength=50,nullAble="Y",comment="单据版本pk")
	private String BILLVERSIONPK = "billversionpk";
	/**
	* PK_SARYXX_H 主键
	*/
	@Column(columnName="pk_saryxx_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_SARYXX_H = "pk_saryxx_h";
	/**
	* V_RYBH 人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=50,nullAble="Y",comment="人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* V_GMSFHM 公民身份号码
	*/
	@Column(columnName="v_gmsfhm",dataType="varchar",dataLength=50,nullAble="Y",comment="公民身份号码")
	private String V_GMSFHM = "v_gmsfhm";
	/**
	* V_XM 姓名
	*/
	@Column(columnName="v_xm",dataType="varchar",dataLength=50,nullAble="Y",comment="姓名")
	private String V_XM = "v_xm";
	/**
	* V_XMPY 姓名拼音
	*/
	@Column(columnName="v_xmpy",dataType="varchar",dataLength=50,nullAble="Y",comment="姓名拼音")
	private String V_XMPY = "v_xmpy";
	/**
	* V_CYM 曾用名
	*/
	@Column(columnName="v_cym",dataType="varchar",dataLength=50,nullAble="Y",comment="曾用名")
	private String V_CYM = "v_cym";
	/**
	* V_CYMPY 曾用名拼音
	*/
	@Column(columnName="v_cympy",dataType="varchar",dataLength=50,nullAble="Y",comment="曾用名拼音")
	private String V_CYMPY = "v_cympy";
	/**
	* V_YWX 英文姓
	*/
	@Column(columnName="v_ywx",dataType="varchar",dataLength=50,nullAble="Y",comment="英文姓")
	private String V_YWX = "v_ywx";
	/**
	* V_YWM 英文名
	*/
	@Column(columnName="v_ywm",dataType="varchar",dataLength=50,nullAble="Y",comment="英文名")
	private String V_YWM = "v_ywm";
	/**
	* C_ZJZL 证件种类
	*/
	@Column(columnName="c_zjzl",dataType="varchar",dataLength=20,nullAble="Y",comment="证件种类")
	private String C_ZJZL = "c_zjzl";
	/**
	* V_ZJHM 证件号码
	*/
	@Column(columnName="v_zjhm",dataType="varchar",dataLength=50,nullAble="Y",comment="证件号码")
	private String V_ZJHM = "v_zjhm";
	/**
	* V_BMCH 别名绰号
	*/
	@Column(columnName="v_bmch",dataType="varchar",dataLength=50,nullAble="Y",comment="别名绰号")
	private String V_BMCH = "v_bmch";
	/**
	* V_BMCHPY 别名绰号拼音
	*/
	@Column(columnName="v_bmchpy",dataType="varchar",dataLength=50,nullAble="Y",comment="别名绰号拼音")
	private String V_BMCHPY = "v_bmchpy";
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
	* T_CSSJ 出生时间
	*/
	@Column(columnName="t_cssj",dataType="char",dataLength=19,nullAble="Y",comment="出生时间")
	private String T_CSSJ = "t_cssj";
	/**
	* V_CSZMBH 出生证明编号
	*/
	@Column(columnName="v_cszmbh",dataType="varchar",dataLength=50,nullAble="Y",comment="出生证明编号")
	private String V_CSZMBH = "v_cszmbh";
	/**
	* C_CSDQ 出生地区
	*/
	@Column(columnName="c_csdq",dataType="varchar",dataLength=20,nullAble="Y",comment="出生地区")
	private String C_CSDQ = "c_csdq";
	/**
	* C_CSQX 出生区县
	*/
	@Column(columnName="c_csqx",dataType="varchar",dataLength=20,nullAble="Y",comment="出生区县")
	private String C_CSQX = "c_csqx";
	/**
	* V_CSXZ 出生详址
	*/
	@Column(columnName="v_csxz",dataType="varchar",dataLength=100,nullAble="Y",comment="出生详址")
	private String V_CSXZ = "v_csxz";
	/**
	* C_JGDQ 籍贯地区
	*/
	@Column(columnName="c_jgdq",dataType="varchar",dataLength=20,nullAble="Y",comment="籍贯地区")
	private String C_JGDQ = "c_jgdq";
	/**
	* C_JGQX 籍贯区县
	*/
	@Column(columnName="c_jgqx",dataType="varchar",dataLength=20,nullAble="Y",comment="籍贯区县")
	private String C_JGQX = "c_jgqx";
	/**
	* V_JGXZ 籍贯详址
	*/
	@Column(columnName="v_jgxz",dataType="varchar",dataLength=100,nullAble="Y",comment="籍贯详址")
	private String V_JGXZ = "v_jgxz";
	/**
	* C_ZJXY 宗教信仰
	*/
	@Column(columnName="c_zjxy",dataType="varchar",dataLength=20,nullAble="Y",comment="宗教信仰")
	private String C_ZJXY = "c_zjxy";
	/**
	* C_ZZMM 政治面貌
	*/
	@Column(columnName="c_zzmm",dataType="varchar",dataLength=20,nullAble="Y",comment="政治面貌")
	private String C_ZZMM = "c_zzmm";
	/**
	* C_WHCD 文化程度
	*/
	@Column(columnName="c_whcd",dataType="varchar",dataLength=20,nullAble="Y",comment="文化程度")
	private String C_WHCD = "c_whcd";
	/**
	* C_HYZK 婚姻状况
	*/
	@Column(columnName="c_hyzk",dataType="varchar",dataLength=20,nullAble="Y",comment="婚姻状况")
	private String C_HYZK = "c_hyzk";
	/**
	* C_BYZK 兵役状况
	*/
	@Column(columnName="c_byzk",dataType="varchar",dataLength=20,nullAble="Y",comment="兵役状况")
	private String C_BYZK = "c_byzk";
	/**
	* N_SG 身高(厘米)
	*/
	@Column(columnName="n_sg",dataType="int",dataLength=0,nullAble="Y",comment="身高(厘米)")
	private String N_SG = "n_sg";
	/**
	* C_XX 血型
	*/
	@Column(columnName="c_xx",dataType="varchar",dataLength=20,nullAble="Y",comment="血型")
	private String C_XX = "c_xx";
	/**
	* C_SF 身份
	*/
	@Column(columnName="c_sf",dataType="varchar",dataLength=20,nullAble="Y",comment="身份")
	private String C_SF = "c_sf";
	/**
	* C_ZC 专长
	*/
	@Column(columnName="c_zc",dataType="varchar",dataLength=20,nullAble="Y",comment="专长")
	private String C_ZC = "c_zc";
	/**
	* V_ZW 职务
	*/
	@Column(columnName="v_zw",dataType="varchar",dataLength=50,nullAble="Y",comment="职务")
	private String V_ZW = "v_zw";
	/**
	* V_ZY 职业
	*/
	@Column(columnName="v_zy",dataType="varchar",dataLength=50,nullAble="Y",comment="职业")
	private String V_ZY = "v_zy";
	/**
	* C_ZYLB 职业类别
	*/
	@Column(columnName="c_zylb",dataType="varchar",dataLength=20,nullAble="Y",comment="职业类别")
	private String C_ZYLB = "c_zylb";
	/**
	* V_FWCS 服务处所
	*/
	@Column(columnName="v_fwcs",dataType="varchar",dataLength=50,nullAble="Y",comment="服务处所")
	private String V_FWCS = "v_fwcs";
	/**
	* V_LXDH 联系电话
	*/
	@Column(columnName="v_lxdh",dataType="varchar",dataLength=100,nullAble="Y",comment="联系电话")
	private String V_LXDH = "v_lxdh";
	/**
	* V_ZWSP 中文水平
	*/
	@Column(columnName="v_zwsp",dataType="varchar",dataLength=50,nullAble="Y",comment="中文水平")
	private String V_ZWSP = "v_zwsp";
	/**
	* D_SWRQ 死亡日期
	*/
	@Column(columnName="d_swrq",dataType="char",dataLength=19,nullAble="Y",comment="死亡日期")
	private String D_SWRQ = "d_swrq";
	/**
	* V_SWZMBH 死亡证明编号
	*/
	@Column(columnName="v_swzmbh",dataType="varchar",dataLength=50,nullAble="Y",comment="死亡证明编号")
	private String V_SWZMBH = "v_swzmbh";
	/**
	* C_GJDQ 国家地区
	*/
	@Column(columnName="c_gjdq",dataType="varchar",dataLength=20,nullAble="Y",comment="国家地区")
	private String C_GJDQ = "c_gjdq";
	/**
	* C_HJQH 户籍区划
	*/
	@Column(columnName="c_hjqh",dataType="varchar",dataLength=20,nullAble="Y",comment="户籍区划")
	private String C_HJQH = "c_hjqh";
	/**
	* V_HJQHMC 户籍区划名称
	*/
	@Column(columnName="v_hjqhmc",dataType="varchar",dataLength=100,nullAble="Y",comment="户籍区划名称")
	private String V_HJQHMC = "v_hjqhmc";
	/**
	* C_HJZRQ 户籍责任区
	*/
	@Column(columnName="c_hjzrq",dataType="varchar",dataLength=20,nullAble="Y",comment="户籍责任区")
	private String C_HJZRQ = "c_hjzrq";
	/**
	* V_HJXZ 户籍详址
	*/
	@Column(columnName="v_hjxz",dataType="varchar",dataLength=100,nullAble="Y",comment="户籍详址")
	private String V_HJXZ = "v_hjxz";
	/**
	* C_XXJB 信息级别
	*/
	@Column(columnName="c_xxjb",dataType="varchar",dataLength=20,nullAble="Y",comment="信息级别")
	private String C_XXJB = "c_xxjb";
	/**
	* C_RYLB 人员类别
	*/
	@Column(columnName="c_rylb",dataType="varchar",dataLength=20,nullAble="Y",comment="人员类别")
	private String C_RYLB = "c_rylb";
	/**
	* C_RYSX 人员属性
	*/
	@Column(columnName="c_rysx",dataType="varchar",dataLength=60,nullAble="Y",comment="人员属性")
	private String C_RYSX = "c_rysx";
	/**
	* V_RYZZBH 人员住址编号
	*/
	@Column(columnName="v_ryzzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="人员住址编号")
	private String V_RYZZBH = "v_ryzzbh";
	/**
	* V_ZWBH 指纹编号
	*/
	@Column(columnName="v_zwbh",dataType="varchar",dataLength=50,nullAble="Y",comment="指纹编号")
	private String V_ZWBH = "v_zwbh";
	/**
	* V_DNABH DNA编号
	*/
	@Column(columnName="v_dnabh",dataType="varchar",dataLength=50,nullAble="Y",comment="DNA编号")
	private String V_DNABH = "v_dnabh";
	/**
	* C_XZZZRQ 现住址责任区
	*/
	@Column(columnName="c_xzzzrq",dataType="varchar",dataLength=20,nullAble="Y",comment="现住址责任区")
	private String C_XZZZRQ = "c_xzzzrq";
	/**
	* C_XZZQH 现住址区划
	*/
	@Column(columnName="c_xzzqh",dataType="varchar",dataLength=20,nullAble="Y",comment="现住址区划")
	private String C_XZZQH = "c_xzzqh";
	/**
	* V_XZZXZ 现住址详址
	*/
	@Column(columnName="v_xzzxz",dataType="varchar",dataLength=100,nullAble="Y",comment="现住址详址")
	private String V_XZZXZ = "v_xzzxz";
	/**
	* V_XZZQHMC 现住址区划名称
	*/
	@Column(columnName="v_xzzqhmc",dataType="varchar",dataLength=100,nullAble="Y",comment="现住址区划名称")
	private String V_XZZQHMC = "v_xzzqhmc";
	/**
	* C_DJR 业务登记人id
	*/
	@Column(columnName="c_djr",dataType="varchar",dataLength=20,nullAble="Y",comment="业务登记人id")
	private String C_DJR = "c_djr";
	/**
	* T_DJSJ 业务登记时间
	*/
	@Column(columnName="t_djsj",dataType="char",dataLength=19,nullAble="Y",comment="业务登记时间")
	private String T_DJSJ = "t_djsj";
	/**
	* C_DJDW 业务登记单位id
	*/
	@Column(columnName="c_djdw",dataType="varchar",dataLength=20,nullAble="Y",comment="业务登记单位id")
	private String C_DJDW = "c_djdw";
	/**
	* V_DJDWMC 业务登记单位名称
	*/
	@Column(columnName="v_djdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="业务登记单位名称")
	private String V_DJDWMC = "v_djdwmc";
	/**
	* V_DJRXM 业务登记人姓名
	*/
	@Column(columnName="v_djrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="业务登记人姓名")
	private String V_DJRXM = "v_djrxm";
	/**
	* T_XGSJ 业务修改时间
	*/
	@Column(columnName="t_xgsj",dataType="char",dataLength=19,nullAble="Y",comment="业务修改时间")
	private String T_XGSJ = "t_xgsj";
	/**
	* C_XGR 业务修改人id
	*/
	@Column(columnName="c_xgr",dataType="varchar",dataLength=20,nullAble="Y",comment="业务修改人id")
	private String C_XGR = "c_xgr";
	/**
	* C_XGDW 业务修改单位id
	*/
	@Column(columnName="c_xgdw",dataType="varchar",dataLength=20,nullAble="Y",comment="业务修改单位id")
	private String C_XGDW = "c_xgdw";
	/**
	* V_XGRXM 业务修改人姓名
	*/
	@Column(columnName="v_xgrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="业务修改人姓名")
	private String V_XGRXM = "v_xgrxm";
	/**
	* V_XGDWMC 业务修改单位名称
	*/
	@Column(columnName="v_xgdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="业务修改单位名称")
	private String V_XGDWMC = "v_xgdwmc";
	/**
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
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
	* getPk_saryxx_h(void) 
	*/
	public String getPk_saryxx_h(){
		return this.PK_SARYXX_H;
	}
	/**
	*setPk_saryxx_h(java.lang.String)
	*/
	public void setPk_saryxx_h(String pk_saryxx_h){
		this.PK_SARYXX_H=pk_saryxx_h;
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
	* getV_gmsfhm(void) 
	*/
	public String getV_gmsfhm(){
		return this.V_GMSFHM;
	}
	/**
	*setV_gmsfhm(java.lang.String)
	*/
	public void setV_gmsfhm(String v_gmsfhm){
		this.V_GMSFHM=v_gmsfhm;
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
	* getV_xmpy(void) 
	*/
	public String getV_xmpy(){
		return this.V_XMPY;
	}
	/**
	*setV_xmpy(java.lang.String)
	*/
	public void setV_xmpy(String v_xmpy){
		this.V_XMPY=v_xmpy;
	}
	/**
	* getV_cym(void) 
	*/
	public String getV_cym(){
		return this.V_CYM;
	}
	/**
	*setV_cym(java.lang.String)
	*/
	public void setV_cym(String v_cym){
		this.V_CYM=v_cym;
	}
	/**
	* getV_cympy(void) 
	*/
	public String getV_cympy(){
		return this.V_CYMPY;
	}
	/**
	*setV_cympy(java.lang.String)
	*/
	public void setV_cympy(String v_cympy){
		this.V_CYMPY=v_cympy;
	}
	/**
	* getV_ywx(void) 
	*/
	public String getV_ywx(){
		return this.V_YWX;
	}
	/**
	*setV_ywx(java.lang.String)
	*/
	public void setV_ywx(String v_ywx){
		this.V_YWX=v_ywx;
	}
	/**
	* getV_ywm(void) 
	*/
	public String getV_ywm(){
		return this.V_YWM;
	}
	/**
	*setV_ywm(java.lang.String)
	*/
	public void setV_ywm(String v_ywm){
		this.V_YWM=v_ywm;
	}
	/**
	* getC_zjzl(void) 
	*/
	public String getC_zjzl(){
		return this.C_ZJZL;
	}
	/**
	*setC_zjzl(java.lang.String)
	*/
	public void setC_zjzl(String c_zjzl){
		this.C_ZJZL=c_zjzl;
	}
	/**
	* getV_zjhm(void) 
	*/
	public String getV_zjhm(){
		return this.V_ZJHM;
	}
	/**
	*setV_zjhm(java.lang.String)
	*/
	public void setV_zjhm(String v_zjhm){
		this.V_ZJHM=v_zjhm;
	}
	/**
	* getV_bmch(void) 
	*/
	public String getV_bmch(){
		return this.V_BMCH;
	}
	/**
	*setV_bmch(java.lang.String)
	*/
	public void setV_bmch(String v_bmch){
		this.V_BMCH=v_bmch;
	}
	/**
	* getV_bmchpy(void) 
	*/
	public String getV_bmchpy(){
		return this.V_BMCHPY;
	}
	/**
	*setV_bmchpy(java.lang.String)
	*/
	public void setV_bmchpy(String v_bmchpy){
		this.V_BMCHPY=v_bmchpy;
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
	* getT_cssj(void) 
	*/
	public String getT_cssj(){
		return this.T_CSSJ;
	}
	/**
	*setT_cssj(java.lang.String)
	*/
	public void setT_cssj(String t_cssj){
		this.T_CSSJ=t_cssj;
	}
	/**
	* getV_cszmbh(void) 
	*/
	public String getV_cszmbh(){
		return this.V_CSZMBH;
	}
	/**
	*setV_cszmbh(java.lang.String)
	*/
	public void setV_cszmbh(String v_cszmbh){
		this.V_CSZMBH=v_cszmbh;
	}
	/**
	* getC_csdq(void) 
	*/
	public String getC_csdq(){
		return this.C_CSDQ;
	}
	/**
	*setC_csdq(java.lang.String)
	*/
	public void setC_csdq(String c_csdq){
		this.C_CSDQ=c_csdq;
	}
	/**
	* getC_csqx(void) 
	*/
	public String getC_csqx(){
		return this.C_CSQX;
	}
	/**
	*setC_csqx(java.lang.String)
	*/
	public void setC_csqx(String c_csqx){
		this.C_CSQX=c_csqx;
	}
	/**
	* getV_csxz(void) 
	*/
	public String getV_csxz(){
		return this.V_CSXZ;
	}
	/**
	*setV_csxz(java.lang.String)
	*/
	public void setV_csxz(String v_csxz){
		this.V_CSXZ=v_csxz;
	}
	/**
	* getC_jgdq(void) 
	*/
	public String getC_jgdq(){
		return this.C_JGDQ;
	}
	/**
	*setC_jgdq(java.lang.String)
	*/
	public void setC_jgdq(String c_jgdq){
		this.C_JGDQ=c_jgdq;
	}
	/**
	* getC_jgqx(void) 
	*/
	public String getC_jgqx(){
		return this.C_JGQX;
	}
	/**
	*setC_jgqx(java.lang.String)
	*/
	public void setC_jgqx(String c_jgqx){
		this.C_JGQX=c_jgqx;
	}
	/**
	* getV_jgxz(void) 
	*/
	public String getV_jgxz(){
		return this.V_JGXZ;
	}
	/**
	*setV_jgxz(java.lang.String)
	*/
	public void setV_jgxz(String v_jgxz){
		this.V_JGXZ=v_jgxz;
	}
	/**
	* getC_zjxy(void) 
	*/
	public String getC_zjxy(){
		return this.C_ZJXY;
	}
	/**
	*setC_zjxy(java.lang.String)
	*/
	public void setC_zjxy(String c_zjxy){
		this.C_ZJXY=c_zjxy;
	}
	/**
	* getC_zzmm(void) 
	*/
	public String getC_zzmm(){
		return this.C_ZZMM;
	}
	/**
	*setC_zzmm(java.lang.String)
	*/
	public void setC_zzmm(String c_zzmm){
		this.C_ZZMM=c_zzmm;
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
	* getC_byzk(void) 
	*/
	public String getC_byzk(){
		return this.C_BYZK;
	}
	/**
	*setC_byzk(java.lang.String)
	*/
	public void setC_byzk(String c_byzk){
		this.C_BYZK=c_byzk;
	}
	/**
	* getN_sg(void) 
	*/
	public String getN_sg(){
		return this.N_SG;
	}
	/**
	*setN_sg(java.lang.String)
	*/
	public void setN_sg(String n_sg){
		this.N_SG=n_sg;
	}
	/**
	* getC_xx(void) 
	*/
	public String getC_xx(){
		return this.C_XX;
	}
	/**
	*setC_xx(java.lang.String)
	*/
	public void setC_xx(String c_xx){
		this.C_XX=c_xx;
	}
	/**
	* getC_sf(void) 
	*/
	public String getC_sf(){
		return this.C_SF;
	}
	/**
	*setC_sf(java.lang.String)
	*/
	public void setC_sf(String c_sf){
		this.C_SF=c_sf;
	}
	/**
	* getC_zc(void) 
	*/
	public String getC_zc(){
		return this.C_ZC;
	}
	/**
	*setC_zc(java.lang.String)
	*/
	public void setC_zc(String c_zc){
		this.C_ZC=c_zc;
	}
	/**
	* getV_zw(void) 
	*/
	public String getV_zw(){
		return this.V_ZW;
	}
	/**
	*setV_zw(java.lang.String)
	*/
	public void setV_zw(String v_zw){
		this.V_ZW=v_zw;
	}
	/**
	* getV_zy(void) 
	*/
	public String getV_zy(){
		return this.V_ZY;
	}
	/**
	*setV_zy(java.lang.String)
	*/
	public void setV_zy(String v_zy){
		this.V_ZY=v_zy;
	}
	/**
	* getC_zylb(void) 
	*/
	public String getC_zylb(){
		return this.C_ZYLB;
	}
	/**
	*setC_zylb(java.lang.String)
	*/
	public void setC_zylb(String c_zylb){
		this.C_ZYLB=c_zylb;
	}
	/**
	* getV_fwcs(void) 
	*/
	public String getV_fwcs(){
		return this.V_FWCS;
	}
	/**
	*setV_fwcs(java.lang.String)
	*/
	public void setV_fwcs(String v_fwcs){
		this.V_FWCS=v_fwcs;
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
	* getV_zwsp(void) 
	*/
	public String getV_zwsp(){
		return this.V_ZWSP;
	}
	/**
	*setV_zwsp(java.lang.String)
	*/
	public void setV_zwsp(String v_zwsp){
		this.V_ZWSP=v_zwsp;
	}
	/**
	* getD_swrq(void) 
	*/
	public String getD_swrq(){
		return this.D_SWRQ;
	}
	/**
	*setD_swrq(java.lang.String)
	*/
	public void setD_swrq(String d_swrq){
		this.D_SWRQ=d_swrq;
	}
	/**
	* getV_swzmbh(void) 
	*/
	public String getV_swzmbh(){
		return this.V_SWZMBH;
	}
	/**
	*setV_swzmbh(java.lang.String)
	*/
	public void setV_swzmbh(String v_swzmbh){
		this.V_SWZMBH=v_swzmbh;
	}
	/**
	* getC_gjdq(void) 
	*/
	public String getC_gjdq(){
		return this.C_GJDQ;
	}
	/**
	*setC_gjdq(java.lang.String)
	*/
	public void setC_gjdq(String c_gjdq){
		this.C_GJDQ=c_gjdq;
	}
	/**
	* getC_hjqh(void) 
	*/
	public String getC_hjqh(){
		return this.C_HJQH;
	}
	/**
	*setC_hjqh(java.lang.String)
	*/
	public void setC_hjqh(String c_hjqh){
		this.C_HJQH=c_hjqh;
	}
	/**
	* getV_hjqhmc(void) 
	*/
	public String getV_hjqhmc(){
		return this.V_HJQHMC;
	}
	/**
	*setV_hjqhmc(java.lang.String)
	*/
	public void setV_hjqhmc(String v_hjqhmc){
		this.V_HJQHMC=v_hjqhmc;
	}
	/**
	* getC_hjzrq(void) 
	*/
	public String getC_hjzrq(){
		return this.C_HJZRQ;
	}
	/**
	*setC_hjzrq(java.lang.String)
	*/
	public void setC_hjzrq(String c_hjzrq){
		this.C_HJZRQ=c_hjzrq;
	}
	/**
	* getV_hjxz(void) 
	*/
	public String getV_hjxz(){
		return this.V_HJXZ;
	}
	/**
	*setV_hjxz(java.lang.String)
	*/
	public void setV_hjxz(String v_hjxz){
		this.V_HJXZ=v_hjxz;
	}
	/**
	* getC_xxjb(void) 
	*/
	public String getC_xxjb(){
		return this.C_XXJB;
	}
	/**
	*setC_xxjb(java.lang.String)
	*/
	public void setC_xxjb(String c_xxjb){
		this.C_XXJB=c_xxjb;
	}
	/**
	* getC_rylb(void) 
	*/
	public String getC_rylb(){
		return this.C_RYLB;
	}
	/**
	*setC_rylb(java.lang.String)
	*/
	public void setC_rylb(String c_rylb){
		this.C_RYLB=c_rylb;
	}
	/**
	* getC_rysx(void) 
	*/
	public String getC_rysx(){
		return this.C_RYSX;
	}
	/**
	*setC_rysx(java.lang.String)
	*/
	public void setC_rysx(String c_rysx){
		this.C_RYSX=c_rysx;
	}
	/**
	* getV_ryzzbh(void) 
	*/
	public String getV_ryzzbh(){
		return this.V_RYZZBH;
	}
	/**
	*setV_ryzzbh(java.lang.String)
	*/
	public void setV_ryzzbh(String v_ryzzbh){
		this.V_RYZZBH=v_ryzzbh;
	}
	/**
	* getV_zwbh(void) 
	*/
	public String getV_zwbh(){
		return this.V_ZWBH;
	}
	/**
	*setV_zwbh(java.lang.String)
	*/
	public void setV_zwbh(String v_zwbh){
		this.V_ZWBH=v_zwbh;
	}
	/**
	* getV_dnabh(void) 
	*/
	public String getV_dnabh(){
		return this.V_DNABH;
	}
	/**
	*setV_dnabh(java.lang.String)
	*/
	public void setV_dnabh(String v_dnabh){
		this.V_DNABH=v_dnabh;
	}
	/**
	* getC_xzzzrq(void) 
	*/
	public String getC_xzzzrq(){
		return this.C_XZZZRQ;
	}
	/**
	*setC_xzzzrq(java.lang.String)
	*/
	public void setC_xzzzrq(String c_xzzzrq){
		this.C_XZZZRQ=c_xzzzrq;
	}
	/**
	* getC_xzzqh(void) 
	*/
	public String getC_xzzqh(){
		return this.C_XZZQH;
	}
	/**
	*setC_xzzqh(java.lang.String)
	*/
	public void setC_xzzqh(String c_xzzqh){
		this.C_XZZQH=c_xzzqh;
	}
	/**
	* getV_xzzxz(void) 
	*/
	public String getV_xzzxz(){
		return this.V_XZZXZ;
	}
	/**
	*setV_xzzxz(java.lang.String)
	*/
	public void setV_xzzxz(String v_xzzxz){
		this.V_XZZXZ=v_xzzxz;
	}
	/**
	* getV_xzzqhmc(void) 
	*/
	public String getV_xzzqhmc(){
		return this.V_XZZQHMC;
	}
	/**
	*setV_xzzqhmc(java.lang.String)
	*/
	public void setV_xzzqhmc(String v_xzzqhmc){
		this.V_XZZQHMC=v_xzzqhmc;
	}
	/**
	* getC_djr(void) 
	*/
	public String getC_djr(){
		return this.C_DJR;
	}
	/**
	*setC_djr(java.lang.String)
	*/
	public void setC_djr(String c_djr){
		this.C_DJR=c_djr;
	}
	/**
	* getT_djsj(void) 
	*/
	public String getT_djsj(){
		return this.T_DJSJ;
	}
	/**
	*setT_djsj(java.lang.String)
	*/
	public void setT_djsj(String t_djsj){
		this.T_DJSJ=t_djsj;
	}
	/**
	* getC_djdw(void) 
	*/
	public String getC_djdw(){
		return this.C_DJDW;
	}
	/**
	*setC_djdw(java.lang.String)
	*/
	public void setC_djdw(String c_djdw){
		this.C_DJDW=c_djdw;
	}
	/**
	* getV_djdwmc(void) 
	*/
	public String getV_djdwmc(){
		return this.V_DJDWMC;
	}
	/**
	*setV_djdwmc(java.lang.String)
	*/
	public void setV_djdwmc(String v_djdwmc){
		this.V_DJDWMC=v_djdwmc;
	}
	/**
	* getV_djrxm(void) 
	*/
	public String getV_djrxm(){
		return this.V_DJRXM;
	}
	/**
	*setV_djrxm(java.lang.String)
	*/
	public void setV_djrxm(String v_djrxm){
		this.V_DJRXM=v_djrxm;
	}
	/**
	* getT_xgsj(void) 
	*/
	public String getT_xgsj(){
		return this.T_XGSJ;
	}
	/**
	*setT_xgsj(java.lang.String)
	*/
	public void setT_xgsj(String t_xgsj){
		this.T_XGSJ=t_xgsj;
	}
	/**
	* getC_xgr(void) 
	*/
	public String getC_xgr(){
		return this.C_XGR;
	}
	/**
	*setC_xgr(java.lang.String)
	*/
	public void setC_xgr(String c_xgr){
		this.C_XGR=c_xgr;
	}
	/**
	* getC_xgdw(void) 
	*/
	public String getC_xgdw(){
		return this.C_XGDW;
	}
	/**
	*setC_xgdw(java.lang.String)
	*/
	public void setC_xgdw(String c_xgdw){
		this.C_XGDW=c_xgdw;
	}
	/**
	* getV_xgrxm(void) 
	*/
	public String getV_xgrxm(){
		return this.V_XGRXM;
	}
	/**
	*setV_xgrxm(java.lang.String)
	*/
	public void setV_xgrxm(String v_xgrxm){
		this.V_XGRXM=v_xgrxm;
	}
	/**
	* getV_xgdwmc(void) 
	*/
	public String getV_xgdwmc(){
		return this.V_XGDWMC;
	}
	/**
	*setV_xgdwmc(java.lang.String)
	*/
	public void setV_xgdwmc(String v_xgdwmc){
		this.V_XGDWMC=v_xgdwmc;
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