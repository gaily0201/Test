package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGajAjxxSadwBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gaj_ajxx_sadw_b")
public class CrpasGajAjxxSadwBVO {
	/**
	* PK_GAJ_AJXX_H 公安案件登记主表_主键
	*/
	@Column(columnName="pk_gaj_ajxx_h",dataType="char",dataLength=20,nullAble="N",comment="公安案件登记主表_主键")
	private String PK_GAJ_AJXX_H = "pk_gaj_ajxx_h";
	/**
	* N_JJSS 经济损失
	*/
	@Column(columnName="n_jjss",dataType="decimal",dataLength=20,nullAble="Y",comment="经济损失")
	private String N_JJSS = "n_jjss";
	/**
	* PK_GAJ_AJXX_SADW_B 子表主键
	*/
	@Column(columnName="pk_gaj_ajxx_sadw_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GAJ_AJXX_SADW_B = "pk_gaj_ajxx_sadw_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_SADW 涉案单位id
	*/
	@Column(columnName="c_sadw",dataType="char",dataLength=20,nullAble="Y",comment="涉案单位id")
	private String C_SADW = "c_sadw";
	/**
	* V_SADWMC 涉案单位名称
	*/
	@Column(columnName="v_sadwmc",dataType="varchar",dataLength=100,nullAble="Y",comment="涉案单位名称")
	private String V_SADWMC = "v_sadwmc";
	/**
	* V_BHDD 被害地点
	*/
	@Column(columnName="v_bhdd",dataType="varchar",dataLength=100,nullAble="Y",comment="被害地点")
	private String V_BHDD = "v_bhdd";
	/**
	* T_BHSJ 被害时间
	*/
	@Column(columnName="t_bhsj",dataType="char",dataLength=19,nullAble="Y",comment="被害时间")
	private String T_BHSJ = "t_bhsj";
	/**
	* V_BHJG 被害经过
	*/
	@Column(columnName="v_bhjg",dataType="varchar",dataLength=2000,nullAble="Y",comment="被害经过")
	private String V_BHJG = "v_bhjg";
	/**
	* C_DWLB 单位类别
	*/
	@Column(columnName="c_dwlb",dataType="varchar",dataLength=20,nullAble="Y",comment="单位类别")
	private String C_DWLB = "c_dwlb";
	/**
	* V_WFSS 违法事实
	*/
	@Column(columnName="v_wfss",dataType="varchar",dataLength=2000,nullAble="Y",comment="违法事实")
	private String V_WFSS = "v_wfss";
	/**
	* V_ZJZRR 直接责任人
	*/
	@Column(columnName="v_zjzrr",dataType="varchar",dataLength=50,nullAble="Y",comment="直接责任人")
	private String V_ZJZRR = "v_zjzrr";
	/**
	* V_ZGRY 主管人员
	*/
	@Column(columnName="v_zgry",dataType="varchar",dataLength=50,nullAble="Y",comment="主管人员")
	private String V_ZGRY = "v_zgry";
	/**
	* N_SAJE 涉案金额
	*/
	@Column(columnName="n_saje",dataType="decimal",dataLength=20,nullAble="Y",comment="涉案金额")
	private String N_SAJE = "n_saje";
	/**
	* N_SYJE 损失金额
	*/
	@Column(columnName="n_syje",dataType="decimal",dataLength=20,nullAble="Y",comment="损失金额")
	private String N_SYJE = "n_syje";
	/**
	* N_WHSYJE 挽回损失金额
	*/
	@Column(columnName="n_whsyje",dataType="decimal",dataLength=20,nullAble="Y",comment="挽回损失金额")
	private String N_WHSYJE = "n_whsyje";
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
	* V_JGBH 机构编号
	*/
	@Column(columnName="v_jgbh",dataType="varchar",dataLength=50,nullAble="Y",comment="机构编号")
	private String V_JGBH = "v_jgbh";
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
	* getN_jjss(void) 
	*/
	public String getN_jjss(){
		return this.N_JJSS;
	}
	/**
	*setN_jjss(java.lang.String)
	*/
	public void setN_jjss(String n_jjss){
		this.N_JJSS=n_jjss;
	}
	/**
	* getPk_gaj_ajxx_sadw_b(void) 
	*/
	public String getPk_gaj_ajxx_sadw_b(){
		return this.PK_GAJ_AJXX_SADW_B;
	}
	/**
	*setPk_gaj_ajxx_sadw_b(java.lang.String)
	*/
	public void setPk_gaj_ajxx_sadw_b(String pk_gaj_ajxx_sadw_b){
		this.PK_GAJ_AJXX_SADW_B=pk_gaj_ajxx_sadw_b;
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
	* getC_sadw(void) 
	*/
	public String getC_sadw(){
		return this.C_SADW;
	}
	/**
	*setC_sadw(java.lang.String)
	*/
	public void setC_sadw(String c_sadw){
		this.C_SADW=c_sadw;
	}
	/**
	* getV_sadwmc(void) 
	*/
	public String getV_sadwmc(){
		return this.V_SADWMC;
	}
	/**
	*setV_sadwmc(java.lang.String)
	*/
	public void setV_sadwmc(String v_sadwmc){
		this.V_SADWMC=v_sadwmc;
	}
	/**
	* getV_bhdd(void) 
	*/
	public String getV_bhdd(){
		return this.V_BHDD;
	}
	/**
	*setV_bhdd(java.lang.String)
	*/
	public void setV_bhdd(String v_bhdd){
		this.V_BHDD=v_bhdd;
	}
	/**
	* getT_bhsj(void) 
	*/
	public String getT_bhsj(){
		return this.T_BHSJ;
	}
	/**
	*setT_bhsj(java.lang.String)
	*/
	public void setT_bhsj(String t_bhsj){
		this.T_BHSJ=t_bhsj;
	}
	/**
	* getV_bhjg(void) 
	*/
	public String getV_bhjg(){
		return this.V_BHJG;
	}
	/**
	*setV_bhjg(java.lang.String)
	*/
	public void setV_bhjg(String v_bhjg){
		this.V_BHJG=v_bhjg;
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
	* getV_zjzrr(void) 
	*/
	public String getV_zjzrr(){
		return this.V_ZJZRR;
	}
	/**
	*setV_zjzrr(java.lang.String)
	*/
	public void setV_zjzrr(String v_zjzrr){
		this.V_ZJZRR=v_zjzrr;
	}
	/**
	* getV_zgry(void) 
	*/
	public String getV_zgry(){
		return this.V_ZGRY;
	}
	/**
	*setV_zgry(java.lang.String)
	*/
	public void setV_zgry(String v_zgry){
		this.V_ZGRY=v_zgry;
	}
	/**
	* getN_saje(void) 
	*/
	public String getN_saje(){
		return this.N_SAJE;
	}
	/**
	*setN_saje(java.lang.String)
	*/
	public void setN_saje(String n_saje){
		this.N_SAJE=n_saje;
	}
	/**
	* getN_syje(void) 
	*/
	public String getN_syje(){
		return this.N_SYJE;
	}
	/**
	*setN_syje(java.lang.String)
	*/
	public void setN_syje(String n_syje){
		this.N_SYJE=n_syje;
	}
	/**
	* getN_whsyje(void) 
	*/
	public String getN_whsyje(){
		return this.N_WHSYJE;
	}
	/**
	*setN_whsyje(java.lang.String)
	*/
	public void setN_whsyje(String n_whsyje){
		this.N_WHSYJE=n_whsyje;
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


}