package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSadwxxHVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_sadwxx_h")
public class CrpasSadwxxHVO {
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
	* PK_SADWXX_H 主键
	*/
	@Column(columnName="pk_sadwxx_h",dataType="char",dataLength=20,nullAble="N",comment="主键")
	private String PK_SADWXX_H = "pk_sadwxx_h";
	/**
	* V_JGBH 机构编号
	*/
	@Column(columnName="v_jgbh",dataType="varchar",dataLength=50,nullAble="Y",comment="机构编号")
	private String V_JGBH = "v_jgbh";
	/**
	* V_DZBH 地址编号
	*/
	@Column(columnName="v_dzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="地址编号")
	private String V_DZBH = "v_dzbh";
	/**
	* V_DWBM 组织机构代码
	*/
	@Column(columnName="v_dwbm",dataType="varchar",dataLength=50,nullAble="Y",comment="组织机构代码")
	private String V_DWBM = "v_dwbm";
	/**
	* V_DWMC 单位名称
	*/
	@Column(columnName="v_dwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="单位名称")
	private String V_DWMC = "v_dwmc";
	/**
	* V_DWWMM 单位外文名
	*/
	@Column(columnName="v_dwwmm",dataType="varchar",dataLength=100,nullAble="Y",comment="单位外文名")
	private String V_DWWMM = "v_dwwmm";
	/**
	* V_DWDH 单位电话
	*/
	@Column(columnName="v_dwdh",dataType="varchar",dataLength=50,nullAble="Y",comment="单位电话")
	private String V_DWDH = "v_dwdh";
	/**
	* V_DWCZ 单位传真
	*/
	@Column(columnName="v_dwcz",dataType="varchar",dataLength=50,nullAble="Y",comment="单位传真")
	private String V_DWCZ = "v_dwcz";
	/**
	* V_FRDB 法人代表(负责人)
	*/
	@Column(columnName="v_frdb",dataType="varchar",dataLength=50,nullAble="Y",comment="法人代表(负责人)")
	private String V_FRDB = "v_frdb";
	/**
	* V_ZAFZR 治安负责人
	*/
	@Column(columnName="v_zafzr",dataType="varchar",dataLength=50,nullAble="Y",comment="治安负责人")
	private String V_ZAFZR = "v_zafzr";
	/**
	* C_DWLB 单位类别
	*/
	@Column(columnName="c_dwlb",dataType="varchar",dataLength=60,nullAble="Y",comment="单位类别")
	private String C_DWLB = "c_dwlb";
	/**
	* V_ZGBM 主管部门
	*/
	@Column(columnName="v_zgbm",dataType="varchar",dataLength=50,nullAble="Y",comment="主管部门")
	private String V_ZGBM = "v_zgbm";
	/**
	* C_JJLX 经济类型
	*/
	@Column(columnName="c_jjlx",dataType="char",dataLength=20,nullAble="Y",comment="经济类型")
	private String C_JJLX = "c_jjlx";
	/**
	* C_JJXZ 经济性质
	*/
	@Column(columnName="c_jjxz",dataType="char",dataLength=20,nullAble="Y",comment="经济性质")
	private String C_JJXZ = "c_jjxz";
	/**
	* V_JYFW 经营范围
	*/
	@Column(columnName="v_jyfw",dataType="varchar",dataLength=50,nullAble="Y",comment="经营范围")
	private String V_JYFW = "v_jyfw";
	/**
	* N_CYRS 从业人数
	*/
	@Column(columnName="n_cyrs",dataType="int",dataLength=0,nullAble="Y",comment="从业人数")
	private String N_CYRS = "n_cyrs";
	/**
	* C_GLBM 管理部门
	*/
	@Column(columnName="c_glbm",dataType="varchar",dataLength=20,nullAble="Y",comment="管理部门")
	private String C_GLBM = "c_glbm";
	/**
	* C_GLJB 管理级别
	*/
	@Column(columnName="c_gljb",dataType="varchar",dataLength=20,nullAble="Y",comment="管理级别")
	private String C_GLJB = "c_gljb";
	/**
	* C_FHDJ 消防等级
	*/
	@Column(columnName="c_fhdj",dataType="varchar",dataLength=20,nullAble="Y",comment="消防等级")
	private String C_FHDJ = "c_fhdj";
	/**
	* V_YYZZBH 营业执照号
	*/
	@Column(columnName="v_yyzzbh",dataType="varchar",dataLength=100,nullAble="Y",comment="营业执照号")
	private String V_YYZZBH = "v_yyzzbh";
	/**
	* D_YXQX 有效期限至
	*/
	@Column(columnName="d_yxqx",dataType="char",dataLength=19,nullAble="Y",comment="有效期限至")
	private String D_YXQX = "d_yxqx";
	/**
	* C_ZCQH 注册区划
	*/
	@Column(columnName="c_zcqh",dataType="varchar",dataLength=20,nullAble="Y",comment="注册区划")
	private String C_ZCQH = "c_zcqh";
	/**
	* V_ZCDZ 注册地址
	*/
	@Column(columnName="v_zcdz",dataType="varchar",dataLength=100,nullAble="Y",comment="注册地址")
	private String V_ZCDZ = "v_zcdz";
	/**
	* D_ZCRQ 注册日期
	*/
	@Column(columnName="d_zcrq",dataType="char",dataLength=19,nullAble="Y",comment="注册日期")
	private String D_ZCRQ = "d_zcrq";
	/**
	* N_ZCZB 注册资本
	*/
	@Column(columnName="n_zczb",dataType="decimal",dataLength=20,nullAble="Y",comment="注册资本")
	private String N_ZCZB = "n_zczb";
	/**
	* C_DWSX 单位属性
	*/
	@Column(columnName="c_dwsx",dataType="varchar",dataLength=60,nullAble="Y",comment="单位属性")
	private String C_DWSX = "c_dwsx";
	/**
	* T_ZXSJ 注销时间
	*/
	@Column(columnName="t_zxsj",dataType="char",dataLength=19,nullAble="Y",comment="注销时间")
	private String T_ZXSJ = "t_zxsj";
	/**
	* V_ZXYY 注销原因
	*/
	@Column(columnName="v_zxyy",dataType="varchar",dataLength=2000,nullAble="Y",comment="注销原因")
	private String V_ZXYY = "v_zxyy";
	/**
	* C_SZZRQ 警务责任区
	*/
	@Column(columnName="c_szzrq",dataType="varchar",dataLength=20,nullAble="Y",comment="警务责任区")
	private String C_SZZRQ = "c_szzrq";
	/**
	* C_GYDWLX 雇佣单位类型
	*/
	@Column(columnName="c_gydwlx",dataType="varchar",dataLength=20,nullAble="Y",comment="雇佣单位类型")
	private String C_GYDWLX = "c_gydwlx";
	/**
	* V_DWDZYX 单位电子邮箱
	*/
	@Column(columnName="v_dwdzyx",dataType="varchar",dataLength=50,nullAble="Y",comment="单位电子邮箱")
	private String V_DWDZYX = "v_dwdzyx";
	/**
	* V_SWDJH 税务登记号
	*/
	@Column(columnName="v_swdjh",dataType="varchar",dataLength=50,nullAble="Y",comment="税务登记号")
	private String V_SWDJH = "v_swdjh";
	/**
	* V_JGZCH 机关注册号
	*/
	@Column(columnName="v_jgzch",dataType="varchar",dataLength=50,nullAble="Y",comment="机关注册号")
	private String V_JGZCH = "v_jgzch";
	/**
	* V_DSZ 董事长
	*/
	@Column(columnName="v_dsz",dataType="varchar",dataLength=50,nullAble="Y",comment="董事长")
	private String V_DSZ = "v_dsz";
	/**
	* V_ZJL 总经理
	*/
	@Column(columnName="v_zjl",dataType="varchar",dataLength=50,nullAble="Y",comment="总经理")
	private String V_ZJL = "v_zjl";
	/**
	* V_FZJG 分支机构
	*/
	@Column(columnName="v_fzjg",dataType="varchar",dataLength=100,nullAble="Y",comment="分支机构")
	private String V_FZJG = "v_fzjg";
	/**
	* D_FZSJ 发照日期
	*/
	@Column(columnName="d_fzsj",dataType="char",dataLength=19,nullAble="Y",comment="发照日期")
	private String D_FZSJ = "d_fzsj";
	/**
	* T_KYSJ 开业时间
	*/
	@Column(columnName="t_kysj",dataType="char",dataLength=19,nullAble="Y",comment="开业时间")
	private String T_KYSJ = "t_kysj";
	/**
	* V_KHYX 开户银行
	*/
	@Column(columnName="v_khyx",dataType="varchar",dataLength=100,nullAble="Y",comment="开户银行")
	private String V_KHYX = "v_khyx";
	/**
	* V_JBZH 基本账号
	*/
	@Column(columnName="v_jbzh",dataType="varchar",dataLength=50,nullAble="Y",comment="基本账号")
	private String V_JBZH = "v_jbzh";
	/**
	* V_QTZH 其他账号
	*/
	@Column(columnName="v_qtzh",dataType="varchar",dataLength=50,nullAble="Y",comment="其他账号")
	private String V_QTZH = "v_qtzh";
	/**
	* V_FRZZ 法人住址
	*/
	@Column(columnName="v_frzz",dataType="varchar",dataLength=100,nullAble="Y",comment="法人住址")
	private String V_FRZZ = "v_frzz";
	/**
	* V_FRLXDH 法人联系电话
	*/
	@Column(columnName="v_frlxdh",dataType="varchar",dataLength=50,nullAble="Y",comment="法人联系电话")
	private String V_FRLXDH = "v_frlxdh";
	/**
	* V_ZXBS 注销标识
	*/
	@Column(columnName="v_zxbs",dataType="varchar",dataLength=50,nullAble="Y",comment="注销标识")
	private String V_ZXBS = "v_zxbs";
	/**
	* V_ZDDWBS 重点等级
	*/
	@Column(columnName="v_zddwbs",dataType="varchar",dataLength=50,nullAble="Y",comment="重点等级")
	private String V_ZDDWBS = "v_zddwbs";
	/**
	* C_TZGJ 投资国家
	*/
	@Column(columnName="c_tzgj",dataType="varchar",dataLength=20,nullAble="Y",comment="投资国家")
	private String C_TZGJ = "c_tzgj";
	/**
	* C_JGSSXQ 省市县区
	*/
	@Column(columnName="c_jgssxq",dataType="varchar",dataLength=20,nullAble="Y",comment="省市县区")
	private String C_JGSSXQ = "c_jgssxq";
	/**
	* V_JGJLX 街路巷
	*/
	@Column(columnName="v_jgjlx",dataType="varchar",dataLength=50,nullAble="Y",comment="街路巷")
	private String V_JGJLX = "v_jgjlx";
	/**
	* V_JGMLPH 门楼牌号
	*/
	@Column(columnName="v_jgmlph",dataType="varchar",dataLength=50,nullAble="Y",comment="门楼牌号")
	private String V_JGMLPH = "v_jgmlph";
	/**
	* V_JGMPHZ 门牌后缀
	*/
	@Column(columnName="v_jgmphz",dataType="varchar",dataLength=50,nullAble="Y",comment="门牌后缀")
	private String V_JGMPHZ = "v_jgmphz";
	/**
	* V_JGMLXZ 门楼详址
	*/
	@Column(columnName="v_jgmlxz",dataType="varchar",dataLength=100,nullAble="Y",comment="门楼详址")
	private String V_JGMLXZ = "v_jgmlxz";
	/**
	* T_NSSJ 年审时间
	*/
	@Column(columnName="t_nssj",dataType="char",dataLength=19,nullAble="Y",comment="年审时间")
	private String T_NSSJ = "t_nssj";
	/**
	* V_FDDBRSFZH 法定代表人身份证号
	*/
	@Column(columnName="v_fddbrsfzh",dataType="varchar",dataLength=50,nullAble="Y",comment="法定代表人身份证号")
	private String V_FDDBRSFZH = "v_fddbrsfzh";
	/**
	* B_SFYWFJL 是否有违法经历
	*/
	@Column(columnName="b_sfywfjl",dataType="char",dataLength=1,nullAble="Y",comment="是否有违法经历")
	private String B_SFYWFJL = "b_sfywfjl";
	/**
	* V_GGGDCZQK 各个股东出资情况
	*/
	@Column(columnName="v_gggdczqk",dataType="varchar",dataLength=2000,nullAble="Y",comment="各个股东出资情况")
	private String V_GGGDCZQK = "v_gggdczqk";
	/**
	* C_BMJB 保密级别
	*/
	@Column(columnName="c_bmjb",dataType="varchar",dataLength=20,nullAble="Y",comment="保密级别")
	private String C_BMJB = "c_bmjb";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=2000,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
	/**
	* V_SJDWBH 上级单位编号
	*/
	@Column(columnName="v_sjdwbh",dataType="varchar",dataLength=50,nullAble="Y",comment="上级单位编号")
	private String V_SJDWBH = "v_sjdwbh";
	/**
	* V_SJDWMC 上级单位名称
	*/
	@Column(columnName="v_sjdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="上级单位名称")
	private String V_SJDWMC = "v_sjdwmc";
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
	* getPk_sadwxx_h(void) 
	*/
	public String getPk_sadwxx_h(){
		return this.PK_SADWXX_H;
	}
	/**
	*setPk_sadwxx_h(java.lang.String)
	*/
	public void setPk_sadwxx_h(String pk_sadwxx_h){
		this.PK_SADWXX_H=pk_sadwxx_h;
	}
	/**
	* getV_jgbh(void) 
	*/
	public String getV_jgbh(){
		return this.V_JGBH;
	}
	/**
	*setV_jgbh(java.lang.String)
	*/
	public void setV_jgbh(String v_jgbh){
		this.V_JGBH=v_jgbh;
	}
	/**
	* getV_dzbh(void) 
	*/
	public String getV_dzbh(){
		return this.V_DZBH;
	}
	/**
	*setV_dzbh(java.lang.String)
	*/
	public void setV_dzbh(String v_dzbh){
		this.V_DZBH=v_dzbh;
	}
	/**
	* getV_dwbm(void) 
	*/
	public String getV_dwbm(){
		return this.V_DWBM;
	}
	/**
	*setV_dwbm(java.lang.String)
	*/
	public void setV_dwbm(String v_dwbm){
		this.V_DWBM=v_dwbm;
	}
	/**
	* getV_dwmc(void) 
	*/
	public String getV_dwmc(){
		return this.V_DWMC;
	}
	/**
	*setV_dwmc(java.lang.String)
	*/
	public void setV_dwmc(String v_dwmc){
		this.V_DWMC=v_dwmc;
	}
	/**
	* getV_dwwmm(void) 
	*/
	public String getV_dwwmm(){
		return this.V_DWWMM;
	}
	/**
	*setV_dwwmm(java.lang.String)
	*/
	public void setV_dwwmm(String v_dwwmm){
		this.V_DWWMM=v_dwwmm;
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
	* getV_dwcz(void) 
	*/
	public String getV_dwcz(){
		return this.V_DWCZ;
	}
	/**
	*setV_dwcz(java.lang.String)
	*/
	public void setV_dwcz(String v_dwcz){
		this.V_DWCZ=v_dwcz;
	}
	/**
	* getV_frdb(void) 
	*/
	public String getV_frdb(){
		return this.V_FRDB;
	}
	/**
	*setV_frdb(java.lang.String)
	*/
	public void setV_frdb(String v_frdb){
		this.V_FRDB=v_frdb;
	}
	/**
	* getV_zafzr(void) 
	*/
	public String getV_zafzr(){
		return this.V_ZAFZR;
	}
	/**
	*setV_zafzr(java.lang.String)
	*/
	public void setV_zafzr(String v_zafzr){
		this.V_ZAFZR=v_zafzr;
	}
	/**
	* getC_dwlb(void) 
	*/
	public String getC_dwlb(){
		return this.C_DWLB;
	}
	/**
	*setC_dwlb(java.lang.String)
	*/
	public void setC_dwlb(String c_dwlb){
		this.C_DWLB=c_dwlb;
	}
	/**
	* getV_zgbm(void) 
	*/
	public String getV_zgbm(){
		return this.V_ZGBM;
	}
	/**
	*setV_zgbm(java.lang.String)
	*/
	public void setV_zgbm(String v_zgbm){
		this.V_ZGBM=v_zgbm;
	}
	/**
	* getC_jjlx(void) 
	*/
	public String getC_jjlx(){
		return this.C_JJLX;
	}
	/**
	*setC_jjlx(java.lang.String)
	*/
	public void setC_jjlx(String c_jjlx){
		this.C_JJLX=c_jjlx;
	}
	/**
	* getC_jjxz(void) 
	*/
	public String getC_jjxz(){
		return this.C_JJXZ;
	}
	/**
	*setC_jjxz(java.lang.String)
	*/
	public void setC_jjxz(String c_jjxz){
		this.C_JJXZ=c_jjxz;
	}
	/**
	* getV_jyfw(void) 
	*/
	public String getV_jyfw(){
		return this.V_JYFW;
	}
	/**
	*setV_jyfw(java.lang.String)
	*/
	public void setV_jyfw(String v_jyfw){
		this.V_JYFW=v_jyfw;
	}
	/**
	* getN_cyrs(void) 
	*/
	public String getN_cyrs(){
		return this.N_CYRS;
	}
	/**
	*setN_cyrs(java.lang.String)
	*/
	public void setN_cyrs(String n_cyrs){
		this.N_CYRS=n_cyrs;
	}
	/**
	* getC_glbm(void) 
	*/
	public String getC_glbm(){
		return this.C_GLBM;
	}
	/**
	*setC_glbm(java.lang.String)
	*/
	public void setC_glbm(String c_glbm){
		this.C_GLBM=c_glbm;
	}
	/**
	* getC_gljb(void) 
	*/
	public String getC_gljb(){
		return this.C_GLJB;
	}
	/**
	*setC_gljb(java.lang.String)
	*/
	public void setC_gljb(String c_gljb){
		this.C_GLJB=c_gljb;
	}
	/**
	* getC_fhdj(void) 
	*/
	public String getC_fhdj(){
		return this.C_FHDJ;
	}
	/**
	*setC_fhdj(java.lang.String)
	*/
	public void setC_fhdj(String c_fhdj){
		this.C_FHDJ=c_fhdj;
	}
	/**
	* getV_yyzzbh(void) 
	*/
	public String getV_yyzzbh(){
		return this.V_YYZZBH;
	}
	/**
	*setV_yyzzbh(java.lang.String)
	*/
	public void setV_yyzzbh(String v_yyzzbh){
		this.V_YYZZBH=v_yyzzbh;
	}
	/**
	* getD_yxqx(void) 
	*/
	public String getD_yxqx(){
		return this.D_YXQX;
	}
	/**
	*setD_yxqx(java.lang.String)
	*/
	public void setD_yxqx(String d_yxqx){
		this.D_YXQX=d_yxqx;
	}
	/**
	* getC_zcqh(void) 
	*/
	public String getC_zcqh(){
		return this.C_ZCQH;
	}
	/**
	*setC_zcqh(java.lang.String)
	*/
	public void setC_zcqh(String c_zcqh){
		this.C_ZCQH=c_zcqh;
	}
	/**
	* getV_zcdz(void) 
	*/
	public String getV_zcdz(){
		return this.V_ZCDZ;
	}
	/**
	*setV_zcdz(java.lang.String)
	*/
	public void setV_zcdz(String v_zcdz){
		this.V_ZCDZ=v_zcdz;
	}
	/**
	* getD_zcrq(void) 
	*/
	public String getD_zcrq(){
		return this.D_ZCRQ;
	}
	/**
	*setD_zcrq(java.lang.String)
	*/
	public void setD_zcrq(String d_zcrq){
		this.D_ZCRQ=d_zcrq;
	}
	/**
	* getN_zczb(void) 
	*/
	public String getN_zczb(){
		return this.N_ZCZB;
	}
	/**
	*setN_zczb(java.lang.String)
	*/
	public void setN_zczb(String n_zczb){
		this.N_ZCZB=n_zczb;
	}
	/**
	* getC_dwsx(void) 
	*/
	public String getC_dwsx(){
		return this.C_DWSX;
	}
	/**
	*setC_dwsx(java.lang.String)
	*/
	public void setC_dwsx(String c_dwsx){
		this.C_DWSX=c_dwsx;
	}
	/**
	* getT_zxsj(void) 
	*/
	public String getT_zxsj(){
		return this.T_ZXSJ;
	}
	/**
	*setT_zxsj(java.lang.String)
	*/
	public void setT_zxsj(String t_zxsj){
		this.T_ZXSJ=t_zxsj;
	}
	/**
	* getV_zxyy(void) 
	*/
	public String getV_zxyy(){
		return this.V_ZXYY;
	}
	/**
	*setV_zxyy(java.lang.String)
	*/
	public void setV_zxyy(String v_zxyy){
		this.V_ZXYY=v_zxyy;
	}
	/**
	* getC_szzrq(void) 
	*/
	public String getC_szzrq(){
		return this.C_SZZRQ;
	}
	/**
	*setC_szzrq(java.lang.String)
	*/
	public void setC_szzrq(String c_szzrq){
		this.C_SZZRQ=c_szzrq;
	}
	/**
	* getC_gydwlx(void) 
	*/
	public String getC_gydwlx(){
		return this.C_GYDWLX;
	}
	/**
	*setC_gydwlx(java.lang.String)
	*/
	public void setC_gydwlx(String c_gydwlx){
		this.C_GYDWLX=c_gydwlx;
	}
	/**
	* getV_dwdzyx(void) 
	*/
	public String getV_dwdzyx(){
		return this.V_DWDZYX;
	}
	/**
	*setV_dwdzyx(java.lang.String)
	*/
	public void setV_dwdzyx(String v_dwdzyx){
		this.V_DWDZYX=v_dwdzyx;
	}
	/**
	* getV_swdjh(void) 
	*/
	public String getV_swdjh(){
		return this.V_SWDJH;
	}
	/**
	*setV_swdjh(java.lang.String)
	*/
	public void setV_swdjh(String v_swdjh){
		this.V_SWDJH=v_swdjh;
	}
	/**
	* getV_jgzch(void) 
	*/
	public String getV_jgzch(){
		return this.V_JGZCH;
	}
	/**
	*setV_jgzch(java.lang.String)
	*/
	public void setV_jgzch(String v_jgzch){
		this.V_JGZCH=v_jgzch;
	}
	/**
	* getV_dsz(void) 
	*/
	public String getV_dsz(){
		return this.V_DSZ;
	}
	/**
	*setV_dsz(java.lang.String)
	*/
	public void setV_dsz(String v_dsz){
		this.V_DSZ=v_dsz;
	}
	/**
	* getV_zjl(void) 
	*/
	public String getV_zjl(){
		return this.V_ZJL;
	}
	/**
	*setV_zjl(java.lang.String)
	*/
	public void setV_zjl(String v_zjl){
		this.V_ZJL=v_zjl;
	}
	/**
	* getV_fzjg(void) 
	*/
	public String getV_fzjg(){
		return this.V_FZJG;
	}
	/**
	*setV_fzjg(java.lang.String)
	*/
	public void setV_fzjg(String v_fzjg){
		this.V_FZJG=v_fzjg;
	}
	/**
	* getD_fzsj(void) 
	*/
	public String getD_fzsj(){
		return this.D_FZSJ;
	}
	/**
	*setD_fzsj(java.lang.String)
	*/
	public void setD_fzsj(String d_fzsj){
		this.D_FZSJ=d_fzsj;
	}
	/**
	* getT_kysj(void) 
	*/
	public String getT_kysj(){
		return this.T_KYSJ;
	}
	/**
	*setT_kysj(java.lang.String)
	*/
	public void setT_kysj(String t_kysj){
		this.T_KYSJ=t_kysj;
	}
	/**
	* getV_khyx(void) 
	*/
	public String getV_khyx(){
		return this.V_KHYX;
	}
	/**
	*setV_khyx(java.lang.String)
	*/
	public void setV_khyx(String v_khyx){
		this.V_KHYX=v_khyx;
	}
	/**
	* getV_jbzh(void) 
	*/
	public String getV_jbzh(){
		return this.V_JBZH;
	}
	/**
	*setV_jbzh(java.lang.String)
	*/
	public void setV_jbzh(String v_jbzh){
		this.V_JBZH=v_jbzh;
	}
	/**
	* getV_qtzh(void) 
	*/
	public String getV_qtzh(){
		return this.V_QTZH;
	}
	/**
	*setV_qtzh(java.lang.String)
	*/
	public void setV_qtzh(String v_qtzh){
		this.V_QTZH=v_qtzh;
	}
	/**
	* getV_frzz(void) 
	*/
	public String getV_frzz(){
		return this.V_FRZZ;
	}
	/**
	*setV_frzz(java.lang.String)
	*/
	public void setV_frzz(String v_frzz){
		this.V_FRZZ=v_frzz;
	}
	/**
	* getV_frlxdh(void) 
	*/
	public String getV_frlxdh(){
		return this.V_FRLXDH;
	}
	/**
	*setV_frlxdh(java.lang.String)
	*/
	public void setV_frlxdh(String v_frlxdh){
		this.V_FRLXDH=v_frlxdh;
	}
	/**
	* getV_zxbs(void) 
	*/
	public String getV_zxbs(){
		return this.V_ZXBS;
	}
	/**
	*setV_zxbs(java.lang.String)
	*/
	public void setV_zxbs(String v_zxbs){
		this.V_ZXBS=v_zxbs;
	}
	/**
	* getV_zddwbs(void) 
	*/
	public String getV_zddwbs(){
		return this.V_ZDDWBS;
	}
	/**
	*setV_zddwbs(java.lang.String)
	*/
	public void setV_zddwbs(String v_zddwbs){
		this.V_ZDDWBS=v_zddwbs;
	}
	/**
	* getC_tzgj(void) 
	*/
	public String getC_tzgj(){
		return this.C_TZGJ;
	}
	/**
	*setC_tzgj(java.lang.String)
	*/
	public void setC_tzgj(String c_tzgj){
		this.C_TZGJ=c_tzgj;
	}
	/**
	* getC_jgssxq(void) 
	*/
	public String getC_jgssxq(){
		return this.C_JGSSXQ;
	}
	/**
	*setC_jgssxq(java.lang.String)
	*/
	public void setC_jgssxq(String c_jgssxq){
		this.C_JGSSXQ=c_jgssxq;
	}
	/**
	* getV_jgjlx(void) 
	*/
	public String getV_jgjlx(){
		return this.V_JGJLX;
	}
	/**
	*setV_jgjlx(java.lang.String)
	*/
	public void setV_jgjlx(String v_jgjlx){
		this.V_JGJLX=v_jgjlx;
	}
	/**
	* getV_jgmlph(void) 
	*/
	public String getV_jgmlph(){
		return this.V_JGMLPH;
	}
	/**
	*setV_jgmlph(java.lang.String)
	*/
	public void setV_jgmlph(String v_jgmlph){
		this.V_JGMLPH=v_jgmlph;
	}
	/**
	* getV_jgmphz(void) 
	*/
	public String getV_jgmphz(){
		return this.V_JGMPHZ;
	}
	/**
	*setV_jgmphz(java.lang.String)
	*/
	public void setV_jgmphz(String v_jgmphz){
		this.V_JGMPHZ=v_jgmphz;
	}
	/**
	* getV_jgmlxz(void) 
	*/
	public String getV_jgmlxz(){
		return this.V_JGMLXZ;
	}
	/**
	*setV_jgmlxz(java.lang.String)
	*/
	public void setV_jgmlxz(String v_jgmlxz){
		this.V_JGMLXZ=v_jgmlxz;
	}
	/**
	* getT_nssj(void) 
	*/
	public String getT_nssj(){
		return this.T_NSSJ;
	}
	/**
	*setT_nssj(java.lang.String)
	*/
	public void setT_nssj(String t_nssj){
		this.T_NSSJ=t_nssj;
	}
	/**
	* getV_fddbrsfzh(void) 
	*/
	public String getV_fddbrsfzh(){
		return this.V_FDDBRSFZH;
	}
	/**
	*setV_fddbrsfzh(java.lang.String)
	*/
	public void setV_fddbrsfzh(String v_fddbrsfzh){
		this.V_FDDBRSFZH=v_fddbrsfzh;
	}
	/**
	* getB_sfywfjl(void) 
	*/
	public String getB_sfywfjl(){
		return this.B_SFYWFJL;
	}
	/**
	*setB_sfywfjl(java.lang.String)
	*/
	public void setB_sfywfjl(String b_sfywfjl){
		this.B_SFYWFJL=b_sfywfjl;
	}
	/**
	* getV_gggdczqk(void) 
	*/
	public String getV_gggdczqk(){
		return this.V_GGGDCZQK;
	}
	/**
	*setV_gggdczqk(java.lang.String)
	*/
	public void setV_gggdczqk(String v_gggdczqk){
		this.V_GGGDCZQK=v_gggdczqk;
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
	* getV_sjdwbh(void) 
	*/
	public String getV_sjdwbh(){
		return this.V_SJDWBH;
	}
	/**
	*setV_sjdwbh(java.lang.String)
	*/
	public void setV_sjdwbh(String v_sjdwbh){
		this.V_SJDWBH=v_sjdwbh;
	}
	/**
	* getV_sjdwmc(void) 
	*/
	public String getV_sjdwmc(){
		return this.V_SJDWMC;
	}
	/**
	*setV_sjdwmc(java.lang.String)
	*/
	public void setV_sjdwmc(String v_sjdwmc){
		this.V_SJDWMC=v_sjdwmc;
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


}