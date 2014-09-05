package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGajAjxxShrBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_shr_b")
public class CrpasGajAjxxShrBVO {
	/**
	* PK_GAJ_AJXX_H 公安案件登记主表_主键
	*/
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="公安案件登记主表_主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* PK_GAJ_AJXX_SHR_B 子表主键
	*/
	@Column(columnName="pk_gaj_ajxx_shr_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GAJ_AJXX_SHR_B = "pk_gaj_ajxx_shr_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_SHR 受害人id
	*/
	@Column(columnName="c_shr",dataType="char",dataLength=20,nullAble="Y",comment="受害人id")
	private String C_SHR = "c_shr";
	/**
	* V_SHRMC 受害人姓名
	*/
	@Column(columnName="v_shrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="受害人姓名")
	private String V_SHRMC = "v_shrmc";
	/**
	* V_XZZ 现住址
	*/
	@Column(columnName="v_xzz",dataType="varchar",dataLength=100,nullAble="Y",comment="现住址")
	private String V_XZZ = "v_xzz";
	/**
	* C_BMJB 保密级别
	*/
	@Column(columnName="c_bmjb",dataType="varchar",dataLength=20,nullAble="Y",comment="保密级别")
	private String C_BMJB = "c_bmjb";
	/**
	* C_SHCD 受害程度
	*/
	@Column(columnName="c_shcd",dataType="varchar",dataLength=20,nullAble="Y",comment="受害程度")
	private String C_SHCD = "c_shcd";
	/**
	* B_SFBGM 是否被拐卖
	*/
	@Column(columnName="b_sfbgm",dataType="char",dataLength=1,nullAble="Y",comment="是否被拐卖")
	private String B_SFBGM = "b_sfbgm";
	/**
	* B_SFLY 是否聋哑
	*/
	@Column(columnName="b_sfly",dataType="char",dataLength=1,nullAble="Y",comment="是否聋哑")
	private String B_SFLY = "b_sfly";
	/**
	* T_SHSJ 受害时间
	*/
	@Column(columnName="t_shsj",dataType="char",dataLength=19,nullAble="Y",comment="受害时间")
	private String T_SHSJ = "t_shsj";
	/**
	* V_SHDD 受害地点
	*/
	@Column(columnName="v_shdd",dataType="varchar",dataLength=100,nullAble="Y",comment="受害地点")
	private String V_SHDD = "v_shdd";
	/**
	* C_SHXS 受害形式
	*/
	@Column(columnName="c_shxs",dataType="varchar",dataLength=20,nullAble="Y",comment="受害形式")
	private String C_SHXS = "c_shxs";
	/**
	* V_ZSYY 致死原因
	*/
	@Column(columnName="v_zsyy",dataType="varchar",dataLength=50,nullAble="Y",comment="致死原因")
	private String V_ZSYY = "v_zsyy";
	/**
	* V_ZSGJ 致死工具
	*/
	@Column(columnName="v_zsgj",dataType="varchar",dataLength=50,nullAble="Y",comment="致死工具")
	private String V_ZSGJ = "v_zsgj";
	/**
	* V_SHJG 受害经过
	*/
	@Column(columnName="v_shjg",dataType="varchar",dataLength=2000,nullAble="Y",comment="受害经过")
	private String V_SHJG = "v_shjg";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=2000,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
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
	* V_YZTZ yztz
	*/
	@Column(columnName="v_yztz",dataType="varchar",dataLength=100,nullAble="Y",comment="yztz")
	private String V_YZTZ = "v_yztz";
	/**
	* V_SSWP sswp
	*/
	@Column(columnName="v_sswp",dataType="varchar",dataLength=100,nullAble="Y",comment="sswp")
	private String V_SSWP = "v_sswp";
	/**
	* B_SFSW 是否死亡
	*/
	@Column(columnName="b_sfsw",dataType="char",dataLength=1,nullAble="Y",comment="是否死亡")
	private String B_SFSW = "b_sfsw";
	/**
	* T_SWSJ 死亡时间
	*/
	@Column(columnName="t_swsj",dataType="char",dataLength=19,nullAble="Y",comment="死亡时间")
	private String T_SWSJ = "t_swsj";
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
	* getPk_gaj_ajxx_shr_b(void) 
	*/
	public String getPk_gaj_ajxx_shr_b(){
		return this.PK_GAJ_AJXX_SHR_B;
	}
	/**
	*setPk_gaj_ajxx_shr_b(java.lang.String)
	*/
	public void setPk_gaj_ajxx_shr_b(String pk_gaj_ajxx_shr_b){
		this.PK_GAJ_AJXX_SHR_B=pk_gaj_ajxx_shr_b;
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
	* getV_shrmc(void) 
	*/
	public String getV_shrmc(){
		return this.V_SHRMC;
	}
	/**
	*setV_shrmc(java.lang.String)
	*/
	public void setV_shrmc(String v_shrmc){
		this.V_SHRMC=v_shrmc;
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
	* getC_shcd(void) 
	*/
	public String getC_shcd(){
		return this.C_SHCD;
	}
	/**
	*setC_shcd(java.lang.String)
	*/
	public void setC_shcd(String c_shcd){
		this.C_SHCD=c_shcd;
	}
	/**
	* getB_sfbgm(void) 
	*/
	public String getB_sfbgm(){
		return this.B_SFBGM;
	}
	/**
	*setB_sfbgm(java.lang.String)
	*/
	public void setB_sfbgm(String b_sfbgm){
		this.B_SFBGM=b_sfbgm;
	}
	/**
	* getB_sfly(void) 
	*/
	public String getB_sfly(){
		return this.B_SFLY;
	}
	/**
	*setB_sfly(java.lang.String)
	*/
	public void setB_sfly(String b_sfly){
		this.B_SFLY=b_sfly;
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
	* getV_shdd(void) 
	*/
	public String getV_shdd(){
		return this.V_SHDD;
	}
	/**
	*setV_shdd(java.lang.String)
	*/
	public void setV_shdd(String v_shdd){
		this.V_SHDD=v_shdd;
	}
	/**
	* getC_shxs(void) 
	*/
	public String getC_shxs(){
		return this.C_SHXS;
	}
	/**
	*setC_shxs(java.lang.String)
	*/
	public void setC_shxs(String c_shxs){
		this.C_SHXS=c_shxs;
	}
	/**
	* getV_zsyy(void) 
	*/
	public String getV_zsyy(){
		return this.V_ZSYY;
	}
	/**
	*setV_zsyy(java.lang.String)
	*/
	public void setV_zsyy(String v_zsyy){
		this.V_ZSYY=v_zsyy;
	}
	/**
	* getV_zsgj(void) 
	*/
	public String getV_zsgj(){
		return this.V_ZSGJ;
	}
	/**
	*setV_zsgj(java.lang.String)
	*/
	public void setV_zsgj(String v_zsgj){
		this.V_ZSGJ=v_zsgj;
	}
	/**
	* getV_shjg(void) 
	*/
	public String getV_shjg(){
		return this.V_SHJG;
	}
	/**
	*setV_shjg(java.lang.String)
	*/
	public void setV_shjg(String v_shjg){
		this.V_SHJG=v_shjg;
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
	* getV_yztz(void) 
	*/
	public String getV_yztz(){
		return this.V_YZTZ;
	}
	/**
	*setV_yztz(java.lang.String)
	*/
	public void setV_yztz(String v_yztz){
		this.V_YZTZ=v_yztz;
	}
	/**
	* getV_sswp(void) 
	*/
	public String getV_sswp(){
		return this.V_SSWP;
	}
	/**
	*setV_sswp(java.lang.String)
	*/
	public void setV_sswp(String v_sswp){
		this.V_SSWP=v_sswp;
	}
	/**
	* getB_sfsw(void) 
	*/
	public String getB_sfsw(){
		return this.B_SFSW;
	}
	/**
	*setB_sfsw(java.lang.String)
	*/
	public void setB_sfsw(String b_sfsw){
		this.B_SFSW=b_sfsw;
	}
	/**
	* getT_swsj(void) 
	*/
	public String getT_swsj(){
		return this.T_SWSJ;
	}
	/**
	*setT_swsj(java.lang.String)
	*/
	public void setT_swsj(String t_swsj){
		this.T_SWSJ=t_swsj;
	}


}