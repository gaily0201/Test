package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasgshVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gs_h")
public class CrpasgshVO {
	/**
	* BILLNO 
	*/
	@Column(columnName="billno",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String BILLNO = "billno";
	/**
	* BUSITYPE 
	*/
	@Column(columnName="busitype",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String BUSITYPE = "busitype";
	/**
	* BILLTYPE 
	*/
	@Column(columnName="billtype",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String BILLTYPE = "billtype";
	/**
	* BILLMAKER 
	*/
	@Column(columnName="billmaker",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String BILLMAKER = "billmaker";
	/**
	* BILLDATE 
	*/
	@Column(columnName="billdate",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String BILLDATE = "billdate";
	/**
	* APPROVER 
	*/
	@Column(columnName="approver",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String APPROVER = "approver";
	/**
	* APPROVESTATUS 
	*/
	@Column(columnName="approvestatus",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String APPROVESTATUS = "approvestatus";
	/**
	* APPROVENOTE 
	*/
	@Column(columnName="approvenote",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String APPROVENOTE = "approvenote";
	/**
	* APPROVEDATE 
	*/
	@Column(columnName="approvedate",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String APPROVEDATE = "approvedate";
	/**
	* SRCBILLTYPE 
	*/
	@Column(columnName="srcbilltype",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String SRCBILLTYPE = "srcbilltype";
	/**
	* SRCBILLID 
	*/
	@Column(columnName="srcbillid",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String SRCBILLID = "srcbillid";
	/**
	* CREATOR 
	*/
	@Column(columnName="creator",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String CREATOR = "creator";
	/**
	* CREATIONTIME 
	*/
	@Column(columnName="creationtime",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String CREATIONTIME = "creationtime";
	/**
	* MODIFIER 
	*/
	@Column(columnName="modifier",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String MODIFIER = "modifier";
	/**
	* MODIFIEDTIME 
	*/
	@Column(columnName="modifiedtime",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String MODIFIEDTIME = "modifiedtime";
	/**
	* PK_ORG 
	*/
	@Column(columnName="pk_org",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_ORG = "pk_org";
	/**
	* PK_ORG_V 
	*/
	@Column(columnName="pk_org_v",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String PK_ORG_V = "pk_org_v";
	/**
	* PK_GROUP 
	*/
	@Column(columnName="pk_group",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_GROUP = "pk_group";
	/**
	* TRANSTYPEPK 
	*/
	@Column(columnName="transtypepk",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String TRANSTYPEPK = "transtypepk";
	/**
	* EMENDENUM 
	*/
	@Column(columnName="emendenum",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String EMENDENUM = "emendenum";
	/**
	* BILLVERSIONPK 
	*/
	@Column(columnName="billversionpk",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String BILLVERSIONPK = "billversionpk";
	/**
	* PK_GS_H 
	*/
	@Column(columnName="pk_gs_h",dataType="CHAR",dataLength=20,nullAble="N",comment="")
	private String PK_GS_H = "pk_gs_h";
	/**
	* V_PTAJLX 
	*/
	@Column(columnName="v_ptajlx",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_PTAJLX = "v_ptajlx";
	/**
	* V_PTAJZJ 
	*/
	@Column(columnName="v_ptajzj",dataType="CHAR",dataLength=20,nullAble="Y",comment="")
	private String V_PTAJZJ = "v_ptajzj";
	/**
	* V_JCY_QSSH 
	*/
	@Column(columnName="v_jcy_qssh",dataType="VARCHAR2",dataLength=100,nullAble="Y",comment="")
	private String V_JCY_QSSH = "v_jcy_qssh";
	/**
	* V_JCY_AJMC 
	*/
	@Column(columnName="v_jcy_ajmc",dataType="VARCHAR2",dataLength=200,nullAble="Y",comment="")
	private String V_JCY_AJMC = "v_jcy_ajmc";
	/**
	* V_JCY_CBR 
	*/
	@Column(columnName="v_jcy_cbr",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_JCY_CBR = "v_jcy_cbr";
	/**
	* V_GAJ_ZHJG 
	*/
	@Column(columnName="v_gaj_zhjg",dataType="VARCHAR2",dataLength=2000,nullAble="Y",comment="")
	private String V_GAJ_ZHJG = "v_gaj_zhjg";
	/**
	* V_GAJ_ZJBF 
	*/
	@Column(columnName="v_gaj_zjbf",dataType="VARCHAR2",dataLength=2000,nullAble="Y",comment="")
	private String V_GAJ_ZJBF = "v_gaj_zjbf";
	/**
	* V_GAJ_AJBH 
	*/
	@Column(columnName="v_gaj_ajbh",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_GAJ_AJBH = "v_gaj_ajbh";
	/**
	* T_FY_SLSJ 
	*/
	@Column(columnName="t_fy_slsj",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String T_FY_SLSJ = "t_fy_slsj";
	/**
	* B_FY_SFSL 
	*/
	@Column(columnName="b_fy_sfsl",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String B_FY_SFSL = "b_fy_sfsl";
	/**
	* V_FY_AJBS 
	*/
	@Column(columnName="v_fy_ajbs",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_AJBS = "v_fy_ajbs";
	/**
	* V_FY_AH 
	*/
	@Column(columnName="v_fy_ah",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_AH = "v_fy_ah";
	/**
	* C_FY_AJLB 
	*/
	@Column(columnName="c_fy_ajlb",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_AJLB = "c_fy_ajlb";
	/**
	* C_FY_SATJ 
	*/
	@Column(columnName="c_fy_satj",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_SATJ = "c_fy_satj";
	/**
	* C_FY_SSXZ 
	*/
	@Column(columnName="c_fy_ssxz",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_SSXZ = "c_fy_ssxz";
	/**
	* C_FY_AJLY 
	*/
	@Column(columnName="c_fy_ajly",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_AJLY = "c_fy_ajly";
	/**
	* D_FY_SDSZRQ 
	*/
	@Column(columnName="d_fy_sdszrq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_SDSZRQ = "d_fy_sdszrq";
	/**
	* C_FY_QSZZM 
	*/
	@Column(columnName="c_fy_qszzm",dataType="CHAR",dataLength=20,nullAble="Y",comment="")
	private String C_FY_QSZZM = "c_fy_qszzm";
	/**
	* V_FY_SAJZCL 
	*/
	@Column(columnName="v_fy_sajzcl",dataType="VARCHAR2",dataLength=200,nullAble="Y",comment="")
	private String V_FY_SAJZCL = "v_fy_sajzcl";
	/**
	* V_FY_DJRXM 
	*/
	@Column(columnName="v_fy_djrxm",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_DJRXM = "v_fy_djrxm";
	/**
	* V_FY_SCRXM 
	*/
	@Column(columnName="v_fy_scrxm",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_SCRXM = "v_fy_scrxm";
	/**
	* D_FY_SCRQ 
	*/
	@Column(columnName="d_fy_scrq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_SCRQ = "d_fy_scrq";
	/**
	* C_FY_SCYJ 
	*/
	@Column(columnName="c_fy_scyj",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_SCYJ = "c_fy_scyj";
	/**
	* V_FY_SPRXM 
	*/
	@Column(columnName="v_fy_sprxm",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_SPRXM = "v_fy_sprxm";
	/**
	* D_FY_LASPRQ 
	*/
	@Column(columnName="d_fy_lasprq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_LASPRQ = "d_fy_lasprq";
	/**
	* C_FY_SPYJ 
	*/
	@Column(columnName="c_fy_spyj",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_SPYJ = "c_fy_spyj";
	/**
	* D_FY_LARQ 
	*/
	@Column(columnName="d_fy_larq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_LARQ = "d_fy_larq";
	/**
	* V_FY_LABMMC 
	*/
	@Column(columnName="v_fy_labmmc",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_LABMMC = "v_fy_labmmc";
	/**
	* V_FY_CBBMMC 
	*/
	@Column(columnName="v_fy_cbbmmc",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_CBBMMC = "v_fy_cbbmmc";
	/**
	* V_FY_CBRXM 
	*/
	@Column(columnName="v_fy_cbrxm",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_CBRXM = "v_fy_cbrxm";
	/**
	* C_FY_SYCX 
	*/
	@Column(columnName="c_fy_sycx",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_SYCX = "c_fy_sycx";
	/**
	* B_BGRSFTYRZCX 
	*/
	@Column(columnName="b_bgrsftyrzcx",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String B_BGRSFTYRZCX = "b_bgrsftyrzcx";
	/**
	* C_FY_GXYJ 
	*/
	@Column(columnName="c_fy_gxyj",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_GXYJ = "c_fy_gxyj";
	/**
	* V_TQZJJH 
	*/
	@Column(columnName="v_tqzjjh",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String V_TQZJJH = "v_tqzjjh";
	/**
	* V_FYSJDQZJ 
	*/
	@Column(columnName="v_fysjdqzj",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String V_FYSJDQZJ = "v_fysjdqzj";
	/**
	* C_FY_DYSJ 
	*/
	@Column(columnName="c_fy_dysj",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_DYSJ = "c_fy_dysj";
	/**
	* C_FY_AJSJ 
	*/
	@Column(columnName="c_fy_ajsj",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_AJSJ = "c_fy_ajsj";
	/**
	* V_AJDXYY 
	*/
	@Column(columnName="v_ajdxyy",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String V_AJDXYY = "v_ajdxyy";
	/**
	* B_FY_SFGTFZ 
	*/
	@Column(columnName="b_fy_sfgtfz",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String B_FY_SFGTFZ = "b_fy_sfgtfz";
	/**
	* C_FY_TABGRBZAYY 
	*/
	@Column(columnName="c_fy_tabgrbzayy",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_TABGRBZAYY = "c_fy_tabgrbzayy";
	/**
	* V_AJJZ 
	*/
	@Column(columnName="v_ajjz",dataType="VARCHAR2",dataLength=2000,nullAble="Y",comment="")
	private String V_AJJZ = "v_ajjz";
	/**
	* D_FY_SXQSRQ 
	*/
	@Column(columnName="d_fy_sxqsrq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_SXQSRQ = "d_fy_sxqsrq";
	/**
	* D_FY_SXJMRQ 
	*/
	@Column(columnName="d_fy_sxjmrq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_SXJMRQ = "d_fy_sxjmrq";
	/**
	* D_FY_LAQXJMRQ 
	*/
	@Column(columnName="d_fy_laqxjmrq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_LAQXJMRQ = "d_fy_laqxjmrq";
	/**
	* D_FY_SLJSRQ 
	*/
	@Column(columnName="d_fy_sljsrq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_FY_SLJSRQ = "d_fy_sljsrq";
	/**
	* N_FY_FDLASX 
	*/
	@Column(columnName="n_fy_fdlasx",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_FY_FDLASX = "n_fy_fdlasx";
	/**
	* N_FY_SJLATS 
	*/
	@Column(columnName="n_fy_sjlats",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_FY_SJLATS = "n_fy_sjlats";
	/**
	* N_FY_LACQTS 
	*/
	@Column(columnName="n_fy_lacqts",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_FY_LACQTS = "n_fy_lacqts";
	/**
	* N_FY_FDSXTS 
	*/
	@Column(columnName="n_fy_fdsxts",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_FY_FDSXTS = "n_fy_fdsxts";
	/**
	* N_FY_SJSLTS 
	*/
	@Column(columnName="n_fy_sjslts",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_FY_SJSLTS = "n_fy_sjslts";
	/**
	* N_FY_CSXTS 
	*/
	@Column(columnName="n_fy_csxts",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_FY_CSXTS = "n_fy_csxts";
	/**
	* N_FY_CSXBS 
	*/
	@Column(columnName="n_fy_csxbs",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_FY_CSXBS = "n_fy_csxbs";
	/**
	* V_FY_CSXYY 
	*/
	@Column(columnName="v_fy_csxyy",dataType="VARCHAR2",dataLength=200,nullAble="Y",comment="")
	private String V_FY_CSXYY = "v_fy_csxyy";
	/**
	* C_JAAY 
	*/
	@Column(columnName="c_jaay",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_JAAY = "c_jaay";
	/**
	* C_FY_JAFS 
	*/
	@Column(columnName="c_fy_jafs",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_FY_JAFS = "c_fy_jafs";
	/**
	* C_BYSLYY 
	*/
	@Column(columnName="c_byslyy",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_BYSLYY = "c_byslyy";
	/**
	* C_BHZSYY 
	*/
	@Column(columnName="c_bhzsyy",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_BHZSYY = "c_bhzsyy";
	/**
	* C_CSLX 
	*/
	@Column(columnName="c_cslx",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_CSLX = "c_cslx";
	/**
	* V_CSCLSY 
	*/
	@Column(columnName="v_csclsy",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String V_CSCLSY = "v_csclsy";
	/**
	* V_JASY 
	*/
	@Column(columnName="v_jasy",dataType="VARCHAR2",dataLength=500,nullAble="Y",comment="")
	private String V_JASY = "v_jasy";
	/**
	* D_SXRQ 
	*/
	@Column(columnName="d_sxrq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_SXRQ = "d_sxrq";
	/**
	* N_PJWHSYJE 
	*/
	@Column(columnName="n_pjwhsyje",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_PJWHSYJE = "n_pjwhsyje";
	/**
	* D_JARQ 
	*/
	@Column(columnName="d_jarq",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String D_JARQ = "d_jarq";
	/**
	* TRANSTYPE 
	*/
	@Column(columnName="transtype",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String TRANSTYPE = "transtype";
	/**
	* V_PTBH 
	*/
	@Column(columnName="v_ptbh",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_PTBH = "v_ptbh";
	/**
	* C_XTFQDW 
	*/
	@Column(columnName="c_xtfqdw",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_XTFQDW = "c_xtfqdw";
	/**
	* C_XTFQR 
	*/
	@Column(columnName="c_xtfqr",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_XTFQR = "c_xtfqr";
	/**
	* T_XTFQSJ 
	*/
	@Column(columnName="t_xtfqsj",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String T_XTFQSJ = "t_xtfqsj";
	/**
	* C_XTJSDW 
	*/
	@Column(columnName="c_xtjsdw",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_XTJSDW = "c_xtjsdw";
	/**
	* C_XTJSR 
	*/
	@Column(columnName="c_xtjsr",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_XTJSR = "c_xtjsr";
	/**
	* T_XTJSSJ 
	*/
	@Column(columnName="t_xtjssj",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String T_XTJSSJ = "t_xtjssj";
	/**
	* T_XTWCSJ 
	*/
	@Column(columnName="t_xtwcsj",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String T_XTWCSJ = "t_xtwcsj";
	/**
	* C_XTZT 
	*/
	@Column(columnName="c_xtzt",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_XTZT = "c_xtzt";
	/**
	* V_JCY_AJBS 
	*/
	@Column(columnName="v_jcy_ajbs",dataType="VARCHAR2",dataLength=200,nullAble="Y",comment="")
	private String V_JCY_AJBS = "v_jcy_ajbs";
	/**
	* C_JCY_YSDW 
	*/
	@Column(columnName="c_jcy_ysdw",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_JCY_YSDW = "c_jcy_ysdw";
	/**
	* V_JCY_YSDWMC 
	*/
	@Column(columnName="v_jcy_ysdwmc",dataType="VARCHAR2",dataLength=100,nullAble="Y",comment="")
	private String V_JCY_YSDWMC = "v_jcy_ysdwmc";
	/**
	* T_JCY_YSSJ 
	*/
	@Column(columnName="t_jcy_yssj",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String T_JCY_YSSJ = "t_jcy_yssj";
	/**
	* V_JCY_ZAY 
	*/
	@Column(columnName="v_jcy_zay",dataType="VARCHAR2",dataLength=500,nullAble="Y",comment="")
	private String V_JCY_ZAY = "v_jcy_zay";
	/**
	* V_GAJ_GLBH 
	*/
	@Column(columnName="v_gaj_glbh",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_GAJ_GLBH = "v_gaj_glbh";
	/**
	* V_BCZCTG 
	*/
	@Column(columnName="v_bczctg",dataType="VARCHAR2",dataLength=2000,nullAble="Y",comment="")
	private String V_BCZCTG = "v_bczctg";
	/**
	* C_BCZCDW 
	*/
	@Column(columnName="c_bczcdw",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_BCZCDW = "c_bczcdw";
	/**
	* N_BCZCCS 
	*/
	@Column(columnName="n_bczccs",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String N_BCZCCS = "n_bczccs";
	/**
	* V_BCZCFKXX 
	*/
	@Column(columnName="v_bczcfkxx",dataType="VARCHAR2",dataLength=2000,nullAble="Y",comment="")
	private String V_BCZCFKXX = "v_bczcfkxx";
	/**
	* T_BCZCWCSJ 
	*/
	@Column(columnName="t_bczcwcsj",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String T_BCZCWCSJ = "t_bczcwcsj";
	/**
	* C_JCY_ZAYID 
	*/
	@Column(columnName="c_jcy_zayid",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_JCY_ZAYID = "c_jcy_zayid";
	/**
	* V_FY_QSZZMID 
	*/
	@Column(columnName="v_fy_qszzmid",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_FY_QSZZMID = "v_fy_qszzmid";
	/**
	* B_SFTHBCZC 
	*/
	@Column(columnName="b_sfthbczc",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String B_SFTHBCZC = "b_sfthbczc";
	/**
	* B_SFTHBCZC2 
	*/
	@Column(columnName="b_sfthbczc2",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String B_SFTHBCZC2 = "b_sfthbczc2";
	/**
	* V_BCZCTG2 
	*/
	@Column(columnName="v_bczctg2",dataType="VARCHAR2",dataLength=2000,nullAble="Y",comment="")
	private String V_BCZCTG2 = "v_bczctg2";
	/**
	* C_BCZCDW2 
	*/
	@Column(columnName="c_bczcdw2",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String C_BCZCDW2 = "c_bczcdw2";
	/**
	* V_BCZCFKXX2 
	*/
	@Column(columnName="v_bczcfkxx2",dataType="VARCHAR2",dataLength=200,nullAble="Y",comment="")
	private String V_BCZCFKXX2 = "v_bczcfkxx2";
	/**
	* T_BCZCWCSJ2 
	*/
	@Column(columnName="t_bczcwcsj2",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String T_BCZCWCSJ2 = "t_bczcwcsj2";
	/**
	* V_JAAYMC 
	*/
	@Column(columnName="v_jaaymc",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String V_JAAYMC = "v_jaaymc";
	/**
	* TS 
	*/
	@Column(columnName="ts",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String TS = "ts";
	/**
	* DR 
	*/
	@Column(columnName="dr",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String DR = "dr";
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
	* getPk_gs_h(void) 
	*/
	public String getPk_gs_h(){
		return this.PK_GS_H;
	}
	/**
	*setPk_gs_h(java.lang.String)
	*/
	public void setPk_gs_h(String pk_gs_h){
		this.PK_GS_H=pk_gs_h;
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
	* getV_fy_csxyy(void) 
	*/
	public String getV_fy_csxyy(){
		return this.V_FY_CSXYY;
	}
	/**
	*setV_fy_csxyy(java.lang.String)
	*/
	public void setV_fy_csxyy(String v_fy_csxyy){
		this.V_FY_CSXYY=v_fy_csxyy;
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
	* getV_jcy_ysdwmc(void) 
	*/
	public String getV_jcy_ysdwmc(){
		return this.V_JCY_YSDWMC;
	}
	/**
	*setV_jcy_ysdwmc(java.lang.String)
	*/
	public void setV_jcy_ysdwmc(String v_jcy_ysdwmc){
		this.V_JCY_YSDWMC=v_jcy_ysdwmc;
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
	* getV_bczctg(void) 
	*/
	public String getV_bczctg(){
		return this.V_BCZCTG;
	}
	/**
	*setV_bczctg(java.lang.String)
	*/
	public void setV_bczctg(String v_bczctg){
		this.V_BCZCTG=v_bczctg;
	}
	/**
	* getC_bczcdw(void) 
	*/
	public String getC_bczcdw(){
		return this.C_BCZCDW;
	}
	/**
	*setC_bczcdw(java.lang.String)
	*/
	public void setC_bczcdw(String c_bczcdw){
		this.C_BCZCDW=c_bczcdw;
	}
	/**
	* getN_bczccs(void) 
	*/
	public String getN_bczccs(){
		return this.N_BCZCCS;
	}
	/**
	*setN_bczccs(java.lang.String)
	*/
	public void setN_bczccs(String n_bczccs){
		this.N_BCZCCS=n_bczccs;
	}
	/**
	* getV_bczcfkxx(void) 
	*/
	public String getV_bczcfkxx(){
		return this.V_BCZCFKXX;
	}
	/**
	*setV_bczcfkxx(java.lang.String)
	*/
	public void setV_bczcfkxx(String v_bczcfkxx){
		this.V_BCZCFKXX=v_bczcfkxx;
	}
	/**
	* getT_bczcwcsj(void) 
	*/
	public String getT_bczcwcsj(){
		return this.T_BCZCWCSJ;
	}
	/**
	*setT_bczcwcsj(java.lang.String)
	*/
	public void setT_bczcwcsj(String t_bczcwcsj){
		this.T_BCZCWCSJ=t_bczcwcsj;
	}
	/**
	* getC_jcy_zayid(void) 
	*/
	public String getC_jcy_zayid(){
		return this.C_JCY_ZAYID;
	}
	/**
	*setC_jcy_zayid(java.lang.String)
	*/
	public void setC_jcy_zayid(String c_jcy_zayid){
		this.C_JCY_ZAYID=c_jcy_zayid;
	}
	/**
	* getV_fy_qszzmid(void) 
	*/
	public String getV_fy_qszzmid(){
		return this.V_FY_QSZZMID;
	}
	/**
	*setV_fy_qszzmid(java.lang.String)
	*/
	public void setV_fy_qszzmid(String v_fy_qszzmid){
		this.V_FY_QSZZMID=v_fy_qszzmid;
	}
	/**
	* getB_sfthbczc(void) 
	*/
	public String getB_sfthbczc(){
		return this.B_SFTHBCZC;
	}
	/**
	*setB_sfthbczc(java.lang.String)
	*/
	public void setB_sfthbczc(String b_sfthbczc){
		this.B_SFTHBCZC=b_sfthbczc;
	}
	/**
	* getB_sfthbczc2(void) 
	*/
	public String getB_sfthbczc2(){
		return this.B_SFTHBCZC2;
	}
	/**
	*setB_sfthbczc2(java.lang.String)
	*/
	public void setB_sfthbczc2(String b_sfthbczc2){
		this.B_SFTHBCZC2=b_sfthbczc2;
	}
	/**
	* getV_bczctg2(void) 
	*/
	public String getV_bczctg2(){
		return this.V_BCZCTG2;
	}
	/**
	*setV_bczctg2(java.lang.String)
	*/
	public void setV_bczctg2(String v_bczctg2){
		this.V_BCZCTG2=v_bczctg2;
	}
	/**
	* getC_bczcdw2(void) 
	*/
	public String getC_bczcdw2(){
		return this.C_BCZCDW2;
	}
	/**
	*setC_bczcdw2(java.lang.String)
	*/
	public void setC_bczcdw2(String c_bczcdw2){
		this.C_BCZCDW2=c_bczcdw2;
	}
	/**
	* getV_bczcfkxx2(void) 
	*/
	public String getV_bczcfkxx2(){
		return this.V_BCZCFKXX2;
	}
	/**
	*setV_bczcfkxx2(java.lang.String)
	*/
	public void setV_bczcfkxx2(String v_bczcfkxx2){
		this.V_BCZCFKXX2=v_bczcfkxx2;
	}
	/**
	* getT_bczcwcsj2(void) 
	*/
	public String getT_bczcwcsj2(){
		return this.T_BCZCWCSJ2;
	}
	/**
	*setT_bczcwcsj2(java.lang.String)
	*/
	public void setT_bczcwcsj2(String t_bczcwcsj2){
		this.T_BCZCWCSJ2=t_bczcwcsj2;
	}
	/**
	* getV_jaaymc(void) 
	*/
	public String getV_jaaymc(){
		return this.V_JAAYMC;
	}
	/**
	*setV_jaaymc(java.lang.String)
	*/
	public void setV_jaaymc(String v_jaaymc){
		this.V_JAAYMC=v_jaaymc;
	}
	/**
	* getTs(void) 
	*/
	public String getTs(){
		return this.TS;
	}
	/**
	*setTs(java.lang.String)
	*/
	public void setTs(String ts){
		this.TS=ts;
	}
	/**
	* getDr(void) 
	*/
	public String getDr(){
		return this.DR;
	}
	/**
	*setDr(java.lang.String)
	*/
	public void setDr(String dr){
		this.DR=dr;
	}


}