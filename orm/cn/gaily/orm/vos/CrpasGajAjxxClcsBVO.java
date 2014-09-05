package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGajAjxxClcsBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_clcs_b")
public class CrpasGajAjxxClcsBVO {
	/**
	* PK_GAJ_AJXX_CLCS_B 子表主键
	*/
	@Column(columnName="pk_gaj_ajxx_clcs_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GAJ_AJXX_CLCS_B = "pk_gaj_ajxx_clcs_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_CSBH 措施编号
	*/
	@Column(columnName="v_csbh",dataType="varchar",dataLength=50,nullAble="Y",comment="措施编号")
	private String V_CSBH = "v_csbh";
	/**
	* V_FLYJ 法律依据
	*/
	@Column(columnName="v_flyj",dataType="varchar",dataLength=500,nullAble="Y",comment="法律依据")
	private String V_FLYJ = "v_flyj";
	/**
	* C_BGQCZCS 变更前措施
	*/
	@Column(columnName="c_bgqczcs",dataType="varchar",dataLength=20,nullAble="Y",comment="变更前措施")
	private String C_BGQCZCS = "c_bgqczcs";
	/**
	* C_CQLB 措施呈请类别
	*/
	@Column(columnName="c_cqlb",dataType="varchar",dataLength=20,nullAble="Y",comment="措施呈请类别")
	private String C_CQLB = "c_cqlb";
	/**
	* T_QSSJ 起始时间
	*/
	@Column(columnName="t_qssj",dataType="char",dataLength=19,nullAble="Y",comment="起始时间")
	private String T_QSSJ = "t_qssj";
	/**
	* T_ZZSJ 终止时间
	*/
	@Column(columnName="t_zzsj",dataType="char",dataLength=19,nullAble="Y",comment="终止时间")
	private String T_ZZSJ = "t_zzsj";
	/**
	* V_CQSX 呈请事项
	*/
	@Column(columnName="v_cqsx",dataType="varchar",dataLength=200,nullAble="Y",comment="呈请事项")
	private String V_CQSX = "v_cqsx";
	/**
	* V_SSYJ 事实依据
	*/
	@Column(columnName="v_ssyj",dataType="varchar",dataLength=2000,nullAble="Y",comment="事实依据")
	private String V_SSYJ = "v_ssyj";
	/**
	* C_CBR 承办人id
	*/
	@Column(columnName="c_cbr",dataType="varchar",dataLength=20,nullAble="Y",comment="承办人id")
	private String C_CBR = "c_cbr";
	/**
	* T_CBSJ 承办时间
	*/
	@Column(columnName="t_cbsj",dataType="char",dataLength=19,nullAble="Y",comment="承办时间")
	private String T_CBSJ = "t_cbsj";
	/**
	* V_CBRYJ 承办人意见
	*/
	@Column(columnName="v_cbryj",dataType="varchar",dataLength=200,nullAble="Y",comment="承办人意见")
	private String V_CBRYJ = "v_cbryj";
	/**
	* C_CBDWSHR 承办单位审核
	*/
	@Column(columnName="c_cbdwshr",dataType="varchar",dataLength=20,nullAble="Y",comment="承办单位审核")
	private String C_CBDWSHR = "c_cbdwshr";
	/**
	* T_CBDWSHSJ 承办单位审核时间
	*/
	@Column(columnName="t_cbdwshsj",dataType="char",dataLength=19,nullAble="Y",comment="承办单位审核时间")
	private String T_CBDWSHSJ = "t_cbdwshsj";
	/**
	* C_CBDWSHJG 承办单位审核结果
	*/
	@Column(columnName="c_cbdwshjg",dataType="varchar",dataLength=20,nullAble="Y",comment="承办单位审核结果")
	private String C_CBDWSHJG = "c_cbdwshjg";
	/**
	* V_CBDWSHYJ 办案部门意见
	*/
	@Column(columnName="v_cbdwshyj",dataType="varchar",dataLength=500,nullAble="Y",comment="办案部门意见")
	private String V_CBDWSHYJ = "v_cbdwshyj";
	/**
	* C_SHBM 审核部门id
	*/
	@Column(columnName="c_shbm",dataType="varchar",dataLength=20,nullAble="Y",comment="审核部门id")
	private String C_SHBM = "c_shbm";
	/**
	* C_SHR 审核人id
	*/
	@Column(columnName="c_shr",dataType="varchar",dataLength=20,nullAble="Y",comment="审核人id")
	private String C_SHR = "c_shr";
	/**
	* T_SHSJ 审核时间
	*/
	@Column(columnName="t_shsj",dataType="char",dataLength=19,nullAble="Y",comment="审核时间")
	private String T_SHSJ = "t_shsj";
	/**
	* C_SHJG 审核结果
	*/
	@Column(columnName="c_shjg",dataType="varchar",dataLength=20,nullAble="Y",comment="审核结果")
	private String C_SHJG = "c_shjg";
	/**
	* V_SHYJ 审核意见
	*/
	@Column(columnName="v_shyj",dataType="varchar",dataLength=500,nullAble="Y",comment="审核意见")
	private String V_SHYJ = "v_shyj";
	/**
	* C_SPBM 审批部门id
	*/
	@Column(columnName="c_spbm",dataType="varchar",dataLength=20,nullAble="Y",comment="审批部门id")
	private String C_SPBM = "c_spbm";
	/**
	* C_SPR 审批人id
	*/
	@Column(columnName="c_spr",dataType="varchar",dataLength=20,nullAble="Y",comment="审批人id")
	private String C_SPR = "c_spr";
	/**
	* T_SPSJ 审批时间
	*/
	@Column(columnName="t_spsj",dataType="char",dataLength=19,nullAble="Y",comment="审批时间")
	private String T_SPSJ = "t_spsj";
	/**
	* V_SPYJ 审批意见
	*/
	@Column(columnName="v_spyj",dataType="varchar",dataLength=500,nullAble="Y",comment="审批意见")
	private String V_SPYJ = "v_spyj";
	/**
	* C_SPJG 审批结果
	*/
	@Column(columnName="c_spjg",dataType="varchar",dataLength=20,nullAble="Y",comment="审批结果")
	private String C_SPJG = "c_spjg";
	/**
	* D_RSRQ 入所日期
	*/
	@Column(columnName="d_rsrq",dataType="char",dataLength=19,nullAble="Y",comment="入所日期")
	private String D_RSRQ = "d_rsrq";
	/**
	* D_CSRQ 出所日期
	*/
	@Column(columnName="d_csrq",dataType="char",dataLength=19,nullAble="Y",comment="出所日期")
	private String D_CSRQ = "d_csrq";
	/**
	* C_QBFS 取保方式
	*/
	@Column(columnName="c_qbfs",dataType="varchar",dataLength=20,nullAble="Y",comment="取保方式")
	private String C_QBFS = "c_qbfs";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=2000,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
	/**
	* C_DBFS 逮捕方式
	*/
	@Column(columnName="c_dbfs",dataType="varchar",dataLength=20,nullAble="Y",comment="逮捕方式")
	private String C_DBFS = "c_dbfs";
	/**
	* C_JCJGYJ 检察机关意见
	*/
	@Column(columnName="c_jcjgyj",dataType="varchar",dataLength=20,nullAble="Y",comment="检察机关意见")
	private String C_JCJGYJ = "c_jcjgyj";
	/**
	* V_JCJGMC 检察机关名称
	*/
	@Column(columnName="v_jcjgmc",dataType="varchar",dataLength=100,nullAble="Y",comment="检察机关名称")
	private String V_JCJGMC = "v_jcjgmc";
	/**
	* T_JCJGPSSJ 检察机关批示时间
	*/
	@Column(columnName="t_jcjgpssj",dataType="char",dataLength=19,nullAble="Y",comment="检察机关批示时间")
	private String T_JCJGPSSJ = "t_jcjgpssj";
	/**
	* V_CSWH 措施文号
	*/
	@Column(columnName="v_cswh",dataType="varchar",dataLength=50,nullAble="Y",comment="措施文号")
	private String V_CSWH = "v_cswh";
	/**
	* B_SFBCZC 是否补充侦查
	*/
	@Column(columnName="b_sfbczc",dataType="char",dataLength=1,nullAble="Y",comment="是否补充侦查")
	private String B_SFBCZC = "b_sfbczc";
	/**
	* C_PSBM 批示部门id
	*/
	@Column(columnName="c_psbm",dataType="varchar",dataLength=20,nullAble="Y",comment="批示部门id")
	private String C_PSBM = "c_psbm";
	/**
	* C_PSJG 批示结果
	*/
	@Column(columnName="c_psjg",dataType="varchar",dataLength=20,nullAble="Y",comment="批示结果")
	private String C_PSJG = "c_psjg";
	/**
	* C_PSR 批示人id
	*/
	@Column(columnName="c_psr",dataType="varchar",dataLength=20,nullAble="Y",comment="批示人id")
	private String C_PSR = "c_psr";
	/**
	* T_PSSJ 批示时间
	*/
	@Column(columnName="t_pssj",dataType="char",dataLength=19,nullAble="Y",comment="批示时间")
	private String T_PSSJ = "t_pssj";
	/**
	* V_PSYJ 批示意见
	*/
	@Column(columnName="v_psyj",dataType="varchar",dataLength=500,nullAble="Y",comment="批示意见")
	private String V_PSYJ = "v_psyj";
	/**
	* V_FHQK 复核情况
	*/
	@Column(columnName="v_fhqk",dataType="varchar",dataLength=2000,nullAble="Y",comment="复核情况")
	private String V_FHQK = "v_fhqk";
	/**
	* V_FHYJ 复核意见
	*/
	@Column(columnName="v_fhyj",dataType="varchar",dataLength=2000,nullAble="Y",comment="复核意见")
	private String V_FHYJ = "v_fhyj";
	/**
	* V_FHFLYJ 复核法律依据
	*/
	@Column(columnName="v_fhflyj",dataType="varchar",dataLength=500,nullAble="Y",comment="复核法律依据")
	private String V_FHFLYJ = "v_fhflyj";
	/**
	* V_SHFZR 审核负责人
	*/
	@Column(columnName="v_shfzr",dataType="varchar",dataLength=50,nullAble="Y",comment="审核负责人")
	private String V_SHFZR = "v_shfzr";
	/**
	* C_JDQX 决定期限
	*/
	@Column(columnName="c_jdqx",dataType="varchar",dataLength=20,nullAble="Y",comment="决定期限")
	private String C_JDQX = "c_jdqx";
	/**
	* C_CSJDJG 决定结果
	*/
	@Column(columnName="c_csjdjg",dataType="varchar",dataLength=20,nullAble="Y",comment="决定结果")
	private String C_CSJDJG = "c_csjdjg";
	/**
	* T_JDSJ 决定时间
	*/
	@Column(columnName="t_jdsj",dataType="char",dataLength=19,nullAble="Y",comment="决定时间")
	private String T_JDSJ = "t_jdsj";
	/**
	* C_JDJG 决定机关
	*/
	@Column(columnName="c_jdjg",dataType="varchar",dataLength=20,nullAble="Y",comment="决定机关")
	private String C_JDJG = "c_jdjg";
	/**
	* V_ZZJDQX 最终决定期限
	*/
	@Column(columnName="v_zzjdqx",dataType="varchar",dataLength=20,nullAble="Y",comment="最终决定期限")
	private String V_ZZJDQX = "v_zzjdqx";
	/**
	* D_YTLQ 原停留期至
	*/
	@Column(columnName="d_ytlq",dataType="char",dataLength=19,nullAble="Y",comment="原停留期至")
	private String D_YTLQ = "d_ytlq";
	/**
	* D_XTLQ 现停留期至
	*/
	@Column(columnName="d_xtlq",dataType="char",dataLength=19,nullAble="Y",comment="现停留期至")
	private String D_XTLQ = "d_xtlq";
	/**
	* C_BMJB 保密级别
	*/
	@Column(columnName="c_bmjb",dataType="varchar",dataLength=20,nullAble="Y",comment="保密级别")
	private String C_BMJB = "c_bmjb";
	/**
	* V_CBDWMC 承办单位名称
	*/
	@Column(columnName="v_cbdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="承办单位名称")
	private String V_CBDWMC = "v_cbdwmc";
	/**
	* V_CBRXM 承办人姓名
	*/
	@Column(columnName="v_cbrxm",dataType="varchar",dataLength=200,nullAble="Y",comment="承办人姓名")
	private String V_CBRXM = "v_cbrxm";
	/**
	* V_SHBMMC 审核部门名称
	*/
	@Column(columnName="v_shbmmc",dataType="varchar",dataLength=100,nullAble="Y",comment="审核部门名称")
	private String V_SHBMMC = "v_shbmmc";
	/**
	* V_SHRXM 审核人姓名
	*/
	@Column(columnName="v_shrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="审核人姓名")
	private String V_SHRXM = "v_shrxm";
	/**
	* V_SPBMMC 审批部门名称
	*/
	@Column(columnName="v_spbmmc",dataType="varchar",dataLength=100,nullAble="Y",comment="审批部门名称")
	private String V_SPBMMC = "v_spbmmc";
	/**
	* V_SPRXM 审批人姓名
	*/
	@Column(columnName="v_sprxm",dataType="varchar",dataLength=100,nullAble="Y",comment="审批人姓名")
	private String V_SPRXM = "v_sprxm";
	/**
	* V_CBDWSHRXM 承办单位审核人姓名
	*/
	@Column(columnName="v_cbdwshrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="承办单位审核人姓名")
	private String V_CBDWSHRXM = "v_cbdwshrxm";
	/**
	* V_JDJGMC 决定机关名称
	*/
	@Column(columnName="v_jdjgmc",dataType="varchar",dataLength=100,nullAble="Y",comment="决定机关名称")
	private String V_JDJGMC = "v_jdjgmc";
	/**
	* V_WSBS 文书生成标识
	*/
	@Column(columnName="v_wsbs",dataType="varchar",dataLength=50,nullAble="Y",comment="文书生成标识")
	private String V_WSBS = "v_wsbs";
	/**
	* C_CBDW 承办单位id
	*/
	@Column(columnName="c_cbdw",dataType="varchar",dataLength=20,nullAble="Y",comment="承办单位id")
	private String C_CBDW = "c_cbdw";
	/**
	* C_DXLB 对象类别
	*/
	@Column(columnName="c_dxlb",dataType="varchar",dataLength=20,nullAble="Y",comment="对象类别")
	private String C_DXLB = "c_dxlb";
	/**
	* V_BZRXM 处理措施保证人姓名
	*/
	@Column(columnName="v_bzrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="处理措施保证人姓名")
	private String V_BZRXM = "v_bzrxm";
	/**
	* N_BZJ 处理措施保证金
	*/
	@Column(columnName="n_bzj",dataType="decimal",dataLength=20,nullAble="Y",comment="处理措施保证金")
	private String N_BZJ = "n_bzj";
	/**
	* C_JCJG 检察机关id
	*/
	@Column(columnName="c_jcjg",dataType="varchar",dataLength=20,nullAble="Y",comment="检察机关id")
	private String C_JCJG = "c_jcjg";
	/**
	* C_SPJB 案件审批级别
	*/
	@Column(columnName="c_spjb",dataType="varchar",dataLength=20,nullAble="Y",comment="案件审批级别")
	private String C_SPJB = "c_spjb";
	/**
	* V_GLJGBH 关联措施结果编号
	*/
	@Column(columnName="v_gljgbh",dataType="varchar",dataLength=1000,nullAble="Y",comment="关联措施结果编号")
	private String V_GLJGBH = "v_gljgbh";
	/**
	* V_DXMC 措施对象名称
	*/
	@Column(columnName="v_dxmc",dataType="varchar",dataLength=100,nullAble="Y",comment="措施对象名称")
	private String V_DXMC = "v_dxmc";
	/**
	* V_DXBH 措施对象编号
	*/
	@Column(columnName="v_dxbh",dataType="varchar",dataLength=50,nullAble="Y",comment="措施对象编号")
	private String V_DXBH = "v_dxbh";
	/**
	* C_DXXB 措施对象性别
	*/
	@Column(columnName="c_dxxb",dataType="varchar",dataLength=20,nullAble="Y",comment="措施对象性别")
	private String C_DXXB = "c_dxxb";
	/**
	* D_DXCSRQ 措施对象出生日期
	*/
	@Column(columnName="d_dxcsrq",dataType="char",dataLength=19,nullAble="Y",comment="措施对象出生日期")
	private String D_DXCSRQ = "d_dxcsrq";
	/**
	* V_DXZJZLHM 措施对象证件种类号码
	*/
	@Column(columnName="v_dxzjzlhm",dataType="varchar",dataLength=100,nullAble="Y",comment="措施对象证件种类号码")
	private String V_DXZJZLHM = "v_dxzjzlhm";
	/**
	* V_DXXZZ 措施对象现住址
	*/
	@Column(columnName="v_dxxzz",dataType="varchar",dataLength=100,nullAble="Y",comment="措施对象现住址")
	private String V_DXXZZ = "v_dxxzz";
	/**
	* V_DXGZDW 措施对象工作单位
	*/
	@Column(columnName="v_dxgzdw",dataType="varchar",dataLength=100,nullAble="Y",comment="措施对象工作单位")
	private String V_DXGZDW = "v_dxgzdw";
	/**
	* V_DXLXFS 措施对象联系方式
	*/
	@Column(columnName="v_dxlxfs",dataType="varchar",dataLength=100,nullAble="Y",comment="措施对象联系方式")
	private String V_DXLXFS = "v_dxlxfs";
	/**
	* V_DXFRDB 措施对象法人代表
	*/
	@Column(columnName="v_dxfrdb",dataType="varchar",dataLength=100,nullAble="Y",comment="措施对象法人代表")
	private String V_DXFRDB = "v_dxfrdb";
	/**
	* C_DXCYRZL 措施物品持有人种类
	*/
	@Column(columnName="c_dxcyrzl",dataType="varchar",dataLength=20,nullAble="Y",comment="措施物品持有人种类")
	private String C_DXCYRZL = "c_dxcyrzl";
	/**
	* V_CSZXDD 措施执行地点
	*/
	@Column(columnName="v_cszxdd",dataType="varchar",dataLength=100,nullAble="Y",comment="措施执行地点")
	private String V_CSZXDD = "v_cszxdd";
	/**
	* V_FYJG 复议机构
	*/
	@Column(columnName="v_fyjg",dataType="varchar",dataLength=100,nullAble="Y",comment="复议机构")
	private String V_FYJG = "v_fyjg";
	/**
	* V_SSJG 诉讼机构
	*/
	@Column(columnName="v_ssjg",dataType="varchar",dataLength=100,nullAble="Y",comment="诉讼机构")
	private String V_SSJG = "v_ssjg";
	/**
	* C_SHSPBS 审核审批标识
	*/
	@Column(columnName="c_shspbs",dataType="varchar",dataLength=20,nullAble="Y",comment="审核审批标识")
	private String C_SHSPBS = "c_shspbs";
	/**
	* V_CSYY 措施原因
	*/
	@Column(columnName="v_csyy",dataType="varchar",dataLength=200,nullAble="Y",comment="措施原因")
	private String V_CSYY = "v_csyy";
	/**
	* V_CSDXXX 措施对象信息
	*/
	@Column(columnName="v_csdxxx",dataType="varchar",dataLength=200,nullAble="Y",comment="措施对象信息")
	private String V_CSDXXX = "v_csdxxx";
	/**
	* V_CSZXR 措施执行人
	*/
	@Column(columnName="v_cszxr",dataType="varchar",dataLength=100,nullAble="Y",comment="措施执行人")
	private String V_CSZXR = "v_cszxr";
	/**
	* V_HXCSBS 后续措施标识
	*/
	@Column(columnName="v_hxcsbs",dataType="varchar",dataLength=50,nullAble="Y",comment="后续措施标识")
	private String V_HXCSBS = "v_hxcsbs";
	/**
	* V_BCXX 补充信息
	*/
	@Column(columnName="v_bcxx",dataType="varchar",dataLength=1000,nullAble="Y",comment="补充信息")
	private String V_BCXX = "v_bcxx";
	/**
	* V_CSZXDWMC 执行单位名称
	*/
	@Column(columnName="v_cszxdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="执行单位名称")
	private String V_CSZXDWMC = "v_cszxdwmc";
	/**
	* V_CSAJLBMC 措施案件类别名称
	*/
	@Column(columnName="v_csajlbmc",dataType="varchar",dataLength=100,nullAble="Y",comment="措施案件类别名称")
	private String V_CSAJLBMC = "v_csajlbmc";
	/**
	* V_JZCQBS 集中呈请标识
	*/
	@Column(columnName="v_jzcqbs",dataType="varchar",dataLength=50,nullAble="Y",comment="集中呈请标识")
	private String V_JZCQBS = "v_jzcqbs";
	/**
	* V_CQWSBH 呈请文书编号
	*/
	@Column(columnName="v_cqwsbh",dataType="varchar",dataLength=50,nullAble="Y",comment="呈请文书编号")
	private String V_CQWSBH = "v_cqwsbh";
	/**
	* C_CSJSR 处理措施接收人id
	*/
	@Column(columnName="c_csjsr",dataType="varchar",dataLength=20,nullAble="Y",comment="处理措施接收人id")
	private String C_CSJSR = "c_csjsr";
	/**
	* V_JSRXM 处理措施接收人姓名
	*/
	@Column(columnName="v_jsrxm",dataType="varchar",dataLength=100,nullAble="Y",comment="处理措施接收人姓名")
	private String V_JSRXM = "v_jsrxm";
	/**
	* V_PSRXM 处理措施批示人姓名
	*/
	@Column(columnName="v_psrxm",dataType="varchar",dataLength=100,nullAble="Y",comment="处理措施批示人姓名")
	private String V_PSRXM = "v_psrxm";
	/**
	* T_SDSJ 送达时间
	*/
	@Column(columnName="t_sdsj",dataType="char",dataLength=19,nullAble="Y",comment="送达时间")
	private String T_SDSJ = "t_sdsj";
	/**
	* V_SDRXM 送达人姓名
	*/
	@Column(columnName="v_sdrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="送达人姓名")
	private String V_SDRXM = "v_sdrxm";
	/**
	* C_SJSHBM 市级审核部门id
	*/
	@Column(columnName="c_sjshbm",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审核部门id")
	private String C_SJSHBM = "c_sjshbm";
	/**
	* C_SJSHJG 市级审核结果
	*/
	@Column(columnName="c_sjshjg",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审核结果")
	private String C_SJSHJG = "c_sjshjg";
	/**
	* C_SJSHR 市级审核人id
	*/
	@Column(columnName="c_sjshr",dataType="varchar",dataLength=20,nullAble="Y",comment="市级审核人id")
	private String C_SJSHR = "c_sjshr";
	/**
	* V_SJSHRXM 市级审核人姓名
	*/
	@Column(columnName="v_sjshrxm",dataType="varchar",dataLength=100,nullAble="Y",comment="市级审核人姓名")
	private String V_SJSHRXM = "v_sjshrxm";
	/**
	* T_SJSHSJ 市级审核时间
	*/
	@Column(columnName="t_sjshsj",dataType="char",dataLength=19,nullAble="Y",comment="市级审核时间")
	private String T_SJSHSJ = "t_sjshsj";
	/**
	* V_SJSHYJ 市级审核意见
	*/
	@Column(columnName="v_sjshyj",dataType="varchar",dataLength=500,nullAble="Y",comment="市级审核意见")
	private String V_SJSHYJ = "v_sjshyj";
	/**
	* V_SJSHBMMC 市级审核部门名称
	*/
	@Column(columnName="v_sjshbmmc",dataType="varchar",dataLength=100,nullAble="Y",comment="市级审核部门名称")
	private String V_SJSHBMMC = "v_sjshbmmc";
	/**
	* V_PSBMMC 批示部门名称
	*/
	@Column(columnName="v_psbmmc",dataType="varchar",dataLength=100,nullAble="Y",comment="批示部门名称")
	private String V_PSBMMC = "v_psbmmc";
	/**
	* T_ZDSHSJ zd审核时间
	*/
	@Column(columnName="t_zdshsj",dataType="char",dataLength=19,nullAble="Y",comment="zd审核时间")
	private String T_ZDSHSJ = "t_zdshsj";
	/**
	* C_ZDSHBM zd审核部门id
	*/
	@Column(columnName="c_zdshbm",dataType="varchar",dataLength=20,nullAble="Y",comment="zd审核部门id")
	private String C_ZDSHBM = "c_zdshbm";
	/**
	* V_ZDSHBMMC zd审核部门名称
	*/
	@Column(columnName="v_zdshbmmc",dataType="varchar",dataLength=100,nullAble="Y",comment="zd审核部门名称")
	private String V_ZDSHBMMC = "v_zdshbmmc";
	/**
	* C_ZDSHR zd审核人id
	*/
	@Column(columnName="c_zdshr",dataType="varchar",dataLength=20,nullAble="Y",comment="zd审核人id")
	private String C_ZDSHR = "c_zdshr";
	/**
	* V_ZDSHRXM zd审核人姓名
	*/
	@Column(columnName="v_zdshrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="zd审核人姓名")
	private String V_ZDSHRXM = "v_zdshrxm";
	/**
	* C_ZDSHJG zd审核结果
	*/
	@Column(columnName="c_zdshjg",dataType="varchar",dataLength=20,nullAble="Y",comment="zd审核结果")
	private String C_ZDSHJG = "c_zdshjg";
	/**
	* V_ZDSHYJ zd审核意见
	*/
	@Column(columnName="v_zdshyj",dataType="varchar",dataLength=500,nullAble="Y",comment="zd审核意见")
	private String V_ZDSHYJ = "v_zdshyj";
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
	* V_AJBH 案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* PK_GAJ_AJXX_H 公安案件登记主表_主键
	*/
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="公安案件登记主表_主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* getPk_gaj_ajxx_clcs_b(void) 
	*/
	public String getPk_gaj_ajxx_clcs_b(){
		return this.PK_GAJ_AJXX_CLCS_B;
	}
	/**
	*setPk_gaj_ajxx_clcs_b(java.lang.String)
	*/
	public void setPk_gaj_ajxx_clcs_b(String pk_gaj_ajxx_clcs_b){
		this.PK_GAJ_AJXX_CLCS_B=pk_gaj_ajxx_clcs_b;
	}
	/**
	* getVrowno(void) 
	*/
	public String getVrowno(){
		return this.VROWNO;
	}
	/**
	*setVrowno(java.lang.String)
	*/
	public void setVrowno(String vrowno){
		this.VROWNO=vrowno;
	}
	/**
	* getV_csbh(void) 
	*/
	public String getV_csbh(){
		return this.V_CSBH;
	}
	/**
	*setV_csbh(java.lang.String)
	*/
	public void setV_csbh(String v_csbh){
		this.V_CSBH=v_csbh;
	}
	/**
	* getV_flyj(void) 
	*/
	public String getV_flyj(){
		return this.V_FLYJ;
	}
	/**
	*setV_flyj(java.lang.String)
	*/
	public void setV_flyj(String v_flyj){
		this.V_FLYJ=v_flyj;
	}
	/**
	* getC_bgqczcs(void) 
	*/
	public String getC_bgqczcs(){
		return this.C_BGQCZCS;
	}
	/**
	*setC_bgqczcs(java.lang.String)
	*/
	public void setC_bgqczcs(String c_bgqczcs){
		this.C_BGQCZCS=c_bgqczcs;
	}
	/**
	* getC_cqlb(void) 
	*/
	public String getC_cqlb(){
		return this.C_CQLB;
	}
	/**
	*setC_cqlb(java.lang.String)
	*/
	public void setC_cqlb(String c_cqlb){
		this.C_CQLB=c_cqlb;
	}
	/**
	* getT_qssj(void) 
	*/
	public String getT_qssj(){
		return this.T_QSSJ;
	}
	/**
	*setT_qssj(java.lang.String)
	*/
	public void setT_qssj(String t_qssj){
		this.T_QSSJ=t_qssj;
	}
	/**
	* getT_zzsj(void) 
	*/
	public String getT_zzsj(){
		return this.T_ZZSJ;
	}
	/**
	*setT_zzsj(java.lang.String)
	*/
	public void setT_zzsj(String t_zzsj){
		this.T_ZZSJ=t_zzsj;
	}
	/**
	* getV_cqsx(void) 
	*/
	public String getV_cqsx(){
		return this.V_CQSX;
	}
	/**
	*setV_cqsx(java.lang.String)
	*/
	public void setV_cqsx(String v_cqsx){
		this.V_CQSX=v_cqsx;
	}
	/**
	* getV_ssyj(void) 
	*/
	public String getV_ssyj(){
		return this.V_SSYJ;
	}
	/**
	*setV_ssyj(java.lang.String)
	*/
	public void setV_ssyj(String v_ssyj){
		this.V_SSYJ=v_ssyj;
	}
	/**
	* getC_cbr(void) 
	*/
	public String getC_cbr(){
		return this.C_CBR;
	}
	/**
	*setC_cbr(java.lang.String)
	*/
	public void setC_cbr(String c_cbr){
		this.C_CBR=c_cbr;
	}
	/**
	* getT_cbsj(void) 
	*/
	public String getT_cbsj(){
		return this.T_CBSJ;
	}
	/**
	*setT_cbsj(java.lang.String)
	*/
	public void setT_cbsj(String t_cbsj){
		this.T_CBSJ=t_cbsj;
	}
	/**
	* getV_cbryj(void) 
	*/
	public String getV_cbryj(){
		return this.V_CBRYJ;
	}
	/**
	*setV_cbryj(java.lang.String)
	*/
	public void setV_cbryj(String v_cbryj){
		this.V_CBRYJ=v_cbryj;
	}
	/**
	* getC_cbdwshr(void) 
	*/
	public String getC_cbdwshr(){
		return this.C_CBDWSHR;
	}
	/**
	*setC_cbdwshr(java.lang.String)
	*/
	public void setC_cbdwshr(String c_cbdwshr){
		this.C_CBDWSHR=c_cbdwshr;
	}
	/**
	* getT_cbdwshsj(void) 
	*/
	public String getT_cbdwshsj(){
		return this.T_CBDWSHSJ;
	}
	/**
	*setT_cbdwshsj(java.lang.String)
	*/
	public void setT_cbdwshsj(String t_cbdwshsj){
		this.T_CBDWSHSJ=t_cbdwshsj;
	}
	/**
	* getC_cbdwshjg(void) 
	*/
	public String getC_cbdwshjg(){
		return this.C_CBDWSHJG;
	}
	/**
	*setC_cbdwshjg(java.lang.String)
	*/
	public void setC_cbdwshjg(String c_cbdwshjg){
		this.C_CBDWSHJG=c_cbdwshjg;
	}
	/**
	* getV_cbdwshyj(void) 
	*/
	public String getV_cbdwshyj(){
		return this.V_CBDWSHYJ;
	}
	/**
	*setV_cbdwshyj(java.lang.String)
	*/
	public void setV_cbdwshyj(String v_cbdwshyj){
		this.V_CBDWSHYJ=v_cbdwshyj;
	}
	/**
	* getC_shbm(void) 
	*/
	public String getC_shbm(){
		return this.C_SHBM;
	}
	/**
	*setC_shbm(java.lang.String)
	*/
	public void setC_shbm(String c_shbm){
		this.C_SHBM=c_shbm;
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
	* getV_shyj(void) 
	*/
	public String getV_shyj(){
		return this.V_SHYJ;
	}
	/**
	*setV_shyj(java.lang.String)
	*/
	public void setV_shyj(String v_shyj){
		this.V_SHYJ=v_shyj;
	}
	/**
	* getC_spbm(void) 
	*/
	public String getC_spbm(){
		return this.C_SPBM;
	}
	/**
	*setC_spbm(java.lang.String)
	*/
	public void setC_spbm(String c_spbm){
		this.C_SPBM=c_spbm;
	}
	/**
	* getC_spr(void) 
	*/
	public String getC_spr(){
		return this.C_SPR;
	}
	/**
	*setC_spr(java.lang.String)
	*/
	public void setC_spr(String c_spr){
		this.C_SPR=c_spr;
	}
	/**
	* getT_spsj(void) 
	*/
	public String getT_spsj(){
		return this.T_SPSJ;
	}
	/**
	*setT_spsj(java.lang.String)
	*/
	public void setT_spsj(String t_spsj){
		this.T_SPSJ=t_spsj;
	}
	/**
	* getV_spyj(void) 
	*/
	public String getV_spyj(){
		return this.V_SPYJ;
	}
	/**
	*setV_spyj(java.lang.String)
	*/
	public void setV_spyj(String v_spyj){
		this.V_SPYJ=v_spyj;
	}
	/**
	* getC_spjg(void) 
	*/
	public String getC_spjg(){
		return this.C_SPJG;
	}
	/**
	*setC_spjg(java.lang.String)
	*/
	public void setC_spjg(String c_spjg){
		this.C_SPJG=c_spjg;
	}
	/**
	* getD_rsrq(void) 
	*/
	public String getD_rsrq(){
		return this.D_RSRQ;
	}
	/**
	*setD_rsrq(java.lang.String)
	*/
	public void setD_rsrq(String d_rsrq){
		this.D_RSRQ=d_rsrq;
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
	* getC_qbfs(void) 
	*/
	public String getC_qbfs(){
		return this.C_QBFS;
	}
	/**
	*setC_qbfs(java.lang.String)
	*/
	public void setC_qbfs(String c_qbfs){
		this.C_QBFS=c_qbfs;
	}
	/**
	* getV_bz(void) 
	*/
	public String getV_bz(){
		return this.V_BZ;
	}
	/**
	*setV_bz(java.lang.String)
	*/
	public void setV_bz(String v_bz){
		this.V_BZ=v_bz;
	}
	/**
	* getC_dbfs(void) 
	*/
	public String getC_dbfs(){
		return this.C_DBFS;
	}
	/**
	*setC_dbfs(java.lang.String)
	*/
	public void setC_dbfs(String c_dbfs){
		this.C_DBFS=c_dbfs;
	}
	/**
	* getC_jcjgyj(void) 
	*/
	public String getC_jcjgyj(){
		return this.C_JCJGYJ;
	}
	/**
	*setC_jcjgyj(java.lang.String)
	*/
	public void setC_jcjgyj(String c_jcjgyj){
		this.C_JCJGYJ=c_jcjgyj;
	}
	/**
	* getV_jcjgmc(void) 
	*/
	public String getV_jcjgmc(){
		return this.V_JCJGMC;
	}
	/**
	*setV_jcjgmc(java.lang.String)
	*/
	public void setV_jcjgmc(String v_jcjgmc){
		this.V_JCJGMC=v_jcjgmc;
	}
	/**
	* getT_jcjgpssj(void) 
	*/
	public String getT_jcjgpssj(){
		return this.T_JCJGPSSJ;
	}
	/**
	*setT_jcjgpssj(java.lang.String)
	*/
	public void setT_jcjgpssj(String t_jcjgpssj){
		this.T_JCJGPSSJ=t_jcjgpssj;
	}
	/**
	* getV_cswh(void) 
	*/
	public String getV_cswh(){
		return this.V_CSWH;
	}
	/**
	*setV_cswh(java.lang.String)
	*/
	public void setV_cswh(String v_cswh){
		this.V_CSWH=v_cswh;
	}
	/**
	* getB_sfbczc(void) 
	*/
	public String getB_sfbczc(){
		return this.B_SFBCZC;
	}
	/**
	*setB_sfbczc(java.lang.String)
	*/
	public void setB_sfbczc(String b_sfbczc){
		this.B_SFBCZC=b_sfbczc;
	}
	/**
	* getC_psbm(void) 
	*/
	public String getC_psbm(){
		return this.C_PSBM;
	}
	/**
	*setC_psbm(java.lang.String)
	*/
	public void setC_psbm(String c_psbm){
		this.C_PSBM=c_psbm;
	}
	/**
	* getC_psjg(void) 
	*/
	public String getC_psjg(){
		return this.C_PSJG;
	}
	/**
	*setC_psjg(java.lang.String)
	*/
	public void setC_psjg(String c_psjg){
		this.C_PSJG=c_psjg;
	}
	/**
	* getC_psr(void) 
	*/
	public String getC_psr(){
		return this.C_PSR;
	}
	/**
	*setC_psr(java.lang.String)
	*/
	public void setC_psr(String c_psr){
		this.C_PSR=c_psr;
	}
	/**
	* getT_pssj(void) 
	*/
	public String getT_pssj(){
		return this.T_PSSJ;
	}
	/**
	*setT_pssj(java.lang.String)
	*/
	public void setT_pssj(String t_pssj){
		this.T_PSSJ=t_pssj;
	}
	/**
	* getV_psyj(void) 
	*/
	public String getV_psyj(){
		return this.V_PSYJ;
	}
	/**
	*setV_psyj(java.lang.String)
	*/
	public void setV_psyj(String v_psyj){
		this.V_PSYJ=v_psyj;
	}
	/**
	* getV_fhqk(void) 
	*/
	public String getV_fhqk(){
		return this.V_FHQK;
	}
	/**
	*setV_fhqk(java.lang.String)
	*/
	public void setV_fhqk(String v_fhqk){
		this.V_FHQK=v_fhqk;
	}
	/**
	* getV_fhyj(void) 
	*/
	public String getV_fhyj(){
		return this.V_FHYJ;
	}
	/**
	*setV_fhyj(java.lang.String)
	*/
	public void setV_fhyj(String v_fhyj){
		this.V_FHYJ=v_fhyj;
	}
	/**
	* getV_fhflyj(void) 
	*/
	public String getV_fhflyj(){
		return this.V_FHFLYJ;
	}
	/**
	*setV_fhflyj(java.lang.String)
	*/
	public void setV_fhflyj(String v_fhflyj){
		this.V_FHFLYJ=v_fhflyj;
	}
	/**
	* getV_shfzr(void) 
	*/
	public String getV_shfzr(){
		return this.V_SHFZR;
	}
	/**
	*setV_shfzr(java.lang.String)
	*/
	public void setV_shfzr(String v_shfzr){
		this.V_SHFZR=v_shfzr;
	}
	/**
	* getC_jdqx(void) 
	*/
	public String getC_jdqx(){
		return this.C_JDQX;
	}
	/**
	*setC_jdqx(java.lang.String)
	*/
	public void setC_jdqx(String c_jdqx){
		this.C_JDQX=c_jdqx;
	}
	/**
	* getC_csjdjg(void) 
	*/
	public String getC_csjdjg(){
		return this.C_CSJDJG;
	}
	/**
	*setC_csjdjg(java.lang.String)
	*/
	public void setC_csjdjg(String c_csjdjg){
		this.C_CSJDJG=c_csjdjg;
	}
	/**
	* getT_jdsj(void) 
	*/
	public String getT_jdsj(){
		return this.T_JDSJ;
	}
	/**
	*setT_jdsj(java.lang.String)
	*/
	public void setT_jdsj(String t_jdsj){
		this.T_JDSJ=t_jdsj;
	}
	/**
	* getC_jdjg(void) 
	*/
	public String getC_jdjg(){
		return this.C_JDJG;
	}
	/**
	*setC_jdjg(java.lang.String)
	*/
	public void setC_jdjg(String c_jdjg){
		this.C_JDJG=c_jdjg;
	}
	/**
	* getV_zzjdqx(void) 
	*/
	public String getV_zzjdqx(){
		return this.V_ZZJDQX;
	}
	/**
	*setV_zzjdqx(java.lang.String)
	*/
	public void setV_zzjdqx(String v_zzjdqx){
		this.V_ZZJDQX=v_zzjdqx;
	}
	/**
	* getD_ytlq(void) 
	*/
	public String getD_ytlq(){
		return this.D_YTLQ;
	}
	/**
	*setD_ytlq(java.lang.String)
	*/
	public void setD_ytlq(String d_ytlq){
		this.D_YTLQ=d_ytlq;
	}
	/**
	* getD_xtlq(void) 
	*/
	public String getD_xtlq(){
		return this.D_XTLQ;
	}
	/**
	*setD_xtlq(java.lang.String)
	*/
	public void setD_xtlq(String d_xtlq){
		this.D_XTLQ=d_xtlq;
	}
	/**
	* getC_bmjb(void) 
	*/
	public String getC_bmjb(){
		return this.C_BMJB;
	}
	/**
	*setC_bmjb(java.lang.String)
	*/
	public void setC_bmjb(String c_bmjb){
		this.C_BMJB=c_bmjb;
	}
	/**
	* getV_cbdwmc(void) 
	*/
	public String getV_cbdwmc(){
		return this.V_CBDWMC;
	}
	/**
	*setV_cbdwmc(java.lang.String)
	*/
	public void setV_cbdwmc(String v_cbdwmc){
		this.V_CBDWMC=v_cbdwmc;
	}
	/**
	* getV_cbrxm(void) 
	*/
	public String getV_cbrxm(){
		return this.V_CBRXM;
	}
	/**
	*setV_cbrxm(java.lang.String)
	*/
	public void setV_cbrxm(String v_cbrxm){
		this.V_CBRXM=v_cbrxm;
	}
	/**
	* getV_shbmmc(void) 
	*/
	public String getV_shbmmc(){
		return this.V_SHBMMC;
	}
	/**
	*setV_shbmmc(java.lang.String)
	*/
	public void setV_shbmmc(String v_shbmmc){
		this.V_SHBMMC=v_shbmmc;
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
	* getV_spbmmc(void) 
	*/
	public String getV_spbmmc(){
		return this.V_SPBMMC;
	}
	/**
	*setV_spbmmc(java.lang.String)
	*/
	public void setV_spbmmc(String v_spbmmc){
		this.V_SPBMMC=v_spbmmc;
	}
	/**
	* getV_sprxm(void) 
	*/
	public String getV_sprxm(){
		return this.V_SPRXM;
	}
	/**
	*setV_sprxm(java.lang.String)
	*/
	public void setV_sprxm(String v_sprxm){
		this.V_SPRXM=v_sprxm;
	}
	/**
	* getV_cbdwshrxm(void) 
	*/
	public String getV_cbdwshrxm(){
		return this.V_CBDWSHRXM;
	}
	/**
	*setV_cbdwshrxm(java.lang.String)
	*/
	public void setV_cbdwshrxm(String v_cbdwshrxm){
		this.V_CBDWSHRXM=v_cbdwshrxm;
	}
	/**
	* getV_jdjgmc(void) 
	*/
	public String getV_jdjgmc(){
		return this.V_JDJGMC;
	}
	/**
	*setV_jdjgmc(java.lang.String)
	*/
	public void setV_jdjgmc(String v_jdjgmc){
		this.V_JDJGMC=v_jdjgmc;
	}
	/**
	* getV_wsbs(void) 
	*/
	public String getV_wsbs(){
		return this.V_WSBS;
	}
	/**
	*setV_wsbs(java.lang.String)
	*/
	public void setV_wsbs(String v_wsbs){
		this.V_WSBS=v_wsbs;
	}
	/**
	* getC_cbdw(void) 
	*/
	public String getC_cbdw(){
		return this.C_CBDW;
	}
	/**
	*setC_cbdw(java.lang.String)
	*/
	public void setC_cbdw(String c_cbdw){
		this.C_CBDW=c_cbdw;
	}
	/**
	* getC_dxlb(void) 
	*/
	public String getC_dxlb(){
		return this.C_DXLB;
	}
	/**
	*setC_dxlb(java.lang.String)
	*/
	public void setC_dxlb(String c_dxlb){
		this.C_DXLB=c_dxlb;
	}
	/**
	* getV_bzrxm(void) 
	*/
	public String getV_bzrxm(){
		return this.V_BZRXM;
	}
	/**
	*setV_bzrxm(java.lang.String)
	*/
	public void setV_bzrxm(String v_bzrxm){
		this.V_BZRXM=v_bzrxm;
	}
	/**
	* getN_bzj(void) 
	*/
	public String getN_bzj(){
		return this.N_BZJ;
	}
	/**
	*setN_bzj(java.lang.String)
	*/
	public void setN_bzj(String n_bzj){
		this.N_BZJ=n_bzj;
	}
	/**
	* getC_jcjg(void) 
	*/
	public String getC_jcjg(){
		return this.C_JCJG;
	}
	/**
	*setC_jcjg(java.lang.String)
	*/
	public void setC_jcjg(String c_jcjg){
		this.C_JCJG=c_jcjg;
	}
	/**
	* getC_spjb(void) 
	*/
	public String getC_spjb(){
		return this.C_SPJB;
	}
	/**
	*setC_spjb(java.lang.String)
	*/
	public void setC_spjb(String c_spjb){
		this.C_SPJB=c_spjb;
	}
	/**
	* getV_gljgbh(void) 
	*/
	public String getV_gljgbh(){
		return this.V_GLJGBH;
	}
	/**
	*setV_gljgbh(java.lang.String)
	*/
	public void setV_gljgbh(String v_gljgbh){
		this.V_GLJGBH=v_gljgbh;
	}
	/**
	* getV_dxmc(void) 
	*/
	public String getV_dxmc(){
		return this.V_DXMC;
	}
	/**
	*setV_dxmc(java.lang.String)
	*/
	public void setV_dxmc(String v_dxmc){
		this.V_DXMC=v_dxmc;
	}
	/**
	* getV_dxbh(void) 
	*/
	public String getV_dxbh(){
		return this.V_DXBH;
	}
	/**
	*setV_dxbh(java.lang.String)
	*/
	public void setV_dxbh(String v_dxbh){
		this.V_DXBH=v_dxbh;
	}
	/**
	* getC_dxxb(void) 
	*/
	public String getC_dxxb(){
		return this.C_DXXB;
	}
	/**
	*setC_dxxb(java.lang.String)
	*/
	public void setC_dxxb(String c_dxxb){
		this.C_DXXB=c_dxxb;
	}
	/**
	* getD_dxcsrq(void) 
	*/
	public String getD_dxcsrq(){
		return this.D_DXCSRQ;
	}
	/**
	*setD_dxcsrq(java.lang.String)
	*/
	public void setD_dxcsrq(String d_dxcsrq){
		this.D_DXCSRQ=d_dxcsrq;
	}
	/**
	* getV_dxzjzlhm(void) 
	*/
	public String getV_dxzjzlhm(){
		return this.V_DXZJZLHM;
	}
	/**
	*setV_dxzjzlhm(java.lang.String)
	*/
	public void setV_dxzjzlhm(String v_dxzjzlhm){
		this.V_DXZJZLHM=v_dxzjzlhm;
	}
	/**
	* getV_dxxzz(void) 
	*/
	public String getV_dxxzz(){
		return this.V_DXXZZ;
	}
	/**
	*setV_dxxzz(java.lang.String)
	*/
	public void setV_dxxzz(String v_dxxzz){
		this.V_DXXZZ=v_dxxzz;
	}
	/**
	* getV_dxgzdw(void) 
	*/
	public String getV_dxgzdw(){
		return this.V_DXGZDW;
	}
	/**
	*setV_dxgzdw(java.lang.String)
	*/
	public void setV_dxgzdw(String v_dxgzdw){
		this.V_DXGZDW=v_dxgzdw;
	}
	/**
	* getV_dxlxfs(void) 
	*/
	public String getV_dxlxfs(){
		return this.V_DXLXFS;
	}
	/**
	*setV_dxlxfs(java.lang.String)
	*/
	public void setV_dxlxfs(String v_dxlxfs){
		this.V_DXLXFS=v_dxlxfs;
	}
	/**
	* getV_dxfrdb(void) 
	*/
	public String getV_dxfrdb(){
		return this.V_DXFRDB;
	}
	/**
	*setV_dxfrdb(java.lang.String)
	*/
	public void setV_dxfrdb(String v_dxfrdb){
		this.V_DXFRDB=v_dxfrdb;
	}
	/**
	* getC_dxcyrzl(void) 
	*/
	public String getC_dxcyrzl(){
		return this.C_DXCYRZL;
	}
	/**
	*setC_dxcyrzl(java.lang.String)
	*/
	public void setC_dxcyrzl(String c_dxcyrzl){
		this.C_DXCYRZL=c_dxcyrzl;
	}
	/**
	* getV_cszxdd(void) 
	*/
	public String getV_cszxdd(){
		return this.V_CSZXDD;
	}
	/**
	*setV_cszxdd(java.lang.String)
	*/
	public void setV_cszxdd(String v_cszxdd){
		this.V_CSZXDD=v_cszxdd;
	}
	/**
	* getV_fyjg(void) 
	*/
	public String getV_fyjg(){
		return this.V_FYJG;
	}
	/**
	*setV_fyjg(java.lang.String)
	*/
	public void setV_fyjg(String v_fyjg){
		this.V_FYJG=v_fyjg;
	}
	/**
	* getV_ssjg(void) 
	*/
	public String getV_ssjg(){
		return this.V_SSJG;
	}
	/**
	*setV_ssjg(java.lang.String)
	*/
	public void setV_ssjg(String v_ssjg){
		this.V_SSJG=v_ssjg;
	}
	/**
	* getC_shspbs(void) 
	*/
	public String getC_shspbs(){
		return this.C_SHSPBS;
	}
	/**
	*setC_shspbs(java.lang.String)
	*/
	public void setC_shspbs(String c_shspbs){
		this.C_SHSPBS=c_shspbs;
	}
	/**
	* getV_csyy(void) 
	*/
	public String getV_csyy(){
		return this.V_CSYY;
	}
	/**
	*setV_csyy(java.lang.String)
	*/
	public void setV_csyy(String v_csyy){
		this.V_CSYY=v_csyy;
	}
	/**
	* getV_csdxxx(void) 
	*/
	public String getV_csdxxx(){
		return this.V_CSDXXX;
	}
	/**
	*setV_csdxxx(java.lang.String)
	*/
	public void setV_csdxxx(String v_csdxxx){
		this.V_CSDXXX=v_csdxxx;
	}
	/**
	* getV_cszxr(void) 
	*/
	public String getV_cszxr(){
		return this.V_CSZXR;
	}
	/**
	*setV_cszxr(java.lang.String)
	*/
	public void setV_cszxr(String v_cszxr){
		this.V_CSZXR=v_cszxr;
	}
	/**
	* getV_hxcsbs(void) 
	*/
	public String getV_hxcsbs(){
		return this.V_HXCSBS;
	}
	/**
	*setV_hxcsbs(java.lang.String)
	*/
	public void setV_hxcsbs(String v_hxcsbs){
		this.V_HXCSBS=v_hxcsbs;
	}
	/**
	* getV_bcxx(void) 
	*/
	public String getV_bcxx(){
		return this.V_BCXX;
	}
	/**
	*setV_bcxx(java.lang.String)
	*/
	public void setV_bcxx(String v_bcxx){
		this.V_BCXX=v_bcxx;
	}
	/**
	* getV_cszxdwmc(void) 
	*/
	public String getV_cszxdwmc(){
		return this.V_CSZXDWMC;
	}
	/**
	*setV_cszxdwmc(java.lang.String)
	*/
	public void setV_cszxdwmc(String v_cszxdwmc){
		this.V_CSZXDWMC=v_cszxdwmc;
	}
	/**
	* getV_csajlbmc(void) 
	*/
	public String getV_csajlbmc(){
		return this.V_CSAJLBMC;
	}
	/**
	*setV_csajlbmc(java.lang.String)
	*/
	public void setV_csajlbmc(String v_csajlbmc){
		this.V_CSAJLBMC=v_csajlbmc;
	}
	/**
	* getV_jzcqbs(void) 
	*/
	public String getV_jzcqbs(){
		return this.V_JZCQBS;
	}
	/**
	*setV_jzcqbs(java.lang.String)
	*/
	public void setV_jzcqbs(String v_jzcqbs){
		this.V_JZCQBS=v_jzcqbs;
	}
	/**
	* getV_cqwsbh(void) 
	*/
	public String getV_cqwsbh(){
		return this.V_CQWSBH;
	}
	/**
	*setV_cqwsbh(java.lang.String)
	*/
	public void setV_cqwsbh(String v_cqwsbh){
		this.V_CQWSBH=v_cqwsbh;
	}
	/**
	* getC_csjsr(void) 
	*/
	public String getC_csjsr(){
		return this.C_CSJSR;
	}
	/**
	*setC_csjsr(java.lang.String)
	*/
	public void setC_csjsr(String c_csjsr){
		this.C_CSJSR=c_csjsr;
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
	* getV_psrxm(void) 
	*/
	public String getV_psrxm(){
		return this.V_PSRXM;
	}
	/**
	*setV_psrxm(java.lang.String)
	*/
	public void setV_psrxm(String v_psrxm){
		this.V_PSRXM=v_psrxm;
	}
	/**
	* getT_sdsj(void) 
	*/
	public String getT_sdsj(){
		return this.T_SDSJ;
	}
	/**
	*setT_sdsj(java.lang.String)
	*/
	public void setT_sdsj(String t_sdsj){
		this.T_SDSJ=t_sdsj;
	}
	/**
	* getV_sdrxm(void) 
	*/
	public String getV_sdrxm(){
		return this.V_SDRXM;
	}
	/**
	*setV_sdrxm(java.lang.String)
	*/
	public void setV_sdrxm(String v_sdrxm){
		this.V_SDRXM=v_sdrxm;
	}
	/**
	* getC_sjshbm(void) 
	*/
	public String getC_sjshbm(){
		return this.C_SJSHBM;
	}
	/**
	*setC_sjshbm(java.lang.String)
	*/
	public void setC_sjshbm(String c_sjshbm){
		this.C_SJSHBM=c_sjshbm;
	}
	/**
	* getC_sjshjg(void) 
	*/
	public String getC_sjshjg(){
		return this.C_SJSHJG;
	}
	/**
	*setC_sjshjg(java.lang.String)
	*/
	public void setC_sjshjg(String c_sjshjg){
		this.C_SJSHJG=c_sjshjg;
	}
	/**
	* getC_sjshr(void) 
	*/
	public String getC_sjshr(){
		return this.C_SJSHR;
	}
	/**
	*setC_sjshr(java.lang.String)
	*/
	public void setC_sjshr(String c_sjshr){
		this.C_SJSHR=c_sjshr;
	}
	/**
	* getV_sjshrxm(void) 
	*/
	public String getV_sjshrxm(){
		return this.V_SJSHRXM;
	}
	/**
	*setV_sjshrxm(java.lang.String)
	*/
	public void setV_sjshrxm(String v_sjshrxm){
		this.V_SJSHRXM=v_sjshrxm;
	}
	/**
	* getT_sjshsj(void) 
	*/
	public String getT_sjshsj(){
		return this.T_SJSHSJ;
	}
	/**
	*setT_sjshsj(java.lang.String)
	*/
	public void setT_sjshsj(String t_sjshsj){
		this.T_SJSHSJ=t_sjshsj;
	}
	/**
	* getV_sjshyj(void) 
	*/
	public String getV_sjshyj(){
		return this.V_SJSHYJ;
	}
	/**
	*setV_sjshyj(java.lang.String)
	*/
	public void setV_sjshyj(String v_sjshyj){
		this.V_SJSHYJ=v_sjshyj;
	}
	/**
	* getV_sjshbmmc(void) 
	*/
	public String getV_sjshbmmc(){
		return this.V_SJSHBMMC;
	}
	/**
	*setV_sjshbmmc(java.lang.String)
	*/
	public void setV_sjshbmmc(String v_sjshbmmc){
		this.V_SJSHBMMC=v_sjshbmmc;
	}
	/**
	* getV_psbmmc(void) 
	*/
	public String getV_psbmmc(){
		return this.V_PSBMMC;
	}
	/**
	*setV_psbmmc(java.lang.String)
	*/
	public void setV_psbmmc(String v_psbmmc){
		this.V_PSBMMC=v_psbmmc;
	}
	/**
	* getT_zdshsj(void) 
	*/
	public String getT_zdshsj(){
		return this.T_ZDSHSJ;
	}
	/**
	*setT_zdshsj(java.lang.String)
	*/
	public void setT_zdshsj(String t_zdshsj){
		this.T_ZDSHSJ=t_zdshsj;
	}
	/**
	* getC_zdshbm(void) 
	*/
	public String getC_zdshbm(){
		return this.C_ZDSHBM;
	}
	/**
	*setC_zdshbm(java.lang.String)
	*/
	public void setC_zdshbm(String c_zdshbm){
		this.C_ZDSHBM=c_zdshbm;
	}
	/**
	* getV_zdshbmmc(void) 
	*/
	public String getV_zdshbmmc(){
		return this.V_ZDSHBMMC;
	}
	/**
	*setV_zdshbmmc(java.lang.String)
	*/
	public void setV_zdshbmmc(String v_zdshbmmc){
		this.V_ZDSHBMMC=v_zdshbmmc;
	}
	/**
	* getC_zdshr(void) 
	*/
	public String getC_zdshr(){
		return this.C_ZDSHR;
	}
	/**
	*setC_zdshr(java.lang.String)
	*/
	public void setC_zdshr(String c_zdshr){
		this.C_ZDSHR=c_zdshr;
	}
	/**
	* getV_zdshrxm(void) 
	*/
	public String getV_zdshrxm(){
		return this.V_ZDSHRXM;
	}
	/**
	*setV_zdshrxm(java.lang.String)
	*/
	public void setV_zdshrxm(String v_zdshrxm){
		this.V_ZDSHRXM=v_zdshrxm;
	}
	/**
	* getC_zdshjg(void) 
	*/
	public String getC_zdshjg(){
		return this.C_ZDSHJG;
	}
	/**
	*setC_zdshjg(java.lang.String)
	*/
	public void setC_zdshjg(String c_zdshjg){
		this.C_ZDSHJG=c_zdshjg;
	}
	/**
	* getV_zdshyj(void) 
	*/
	public String getV_zdshyj(){
		return this.V_ZDSHYJ;
	}
	/**
	*setV_zdshyj(java.lang.String)
	*/
	public void setV_zdshyj(String v_zdshyj){
		this.V_ZDSHYJ=v_zdshyj;
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
	* getPk_gaj_ajxx_h(void) 
	*/
	public String getPk_gaj_ajxx_h(){
		return this.PK_GAJ_AJXX_H;
	}
	/**
	*setPk_gaj_ajxx_h(java.lang.String)
	*/
	public void setPk_gaj_ajxx_h(String pk_gaj_ajxx_h){
		this.PK_GAJ_AJXX_H=pk_gaj_ajxx_h;
	}


}