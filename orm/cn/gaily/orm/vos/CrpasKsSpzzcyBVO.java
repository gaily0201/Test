package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasKsSpzzcyBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ks_spzzcy_b")
public class CrpasKsSpzzcyBVO {
	/**
	* PK_KS_SPZZCY_B 子表主键
	*/
	@Column(columnName="pk_ks_spzzcy_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_KS_SPZZCY_B = "pk_ks_spzzcy_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="Y",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_YCY 原成员
	*/
	@Column(columnName="v_ycy",dataType="varchar",dataLength=200,nullAble="Y",comment="原成员")
	private String V_YCY = "v_ycy";
	/**
	* V_PSYYQF 陪审员邀请方
	*/
	@Column(columnName="v_psyyqf",dataType="varchar",dataLength=20,nullAble="Y",comment="陪审员邀请方")
	private String V_PSYYQF = "v_psyyqf";
	/**
	* V_JS 角色
	*/
	@Column(columnName="v_js",dataType="varchar",dataLength=20,nullAble="Y",comment="角色")
	private String V_JS = "v_js";
	/**
	* V_XCY 新成员
	*/
	@Column(columnName="v_xcy",dataType="varchar",dataLength=200,nullAble="Y",comment="新成员")
	private String V_XCY = "v_xcy";
	/**
	* D_BGRQ 变更日期
	*/
	@Column(columnName="d_bgrq",dataType="char",dataLength=19,nullAble="Y",comment="变更日期")
	private String D_BGRQ = "d_bgrq";
	/**
	* V_BGYY 变更原因
	*/
	@Column(columnName="v_bgyy",dataType="varchar",dataLength=20,nullAble="Y",comment="变更原因")
	private String V_BGYY = "v_bgyy";
	/**
	* PK_KS_H 抗诉信息主表_主键
	*/
	@Column(columnName="pk_ks_h",dataType="char",dataLength=20,nullAble="N",comment="抗诉信息主表_主键")
	private String PK_KS_H = "pk_ks_h";
	/**
	* getPk_ks_spzzcy_b(void) 
	*/
	public String getPk_ks_spzzcy_b(){
		return this.PK_KS_SPZZCY_B;
	}
	/**
	*setPk_ks_spzzcy_b(java.lang.String)
	*/
	public void setPk_ks_spzzcy_b(String pk_ks_spzzcy_b){
		this.PK_KS_SPZZCY_B=pk_ks_spzzcy_b;
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
	* getV_ycy(void) 
	*/
	public String getV_ycy(){
		return this.V_YCY;
	}
	/**
	*setV_ycy(java.lang.String)
	*/
	public void setV_ycy(String v_ycy){
		this.V_YCY=v_ycy;
	}
	/**
	* getV_psyyqf(void) 
	*/
	public String getV_psyyqf(){
		return this.V_PSYYQF;
	}
	/**
	*setV_psyyqf(java.lang.String)
	*/
	public void setV_psyyqf(String v_psyyqf){
		this.V_PSYYQF=v_psyyqf;
	}
	/**
	* getV_js(void) 
	*/
	public String getV_js(){
		return this.V_JS;
	}
	/**
	*setV_js(java.lang.String)
	*/
	public void setV_js(String v_js){
		this.V_JS=v_js;
	}
	/**
	* getV_xcy(void) 
	*/
	public String getV_xcy(){
		return this.V_XCY;
	}
	/**
	*setV_xcy(java.lang.String)
	*/
	public void setV_xcy(String v_xcy){
		this.V_XCY=v_xcy;
	}
	/**
	* getD_bgrq(void) 
	*/
	public String getD_bgrq(){
		return this.D_BGRQ;
	}
	/**
	*setD_bgrq(java.lang.String)
	*/
	public void setD_bgrq(String d_bgrq){
		this.D_BGRQ=d_bgrq;
	}
	/**
	* getV_bgyy(void) 
	*/
	public String getV_bgyy(){
		return this.V_BGYY;
	}
	/**
	*setV_bgyy(java.lang.String)
	*/
	public void setV_bgyy(String v_bgyy){
		this.V_BGYY=v_bgyy;
	}
	/**
	* getPk_ks_h(void) 
	*/
	public String getPk_ks_h(){
		return this.PK_KS_H;
	}
	/**
	*setPk_ks_h(java.lang.String)
	*/
	public void setPk_ks_h(String pk_ks_h){
		this.PK_KS_H=pk_ks_h;
	}


}