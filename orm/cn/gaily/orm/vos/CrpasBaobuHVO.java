package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasBaobuHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_baobu_h")
public class CrpasBaobuHVO {
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
	* PK_BAOBU_H 主键
	*/
	@Column(columnName="pk_baobu_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_BAOBU_H = "pk_baobu_h";
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
	@Column(columnName="v_ajmc",dataType="varchar",dataLength=200,nullAble="Y",comment="案件名称")
	private String V_AJMC = "v_ajmc";
	/**
	* C_ZCJG 侦查机关
	*/
	@Column(columnName="c_zcjg",dataType="varchar",dataLength=20,nullAble="Y",comment="侦查机关")
	private String C_ZCJG = "c_zcjg";
	/**
	* C_ZCJGLB 侦查机关类别
	*/
	@Column(columnName="c_zcjglb",dataType="varchar",dataLength=20,nullAble="Y",comment="侦查机关类别")
	private String C_ZCJGLB = "c_zcjglb";
	/**
	* V_GAWSWH 公安文书文号
	*/
	@Column(columnName="v_gawswh",dataType="varchar",dataLength=50,nullAble="Y",comment="公安文书文号")
	private String V_GAWSWH = "v_gawswh";
	/**
	* N_SMYS 扫描页数
	*/
	@Column(columnName="n_smys",dataType="int",dataLength=0,nullAble="Y",comment="扫描页数")
	private String N_SMYS = "n_smys";
	/**
	* B_SFCBAJ 是否重报案件
	*/
	@Column(columnName="b_sfcbaj",dataType="char",dataLength=1,nullAble="Y",comment="是否重报案件")
	private String B_SFCBAJ = "b_sfcbaj";
	/**
	* B_SFRZQAAJ 是否认罪轻案案件
	*/
	@Column(columnName="b_sfrzqaaj",dataType="char",dataLength=1,nullAble="Y",comment="是否认罪轻案案件")
	private String B_SFRZQAAJ = "b_sfrzqaaj";
	/**
	* B_SFYWCNXYR 是否有未成年嫌疑人
	*/
	@Column(columnName="b_sfywcnxyr",dataType="char",dataLength=1,nullAble="Y",comment="是否有未成年嫌疑人")
	private String B_SFYWCNXYR = "b_sfywcnxyr";
	/**
	* B_SFYWCNBHR 是否有未成年被害人
	*/
	@Column(columnName="b_sfywcnbhr",dataType="char",dataLength=1,nullAble="Y",comment="是否有未成年被害人")
	private String B_SFYWCNBHR = "b_sfywcnbhr";
	/**
	* B_SFYTWXYR 是否有台湾嫌疑人
	*/
	@Column(columnName="b_sfytwxyr",dataType="char",dataLength=1,nullAble="Y",comment="是否有台湾嫌疑人")
	private String B_SFYTWXYR = "b_sfytwxyr";
	/**
	* B_SFYTWBHR 是否有台湾被害人
	*/
	@Column(columnName="b_sfytwbhr",dataType="char",dataLength=1,nullAble="Y",comment="是否有台湾被害人")
	private String B_SFYTWBHR = "b_sfytwbhr";
	/**
	* V_GACBR 公安承办人
	*/
	@Column(columnName="v_gacbr",dataType="varchar",dataLength=50,nullAble="Y",comment="公安承办人")
	private String V_GACBR = "v_gacbr";
	/**
	* V_ZAY 主案由
	*/
	@Column(columnName="v_zay",dataType="varchar",dataLength=200,nullAble="Y",comment="主案由")
	private String V_ZAY = "v_zay";
	/**
	* C_AYBM 案由编码
	*/
	@Column(columnName="c_aybm",dataType="varchar",dataLength=20,nullAble="Y",comment="案由编码")
	private String C_AYBM = "c_aybm";
	/**
	* C_GAYSDW 报送检察院
	*/
	@Column(columnName="c_gaysdw",dataType="varchar",dataLength=20,nullAble="Y",comment="报送检察院")
	private String C_GAYSDW = "c_gaysdw";
	/**
	* T_GAYSSJ 报捕时间
	*/
	@Column(columnName="t_gayssj",dataType="char",dataLength=19,nullAble="Y",comment="报捕时间")
	private String T_GAYSSJ = "t_gayssj";
	/**
	* T_SJFSSJ 实际发送时间
	*/
	@Column(columnName="t_sjfssj",dataType="char",dataLength=19,nullAble="Y",comment="实际发送时间")
	private String T_SJFSSJ = "t_sjfssj";
	/**
	* V_JCY_SLSJ 受理时间
	*/
	@Column(columnName="v_jcy_slsj",dataType="char",dataLength=19,nullAble="Y",comment="受理时间")
	private String V_JCY_SLSJ = "v_jcy_slsj";
	/**
	* T_JCY_SJJSSJ 检察院实际接受时间
	*/
	@Column(columnName="t_jcy_sjjssj",dataType="char",dataLength=19,nullAble="Y",comment="检察院实际接受时间")
	private String T_JCY_SJJSSJ = "t_jcy_sjjssj";
	/**
	* C_JCY_JSDW 检察院接受单位
	*/
	@Column(columnName="c_jcy_jsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="检察院接受单位")
	private String C_JCY_JSDW = "c_jcy_jsdw";
	/**
	* N_JCY_JSJZYS 接收卷宗页数
	*/
	@Column(columnName="n_jcy_jsjzys",dataType="int",dataLength=0,nullAble="Y",comment="接收卷宗页数")
	private String N_JCY_JSJZYS = "n_jcy_jsjzys";
	/**
	* C_JCY_SAR 收案人id
	*/
	@Column(columnName="c_jcy_sar",dataType="varchar",dataLength=20,nullAble="Y",comment="收案人id")
	private String C_JCY_SAR = "c_jcy_sar";
	/**
	* V_JCY_SARXM 收案人姓名
	*/
	@Column(columnName="v_jcy_sarxm",dataType="varchar",dataLength=50,nullAble="Y",comment="收案人姓名")
	private String V_JCY_SARXM = "v_jcy_sarxm";
	/**
	* C_JCY_FAR 分案人id
	*/
	@Column(columnName="c_jcy_far",dataType="varchar",dataLength=20,nullAble="Y",comment="分案人id")
	private String C_JCY_FAR = "c_jcy_far";
	/**
	* V_JCY_FARXM 分案人姓名
	*/
	@Column(columnName="v_jcy_farxm",dataType="varchar",dataLength=50,nullAble="Y",comment="分案人姓名")
	private String V_JCY_FARXM = "v_jcy_farxm";
	/**
	* T_JCY_FASJ 分案时间
	*/
	@Column(columnName="t_jcy_fasj",dataType="char",dataLength=19,nullAble="Y",comment="分案时间")
	private String T_JCY_FASJ = "t_jcy_fasj";
	/**
	* C_JCY_CBR 承办人id
	*/
	@Column(columnName="c_jcy_cbr",dataType="varchar",dataLength=20,nullAble="Y",comment="承办人id")
	private String C_JCY_CBR = "c_jcy_cbr";
	/**
	* V_JCY_CBRXM 承办人姓名
	*/
	@Column(columnName="v_jcy_cbrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="承办人姓名")
	private String V_JCY_CBRXM = "v_jcy_cbrxm";
	/**
	* C_JCY_SHR 审核人id
	*/
	@Column(columnName="c_jcy_shr",dataType="varchar",dataLength=20,nullAble="Y",comment="审核人id")
	private String C_JCY_SHR = "c_jcy_shr";
	/**
	* V_JCY_SHRXM 审核人姓名
	*/
	@Column(columnName="v_jcy_shrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="审核人姓名")
	private String V_JCY_SHRXM = "v_jcy_shrxm";
	/**
	* T_JCY_SHSJ 审核时间
	*/
	@Column(columnName="t_jcy_shsj",dataType="char",dataLength=19,nullAble="Y",comment="审核时间")
	private String T_JCY_SHSJ = "t_jcy_shsj";
	/**
	* T_JCY_SHJG 审核结果
	*/
	@Column(columnName="t_jcy_shjg",dataType="varchar",dataLength=20,nullAble="Y",comment="审核结果")
	private String T_JCY_SHJG = "t_jcy_shjg";
	/**
	* V_JCY_SHJGBZ 审核结果备注
	*/
	@Column(columnName="v_jcy_shjgbz",dataType="varchar",dataLength=2000,nullAble="Y",comment="审核结果备注")
	private String V_JCY_SHJGBZ = "v_jcy_shjgbz";
	/**
	* C_JCY_BSYQSHR 报诉延期审核人id
	*/
	@Column(columnName="c_jcy_bsyqshr",dataType="varchar",dataLength=20,nullAble="Y",comment="报诉延期审核人id")
	private String C_JCY_BSYQSHR = "c_jcy_bsyqshr";
	/**
	* V_JCY_BSYQSHRXM 报诉延期审核人姓名
	*/
	@Column(columnName="v_jcy_bsyqshrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="报诉延期审核人姓名")
	private String V_JCY_BSYQSHRXM = "v_jcy_bsyqshrxm";
	/**
	* B_JCY_SFTYYQ 是否同意延期
	*/
	@Column(columnName="b_jcy_sftyyq",dataType="char",dataLength=1,nullAble="Y",comment="是否同意延期")
	private String B_JCY_SFTYYQ = "b_jcy_sftyyq";
	/**
	* T_JCY_BJSJ 报结时间
	*/
	@Column(columnName="t_jcy_bjsj",dataType="char",dataLength=19,nullAble="Y",comment="报结时间")
	private String T_JCY_BJSJ = "t_jcy_bjsj";
	/**
	* B_JCY_SFYBJ 是否已报结
	*/
	@Column(columnName="b_jcy_sfybj",dataType="char",dataLength=1,nullAble="Y",comment="是否已报结")
	private String B_JCY_SFYBJ = "b_jcy_sfybj";
	/**
	* B_JCY_SFYYS 是否已移送
	*/
	@Column(columnName="b_jcy_sfyys",dataType="char",dataLength=1,nullAble="Y",comment="是否已移送")
	private String B_JCY_SFYYS = "b_jcy_sfyys";
	/**
	* V_JCY_AJBH 检察院案件编号
	*/
	@Column(columnName="v_jcy_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="检察院案件编号")
	private String V_JCY_AJBH = "v_jcy_ajbh";
	/**
	* C_JCY_BMFZR 部门负责人id
	*/
	@Column(columnName="c_jcy_bmfzr",dataType="varchar",dataLength=20,nullAble="Y",comment="部门负责人id")
	private String C_JCY_BMFZR = "c_jcy_bmfzr";
	/**
	* V_JCY_BMFZRXM 部门负责人姓名
	*/
	@Column(columnName="v_jcy_bmfzrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="部门负责人姓名")
	private String V_JCY_BMFZRXM = "v_jcy_bmfzrxm";
	/**
	* C_JCY_JCZ 检察长id
	*/
	@Column(columnName="c_jcy_jcz",dataType="varchar",dataLength=20,nullAble="Y",comment="检察长id")
	private String C_JCY_JCZ = "c_jcy_jcz";
	/**
	* V_JCY_JCZXM 检察长姓名
	*/
	@Column(columnName="v_jcy_jczxm",dataType="varchar",dataLength=50,nullAble="Y",comment="检察长姓名")
	private String V_JCY_JCZXM = "v_jcy_jczxm";
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
	* T_JCY_YSSJ 检察院移送时间
	*/
	@Column(columnName="t_jcy_yssj",dataType="char",dataLength=19,nullAble="Y",comment="检察院移送时间")
	private String T_JCY_YSSJ = "t_jcy_yssj";
	/**
	* T_JCY_THSJ 检察院退回时间
	*/
	@Column(columnName="t_jcy_thsj",dataType="char",dataLength=19,nullAble="Y",comment="检察院退回时间")
	private String T_JCY_THSJ = "t_jcy_thsj";
	/**
	* V_THBCCLYY 退回补充材料原因
	*/
	@Column(columnName="v_thbcclyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="退回补充材料原因")
	private String V_THBCCLYY = "v_thbcclyy";
	/**
	* V_SQFYXX 申请复议信息
	*/
	@Column(columnName="v_sqfyxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="申请复议信息")
	private String V_SQFYXX = "v_sqfyxx";
	/**
	* C_FYSQDW 复议申请单位
	*/
	@Column(columnName="c_fysqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="复议申请单位")
	private String C_FYSQDW = "c_fysqdw";
	/**
	* T_FYSQSJ 复议申请时间
	*/
	@Column(columnName="t_fysqsj",dataType="char",dataLength=19,nullAble="Y",comment="复议申请时间")
	private String T_FYSQSJ = "t_fysqsj";
	/**
	* C_FYSHDW 复议审核单位
	*/
	@Column(columnName="c_fyshdw",dataType="varchar",dataLength=20,nullAble="Y",comment="复议审核单位")
	private String C_FYSHDW = "c_fyshdw";
	/**
	* T_FYSLSJ 复议受理时间
	*/
	@Column(columnName="t_fyslsj",dataType="char",dataLength=19,nullAble="Y",comment="复议受理时间")
	private String T_FYSLSJ = "t_fyslsj";
	/**
	* V_FYSHXX 复议结果
	*/
	@Column(columnName="v_fyshxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="复议结果")
	private String V_FYSHXX = "v_fyshxx";
	/**
	* V_SQFHXX 申请复核信息
	*/
	@Column(columnName="v_sqfhxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="申请复核信息")
	private String V_SQFHXX = "v_sqfhxx";
	/**
	* C_FHSQDW 复核申请单位
	*/
	@Column(columnName="c_fhsqdw",dataType="varchar",dataLength=20,nullAble="Y",comment="复核申请单位")
	private String C_FHSQDW = "c_fhsqdw";
	/**
	* T_FHSQSJ 复核申请时间
	*/
	@Column(columnName="t_fhsqsj",dataType="char",dataLength=19,nullAble="Y",comment="复核申请时间")
	private String T_FHSQSJ = "t_fhsqsj";
	/**
	* C_FHSHDW 复核审核单位
	*/
	@Column(columnName="c_fhshdw",dataType="varchar",dataLength=20,nullAble="Y",comment="复核审核单位")
	private String C_FHSHDW = "c_fhshdw";
	/**
	* T_FHSLSJ 复核受理时间
	*/
	@Column(columnName="t_fhslsj",dataType="char",dataLength=19,nullAble="Y",comment="复核受理时间")
	private String T_FHSLSJ = "t_fhslsj";
	/**
	* V_FHSHXX 复核结果
	*/
	@Column(columnName="v_fhshxx",dataType="varchar",dataLength=2000,nullAble="Y",comment="复核结果")
	private String V_FHSHXX = "v_fhshxx";
	/**
	* V_PTBH 平台案件编号
	*/
	@Column(columnName="v_ptbh",dataType="varchar",dataLength=50,nullAble="Y",comment="平台案件编号")
	private String V_PTBH = "v_ptbh";
	/**
	* C_BBJG 报捕结果
	*/
	@Column(columnName="c_bbjg",dataType="varchar",dataLength=20,nullAble="Y",comment="报捕结果")
	private String C_BBJG = "c_bbjg";
	/**
	* B_SFTHBCCL 是否退回补充材料
	*/
	@Column(columnName="b_sfthbccl",dataType="char",dataLength=1,nullAble="Y",comment="是否退回补充材料")
	private String B_SFTHBCCL = "b_sfthbccl";
	/**
	* B_SFSQFY 是否申请复议
	*/
	@Column(columnName="b_sfsqfy",dataType="char",dataLength=1,nullAble="Y",comment="是否申请复议")
	private String B_SFSQFY = "b_sfsqfy";
	/**
	* B_SFSQFH 是否申请复核
	*/
	@Column(columnName="b_sfsqfh",dataType="char",dataLength=1,nullAble="Y",comment="是否申请复核")
	private String B_SFSQFH = "b_sfsqfh";
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
	* getPk_baobu_h(void) 
	*/
	public String getPk_baobu_h(){
		return this.PK_BAOBU_H;
	}
	/**
	*setPk_baobu_h(java.lang.String)
	*/
	public void setPk_baobu_h(String pk_baobu_h){
		this.PK_BAOBU_H=pk_baobu_h;
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
	* getC_zcjg(void) 
	*/
	public String getC_zcjg(){
		return this.C_ZCJG;
	}
	/**
	*setC_zcjg(java.lang.String)
	*/
	public void setC_zcjg(String c_zcjg){
		this.C_ZCJG=c_zcjg;
	}
	/**
	* getC_zcjglb(void) 
	*/
	public String getC_zcjglb(){
		return this.C_ZCJGLB;
	}
	/**
	*setC_zcjglb(java.lang.String)
	*/
	public void setC_zcjglb(String c_zcjglb){
		this.C_ZCJGLB=c_zcjglb;
	}
	/**
	* getV_gawswh(void) 
	*/
	public String getV_gawswh(){
		return this.V_GAWSWH;
	}
	/**
	*setV_gawswh(java.lang.String)
	*/
	public void setV_gawswh(String v_gawswh){
		this.V_GAWSWH=v_gawswh;
	}
	/**
	* getN_smys(void) 
	*/
	public String getN_smys(){
		return this.N_SMYS;
	}
	/**
	*setN_smys(java.lang.String)
	*/
	public void setN_smys(String n_smys){
		this.N_SMYS=n_smys;
	}
	/**
	* getB_sfcbaj(void) 
	*/
	public String getB_sfcbaj(){
		return this.B_SFCBAJ;
	}
	/**
	*setB_sfcbaj(java.lang.String)
	*/
	public void setB_sfcbaj(String b_sfcbaj){
		this.B_SFCBAJ=b_sfcbaj;
	}
	/**
	* getB_sfrzqaaj(void) 
	*/
	public String getB_sfrzqaaj(){
		return this.B_SFRZQAAJ;
	}
	/**
	*setB_sfrzqaaj(java.lang.String)
	*/
	public void setB_sfrzqaaj(String b_sfrzqaaj){
		this.B_SFRZQAAJ=b_sfrzqaaj;
	}
	/**
	* getB_sfywcnxyr(void) 
	*/
	public String getB_sfywcnxyr(){
		return this.B_SFYWCNXYR;
	}
	/**
	*setB_sfywcnxyr(java.lang.String)
	*/
	public void setB_sfywcnxyr(String b_sfywcnxyr){
		this.B_SFYWCNXYR=b_sfywcnxyr;
	}
	/**
	* getB_sfywcnbhr(void) 
	*/
	public String getB_sfywcnbhr(){
		return this.B_SFYWCNBHR;
	}
	/**
	*setB_sfywcnbhr(java.lang.String)
	*/
	public void setB_sfywcnbhr(String b_sfywcnbhr){
		this.B_SFYWCNBHR=b_sfywcnbhr;
	}
	/**
	* getB_sfytwxyr(void) 
	*/
	public String getB_sfytwxyr(){
		return this.B_SFYTWXYR;
	}
	/**
	*setB_sfytwxyr(java.lang.String)
	*/
	public void setB_sfytwxyr(String b_sfytwxyr){
		this.B_SFYTWXYR=b_sfytwxyr;
	}
	/**
	* getB_sfytwbhr(void) 
	*/
	public String getB_sfytwbhr(){
		return this.B_SFYTWBHR;
	}
	/**
	*setB_sfytwbhr(java.lang.String)
	*/
	public void setB_sfytwbhr(String b_sfytwbhr){
		this.B_SFYTWBHR=b_sfytwbhr;
	}
	/**
	* getV_gacbr(void) 
	*/
	public String getV_gacbr(){
		return this.V_GACBR;
	}
	/**
	*setV_gacbr(java.lang.String)
	*/
	public void setV_gacbr(String v_gacbr){
		this.V_GACBR=v_gacbr;
	}
	/**
	* getV_zay(void) 
	*/
	public String getV_zay(){
		return this.V_ZAY;
	}
	/**
	*setV_zay(java.lang.String)
	*/
	public void setV_zay(String v_zay){
		this.V_ZAY=v_zay;
	}
	/**
	* getC_aybm(void) 
	*/
	public String getC_aybm(){
		return this.C_AYBM;
	}
	/**
	*setC_aybm(java.lang.String)
	*/
	public void setC_aybm(String c_aybm){
		this.C_AYBM=c_aybm;
	}
	/**
	* getC_gaysdw(void) 
	*/
	public String getC_gaysdw(){
		return this.C_GAYSDW;
	}
	/**
	*setC_gaysdw(java.lang.String)
	*/
	public void setC_gaysdw(String c_gaysdw){
		this.C_GAYSDW=c_gaysdw;
	}
	/**
	* getT_gayssj(void) 
	*/
	public String getT_gayssj(){
		return this.T_GAYSSJ;
	}
	/**
	*setT_gayssj(java.lang.String)
	*/
	public void setT_gayssj(String t_gayssj){
		this.T_GAYSSJ=t_gayssj;
	}
	/**
	* getT_sjfssj(void) 
	*/
	public String getT_sjfssj(){
		return this.T_SJFSSJ;
	}
	/**
	*setT_sjfssj(java.lang.String)
	*/
	public void setT_sjfssj(String t_sjfssj){
		this.T_SJFSSJ=t_sjfssj;
	}
	/**
	* getV_jcy_slsj(void) 
	*/
	public String getV_jcy_slsj(){
		return this.V_JCY_SLSJ;
	}
	/**
	*setV_jcy_slsj(java.lang.String)
	*/
	public void setV_jcy_slsj(String v_jcy_slsj){
		this.V_JCY_SLSJ=v_jcy_slsj;
	}
	/**
	* getT_jcy_sjjssj(void) 
	*/
	public String getT_jcy_sjjssj(){
		return this.T_JCY_SJJSSJ;
	}
	/**
	*setT_jcy_sjjssj(java.lang.String)
	*/
	public void setT_jcy_sjjssj(String t_jcy_sjjssj){
		this.T_JCY_SJJSSJ=t_jcy_sjjssj;
	}
	/**
	* getC_jcy_jsdw(void) 
	*/
	public String getC_jcy_jsdw(){
		return this.C_JCY_JSDW;
	}
	/**
	*setC_jcy_jsdw(java.lang.String)
	*/
	public void setC_jcy_jsdw(String c_jcy_jsdw){
		this.C_JCY_JSDW=c_jcy_jsdw;
	}
	/**
	* getN_jcy_jsjzys(void) 
	*/
	public String getN_jcy_jsjzys(){
		return this.N_JCY_JSJZYS;
	}
	/**
	*setN_jcy_jsjzys(java.lang.String)
	*/
	public void setN_jcy_jsjzys(String n_jcy_jsjzys){
		this.N_JCY_JSJZYS=n_jcy_jsjzys;
	}
	/**
	* getC_jcy_sar(void) 
	*/
	public String getC_jcy_sar(){
		return this.C_JCY_SAR;
	}
	/**
	*setC_jcy_sar(java.lang.String)
	*/
	public void setC_jcy_sar(String c_jcy_sar){
		this.C_JCY_SAR=c_jcy_sar;
	}
	/**
	* getV_jcy_sarxm(void) 
	*/
	public String getV_jcy_sarxm(){
		return this.V_JCY_SARXM;
	}
	/**
	*setV_jcy_sarxm(java.lang.String)
	*/
	public void setV_jcy_sarxm(String v_jcy_sarxm){
		this.V_JCY_SARXM=v_jcy_sarxm;
	}
	/**
	* getC_jcy_far(void) 
	*/
	public String getC_jcy_far(){
		return this.C_JCY_FAR;
	}
	/**
	*setC_jcy_far(java.lang.String)
	*/
	public void setC_jcy_far(String c_jcy_far){
		this.C_JCY_FAR=c_jcy_far;
	}
	/**
	* getV_jcy_farxm(void) 
	*/
	public String getV_jcy_farxm(){
		return this.V_JCY_FARXM;
	}
	/**
	*setV_jcy_farxm(java.lang.String)
	*/
	public void setV_jcy_farxm(String v_jcy_farxm){
		this.V_JCY_FARXM=v_jcy_farxm;
	}
	/**
	* getT_jcy_fasj(void) 
	*/
	public String getT_jcy_fasj(){
		return this.T_JCY_FASJ;
	}
	/**
	*setT_jcy_fasj(java.lang.String)
	*/
	public void setT_jcy_fasj(String t_jcy_fasj){
		this.T_JCY_FASJ=t_jcy_fasj;
	}
	/**
	* getC_jcy_cbr(void) 
	*/
	public String getC_jcy_cbr(){
		return this.C_JCY_CBR;
	}
	/**
	*setC_jcy_cbr(java.lang.String)
	*/
	public void setC_jcy_cbr(String c_jcy_cbr){
		this.C_JCY_CBR=c_jcy_cbr;
	}
	/**
	* getV_jcy_cbrxm(void) 
	*/
	public String getV_jcy_cbrxm(){
		return this.V_JCY_CBRXM;
	}
	/**
	*setV_jcy_cbrxm(java.lang.String)
	*/
	public void setV_jcy_cbrxm(String v_jcy_cbrxm){
		this.V_JCY_CBRXM=v_jcy_cbrxm;
	}
	/**
	* getC_jcy_shr(void) 
	*/
	public String getC_jcy_shr(){
		return this.C_JCY_SHR;
	}
	/**
	*setC_jcy_shr(java.lang.String)
	*/
	public void setC_jcy_shr(String c_jcy_shr){
		this.C_JCY_SHR=c_jcy_shr;
	}
	/**
	* getV_jcy_shrxm(void) 
	*/
	public String getV_jcy_shrxm(){
		return this.V_JCY_SHRXM;
	}
	/**
	*setV_jcy_shrxm(java.lang.String)
	*/
	public void setV_jcy_shrxm(String v_jcy_shrxm){
		this.V_JCY_SHRXM=v_jcy_shrxm;
	}
	/**
	* getT_jcy_shsj(void) 
	*/
	public String getT_jcy_shsj(){
		return this.T_JCY_SHSJ;
	}
	/**
	*setT_jcy_shsj(java.lang.String)
	*/
	public void setT_jcy_shsj(String t_jcy_shsj){
		this.T_JCY_SHSJ=t_jcy_shsj;
	}
	/**
	* getT_jcy_shjg(void) 
	*/
	public String getT_jcy_shjg(){
		return this.T_JCY_SHJG;
	}
	/**
	*setT_jcy_shjg(java.lang.String)
	*/
	public void setT_jcy_shjg(String t_jcy_shjg){
		this.T_JCY_SHJG=t_jcy_shjg;
	}
	/**
	* getV_jcy_shjgbz(void) 
	*/
	public String getV_jcy_shjgbz(){
		return this.V_JCY_SHJGBZ;
	}
	/**
	*setV_jcy_shjgbz(java.lang.String)
	*/
	public void setV_jcy_shjgbz(String v_jcy_shjgbz){
		this.V_JCY_SHJGBZ=v_jcy_shjgbz;
	}
	/**
	* getC_jcy_bsyqshr(void) 
	*/
	public String getC_jcy_bsyqshr(){
		return this.C_JCY_BSYQSHR;
	}
	/**
	*setC_jcy_bsyqshr(java.lang.String)
	*/
	public void setC_jcy_bsyqshr(String c_jcy_bsyqshr){
		this.C_JCY_BSYQSHR=c_jcy_bsyqshr;
	}
	/**
	* getV_jcy_bsyqshrxm(void) 
	*/
	public String getV_jcy_bsyqshrxm(){
		return this.V_JCY_BSYQSHRXM;
	}
	/**
	*setV_jcy_bsyqshrxm(java.lang.String)
	*/
	public void setV_jcy_bsyqshrxm(String v_jcy_bsyqshrxm){
		this.V_JCY_BSYQSHRXM=v_jcy_bsyqshrxm;
	}
	/**
	* getB_jcy_sftyyq(void) 
	*/
	public String getB_jcy_sftyyq(){
		return this.B_JCY_SFTYYQ;
	}
	/**
	*setB_jcy_sftyyq(java.lang.String)
	*/
	public void setB_jcy_sftyyq(String b_jcy_sftyyq){
		this.B_JCY_SFTYYQ=b_jcy_sftyyq;
	}
	/**
	* getT_jcy_bjsj(void) 
	*/
	public String getT_jcy_bjsj(){
		return this.T_JCY_BJSJ;
	}
	/**
	*setT_jcy_bjsj(java.lang.String)
	*/
	public void setT_jcy_bjsj(String t_jcy_bjsj){
		this.T_JCY_BJSJ=t_jcy_bjsj;
	}
	/**
	* getB_jcy_sfybj(void) 
	*/
	public String getB_jcy_sfybj(){
		return this.B_JCY_SFYBJ;
	}
	/**
	*setB_jcy_sfybj(java.lang.String)
	*/
	public void setB_jcy_sfybj(String b_jcy_sfybj){
		this.B_JCY_SFYBJ=b_jcy_sfybj;
	}
	/**
	* getB_jcy_sfyys(void) 
	*/
	public String getB_jcy_sfyys(){
		return this.B_JCY_SFYYS;
	}
	/**
	*setB_jcy_sfyys(java.lang.String)
	*/
	public void setB_jcy_sfyys(String b_jcy_sfyys){
		this.B_JCY_SFYYS=b_jcy_sfyys;
	}
	/**
	* getV_jcy_ajbh(void) 
	*/
	public String getV_jcy_ajbh(){
		return this.V_JCY_AJBH;
	}
	/**
	*setV_jcy_ajbh(java.lang.String)
	*/
	public void setV_jcy_ajbh(String v_jcy_ajbh){
		this.V_JCY_AJBH=v_jcy_ajbh;
	}
	/**
	* getC_jcy_bmfzr(void) 
	*/
	public String getC_jcy_bmfzr(){
		return this.C_JCY_BMFZR;
	}
	/**
	*setC_jcy_bmfzr(java.lang.String)
	*/
	public void setC_jcy_bmfzr(String c_jcy_bmfzr){
		this.C_JCY_BMFZR=c_jcy_bmfzr;
	}
	/**
	* getV_jcy_bmfzrxm(void) 
	*/
	public String getV_jcy_bmfzrxm(){
		return this.V_JCY_BMFZRXM;
	}
	/**
	*setV_jcy_bmfzrxm(java.lang.String)
	*/
	public void setV_jcy_bmfzrxm(String v_jcy_bmfzrxm){
		this.V_JCY_BMFZRXM=v_jcy_bmfzrxm;
	}
	/**
	* getC_jcy_jcz(void) 
	*/
	public String getC_jcy_jcz(){
		return this.C_JCY_JCZ;
	}
	/**
	*setC_jcy_jcz(java.lang.String)
	*/
	public void setC_jcy_jcz(String c_jcy_jcz){
		this.C_JCY_JCZ=c_jcy_jcz;
	}
	/**
	* getV_jcy_jczxm(void) 
	*/
	public String getV_jcy_jczxm(){
		return this.V_JCY_JCZXM;
	}
	/**
	*setV_jcy_jczxm(java.lang.String)
	*/
	public void setV_jcy_jczxm(String v_jcy_jczxm){
		this.V_JCY_JCZXM=v_jcy_jczxm;
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
	* getT_jcy_thsj(void) 
	*/
	public String getT_jcy_thsj(){
		return this.T_JCY_THSJ;
	}
	/**
	*setT_jcy_thsj(java.lang.String)
	*/
	public void setT_jcy_thsj(String t_jcy_thsj){
		this.T_JCY_THSJ=t_jcy_thsj;
	}
	/**
	* getV_thbcclyy(void) 
	*/
	public String getV_thbcclyy(){
		return this.V_THBCCLYY;
	}
	/**
	*setV_thbcclyy(java.lang.String)
	*/
	public void setV_thbcclyy(String v_thbcclyy){
		this.V_THBCCLYY=v_thbcclyy;
	}
	/**
	* getV_sqfyxx(void) 
	*/
	public String getV_sqfyxx(){
		return this.V_SQFYXX;
	}
	/**
	*setV_sqfyxx(java.lang.String)
	*/
	public void setV_sqfyxx(String v_sqfyxx){
		this.V_SQFYXX=v_sqfyxx;
	}
	/**
	* getC_fysqdw(void) 
	*/
	public String getC_fysqdw(){
		return this.C_FYSQDW;
	}
	/**
	*setC_fysqdw(java.lang.String)
	*/
	public void setC_fysqdw(String c_fysqdw){
		this.C_FYSQDW=c_fysqdw;
	}
	/**
	* getT_fysqsj(void) 
	*/
	public String getT_fysqsj(){
		return this.T_FYSQSJ;
	}
	/**
	*setT_fysqsj(java.lang.String)
	*/
	public void setT_fysqsj(String t_fysqsj){
		this.T_FYSQSJ=t_fysqsj;
	}
	/**
	* getC_fyshdw(void) 
	*/
	public String getC_fyshdw(){
		return this.C_FYSHDW;
	}
	/**
	*setC_fyshdw(java.lang.String)
	*/
	public void setC_fyshdw(String c_fyshdw){
		this.C_FYSHDW=c_fyshdw;
	}
	/**
	* getT_fyslsj(void) 
	*/
	public String getT_fyslsj(){
		return this.T_FYSLSJ;
	}
	/**
	*setT_fyslsj(java.lang.String)
	*/
	public void setT_fyslsj(String t_fyslsj){
		this.T_FYSLSJ=t_fyslsj;
	}
	/**
	* getV_fyshxx(void) 
	*/
	public String getV_fyshxx(){
		return this.V_FYSHXX;
	}
	/**
	*setV_fyshxx(java.lang.String)
	*/
	public void setV_fyshxx(String v_fyshxx){
		this.V_FYSHXX=v_fyshxx;
	}
	/**
	* getV_sqfhxx(void) 
	*/
	public String getV_sqfhxx(){
		return this.V_SQFHXX;
	}
	/**
	*setV_sqfhxx(java.lang.String)
	*/
	public void setV_sqfhxx(String v_sqfhxx){
		this.V_SQFHXX=v_sqfhxx;
	}
	/**
	* getC_fhsqdw(void) 
	*/
	public String getC_fhsqdw(){
		return this.C_FHSQDW;
	}
	/**
	*setC_fhsqdw(java.lang.String)
	*/
	public void setC_fhsqdw(String c_fhsqdw){
		this.C_FHSQDW=c_fhsqdw;
	}
	/**
	* getT_fhsqsj(void) 
	*/
	public String getT_fhsqsj(){
		return this.T_FHSQSJ;
	}
	/**
	*setT_fhsqsj(java.lang.String)
	*/
	public void setT_fhsqsj(String t_fhsqsj){
		this.T_FHSQSJ=t_fhsqsj;
	}
	/**
	* getC_fhshdw(void) 
	*/
	public String getC_fhshdw(){
		return this.C_FHSHDW;
	}
	/**
	*setC_fhshdw(java.lang.String)
	*/
	public void setC_fhshdw(String c_fhshdw){
		this.C_FHSHDW=c_fhshdw;
	}
	/**
	* getT_fhslsj(void) 
	*/
	public String getT_fhslsj(){
		return this.T_FHSLSJ;
	}
	/**
	*setT_fhslsj(java.lang.String)
	*/
	public void setT_fhslsj(String t_fhslsj){
		this.T_FHSLSJ=t_fhslsj;
	}
	/**
	* getV_fhshxx(void) 
	*/
	public String getV_fhshxx(){
		return this.V_FHSHXX;
	}
	/**
	*setV_fhshxx(java.lang.String)
	*/
	public void setV_fhshxx(String v_fhshxx){
		this.V_FHSHXX=v_fhshxx;
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
	* getC_bbjg(void) 
	*/
	public String getC_bbjg(){
		return this.C_BBJG;
	}
	/**
	*setC_bbjg(java.lang.String)
	*/
	public void setC_bbjg(String c_bbjg){
		this.C_BBJG=c_bbjg;
	}
	/**
	* getB_sfthbccl(void) 
	*/
	public String getB_sfthbccl(){
		return this.B_SFTHBCCL;
	}
	/**
	*setB_sfthbccl(java.lang.String)
	*/
	public void setB_sfthbccl(String b_sfthbccl){
		this.B_SFTHBCCL=b_sfthbccl;
	}
	/**
	* getB_sfsqfy(void) 
	*/
	public String getB_sfsqfy(){
		return this.B_SFSQFY;
	}
	/**
	*setB_sfsqfy(java.lang.String)
	*/
	public void setB_sfsqfy(String b_sfsqfy){
		this.B_SFSQFY=b_sfsqfy;
	}
	/**
	* getB_sfsqfh(void) 
	*/
	public String getB_sfsqfh(){
		return this.B_SFSQFH;
	}
	/**
	*setB_sfsqfh(java.lang.String)
	*/
	public void setB_sfsqfh(String b_sfsqfh){
		this.B_SFSQFH=b_sfsqfh;
	}


}