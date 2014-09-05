package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasWslxglMbVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_wslxgl_mb")
public class CrpasWslxglMbVO {
	/**
	* PK_WSLXGL_MB 子表主键
	*/
	@Column(columnName="pk_wslxgl_mb",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_WSLXGL_MB = "pk_wslxgl_mb";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="Y",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_MBMC 模板名称
	*/
	@Column(columnName="v_mbmc",dataType="varchar",dataLength=50,nullAble="Y",comment="模板名称")
	private String V_MBMC = "v_mbmc";
	/**
	* V_MBBM 模板编码
	*/
	@Column(columnName="v_mbbm",dataType="varchar",dataLength=50,nullAble="Y",comment="模板编码")
	private String V_MBBM = "v_mbbm";
	/**
	* V_MBWJ 模板文件
	*/
	@Column(columnName="v_mbwj",dataType="varchar",dataLength=50,nullAble="Y",comment="模板文件")
	private String V_MBWJ = "v_mbwj";
	/**
	* V_BZ 备注
	*/
	@Column(columnName="v_bz",dataType="varchar",dataLength=2000,nullAble="Y",comment="备注")
	private String V_BZ = "v_bz";
	/**
	* PK_WSLXGL_H 文书类型管理_主键
	*/
	@Column(columnName="pk_wslxgl_h",dataType="char",dataLength=20,nullAble="N",comment="文书类型管理_主键")
	private String PK_WSLXGL_H = "pk_wslxgl_h";
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
	* getV_mbmc(void) 
	*/
	public String getV_mbmc(){
		return this.V_MBMC;
	}
	/**
	*setV_mbmc(java.lang.String)
	*/
	public void setV_mbmc(String v_mbmc){
		this.V_MBMC=v_mbmc;
	}
	/**
	* getV_mbbm(void) 
	*/
	public String getV_mbbm(){
		return this.V_MBBM;
	}
	/**
	*setV_mbbm(java.lang.String)
	*/
	public void setV_mbbm(String v_mbbm){
		this.V_MBBM=v_mbbm;
	}
	/**
	* getV_mbwj(void) 
	*/
	public String getV_mbwj(){
		return this.V_MBWJ;
	}
	/**
	*setV_mbwj(java.lang.String)
	*/
	public void setV_mbwj(String v_mbwj){
		this.V_MBWJ=v_mbwj;
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
	* getPk_wslxgl_h(void) 
	*/
	public String getPk_wslxgl_h(){
		return this.PK_WSLXGL_H;
	}
	/**
	*setPk_wslxgl_h(java.lang.String)
	*/
	public void setPk_wslxgl_h(String pk_wslxgl_h){
		this.PK_WSLXGL_H=pk_wslxgl_h;
	}


}