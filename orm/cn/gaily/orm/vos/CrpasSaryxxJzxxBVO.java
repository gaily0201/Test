package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasSaryxxJzxxBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_saryxx_jzxx_b")
public class CrpasSaryxxJzxxBVO {
	/**
	* PK_SARYXX_JZXX_B 子表主键
	*/
	@Column(columnName="pk_saryxx_jzxx_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_SARYXX_JZXX_B = "pk_saryxx_jzxx_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_JZBH 寄住编号
	*/
	@Column(columnName="v_jzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="寄住编号")
	private String V_JZBH = "v_jzbh";
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
	* C_YHZGX 与寄住户主关系
	*/
	@Column(columnName="c_yhzgx",dataType="varchar",dataLength=20,nullAble="Y",comment="与寄住户主关系")
	private String C_YHZGX = "c_yhzgx";
	/**
	* V_HSJZBZ 何时寄住本址
	*/
	@Column(columnName="v_hsjzbz",dataType="char",dataLength=19,nullAble="Y",comment="何时寄住本址")
	private String V_HSJZBZ = "v_hsjzbz";
	/**
	* C_HYJZBZ 寄住原因
	*/
	@Column(columnName="c_hyjzbz",dataType="varchar",dataLength=20,nullAble="Y",comment="寄住原因")
	private String C_HYJZBZ = "c_hyjzbz";
	/**
	* D_HSZX 何时注销
	*/
	@Column(columnName="d_hszx",dataType="char",dataLength=19,nullAble="Y",comment="何时注销")
	private String D_HSZX = "d_hszx";
	/**
	* V_HYZX 何因注销
	*/
	@Column(columnName="v_hyzx",dataType="varchar",dataLength=2000,nullAble="Y",comment="何因注销")
	private String V_HYZX = "v_hyzx";
	/**
	* V_ZXBS 注销标识
	*/
	@Column(columnName="v_zxbs",dataType="varchar",dataLength=400,nullAble="Y",comment="注销标识")
	private String V_ZXBS = "v_zxbs";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=200,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
	/**
	* V_JZZZBH 寄口住址编号
	*/
	@Column(columnName="v_jzzzbh",dataType="varchar",dataLength=50,nullAble="Y",comment="寄口住址编号")
	private String V_JZZZBH = "v_jzzzbh";
	/**
	* C_JZZT 寄住状态
	*/
	@Column(columnName="c_jzzt",dataType="varchar",dataLength=20,nullAble="Y",comment="寄住状态")
	private String C_JZZT = "c_jzzt";
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
	* getPk_saryxx_jzxx_b(void) 
	*/
	public String getPk_saryxx_jzxx_b(){
		return this.PK_SARYXX_JZXX_B;
	}
	/**
	*setPk_saryxx_jzxx_b(java.lang.String)
	*/
	public void setPk_saryxx_jzxx_b(String pk_saryxx_jzxx_b){
		this.PK_SARYXX_JZXX_B=pk_saryxx_jzxx_b;
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
	* getV_jzbh(void) 
	*/
	public String getV_jzbh(){
		return this.V_JZBH;
	}
	/**
	*setV_jzbh(java.lang.String)
	*/
	public void setV_jzbh(String v_jzbh){
		this.V_JZBH=v_jzbh;
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
	* getC_yhzgx(void) 
	*/
	public String getC_yhzgx(){
		return this.C_YHZGX;
	}
	/**
	*setC_yhzgx(java.lang.String)
	*/
	public void setC_yhzgx(String c_yhzgx){
		this.C_YHZGX=c_yhzgx;
	}
	/**
	* getV_hsjzbz(void) 
	*/
	public String getV_hsjzbz(){
		return this.V_HSJZBZ;
	}
	/**
	*setV_hsjzbz(java.lang.String)
	*/
	public void setV_hsjzbz(String v_hsjzbz){
		this.V_HSJZBZ=v_hsjzbz;
	}
	/**
	* getC_hyjzbz(void) 
	*/
	public String getC_hyjzbz(){
		return this.C_HYJZBZ;
	}
	/**
	*setC_hyjzbz(java.lang.String)
	*/
	public void setC_hyjzbz(String c_hyjzbz){
		this.C_HYJZBZ=c_hyjzbz;
	}
	/**
	* getD_hszx(void) 
	*/
	public String getD_hszx(){
		return this.D_HSZX;
	}
	/**
	*setD_hszx(java.lang.String)
	*/
	public void setD_hszx(String d_hszx){
		this.D_HSZX=d_hszx;
	}
	/**
	* getV_hyzx(void) 
	*/
	public String getV_hyzx(){
		return this.V_HYZX;
	}
	/**
	*setV_hyzx(java.lang.String)
	*/
	public void setV_hyzx(String v_hyzx){
		this.V_HYZX=v_hyzx;
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
	* getV_jzzzbh(void) 
	*/
	public String getV_jzzzbh(){
		return this.V_JZZZBH;
	}
	/**
	*setV_jzzzbh(java.lang.String)
	*/
	public void setV_jzzzbh(String v_jzzzbh){
		this.V_JZZZBH=v_jzzzbh;
	}
	/**
	* getC_jzzt(void) 
	*/
	public String getC_jzzt(){
		return this.C_JZZT;
	}
	/**
	*setC_jzzt(java.lang.String)
	*/
	public void setC_jzzt(String c_jzzt){
		this.C_JZZT=c_jzzt;
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