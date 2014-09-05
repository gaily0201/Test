package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasKsHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ks_h")
public class CrpasKsHVO {
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
	* TRANSTYPE 交易类型
	*/
	@Column(columnName="transtype",dataType="varchar",dataLength=50,nullAble="Y",comment="交易类型")
	private String TRANSTYPE = "transtype";
	/**
	* PK_KS_H 主键
	*/
	@Column(columnName="pk_ks_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_KS_H = "pk_ks_h";
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
	* V_PTAJZJ 平台单间主键
	*/
	@Column(columnName="v_ptajzj",dataType="char",dataLength=20,nullAble="Y",comment="平台单间主键")
	private String V_PTAJZJ = "v_ptajzj";
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
	* V_JCY_QSSH 检察院的文书文号
	*/
	@Column(columnName="v_jcy_qssh",dataType="varchar",dataLength=100,nullAble="Y",comment="检察院的文书文号")
	private String V_JCY_QSSH = "v_jcy_qssh";
	/**
	* V_JCY_AJBS 检察院的案件的唯一标识
	*/
	@Column(columnName="v_jcy_ajbs",dataType="varchar",dataLength=200,nullAble="Y",comment="检察院的案件的唯一标识")
	private String V_JCY_AJBS = "v_jcy_ajbs";
	/**
	* C_JCY_YSDW 移送单位
	*/
	@Column(columnName="c_jcy_ysdw",dataType="varchar",dataLength=20,nullAble="Y",comment="移送单位")
	private String C_JCY_YSDW = "c_jcy_ysdw";
	/**
	* C_JCY_YSDWMC 移送单位名称
	*/
	@Column(columnName="c_jcy_ysdwmc",dataType="varchar",dataLength=50,nullAble="Y",comment="移送单位名称")
	private String C_JCY_YSDWMC = "c_jcy_ysdwmc";
	/**
	* T_JCY_YSSJ 移送时间
	*/
	@Column(columnName="t_jcy_yssj",dataType="char",dataLength=19,nullAble="Y",comment="移送时间")
	private String T_JCY_YSSJ = "t_jcy_yssj";
	/**
	* V_JCY_ZAY 主案由
	*/
	@Column(columnName="v_jcy_zay",dataType="varchar",dataLength=200,nullAble="Y",comment="主案由")
	private String V_JCY_ZAY = "v_jcy_zay";
	/**
	* V_JCY_AJMC 案件名称
	*/
	@Column(columnName="v_jcy_ajmc",dataType="varchar",dataLength=200,nullAble="Y",comment="案件名称")
	private String V_JCY_AJMC = "v_jcy_ajmc";
	/**
	* V_JCY_CBR 检察院承办人
	*/
	@Column(columnName="v_jcy_cbr",dataType="varchar",dataLength=50,nullAble="Y",comment="检察院承办人")
	private String V_JCY_CBR = "v_jcy_cbr";
	/**
	* V_GAJ_ZHJG 抓获经过
	*/
	@Column(columnName="v_gaj_zhjg",dataType="varchar",dataLength=2000,nullAble="Y",comment="抓获经过")
	private String V_GAJ_ZHJG = "v_gaj_zhjg";
	/**
	* V_GAJ_ZJBF 证据部分
	*/
	@Column(columnName="v_gaj_zjbf",dataType="varchar",dataLength=2000,nullAble="Y",comment="证据部分")
	private String V_GAJ_ZJBF = "v_gaj_zjbf";
	/**
	* V_GAJ_GLBH 关联编号
	*/
	@Column(columnName="v_gaj_glbh",dataType="varchar",dataLength=50,nullAble="Y",comment="关联编号")
	private String V_GAJ_GLBH = "v_gaj_glbh";
	/**
	* V_GAJ_AJBH 公安案件编号
	*/
	@Column(columnName="v_gaj_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="公安案件编号")
	private String V_GAJ_AJBH = "v_gaj_ajbh";
	/**
	* T_FY_SLSJ 法院的受理时间
	*/
	@Column(columnName="t_fy_slsj",dataType="varchar",dataLength=50,nullAble="Y",comment="法院的受理时间")
	private String T_FY_SLSJ = "t_fy_slsj";
	/**
	* B_FY_SFSL 是否受理
	*/
	@Column(columnName="b_fy_sfsl",dataType="char",dataLength=1,nullAble="Y",comment="是否受理")
	private String B_FY_SFSL = "b_fy_sfsl";
	/**
	* V_FY_AJBS 法院案件标识
	*/
	@Column(columnName="v_fy_ajbs",dataType="varchar",dataLength=50,nullAble="Y",comment="法院案件标识")
	private String V_FY_AJBS = "v_fy_ajbs";
	/**
	* V_FY_AH 法院案号
	*/
	@Column(columnName="v_fy_ah",dataType="varchar",dataLength=50,nullAble="Y",comment="法院案号")
	private String V_FY_AH = "v_fy_ah";
	/**
	* C_FY_AJLB 案件类别
	*/
	@Column(columnName="c_fy_ajlb",dataType="varchar",dataLength=20,nullAble="Y",comment="案件类别")
	private String C_FY_AJLB = "c_fy_ajlb";
	/**
	* C_FY_SATJ 收案途径
	*/
	@Column(columnName="c_fy_satj",dataType="varchar",dataLength=20,nullAble="Y",comment="收案途径")
	private String C_FY_SATJ = "c_fy_satj";
	/**
	* C_FY_SSXZ 诉讼性质
	*/
	@Column(columnName="c_fy_ssxz",dataType="varchar",dataLength=20,nullAble="Y",comment="诉讼性质")
	private String C_FY_SSXZ = "c_fy_ssxz";
	/**
	* C_FY_AJLY 案件来源
	*/
	@Column(columnName="c_fy_ajly",dataType="varchar",dataLength=20,nullAble="Y",comment="案件来源")
	private String C_FY_AJLY = "c_fy_ajly";
	/**
	* D_FY_SDSZRQ 收到诉状日期
	*/
	@Column(columnName="d_fy_sdszrq",dataType="char",dataLength=19,nullAble="Y",comment="收到诉状日期")
	private String D_FY_SDSZRQ = "d_fy_sdszrq";
	/**
	* C_FY_QSZZM 起诉主罪名
	*/
	@Column(columnName="c_fy_qszzm",dataType="varchar",dataLength=20,nullAble="Y",comment="起诉主罪名")
	private String C_FY_QSZZM = "c_fy_qszzm";
	/**
	* V_FY_SAJZCL 随案卷宗材料
	*/
	@Column(columnName="v_fy_sajzcl",dataType="varchar",dataLength=2000,nullAble="Y",comment="随案卷宗材料")
	private String V_FY_SAJZCL = "v_fy_sajzcl";
	/**
	* V_FY_DJRXM 登记人姓名
	*/
	@Column(columnName="v_fy_djrxm",dataType="varchar",dataLength=20,nullAble="Y",comment="登记人姓名")
	private String V_FY_DJRXM = "v_fy_djrxm";
	/**
	* V_FY_SCRXM 审查人姓名
	*/
	@Column(columnName="v_fy_scrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="审查人姓名")
	private String V_FY_SCRXM = "v_fy_scrxm";
	/**
	* D_FY_SCRQ 审查日期
	*/
	@Column(columnName="d_fy_scrq",dataType="char",dataLength=19,nullAble="Y",comment="审查日期")
	private String D_FY_SCRQ = "d_fy_scrq";
	/**
	* C_FY_SCYJ 审查意见
	*/
	@Column(columnName="c_fy_scyj",dataType="varchar",dataLength=2000,nullAble="Y",comment="审查意见")
	private String C_FY_SCYJ = "c_fy_scyj";
	/**
	* V_FY_SPRXM 审批人姓名
	*/
	@Column(columnName="v_fy_sprxm",dataType="varchar",dataLength=50,nullAble="Y",comment="审批人姓名")
	private String V_FY_SPRXM = "v_fy_sprxm";
	/**
	* D_FY_LASPRQ 立案审批日期
	*/
	@Column(columnName="d_fy_lasprq",dataType="char",dataLength=19,nullAble="Y",comment="立案审批日期")
	private String D_FY_LASPRQ = "d_fy_lasprq";
	/**
	* C_FY_SPYJ 审批意见
	*/
	@Column(columnName="c_fy_spyj",dataType="varchar",dataLength=2000,nullAble="Y",comment="审批意见")
	private String C_FY_SPYJ = "c_fy_spyj";
	/**
	* D_FY_LARQ 立案日期
	*/
	@Column(columnName="d_fy_larq",dataType="char",dataLength=19,nullAble="Y",comment="立案日期")
	private String D_FY_LARQ = "d_fy_larq";
	/**
	* V_FY_LABMMC 立案部门名称
	*/
	@Column(columnName="v_fy_labmmc",dataType="varchar",dataLength=50,nullAble="Y",comment="立案部门名称")
	private String V_FY_LABMMC = "v_fy_labmmc";
	/**
	* V_FY_CBBMMC 承办审批庭名称
	*/
	@Column(columnName="v_fy_cbbmmc",dataType="varchar",dataLength=50,nullAble="Y",comment="承办审批庭名称")
	private String V_FY_CBBMMC = "v_fy_cbbmmc";
	/**
	* V_FY_CBRXM 承办人姓名
	*/
	@Column(columnName="v_fy_cbrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="承办人姓名")
	private String V_FY_CBRXM = "v_fy_cbrxm";
	/**
	* C_FY_SYCX 适用程序
	*/
	@Column(columnName="c_fy_sycx",dataType="varchar",dataLength=20,nullAble="Y",comment="适用程序")
	private String C_FY_SYCX = "c_fy_sycx";
	/**
	* B_BGRSFTYRZCX 被告人是否同意认罪程序
	*/
	@Column(columnName="b_bgrsftyrzcx",dataType="char",dataLength=1,nullAble="Y",comment="被告人是否同意认罪程序")
	private String B_BGRSFTYRZCX = "b_bgrsftyrzcx";
	/**
	* C_FY_GXYJ 管辖依据
	*/
	@Column(columnName="c_fy_gxyj",dataType="varchar",dataLength=2000,nullAble="Y",comment="管辖依据")
	private String C_FY_GXYJ = "c_fy_gxyj";
	/**
	* V_TQZJJH 庭前证据交换
	*/
	@Column(columnName="v_tqzjjh",dataType="varchar",dataLength=2000,nullAble="Y",comment="庭前证据交换")
	private String V_TQZJJH = "v_tqzjjh";
	/**
	* V_FYSJDQZJ 法院收集调取证据
	*/
	@Column(columnName="v_fysjdqzj",dataType="varchar",dataLength=2000,nullAble="Y",comment="法院收集调取证据")
	private String V_FYSJDQZJ = "v_fysjdqzj";
	/**
	* C_FY_DYSJ 地域涉及
	*/
	@Column(columnName="c_fy_dysj",dataType="varchar",dataLength=20,nullAble="Y",comment="地域涉及")
	private String C_FY_DYSJ = "c_fy_dysj";
	/**
	* C_FY_AJSJ 案件涉及
	*/
	@Column(columnName="c_fy_ajsj",dataType="varchar",dataLength=20,nullAble="Y",comment="案件涉及")
	private String C_FY_AJSJ = "c_fy_ajsj";
	/**
	* V_AJDXYY 案件大小影响
	*/
	@Column(columnName="v_ajdxyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="案件大小影响")
	private String V_AJDXYY = "v_ajdxyy";
	/**
	* B_FY_SFGTFZ 是否共同犯罪
	*/
	@Column(columnName="b_fy_sfgtfz",dataType="char",dataLength=1,nullAble="Y",comment="是否共同犯罪")
	private String B_FY_SFGTFZ = "b_fy_sfgtfz";
	/**
	* C_FY_TABGRBZAYY 同案被告人不在案原因
	*/
	@Column(columnName="c_fy_tabgrbzayy",dataType="varchar",dataLength=2000,nullAble="Y",comment="同案被告人不在案原因")
	private String C_FY_TABGRBZAYY = "c_fy_tabgrbzayy";
	/**
	* V_AJJZ 案件价值
	*/
	@Column(columnName="v_ajjz",dataType="varchar",dataLength=2000,nullAble="Y",comment="案件价值")
	private String V_AJJZ = "v_ajjz";
	/**
	* D_FY_SXQSRQ 审限起始日期
	*/
	@Column(columnName="d_fy_sxqsrq",dataType="char",dataLength=19,nullAble="Y",comment="审限起始日期")
	private String D_FY_SXQSRQ = "d_fy_sxqsrq";
	/**
	* D_FY_SXJMRQ 审限届满日期
	*/
	@Column(columnName="d_fy_sxjmrq",dataType="char",dataLength=19,nullAble="Y",comment="审限届满日期")
	private String D_FY_SXJMRQ = "d_fy_sxjmrq";
	/**
	* D_FY_LAQXJMRQ 立案期限届满日期
	*/
	@Column(columnName="d_fy_laqxjmrq",dataType="char",dataLength=19,nullAble="Y",comment="立案期限届满日期")
	private String D_FY_LAQXJMRQ = "d_fy_laqxjmrq";
	/**
	* D_FY_SLJSRQ 审理结束日期
	*/
	@Column(columnName="d_fy_sljsrq",dataType="char",dataLength=19,nullAble="Y",comment="审理结束日期")
	private String D_FY_SLJSRQ = "d_fy_sljsrq";
	/**
	* N_FY_FDLASX 法定立案期限
	*/
	@Column(columnName="n_fy_fdlasx",dataType="int",dataLength=0,nullAble="Y",comment="法定立案期限")
	private String N_FY_FDLASX = "n_fy_fdlasx";
	/**
	* N_FY_SJLATS 实际立案天数
	*/
	@Column(columnName="n_fy_sjlats",dataType="int",dataLength=0,nullAble="Y",comment="实际立案天数")
	private String N_FY_SJLATS = "n_fy_sjlats";
	/**
	* N_FY_LACQTS 立案超期天数
	*/
	@Column(columnName="n_fy_lacqts",dataType="int",dataLength=0,nullAble="Y",comment="立案超期天数")
	private String N_FY_LACQTS = "n_fy_lacqts";
	/**
	* N_FY_FDSXTS 法定审限天数
	*/
	@Column(columnName="n_fy_fdsxts",dataType="int",dataLength=0,nullAble="Y",comment="法定审限天数")
	private String N_FY_FDSXTS = "n_fy_fdsxts";
	/**
	* N_FY_SJSLTS 实际审理天数
	*/
	@Column(columnName="n_fy_sjslts",dataType="int",dataLength=0,nullAble="Y",comment="实际审理天数")
	private String N_FY_SJSLTS = "n_fy_sjslts";
	/**
	* N_FY_CSXTS 超审限天数
	*/
	@Column(columnName="n_fy_csxts",dataType="int",dataLength=0,nullAble="Y",comment="超审限天数")
	private String N_FY_CSXTS = "n_fy_csxts";
	/**
	* N_FY_CSXBS 超审限倍数
	*/
	@Column(columnName="n_fy_csxbs",dataType="int",dataLength=0,nullAble="Y",comment="超审限倍数")
	private String N_FY_CSXBS = "n_fy_csxbs";
	/**
	* V_FY_CXXYY 超审限原因
	*/
	@Column(columnName="v_fy_cxxyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="超审限原因")
	private String V_FY_CXXYY = "v_fy_cxxyy";
	/**
	* C_JAAY 结案案由
	*/
	@Column(columnName="c_jaay",dataType="varchar",dataLength=20,nullAble="Y",comment="结案案由")
	private String C_JAAY = "c_jaay";
	/**
	* C_FY_JAFS 结案方式
	*/
	@Column(columnName="c_fy_jafs",dataType="varchar",dataLength=20,nullAble="Y",comment="结案方式")
	private String C_FY_JAFS = "c_fy_jafs";
	/**
	* C_BYSLYY 不予受理原因
	*/
	@Column(columnName="c_byslyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="不予受理原因")
	private String C_BYSLYY = "c_byslyy";
	/**
	* C_BHZSYY 驳回自诉原因
	*/
	@Column(columnName="c_bhzsyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="驳回自诉原因")
	private String C_BHZSYY = "c_bhzsyy";
	/**
	* C_CSLX 撤诉类型
	*/
	@Column(columnName="c_cslx",dataType="varchar",dataLength=20,nullAble="Y",comment="撤诉类型")
	private String C_CSLX = "c_cslx";
	/**
	* V_CSCLSY 撤诉处理事由
	*/
	@Column(columnName="v_csclsy",dataType="varchar",dataLength=2000,nullAble="Y",comment="撤诉处理事由")
	private String V_CSCLSY = "v_csclsy";
	/**
	* V_JASY 结案事由
	*/
	@Column(columnName="v_jasy",dataType="varchar",dataLength=2000,nullAble="Y",comment="结案事由")
	private String V_JASY = "v_jasy";
	/**
	* D_SXRQ 生效日期
	*/
	@Column(columnName="d_sxrq",dataType="char",dataLength=19,nullAble="Y",comment="生效日期")
	private String D_SXRQ = "d_sxrq";
	/**
	* N_PJWHSYJE 判决挽回损失金额
	*/
	@Column(columnName="n_pjwhsyje",dataType="decimal",dataLength=20,nullAble="Y",comment="判决挽回损失金额")
	private String N_PJWHSYJE = "n_pjwhsyje";
	/**
	* D_JARQ 结案日期
	*/
	@Column(columnName="d_jarq",dataType="char",dataLength=19,nullAble="Y",comment="结案日期")
	private String D_JARQ = "d_jarq";
	/**
	* V_SXCPSWH 生效裁判书文号
	*/
	@Column(columnName="v_sxcpswh",dataType="varchar",dataLength=50,nullAble="Y",comment="生效裁判书文号")
	private String V_SXCPSWH = "v_sxcpswh";
	/**
	* C_ZCSXCPFY 作出生效裁判法院
	*/
	@Column(columnName="c_zcsxcpfy",dataType="varchar",dataLength=20,nullAble="Y",comment="作出生效裁判法院")
	private String C_ZCSXCPFY = "c_zcsxcpfy";
	/**
	* C_KSJG 抗诉机关
	*/
	@Column(columnName="c_ksjg",dataType="varchar",dataLength=20,nullAble="Y",comment="抗诉机关")
	private String C_KSJG = "c_ksjg";
	/**
	* C_TQKSLY 提请抗诉理由
	*/
	@Column(columnName="c_tqksly",dataType="varchar",dataLength=2000,nullAble="Y",comment="提请抗诉理由")
	private String C_TQKSLY = "c_tqksly";
	/**
	* D_TQKSRQ 提请抗诉日期
	*/
	@Column(columnName="d_tqksrq",dataType="char",dataLength=19,nullAble="Y",comment="提请抗诉日期")
	private String D_TQKSRQ = "d_tqksrq";
	/**
	* C_KSLX 抗诉类型
	*/
	@Column(columnName="c_kslx",dataType="varchar",dataLength=20,nullAble="Y",comment="抗诉类型")
	private String C_KSLX = "c_kslx";
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
	* getPk_ks_h(void) 
	*/
	public String getPk_ks_h(){
		return this.PK_KS_H;
	}
	/**
	*setPk_ks_h(java.lang.String)
	*/
	public void setPk_ks_h(String pk_ks_h){
		this.PK_KS_H=pk_ks_h;
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
	* getV_jcy_qssh(void) 
	*/
	public String getV_jcy_qssh(){
		return this.V_JCY_QSSH;
	}
	/**
	*setV_jcy_qssh(java.lang.String)
	*/
	public void setV_jcy_qssh(String v_jcy_qssh){
		this.V_JCY_QSSH=v_jcy_qssh;
	}
	/**
	* getV_jcy_ajbs(void) 
	*/
	public String getV_jcy_ajbs(){
		return this.V_JCY_AJBS;
	}
	/**
	*setV_jcy_ajbs(java.lang.String)
	*/
	public void setV_jcy_ajbs(String v_jcy_ajbs){
		this.V_JCY_AJBS=v_jcy_ajbs;
	}
	/**
	* getC_jcy_ysdw(void) 
	*/
	public String getC_jcy_ysdw(){
		return this.C_JCY_YSDW;
	}
	/**
	*setC_jcy_ysdw(java.lang.String)
	*/
	public void setC_jcy_ysdw(String c_jcy_ysdw){
		this.C_JCY_YSDW=c_jcy_ysdw;
	}
	/**
	* getC_jcy_ysdwmc(void) 
	*/
	public String getC_jcy_ysdwmc(){
		return this.C_JCY_YSDWMC;
	}
	/**
	*setC_jcy_ysdwmc(java.lang.String)
	*/
	public void setC_jcy_ysdwmc(String c_jcy_ysdwmc){
		this.C_JCY_YSDWMC=c_jcy_ysdwmc;
	}
	/**
	* getT_jcy_yssj(void) 
	*/
	public String getT_jcy_yssj(){
		return this.T_JCY_YSSJ;
	}
	/**
	*setT_jcy_yssj(java.lang.String)
	*/
	public void setT_jcy_yssj(String t_jcy_yssj){
		this.T_JCY_YSSJ=t_jcy_yssj;
	}
	/**
	* getV_jcy_zay(void) 
	*/
	public String getV_jcy_zay(){
		return this.V_JCY_ZAY;
	}
	/**
	*setV_jcy_zay(java.lang.String)
	*/
	public void setV_jcy_zay(String v_jcy_zay){
		this.V_JCY_ZAY=v_jcy_zay;
	}
	/**
	* getV_jcy_ajmc(void) 
	*/
	public String getV_jcy_ajmc(){
		return this.V_JCY_AJMC;
	}
	/**
	*setV_jcy_ajmc(java.lang.String)
	*/
	public void setV_jcy_ajmc(String v_jcy_ajmc){
		this.V_JCY_AJMC=v_jcy_ajmc;
	}
	/**
	* getV_jcy_cbr(void) 
	*/
	public String getV_jcy_cbr(){
		return this.V_JCY_CBR;
	}
	/**
	*setV_jcy_cbr(java.lang.String)
	*/
	public void setV_jcy_cbr(String v_jcy_cbr){
		this.V_JCY_CBR=v_jcy_cbr;
	}
	/**
	* getV_gaj_zhjg(void) 
	*/
	public String getV_gaj_zhjg(){
		return this.V_GAJ_ZHJG;
	}
	/**
	*setV_gaj_zhjg(java.lang.String)
	*/
	public void setV_gaj_zhjg(String v_gaj_zhjg){
		this.V_GAJ_ZHJG=v_gaj_zhjg;
	}
	/**
	* getV_gaj_zjbf(void) 
	*/
	public String getV_gaj_zjbf(){
		return this.V_GAJ_ZJBF;
	}
	/**
	*setV_gaj_zjbf(java.lang.String)
	*/
	public void setV_gaj_zjbf(String v_gaj_zjbf){
		this.V_GAJ_ZJBF=v_gaj_zjbf;
	}
	/**
	* getV_gaj_glbh(void) 
	*/
	public String getV_gaj_glbh(){
		return this.V_GAJ_GLBH;
	}
	/**
	*setV_gaj_glbh(java.lang.String)
	*/
	public void setV_gaj_glbh(String v_gaj_glbh){
		this.V_GAJ_GLBH=v_gaj_glbh;
	}
	/**
	* getV_gaj_ajbh(void) 
	*/
	public String getV_gaj_ajbh(){
		return this.V_GAJ_AJBH;
	}
	/**
	*setV_gaj_ajbh(java.lang.String)
	*/
	public void setV_gaj_ajbh(String v_gaj_ajbh){
		this.V_GAJ_AJBH=v_gaj_ajbh;
	}
	/**
	* getT_fy_slsj(void) 
	*/
	public String getT_fy_slsj(){
		return this.T_FY_SLSJ;
	}
	/**
	*setT_fy_slsj(java.lang.String)
	*/
	public void setT_fy_slsj(String t_fy_slsj){
		this.T_FY_SLSJ=t_fy_slsj;
	}
	/**
	* getB_fy_sfsl(void) 
	*/
	public String getB_fy_sfsl(){
		return this.B_FY_SFSL;
	}
	/**
	*setB_fy_sfsl(java.lang.String)
	*/
	public void setB_fy_sfsl(String b_fy_sfsl){
		this.B_FY_SFSL=b_fy_sfsl;
	}
	/**
	* getV_fy_ajbs(void) 
	*/
	public String getV_fy_ajbs(){
		return this.V_FY_AJBS;
	}
	/**
	*setV_fy_ajbs(java.lang.String)
	*/
	public void setV_fy_ajbs(String v_fy_ajbs){
		this.V_FY_AJBS=v_fy_ajbs;
	}
	/**
	* getV_fy_ah(void) 
	*/
	public String getV_fy_ah(){
		return this.V_FY_AH;
	}
	/**
	*setV_fy_ah(java.lang.String)
	*/
	public void setV_fy_ah(String v_fy_ah){
		this.V_FY_AH=v_fy_ah;
	}
	/**
	* getC_fy_ajlb(void) 
	*/
	public String getC_fy_ajlb(){
		return this.C_FY_AJLB;
	}
	/**
	*setC_fy_ajlb(java.lang.String)
	*/
	public void setC_fy_ajlb(String c_fy_ajlb){
		this.C_FY_AJLB=c_fy_ajlb;
	}
	/**
	* getC_fy_satj(void) 
	*/
	public String getC_fy_satj(){
		return this.C_FY_SATJ;
	}
	/**
	*setC_fy_satj(java.lang.String)
	*/
	public void setC_fy_satj(String c_fy_satj){
		this.C_FY_SATJ=c_fy_satj;
	}
	/**
	* getC_fy_ssxz(void) 
	*/
	public String getC_fy_ssxz(){
		return this.C_FY_SSXZ;
	}
	/**
	*setC_fy_ssxz(java.lang.String)
	*/
	public void setC_fy_ssxz(String c_fy_ssxz){
		this.C_FY_SSXZ=c_fy_ssxz;
	}
	/**
	* getC_fy_ajly(void) 
	*/
	public String getC_fy_ajly(){
		return this.C_FY_AJLY;
	}
	/**
	*setC_fy_ajly(java.lang.String)
	*/
	public void setC_fy_ajly(String c_fy_ajly){
		this.C_FY_AJLY=c_fy_ajly;
	}
	/**
	* getD_fy_sdszrq(void) 
	*/
	public String getD_fy_sdszrq(){
		return this.D_FY_SDSZRQ;
	}
	/**
	*setD_fy_sdszrq(java.lang.String)
	*/
	public void setD_fy_sdszrq(String d_fy_sdszrq){
		this.D_FY_SDSZRQ=d_fy_sdszrq;
	}
	/**
	* getC_fy_qszzm(void) 
	*/
	public String getC_fy_qszzm(){
		return this.C_FY_QSZZM;
	}
	/**
	*setC_fy_qszzm(java.lang.String)
	*/
	public void setC_fy_qszzm(String c_fy_qszzm){
		this.C_FY_QSZZM=c_fy_qszzm;
	}
	/**
	* getV_fy_sajzcl(void) 
	*/
	public String getV_fy_sajzcl(){
		return this.V_FY_SAJZCL;
	}
	/**
	*setV_fy_sajzcl(java.lang.String)
	*/
	public void setV_fy_sajzcl(String v_fy_sajzcl){
		this.V_FY_SAJZCL=v_fy_sajzcl;
	}
	/**
	* getV_fy_djrxm(void) 
	*/
	public String getV_fy_djrxm(){
		return this.V_FY_DJRXM;
	}
	/**
	*setV_fy_djrxm(java.lang.String)
	*/
	public void setV_fy_djrxm(String v_fy_djrxm){
		this.V_FY_DJRXM=v_fy_djrxm;
	}
	/**
	* getV_fy_scrxm(void) 
	*/
	public String getV_fy_scrxm(){
		return this.V_FY_SCRXM;
	}
	/**
	*setV_fy_scrxm(java.lang.String)
	*/
	public void setV_fy_scrxm(String v_fy_scrxm){
		this.V_FY_SCRXM=v_fy_scrxm;
	}
	/**
	* getD_fy_scrq(void) 
	*/
	public String getD_fy_scrq(){
		return this.D_FY_SCRQ;
	}
	/**
	*setD_fy_scrq(java.lang.String)
	*/
	public void setD_fy_scrq(String d_fy_scrq){
		this.D_FY_SCRQ=d_fy_scrq;
	}
	/**
	* getC_fy_scyj(void) 
	*/
	public String getC_fy_scyj(){
		return this.C_FY_SCYJ;
	}
	/**
	*setC_fy_scyj(java.lang.String)
	*/
	public void setC_fy_scyj(String c_fy_scyj){
		this.C_FY_SCYJ=c_fy_scyj;
	}
	/**
	* getV_fy_sprxm(void) 
	*/
	public String getV_fy_sprxm(){
		return this.V_FY_SPRXM;
	}
	/**
	*setV_fy_sprxm(java.lang.String)
	*/
	public void setV_fy_sprxm(String v_fy_sprxm){
		this.V_FY_SPRXM=v_fy_sprxm;
	}
	/**
	* getD_fy_lasprq(void) 
	*/
	public String getD_fy_lasprq(){
		return this.D_FY_LASPRQ;
	}
	/**
	*setD_fy_lasprq(java.lang.String)
	*/
	public void setD_fy_lasprq(String d_fy_lasprq){
		this.D_FY_LASPRQ=d_fy_lasprq;
	}
	/**
	* getC_fy_spyj(void) 
	*/
	public String getC_fy_spyj(){
		return this.C_FY_SPYJ;
	}
	/**
	*setC_fy_spyj(java.lang.String)
	*/
	public void setC_fy_spyj(String c_fy_spyj){
		this.C_FY_SPYJ=c_fy_spyj;
	}
	/**
	* getD_fy_larq(void) 
	*/
	public String getD_fy_larq(){
		return this.D_FY_LARQ;
	}
	/**
	*setD_fy_larq(java.lang.String)
	*/
	public void setD_fy_larq(String d_fy_larq){
		this.D_FY_LARQ=d_fy_larq;
	}
	/**
	* getV_fy_labmmc(void) 
	*/
	public String getV_fy_labmmc(){
		return this.V_FY_LABMMC;
	}
	/**
	*setV_fy_labmmc(java.lang.String)
	*/
	public void setV_fy_labmmc(String v_fy_labmmc){
		this.V_FY_LABMMC=v_fy_labmmc;
	}
	/**
	* getV_fy_cbbmmc(void) 
	*/
	public String getV_fy_cbbmmc(){
		return this.V_FY_CBBMMC;
	}
	/**
	*setV_fy_cbbmmc(java.lang.String)
	*/
	public void setV_fy_cbbmmc(String v_fy_cbbmmc){
		this.V_FY_CBBMMC=v_fy_cbbmmc;
	}
	/**
	* getV_fy_cbrxm(void) 
	*/
	public String getV_fy_cbrxm(){
		return this.V_FY_CBRXM;
	}
	/**
	*setV_fy_cbrxm(java.lang.String)
	*/
	public void setV_fy_cbrxm(String v_fy_cbrxm){
		this.V_FY_CBRXM=v_fy_cbrxm;
	}
	/**
	* getC_fy_sycx(void) 
	*/
	public String getC_fy_sycx(){
		return this.C_FY_SYCX;
	}
	/**
	*setC_fy_sycx(java.lang.String)
	*/
	public void setC_fy_sycx(String c_fy_sycx){
		this.C_FY_SYCX=c_fy_sycx;
	}
	/**
	* getB_bgrsftyrzcx(void) 
	*/
	public String getB_bgrsftyrzcx(){
		return this.B_BGRSFTYRZCX;
	}
	/**
	*setB_bgrsftyrzcx(java.lang.String)
	*/
	public void setB_bgrsftyrzcx(String b_bgrsftyrzcx){
		this.B_BGRSFTYRZCX=b_bgrsftyrzcx;
	}
	/**
	* getC_fy_gxyj(void) 
	*/
	public String getC_fy_gxyj(){
		return this.C_FY_GXYJ;
	}
	/**
	*setC_fy_gxyj(java.lang.String)
	*/
	public void setC_fy_gxyj(String c_fy_gxyj){
		this.C_FY_GXYJ=c_fy_gxyj;
	}
	/**
	* getV_tqzjjh(void) 
	*/
	public String getV_tqzjjh(){
		return this.V_TQZJJH;
	}
	/**
	*setV_tqzjjh(java.lang.String)
	*/
	public void setV_tqzjjh(String v_tqzjjh){
		this.V_TQZJJH=v_tqzjjh;
	}
	/**
	* getV_fysjdqzj(void) 
	*/
	public String getV_fysjdqzj(){
		return this.V_FYSJDQZJ;
	}
	/**
	*setV_fysjdqzj(java.lang.String)
	*/
	public void setV_fysjdqzj(String v_fysjdqzj){
		this.V_FYSJDQZJ=v_fysjdqzj;
	}
	/**
	* getC_fy_dysj(void) 
	*/
	public String getC_fy_dysj(){
		return this.C_FY_DYSJ;
	}
	/**
	*setC_fy_dysj(java.lang.String)
	*/
	public void setC_fy_dysj(String c_fy_dysj){
		this.C_FY_DYSJ=c_fy_dysj;
	}
	/**
	* getC_fy_ajsj(void) 
	*/
	public String getC_fy_ajsj(){
		return this.C_FY_AJSJ;
	}
	/**
	*setC_fy_ajsj(java.lang.String)
	*/
	public void setC_fy_ajsj(String c_fy_ajsj){
		this.C_FY_AJSJ=c_fy_ajsj;
	}
	/**
	* getV_ajdxyy(void) 
	*/
	public String getV_ajdxyy(){
		return this.V_AJDXYY;
	}
	/**
	*setV_ajdxyy(java.lang.String)
	*/
	public void setV_ajdxyy(String v_ajdxyy){
		this.V_AJDXYY=v_ajdxyy;
	}
	/**
	* getB_fy_sfgtfz(void) 
	*/
	public String getB_fy_sfgtfz(){
		return this.B_FY_SFGTFZ;
	}
	/**
	*setB_fy_sfgtfz(java.lang.String)
	*/
	public void setB_fy_sfgtfz(String b_fy_sfgtfz){
		this.B_FY_SFGTFZ=b_fy_sfgtfz;
	}
	/**
	* getC_fy_tabgrbzayy(void) 
	*/
	public String getC_fy_tabgrbzayy(){
		return this.C_FY_TABGRBZAYY;
	}
	/**
	*setC_fy_tabgrbzayy(java.lang.String)
	*/
	public void setC_fy_tabgrbzayy(String c_fy_tabgrbzayy){
		this.C_FY_TABGRBZAYY=c_fy_tabgrbzayy;
	}
	/**
	* getV_ajjz(void) 
	*/
	public String getV_ajjz(){
		return this.V_AJJZ;
	}
	/**
	*setV_ajjz(java.lang.String)
	*/
	public void setV_ajjz(String v_ajjz){
		this.V_AJJZ=v_ajjz;
	}
	/**
	* getD_fy_sxqsrq(void) 
	*/
	public String getD_fy_sxqsrq(){
		return this.D_FY_SXQSRQ;
	}
	/**
	*setD_fy_sxqsrq(java.lang.String)
	*/
	public void setD_fy_sxqsrq(String d_fy_sxqsrq){
		this.D_FY_SXQSRQ=d_fy_sxqsrq;
	}
	/**
	* getD_fy_sxjmrq(void) 
	*/
	public String getD_fy_sxjmrq(){
		return this.D_FY_SXJMRQ;
	}
	/**
	*setD_fy_sxjmrq(java.lang.String)
	*/
	public void setD_fy_sxjmrq(String d_fy_sxjmrq){
		this.D_FY_SXJMRQ=d_fy_sxjmrq;
	}
	/**
	* getD_fy_laqxjmrq(void) 
	*/
	public String getD_fy_laqxjmrq(){
		return this.D_FY_LAQXJMRQ;
	}
	/**
	*setD_fy_laqxjmrq(java.lang.String)
	*/
	public void setD_fy_laqxjmrq(String d_fy_laqxjmrq){
		this.D_FY_LAQXJMRQ=d_fy_laqxjmrq;
	}
	/**
	* getD_fy_sljsrq(void) 
	*/
	public String getD_fy_sljsrq(){
		return this.D_FY_SLJSRQ;
	}
	/**
	*setD_fy_sljsrq(java.lang.String)
	*/
	public void setD_fy_sljsrq(String d_fy_sljsrq){
		this.D_FY_SLJSRQ=d_fy_sljsrq;
	}
	/**
	* getN_fy_fdlasx(void) 
	*/
	public String getN_fy_fdlasx(){
		return this.N_FY_FDLASX;
	}
	/**
	*setN_fy_fdlasx(java.lang.String)
	*/
	public void setN_fy_fdlasx(String n_fy_fdlasx){
		this.N_FY_FDLASX=n_fy_fdlasx;
	}
	/**
	* getN_fy_sjlats(void) 
	*/
	public String getN_fy_sjlats(){
		return this.N_FY_SJLATS;
	}
	/**
	*setN_fy_sjlats(java.lang.String)
	*/
	public void setN_fy_sjlats(String n_fy_sjlats){
		this.N_FY_SJLATS=n_fy_sjlats;
	}
	/**
	* getN_fy_lacqts(void) 
	*/
	public String getN_fy_lacqts(){
		return this.N_FY_LACQTS;
	}
	/**
	*setN_fy_lacqts(java.lang.String)
	*/
	public void setN_fy_lacqts(String n_fy_lacqts){
		this.N_FY_LACQTS=n_fy_lacqts;
	}
	/**
	* getN_fy_fdsxts(void) 
	*/
	public String getN_fy_fdsxts(){
		return this.N_FY_FDSXTS;
	}
	/**
	*setN_fy_fdsxts(java.lang.String)
	*/
	public void setN_fy_fdsxts(String n_fy_fdsxts){
		this.N_FY_FDSXTS=n_fy_fdsxts;
	}
	/**
	* getN_fy_sjslts(void) 
	*/
	public String getN_fy_sjslts(){
		return this.N_FY_SJSLTS;
	}
	/**
	*setN_fy_sjslts(java.lang.String)
	*/
	public void setN_fy_sjslts(String n_fy_sjslts){
		this.N_FY_SJSLTS=n_fy_sjslts;
	}
	/**
	* getN_fy_csxts(void) 
	*/
	public String getN_fy_csxts(){
		return this.N_FY_CSXTS;
	}
	/**
	*setN_fy_csxts(java.lang.String)
	*/
	public void setN_fy_csxts(String n_fy_csxts){
		this.N_FY_CSXTS=n_fy_csxts;
	}
	/**
	* getN_fy_csxbs(void) 
	*/
	public String getN_fy_csxbs(){
		return this.N_FY_CSXBS;
	}
	/**
	*setN_fy_csxbs(java.lang.String)
	*/
	public void setN_fy_csxbs(String n_fy_csxbs){
		this.N_FY_CSXBS=n_fy_csxbs;
	}
	/**
	* getV_fy_cxxyy(void) 
	*/
	public String getV_fy_cxxyy(){
		return this.V_FY_CXXYY;
	}
	/**
	*setV_fy_cxxyy(java.lang.String)
	*/
	public void setV_fy_cxxyy(String v_fy_cxxyy){
		this.V_FY_CXXYY=v_fy_cxxyy;
	}
	/**
	* getC_jaay(void) 
	*/
	public String getC_jaay(){
		return this.C_JAAY;
	}
	/**
	*setC_jaay(java.lang.String)
	*/
	public void setC_jaay(String c_jaay){
		this.C_JAAY=c_jaay;
	}
	/**
	* getC_fy_jafs(void) 
	*/
	public String getC_fy_jafs(){
		return this.C_FY_JAFS;
	}
	/**
	*setC_fy_jafs(java.lang.String)
	*/
	public void setC_fy_jafs(String c_fy_jafs){
		this.C_FY_JAFS=c_fy_jafs;
	}
	/**
	* getC_byslyy(void) 
	*/
	public String getC_byslyy(){
		return this.C_BYSLYY;
	}
	/**
	*setC_byslyy(java.lang.String)
	*/
	public void setC_byslyy(String c_byslyy){
		this.C_BYSLYY=c_byslyy;
	}
	/**
	* getC_bhzsyy(void) 
	*/
	public String getC_bhzsyy(){
		return this.C_BHZSYY;
	}
	/**
	*setC_bhzsyy(java.lang.String)
	*/
	public void setC_bhzsyy(String c_bhzsyy){
		this.C_BHZSYY=c_bhzsyy;
	}
	/**
	* getC_cslx(void) 
	*/
	public String getC_cslx(){
		return this.C_CSLX;
	}
	/**
	*setC_cslx(java.lang.String)
	*/
	public void setC_cslx(String c_cslx){
		this.C_CSLX=c_cslx;
	}
	/**
	* getV_csclsy(void) 
	*/
	public String getV_csclsy(){
		return this.V_CSCLSY;
	}
	/**
	*setV_csclsy(java.lang.String)
	*/
	public void setV_csclsy(String v_csclsy){
		this.V_CSCLSY=v_csclsy;
	}
	/**
	* getV_jasy(void) 
	*/
	public String getV_jasy(){
		return this.V_JASY;
	}
	/**
	*setV_jasy(java.lang.String)
	*/
	public void setV_jasy(String v_jasy){
		this.V_JASY=v_jasy;
	}
	/**
	* getD_sxrq(void) 
	*/
	public String getD_sxrq(){
		return this.D_SXRQ;
	}
	/**
	*setD_sxrq(java.lang.String)
	*/
	public void setD_sxrq(String d_sxrq){
		this.D_SXRQ=d_sxrq;
	}
	/**
	* getN_pjwhsyje(void) 
	*/
	public String getN_pjwhsyje(){
		return this.N_PJWHSYJE;
	}
	/**
	*setN_pjwhsyje(java.lang.String)
	*/
	public void setN_pjwhsyje(String n_pjwhsyje){
		this.N_PJWHSYJE=n_pjwhsyje;
	}
	/**
	* getD_jarq(void) 
	*/
	public String getD_jarq(){
		return this.D_JARQ;
	}
	/**
	*setD_jarq(java.lang.String)
	*/
	public void setD_jarq(String d_jarq){
		this.D_JARQ=d_jarq;
	}
	/**
	* getV_sxcpswh(void) 
	*/
	public String getV_sxcpswh(){
		return this.V_SXCPSWH;
	}
	/**
	*setV_sxcpswh(java.lang.String)
	*/
	public void setV_sxcpswh(String v_sxcpswh){
		this.V_SXCPSWH=v_sxcpswh;
	}
	/**
	* getC_zcsxcpfy(void) 
	*/
	public String getC_zcsxcpfy(){
		return this.C_ZCSXCPFY;
	}
	/**
	*setC_zcsxcpfy(java.lang.String)
	*/
	public void setC_zcsxcpfy(String c_zcsxcpfy){
		this.C_ZCSXCPFY=c_zcsxcpfy;
	}
	/**
	* getC_ksjg(void) 
	*/
	public String getC_ksjg(){
		return this.C_KSJG;
	}
	/**
	*setC_ksjg(java.lang.String)
	*/
	public void setC_ksjg(String c_ksjg){
		this.C_KSJG=c_ksjg;
	}
	/**
	* getC_tqksly(void) 
	*/
	public String getC_tqksly(){
		return this.C_TQKSLY;
	}
	/**
	*setC_tqksly(java.lang.String)
	*/
	public void setC_tqksly(String c_tqksly){
		this.C_TQKSLY=c_tqksly;
	}
	/**
	* getD_tqksrq(void) 
	*/
	public String getD_tqksrq(){
		return this.D_TQKSRQ;
	}
	/**
	*setD_tqksrq(java.lang.String)
	*/
	public void setD_tqksrq(String d_tqksrq){
		this.D_TQKSRQ=d_tqksrq;
	}
	/**
	* getC_kslx(void) 
	*/
	public String getC_kslx(){
		return this.C_KSLX;
	}
	/**
	*setC_kslx(java.lang.String)
	*/
	public void setC_kslx(String c_kslx){
		this.C_KSLX=c_kslx;
	}


}