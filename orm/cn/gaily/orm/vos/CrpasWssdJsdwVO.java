package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasWssdJsdwVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_wssd_jsdw")
public class CrpasWssdJsdwVO {
	/**
	* PK_WSSD_H 文书送达主表_主键
	*/
	@Column(columnName="pk_wssd_h",dataType="char",dataLength=20,nullAble="N",comment="文书送达主表_主键")
	private String PK_WSSD_H = "pk_wssd_h";
	/**
	* PK_WSLXGL_MB 子表主键
	*/
	@Column(columnName="pk_wslxgl_mb",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_WSLXGL_MB = "pk_wslxgl_mb";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_WSJSDW 文书接收单位
	*/
	@Column(columnName="v_wsjsdw",dataType="varchar",dataLength=20,nullAble="Y",comment="文书接收单位")
	private String V_WSJSDW = "v_wsjsdw";
	/**
	* T_WSJSSJ 文书接收时间
	*/
	@Column(columnName="t_wsjssj",dataType="char",dataLength=19,nullAble="Y",comment="文书接收时间")
	private String T_WSJSSJ = "t_wsjssj";
	/**
	* C_WSJSR 文书接收人
	*/
	@Column(columnName="c_wsjsr",dataType="varchar",dataLength=20,nullAble="Y",comment="文书接收人")
	private String C_WSJSR = "c_wsjsr";
	/**
	* V_WSMC 文书名称
	*/
	@Column(columnName="v_wsmc",dataType="varchar",dataLength=50,nullAble="Y",comment="文书名称")
	private String V_WSMC = "v_wsmc";
	/**
	* V_WSZJ 文书主键
	*/
	@Column(columnName="v_wszj",dataType="varchar",dataLength=50,nullAble="Y",comment="文书主键")
	private String V_WSZJ = "v_wszj";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=50,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
	/**
	* B_SFYJS 是否已接受
	*/
	@Column(columnName="b_sfyjs",dataType="char",dataLength=1,nullAble="Y",comment="是否已接受")
	private String B_SFYJS = "b_sfyjs";
	/**
	* getPk_wssd_h(void) 
	*/
	public String getPk_wssd_h(){
		return this.PK_WSSD_H;
	}
	/**
	*setPk_wssd_h(java.lang.String)
	*/
	public void setPk_wssd_h(String pk_wssd_h){
		this.PK_WSSD_H=pk_wssd_h;
	}
	/**
	* getPk_wslxgl_mb(void) 
	*/
	public String getPk_wslxgl_mb(){
		return this.PK_WSLXGL_MB;
	}
	/**
	*setPk_wslxgl_mb(java.lang.String)
	*/
	public void setPk_wslxgl_mb(String pk_wslxgl_mb){
		this.PK_WSLXGL_MB=pk_wslxgl_mb;
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
	* getV_wsjsdw(void) 
	*/
	public String getV_wsjsdw(){
		return this.V_WSJSDW;
	}
	/**
	*setV_wsjsdw(java.lang.String)
	*/
	public void setV_wsjsdw(String v_wsjsdw){
		this.V_WSJSDW=v_wsjsdw;
	}
	/**
	* getT_wsjssj(void) 
	*/
	public String getT_wsjssj(){
		return this.T_WSJSSJ;
	}
	/**
	*setT_wsjssj(java.lang.String)
	*/
	public void setT_wsjssj(String t_wsjssj){
		this.T_WSJSSJ=t_wsjssj;
	}
	/**
	* getC_wsjsr(void) 
	*/
	public String getC_wsjsr(){
		return this.C_WSJSR;
	}
	/**
	*setC_wsjsr(java.lang.String)
	*/
	public void setC_wsjsr(String c_wsjsr){
		this.C_WSJSR=c_wsjsr;
	}
	/**
	* getV_wsmc(void) 
	*/
	public String getV_wsmc(){
		return this.V_WSMC;
	}
	/**
	*setV_wsmc(java.lang.String)
	*/
	public void setV_wsmc(String v_wsmc){
		this.V_WSMC=v_wsmc;
	}
	/**
	* getV_wszj(void) 
	*/
	public String getV_wszj(){
		return this.V_WSZJ;
	}
	/**
	*setV_wszj(java.lang.String)
	*/
	public void setV_wszj(String v_wszj){
		this.V_WSZJ=v_wszj;
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
	* getB_sfyjs(void) 
	*/
	public String getB_sfyjs(){
		return this.B_SFYJS;
	}
	/**
	*setB_sfyjs(java.lang.String)
	*/
	public void setB_sfyjs(String b_sfyjs){
		this.B_SFYJS=b_sfyjs;
	}


}