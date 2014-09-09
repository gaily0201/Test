package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;
import cn.gaily.orm.javabean.IBean;

/**
 * <p>Title: CrpasGajAjxxHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_h")
public class CrpasGajAjxxHVO implements IBean{
	/**
	* C_GXFG 管辖分工
	*/
	@Column(columnName="c_gxfg",dataType="varchar",dataLength=20,nullAble="Y",comment="管辖分工")
	private String C_GXFG = "c_gxfg";
	/**
	* C_FZZTLX 犯罪主体类型
	*/
	@Column(columnName="c_fzztlx",dataType="varchar",dataLength=20,nullAble="Y",comment="犯罪主体类型")
	private String C_FZZTLX = "c_fzztlx";
	/**
	* D_PARQ 破案日期
	*/
	@Column(columnName="d_parq",dataType="char",dataLength=19,nullAble="Y",comment="破案日期")
	private String D_PARQ = "d_parq";
	/**
	* C_PAFS 破案方式
	*/
	@Column(columnName="c_pafs",dataType="varchar",dataLength=20,nullAble="Y",comment="破案方式")
	private String C_PAFS = "c_pafs";
	/**
	* C_PALX 破案类型
	*/
	@Column(columnName="c_palx",dataType="varchar",dataLength=20,nullAble="Y",comment="破案类型")
	private String C_PALX = "c_palx";
	/**
	* C_PADW 破案单位id
	*/
	@Column(columnName="c_padw",dataType="varchar",dataLength=20,nullAble="Y",comment="破案单位id")
	private String C_PADW = "c_padw";
	/**
	* V_PADWMC 破案单位名称
	*/
	@Column(columnName="v_padwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="破案单位名称")
	private String V_PADWMC = "v_padwmc";
	/**
	* T_PAPZSJ 破案批准时间
	*/
	@Column(columnName="t_papzsj",dataType="char",dataLength=19,nullAble="Y",comment="破案批准时间")
	private String T_PAPZSJ = "t_papzsj";
	/**
	* C_PAPZR 破案批准人id
	*/
	@Column(columnName="c_papzr",dataType="varchar",dataLength=20,nullAble="Y",comment="破案批准人id")
	private String C_PAPZR = "c_papzr";
	/**
	* V_PAPZRMC 破案批准人名称
	*/
	@Column(columnName="v_papzrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="破案批准人名称")
	private String V_PAPZRMC = "v_papzrmc";
	/**
	* C_PAPZDW 破案批准单位id
	*/
	@Column(columnName="c_papzdw",dataType="varchar",dataLength=20,nullAble="Y",comment="破案批准单位id")
	private String C_PAPZDW = "c_papzdw";
	/**
	* V_PAPZDWMC 破案批准单位名称
	*/
	@Column(columnName="v_papzdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="破案批准单位名称")
	private String V_PAPZDWMC = "v_papzdwmc";
	/**
	* V_PASJD 破案时间段
	*/
	@Column(columnName="v_pasjd",dataType="varchar",dataLength=50,nullAble="Y",comment="破案时间段")
	private String V_PASJD = "v_pasjd";
	/**
	* C_XPDW 协破单位id
	*/
	@Column(columnName="c_xpdw",dataType="varchar",dataLength=20,nullAble="Y",comment="协破单位id")
	private String C_XPDW = "c_xpdw";
	/**
	* V_XPDWMC 协破单位名称
	*/
	@Column(columnName="v_xpdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="协破单位名称")
	private String V_XPDWMC = "v_xpdwmc";
	/**
	* V_PAJK 破案简况
	*/
	@Column(columnName="v_pajk",dataType="varchar",dataLength=2000,nullAble="Y",comment="破案简况")
	private String V_PAJK = "v_pajk";
	/**
	* V_AQZS 案情综述
	*/
	@Column(columnName="v_aqzs",dataType="varchar",dataLength=2000,nullAble="Y",comment="案情综述")
	private String V_AQZS = "v_aqzs";
	/**
	* D_JARQ 结案日期
	*/
	@Column(columnName="d_jarq",dataType="char",dataLength=19,nullAble="Y",comment="结案日期")
	private String D_JARQ = "d_jarq";
	/**
	* C_GDZT 归档状态
	*/
	@Column(columnName="c_gdzt",dataType="varchar",dataLength=20,nullAble="Y",comment="归档状态")
	private String C_GDZT = "c_gdzt";
	/**
	* T_GDSJ 归档时间
	*/
	@Column(columnName="t_gdsj",dataType="char",dataLength=19,nullAble="Y",comment="归档时间")
	private String T_GDSJ = "t_gdsj";
	/**
	* C_JSDW 接收单位id
	*/
	@Column(columnName="c_jsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="接收单位id")
	private String C_JSDW = "c_jsdw";
	/**
	* V_JSDWMC 接收单位名称
	*/
	@Column(columnName="v_jsdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="接收单位名称")
	private String V_JSDWMC = "v_jsdwmc";
	/**
	* T_JSSJ 接收时间
	*/
	@Column(columnName="t_jssj",dataType="char",dataLength=19,nullAble="Y",comment="接收时间")
	private String T_JSSJ = "t_jssj";
	/**
	* C_JSR 接收人id
	*/
	@Column(columnName="c_jsr",dataType="varchar",dataLength=20,nullAble="Y",comment="接收人id")
	private String C_JSR = "c_jsr";
	/**
	* V_JSRXM 接收人姓名
	*/
	@Column(columnName="v_jsrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="接收人姓名")
	private String V_JSRXM = "v_jsrxm";
	/**
	* V_AJYSJSDWLXDH 案件移送接收单位联系电话
	*/
	@Column(columnName="v_ajysjsdwlxdh",dataType="varchar",dataLength=50,nullAble="Y",comment="案件移送接收单位联系电话")
	private String V_AJYSJSDWLXDH = "v_ajysjsdwlxdh";
	/**
	* C_WBJSDW 外部接收单位id
	*/
	@Column(columnName="c_wbjsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="外部接收单位id")
	private String C_WBJSDW = "c_wbjsdw";
	/**
	* V_WBJSDWMC 外部接收单位名称
	*/
	@Column(columnName="v_wbjsdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="外部接收单位名称")
	private String V_WBJSDWMC = "v_wbjsdwmc";
	/**
	* C_WBJSR 外部接收人id
	*/
	@Column(columnName="c_wbjsr",dataType="varchar",dataLength=20,nullAble="Y",comment="外部接收人id")
	private String C_WBJSR = "c_wbjsr";
	/**
	* V_WBJSRMC 外部接收人姓名
	*/
	@Column(columnName="v_wbjsrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="外部接收人姓名")
	private String V_WBJSRMC = "v_wbjsrmc";
	/**
	* T_YSSJ 移送时间
	*/
	@Column(columnName="t_yssj",dataType="char",dataLength=19,nullAble="Y",comment="移送时间")
	private String T_YSSJ = "t_yssj";
	/**
	* C_YSDW 移送单位id
	*/
	@Column(columnName="c_ysdw",dataType="varchar",dataLength=20,nullAble="Y",comment="移送单位id")
	private String C_YSDW = "c_ysdw";
	/**
	* V_YSDWMC 移送单位名称
	*/
	@Column(columnName="v_ysdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="移送单位名称")
	private String V_YSDWMC = "v_ysdwmc";
	/**
	* C_YSR 移送人id
	*/
	@Column(columnName="c_ysr",dataType="varchar",dataLength=20,nullAble="Y",comment="移送人id")
	private String C_YSR = "c_ysr";
	/**
	* V_YSRXM 移送人姓名
	*/
	@Column(columnName="v_ysrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="移送人姓名")
	private String V_YSRXM = "v_ysrxm";
	/**
	* V_XSBH 线索编号
	*/
	@Column(columnName="v_xsbh",dataType="varchar",dataLength=50,nullAble="Y",comment="线索编号")
	private String V_XSBH = "v_xsbh";
	/**
	* V_YSDWLXDH 移送单位联系电话
	*/
	@Column(columnName="v_ysdwlxdh",dataType="varchar",dataLength=50,nullAble="Y",comment="移送单位联系电话")
	private String V_YSDWLXDH = "v_ysdwlxdh";
	/**
	* C_YSYY 移送原因
	*/
	@Column(columnName="c_ysyy",dataType="varchar",dataLength=20,nullAble="Y",comment="移送原因")
	private String C_YSYY = "c_ysyy";
	/**
	* D_CXRQ 撤销日期
	*/
	@Column(columnName="d_cxrq",dataType="char",dataLength=19,nullAble="Y",comment="撤销日期")
	private String D_CXRQ = "d_cxrq";
	/**
	* C_CXYY 撤销原因
	*/
	@Column(columnName="c_cxyy",dataType="varchar",dataLength=20,nullAble="Y",comment="撤销原因")
	private String C_CXYY = "c_cxyy";
	/**
	* C_CXDW 撤销单位id
	*/
	@Column(columnName="c_cxdw",dataType="varchar",dataLength=20,nullAble="Y",comment="撤销单位id")
	private String C_CXDW = "c_cxdw";
	/**
	* C_CXPZR 撤销批准人id
	*/
	@Column(columnName="c_cxpzr",dataType="varchar",dataLength=20,nullAble="Y",comment="撤销批准人id")
	private String C_CXPZR = "c_cxpzr";
	/**
	* V_CXDWMC 撤销单位名称
	*/
	@Column(columnName="v_cxdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="撤销单位名称")
	private String V_CXDWMC = "v_cxdwmc";
	/**
	* V_CXPZRXM 撤销批准人姓名
	*/
	@Column(columnName="v_cxpzrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="撤销批准人姓名")
	private String V_CXPZRXM = "v_cxpzrxm";
	/**
	* C_JZAJSX 经侦案件属性
	*/
	@Column(columnName="c_jzajsx",dataType="varchar",dataLength=20,nullAble="Y",comment="经侦案件属性")
	private String C_JZAJSX = "c_jzajsx";
	/**
	* N_SAZJZ 涉案总价值
	*/
	@Column(columnName="n_sazjz",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案总价值")
	private String N_SAZJZ = "n_sazjz";
	/**
	* C_SJGJDQ 涉及国家地区
	*/
	@Column(columnName="c_sjgjdq",dataType="varchar",dataLength=20,nullAble="Y",comment="涉及国家地区")
	private String C_SJGJDQ = "c_sjgjdq";
	/**
	* N_JJSY 经济损失
	*/
	@Column(columnName="n_jjsy",dataType="decimal",dataLength=20,nullAble="Y",comment="经济损失")
	private String N_JJSY = "n_jjsy";
	/**
	* N_WHZJZ 挽回总价值
	*/
	@Column(columnName="n_whzjz",dataType="decimal",dataLength=20,nullAble="Y",comment="挽回总价值")
	private String N_WHZJZ = "n_whzjz";
	/**
	* N_JHZJZ 缴获总价值
	*/
	@Column(columnName="n_jhzjz",dataType="decimal",dataLength=20,nullAble="Y",comment="缴获总价值")
	private String N_JHZJZ = "n_jhzjz";
	/**
	* N_ZARS 作案人数
	*/
	@Column(columnName="n_zars",dataType="int",dataLength=0,nullAble="Y",comment="作案人数")
	private String N_ZARS = "n_zars";
	/**
	* N_JJETS 解救儿童数
	*/
	@Column(columnName="n_jjets",dataType="int",dataLength=0,nullAble="Y",comment="解救儿童数")
	private String N_JJETS = "n_jjets";
	/**
	* N_JJFNS 解救妇女数
	*/
	@Column(columnName="n_jjfns",dataType="int",dataLength=0,nullAble="Y",comment="解救妇女数")
	private String N_JJFNS = "n_jjfns";
	/**
	* N_JJRZS 解救人质数
	*/
	@Column(columnName="n_jjrzs",dataType="int",dataLength=0,nullAble="Y",comment="解救人质数")
	private String N_JJRZS = "n_jjrzs";
	/**
	* N_RYSSS 人员受伤数
	*/
	@Column(columnName="n_rysss",dataType="int",dataLength=0,nullAble="Y",comment="人员受伤数")
	private String N_RYSSS = "n_rysss";
	/**
	* N_QTSHRS 其他受害人数
	*/
	@Column(columnName="n_qtshrs",dataType="int",dataLength=0,nullAble="Y",comment="其他受害人数")
	private String N_QTSHRS = "n_qtshrs";
	/**
	* N_RYSWS 人员死亡数
	*/
	@Column(columnName="n_rysws",dataType="int",dataLength=0,nullAble="Y",comment="人员死亡数")
	private String N_RYSWS = "n_rysws";
	/**
	* B_SFYXC 是否有现场
	*/
	@Column(columnName="b_sfyxc",dataType="char",dataLength=1,nullAble="Y",comment="是否有现场")
	private String B_SFYXC = "b_sfyxc";
	/**
	* B_SFKCXC 是否勘查现场
	*/
	@Column(columnName="b_sfkcxc",dataType="char",dataLength=1,nullAble="Y",comment="是否勘查现场")
	private String B_SFKCXC = "b_sfkcxc";
	/**
	* V_NWGJDX 内外勾结对象
	*/
	@Column(columnName="v_nwgjdx",dataType="varchar",dataLength=200,nullAble="Y",comment="内外勾结对象")
	private String V_NWGJDX = "v_nwgjdx";
	/**
	* B_SFAJNWGJ 是否案件内外勾结
	*/
	@Column(columnName="b_sfajnwgj",dataType="char",dataLength=1,nullAble="Y",comment="是否案件内外勾结")
	private String B_SFAJNWGJ = "b_sfajnwgj";
	/**
	* V_FJCABH 分局串案编号
	*/
	@Column(columnName="v_fjcabh",dataType="varchar",dataLength=50,nullAble="Y",comment="分局串案编号")
	private String V_FJCABH = "v_fjcabh";
	/**
	* V_FLAJBH 分类案件编号
	*/
	@Column(columnName="v_flajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="分类案件编号")
	private String V_FLAJBH = "v_flajbh";
	/**
	* V_SJCABH 市局串案编号
	*/
	@Column(columnName="v_sjcabh",dataType="varchar",dataLength=50,nullAble="Y",comment="市局串案编号")
	private String V_SJCABH = "v_sjcabh";
	/**
	* V_STCABH 省厅串案编号
	*/
	@Column(columnName="v_stcabh",dataType="varchar",dataLength=50,nullAble="Y",comment="省厅串案编号")
	private String V_STCABH = "v_stcabh";
	/**
	* B_SFZSFJAJ 是否直属分局案件
	*/
	@Column(columnName="b_sfzsfjaj",dataType="char",dataLength=1,nullAble="Y",comment="是否直属分局案件")
	private String B_SFZSFJAJ = "b_sfzsfjaj";
	/**
	* V_GLBH 关联编号
	*/
	@Column(columnName="v_glbh",dataType="varchar",dataLength=50,nullAble="Y",comment="关联编号")
	private String V_GLBH = "v_glbh";
	/**
	* V_ZAJBH 转案件编号
	*/
	@Column(columnName="v_zajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="转案件编号")
	private String V_ZAJBH = "v_zajbh";
	/**
	* B_SFDYA 是否大要案
	*/
	@Column(columnName="b_sfdya",dataType="char",dataLength=1,nullAble="Y",comment="是否大要案")
	private String B_SFDYA = "b_sfdya";
	/**
	* T_BBSJ 报捕时间
	*/
	@Column(columnName="t_bbsj",dataType="char",dataLength=19,nullAble="Y",comment="报捕时间")
	private String T_BBSJ = "t_bbsj";
	/**
	* T_BSSJ 报诉时间
	*/
	@Column(columnName="t_bssj",dataType="char",dataLength=19,nullAble="Y",comment="报诉时间")
	private String T_BSSJ = "t_bssj";
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
	* V_PT_BH 平台编号
	*/
	@Column(columnName="v_pt_bh",dataType="varchar",dataLength=50,nullAble="Y",comment="平台编号")
	private String V_PT_BH = "v_pt_bh";
	/**
	* C_PT_AJJD 平台案件阶段
	*/
	@Column(columnName="c_pt_ajjd",dataType="varchar",dataLength=20,nullAble="Y",comment="平台案件阶段")
	private String C_PT_AJJD = "c_pt_ajjd";
	/**
	* C_PT_AJZT 平台案件状态
	*/
	@Column(columnName="c_pt_ajzt",dataType="varchar",dataLength=20,nullAble="Y",comment="平台案件状态")
	private String C_PT_AJZT = "c_pt_ajzt";
	/**
	* V_JCY_AH 检察院案号
	*/
	@Column(columnName="v_jcy_ah",dataType="varchar",dataLength=50,nullAble="Y",comment="检察院案号")
	private String V_JCY_AH = "v_jcy_ah";
	/**
	* D_JCY_LARQ 检察院立案日期
	*/
	@Column(columnName="d_jcy_larq",dataType="char",dataLength=19,nullAble="Y",comment="检察院立案日期")
	private String D_JCY_LARQ = "d_jcy_larq";
	/**
	* D_JCY_JARQ 检察院结案日期
	*/
	@Column(columnName="d_jcy_jarq",dataType="char",dataLength=19,nullAble="Y",comment="检察院结案日期")
	private String D_JCY_JARQ = "d_jcy_jarq";
	/**
	* C_JCY_CBDW 检察院承办单位
	*/
	@Column(columnName="c_jcy_cbdw",dataType="varchar",dataLength=20,nullAble="Y",comment="检察院承办单位")
	private String C_JCY_CBDW = "c_jcy_cbdw";
	/**
	* V_FY_AH 法院案号
	*/
	@Column(columnName="v_fy_ah",dataType="varchar",dataLength=50,nullAble="Y",comment="法院案号")
	private String V_FY_AH = "v_fy_ah";
	/**
	* D_FY_LARQ 法院立案日期
	*/
	@Column(columnName="d_fy_larq",dataType="char",dataLength=19,nullAble="Y",comment="法院立案日期")
	private String D_FY_LARQ = "d_fy_larq";
	/**
	* D_FY_JARQ 法院结案日期
	*/
	@Column(columnName="d_fy_jarq",dataType="char",dataLength=19,nullAble="Y",comment="法院结案日期")
	private String D_FY_JARQ = "d_fy_jarq";
	/**
	* C_FY_CBDW 法院承办单位
	*/
	@Column(columnName="c_fy_cbdw",dataType="varchar",dataLength=20,nullAble="Y",comment="法院承办单位")
	private String C_FY_CBDW = "c_fy_cbdw";
	/**
	* N_DATATYPE 数据类型
	*/
	@Column(columnName="n_datatype",dataType="int",dataLength=0,nullAble="Y",comment="数据类型")
	private String N_DATATYPE = "n_datatype";
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
	* PK_GAJ_AJXX_H 主键
	*/
	@PrimaryKey
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* V_AJBH 案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* C_AJMJ 案件密级
	*/
	@Column(columnName="c_ajmj",dataType="varchar",dataLength=20,nullAble="Y",comment="案件密级")
	private String C_AJMJ = "c_ajmj";
	/**
	* C_AJLB 案件类别
	*/
	@Column(columnName="c_ajlb",dataType="varchar",dataLength=20,nullAble="Y",comment="案件类别")
	private String C_AJLB = "c_ajlb";
	/**
	* C_SPCX 审判程序
	*/
	@Column(columnName="c_spcx",dataType="varchar",dataLength=20,nullAble="Y",comment="审判程序")
	private String C_SPCX = "c_spcx";
	/**
	* C_AJFAB 案件副案别
	*/
	@Column(columnName="c_ajfab",dataType="varchar",dataLength=20,nullAble="Y",comment="案件副案别")
	private String C_AJFAB = "c_ajfab";
	/**
	* C_AJKFXAJLB 案件可防性案件类别
	*/
	@Column(columnName="c_ajkfxajlb",dataType="varchar",dataLength=20,nullAble="Y",comment="案件可防性案件类别")
	private String C_AJKFXAJLB = "c_ajkfxajlb";
	/**
	* C_AJSWQHLB 案件涉外侵害类别
	*/
	@Column(columnName="c_ajswqhlb",dataType="varchar",dataLength=20,nullAble="Y",comment="案件涉外侵害类别")
	private String C_AJSWQHLB = "c_ajswqhlb";
	/**
	* V_AJMC 案件名称
	*/
	@Column(columnName="v_ajmc",dataType="varchar",dataLength=100,nullAble="Y",comment="案件名称")
	private String V_AJMC = "v_ajmc";
	/**
	* C_AJSX 案件属性
	*/
	@Column(columnName="c_ajsx",dataType="varchar",dataLength=100,nullAble="Y",comment="案件属性")
	private String C_AJSX = "c_ajsx";
	/**
	* C_AJZT 公安案件状态
	*/
	@Column(columnName="c_ajzt",dataType="varchar",dataLength=20,nullAble="Y",comment="公安案件状态")
	private String C_AJZT = "c_ajzt";
	/**
	* C_AJXZ 案件性质
	*/
	@Column(columnName="c_ajxz",dataType="varchar",dataLength=20,nullAble="Y",comment="案件性质")
	private String C_AJXZ = "c_ajxz";
	/**
	* C_AJLY 案件来源
	*/
	@Column(columnName="c_ajly",dataType="varchar",dataLength=20,nullAble="Y",comment="案件来源")
	private String C_AJLY = "c_ajly";
	/**
	* V_BARXM 报案人姓名
	*/
	@Column(columnName="v_barxm",dataType="varchar",dataLength=50,nullAble="Y",comment="报案人姓名")
	private String V_BARXM = "v_barxm";
	/**
	* C_BARXB 报案人性别
	*/
	@Column(columnName="c_barxb",dataType="varchar",dataLength=20,nullAble="Y",comment="报案人性别")
	private String C_BARXB = "c_barxb";
	/**
	* D_BARCSRQ 报案人出生日期
	*/
	@Column(columnName="d_barcsrq",dataType="char",dataLength=19,nullAble="Y",comment="报案人出生日期")
	private String D_BARCSRQ = "d_barcsrq";
	/**
	* V_BARDW 报案人单位
	*/
	@Column(columnName="v_bardw",dataType="varchar",dataLength=100,nullAble="Y",comment="报案人单位")
	private String V_BARDW = "v_bardw";
	/**
	* V_BARLXFS 报案人联系方式
	*/
	@Column(columnName="v_barlxfs",dataType="varchar",dataLength=50,nullAble="Y",comment="报案人联系方式")
	private String V_BARLXFS = "v_barlxfs";
	/**
	* V_BARZZ 报案人住址
	*/
	@Column(columnName="v_barzz",dataType="varchar",dataLength=100,nullAble="Y",comment="报案人住址")
	private String V_BARZZ = "v_barzz";
	/**
	* C_BARZJZL 报案人证件种类
	*/
	@Column(columnName="c_barzjzl",dataType="varchar",dataLength=20,nullAble="Y",comment="报案人证件种类")
	private String C_BARZJZL = "c_barzjzl";
	/**
	* V_BARZJHM 报案人证件号码
	*/
	@Column(columnName="v_barzjhm",dataType="varchar",dataLength=50,nullAble="Y",comment="报案人证件号码")
	private String V_BARZJHM = "v_barzjhm";
	/**
	* C_BARBMJB 报案人保密级别
	*/
	@Column(columnName="c_barbmjb",dataType="varchar",dataLength=20,nullAble="Y",comment="报案人保密级别")
	private String C_BARBMJB = "c_barbmjb";
	/**
	* T_BASJ 报案时间
	*/
	@Column(columnName="t_basj",dataType="char",dataLength=19,nullAble="Y",comment="报案时间")
	private String T_BASJ = "t_basj";
	/**
	* V_AJBADWMC 案件报案单位名称
	*/
	@Column(columnName="v_ajbadwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="案件报案单位名称")
	private String V_AJBADWMC = "v_ajbadwmc";
	/**
	* V_AJBADWDZ 案件报案单位地址
	*/
	@Column(columnName="v_ajbadwdz",dataType="varchar",dataLength=100,nullAble="Y",comment="案件报案单位地址")
	private String V_AJBADWDZ = "v_ajbadwdz";
	/**
	* V_AJBADWLXR 案件报案单位联系人
	*/
	@Column(columnName="v_ajbadwlxr",dataType="varchar",dataLength=50,nullAble="Y",comment="案件报案单位联系人")
	private String V_AJBADWLXR = "v_ajbadwlxr";
	/**
	* V_AJBADWLXFS 案件报案单位联系方式
	*/
	@Column(columnName="v_ajbadwlxfs",dataType="varchar",dataLength=50,nullAble="Y",comment="案件报案单位联系方式")
	private String V_AJBADWLXFS = "v_ajbadwlxfs";
	/**
	* T_FXSJ 发现时间
	*/
	@Column(columnName="t_fxsj",dataType="char",dataLength=19,nullAble="Y",comment="发现时间")
	private String T_FXSJ = "t_fxsj";
	/**
	* T_FASJSX 发案时间上限
	*/
	@Column(columnName="t_fasjsx",dataType="char",dataLength=19,nullAble="Y",comment="发案时间上限")
	private String T_FASJSX = "t_fasjsx";
	/**
	* T_FASJXX 发案时间下限
	*/
	@Column(columnName="t_fasjxx",dataType="char",dataLength=19,nullAble="Y",comment="发案时间下限")
	private String T_FASJXX = "t_fasjxx";
	/**
	* V_FADY 发案地域
	*/
	@Column(columnName="v_fady",dataType="varchar",dataLength=20,nullAble="Y",comment="发案地域")
	private String V_FADY = "v_fady";
	/**
	* V_FACS 发案处所
	*/
	@Column(columnName="v_facs",dataType="varchar",dataLength=20,nullAble="Y",comment="发案处所")
	private String V_FACS = "v_facs";
	/**
	* V_FABW 发案部位
	*/
	@Column(columnName="v_fabw",dataType="varchar",dataLength=20,nullAble="Y",comment="发案部位")
	private String V_FABW = "v_fabw";
	/**
	* V_FASJD 发案时间段
	*/
	@Column(columnName="v_fasjd",dataType="varchar",dataLength=50,nullAble="Y",comment="发案时间段")
	private String V_FASJD = "v_fasjd";
	/**
	* V_AJSSXQ 省市县区
	*/
	@Column(columnName="v_ajssxq",dataType="varchar",dataLength=50,nullAble="Y",comment="省市县区")
	private String V_AJSSXQ = "v_ajssxq";
	/**
	* V_AJJLG 街路巷
	*/
	@Column(columnName="v_ajjlg",dataType="varchar",dataLength=50,nullAble="Y",comment="街路巷")
	private String V_AJJLG = "v_ajjlg";
	/**
	* V_AJMLPH 门楼牌号
	*/
	@Column(columnName="v_ajmlph",dataType="varchar",dataLength=50,nullAble="Y",comment="门楼牌号")
	private String V_AJMLPH = "v_ajmlph";
	/**
	* V_AJMPHZ 门牌后缀
	*/
	@Column(columnName="v_ajmphz",dataType="varchar",dataLength=50,nullAble="Y",comment="门牌后缀")
	private String V_AJMPHZ = "v_ajmphz";
	/**
	* V_AJMLXZ 门楼详址
	*/
	@Column(columnName="v_ajmlxz",dataType="varchar",dataLength=100,nullAble="Y",comment="门楼详址")
	private String V_AJMLXZ = "v_ajmlxz";
	/**
	* V_AJXXDZMC 案件详细地址名称
	*/
	@Column(columnName="v_ajxxdzmc",dataType="varchar",dataLength=50,nullAble="Y",comment="案件详细地址名称")
	private String V_AJXXDZMC = "v_ajxxdzmc";
	/**
	* V_AJSSZRQ 案件所属责任区
	*/
	@Column(columnName="v_ajsszrq",dataType="varchar",dataLength=20,nullAble="Y",comment="案件所属责任区")
	private String V_AJSSZRQ = "v_ajsszrq";
	/**
	* V_AJSSZRQMC 案件所属责任区名称
	*/
	@Column(columnName="v_ajsszrqmc",dataType="varchar",dataLength=100,nullAble="Y",comment="案件所属责任区名称")
	private String V_AJSSZRQMC = "v_ajsszrqmc";
	/**
	* T_SLSJ 受理时间
	*/
	@Column(columnName="t_slsj",dataType="char",dataLength=19,nullAble="Y",comment="受理时间")
	private String T_SLSJ = "t_slsj";
	/**
	* C_SLR 受理人id
	*/
	@Column(columnName="c_slr",dataType="varchar",dataLength=20,nullAble="Y",comment="受理人id")
	private String C_SLR = "c_slr";
	/**
	* V_SLRMC 受理人姓名
	*/
	@Column(columnName="v_slrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="受理人姓名")
	private String V_SLRMC = "v_slrmc";
	/**
	* C_SLDW 受理单位id
	*/
	@Column(columnName="c_sldw",dataType="varchar",dataLength=20,nullAble="Y",comment="受理单位id")
	private String C_SLDW = "c_sldw";
	/**
	* V_SLDWMC 受理单位名称
	*/
	@Column(columnName="v_sldwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="受理单位名称")
	private String V_SLDWMC = "v_sldwmc";
	/**
	* V_SLDWLXDH 受理单位联系电话
	*/
	@Column(columnName="v_sldwlxdh",dataType="varchar",dataLength=50,nullAble="Y",comment="受理单位联系电话")
	private String V_SLDWLXDH = "v_sldwlxdh";
	/**
	* C_SLFS 受理方式
	*/
	@Column(columnName="c_slfs",dataType="varchar",dataLength=20,nullAble="Y",comment="受理方式")
	private String C_SLFS = "c_slfs";
	/**
	* V_JYAQ 简要案情
	*/
	@Column(columnName="v_jyaq",dataType="varchar",dataLength=2000,nullAble="Y",comment="简要案情")
	private String V_JYAQ = "v_jyaq";
	/**
	* C_ZBDW 主办单位id
	*/
	@Column(columnName="c_zbdw",dataType="varchar",dataLength=20,nullAble="Y",comment="主办单位id")
	private String C_ZBDW = "c_zbdw";
	/**
	* V_ZBDWMC 主办单位名称
	*/
	@Column(columnName="v_zbdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="主办单位名称")
	private String V_ZBDWMC = "v_zbdwmc";
	/**
	* C_AJXBDW 案件协办单位id
	*/
	@Column(columnName="c_ajxbdw",dataType="varchar",dataLength=20,nullAble="Y",comment="案件协办单位id")
	private String C_AJXBDW = "c_ajxbdw";
	/**
	* V_AJXBDWMC 案件协办单位名称
	*/
	@Column(columnName="v_ajxbdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="案件协办单位名称")
	private String V_AJXBDWMC = "v_ajxbdwmc";
	/**
	* C_ZSBADW 直属办案单位id
	*/
	@Column(columnName="c_zsbadw",dataType="varchar",dataLength=20,nullAble="Y",comment="直属办案单位id")
	private String C_ZSBADW = "c_zsbadw";
	/**
	* V_ZSBADWMC 直属办案单位名称
	*/
	@Column(columnName="v_zsbadwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="直属办案单位名称")
	private String V_ZSBADWMC = "v_zsbadwmc";
	/**
	* C_ZBR 主办人id
	*/
	@Column(columnName="c_zbr",dataType="varchar",dataLength=20,nullAble="Y",comment="主办人id")
	private String C_ZBR = "c_zbr";
	/**
	* V_ZBRMC 主办人姓名
	*/
	@Column(columnName="v_zbrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="主办人姓名")
	private String V_ZBRMC = "v_zbrmc";
	/**
	* V_ZBRDH 主办人电话
	*/
	@Column(columnName="v_zbrdh",dataType="varchar",dataLength=50,nullAble="Y",comment="主办人电话")
	private String V_ZBRDH = "v_zbrdh";
	/**
	* C_XBR 协办人id
	*/
	@Column(columnName="c_xbr",dataType="varchar",dataLength=200,nullAble="Y",comment="协办人id")
	private String C_XBR = "c_xbr";
	/**
	* V_XBRXM 协办人姓名
	*/
	@Column(columnName="v_xbrxm",dataType="varchar",dataLength=2000,nullAble="Y",comment="协办人姓名")
	private String V_XBRXM = "v_xbrxm";
	/**
	* C_LADW 立案单位id
	*/
	@Column(columnName="c_ladw",dataType="varchar",dataLength=20,nullAble="Y",comment="立案单位id")
	private String C_LADW = "c_ladw";
	/**
	* V_LADWMC 立案单位名称
	*/
	@Column(columnName="v_ladwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="立案单位名称")
	private String V_LADWMC = "v_ladwmc";
	/**
	* T_LASJ 立案时间
	*/
	@Column(columnName="t_lasj",dataType="char",dataLength=19,nullAble="Y",comment="立案时间")
	private String T_LASJ = "t_lasj";
	/**
	* C_LAPZR 立案批准人id
	*/
	@Column(columnName="c_lapzr",dataType="varchar",dataLength=20,nullAble="Y",comment="立案批准人id")
	private String C_LAPZR = "c_lapzr";
	/**
	* V_LAPZRXM 立案批准人姓名
	*/
	@Column(columnName="v_lapzrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="立案批准人姓名")
	private String V_LAPZRXM = "v_lapzrxm";
	/**
	* T_LASCDQSJ 立案审查到期时间
	*/
	@Column(columnName="t_lascdqsj",dataType="char",dataLength=19,nullAble="Y",comment="立案审查到期时间")
	private String T_LASCDQSJ = "t_lascdqsj";
	/**
	* T_LASCSJ 立案审查时间
	*/
	@Column(columnName="t_lascsj",dataType="char",dataLength=19,nullAble="Y",comment="立案审查时间")
	private String T_LASCSJ = "t_lascsj";
	/**
	* B_SFZA 是否专案
	*/
	@Column(columnName="b_sfza",dataType="char",dataLength=1,nullAble="Y",comment="是否专案")
	private String B_SFZA = "b_sfza";
	/**
	* V_BLYY 补立原因
	*/
	@Column(columnName="v_blyy",dataType="varchar",dataLength=20,nullAble="Y",comment="补立原因")
	private String V_BLYY = "v_blyy";
	/**
	* C_WHCD 危害程度
	*/
	@Column(columnName="c_whcd",dataType="varchar",dataLength=20,nullAble="Y",comment="危害程度")
	private String C_WHCD = "c_whcd";
	/**
	* C_DBJB 督办级别
	*/
	@Column(columnName="c_dbjb",dataType="varchar",dataLength=20,nullAble="Y",comment="督办级别")
	private String C_DBJB = "c_dbjb";
	/**
	* V_DBBH 督办编号
	*/
	@Column(columnName="v_dbbh",dataType="varchar",dataLength=50,nullAble="Y",comment="督办编号")
	private String V_DBBH = "v_dbbh";
	/**
	* getC_gxfg(void) 
	*/
	public String getC_gxfg(){
		return this.C_GXFG;
	}
	/**
	*setC_gxfg(java.lang.String)
	*/
	public void setC_gxfg(String c_gxfg){
		this.C_GXFG=c_gxfg;
	}
	/**
	* getC_fzztlx(void) 
	*/
	public String getC_fzztlx(){
		return this.C_FZZTLX;
	}
	/**
	*setC_fzztlx(java.lang.String)
	*/
	public void setC_fzztlx(String c_fzztlx){
		this.C_FZZTLX=c_fzztlx;
	}
	/**
	* getD_parq(void) 
	*/
	public String getD_parq(){
		return this.D_PARQ;
	}
	/**
	*setD_parq(java.lang.String)
	*/
	public void setD_parq(String d_parq){
		this.D_PARQ=d_parq;
	}
	/**
	* getC_pafs(void) 
	*/
	public String getC_pafs(){
		return this.C_PAFS;
	}
	/**
	*setC_pafs(java.lang.String)
	*/
	public void setC_pafs(String c_pafs){
		this.C_PAFS=c_pafs;
	}
	/**
	* getC_palx(void) 
	*/
	public String getC_palx(){
		return this.C_PALX;
	}
	/**
	*setC_palx(java.lang.String)
	*/
	public void setC_palx(String c_palx){
		this.C_PALX=c_palx;
	}
	/**
	* getC_padw(void) 
	*/
	public String getC_padw(){
		return this.C_PADW;
	}
	/**
	*setC_padw(java.lang.String)
	*/
	public void setC_padw(String c_padw){
		this.C_PADW=c_padw;
	}
	/**
	* getV_padwmc(void) 
	*/
	public String getV_padwmc(){
		return this.V_PADWMC;
	}
	/**
	*setV_padwmc(java.lang.String)
	*/
	public void setV_padwmc(String v_padwmc){
		this.V_PADWMC=v_padwmc;
	}
	/**
	* getT_papzsj(void) 
	*/
	public String getT_papzsj(){
		return this.T_PAPZSJ;
	}
	/**
	*setT_papzsj(java.lang.String)
	*/
	public void setT_papzsj(String t_papzsj){
		this.T_PAPZSJ=t_papzsj;
	}
	/**
	* getC_papzr(void) 
	*/
	public String getC_papzr(){
		return this.C_PAPZR;
	}
	/**
	*setC_papzr(java.lang.String)
	*/
	public void setC_papzr(String c_papzr){
		this.C_PAPZR=c_papzr;
	}
	/**
	* getV_papzrmc(void) 
	*/
	public String getV_papzrmc(){
		return this.V_PAPZRMC;
	}
	/**
	*setV_papzrmc(java.lang.String)
	*/
	public void setV_papzrmc(String v_papzrmc){
		this.V_PAPZRMC=v_papzrmc;
	}
	/**
	* getC_papzdw(void) 
	*/
	public String getC_papzdw(){
		return this.C_PAPZDW;
	}
	/**
	*setC_papzdw(java.lang.String)
	*/
	public void setC_papzdw(String c_papzdw){
		this.C_PAPZDW=c_papzdw;
	}
	/**
	* getV_papzdwmc(void) 
	*/
	public String getV_papzdwmc(){
		return this.V_PAPZDWMC;
	}
	/**
	*setV_papzdwmc(java.lang.String)
	*/
	public void setV_papzdwmc(String v_papzdwmc){
		this.V_PAPZDWMC=v_papzdwmc;
	}
	/**
	* getV_pasjd(void) 
	*/
	public String getV_pasjd(){
		return this.V_PASJD;
	}
	/**
	*setV_pasjd(java.lang.String)
	*/
	public void setV_pasjd(String v_pasjd){
		this.V_PASJD=v_pasjd;
	}
	/**
	* getC_xpdw(void) 
	*/
	public String getC_xpdw(){
		return this.C_XPDW;
	}
	/**
	*setC_xpdw(java.lang.String)
	*/
	public void setC_xpdw(String c_xpdw){
		this.C_XPDW=c_xpdw;
	}
	/**
	* getV_xpdwmc(void) 
	*/
	public String getV_xpdwmc(){
		return this.V_XPDWMC;
	}
	/**
	*setV_xpdwmc(java.lang.String)
	*/
	public void setV_xpdwmc(String v_xpdwmc){
		this.V_XPDWMC=v_xpdwmc;
	}
	/**
	* getV_pajk(void) 
	*/
	public String getV_pajk(){
		return this.V_PAJK;
	}
	/**
	*setV_pajk(java.lang.String)
	*/
	public void setV_pajk(String v_pajk){
		this.V_PAJK=v_pajk;
	}
	/**
	* getV_aqzs(void) 
	*/
	public String getV_aqzs(){
		return this.V_AQZS;
	}
	/**
	*setV_aqzs(java.lang.String)
	*/
	public void setV_aqzs(String v_aqzs){
		this.V_AQZS=v_aqzs;
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
	* getC_gdzt(void) 
	*/
	public String getC_gdzt(){
		return this.C_GDZT;
	}
	/**
	*setC_gdzt(java.lang.String)
	*/
	public void setC_gdzt(String c_gdzt){
		this.C_GDZT=c_gdzt;
	}
	/**
	* getT_gdsj(void) 
	*/
	public String getT_gdsj(){
		return this.T_GDSJ;
	}
	/**
	*setT_gdsj(java.lang.String)
	*/
	public void setT_gdsj(String t_gdsj){
		this.T_GDSJ=t_gdsj;
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
	* getT_jssj(void) 
	*/
	public String getT_jssj(){
		return this.T_JSSJ;
	}
	/**
	*setT_jssj(java.lang.String)
	*/
	public void setT_jssj(String t_jssj){
		this.T_JSSJ=t_jssj;
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
	* getV_ajysjsdwlxdh(void) 
	*/
	public String getV_ajysjsdwlxdh(){
		return this.V_AJYSJSDWLXDH;
	}
	/**
	*setV_ajysjsdwlxdh(java.lang.String)
	*/
	public void setV_ajysjsdwlxdh(String v_ajysjsdwlxdh){
		this.V_AJYSJSDWLXDH=v_ajysjsdwlxdh;
	}
	/**
	* getC_wbjsdw(void) 
	*/
	public String getC_wbjsdw(){
		return this.C_WBJSDW;
	}
	/**
	*setC_wbjsdw(java.lang.String)
	*/
	public void setC_wbjsdw(String c_wbjsdw){
		this.C_WBJSDW=c_wbjsdw;
	}
	/**
	* getV_wbjsdwmc(void) 
	*/
	public String getV_wbjsdwmc(){
		return this.V_WBJSDWMC;
	}
	/**
	*setV_wbjsdwmc(java.lang.String)
	*/
	public void setV_wbjsdwmc(String v_wbjsdwmc){
		this.V_WBJSDWMC=v_wbjsdwmc;
	}
	/**
	* getC_wbjsr(void) 
	*/
	public String getC_wbjsr(){
		return this.C_WBJSR;
	}
	/**
	*setC_wbjsr(java.lang.String)
	*/
	public void setC_wbjsr(String c_wbjsr){
		this.C_WBJSR=c_wbjsr;
	}
	/**
	* getV_wbjsrmc(void) 
	*/
	public String getV_wbjsrmc(){
		return this.V_WBJSRMC;
	}
	/**
	*setV_wbjsrmc(java.lang.String)
	*/
	public void setV_wbjsrmc(String v_wbjsrmc){
		this.V_WBJSRMC=v_wbjsrmc;
	}
	/**
	* getT_yssj(void) 
	*/
	public String getT_yssj(){
		return this.T_YSSJ;
	}
	/**
	*setT_yssj(java.lang.String)
	*/
	public void setT_yssj(String t_yssj){
		this.T_YSSJ=t_yssj;
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
	* getC_ysr(void) 
	*/
	public String getC_ysr(){
		return this.C_YSR;
	}
	/**
	*setC_ysr(java.lang.String)
	*/
	public void setC_ysr(String c_ysr){
		this.C_YSR=c_ysr;
	}
	/**
	* getV_ysrxm(void) 
	*/
	public String getV_ysrxm(){
		return this.V_YSRXM;
	}
	/**
	*setV_ysrxm(java.lang.String)
	*/
	public void setV_ysrxm(String v_ysrxm){
		this.V_YSRXM=v_ysrxm;
	}
	/**
	* getV_xsbh(void) 
	*/
	public String getV_xsbh(){
		return this.V_XSBH;
	}
	/**
	*setV_xsbh(java.lang.String)
	*/
	public void setV_xsbh(String v_xsbh){
		this.V_XSBH=v_xsbh;
	}
	/**
	* getV_ysdwlxdh(void) 
	*/
	public String getV_ysdwlxdh(){
		return this.V_YSDWLXDH;
	}
	/**
	*setV_ysdwlxdh(java.lang.String)
	*/
	public void setV_ysdwlxdh(String v_ysdwlxdh){
		this.V_YSDWLXDH=v_ysdwlxdh;
	}
	/**
	* getC_ysyy(void) 
	*/
	public String getC_ysyy(){
		return this.C_YSYY;
	}
	/**
	*setC_ysyy(java.lang.String)
	*/
	public void setC_ysyy(String c_ysyy){
		this.C_YSYY=c_ysyy;
	}
	/**
	* getD_cxrq(void) 
	*/
	public String getD_cxrq(){
		return this.D_CXRQ;
	}
	/**
	*setD_cxrq(java.lang.String)
	*/
	public void setD_cxrq(String d_cxrq){
		this.D_CXRQ=d_cxrq;
	}
	/**
	* getC_cxyy(void) 
	*/
	public String getC_cxyy(){
		return this.C_CXYY;
	}
	/**
	*setC_cxyy(java.lang.String)
	*/
	public void setC_cxyy(String c_cxyy){
		this.C_CXYY=c_cxyy;
	}
	/**
	* getC_cxdw(void) 
	*/
	public String getC_cxdw(){
		return this.C_CXDW;
	}
	/**
	*setC_cxdw(java.lang.String)
	*/
	public void setC_cxdw(String c_cxdw){
		this.C_CXDW=c_cxdw;
	}
	/**
	* getC_cxpzr(void) 
	*/
	public String getC_cxpzr(){
		return this.C_CXPZR;
	}
	/**
	*setC_cxpzr(java.lang.String)
	*/
	public void setC_cxpzr(String c_cxpzr){
		this.C_CXPZR=c_cxpzr;
	}
	/**
	* getV_cxdwmc(void) 
	*/
	public String getV_cxdwmc(){
		return this.V_CXDWMC;
	}
	/**
	*setV_cxdwmc(java.lang.String)
	*/
	public void setV_cxdwmc(String v_cxdwmc){
		this.V_CXDWMC=v_cxdwmc;
	}
	/**
	* getV_cxpzrxm(void) 
	*/
	public String getV_cxpzrxm(){
		return this.V_CXPZRXM;
	}
	/**
	*setV_cxpzrxm(java.lang.String)
	*/
	public void setV_cxpzrxm(String v_cxpzrxm){
		this.V_CXPZRXM=v_cxpzrxm;
	}
	/**
	* getC_jzajsx(void) 
	*/
	public String getC_jzajsx(){
		return this.C_JZAJSX;
	}
	/**
	*setC_jzajsx(java.lang.String)
	*/
	public void setC_jzajsx(String c_jzajsx){
		this.C_JZAJSX=c_jzajsx;
	}
	/**
	* getN_sazjz(void) 
	*/
	public String getN_sazjz(){
		return this.N_SAZJZ;
	}
	/**
	*setN_sazjz(java.lang.String)
	*/
	public void setN_sazjz(String n_sazjz){
		this.N_SAZJZ=n_sazjz;
	}
	/**
	* getC_sjgjdq(void) 
	*/
	public String getC_sjgjdq(){
		return this.C_SJGJDQ;
	}
	/**
	*setC_sjgjdq(java.lang.String)
	*/
	public void setC_sjgjdq(String c_sjgjdq){
		this.C_SJGJDQ=c_sjgjdq;
	}
	/**
	* getN_jjsy(void) 
	*/
	public String getN_jjsy(){
		return this.N_JJSY;
	}
	/**
	*setN_jjsy(java.lang.String)
	*/
	public void setN_jjsy(String n_jjsy){
		this.N_JJSY=n_jjsy;
	}
	/**
	* getN_whzjz(void) 
	*/
	public String getN_whzjz(){
		return this.N_WHZJZ;
	}
	/**
	*setN_whzjz(java.lang.String)
	*/
	public void setN_whzjz(String n_whzjz){
		this.N_WHZJZ=n_whzjz;
	}
	/**
	* getN_jhzjz(void) 
	*/
	public String getN_jhzjz(){
		return this.N_JHZJZ;
	}
	/**
	*setN_jhzjz(java.lang.String)
	*/
	public void setN_jhzjz(String n_jhzjz){
		this.N_JHZJZ=n_jhzjz;
	}
	/**
	* getN_zars(void) 
	*/
	public String getN_zars(){
		return this.N_ZARS;
	}
	/**
	*setN_zars(java.lang.String)
	*/
	public void setN_zars(String n_zars){
		this.N_ZARS=n_zars;
	}
	/**
	* getN_jjets(void) 
	*/
	public String getN_jjets(){
		return this.N_JJETS;
	}
	/**
	*setN_jjets(java.lang.String)
	*/
	public void setN_jjets(String n_jjets){
		this.N_JJETS=n_jjets;
	}
	/**
	* getN_jjfns(void) 
	*/
	public String getN_jjfns(){
		return this.N_JJFNS;
	}
	/**
	*setN_jjfns(java.lang.String)
	*/
	public void setN_jjfns(String n_jjfns){
		this.N_JJFNS=n_jjfns;
	}
	/**
	* getN_jjrzs(void) 
	*/
	public String getN_jjrzs(){
		return this.N_JJRZS;
	}
	/**
	*setN_jjrzs(java.lang.String)
	*/
	public void setN_jjrzs(String n_jjrzs){
		this.N_JJRZS=n_jjrzs;
	}
	/**
	* getN_rysss(void) 
	*/
	public String getN_rysss(){
		return this.N_RYSSS;
	}
	/**
	*setN_rysss(java.lang.String)
	*/
	public void setN_rysss(String n_rysss){
		this.N_RYSSS=n_rysss;
	}
	/**
	* getN_qtshrs(void) 
	*/
	public String getN_qtshrs(){
		return this.N_QTSHRS;
	}
	/**
	*setN_qtshrs(java.lang.String)
	*/
	public void setN_qtshrs(String n_qtshrs){
		this.N_QTSHRS=n_qtshrs;
	}
	/**
	* getN_rysws(void) 
	*/
	public String getN_rysws(){
		return this.N_RYSWS;
	}
	/**
	*setN_rysws(java.lang.String)
	*/
	public void setN_rysws(String n_rysws){
		this.N_RYSWS=n_rysws;
	}
	/**
	* getB_sfyxc(void) 
	*/
	public String getB_sfyxc(){
		return this.B_SFYXC;
	}
	/**
	*setB_sfyxc(java.lang.String)
	*/
	public void setB_sfyxc(String b_sfyxc){
		this.B_SFYXC=b_sfyxc;
	}
	/**
	* getB_sfkcxc(void) 
	*/
	public String getB_sfkcxc(){
		return this.B_SFKCXC;
	}
	/**
	*setB_sfkcxc(java.lang.String)
	*/
	public void setB_sfkcxc(String b_sfkcxc){
		this.B_SFKCXC=b_sfkcxc;
	}
	/**
	* getV_nwgjdx(void) 
	*/
	public String getV_nwgjdx(){
		return this.V_NWGJDX;
	}
	/**
	*setV_nwgjdx(java.lang.String)
	*/
	public void setV_nwgjdx(String v_nwgjdx){
		this.V_NWGJDX=v_nwgjdx;
	}
	/**
	* getB_sfajnwgj(void) 
	*/
	public String getB_sfajnwgj(){
		return this.B_SFAJNWGJ;
	}
	/**
	*setB_sfajnwgj(java.lang.String)
	*/
	public void setB_sfajnwgj(String b_sfajnwgj){
		this.B_SFAJNWGJ=b_sfajnwgj;
	}
	/**
	* getV_fjcabh(void) 
	*/
	public String getV_fjcabh(){
		return this.V_FJCABH;
	}
	/**
	*setV_fjcabh(java.lang.String)
	*/
	public void setV_fjcabh(String v_fjcabh){
		this.V_FJCABH=v_fjcabh;
	}
	/**
	* getV_flajbh(void) 
	*/
	public String getV_flajbh(){
		return this.V_FLAJBH;
	}
	/**
	*setV_flajbh(java.lang.String)
	*/
	public void setV_flajbh(String v_flajbh){
		this.V_FLAJBH=v_flajbh;
	}
	/**
	* getV_sjcabh(void) 
	*/
	public String getV_sjcabh(){
		return this.V_SJCABH;
	}
	/**
	*setV_sjcabh(java.lang.String)
	*/
	public void setV_sjcabh(String v_sjcabh){
		this.V_SJCABH=v_sjcabh;
	}
	/**
	* getV_stcabh(void) 
	*/
	public String getV_stcabh(){
		return this.V_STCABH;
	}
	/**
	*setV_stcabh(java.lang.String)
	*/
	public void setV_stcabh(String v_stcabh){
		this.V_STCABH=v_stcabh;
	}
	/**
	* getB_sfzsfjaj(void) 
	*/
	public String getB_sfzsfjaj(){
		return this.B_SFZSFJAJ;
	}
	/**
	*setB_sfzsfjaj(java.lang.String)
	*/
	public void setB_sfzsfjaj(String b_sfzsfjaj){
		this.B_SFZSFJAJ=b_sfzsfjaj;
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
	* getV_zajbh(void) 
	*/
	public String getV_zajbh(){
		return this.V_ZAJBH;
	}
	/**
	*setV_zajbh(java.lang.String)
	*/
	public void setV_zajbh(String v_zajbh){
		this.V_ZAJBH=v_zajbh;
	}
	/**
	* getB_sfdya(void) 
	*/
	public String getB_sfdya(){
		return this.B_SFDYA;
	}
	/**
	*setB_sfdya(java.lang.String)
	*/
	public void setB_sfdya(String b_sfdya){
		this.B_SFDYA=b_sfdya;
	}
	/**
	* getT_bbsj(void) 
	*/
	public String getT_bbsj(){
		return this.T_BBSJ;
	}
	/**
	*setT_bbsj(java.lang.String)
	*/
	public void setT_bbsj(String t_bbsj){
		this.T_BBSJ=t_bbsj;
	}
	/**
	* getT_bssj(void) 
	*/
	public String getT_bssj(){
		return this.T_BSSJ;
	}
	/**
	*setT_bssj(java.lang.String)
	*/
	public void setT_bssj(String t_bssj){
		this.T_BSSJ=t_bssj;
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
	/**
	* getV_pt_bh(void) 
	*/
	public String getV_pt_bh(){
		return this.V_PT_BH;
	}
	/**
	*setV_pt_bh(java.lang.String)
	*/
	public void setV_pt_bh(String v_pt_bh){
		this.V_PT_BH=v_pt_bh;
	}
	/**
	* getC_pt_ajjd(void) 
	*/
	public String getC_pt_ajjd(){
		return this.C_PT_AJJD;
	}
	/**
	*setC_pt_ajjd(java.lang.String)
	*/
	public void setC_pt_ajjd(String c_pt_ajjd){
		this.C_PT_AJJD=c_pt_ajjd;
	}
	/**
	* getC_pt_ajzt(void) 
	*/
	public String getC_pt_ajzt(){
		return this.C_PT_AJZT;
	}
	/**
	*setC_pt_ajzt(java.lang.String)
	*/
	public void setC_pt_ajzt(String c_pt_ajzt){
		this.C_PT_AJZT=c_pt_ajzt;
	}
	/**
	* getV_jcy_ah(void) 
	*/
	public String getV_jcy_ah(){
		return this.V_JCY_AH;
	}
	/**
	*setV_jcy_ah(java.lang.String)
	*/
	public void setV_jcy_ah(String v_jcy_ah){
		this.V_JCY_AH=v_jcy_ah;
	}
	/**
	* getD_jcy_larq(void) 
	*/
	public String getD_jcy_larq(){
		return this.D_JCY_LARQ;
	}
	/**
	*setD_jcy_larq(java.lang.String)
	*/
	public void setD_jcy_larq(String d_jcy_larq){
		this.D_JCY_LARQ=d_jcy_larq;
	}
	/**
	* getD_jcy_jarq(void) 
	*/
	public String getD_jcy_jarq(){
		return this.D_JCY_JARQ;
	}
	/**
	*setD_jcy_jarq(java.lang.String)
	*/
	public void setD_jcy_jarq(String d_jcy_jarq){
		this.D_JCY_JARQ=d_jcy_jarq;
	}
	/**
	* getC_jcy_cbdw(void) 
	*/
	public String getC_jcy_cbdw(){
		return this.C_JCY_CBDW;
	}
	/**
	*setC_jcy_cbdw(java.lang.String)
	*/
	public void setC_jcy_cbdw(String c_jcy_cbdw){
		this.C_JCY_CBDW=c_jcy_cbdw;
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
	* getD_fy_jarq(void) 
	*/
	public String getD_fy_jarq(){
		return this.D_FY_JARQ;
	}
	/**
	*setD_fy_jarq(java.lang.String)
	*/
	public void setD_fy_jarq(String d_fy_jarq){
		this.D_FY_JARQ=d_fy_jarq;
	}
	/**
	* getC_fy_cbdw(void) 
	*/
	public String getC_fy_cbdw(){
		return this.C_FY_CBDW;
	}
	/**
	*setC_fy_cbdw(java.lang.String)
	*/
	public void setC_fy_cbdw(String c_fy_cbdw){
		this.C_FY_CBDW=c_fy_cbdw;
	}
	/**
	* getN_datatype(void) 
	*/
	public String getN_datatype(){
		return this.N_DATATYPE;
	}
	/**
	*setN_datatype(java.lang.String)
	*/
	public void setN_datatype(String n_datatype){
		this.N_DATATYPE=n_datatype;
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
	* getC_ajmj(void) 
	*/
	public String getC_ajmj(){
		return this.C_AJMJ;
	}
	/**
	*setC_ajmj(java.lang.String)
	*/
	public void setC_ajmj(String c_ajmj){
		this.C_AJMJ=c_ajmj;
	}
	/**
	* getC_ajlb(void) 
	*/
	public String getC_ajlb(){
		return this.C_AJLB;
	}
	/**
	*setC_ajlb(java.lang.String)
	*/
	public void setC_ajlb(String c_ajlb){
		this.C_AJLB=c_ajlb;
	}
	/**
	* getC_spcx(void) 
	*/
	public String getC_spcx(){
		return this.C_SPCX;
	}
	/**
	*setC_spcx(java.lang.String)
	*/
	public void setC_spcx(String c_spcx){
		this.C_SPCX=c_spcx;
	}
	/**
	* getC_ajfab(void) 
	*/
	public String getC_ajfab(){
		return this.C_AJFAB;
	}
	/**
	*setC_ajfab(java.lang.String)
	*/
	public void setC_ajfab(String c_ajfab){
		this.C_AJFAB=c_ajfab;
	}
	/**
	* getC_ajkfxajlb(void) 
	*/
	public String getC_ajkfxajlb(){
		return this.C_AJKFXAJLB;
	}
	/**
	*setC_ajkfxajlb(java.lang.String)
	*/
	public void setC_ajkfxajlb(String c_ajkfxajlb){
		this.C_AJKFXAJLB=c_ajkfxajlb;
	}
	/**
	* getC_ajswqhlb(void) 
	*/
	public String getC_ajswqhlb(){
		return this.C_AJSWQHLB;
	}
	/**
	*setC_ajswqhlb(java.lang.String)
	*/
	public void setC_ajswqhlb(String c_ajswqhlb){
		this.C_AJSWQHLB=c_ajswqhlb;
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
	* getC_ajsx(void) 
	*/
	public String getC_ajsx(){
		return this.C_AJSX;
	}
	/**
	*setC_ajsx(java.lang.String)
	*/
	public void setC_ajsx(String c_ajsx){
		this.C_AJSX=c_ajsx;
	}
	/**
	* getC_ajzt(void) 
	*/
	public String getC_ajzt(){
		return this.C_AJZT;
	}
	/**
	*setC_ajzt(java.lang.String)
	*/
	public void setC_ajzt(String c_ajzt){
		this.C_AJZT=c_ajzt;
	}
	/**
	* getC_ajxz(void) 
	*/
	public String getC_ajxz(){
		return this.C_AJXZ;
	}
	/**
	*setC_ajxz(java.lang.String)
	*/
	public void setC_ajxz(String c_ajxz){
		this.C_AJXZ=c_ajxz;
	}
	/**
	* getC_ajly(void) 
	*/
	public String getC_ajly(){
		return this.C_AJLY;
	}
	/**
	*setC_ajly(java.lang.String)
	*/
	public void setC_ajly(String c_ajly){
		this.C_AJLY=c_ajly;
	}
	/**
	* getV_barxm(void) 
	*/
	public String getV_barxm(){
		return this.V_BARXM;
	}
	/**
	*setV_barxm(java.lang.String)
	*/
	public void setV_barxm(String v_barxm){
		this.V_BARXM=v_barxm;
	}
	/**
	* getC_barxb(void) 
	*/
	public String getC_barxb(){
		return this.C_BARXB;
	}
	/**
	*setC_barxb(java.lang.String)
	*/
	public void setC_barxb(String c_barxb){
		this.C_BARXB=c_barxb;
	}
	/**
	* getD_barcsrq(void) 
	*/
	public String getD_barcsrq(){
		return this.D_BARCSRQ;
	}
	/**
	*setD_barcsrq(java.lang.String)
	*/
	public void setD_barcsrq(String d_barcsrq){
		this.D_BARCSRQ=d_barcsrq;
	}
	/**
	* getV_bardw(void) 
	*/
	public String getV_bardw(){
		return this.V_BARDW;
	}
	/**
	*setV_bardw(java.lang.String)
	*/
	public void setV_bardw(String v_bardw){
		this.V_BARDW=v_bardw;
	}
	/**
	* getV_barlxfs(void) 
	*/
	public String getV_barlxfs(){
		return this.V_BARLXFS;
	}
	/**
	*setV_barlxfs(java.lang.String)
	*/
	public void setV_barlxfs(String v_barlxfs){
		this.V_BARLXFS=v_barlxfs;
	}
	/**
	* getV_barzz(void) 
	*/
	public String getV_barzz(){
		return this.V_BARZZ;
	}
	/**
	*setV_barzz(java.lang.String)
	*/
	public void setV_barzz(String v_barzz){
		this.V_BARZZ=v_barzz;
	}
	/**
	* getC_barzjzl(void) 
	*/
	public String getC_barzjzl(){
		return this.C_BARZJZL;
	}
	/**
	*setC_barzjzl(java.lang.String)
	*/
	public void setC_barzjzl(String c_barzjzl){
		this.C_BARZJZL=c_barzjzl;
	}
	/**
	* getV_barzjhm(void) 
	*/
	public String getV_barzjhm(){
		return this.V_BARZJHM;
	}
	/**
	*setV_barzjhm(java.lang.String)
	*/
	public void setV_barzjhm(String v_barzjhm){
		this.V_BARZJHM=v_barzjhm;
	}
	/**
	* getC_barbmjb(void) 
	*/
	public String getC_barbmjb(){
		return this.C_BARBMJB;
	}
	/**
	*setC_barbmjb(java.lang.String)
	*/
	public void setC_barbmjb(String c_barbmjb){
		this.C_BARBMJB=c_barbmjb;
	}
	/**
	* getT_basj(void) 
	*/
	public String getT_basj(){
		return this.T_BASJ;
	}
	/**
	*setT_basj(java.lang.String)
	*/
	public void setT_basj(String t_basj){
		this.T_BASJ=t_basj;
	}
	/**
	* getV_ajbadwmc(void) 
	*/
	public String getV_ajbadwmc(){
		return this.V_AJBADWMC;
	}
	/**
	*setV_ajbadwmc(java.lang.String)
	*/
	public void setV_ajbadwmc(String v_ajbadwmc){
		this.V_AJBADWMC=v_ajbadwmc;
	}
	/**
	* getV_ajbadwdz(void) 
	*/
	public String getV_ajbadwdz(){
		return this.V_AJBADWDZ;
	}
	/**
	*setV_ajbadwdz(java.lang.String)
	*/
	public void setV_ajbadwdz(String v_ajbadwdz){
		this.V_AJBADWDZ=v_ajbadwdz;
	}
	/**
	* getV_ajbadwlxr(void) 
	*/
	public String getV_ajbadwlxr(){
		return this.V_AJBADWLXR;
	}
	/**
	*setV_ajbadwlxr(java.lang.String)
	*/
	public void setV_ajbadwlxr(String v_ajbadwlxr){
		this.V_AJBADWLXR=v_ajbadwlxr;
	}
	/**
	* getV_ajbadwlxfs(void) 
	*/
	public String getV_ajbadwlxfs(){
		return this.V_AJBADWLXFS;
	}
	/**
	*setV_ajbadwlxfs(java.lang.String)
	*/
	public void setV_ajbadwlxfs(String v_ajbadwlxfs){
		this.V_AJBADWLXFS=v_ajbadwlxfs;
	}
	/**
	* getT_fxsj(void) 
	*/
	public String getT_fxsj(){
		return this.T_FXSJ;
	}
	/**
	*setT_fxsj(java.lang.String)
	*/
	public void setT_fxsj(String t_fxsj){
		this.T_FXSJ=t_fxsj;
	}
	/**
	* getT_fasjsx(void) 
	*/
	public String getT_fasjsx(){
		return this.T_FASJSX;
	}
	/**
	*setT_fasjsx(java.lang.String)
	*/
	public void setT_fasjsx(String t_fasjsx){
		this.T_FASJSX=t_fasjsx;
	}
	/**
	* getT_fasjxx(void) 
	*/
	public String getT_fasjxx(){
		return this.T_FASJXX;
	}
	/**
	*setT_fasjxx(java.lang.String)
	*/
	public void setT_fasjxx(String t_fasjxx){
		this.T_FASJXX=t_fasjxx;
	}
	/**
	* getV_fady(void) 
	*/
	public String getV_fady(){
		return this.V_FADY;
	}
	/**
	*setV_fady(java.lang.String)
	*/
	public void setV_fady(String v_fady){
		this.V_FADY=v_fady;
	}
	/**
	* getV_facs(void) 
	*/
	public String getV_facs(){
		return this.V_FACS;
	}
	/**
	*setV_facs(java.lang.String)
	*/
	public void setV_facs(String v_facs){
		this.V_FACS=v_facs;
	}
	/**
	* getV_fabw(void) 
	*/
	public String getV_fabw(){
		return this.V_FABW;
	}
	/**
	*setV_fabw(java.lang.String)
	*/
	public void setV_fabw(String v_fabw){
		this.V_FABW=v_fabw;
	}
	/**
	* getV_fasjd(void) 
	*/
	public String getV_fasjd(){
		return this.V_FASJD;
	}
	/**
	*setV_fasjd(java.lang.String)
	*/
	public void setV_fasjd(String v_fasjd){
		this.V_FASJD=v_fasjd;
	}
	/**
	* getV_ajssxq(void) 
	*/
	public String getV_ajssxq(){
		return this.V_AJSSXQ;
	}
	/**
	*setV_ajssxq(java.lang.String)
	*/
	public void setV_ajssxq(String v_ajssxq){
		this.V_AJSSXQ=v_ajssxq;
	}
	/**
	* getV_ajjlg(void) 
	*/
	public String getV_ajjlg(){
		return this.V_AJJLG;
	}
	/**
	*setV_ajjlg(java.lang.String)
	*/
	public void setV_ajjlg(String v_ajjlg){
		this.V_AJJLG=v_ajjlg;
	}
	/**
	* getV_ajmlph(void) 
	*/
	public String getV_ajmlph(){
		return this.V_AJMLPH;
	}
	/**
	*setV_ajmlph(java.lang.String)
	*/
	public void setV_ajmlph(String v_ajmlph){
		this.V_AJMLPH=v_ajmlph;
	}
	/**
	* getV_ajmphz(void) 
	*/
	public String getV_ajmphz(){
		return this.V_AJMPHZ;
	}
	/**
	*setV_ajmphz(java.lang.String)
	*/
	public void setV_ajmphz(String v_ajmphz){
		this.V_AJMPHZ=v_ajmphz;
	}
	/**
	* getV_ajmlxz(void) 
	*/
	public String getV_ajmlxz(){
		return this.V_AJMLXZ;
	}
	/**
	*setV_ajmlxz(java.lang.String)
	*/
	public void setV_ajmlxz(String v_ajmlxz){
		this.V_AJMLXZ=v_ajmlxz;
	}
	/**
	* getV_ajxxdzmc(void) 
	*/
	public String getV_ajxxdzmc(){
		return this.V_AJXXDZMC;
	}
	/**
	*setV_ajxxdzmc(java.lang.String)
	*/
	public void setV_ajxxdzmc(String v_ajxxdzmc){
		this.V_AJXXDZMC=v_ajxxdzmc;
	}
	/**
	* getV_ajsszrq(void) 
	*/
	public String getV_ajsszrq(){
		return this.V_AJSSZRQ;
	}
	/**
	*setV_ajsszrq(java.lang.String)
	*/
	public void setV_ajsszrq(String v_ajsszrq){
		this.V_AJSSZRQ=v_ajsszrq;
	}
	/**
	* getV_ajsszrqmc(void) 
	*/
	public String getV_ajsszrqmc(){
		return this.V_AJSSZRQMC;
	}
	/**
	*setV_ajsszrqmc(java.lang.String)
	*/
	public void setV_ajsszrqmc(String v_ajsszrqmc){
		this.V_AJSSZRQMC=v_ajsszrqmc;
	}
	/**
	* getT_slsj(void) 
	*/
	public String getT_slsj(){
		return this.T_SLSJ;
	}
	/**
	*setT_slsj(java.lang.String)
	*/
	public void setT_slsj(String t_slsj){
		this.T_SLSJ=t_slsj;
	}
	/**
	* getC_slr(void) 
	*/
	public String getC_slr(){
		return this.C_SLR;
	}
	/**
	*setC_slr(java.lang.String)
	*/
	public void setC_slr(String c_slr){
		this.C_SLR=c_slr;
	}
	/**
	* getV_slrmc(void) 
	*/
	public String getV_slrmc(){
		return this.V_SLRMC;
	}
	/**
	*setV_slrmc(java.lang.String)
	*/
	public void setV_slrmc(String v_slrmc){
		this.V_SLRMC=v_slrmc;
	}
	/**
	* getC_sldw(void) 
	*/
	public String getC_sldw(){
		return this.C_SLDW;
	}
	/**
	*setC_sldw(java.lang.String)
	*/
	public void setC_sldw(String c_sldw){
		this.C_SLDW=c_sldw;
	}
	/**
	* getV_sldwmc(void) 
	*/
	public String getV_sldwmc(){
		return this.V_SLDWMC;
	}
	/**
	*setV_sldwmc(java.lang.String)
	*/
	public void setV_sldwmc(String v_sldwmc){
		this.V_SLDWMC=v_sldwmc;
	}
	/**
	* getV_sldwlxdh(void) 
	*/
	public String getV_sldwlxdh(){
		return this.V_SLDWLXDH;
	}
	/**
	*setV_sldwlxdh(java.lang.String)
	*/
	public void setV_sldwlxdh(String v_sldwlxdh){
		this.V_SLDWLXDH=v_sldwlxdh;
	}
	/**
	* getC_slfs(void) 
	*/
	public String getC_slfs(){
		return this.C_SLFS;
	}
	/**
	*setC_slfs(java.lang.String)
	*/
	public void setC_slfs(String c_slfs){
		this.C_SLFS=c_slfs;
	}
	/**
	* getV_jyaq(void) 
	*/
	public String getV_jyaq(){
		return this.V_JYAQ;
	}
	/**
	*setV_jyaq(java.lang.String)
	*/
	public void setV_jyaq(String v_jyaq){
		this.V_JYAQ=v_jyaq;
	}
	/**
	* getC_zbdw(void) 
	*/
	public String getC_zbdw(){
		return this.C_ZBDW;
	}
	/**
	*setC_zbdw(java.lang.String)
	*/
	public void setC_zbdw(String c_zbdw){
		this.C_ZBDW=c_zbdw;
	}
	/**
	* getV_zbdwmc(void) 
	*/
	public String getV_zbdwmc(){
		return this.V_ZBDWMC;
	}
	/**
	*setV_zbdwmc(java.lang.String)
	*/
	public void setV_zbdwmc(String v_zbdwmc){
		this.V_ZBDWMC=v_zbdwmc;
	}
	/**
	* getC_ajxbdw(void) 
	*/
	public String getC_ajxbdw(){
		return this.C_AJXBDW;
	}
	/**
	*setC_ajxbdw(java.lang.String)
	*/
	public void setC_ajxbdw(String c_ajxbdw){
		this.C_AJXBDW=c_ajxbdw;
	}
	/**
	* getV_ajxbdwmc(void) 
	*/
	public String getV_ajxbdwmc(){
		return this.V_AJXBDWMC;
	}
	/**
	*setV_ajxbdwmc(java.lang.String)
	*/
	public void setV_ajxbdwmc(String v_ajxbdwmc){
		this.V_AJXBDWMC=v_ajxbdwmc;
	}
	/**
	* getC_zsbadw(void) 
	*/
	public String getC_zsbadw(){
		return this.C_ZSBADW;
	}
	/**
	*setC_zsbadw(java.lang.String)
	*/
	public void setC_zsbadw(String c_zsbadw){
		this.C_ZSBADW=c_zsbadw;
	}
	/**
	* getV_zsbadwmc(void) 
	*/
	public String getV_zsbadwmc(){
		return this.V_ZSBADWMC;
	}
	/**
	*setV_zsbadwmc(java.lang.String)
	*/
	public void setV_zsbadwmc(String v_zsbadwmc){
		this.V_ZSBADWMC=v_zsbadwmc;
	}
	/**
	* getC_zbr(void) 
	*/
	public String getC_zbr(){
		return this.C_ZBR;
	}
	/**
	*setC_zbr(java.lang.String)
	*/
	public void setC_zbr(String c_zbr){
		this.C_ZBR=c_zbr;
	}
	/**
	* getV_zbrmc(void) 
	*/
	public String getV_zbrmc(){
		return this.V_ZBRMC;
	}
	/**
	*setV_zbrmc(java.lang.String)
	*/
	public void setV_zbrmc(String v_zbrmc){
		this.V_ZBRMC=v_zbrmc;
	}
	/**
	* getV_zbrdh(void) 
	*/
	public String getV_zbrdh(){
		return this.V_ZBRDH;
	}
	/**
	*setV_zbrdh(java.lang.String)
	*/
	public void setV_zbrdh(String v_zbrdh){
		this.V_ZBRDH=v_zbrdh;
	}
	/**
	* getC_xbr(void) 
	*/
	public String getC_xbr(){
		return this.C_XBR;
	}
	/**
	*setC_xbr(java.lang.String)
	*/
	public void setC_xbr(String c_xbr){
		this.C_XBR=c_xbr;
	}
	/**
	* getV_xbrxm(void) 
	*/
	public String getV_xbrxm(){
		return this.V_XBRXM;
	}
	/**
	*setV_xbrxm(java.lang.String)
	*/
	public void setV_xbrxm(String v_xbrxm){
		this.V_XBRXM=v_xbrxm;
	}
	/**
	* getC_ladw(void) 
	*/
	public String getC_ladw(){
		return this.C_LADW;
	}
	/**
	*setC_ladw(java.lang.String)
	*/
	public void setC_ladw(String c_ladw){
		this.C_LADW=c_ladw;
	}
	/**
	* getV_ladwmc(void) 
	*/
	public String getV_ladwmc(){
		return this.V_LADWMC;
	}
	/**
	*setV_ladwmc(java.lang.String)
	*/
	public void setV_ladwmc(String v_ladwmc){
		this.V_LADWMC=v_ladwmc;
	}
	/**
	* getT_lasj(void) 
	*/
	public String getT_lasj(){
		return this.T_LASJ;
	}
	/**
	*setT_lasj(java.lang.String)
	*/
	public void setT_lasj(String t_lasj){
		this.T_LASJ=t_lasj;
	}
	/**
	* getC_lapzr(void) 
	*/
	public String getC_lapzr(){
		return this.C_LAPZR;
	}
	/**
	*setC_lapzr(java.lang.String)
	*/
	public void setC_lapzr(String c_lapzr){
		this.C_LAPZR=c_lapzr;
	}
	/**
	* getV_lapzrxm(void) 
	*/
	public String getV_lapzrxm(){
		return this.V_LAPZRXM;
	}
	/**
	*setV_lapzrxm(java.lang.String)
	*/
	public void setV_lapzrxm(String v_lapzrxm){
		this.V_LAPZRXM=v_lapzrxm;
	}
	/**
	* getT_lascdqsj(void) 
	*/
	public String getT_lascdqsj(){
		return this.T_LASCDQSJ;
	}
	/**
	*setT_lascdqsj(java.lang.String)
	*/
	public void setT_lascdqsj(String t_lascdqsj){
		this.T_LASCDQSJ=t_lascdqsj;
	}
	/**
	* getT_lascsj(void) 
	*/
	public String getT_lascsj(){
		return this.T_LASCSJ;
	}
	/**
	*setT_lascsj(java.lang.String)
	*/
	public void setT_lascsj(String t_lascsj){
		this.T_LASCSJ=t_lascsj;
	}
	/**
	* getB_sfza(void) 
	*/
	public String getB_sfza(){
		return this.B_SFZA;
	}
	/**
	*setB_sfza(java.lang.String)
	*/
	public void setB_sfza(String b_sfza){
		this.B_SFZA=b_sfza;
	}
	/**
	* getV_blyy(void) 
	*/
	public String getV_blyy(){
		return this.V_BLYY;
	}
	/**
	*setV_blyy(java.lang.String)
	*/
	public void setV_blyy(String v_blyy){
		this.V_BLYY=v_blyy;
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
	* getC_dbjb(void) 
	*/
	public String getC_dbjb(){
		return this.C_DBJB;
	}
	/**
	*setC_dbjb(java.lang.String)
	*/
	public void setC_dbjb(String c_dbjb){
		this.C_DBJB=c_dbjb;
	}
	/**
	* getV_dbbh(void) 
	*/
	public String getV_dbbh(){
		return this.V_DBBH;
	}
	/**
	*setV_dbbh(java.lang.String)
	*/
	public void setV_dbbh(String v_dbbh){
		this.V_DBBH=v_dbbh;
	}


}