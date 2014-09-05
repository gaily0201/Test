package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGajAjxxSacwBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_sacw_b")
public class CrpasGajAjxxSacwBVO {
	/**
	* C_CLZT 物品状态
	*/
	@Column(columnName="c_clzt",dataType="varchar",dataLength=20,nullAble="Y",comment="物品状态")
	private String C_CLZT = "c_clzt";
	/**
	* C_ZJDW 追缴单位id
	*/
	@Column(columnName="c_zjdw",dataType="varchar",dataLength=20,nullAble="Y",comment="追缴单位id")
	private String C_ZJDW = "c_zjdw";
	/**
	* V_ZJDWMC 追缴单位名称
	*/
	@Column(columnName="v_zjdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="追缴单位名称")
	private String V_ZJDWMC = "v_zjdwmc";
	/**
	* T_ZJSJ 追缴时间
	*/
	@Column(columnName="t_zjsj",dataType="char",dataLength=19,nullAble="Y",comment="追缴时间")
	private String T_ZJSJ = "t_zjsj";
	/**
	* V_JYSM 简要说明
	*/
	@Column(columnName="v_jysm",dataType="varchar",dataLength=2000,nullAble="Y",comment="简要说明")
	private String V_JYSM = "v_jysm";
	/**
	* C_CLDW 处理单位id
	*/
	@Column(columnName="c_cldw",dataType="varchar",dataLength=20,nullAble="Y",comment="处理单位id")
	private String C_CLDW = "c_cldw";
	/**
	* V_CLDWMC 处理单位名称
	*/
	@Column(columnName="v_cldwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="处理单位名称")
	private String V_CLDWMC = "v_cldwmc";
	/**
	* D_CLRQ 处理日期
	*/
	@Column(columnName="d_clrq",dataType="char",dataLength=19,nullAble="Y",comment="处理日期")
	private String D_CLRQ = "d_clrq";
	/**
	* V_CL_HPZL 涉案车辆－号牌种类
	*/
	@Column(columnName="v_cl_hpzl",dataType="varchar",dataLength=20,nullAble="Y",comment="涉案车辆－号牌种类")
	private String V_CL_HPZL = "v_cl_hpzl";
	/**
	* C_CL_CLLX 涉案车辆－车辆类型
	*/
	@Column(columnName="c_cl_cllx",dataType="varchar",dataLength=20,nullAble="Y",comment="涉案车辆－车辆类型")
	private String C_CL_CLLX = "c_cl_cllx";
	/**
	* V_CL_CSYS 涉案车辆－车身颜色
	*/
	@Column(columnName="v_cl_csys",dataType="varchar",dataLength=20,nullAble="Y",comment="涉案车辆－车身颜色")
	private String V_CL_CSYS = "v_cl_csys";
	/**
	* V_CL_CZXM 涉案车辆－车主姓名
	*/
	@Column(columnName="v_cl_czxm",dataType="varchar",dataLength=50,nullAble="Y",comment="涉案车辆－车主姓名")
	private String V_CL_CZXM = "v_cl_czxm";
	/**
	* V_CL_CZSFZ 涉案车辆－车主身份证号
	*/
	@Column(columnName="v_cl_czsfz",dataType="varchar",dataLength=50,nullAble="Y",comment="涉案车辆－车主身份证号")
	private String V_CL_CZSFZ = "v_cl_czsfz";
	/**
	* V_CL_CZDZ 涉案车辆－车主地址
	*/
	@Column(columnName="v_cl_czdz",dataType="varchar",dataLength=100,nullAble="Y",comment="涉案车辆－车主地址")
	private String V_CL_CZDZ = "v_cl_czdz";
	/**
	* V_CL_CZLXDH 涉案车辆－车主联系电话
	*/
	@Column(columnName="v_cl_czlxdh",dataType="varchar",dataLength=50,nullAble="Y",comment="涉案车辆－车主联系电话")
	private String V_CL_CZLXDH = "v_cl_czlxdh";
	/**
	* V_CL_BXQK 涉案车辆－保险情况
	*/
	@Column(columnName="v_cl_bxqk",dataType="varchar",dataLength=100,nullAble="Y",comment="涉案车辆－保险情况")
	private String V_CL_BXQK = "v_cl_bxqk";
	/**
	* B_CL_SFYBDQBX 涉案车辆－是否有被盗抢保险
	*/
	@Column(columnName="b_cl_sfybdqbx",dataType="char",dataLength=1,nullAble="Y",comment="涉案车辆－是否有被盗抢保险")
	private String B_CL_SFYBDQBX = "b_cl_sfybdqbx";
	/**
	* T_CL_CCDJSJ 涉案车辆－初次登记时间
	*/
	@Column(columnName="t_cl_ccdjsj",dataType="char",dataLength=19,nullAble="Y",comment="涉案车辆－初次登记时间")
	private String T_CL_CCDJSJ = "t_cl_ccdjsj";
	/**
	* N_QZ_KJ 涉案枪支－口径
	*/
	@Column(columnName="n_qz_kj",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案枪支－口径")
	private String N_QZ_KJ = "n_qz_kj";
	/**
	* D_QZ_FZRQ 涉案枪支－发证日期
	*/
	@Column(columnName="d_qz_fzrq",dataType="char",dataLength=19,nullAble="Y",comment="涉案枪支－发证日期")
	private String D_QZ_FZRQ = "d_qz_fzrq";
	/**
	* V_QZ_CQRDW 涉案枪支－持枪人单位
	*/
	@Column(columnName="v_qz_cqrdw",dataType="varchar",dataLength=100,nullAble="Y",comment="涉案枪支－持枪人单位")
	private String V_QZ_CQRDW = "v_qz_cqrdw";
	/**
	* N_QZ_ZDSM 涉案枪支－枪支子弹数目
	*/
	@Column(columnName="n_qz_zdsm",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案枪支－枪支子弹数目")
	private String N_QZ_ZDSM = "n_qz_zdsm";
	/**
	* N_ZJMZ 证券面值
	*/
	@Column(columnName="n_zjmz",dataType="decimal",dataLength=20,nullAble="Y",comment="证券面值")
	private String N_ZJMZ = "n_zjmz";
	/**
	* V_FXDW 发行单位
	*/
	@Column(columnName="v_fxdw",dataType="varchar",dataLength=100,nullAble="Y",comment="发行单位")
	private String V_FXDW = "v_fxdw";
	/**
	* D_FXRQ 发行日期
	*/
	@Column(columnName="d_fxrq",dataType="char",dataLength=19,nullAble="Y",comment="发行日期")
	private String D_FXRQ = "d_fxrq";
	/**
	* N_FXQX 发行期限
	*/
	@Column(columnName="n_fxqx",dataType="decimal",dataLength=20,nullAble="Y",comment="发行期限")
	private String N_FXQX = "n_fxqx";
	/**
	* V_DP_ZDMD 涉案毒品－种毒目的
	*/
	@Column(columnName="v_dp_zdmd",dataType="varchar",dataLength=50,nullAble="Y",comment="涉案毒品－种毒目的")
	private String V_DP_ZDMD = "v_dp_zdmd";
	/**
	* V_DP_LYD 涉案毒品－来源地
	*/
	@Column(columnName="v_dp_lyd",dataType="varchar",dataLength=100,nullAble="Y",comment="涉案毒品－来源地")
	private String V_DP_LYD = "v_dp_lyd";
	/**
	* V_DP_XSFX 涉案毒品－销售方向
	*/
	@Column(columnName="v_dp_xsfx",dataType="varchar",dataLength=100,nullAble="Y",comment="涉案毒品－销售方向")
	private String V_DP_XSFX = "v_dp_xsfx";
	/**
	* V_DP_WZPM 涉案毒品－伪装品名
	*/
	@Column(columnName="v_dp_wzpm",dataType="varchar",dataLength=50,nullAble="Y",comment="涉案毒品－伪装品名")
	private String V_DP_WZPM = "v_dp_wzpm";
	/**
	* C_WPLY 物品来源
	*/
	@Column(columnName="c_wply",dataType="varchar",dataLength=20,nullAble="Y",comment="物品来源")
	private String C_WPLY = "c_wply";
	/**
	* V_JAWSMC 经案文书名称
	*/
	@Column(columnName="v_jawsmc",dataType="varchar",dataLength=50,nullAble="Y",comment="经案文书名称")
	private String V_JAWSMC = "v_jawsmc";
	/**
	* V_LYPDBH 经案物品－来源凭单编号
	*/
	@Column(columnName="v_lypdbh",dataType="varchar",dataLength=50,nullAble="Y",comment="经案物品－来源凭单编号")
	private String V_LYPDBH = "v_lypdbh";
	/**
	* V_WPZJLY 物品证据来源
	*/
	@Column(columnName="v_wpzjly",dataType="varchar",dataLength=50,nullAble="Y",comment="物品证据来源")
	private String V_WPZJLY = "v_wpzjly";
	/**
	* V_CLPZBH 经案物品－处理凭证编号
	*/
	@Column(columnName="v_clpzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="经案物品－处理凭证编号")
	private String V_CLPZBH = "v_clpzbh";
	/**
	* C_ZJPZ 经案物品－证据品质
	*/
	@Column(columnName="c_zjpz",dataType="varchar",dataLength=20,nullAble="Y",comment="经案物品－证据品质")
	private String C_ZJPZ = "c_zjpz";
	/**
	* N_DP_JHSL 涉案毒品－缴获重量
	*/
	@Column(columnName="n_dp_jhsl",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案毒品－缴获重量")
	private String N_DP_JHSL = "n_dp_jhsl";
	/**
	* N_DP_CCZL 涉案毒品－初查重量
	*/
	@Column(columnName="n_dp_cczl",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案毒品－初查重量")
	private String N_DP_CCZL = "n_dp_cczl";
	/**
	* N_DP_CZZL 涉案毒品－查证重量
	*/
	@Column(columnName="n_dp_czzl",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案毒品－查证重量")
	private String N_DP_CZZL = "n_dp_czzl";
	/**
	* N_DP_GJJG 涉案毒品－购进价格
	*/
	@Column(columnName="n_dp_gjjg",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案毒品－购进价格")
	private String N_DP_GJJG = "n_dp_gjjg";
	/**
	* N_DP_MCJG 涉案毒品－卖出价格
	*/
	@Column(columnName="n_dp_mcjg",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案毒品－卖出价格")
	private String N_DP_MCJG = "n_dp_mcjg";
	/**
	* C_JZWPSX 经侦物品属性
	*/
	@Column(columnName="c_jzwpsx",dataType="varchar",dataLength=20,nullAble="Y",comment="经侦物品属性")
	private String C_JZWPSX = "c_jzwpsx";
	/**
	* V_CL_CJH 涉案车辆-车架号
	*/
	@Column(columnName="v_cl_cjh",dataType="varchar",dataLength=50,nullAble="Y",comment="涉案车辆-车架号")
	private String V_CL_CJH = "v_cl_cjh";
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
	* V_JLBH 物品编号
	*/
	@Column(columnName="v_jlbh",dataType="varchar",dataLength=50,nullAble="Y",comment="物品编号")
	private String V_JLBH = "v_jlbh";
	/**
	* V_AJBH 物品案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="物品案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* V_RYBH 物品人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=50,nullAble="Y",comment="物品人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* V_WPLYMC 物品来源名称
	*/
	@Column(columnName="v_wplymc",dataType="varchar",dataLength=100,nullAble="Y",comment="物品来源名称")
	private String V_WPLYMC = "v_wplymc";
	/**
	* PK_GAJ_AJXX_H 公安案件登记主表_主键
	*/
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="公安案件登记主表_主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* C_WPXZ 物品性质
	*/
	@Column(columnName="c_wpxz",dataType="varchar",dataLength=20,nullAble="Y",comment="物品性质")
	private String C_WPXZ = "c_wpxz";
	/**
	* PK_GAJ_AJXX_SACW_B 子表主键
	*/
	@Column(columnName="pk_gaj_ajxx_sacw_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GAJ_AJXX_SACW_B = "pk_gaj_ajxx_sacw_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_WPSYR 物品所有人id
	*/
	@Column(columnName="c_wpsyr",dataType="char",dataLength=20,nullAble="Y",comment="物品所有人id")
	private String C_WPSYR = "c_wpsyr";
	/**
	* V_WPSYRMC 物品所有人名称
	*/
	@Column(columnName="v_wpsyrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="物品所有人名称")
	private String V_WPSYRMC = "v_wpsyrmc";
	/**
	* C_WPLX 物品类型
	*/
	@Column(columnName="c_wplx",dataType="varchar",dataLength=20,nullAble="Y",comment="物品类型")
	private String C_WPLX = "c_wplx";
	/**
	* V_WPMC 物品名称
	*/
	@Column(columnName="v_wpmc",dataType="varchar",dataLength=50,nullAble="Y",comment="物品名称")
	private String V_WPMC = "v_wpmc";
	/**
	* C_WPCD 物品产地
	*/
	@Column(columnName="c_wpcd",dataType="varchar",dataLength=20,nullAble="Y",comment="物品产地")
	private String C_WPCD = "c_wpcd";
	/**
	* V_WPCP 物品厂牌
	*/
	@Column(columnName="v_wpcp",dataType="varchar",dataLength=100,nullAble="Y",comment="物品厂牌")
	private String V_WPCP = "v_wpcp";
	/**
	* V_WPXH 物品型号
	*/
	@Column(columnName="v_wpxh",dataType="varchar",dataLength=50,nullAble="Y",comment="物品型号")
	private String V_WPXH = "v_wpxh";
	/**
	* V_WPGG 物品规格
	*/
	@Column(columnName="v_wpgg",dataType="varchar",dataLength=50,nullAble="Y",comment="物品规格")
	private String V_WPGG = "v_wpgg";
	/**
	* V_WPYS 物品式样
	*/
	@Column(columnName="v_wpys",dataType="varchar",dataLength=50,nullAble="Y",comment="物品式样")
	private String V_WPYS = "v_wpys";
	/**
	* V_WPZD 物品质地
	*/
	@Column(columnName="v_wpzd",dataType="varchar",dataLength=50,nullAble="Y",comment="物品质地")
	private String V_WPZD = "v_wpzd";
	/**
	* V_WPCS 物品成色
	*/
	@Column(columnName="v_wpcs",dataType="varchar",dataLength=50,nullAble="Y",comment="物品成色")
	private String V_WPCS = "v_wpcs";
	/**
	* C_WPYS 物品颜色
	*/
	@Column(columnName="c_wpys",dataType="varchar",dataLength=20,nullAble="Y",comment="物品颜色")
	private String C_WPYS = "c_wpys";
	/**
	* N_WPJZ 物品价值
	*/
	@Column(columnName="n_wpjz",dataType="decimal",dataLength=20,nullAble="Y",comment="物品价值")
	private String N_WPJZ = "n_wpjz";
	/**
	* D_GMRQ 购买日期
	*/
	@Column(columnName="d_gmrq",dataType="char",dataLength=19,nullAble="Y",comment="购买日期")
	private String D_GMRQ = "d_gmrq";
	/**
	* V_AWCYR 持有人
	*/
	@Column(columnName="v_awcyr",dataType="varchar",dataLength=100,nullAble="Y",comment="持有人")
	private String V_AWCYR = "v_awcyr";
	/**
	* N_WPSL 物品数量
	*/
	@Column(columnName="n_wpsl",dataType="decimal",dataLength=20,nullAble="Y",comment="物品数量")
	private String N_WPSL = "n_wpsl";
	/**
	* C_WPSLDW 物品数量单位
	*/
	@Column(columnName="c_wpsldw",dataType="varchar",dataLength=20,nullAble="Y",comment="物品数量单位")
	private String C_WPSLDW = "c_wpsldw";
	/**
	* N_WPZLHCD 物品重量/长度
	*/
	@Column(columnName="n_wpzlhcd",dataType="decimal",dataLength=20,nullAble="Y",comment="物品重量/长度")
	private String N_WPZLHCD = "n_wpzlhcd";
	/**
	* C_WPZLHCDDW 物品重量/长度单位
	*/
	@Column(columnName="c_wpzlhcddw",dataType="varchar",dataLength=20,nullAble="Y",comment="物品重量/长度单位")
	private String C_WPZLHCDDW = "c_wpzlhcddw";
	/**
	* V_BH1 编号一
	*/
	@Column(columnName="v_bh1",dataType="varchar",dataLength=50,nullAble="Y",comment="编号一")
	private String V_BH1 = "v_bh1";
	/**
	* V_BH2 编号二
	*/
	@Column(columnName="v_bh2",dataType="varchar",dataLength=50,nullAble="Y",comment="编号二")
	private String V_BH2 = "v_bh2";
	/**
	* V_BH3 编号三
	*/
	@Column(columnName="v_bh3",dataType="varchar",dataLength=50,nullAble="Y",comment="编号三")
	private String V_BH3 = "v_bh3";
	/**
	* V_BH4 编号四
	*/
	@Column(columnName="v_bh4",dataType="varchar",dataLength=50,nullAble="Y",comment="编号四")
	private String V_BH4 = "v_bh4";
	/**
	* V_BH5 编号五
	*/
	@Column(columnName="v_bh5",dataType="varchar",dataLength=50,nullAble="Y",comment="编号五")
	private String V_BH5 = "v_bh5";
	/**
	* N_SSJZ 损失价值
	*/
	@Column(columnName="n_ssjz",dataType="decimal",dataLength=20,nullAble="Y",comment="损失价值")
	private String N_SSJZ = "n_ssjz";
	/**
	* N_WHSSJZ 挽回损失价值
	*/
	@Column(columnName="n_whssjz",dataType="decimal",dataLength=20,nullAble="Y",comment="挽回损失价值")
	private String N_WHSSJZ = "n_whssjz";
	/**
	* getC_clzt(void) 
	*/
	public String getC_clzt(){
		return this.C_CLZT;
	}
	/**
	*setC_clzt(java.lang.String)
	*/
	public void setC_clzt(String c_clzt){
		this.C_CLZT=c_clzt;
	}
	/**
	* getC_zjdw(void) 
	*/
	public String getC_zjdw(){
		return this.C_ZJDW;
	}
	/**
	*setC_zjdw(java.lang.String)
	*/
	public void setC_zjdw(String c_zjdw){
		this.C_ZJDW=c_zjdw;
	}
	/**
	* getV_zjdwmc(void) 
	*/
	public String getV_zjdwmc(){
		return this.V_ZJDWMC;
	}
	/**
	*setV_zjdwmc(java.lang.String)
	*/
	public void setV_zjdwmc(String v_zjdwmc){
		this.V_ZJDWMC=v_zjdwmc;
	}
	/**
	* getT_zjsj(void) 
	*/
	public String getT_zjsj(){
		return this.T_ZJSJ;
	}
	/**
	*setT_zjsj(java.lang.String)
	*/
	public void setT_zjsj(String t_zjsj){
		this.T_ZJSJ=t_zjsj;
	}
	/**
	* getV_jysm(void) 
	*/
	public String getV_jysm(){
		return this.V_JYSM;
	}
	/**
	*setV_jysm(java.lang.String)
	*/
	public void setV_jysm(String v_jysm){
		this.V_JYSM=v_jysm;
	}
	/**
	* getC_cldw(void) 
	*/
	public String getC_cldw(){
		return this.C_CLDW;
	}
	/**
	*setC_cldw(java.lang.String)
	*/
	public void setC_cldw(String c_cldw){
		this.C_CLDW=c_cldw;
	}
	/**
	* getV_cldwmc(void) 
	*/
	public String getV_cldwmc(){
		return this.V_CLDWMC;
	}
	/**
	*setV_cldwmc(java.lang.String)
	*/
	public void setV_cldwmc(String v_cldwmc){
		this.V_CLDWMC=v_cldwmc;
	}
	/**
	* getD_clrq(void) 
	*/
	public String getD_clrq(){
		return this.D_CLRQ;
	}
	/**
	*setD_clrq(java.lang.String)
	*/
	public void setD_clrq(String d_clrq){
		this.D_CLRQ=d_clrq;
	}
	/**
	* getV_cl_hpzl(void) 
	*/
	public String getV_cl_hpzl(){
		return this.V_CL_HPZL;
	}
	/**
	*setV_cl_hpzl(java.lang.String)
	*/
	public void setV_cl_hpzl(String v_cl_hpzl){
		this.V_CL_HPZL=v_cl_hpzl;
	}
	/**
	* getC_cl_cllx(void) 
	*/
	public String getC_cl_cllx(){
		return this.C_CL_CLLX;
	}
	/**
	*setC_cl_cllx(java.lang.String)
	*/
	public void setC_cl_cllx(String c_cl_cllx){
		this.C_CL_CLLX=c_cl_cllx;
	}
	/**
	* getV_cl_csys(void) 
	*/
	public String getV_cl_csys(){
		return this.V_CL_CSYS;
	}
	/**
	*setV_cl_csys(java.lang.String)
	*/
	public void setV_cl_csys(String v_cl_csys){
		this.V_CL_CSYS=v_cl_csys;
	}
	/**
	* getV_cl_czxm(void) 
	*/
	public String getV_cl_czxm(){
		return this.V_CL_CZXM;
	}
	/**
	*setV_cl_czxm(java.lang.String)
	*/
	public void setV_cl_czxm(String v_cl_czxm){
		this.V_CL_CZXM=v_cl_czxm;
	}
	/**
	* getV_cl_czsfz(void) 
	*/
	public String getV_cl_czsfz(){
		return this.V_CL_CZSFZ;
	}
	/**
	*setV_cl_czsfz(java.lang.String)
	*/
	public void setV_cl_czsfz(String v_cl_czsfz){
		this.V_CL_CZSFZ=v_cl_czsfz;
	}
	/**
	* getV_cl_czdz(void) 
	*/
	public String getV_cl_czdz(){
		return this.V_CL_CZDZ;
	}
	/**
	*setV_cl_czdz(java.lang.String)
	*/
	public void setV_cl_czdz(String v_cl_czdz){
		this.V_CL_CZDZ=v_cl_czdz;
	}
	/**
	* getV_cl_czlxdh(void) 
	*/
	public String getV_cl_czlxdh(){
		return this.V_CL_CZLXDH;
	}
	/**
	*setV_cl_czlxdh(java.lang.String)
	*/
	public void setV_cl_czlxdh(String v_cl_czlxdh){
		this.V_CL_CZLXDH=v_cl_czlxdh;
	}
	/**
	* getV_cl_bxqk(void) 
	*/
	public String getV_cl_bxqk(){
		return this.V_CL_BXQK;
	}
	/**
	*setV_cl_bxqk(java.lang.String)
	*/
	public void setV_cl_bxqk(String v_cl_bxqk){
		this.V_CL_BXQK=v_cl_bxqk;
	}
	/**
	* getB_cl_sfybdqbx(void) 
	*/
	public String getB_cl_sfybdqbx(){
		return this.B_CL_SFYBDQBX;
	}
	/**
	*setB_cl_sfybdqbx(java.lang.String)
	*/
	public void setB_cl_sfybdqbx(String b_cl_sfybdqbx){
		this.B_CL_SFYBDQBX=b_cl_sfybdqbx;
	}
	/**
	* getT_cl_ccdjsj(void) 
	*/
	public String getT_cl_ccdjsj(){
		return this.T_CL_CCDJSJ;
	}
	/**
	*setT_cl_ccdjsj(java.lang.String)
	*/
	public void setT_cl_ccdjsj(String t_cl_ccdjsj){
		this.T_CL_CCDJSJ=t_cl_ccdjsj;
	}
	/**
	* getN_qz_kj(void) 
	*/
	public String getN_qz_kj(){
		return this.N_QZ_KJ;
	}
	/**
	*setN_qz_kj(java.lang.String)
	*/
	public void setN_qz_kj(String n_qz_kj){
		this.N_QZ_KJ=n_qz_kj;
	}
	/**
	* getD_qz_fzrq(void) 
	*/
	public String getD_qz_fzrq(){
		return this.D_QZ_FZRQ;
	}
	/**
	*setD_qz_fzrq(java.lang.String)
	*/
	public void setD_qz_fzrq(String d_qz_fzrq){
		this.D_QZ_FZRQ=d_qz_fzrq;
	}
	/**
	* getV_qz_cqrdw(void) 
	*/
	public String getV_qz_cqrdw(){
		return this.V_QZ_CQRDW;
	}
	/**
	*setV_qz_cqrdw(java.lang.String)
	*/
	public void setV_qz_cqrdw(String v_qz_cqrdw){
		this.V_QZ_CQRDW=v_qz_cqrdw;
	}
	/**
	* getN_qz_zdsm(void) 
	*/
	public String getN_qz_zdsm(){
		return this.N_QZ_ZDSM;
	}
	/**
	*setN_qz_zdsm(java.lang.String)
	*/
	public void setN_qz_zdsm(String n_qz_zdsm){
		this.N_QZ_ZDSM=n_qz_zdsm;
	}
	/**
	* getN_zjmz(void) 
	*/
	public String getN_zjmz(){
		return this.N_ZJMZ;
	}
	/**
	*setN_zjmz(java.lang.String)
	*/
	public void setN_zjmz(String n_zjmz){
		this.N_ZJMZ=n_zjmz;
	}
	/**
	* getV_fxdw(void) 
	*/
	public String getV_fxdw(){
		return this.V_FXDW;
	}
	/**
	*setV_fxdw(java.lang.String)
	*/
	public void setV_fxdw(String v_fxdw){
		this.V_FXDW=v_fxdw;
	}
	/**
	* getD_fxrq(void) 
	*/
	public String getD_fxrq(){
		return this.D_FXRQ;
	}
	/**
	*setD_fxrq(java.lang.String)
	*/
	public void setD_fxrq(String d_fxrq){
		this.D_FXRQ=d_fxrq;
	}
	/**
	* getN_fxqx(void) 
	*/
	public String getN_fxqx(){
		return this.N_FXQX;
	}
	/**
	*setN_fxqx(java.lang.String)
	*/
	public void setN_fxqx(String n_fxqx){
		this.N_FXQX=n_fxqx;
	}
	/**
	* getV_dp_zdmd(void) 
	*/
	public String getV_dp_zdmd(){
		return this.V_DP_ZDMD;
	}
	/**
	*setV_dp_zdmd(java.lang.String)
	*/
	public void setV_dp_zdmd(String v_dp_zdmd){
		this.V_DP_ZDMD=v_dp_zdmd;
	}
	/**
	* getV_dp_lyd(void) 
	*/
	public String getV_dp_lyd(){
		return this.V_DP_LYD;
	}
	/**
	*setV_dp_lyd(java.lang.String)
	*/
	public void setV_dp_lyd(String v_dp_lyd){
		this.V_DP_LYD=v_dp_lyd;
	}
	/**
	* getV_dp_xsfx(void) 
	*/
	public String getV_dp_xsfx(){
		return this.V_DP_XSFX;
	}
	/**
	*setV_dp_xsfx(java.lang.String)
	*/
	public void setV_dp_xsfx(String v_dp_xsfx){
		this.V_DP_XSFX=v_dp_xsfx;
	}
	/**
	* getV_dp_wzpm(void) 
	*/
	public String getV_dp_wzpm(){
		return this.V_DP_WZPM;
	}
	/**
	*setV_dp_wzpm(java.lang.String)
	*/
	public void setV_dp_wzpm(String v_dp_wzpm){
		this.V_DP_WZPM=v_dp_wzpm;
	}
	/**
	* getC_wply(void) 
	*/
	public String getC_wply(){
		return this.C_WPLY;
	}
	/**
	*setC_wply(java.lang.String)
	*/
	public void setC_wply(String c_wply){
		this.C_WPLY=c_wply;
	}
	/**
	* getV_jawsmc(void) 
	*/
	public String getV_jawsmc(){
		return this.V_JAWSMC;
	}
	/**
	*setV_jawsmc(java.lang.String)
	*/
	public void setV_jawsmc(String v_jawsmc){
		this.V_JAWSMC=v_jawsmc;
	}
	/**
	* getV_lypdbh(void) 
	*/
	public String getV_lypdbh(){
		return this.V_LYPDBH;
	}
	/**
	*setV_lypdbh(java.lang.String)
	*/
	public void setV_lypdbh(String v_lypdbh){
		this.V_LYPDBH=v_lypdbh;
	}
	/**
	* getV_wpzjly(void) 
	*/
	public String getV_wpzjly(){
		return this.V_WPZJLY;
	}
	/**
	*setV_wpzjly(java.lang.String)
	*/
	public void setV_wpzjly(String v_wpzjly){
		this.V_WPZJLY=v_wpzjly;
	}
	/**
	* getV_clpzbh(void) 
	*/
	public String getV_clpzbh(){
		return this.V_CLPZBH;
	}
	/**
	*setV_clpzbh(java.lang.String)
	*/
	public void setV_clpzbh(String v_clpzbh){
		this.V_CLPZBH=v_clpzbh;
	}
	/**
	* getC_zjpz(void) 
	*/
	public String getC_zjpz(){
		return this.C_ZJPZ;
	}
	/**
	*setC_zjpz(java.lang.String)
	*/
	public void setC_zjpz(String c_zjpz){
		this.C_ZJPZ=c_zjpz;
	}
	/**
	* getN_dp_jhsl(void) 
	*/
	public String getN_dp_jhsl(){
		return this.N_DP_JHSL;
	}
	/**
	*setN_dp_jhsl(java.lang.String)
	*/
	public void setN_dp_jhsl(String n_dp_jhsl){
		this.N_DP_JHSL=n_dp_jhsl;
	}
	/**
	* getN_dp_cczl(void) 
	*/
	public String getN_dp_cczl(){
		return this.N_DP_CCZL;
	}
	/**
	*setN_dp_cczl(java.lang.String)
	*/
	public void setN_dp_cczl(String n_dp_cczl){
		this.N_DP_CCZL=n_dp_cczl;
	}
	/**
	* getN_dp_czzl(void) 
	*/
	public String getN_dp_czzl(){
		return this.N_DP_CZZL;
	}
	/**
	*setN_dp_czzl(java.lang.String)
	*/
	public void setN_dp_czzl(String n_dp_czzl){
		this.N_DP_CZZL=n_dp_czzl;
	}
	/**
	* getN_dp_gjjg(void) 
	*/
	public String getN_dp_gjjg(){
		return this.N_DP_GJJG;
	}
	/**
	*setN_dp_gjjg(java.lang.String)
	*/
	public void setN_dp_gjjg(String n_dp_gjjg){
		this.N_DP_GJJG=n_dp_gjjg;
	}
	/**
	* getN_dp_mcjg(void) 
	*/
	public String getN_dp_mcjg(){
		return this.N_DP_MCJG;
	}
	/**
	*setN_dp_mcjg(java.lang.String)
	*/
	public void setN_dp_mcjg(String n_dp_mcjg){
		this.N_DP_MCJG=n_dp_mcjg;
	}
	/**
	* getC_jzwpsx(void) 
	*/
	public String getC_jzwpsx(){
		return this.C_JZWPSX;
	}
	/**
	*setC_jzwpsx(java.lang.String)
	*/
	public void setC_jzwpsx(String c_jzwpsx){
		this.C_JZWPSX=c_jzwpsx;
	}
	/**
	* getV_cl_cjh(void) 
	*/
	public String getV_cl_cjh(){
		return this.V_CL_CJH;
	}
	/**
	*setV_cl_cjh(java.lang.String)
	*/
	public void setV_cl_cjh(String v_cl_cjh){
		this.V_CL_CJH=v_cl_cjh;
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
	* getV_jlbh(void) 
	*/
	public String getV_jlbh(){
		return this.V_JLBH;
	}
	/**
	*setV_jlbh(java.lang.String)
	*/
	public void setV_jlbh(String v_jlbh){
		this.V_JLBH=v_jlbh;
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
	* getV_wplymc(void) 
	*/
	public String getV_wplymc(){
		return this.V_WPLYMC;
	}
	/**
	*setV_wplymc(java.lang.String)
	*/
	public void setV_wplymc(String v_wplymc){
		this.V_WPLYMC=v_wplymc;
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
	* getC_wpxz(void) 
	*/
	public String getC_wpxz(){
		return this.C_WPXZ;
	}
	/**
	*setC_wpxz(java.lang.String)
	*/
	public void setC_wpxz(String c_wpxz){
		this.C_WPXZ=c_wpxz;
	}
	/**
	* getPk_gaj_ajxx_sacw_b(void) 
	*/
	public String getPk_gaj_ajxx_sacw_b(){
		return this.PK_GAJ_AJXX_SACW_B;
	}
	/**
	*setPk_gaj_ajxx_sacw_b(java.lang.String)
	*/
	public void setPk_gaj_ajxx_sacw_b(String pk_gaj_ajxx_sacw_b){
		this.PK_GAJ_AJXX_SACW_B=pk_gaj_ajxx_sacw_b;
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
	* getC_wpsyr(void) 
	*/
	public String getC_wpsyr(){
		return this.C_WPSYR;
	}
	/**
	*setC_wpsyr(java.lang.String)
	*/
	public void setC_wpsyr(String c_wpsyr){
		this.C_WPSYR=c_wpsyr;
	}
	/**
	* getV_wpsyrmc(void) 
	*/
	public String getV_wpsyrmc(){
		return this.V_WPSYRMC;
	}
	/**
	*setV_wpsyrmc(java.lang.String)
	*/
	public void setV_wpsyrmc(String v_wpsyrmc){
		this.V_WPSYRMC=v_wpsyrmc;
	}
	/**
	* getC_wplx(void) 
	*/
	public String getC_wplx(){
		return this.C_WPLX;
	}
	/**
	*setC_wplx(java.lang.String)
	*/
	public void setC_wplx(String c_wplx){
		this.C_WPLX=c_wplx;
	}
	/**
	* getV_wpmc(void) 
	*/
	public String getV_wpmc(){
		return this.V_WPMC;
	}
	/**
	*setV_wpmc(java.lang.String)
	*/
	public void setV_wpmc(String v_wpmc){
		this.V_WPMC=v_wpmc;
	}
	/**
	* getC_wpcd(void) 
	*/
	public String getC_wpcd(){
		return this.C_WPCD;
	}
	/**
	*setC_wpcd(java.lang.String)
	*/
	public void setC_wpcd(String c_wpcd){
		this.C_WPCD=c_wpcd;
	}
	/**
	* getV_wpcp(void) 
	*/
	public String getV_wpcp(){
		return this.V_WPCP;
	}
	/**
	*setV_wpcp(java.lang.String)
	*/
	public void setV_wpcp(String v_wpcp){
		this.V_WPCP=v_wpcp;
	}
	/**
	* getV_wpxh(void) 
	*/
	public String getV_wpxh(){
		return this.V_WPXH;
	}
	/**
	*setV_wpxh(java.lang.String)
	*/
	public void setV_wpxh(String v_wpxh){
		this.V_WPXH=v_wpxh;
	}
	/**
	* getV_wpgg(void) 
	*/
	public String getV_wpgg(){
		return this.V_WPGG;
	}
	/**
	*setV_wpgg(java.lang.String)
	*/
	public void setV_wpgg(String v_wpgg){
		this.V_WPGG=v_wpgg;
	}
	/**
	* getV_wpys(void) 
	*/
	public String getV_wpys(){
		return this.V_WPYS;
	}
	/**
	*setV_wpys(java.lang.String)
	*/
	public void setV_wpys(String v_wpys){
		this.V_WPYS=v_wpys;
	}
	/**
	* getV_wpzd(void) 
	*/
	public String getV_wpzd(){
		return this.V_WPZD;
	}
	/**
	*setV_wpzd(java.lang.String)
	*/
	public void setV_wpzd(String v_wpzd){
		this.V_WPZD=v_wpzd;
	}
	/**
	* getV_wpcs(void) 
	*/
	public String getV_wpcs(){
		return this.V_WPCS;
	}
	/**
	*setV_wpcs(java.lang.String)
	*/
	public void setV_wpcs(String v_wpcs){
		this.V_WPCS=v_wpcs;
	}
	/**
	* getC_wpys(void) 
	*/
	public String getC_wpys(){
		return this.C_WPYS;
	}
	/**
	*setC_wpys(java.lang.String)
	*/
	public void setC_wpys(String c_wpys){
		this.C_WPYS=c_wpys;
	}
	/**
	* getN_wpjz(void) 
	*/
	public String getN_wpjz(){
		return this.N_WPJZ;
	}
	/**
	*setN_wpjz(java.lang.String)
	*/
	public void setN_wpjz(String n_wpjz){
		this.N_WPJZ=n_wpjz;
	}
	/**
	* getD_gmrq(void) 
	*/
	public String getD_gmrq(){
		return this.D_GMRQ;
	}
	/**
	*setD_gmrq(java.lang.String)
	*/
	public void setD_gmrq(String d_gmrq){
		this.D_GMRQ=d_gmrq;
	}
	/**
	* getV_awcyr(void) 
	*/
	public String getV_awcyr(){
		return this.V_AWCYR;
	}
	/**
	*setV_awcyr(java.lang.String)
	*/
	public void setV_awcyr(String v_awcyr){
		this.V_AWCYR=v_awcyr;
	}
	/**
	* getN_wpsl(void) 
	*/
	public String getN_wpsl(){
		return this.N_WPSL;
	}
	/**
	*setN_wpsl(java.lang.String)
	*/
	public void setN_wpsl(String n_wpsl){
		this.N_WPSL=n_wpsl;
	}
	/**
	* getC_wpsldw(void) 
	*/
	public String getC_wpsldw(){
		return this.C_WPSLDW;
	}
	/**
	*setC_wpsldw(java.lang.String)
	*/
	public void setC_wpsldw(String c_wpsldw){
		this.C_WPSLDW=c_wpsldw;
	}
	/**
	* getN_wpzlhcd(void) 
	*/
	public String getN_wpzlhcd(){
		return this.N_WPZLHCD;
	}
	/**
	*setN_wpzlhcd(java.lang.String)
	*/
	public void setN_wpzlhcd(String n_wpzlhcd){
		this.N_WPZLHCD=n_wpzlhcd;
	}
	/**
	* getC_wpzlhcddw(void) 
	*/
	public String getC_wpzlhcddw(){
		return this.C_WPZLHCDDW;
	}
	/**
	*setC_wpzlhcddw(java.lang.String)
	*/
	public void setC_wpzlhcddw(String c_wpzlhcddw){
		this.C_WPZLHCDDW=c_wpzlhcddw;
	}
	/**
	* getV_bh1(void) 
	*/
	public String getV_bh1(){
		return this.V_BH1;
	}
	/**
	*setV_bh1(java.lang.String)
	*/
	public void setV_bh1(String v_bh1){
		this.V_BH1=v_bh1;
	}
	/**
	* getV_bh2(void) 
	*/
	public String getV_bh2(){
		return this.V_BH2;
	}
	/**
	*setV_bh2(java.lang.String)
	*/
	public void setV_bh2(String v_bh2){
		this.V_BH2=v_bh2;
	}
	/**
	* getV_bh3(void) 
	*/
	public String getV_bh3(){
		return this.V_BH3;
	}
	/**
	*setV_bh3(java.lang.String)
	*/
	public void setV_bh3(String v_bh3){
		this.V_BH3=v_bh3;
	}
	/**
	* getV_bh4(void) 
	*/
	public String getV_bh4(){
		return this.V_BH4;
	}
	/**
	*setV_bh4(java.lang.String)
	*/
	public void setV_bh4(String v_bh4){
		this.V_BH4=v_bh4;
	}
	/**
	* getV_bh5(void) 
	*/
	public String getV_bh5(){
		return this.V_BH5;
	}
	/**
	*setV_bh5(java.lang.String)
	*/
	public void setV_bh5(String v_bh5){
		this.V_BH5=v_bh5;
	}
	/**
	* getN_ssjz(void) 
	*/
	public String getN_ssjz(){
		return this.N_SSJZ;
	}
	/**
	*setN_ssjz(java.lang.String)
	*/
	public void setN_ssjz(String n_ssjz){
		this.N_SSJZ=n_ssjz;
	}
	/**
	* getN_whssjz(void) 
	*/
	public String getN_whssjz(){
		return this.N_WHSSJZ;
	}
	/**
	*setN_whssjz(java.lang.String)
	*/
	public void setN_whssjz(String n_whssjz){
		this.N_WHSSJZ=n_whssjz;
	}


}