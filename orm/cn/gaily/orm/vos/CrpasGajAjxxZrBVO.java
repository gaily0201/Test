package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGajAjxxZrBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_zr_b")
public class CrpasGajAjxxZrBVO {
	/**
	* PK_GAJ_AJXX_H 公安案件登记主表_主键
	*/
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="公安案件登记主表_主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* PK_GAJ_AJXX_ZR_B 子表主键
	*/
	@Column(columnName="pk_gaj_ajxx_zr_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GAJ_AJXX_ZR_B = "pk_gaj_ajxx_zr_b";
	/**
	* C_ZR 证人id
	*/
	@Column(columnName="c_zr",dataType="char",dataLength=20,nullAble="Y",comment="证人id")
	private String C_ZR = "c_zr";
	/**
	* V_ZRXM 证人姓名
	*/
	@Column(columnName="v_zrxm",dataType="varchar",dataLength=50,nullAble="Y",comment="证人姓名")
	private String V_ZRXM = "v_zrxm";
	/**
	* V_XZZ 现住址
	*/
	@Column(columnName="v_xzz",dataType="varchar",dataLength=100,nullAble="Y",comment="现住址")
	private String V_XZZ = "v_xzz";
	/**
	* C_ZRZL 证人种类
	*/
	@Column(columnName="c_zrzl",dataType="varchar",dataLength=20,nullAble="Y",comment="证人种类")
	private String C_ZRZL = "c_zrzl";
	/**
	* T_ZZSJ 作证时间
	*/
	@Column(columnName="t_zzsj",dataType="char",dataLength=19,nullAble="Y",comment="作证时间")
	private String T_ZZSJ = "t_zzsj";
	/**
	* V_ZZDD 作证地点
	*/
	@Column(columnName="v_zzdd",dataType="varchar",dataLength=100,nullAble="Y",comment="作证地点")
	private String V_ZZDD = "v_zzdd";
	/**
	* V_ZZJG 作证经过
	*/
	@Column(columnName="v_zzjg",dataType="varchar",dataLength=2000,nullAble="Y",comment="作证经过")
	private String V_ZZJG = "v_zzjg";
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
	* C_BMJB 保密级别
	*/
	@Column(columnName="c_bmjb",dataType="varchar",dataLength=20,nullAble="Y",comment="保密级别")
	private String C_BMJB = "c_bmjb";
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
	* getPk_gaj_ajxx_zr_b(void) 
	*/
	public String getPk_gaj_ajxx_zr_b(){
		return this.PK_GAJ_AJXX_ZR_B;
	}
	/**
	*setPk_gaj_ajxx_zr_b(java.lang.String)
	*/
	public void setPk_gaj_ajxx_zr_b(String pk_gaj_ajxx_zr_b){
		this.PK_GAJ_AJXX_ZR_B=pk_gaj_ajxx_zr_b;
	}
	/**
	* getC_zr(void) 
	*/
	public String getC_zr(){
		return this.C_ZR;
	}
	/**
	*setC_zr(java.lang.String)
	*/
	public void setC_zr(String c_zr){
		this.C_ZR=c_zr;
	}
	/**
	* getV_zrxm(void) 
	*/
	public String getV_zrxm(){
		return this.V_ZRXM;
	}
	/**
	*setV_zrxm(java.lang.String)
	*/
	public void setV_zrxm(String v_zrxm){
		this.V_ZRXM=v_zrxm;
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
	* getC_zrzl(void) 
	*/
	public String getC_zrzl(){
		return this.C_ZRZL;
	}
	/**
	*setC_zrzl(java.lang.String)
	*/
	public void setC_zrzl(String c_zrzl){
		this.C_ZRZL=c_zrzl;
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
	* getV_zzdd(void) 
	*/
	public String getV_zzdd(){
		return this.V_ZZDD;
	}
	/**
	*setV_zzdd(java.lang.String)
	*/
	public void setV_zzdd(String v_zzdd){
		this.V_ZZDD=v_zzdd;
	}
	/**
	* getV_zzjg(void) 
	*/
	public String getV_zzjg(){
		return this.V_ZZJG;
	}
	/**
	*setV_zzjg(java.lang.String)
	*/
	public void setV_zzjg(String v_zzjg){
		this.V_ZZJG=v_zzjg;
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


}