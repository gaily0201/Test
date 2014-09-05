package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGajAjxxSacwczBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_sacwcz_b")
public class CrpasGajAjxxSacwczBVO {
	/**
	* PK_GAJ_AJXX_SACWCZ_B 子表主键
	*/
	@Column(columnName="pk_gaj_ajxx_sacwcz_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GAJ_AJXX_SACWCZ_B = "pk_gaj_ajxx_sacwcz_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_JLBH 财物编号
	*/
	@Column(columnName="v_jlbh",dataType="varchar",dataLength=50,nullAble="Y",comment="财物编号")
	private String V_JLBH = "v_jlbh";
	/**
	* V_AJBH 财物案件编号
	*/
	@Column(columnName="v_ajbh",dataType="varchar",dataLength=50,nullAble="Y",comment="财物案件编号")
	private String V_AJBH = "v_ajbh";
	/**
	* V_RYBH 财物人员编号
	*/
	@Column(columnName="v_rybh",dataType="varchar",dataLength=50,nullAble="Y",comment="财物人员编号")
	private String V_RYBH = "v_rybh";
	/**
	* C_WPSYR 财物所有人id
	*/
	@Column(columnName="c_wpsyr",dataType="char",dataLength=20,nullAble="Y",comment="财物所有人id")
	private String C_WPSYR = "c_wpsyr";
	/**
	* V_WPSYRMC 财物所有人名称
	*/
	@Column(columnName="v_wpsyrmc",dataType="varchar",dataLength=50,nullAble="Y",comment="财物所有人名称")
	private String V_WPSYRMC = "v_wpsyrmc";
	/**
	* C_CWLB 财物类别
	*/
	@Column(columnName="c_cwlb",dataType="varchar",dataLength=20,nullAble="Y",comment="财物类别")
	private String C_CWLB = "c_cwlb";
	/**
	* V_CWMC 财物名称
	*/
	@Column(columnName="v_cwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="财物名称")
	private String V_CWMC = "v_cwmc";
	/**
	* N_CWSL 财物数量
	*/
	@Column(columnName="n_cwsl",dataType="decimal",dataLength=20,nullAble="Y",comment="财物数量")
	private String N_CWSL = "n_cwsl";
	/**
	* C_SLDW 数量单位
	*/
	@Column(columnName="c_sldw",dataType="varchar",dataLength=20,nullAble="Y",comment="数量单位")
	private String C_SLDW = "c_sldw";
	/**
	* N_JZ 价值
	*/
	@Column(columnName="n_jz",dataType="decimal",dataLength=20,nullAble="Y",comment="价值")
	private String N_JZ = "n_jz";
	/**
	* C_JZDW 价值单位
	*/
	@Column(columnName="c_jzdw",dataType="varchar",dataLength=20,nullAble="Y",comment="价值单位")
	private String C_JZDW = "c_jzdw";
	/**
	* C_JZBZ 价值币种
	*/
	@Column(columnName="c_jzbz",dataType="varchar",dataLength=20,nullAble="Y",comment="价值币种")
	private String C_JZBZ = "c_jzbz";
	/**
	* N_KCSL 库存数量
	*/
	@Column(columnName="n_kcsl",dataType="decimal",dataLength=20,nullAble="Y",comment="库存数量")
	private String N_KCSL = "n_kcsl";
	/**
	* N_KCJZ 库存价值
	*/
	@Column(columnName="n_kcjz",dataType="decimal",dataLength=20,nullAble="Y",comment="库存价值")
	private String N_KCJZ = "n_kcjz";
	/**
	* C_CWZT 财物状态
	*/
	@Column(columnName="c_cwzt",dataType="varchar",dataLength=20,nullAble="Y",comment="财物状态")
	private String C_CWZT = "c_cwzt";
	/**
	* V_CFWZ 存放位置
	*/
	@Column(columnName="v_cfwz",dataType="varchar",dataLength=100,nullAble="Y",comment="存放位置")
	private String V_CFWZ = "v_cfwz";
	/**
	* V_TZ 特征
	*/
	@Column(columnName="v_tz",dataType="varchar",dataLength=100,nullAble="Y",comment="特征")
	private String V_TZ = "v_tz";
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
	* PK_GAJ_AJXX_H 公安案件登记主表_主键
	*/
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="公安案件登记主表_主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* getPk_gaj_ajxx_sacwcz_b(void) 
	*/
	public String getPk_gaj_ajxx_sacwcz_b(){
		return this.PK_GAJ_AJXX_SACWCZ_B;
	}
	/**
	*setPk_gaj_ajxx_sacwcz_b(java.lang.String)
	*/
	public void setPk_gaj_ajxx_sacwcz_b(String pk_gaj_ajxx_sacwcz_b){
		this.PK_GAJ_AJXX_SACWCZ_B=pk_gaj_ajxx_sacwcz_b;
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
	* getC_cwlb(void) 
	*/
	public String getC_cwlb(){
		return this.C_CWLB;
	}
	/**
	*setC_cwlb(java.lang.String)
	*/
	public void setC_cwlb(String c_cwlb){
		this.C_CWLB=c_cwlb;
	}
	/**
	* getV_cwmc(void) 
	*/
	public String getV_cwmc(){
		return this.V_CWMC;
	}
	/**
	*setV_cwmc(java.lang.String)
	*/
	public void setV_cwmc(String v_cwmc){
		this.V_CWMC=v_cwmc;
	}
	/**
	* getN_cwsl(void) 
	*/
	public String getN_cwsl(){
		return this.N_CWSL;
	}
	/**
	*setN_cwsl(java.lang.String)
	*/
	public void setN_cwsl(String n_cwsl){
		this.N_CWSL=n_cwsl;
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
	* getN_jz(void) 
	*/
	public String getN_jz(){
		return this.N_JZ;
	}
	/**
	*setN_jz(java.lang.String)
	*/
	public void setN_jz(String n_jz){
		this.N_JZ=n_jz;
	}
	/**
	* getC_jzdw(void) 
	*/
	public String getC_jzdw(){
		return this.C_JZDW;
	}
	/**
	*setC_jzdw(java.lang.String)
	*/
	public void setC_jzdw(String c_jzdw){
		this.C_JZDW=c_jzdw;
	}
	/**
	* getC_jzbz(void) 
	*/
	public String getC_jzbz(){
		return this.C_JZBZ;
	}
	/**
	*setC_jzbz(java.lang.String)
	*/
	public void setC_jzbz(String c_jzbz){
		this.C_JZBZ=c_jzbz;
	}
	/**
	* getN_kcsl(void) 
	*/
	public String getN_kcsl(){
		return this.N_KCSL;
	}
	/**
	*setN_kcsl(java.lang.String)
	*/
	public void setN_kcsl(String n_kcsl){
		this.N_KCSL=n_kcsl;
	}
	/**
	* getN_kcjz(void) 
	*/
	public String getN_kcjz(){
		return this.N_KCJZ;
	}
	/**
	*setN_kcjz(java.lang.String)
	*/
	public void setN_kcjz(String n_kcjz){
		this.N_KCJZ=n_kcjz;
	}
	/**
	* getC_cwzt(void) 
	*/
	public String getC_cwzt(){
		return this.C_CWZT;
	}
	/**
	*setC_cwzt(java.lang.String)
	*/
	public void setC_cwzt(String c_cwzt){
		this.C_CWZT=c_cwzt;
	}
	/**
	* getV_cfwz(void) 
	*/
	public String getV_cfwz(){
		return this.V_CFWZ;
	}
	/**
	*setV_cfwz(java.lang.String)
	*/
	public void setV_cfwz(String v_cfwz){
		this.V_CFWZ=v_cfwz;
	}
	/**
	* getV_tz(void) 
	*/
	public String getV_tz(){
		return this.V_TZ;
	}
	/**
	*setV_tz(java.lang.String)
	*/
	public void setV_tz(String v_tz){
		this.V_TZ=v_tz;
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