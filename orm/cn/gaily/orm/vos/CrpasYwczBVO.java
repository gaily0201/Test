package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasYwczBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_ywcz_b")
public class CrpasYwczBVO {
	/**
	* PK_YWCZ_B 子表主键
	*/
	@Column(columnName="pk_ywcz_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_YWCZ_B = "pk_ywcz_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* V_ZFCZBM 政法平台参照值编码
	*/
	@Column(columnName="v_zfczbm",dataType="varchar",dataLength=50,nullAble="Y",comment="政法平台参照值编码")
	private String V_ZFCZBM = "v_zfczbm";
	/**
	* V_ZFCZMC 参照值名称
	*/
	@Column(columnName="v_zfczmc",dataType="varchar",dataLength=200,nullAble="Y",comment="参照值名称")
	private String V_ZFCZMC = "v_zfczmc";
	/**
	* V_GAJCZBM 公安局平台对应编码
	*/
	@Column(columnName="v_gajczbm",dataType="varchar",dataLength=50,nullAble="Y",comment="公安局平台对应编码")
	private String V_GAJCZBM = "v_gajczbm";
	/**
	* V_JCYCZBM 检察院平台对应编码
	*/
	@Column(columnName="v_jcyczbm",dataType="varchar",dataLength=50,nullAble="Y",comment="检察院平台对应编码")
	private String V_JCYCZBM = "v_jcyczbm";
	/**
	* V_FYCZBM 法院平台对应编码
	*/
	@Column(columnName="v_fyczbm",dataType="varchar",dataLength=50,nullAble="Y",comment="法院平台对应编码")
	private String V_FYCZBM = "v_fyczbm";
	/**
	* V_SFJCZBM 司法局平台对应编码
	*/
	@Column(columnName="v_sfjczbm",dataType="varchar",dataLength=50,nullAble="Y",comment="司法局平台对应编码")
	private String V_SFJCZBM = "v_sfjczbm";
	/**
	* V_KSSCZBM 看守所平台对应编码
	*/
	@Column(columnName="v_kssczbm",dataType="varchar",dataLength=50,nullAble="Y",comment="看守所平台对应编码")
	private String V_KSSCZBM = "v_kssczbm";
	/**
	* N_XSSX 显示顺序
	*/
	@Column(columnName="n_xssx",dataType="int",dataLength=0,nullAble="Y",comment="显示顺序")
	private String N_XSSX = "n_xssx";
	/**
	* PK_YWCZ_H 业务参照信息主表_主键
	*/
	@Column(columnName="pk_ywcz_h",dataType="char",dataLength=20,nullAble="N",comment="业务参照信息主表_主键")
	private String PK_YWCZ_H = "pk_ywcz_h";
	/**
	* getPk_ywcz_b(void) 
	*/
	public String getPk_ywcz_b(){
		return this.PK_YWCZ_B;
	}
	/**
	*setPk_ywcz_b(java.lang.String)
	*/
	public void setPk_ywcz_b(String pk_ywcz_b){
		this.PK_YWCZ_B=pk_ywcz_b;
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
	* getV_zfczbm(void) 
	*/
	public String getV_zfczbm(){
		return this.V_ZFCZBM;
	}
	/**
	*setV_zfczbm(java.lang.String)
	*/
	public void setV_zfczbm(String v_zfczbm){
		this.V_ZFCZBM=v_zfczbm;
	}
	/**
	* getV_zfczmc(void) 
	*/
	public String getV_zfczmc(){
		return this.V_ZFCZMC;
	}
	/**
	*setV_zfczmc(java.lang.String)
	*/
	public void setV_zfczmc(String v_zfczmc){
		this.V_ZFCZMC=v_zfczmc;
	}
	/**
	* getV_gajczbm(void) 
	*/
	public String getV_gajczbm(){
		return this.V_GAJCZBM;
	}
	/**
	*setV_gajczbm(java.lang.String)
	*/
	public void setV_gajczbm(String v_gajczbm){
		this.V_GAJCZBM=v_gajczbm;
	}
	/**
	* getV_jcyczbm(void) 
	*/
	public String getV_jcyczbm(){
		return this.V_JCYCZBM;
	}
	/**
	*setV_jcyczbm(java.lang.String)
	*/
	public void setV_jcyczbm(String v_jcyczbm){
		this.V_JCYCZBM=v_jcyczbm;
	}
	/**
	* getV_fyczbm(void) 
	*/
	public String getV_fyczbm(){
		return this.V_FYCZBM;
	}
	/**
	*setV_fyczbm(java.lang.String)
	*/
	public void setV_fyczbm(String v_fyczbm){
		this.V_FYCZBM=v_fyczbm;
	}
	/**
	* getV_sfjczbm(void) 
	*/
	public String getV_sfjczbm(){
		return this.V_SFJCZBM;
	}
	/**
	*setV_sfjczbm(java.lang.String)
	*/
	public void setV_sfjczbm(String v_sfjczbm){
		this.V_SFJCZBM=v_sfjczbm;
	}
	/**
	* getV_kssczbm(void) 
	*/
	public String getV_kssczbm(){
		return this.V_KSSCZBM;
	}
	/**
	*setV_kssczbm(java.lang.String)
	*/
	public void setV_kssczbm(String v_kssczbm){
		this.V_KSSCZBM=v_kssczbm;
	}
	/**
	* getN_xssx(void) 
	*/
	public String getN_xssx(){
		return this.N_XSSX;
	}
	/**
	*setN_xssx(java.lang.String)
	*/
	public void setN_xssx(String n_xssx){
		this.N_XSSX=n_xssx;
	}
	/**
	* getPk_ywcz_h(void) 
	*/
	public String getPk_ywcz_h(){
		return this.PK_YWCZ_H;
	}
	/**
	*setPk_ywcz_h(java.lang.String)
	*/
	public void setPk_ywcz_h(String pk_ywcz_h){
		this.PK_YWCZ_H=pk_ywcz_h;
	}


}