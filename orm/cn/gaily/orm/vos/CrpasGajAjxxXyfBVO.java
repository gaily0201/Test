package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGajAjxxXyfBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_xyf_b")
public class CrpasGajAjxxXyfBVO {
	/**
	* PK_GAJ_AJXX_H 公安案件登记主表_主键
	*/
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="公安案件登记主表_主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* V_KYYJ 可疑依据
	*/
	@Column(columnName="v_kyyj",dataType="varchar",dataLength=50,nullAble="Y",comment="可疑依据")
	private String V_KYYJ = "v_kyyj";
	/**
	* PK_GAJ_AJXX_XYF_B 子表主键
	*/
	@Column(columnName="pk_gaj_ajxx_xyf_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GAJ_AJXX_XYF_B = "pk_gaj_ajxx_xyf_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_XYR 嫌疑人
	*/
	@Column(columnName="c_xyr",dataType="char",dataLength=20,nullAble="Y",comment="嫌疑人")
	private String C_XYR = "c_xyr";
	/**
	* V_XYRXM 嫌疑人姓名
	*/
	@Column(columnName="v_xyrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="嫌疑人姓名")
	private String V_XYRXM = "v_xyrxm";
	/**
	* C_BMJB 保密级别
	*/
	@Column(columnName="c_bmjb",dataType="varchar",dataLength=20,nullAble="Y",comment="保密级别")
	private String C_BMJB = "c_bmjb";
	/**
	* V_XZZ 现住址
	*/
	@Column(columnName="v_xzz",dataType="varchar",dataLength=100,nullAble="Y",comment="现住址")
	private String V_XZZ = "v_xzz";
	/**
	* C_XYSX 嫌疑属性
	*/
	@Column(columnName="c_xysx",dataType="varchar",dataLength=20,nullAble="Y",comment="嫌疑属性")
	private String C_XYSX = "c_xysx";
	/**
	* V_KY 口音
	*/
	@Column(columnName="v_ky",dataType="varchar",dataLength=50,nullAble="Y",comment="口音")
	private String V_KY = "v_ky";
	/**
	* V_XSQK 现实状况
	*/
	@Column(columnName="v_xsqk",dataType="varchar",dataLength=50,nullAble="Y",comment="现实状况")
	private String V_XSQK = "v_xsqk";
	/**
	* V_JKQK 健康状况
	*/
	@Column(columnName="v_jkqk",dataType="varchar",dataLength=50,nullAble="Y",comment="健康状况")
	private String V_JKQK = "v_jkqk";
	/**
	* V_ZAYY 作案原因
	*/
	@Column(columnName="v_zayy",dataType="varchar",dataLength=50,nullAble="Y",comment="作案原因")
	private String V_ZAYY = "v_zayy";
	/**
	* V_WFSS 违法事实
	*/
	@Column(columnName="v_wfss",dataType="varchar",dataLength=4000,nullAble="Y",comment="违法事实")
	private String V_WFSS = "v_wfss";
	/**
	* C_ZHFS 抓获方式
	*/
	@Column(columnName="c_zhfs",dataType="varchar",dataLength=20,nullAble="Y",comment="抓获方式")
	private String C_ZHFS = "c_zhfs";
	/**
	* D_ZHRQ 抓获日期
	*/
	@Column(columnName="d_zhrq",dataType="char",dataLength=19,nullAble="Y",comment="抓获日期")
	private String D_ZHRQ = "d_zhrq";
	/**
	* C_ZHDQ 抓获地区
	*/
	@Column(columnName="c_zhdq",dataType="varchar",dataLength=20,nullAble="Y",comment="抓获地区")
	private String C_ZHDQ = "c_zhdq";
	/**
	* V_ZHDD 抓获地点
	*/
	@Column(columnName="v_zhdd",dataType="varchar",dataLength=100,nullAble="Y",comment="抓获地点")
	private String V_ZHDD = "v_zhdd";
	/**
	* C_ZHDW 抓获单位id
	*/
	@Column(columnName="c_zhdw",dataType="varchar",dataLength=20,nullAble="Y",comment="抓获单位id")
	private String C_ZHDW = "c_zhdw";
	/**
	* V_ZHDWMC 抓获单位名称
	*/
	@Column(columnName="v_zhdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="抓获单位名称")
	private String V_ZHDWMC = "v_zhdwmc";
	/**
	* C_ZHR 抓获人id
	*/
	@Column(columnName="c_zhr",dataType="varchar",dataLength=20,nullAble="Y",comment="抓获人id")
	private String C_ZHR = "c_zhr";
	/**
	* V_ZHRMC 抓获人名称
	*/
	@Column(columnName="v_zhrmc",dataType="varchar",dataLength=100,nullAble="Y",comment="抓获人名称")
	private String V_ZHRMC = "v_zhrmc";
	/**
	* C_JWZHDW 局外抓获单位id
	*/
	@Column(columnName="c_jwzhdw",dataType="varchar",dataLength=20,nullAble="Y",comment="局外抓获单位id")
	private String C_JWZHDW = "c_jwzhdw";
	/**
	* V_JWZHDWMC 局外抓获单位名称
	*/
	@Column(columnName="v_jwzhdwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="局外抓获单位名称")
	private String V_JWZHDWMC = "v_jwzhdwmc";
	/**
	* V_ZHDY 抓获地域
	*/
	@Column(columnName="v_zhdy",dataType="varchar",dataLength=50,nullAble="Y",comment="抓获地域")
	private String V_ZHDY = "v_zhdy";
	/**
	* V_WFFZJL 违法犯罪经历
	*/
	@Column(columnName="v_wffzjl",dataType="varchar",dataLength=1000,nullAble="Y",comment="违法犯罪经历")
	private String V_WFFZJL = "v_wffzjl";
	/**
	* C_ZTXY 在逃形式
	*/
	@Column(columnName="c_ztxy",dataType="varchar",dataLength=20,nullAble="Y",comment="在逃形式")
	private String C_ZTXY = "c_ztxy";
	/**
	* D_ZTRQ 在逃日期
	*/
	@Column(columnName="d_ztrq",dataType="char",dataLength=19,nullAble="Y",comment="在逃日期")
	private String D_ZTRQ = "d_ztrq";
	/**
	* V_ZTBH 在逃编号
	*/
	@Column(columnName="v_ztbh",dataType="varchar",dataLength=100,nullAble="Y",comment="在逃编号")
	private String V_ZTBH = "v_ztbh";
	/**
	* V_ZAJBH 转案件编号
	*/
	@Column(columnName="v_zajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="转案件编号")
	private String V_ZAJBH = "v_zajbh";
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
	* V_JLBH 记录编号
	*/
	@Column(columnName="v_jlbh",dataType="varchar",dataLength=50,nullAble="Y",comment="记录编号")
	private String V_JLBH = "v_jlbh";
	/**
	* V_AJBH 案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* V_RYBH 人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=50,nullAble="Y",comment="人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* V_RYBZ 人员标识
	*/
	@Column(columnName="v_rybz",dataType="varchar",dataLength=50,nullAble="Y",comment="人员标识")
	private String V_RYBZ = "v_rybz";
	/**
	* B_SFYBB 是否已报捕
	*/
	@Column(columnName="b_sfybb",dataType="char",dataLength=1,nullAble="Y",comment="是否已报捕")
	private String B_SFYBB = "b_sfybb";
	/**
	* B_SFYBS 是否已报诉
	*/
	@Column(columnName="b_sfybs",dataType="char",dataLength=1,nullAble="Y",comment="是否已报诉")
	private String B_SFYBS = "b_sfybs";
	/**
	* B_SFYQS 是否已起诉
	*/
	@Column(columnName="b_sfyqs",dataType="char",dataLength=1,nullAble="Y",comment="是否已起诉")
	private String B_SFYQS = "b_sfyqs";
	/**
	* B_SFYRS 是否已入所
	*/
	@Column(columnName="b_sfyrs",dataType="char",dataLength=1,nullAble="Y",comment="是否已入所")
	private String B_SFYRS = "b_sfyrs";
	/**
	* B_SFYRJ 是否已入矫
	*/
	@Column(columnName="b_sfyrj",dataType="char",dataLength=1,nullAble="Y",comment="是否已入矫")
	private String B_SFYRJ = "b_sfyrj";
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
	* getV_kyyj(void) 
	*/
	public String getV_kyyj(){
		return this.V_KYYJ;
	}
	/**
	*setV_kyyj(java.lang.String)
	*/
	public void setV_kyyj(String v_kyyj){
		this.V_KYYJ=v_kyyj;
	}
	/**
	* getPk_gaj_ajxx_xyf_b(void) 
	*/
	public String getPk_gaj_ajxx_xyf_b(){
		return this.PK_GAJ_AJXX_XYF_B;
	}
	/**
	*setPk_gaj_ajxx_xyf_b(java.lang.String)
	*/
	public void setPk_gaj_ajxx_xyf_b(String pk_gaj_ajxx_xyf_b){
		this.PK_GAJ_AJXX_XYF_B=pk_gaj_ajxx_xyf_b;
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
	* getC_xyr(void) 
	*/
	public String getC_xyr(){
		return this.C_XYR;
	}
	/**
	*setC_xyr(java.lang.String)
	*/
	public void setC_xyr(String c_xyr){
		this.C_XYR=c_xyr;
	}
	/**
	* getV_xyrxm(void) 
	*/
	public String getV_xyrxm(){
		return this.V_XYRXM;
	}
	/**
	*setV_xyrxm(java.lang.String)
	*/
	public void setV_xyrxm(String v_xyrxm){
		this.V_XYRXM=v_xyrxm;
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
	* getV_xzz(void) 
	*/
	public String getV_xzz(){
		return this.V_XZZ;
	}
	/**
	*setV_xzz(java.lang.String)
	*/
	public void setV_xzz(String v_xzz){
		this.V_XZZ=v_xzz;
	}
	/**
	* getC_xysx(void) 
	*/
	public String getC_xysx(){
		return this.C_XYSX;
	}
	/**
	*setC_xysx(java.lang.String)
	*/
	public void setC_xysx(String c_xysx){
		this.C_XYSX=c_xysx;
	}
	/**
	* getV_ky(void) 
	*/
	public String getV_ky(){
		return this.V_KY;
	}
	/**
	*setV_ky(java.lang.String)
	*/
	public void setV_ky(String v_ky){
		this.V_KY=v_ky;
	}
	/**
	* getV_xsqk(void) 
	*/
	public String getV_xsqk(){
		return this.V_XSQK;
	}
	/**
	*setV_xsqk(java.lang.String)
	*/
	public void setV_xsqk(String v_xsqk){
		this.V_XSQK=v_xsqk;
	}
	/**
	* getV_jkqk(void) 
	*/
	public String getV_jkqk(){
		return this.V_JKQK;
	}
	/**
	*setV_jkqk(java.lang.String)
	*/
	public void setV_jkqk(String v_jkqk){
		this.V_JKQK=v_jkqk;
	}
	/**
	* getV_zayy(void) 
	*/
	public String getV_zayy(){
		return this.V_ZAYY;
	}
	/**
	*setV_zayy(java.lang.String)
	*/
	public void setV_zayy(String v_zayy){
		this.V_ZAYY=v_zayy;
	}
	/**
	* getV_wfss(void) 
	*/
	public String getV_wfss(){
		return this.V_WFSS;
	}
	/**
	*setV_wfss(java.lang.String)
	*/
	public void setV_wfss(String v_wfss){
		this.V_WFSS=v_wfss;
	}
	/**
	* getC_zhfs(void) 
	*/
	public String getC_zhfs(){
		return this.C_ZHFS;
	}
	/**
	*setC_zhfs(java.lang.String)
	*/
	public void setC_zhfs(String c_zhfs){
		this.C_ZHFS=c_zhfs;
	}
	/**
	* getD_zhrq(void) 
	*/
	public String getD_zhrq(){
		return this.D_ZHRQ;
	}
	/**
	*setD_zhrq(java.lang.String)
	*/
	public void setD_zhrq(String d_zhrq){
		this.D_ZHRQ=d_zhrq;
	}
	/**
	* getC_zhdq(void) 
	*/
	public String getC_zhdq(){
		return this.C_ZHDQ;
	}
	/**
	*setC_zhdq(java.lang.String)
	*/
	public void setC_zhdq(String c_zhdq){
		this.C_ZHDQ=c_zhdq;
	}
	/**
	* getV_zhdd(void) 
	*/
	public String getV_zhdd(){
		return this.V_ZHDD;
	}
	/**
	*setV_zhdd(java.lang.String)
	*/
	public void setV_zhdd(String v_zhdd){
		this.V_ZHDD=v_zhdd;
	}
	/**
	* getC_zhdw(void) 
	*/
	public String getC_zhdw(){
		return this.C_ZHDW;
	}
	/**
	*setC_zhdw(java.lang.String)
	*/
	public void setC_zhdw(String c_zhdw){
		this.C_ZHDW=c_zhdw;
	}
	/**
	* getV_zhdwmc(void) 
	*/
	public String getV_zhdwmc(){
		return this.V_ZHDWMC;
	}
	/**
	*setV_zhdwmc(java.lang.String)
	*/
	public void setV_zhdwmc(String v_zhdwmc){
		this.V_ZHDWMC=v_zhdwmc;
	}
	/**
	* getC_zhr(void) 
	*/
	public String getC_zhr(){
		return this.C_ZHR;
	}
	/**
	*setC_zhr(java.lang.String)
	*/
	public void setC_zhr(String c_zhr){
		this.C_ZHR=c_zhr;
	}
	/**
	* getV_zhrmc(void) 
	*/
	public String getV_zhrmc(){
		return this.V_ZHRMC;
	}
	/**
	*setV_zhrmc(java.lang.String)
	*/
	public void setV_zhrmc(String v_zhrmc){
		this.V_ZHRMC=v_zhrmc;
	}
	/**
	* getC_jwzhdw(void) 
	*/
	public String getC_jwzhdw(){
		return this.C_JWZHDW;
	}
	/**
	*setC_jwzhdw(java.lang.String)
	*/
	public void setC_jwzhdw(String c_jwzhdw){
		this.C_JWZHDW=c_jwzhdw;
	}
	/**
	* getV_jwzhdwmc(void) 
	*/
	public String getV_jwzhdwmc(){
		return this.V_JWZHDWMC;
	}
	/**
	*setV_jwzhdwmc(java.lang.String)
	*/
	public void setV_jwzhdwmc(String v_jwzhdwmc){
		this.V_JWZHDWMC=v_jwzhdwmc;
	}
	/**
	* getV_zhdy(void) 
	*/
	public String getV_zhdy(){
		return this.V_ZHDY;
	}
	/**
	*setV_zhdy(java.lang.String)
	*/
	public void setV_zhdy(String v_zhdy){
		this.V_ZHDY=v_zhdy;
	}
	/**
	* getV_wffzjl(void) 
	*/
	public String getV_wffzjl(){
		return this.V_WFFZJL;
	}
	/**
	*setV_wffzjl(java.lang.String)
	*/
	public void setV_wffzjl(String v_wffzjl){
		this.V_WFFZJL=v_wffzjl;
	}
	/**
	* getC_ztxy(void) 
	*/
	public String getC_ztxy(){
		return this.C_ZTXY;
	}
	/**
	*setC_ztxy(java.lang.String)
	*/
	public void setC_ztxy(String c_ztxy){
		this.C_ZTXY=c_ztxy;
	}
	/**
	* getD_ztrq(void) 
	*/
	public String getD_ztrq(){
		return this.D_ZTRQ;
	}
	/**
	*setD_ztrq(java.lang.String)
	*/
	public void setD_ztrq(String d_ztrq){
		this.D_ZTRQ=d_ztrq;
	}
	/**
	* getV_ztbh(void) 
	*/
	public String getV_ztbh(){
		return this.V_ZTBH;
	}
	/**
	*setV_ztbh(java.lang.String)
	*/
	public void setV_ztbh(String v_ztbh){
		this.V_ZTBH=v_ztbh;
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
	* getV_rybz(void) 
	*/
	public String getV_rybz(){
		return this.V_RYBZ;
	}
	/**
	*setV_rybz(java.lang.String)
	*/
	public void setV_rybz(String v_rybz){
		this.V_RYBZ=v_rybz;
	}
	/**
	* getB_sfybb(void) 
	*/
	public String getB_sfybb(){
		return this.B_SFYBB;
	}
	/**
	*setB_sfybb(java.lang.String)
	*/
	public void setB_sfybb(String b_sfybb){
		this.B_SFYBB=b_sfybb;
	}
	/**
	* getB_sfybs(void) 
	*/
	public String getB_sfybs(){
		return this.B_SFYBS;
	}
	/**
	*setB_sfybs(java.lang.String)
	*/
	public void setB_sfybs(String b_sfybs){
		this.B_SFYBS=b_sfybs;
	}
	/**
	* getB_sfyqs(void) 
	*/
	public String getB_sfyqs(){
		return this.B_SFYQS;
	}
	/**
	*setB_sfyqs(java.lang.String)
	*/
	public void setB_sfyqs(String b_sfyqs){
		this.B_SFYQS=b_sfyqs;
	}
	/**
	* getB_sfyrs(void) 
	*/
	public String getB_sfyrs(){
		return this.B_SFYRS;
	}
	/**
	*setB_sfyrs(java.lang.String)
	*/
	public void setB_sfyrs(String b_sfyrs){
		this.B_SFYRS=b_sfyrs;
	}
	/**
	* getB_sfyrj(void) 
	*/
	public String getB_sfyrj(){
		return this.B_SFYRJ;
	}
	/**
	*setB_sfyrj(java.lang.String)
	*/
	public void setB_sfyrj(String b_sfyrj){
		this.B_SFYRJ=b_sfyrj;
	}


}