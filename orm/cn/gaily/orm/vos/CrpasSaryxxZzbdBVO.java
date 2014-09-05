package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSaryxxZzbdBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_saryxx_zzbd_b")
public class CrpasSaryxxZzbdBVO {
	/**
	* PK_SARYXX_ZZBD_B 子表主键
	*/
	@Column(columnName="pk_saryxx_zzbd_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SARYXX_ZZBD_B = "pk_saryxx_zzbd_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_BDBH 暂住变动编号
	*/
	@Column(columnName="v_bdbh",dataType="varchar",dataLength=50,nullAble="Y",comment="暂住变动编号")
	private String V_BDBH = "v_bdbh";
	/**
	* V_RYBH 人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=50,nullAble="Y",comment="人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* V_QTZZBH 其他住址编号
	*/
	@Column(columnName="v_qtzzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="其他住址编号")
	private String V_QTZZBH = "v_qtzzbh";
	/**
	* V_ZZZBH 暂住证编号
	*/
	@Column(columnName="v_zzzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="暂住证编号")
	private String V_ZZZBH = "v_zzzbh";
	/**
	* T_DDSJ 到达时间
	*/
	@Column(columnName="t_ddsj",dataType="char",dataLength=19,nullAble="Y",comment="到达时间")
	private String T_DDSJ = "t_ddsj";
	/**
	* D_FZRQ 发证日期
	*/
	@Column(columnName="d_fzrq",dataType="char",dataLength=19,nullAble="Y",comment="发证日期")
	private String D_FZRQ = "d_fzrq";
	/**
	* V_YXQX 暂住有效期限
	*/
	@Column(columnName="v_yxqx",dataType="varchar",dataLength=50,nullAble="Y",comment="暂住有效期限")
	private String V_YXQX = "v_yxqx";
	/**
	* V_JYZM 就业证明
	*/
	@Column(columnName="v_jyzm",dataType="varchar",dataLength=50,nullAble="Y",comment="就业证明")
	private String V_JYZM = "v_jyzm";
	/**
	* V_ZZSY 暂住事由
	*/
	@Column(columnName="v_zzsy",dataType="varchar",dataLength=50,nullAble="Y",comment="暂住事由")
	private String V_ZZSY = "v_zzsy";
	/**
	* V_ZZCS 暂住处所
	*/
	@Column(columnName="v_zzcs",dataType="varchar",dataLength=50,nullAble="Y",comment="暂住处所")
	private String V_ZZCS = "v_zzcs";
	/**
	* C_CZHKSZDLX 常口地类型
	*/
	@Column(columnName="c_czhkszdlx",dataType="varchar",dataLength=20,nullAble="Y",comment="常口地类型")
	private String C_CZHKSZDLX = "c_czhkszdlx";
	/**
	* C_HKLB 户口类别
	*/
	@Column(columnName="c_hklb",dataType="varchar",dataLength=20,nullAble="Y",comment="户口类别")
	private String C_HKLB = "c_hklb";
	/**
	* V_ZZDZAZRRXM 暂住地治安责任人姓名
	*/
	@Column(columnName="v_zzdzazrrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="暂住地治安责任人姓名")
	private String V_ZZDZAZRRXM = "v_zzdzazrrxm";
	/**
	* V_GZDZAZRRXM 工作地治安责任人姓名
	*/
	@Column(columnName="v_gzdzazrrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="工作地治安责任人姓名")
	private String V_GZDZAZRRXM = "v_gzdzazrrxm";
	/**
	* B_YWJHSYZM 有无计划生育证明－有无
	*/
	@Column(columnName="b_ywjhsyzm",dataType="char",dataLength=1,nullAble="Y",comment="有无计划生育证明－有无")
	private String B_YWJHSYZM = "b_ywjhsyzm";
	/**
	* B_SFTBJSBM 是否通报计生部门
	*/
	@Column(columnName="b_sftbjsbm",dataType="char",dataLength=1,nullAble="Y",comment="是否通报计生部门")
	private String B_SFTBJSBM = "b_sftbjsbm";
	/**
	* C_HDQK 函调情况
	*/
	@Column(columnName="c_hdqk",dataType="varchar",dataLength=20,nullAble="Y",comment="函调情况")
	private String C_HDQK = "c_hdqk";
	/**
	* D_ZXRQ 注销日期
	*/
	@Column(columnName="d_zxrq",dataType="char",dataLength=19,nullAble="Y",comment="注销日期")
	private String D_ZXRQ = "d_zxrq";
	/**
	* V_ZXYY 注销原因
	*/
	@Column(columnName="v_zxyy",dataType="varchar",dataLength=50,nullAble="Y",comment="注销原因")
	private String V_ZXYY = "v_zxyy";
	/**
	* C_QWSX 去往省县
	*/
	@Column(columnName="c_qwsx",dataType="varchar",dataLength=20,nullAble="Y",comment="去往省县")
	private String C_QWSX = "c_qwsx";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=50,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
	/**
	* V_FWCS 服务处所
	*/
	@Column(columnName="v_fwcs",dataType="varchar",dataLength=50,nullAble="Y",comment="服务处所")
	private String V_FWCS = "v_fwcs";
	/**
	* V_ZW 职务
	*/
	@Column(columnName="v_zw",dataType="varchar",dataLength=50,nullAble="Y",comment="职务")
	private String V_ZW = "v_zw";
	/**
	* C_ZYLB 职业类别
	*/
	@Column(columnName="c_zylb",dataType="varchar",dataLength=20,nullAble="Y",comment="职业类别")
	private String C_ZYLB = "c_zylb";
	/**
	* T_HQSJ 核签时间
	*/
	@Column(columnName="t_hqsj",dataType="char",dataLength=19,nullAble="Y",comment="核签时间")
	private String T_HQSJ = "t_hqsj";
	/**
	* V_ZKZZBH 暂口住址编号
	*/
	@Column(columnName="v_zkzzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="暂口住址编号")
	private String V_ZKZZBH = "v_zkzzbh";
	/**
	* C_ZZZT 暂住人员状态
	*/
	@Column(columnName="c_zzzt",dataType="varchar",dataLength=20,nullAble="Y",comment="暂住人员状态")
	private String C_ZZZT = "c_zzzt";
	/**
	* D_CSRQ 出生日期
	*/
	@Column(columnName="d_csrq",dataType="char",dataLength=19,nullAble="Y",comment="出生日期")
	private String D_CSRQ = "d_csrq";
	/**
	* C_HJQH 户籍区划
	*/
	@Column(columnName="c_hjqh",dataType="varchar",dataLength=20,nullAble="Y",comment="户籍区划")
	private String C_HJQH = "c_hjqh";
	/**
	* V_WSFZBS 无身份证标识
	*/
	@Column(columnName="v_wsfzbs",dataType="varchar",dataLength=50,nullAble="Y",comment="无身份证标识")
	private String V_WSFZBS = "v_wsfzbs";
	/**
	* V_WZPBS 无照片标识
	*/
	@Column(columnName="v_wzpbs",dataType="varchar",dataLength=50,nullAble="Y",comment="无照片标识")
	private String V_WZPBS = "v_wzpbs";
	/**
	* C_GLLB 管理类别
	*/
	@Column(columnName="c_gllb",dataType="varchar",dataLength=20,nullAble="Y",comment="管理类别")
	private String C_GLLB = "c_gllb";
	/**
	* V_ZKZZXZ 暂口住址详址
	*/
	@Column(columnName="v_zkzzxz",dataType="varchar",dataLength=100,nullAble="Y",comment="暂口住址详址")
	private String V_ZKZZXZ = "v_zkzzxz";
	/**
	* T_NZZSJ 拟暂住时间
	*/
	@Column(columnName="t_nzzsj",dataType="char",dataLength=19,nullAble="Y",comment="拟暂住时间")
	private String T_NZZSJ = "t_nzzsj";
	/**
	* B_ZHBX 是否综合保险
	*/
	@Column(columnName="b_zhbx",dataType="char",dataLength=1,nullAble="Y",comment="是否综合保险")
	private String B_ZHBX = "b_zhbx";
	/**
	* B_JKZM 是否有健康状况证明
	*/
	@Column(columnName="b_jkzm",dataType="char",dataLength=1,nullAble="Y",comment="是否有健康状况证明")
	private String B_JKZM = "b_jkzm";
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
	* PK_SARYXX_H 涉案人员信息主表_主键
	*/
	@Column(columnName="pk_saryxx_h",dataType="char",dataLength=20,nullAble="N",comment="涉案人员信息主表_主键")
	private String PK_SARYXX_H = "pk_saryxx_h";
	/**
	* getPk_saryxx_zzbd_b(void) 
	*/
	public String getPk_saryxx_zzbd_b(){
		return this.PK_SARYXX_ZZBD_B;
	}
	/**
	*setPk_saryxx_zzbd_b(java.lang.String)
	*/
	public void setPk_saryxx_zzbd_b(String pk_saryxx_zzbd_b){
		this.PK_SARYXX_ZZBD_B=pk_saryxx_zzbd_b;
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
	* getV_bdbh(void) 
	*/
	public String getV_bdbh(){
		return this.V_BDBH;
	}
	/**
	*setV_bdbh(java.lang.String)
	*/
	public void setV_bdbh(String v_bdbh){
		this.V_BDBH=v_bdbh;
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
	* getV_qtzzbh(void) 
	*/
	public String getV_qtzzbh(){
		return this.V_QTZZBH;
	}
	/**
	*setV_qtzzbh(java.lang.String)
	*/
	public void setV_qtzzbh(String v_qtzzbh){
		this.V_QTZZBH=v_qtzzbh;
	}
	/**
	* getV_zzzbh(void) 
	*/
	public String getV_zzzbh(){
		return this.V_ZZZBH;
	}
	/**
	*setV_zzzbh(java.lang.String)
	*/
	public void setV_zzzbh(String v_zzzbh){
		this.V_ZZZBH=v_zzzbh;
	}
	/**
	* getT_ddsj(void) 
	*/
	public String getT_ddsj(){
		return this.T_DDSJ;
	}
	/**
	*setT_ddsj(java.lang.String)
	*/
	public void setT_ddsj(String t_ddsj){
		this.T_DDSJ=t_ddsj;
	}
	/**
	* getD_fzrq(void) 
	*/
	public String getD_fzrq(){
		return this.D_FZRQ;
	}
	/**
	*setD_fzrq(java.lang.String)
	*/
	public void setD_fzrq(String d_fzrq){
		this.D_FZRQ=d_fzrq;
	}
	/**
	* getV_yxqx(void) 
	*/
	public String getV_yxqx(){
		return this.V_YXQX;
	}
	/**
	*setV_yxqx(java.lang.String)
	*/
	public void setV_yxqx(String v_yxqx){
		this.V_YXQX=v_yxqx;
	}
	/**
	* getV_jyzm(void) 
	*/
	public String getV_jyzm(){
		return this.V_JYZM;
	}
	/**
	*setV_jyzm(java.lang.String)
	*/
	public void setV_jyzm(String v_jyzm){
		this.V_JYZM=v_jyzm;
	}
	/**
	* getV_zzsy(void) 
	*/
	public String getV_zzsy(){
		return this.V_ZZSY;
	}
	/**
	*setV_zzsy(java.lang.String)
	*/
	public void setV_zzsy(String v_zzsy){
		this.V_ZZSY=v_zzsy;
	}
	/**
	* getV_zzcs(void) 
	*/
	public String getV_zzcs(){
		return this.V_ZZCS;
	}
	/**
	*setV_zzcs(java.lang.String)
	*/
	public void setV_zzcs(String v_zzcs){
		this.V_ZZCS=v_zzcs;
	}
	/**
	* getC_czhkszdlx(void) 
	*/
	public String getC_czhkszdlx(){
		return this.C_CZHKSZDLX;
	}
	/**
	*setC_czhkszdlx(java.lang.String)
	*/
	public void setC_czhkszdlx(String c_czhkszdlx){
		this.C_CZHKSZDLX=c_czhkszdlx;
	}
	/**
	* getC_hklb(void) 
	*/
	public String getC_hklb(){
		return this.C_HKLB;
	}
	/**
	*setC_hklb(java.lang.String)
	*/
	public void setC_hklb(String c_hklb){
		this.C_HKLB=c_hklb;
	}
	/**
	* getV_zzdzazrrxm(void) 
	*/
	public String getV_zzdzazrrxm(){
		return this.V_ZZDZAZRRXM;
	}
	/**
	*setV_zzdzazrrxm(java.lang.String)
	*/
	public void setV_zzdzazrrxm(String v_zzdzazrrxm){
		this.V_ZZDZAZRRXM=v_zzdzazrrxm;
	}
	/**
	* getV_gzdzazrrxm(void) 
	*/
	public String getV_gzdzazrrxm(){
		return this.V_GZDZAZRRXM;
	}
	/**
	*setV_gzdzazrrxm(java.lang.String)
	*/
	public void setV_gzdzazrrxm(String v_gzdzazrrxm){
		this.V_GZDZAZRRXM=v_gzdzazrrxm;
	}
	/**
	* getB_ywjhsyzm(void) 
	*/
	public String getB_ywjhsyzm(){
		return this.B_YWJHSYZM;
	}
	/**
	*setB_ywjhsyzm(java.lang.String)
	*/
	public void setB_ywjhsyzm(String b_ywjhsyzm){
		this.B_YWJHSYZM=b_ywjhsyzm;
	}
	/**
	* getB_sftbjsbm(void) 
	*/
	public String getB_sftbjsbm(){
		return this.B_SFTBJSBM;
	}
	/**
	*setB_sftbjsbm(java.lang.String)
	*/
	public void setB_sftbjsbm(String b_sftbjsbm){
		this.B_SFTBJSBM=b_sftbjsbm;
	}
	/**
	* getC_hdqk(void) 
	*/
	public String getC_hdqk(){
		return this.C_HDQK;
	}
	/**
	*setC_hdqk(java.lang.String)
	*/
	public void setC_hdqk(String c_hdqk){
		this.C_HDQK=c_hdqk;
	}
	/**
	* getD_zxrq(void) 
	*/
	public String getD_zxrq(){
		return this.D_ZXRQ;
	}
	/**
	*setD_zxrq(java.lang.String)
	*/
	public void setD_zxrq(String d_zxrq){
		this.D_ZXRQ=d_zxrq;
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
	* getC_qwsx(void) 
	*/
	public String getC_qwsx(){
		return this.C_QWSX;
	}
	/**
	*setC_qwsx(java.lang.String)
	*/
	public void setC_qwsx(String c_qwsx){
		this.C_QWSX=c_qwsx;
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
	* getT_hqsj(void) 
	*/
	public String getT_hqsj(){
		return this.T_HQSJ;
	}
	/**
	*setT_hqsj(java.lang.String)
	*/
	public void setT_hqsj(String t_hqsj){
		this.T_HQSJ=t_hqsj;
	}
	/**
	* getV_zkzzbh(void) 
	*/
	public String getV_zkzzbh(){
		return this.V_ZKZZBH;
	}
	/**
	*setV_zkzzbh(java.lang.String)
	*/
	public void setV_zkzzbh(String v_zkzzbh){
		this.V_ZKZZBH=v_zkzzbh;
	}
	/**
	* getC_zzzt(void) 
	*/
	public String getC_zzzt(){
		return this.C_ZZZT;
	}
	/**
	*setC_zzzt(java.lang.String)
	*/
	public void setC_zzzt(String c_zzzt){
		this.C_ZZZT=c_zzzt;
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
	* getV_wsfzbs(void) 
	*/
	public String getV_wsfzbs(){
		return this.V_WSFZBS;
	}
	/**
	*setV_wsfzbs(java.lang.String)
	*/
	public void setV_wsfzbs(String v_wsfzbs){
		this.V_WSFZBS=v_wsfzbs;
	}
	/**
	* getV_wzpbs(void) 
	*/
	public String getV_wzpbs(){
		return this.V_WZPBS;
	}
	/**
	*setV_wzpbs(java.lang.String)
	*/
	public void setV_wzpbs(String v_wzpbs){
		this.V_WZPBS=v_wzpbs;
	}
	/**
	* getC_gllb(void) 
	*/
	public String getC_gllb(){
		return this.C_GLLB;
	}
	/**
	*setC_gllb(java.lang.String)
	*/
	public void setC_gllb(String c_gllb){
		this.C_GLLB=c_gllb;
	}
	/**
	* getV_zkzzxz(void) 
	*/
	public String getV_zkzzxz(){
		return this.V_ZKZZXZ;
	}
	/**
	*setV_zkzzxz(java.lang.String)
	*/
	public void setV_zkzzxz(String v_zkzzxz){
		this.V_ZKZZXZ=v_zkzzxz;
	}
	/**
	* getT_nzzsj(void) 
	*/
	public String getT_nzzsj(){
		return this.T_NZZSJ;
	}
	/**
	*setT_nzzsj(java.lang.String)
	*/
	public void setT_nzzsj(String t_nzzsj){
		this.T_NZZSJ=t_nzzsj;
	}
	/**
	* getB_zhbx(void) 
	*/
	public String getB_zhbx(){
		return this.B_ZHBX;
	}
	/**
	*setB_zhbx(java.lang.String)
	*/
	public void setB_zhbx(String b_zhbx){
		this.B_ZHBX=b_zhbx;
	}
	/**
	* getB_jkzm(void) 
	*/
	public String getB_jkzm(){
		return this.B_JKZM;
	}
	/**
	*setB_jkzm(java.lang.String)
	*/
	public void setB_jkzm(String b_jkzm){
		this.B_JKZM=b_jkzm;
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


}