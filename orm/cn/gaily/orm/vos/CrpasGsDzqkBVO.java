package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: CrpasGsDzqkBVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="crpas_gs_dzqk_b")
public class CrpasGsDzqkBVO {
	/**
	* PK_GS_DZQK_B 子表主键
	*/
	@Column(columnName="pk_gs_dzqk_b",dataType="char",dataLength=20,nullAble="N",comment="子表主键")
	private String PK_GS_DZQK_B = "pk_gs_dzqk_b";
	/**
	* VROWNO 行号
	*/
	@Column(columnName="vrowno",dataType="varchar",dataLength=50,nullAble="N",comment="行号")
	private String VROWNO = "vrowno";
	/**
	* C_BGR 被告人id
	*/
	@Column(columnName="c_bgr",dataType="char",dataLength=20,nullAble="Y",comment="被告人id")
	private String C_BGR = "c_bgr";
	/**
	* V_BGRXM 被告人姓名
	*/
	@Column(columnName="v_bgrxm",dataType="varchar",dataLength=200,nullAble="Y",comment="被告人姓名")
	private String V_BGRXM = "v_bgrxm";
	/**
	* C_LXLX 量刑类型
	*/
	@Column(columnName="c_lxlx",dataType="varchar",dataLength=20,nullAble="Y",comment="量刑类型")
	private String C_LXLX = "c_lxlx";
	/**
	* V_LXLXMC 量刑类型名称
	*/
	@Column(columnName="v_lxlxmc",dataType="varchar",dataLength=200,nullAble="Y",comment="量刑类型名称")
	private String V_LXLXMC = "v_lxlxmc";
	/**
	* C_ZKZM 指控罪名
	*/
	@Column(columnName="c_zkzm",dataType="varchar",dataLength=20,nullAble="Y",comment="指控罪名")
	private String C_ZKZM = "c_zkzm";
	/**
	* V_ZKZMMC 指控罪名名称
	*/
	@Column(columnName="v_zkzmmc",dataType="varchar",dataLength=200,nullAble="Y",comment="指控罪名名称")
	private String V_ZKZMMC = "v_zkzmmc";
	/**
	* C_FZDW 犯罪地位
	*/
	@Column(columnName="c_fzdw",dataType="varchar",dataLength=20,nullAble="Y",comment="犯罪地位")
	private String C_FZDW = "c_fzdw";
	/**
	* V_FZDWMC 犯罪地位名称
	*/
	@Column(columnName="v_fzdwmc",dataType="varchar",dataLength=200,nullAble="Y",comment="犯罪地位名称")
	private String V_FZDWMC = "v_fzdwmc";
	/**
	* C_PJQK 判处情况
	*/
	@Column(columnName="c_pjqk",dataType="varchar",dataLength=20,nullAble="Y",comment="判处情况")
	private String C_PJQK = "c_pjqk";
	/**
	* V_PJQKMC 判处情况名称
	*/
	@Column(columnName="v_pjqkmc",dataType="varchar",dataLength=200,nullAble="Y",comment="判处情况名称")
	private String V_PJQKMC = "v_pjqkmc";
	/**
	* V_XGWZYY 宣告无罪原因
	*/
	@Column(columnName="v_xgwzyy",dataType="varchar",dataLength=20,nullAble="Y",comment="宣告无罪原因")
	private String V_XGWZYY = "v_xgwzyy";
	/**
	* V_BFXSZRYY 不负刑事责任原因
	*/
	@Column(columnName="v_bfxszryy",dataType="varchar",dataLength=20,nullAble="Y",comment="不负刑事责任原因")
	private String V_BFXSZRYY = "v_bfxszryy";
	/**
	* C_DZZM 定罪罪名
	*/
	@Column(columnName="c_dzzm",dataType="varchar",dataLength=20,nullAble="Y",comment="定罪罪名")
	private String C_DZZM = "c_dzzm";
	/**
	* V_DZZMMC 定罪罪名名称
	*/
	@Column(columnName="v_dzzmmc",dataType="varchar",dataLength=200,nullAble="Y",comment="定罪罪名名称")
	private String V_DZZMMC = "v_dzzmmc";
	/**
	* C_ZXZL 主刑种类
	*/
	@Column(columnName="c_zxzl",dataType="varchar",dataLength=20,nullAble="Y",comment="主刑种类")
	private String C_ZXZL = "c_zxzl";
	/**
	* V_ZXZLMC 主刑种类名称
	*/
	@Column(columnName="v_zxzlmc",dataType="varchar",dataLength=200,nullAble="Y",comment="主刑种类名称")
	private String V_ZXZLMC = "v_zxzlmc";
	/**
	* N_ZYXQN 自由刑刑期年
	*/
	@Column(columnName="n_zyxqn",dataType="int",dataLength=0,nullAble="Y",comment="自由刑刑期年")
	private String N_ZYXQN = "n_zyxqn";
	/**
	* N_ZYXQY 自由刑期月
	*/
	@Column(columnName="n_zyxqy",dataType="int",dataLength=0,nullAble="Y",comment="自由刑期月")
	private String N_ZYXQY = "n_zyxqy";
	/**
	* C_HXZL 缓刑种类
	*/
	@Column(columnName="c_hxzl",dataType="varchar",dataLength=20,nullAble="Y",comment="缓刑种类")
	private String C_HXZL = "c_hxzl";
	/**
	* V_HXZLMC 缓刑种类名称
	*/
	@Column(columnName="v_hxzlmc",dataType="varchar",dataLength=200,nullAble="Y",comment="缓刑种类名称")
	private String V_HXZLMC = "v_hxzlmc";
	/**
	* N_HXXQN 缓刑刑期年
	*/
	@Column(columnName="n_hxxqn",dataType="int",dataLength=0,nullAble="Y",comment="缓刑刑期年")
	private String N_HXXQN = "n_hxxqn";
	/**
	* N_HXXQY 缓刑刑期月
	*/
	@Column(columnName="n_hxxqy",dataType="int",dataLength=0,nullAble="Y",comment="缓刑刑期月")
	private String N_HXXQY = "n_hxxqy";
	/**
	* V_DCFJX 单处附加刑
	*/
	@Column(columnName="v_dcfjx",dataType="varchar",dataLength=20,nullAble="Y",comment="单处附加刑")
	private String V_DCFJX = "v_dcfjx";
	/**
	* V_BCFJX 并处附加刑
	*/
	@Column(columnName="v_bcfjx",dataType="varchar",dataLength=20,nullAble="Y",comment="并处附加刑")
	private String V_BCFJX = "v_bcfjx";
	/**
	* B_SFBTZZQLZS 是否剥夺政治权利终身
	*/
	@Column(columnName="b_sfbtzzqlzs",dataType="char",dataLength=1,nullAble="Y",comment="是否剥夺政治权利终身")
	private String B_SFBTZZQLZS = "b_sfbtzzqlzs";
	/**
	* N_BTZZQLN 剥夺政治权利年
	*/
	@Column(columnName="n_btzzqln",dataType="int",dataLength=0,nullAble="Y",comment="剥夺政治权利年")
	private String N_BTZZQLN = "n_btzzqln";
	/**
	* N_BTZZQLY 剥夺政治权利月
	*/
	@Column(columnName="n_btzzqly",dataType="int",dataLength=0,nullAble="Y",comment="剥夺政治权利月")
	private String N_BTZZQLY = "n_btzzqly";
	/**
	* N_FZSE 罚金数额
	*/
	@Column(columnName="n_fzse",dataType="decimal",dataLength=20,nullAble="Y",comment="罚金数额")
	private String N_FZSE = "n_fzse";
	/**
	* N_MSGRCCJE 没收个人财产金额
	*/
	@Column(columnName="n_msgrccje",dataType="decimal",dataLength=20,nullAble="Y",comment="没收个人财产金额")
	private String N_MSGRCCJE = "n_msgrccje";
	/**
	* V_FDXYXCX 法定刑以下处刑
	*/
	@Column(columnName="v_fdxyxcx",dataType="char",dataLength=1,nullAble="Y",comment="法定刑以下处刑")
	private String V_FDXYXCX = "v_fdxyxcx";
	/**
	* V_HXSPLXJG 后续审判量刑结果
	*/
	@Column(columnName="v_hxsplxjg",dataType="varchar",dataLength=20,nullAble="Y",comment="后续审判量刑结果")
	private String V_HXSPLXJG = "v_hxsplxjg";
	/**
	* D_LXSXRQ 量刑生效日期
	*/
	@Column(columnName="d_lxsxrq",dataType="char",dataLength=19,nullAble="Y",comment="量刑生效日期")
	private String D_LXSXRQ = "d_lxsxrq";
	/**
	* C_GAJ_XYR 嫌疑人id
	*/
	@Column(columnName="c_gaj_xyr",dataType="varchar",dataLength=20,nullAble="Y",comment="嫌疑人id")
	private String C_GAJ_XYR = "c_gaj_xyr";
	/**
	* ATTRNAME 被告人编号
	*/
	@Column(columnName="attrname",dataType="varchar",dataLength=50,nullAble="Y",comment="被告人编号")
	private String ATTRNAME = "attrname";
	/**
	* PK_GS_H 公诉信息主表_主键
	*/
	@Column(columnName="pk_gs_h",dataType="char",dataLength=20,nullAble="N",comment="公诉信息主表_主键")
	private String PK_GS_H = "pk_gs_h";
	/**
	* getPk_gs_dzqk_b(void) 
	*/
	public String getPk_gs_dzqk_b(){
		return this.PK_GS_DZQK_B;
	}
	/**
	*setPk_gs_dzqk_b(java.lang.String)
	*/
	public void setPk_gs_dzqk_b(String pk_gs_dzqk_b){
		this.PK_GS_DZQK_B=pk_gs_dzqk_b;
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
	* getC_bgr(void) 
	*/
	public String getC_bgr(){
		return this.C_BGR;
	}
	/**
	*setC_bgr(java.lang.String)
	*/
	public void setC_bgr(String c_bgr){
		this.C_BGR=c_bgr;
	}
	/**
	* getV_bgrxm(void) 
	*/
	public String getV_bgrxm(){
		return this.V_BGRXM;
	}
	/**
	*setV_bgrxm(java.lang.String)
	*/
	public void setV_bgrxm(String v_bgrxm){
		this.V_BGRXM=v_bgrxm;
	}
	/**
	* getC_lxlx(void) 
	*/
	public String getC_lxlx(){
		return this.C_LXLX;
	}
	/**
	*setC_lxlx(java.lang.String)
	*/
	public void setC_lxlx(String c_lxlx){
		this.C_LXLX=c_lxlx;
	}
	/**
	* getV_lxlxmc(void) 
	*/
	public String getV_lxlxmc(){
		return this.V_LXLXMC;
	}
	/**
	*setV_lxlxmc(java.lang.String)
	*/
	public void setV_lxlxmc(String v_lxlxmc){
		this.V_LXLXMC=v_lxlxmc;
	}
	/**
	* getC_zkzm(void) 
	*/
	public String getC_zkzm(){
		return this.C_ZKZM;
	}
	/**
	*setC_zkzm(java.lang.String)
	*/
	public void setC_zkzm(String c_zkzm){
		this.C_ZKZM=c_zkzm;
	}
	/**
	* getV_zkzmmc(void) 
	*/
	public String getV_zkzmmc(){
		return this.V_ZKZMMC;
	}
	/**
	*setV_zkzmmc(java.lang.String)
	*/
	public void setV_zkzmmc(String v_zkzmmc){
		this.V_ZKZMMC=v_zkzmmc;
	}
	/**
	* getC_fzdw(void) 
	*/
	public String getC_fzdw(){
		return this.C_FZDW;
	}
	/**
	*setC_fzdw(java.lang.String)
	*/
	public void setC_fzdw(String c_fzdw){
		this.C_FZDW=c_fzdw;
	}
	/**
	* getV_fzdwmc(void) 
	*/
	public String getV_fzdwmc(){
		return this.V_FZDWMC;
	}
	/**
	*setV_fzdwmc(java.lang.String)
	*/
	public void setV_fzdwmc(String v_fzdwmc){
		this.V_FZDWMC=v_fzdwmc;
	}
	/**
	* getC_pjqk(void) 
	*/
	public String getC_pjqk(){
		return this.C_PJQK;
	}
	/**
	*setC_pjqk(java.lang.String)
	*/
	public void setC_pjqk(String c_pjqk){
		this.C_PJQK=c_pjqk;
	}
	/**
	* getV_pjqkmc(void) 
	*/
	public String getV_pjqkmc(){
		return this.V_PJQKMC;
	}
	/**
	*setV_pjqkmc(java.lang.String)
	*/
	public void setV_pjqkmc(String v_pjqkmc){
		this.V_PJQKMC=v_pjqkmc;
	}
	/**
	* getV_xgwzyy(void) 
	*/
	public String getV_xgwzyy(){
		return this.V_XGWZYY;
	}
	/**
	*setV_xgwzyy(java.lang.String)
	*/
	public void setV_xgwzyy(String v_xgwzyy){
		this.V_XGWZYY=v_xgwzyy;
	}
	/**
	* getV_bfxszryy(void) 
	*/
	public String getV_bfxszryy(){
		return this.V_BFXSZRYY;
	}
	/**
	*setV_bfxszryy(java.lang.String)
	*/
	public void setV_bfxszryy(String v_bfxszryy){
		this.V_BFXSZRYY=v_bfxszryy;
	}
	/**
	* getC_dzzm(void) 
	*/
	public String getC_dzzm(){
		return this.C_DZZM;
	}
	/**
	*setC_dzzm(java.lang.String)
	*/
	public void setC_dzzm(String c_dzzm){
		this.C_DZZM=c_dzzm;
	}
	/**
	* getV_dzzmmc(void) 
	*/
	public String getV_dzzmmc(){
		return this.V_DZZMMC;
	}
	/**
	*setV_dzzmmc(java.lang.String)
	*/
	public void setV_dzzmmc(String v_dzzmmc){
		this.V_DZZMMC=v_dzzmmc;
	}
	/**
	* getC_zxzl(void) 
	*/
	public String getC_zxzl(){
		return this.C_ZXZL;
	}
	/**
	*setC_zxzl(java.lang.String)
	*/
	public void setC_zxzl(String c_zxzl){
		this.C_ZXZL=c_zxzl;
	}
	/**
	* getV_zxzlmc(void) 
	*/
	public String getV_zxzlmc(){
		return this.V_ZXZLMC;
	}
	/**
	*setV_zxzlmc(java.lang.String)
	*/
	public void setV_zxzlmc(String v_zxzlmc){
		this.V_ZXZLMC=v_zxzlmc;
	}
	/**
	* getN_zyxqn(void) 
	*/
	public String getN_zyxqn(){
		return this.N_ZYXQN;
	}
	/**
	*setN_zyxqn(java.lang.String)
	*/
	public void setN_zyxqn(String n_zyxqn){
		this.N_ZYXQN=n_zyxqn;
	}
	/**
	* getN_zyxqy(void) 
	*/
	public String getN_zyxqy(){
		return this.N_ZYXQY;
	}
	/**
	*setN_zyxqy(java.lang.String)
	*/
	public void setN_zyxqy(String n_zyxqy){
		this.N_ZYXQY=n_zyxqy;
	}
	/**
	* getC_hxzl(void) 
	*/
	public String getC_hxzl(){
		return this.C_HXZL;
	}
	/**
	*setC_hxzl(java.lang.String)
	*/
	public void setC_hxzl(String c_hxzl){
		this.C_HXZL=c_hxzl;
	}
	/**
	* getV_hxzlmc(void) 
	*/
	public String getV_hxzlmc(){
		return this.V_HXZLMC;
	}
	/**
	*setV_hxzlmc(java.lang.String)
	*/
	public void setV_hxzlmc(String v_hxzlmc){
		this.V_HXZLMC=v_hxzlmc;
	}
	/**
	* getN_hxxqn(void) 
	*/
	public String getN_hxxqn(){
		return this.N_HXXQN;
	}
	/**
	*setN_hxxqn(java.lang.String)
	*/
	public void setN_hxxqn(String n_hxxqn){
		this.N_HXXQN=n_hxxqn;
	}
	/**
	* getN_hxxqy(void) 
	*/
	public String getN_hxxqy(){
		return this.N_HXXQY;
	}
	/**
	*setN_hxxqy(java.lang.String)
	*/
	public void setN_hxxqy(String n_hxxqy){
		this.N_HXXQY=n_hxxqy;
	}
	/**
	* getV_dcfjx(void) 
	*/
	public String getV_dcfjx(){
		return this.V_DCFJX;
	}
	/**
	*setV_dcfjx(java.lang.String)
	*/
	public void setV_dcfjx(String v_dcfjx){
		this.V_DCFJX=v_dcfjx;
	}
	/**
	* getV_bcfjx(void) 
	*/
	public String getV_bcfjx(){
		return this.V_BCFJX;
	}
	/**
	*setV_bcfjx(java.lang.String)
	*/
	public void setV_bcfjx(String v_bcfjx){
		this.V_BCFJX=v_bcfjx;
	}
	/**
	* getB_sfbtzzqlzs(void) 
	*/
	public String getB_sfbtzzqlzs(){
		return this.B_SFBTZZQLZS;
	}
	/**
	*setB_sfbtzzqlzs(java.lang.String)
	*/
	public void setB_sfbtzzqlzs(String b_sfbtzzqlzs){
		this.B_SFBTZZQLZS=b_sfbtzzqlzs;
	}
	/**
	* getN_btzzqln(void) 
	*/
	public String getN_btzzqln(){
		return this.N_BTZZQLN;
	}
	/**
	*setN_btzzqln(java.lang.String)
	*/
	public void setN_btzzqln(String n_btzzqln){
		this.N_BTZZQLN=n_btzzqln;
	}
	/**
	* getN_btzzqly(void) 
	*/
	public String getN_btzzqly(){
		return this.N_BTZZQLY;
	}
	/**
	*setN_btzzqly(java.lang.String)
	*/
	public void setN_btzzqly(String n_btzzqly){
		this.N_BTZZQLY=n_btzzqly;
	}
	/**
	* getN_fzse(void) 
	*/
	public String getN_fzse(){
		return this.N_FZSE;
	}
	/**
	*setN_fzse(java.lang.String)
	*/
	public void setN_fzse(String n_fzse){
		this.N_FZSE=n_fzse;
	}
	/**
	* getN_msgrccje(void) 
	*/
	public String getN_msgrccje(){
		return this.N_MSGRCCJE;
	}
	/**
	*setN_msgrccje(java.lang.String)
	*/
	public void setN_msgrccje(String n_msgrccje){
		this.N_MSGRCCJE=n_msgrccje;
	}
	/**
	* getV_fdxyxcx(void) 
	*/
	public String getV_fdxyxcx(){
		return this.V_FDXYXCX;
	}
	/**
	*setV_fdxyxcx(java.lang.String)
	*/
	public void setV_fdxyxcx(String v_fdxyxcx){
		this.V_FDXYXCX=v_fdxyxcx;
	}
	/**
	* getV_hxsplxjg(void) 
	*/
	public String getV_hxsplxjg(){
		return this.V_HXSPLXJG;
	}
	/**
	*setV_hxsplxjg(java.lang.String)
	*/
	public void setV_hxsplxjg(String v_hxsplxjg){
		this.V_HXSPLXJG=v_hxsplxjg;
	}
	/**
	* getD_lxsxrq(void) 
	*/
	public String getD_lxsxrq(){
		return this.D_LXSXRQ;
	}
	/**
	*setD_lxsxrq(java.lang.String)
	*/
	public void setD_lxsxrq(String d_lxsxrq){
		this.D_LXSXRQ=d_lxsxrq;
	}
	/**
	* getC_gaj_xyr(void) 
	*/
	public String getC_gaj_xyr(){
		return this.C_GAJ_XYR;
	}
	/**
	*setC_gaj_xyr(java.lang.String)
	*/
	public void setC_gaj_xyr(String c_gaj_xyr){
		this.C_GAJ_XYR=c_gaj_xyr;
	}
	/**
	* getAttrname(void) 
	*/
	public String getAttrname(){
		return this.ATTRNAME;
	}
	/**
	*setAttrname(java.lang.String)
	*/
	public void setAttrname(String attrname){
		this.ATTRNAME=attrname;
	}
	/**
	* getPk_gs_h(void) 
	*/
	public String getPk_gs_h(){
		return this.PK_GS_H;
	}
	/**
	*setPk_gs_h(java.lang.String)
	*/
	public void setPk_gs_h(String pk_gs_h){
		this.PK_GS_H=pk_gs_h;
	}


}