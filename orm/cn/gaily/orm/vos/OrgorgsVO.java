package cn.gaily.orm.vos;
import cn.gaily.orm.annotation.Column;
import cn.gaily.orm.annotation.Table;
import cn.gaily.orm.annotation.PrimaryKey;


/**
 * <p>Title: OrgorgsVO</P>
 * <p>Description: </p>
 * @author xiaoh
 * @version 1.0
 * @since 
 */
@Table(tableName="org_orgs")
public class OrgorgsVO {
	/**
	* ADDRESS 
	*/
	@Column(columnName="address",dataType="VARCHAR2",dataLength=30,nullAble="Y",comment="")
	private String ADDRESS = "address";
	/**
	* CODE 
	*/
	@Column(columnName="code",dataType="VARCHAR2",dataLength=40,nullAble="N",comment="")
	private String CODE = "code";
	/**
	* COUNTRYZONE 
	*/
	@Column(columnName="countryzone",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String COUNTRYZONE = "countryzone";
	/**
	* CREATIONTIME 
	*/
	@Column(columnName="creationtime",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String CREATIONTIME = "creationtime";
	/**
	* CREATOR 
	*/
	@Column(columnName="creator",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String CREATOR = "creator";
	/**
	* DATAORIGINFLAG 
	*/
	@Column(columnName="dataoriginflag",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String DATAORIGINFLAG = "dataoriginflag";
	/**
	* DEF1 
	*/
	@Column(columnName="def1",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF1 = "def1";
	/**
	* DEF10 
	*/
	@Column(columnName="def10",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF10 = "def10";
	/**
	* DEF11 
	*/
	@Column(columnName="def11",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF11 = "def11";
	/**
	* DEF12 
	*/
	@Column(columnName="def12",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF12 = "def12";
	/**
	* DEF13 
	*/
	@Column(columnName="def13",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF13 = "def13";
	/**
	* DEF14 
	*/
	@Column(columnName="def14",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF14 = "def14";
	/**
	* DEF15 
	*/
	@Column(columnName="def15",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF15 = "def15";
	/**
	* DEF16 
	*/
	@Column(columnName="def16",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF16 = "def16";
	/**
	* DEF17 
	*/
	@Column(columnName="def17",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF17 = "def17";
	/**
	* DEF18 
	*/
	@Column(columnName="def18",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF18 = "def18";
	/**
	* DEF19 
	*/
	@Column(columnName="def19",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF19 = "def19";
	/**
	* DEF2 
	*/
	@Column(columnName="def2",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF2 = "def2";
	/**
	* DEF20 
	*/
	@Column(columnName="def20",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF20 = "def20";
	/**
	* DEF3 
	*/
	@Column(columnName="def3",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF3 = "def3";
	/**
	* DEF4 
	*/
	@Column(columnName="def4",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF4 = "def4";
	/**
	* DEF5 
	*/
	@Column(columnName="def5",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF5 = "def5";
	/**
	* DEF6 
	*/
	@Column(columnName="def6",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF6 = "def6";
	/**
	* DEF7 
	*/
	@Column(columnName="def7",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF7 = "def7";
	/**
	* DEF8 
	*/
	@Column(columnName="def8",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF8 = "def8";
	/**
	* DEF9 
	*/
	@Column(columnName="def9",dataType="VARCHAR2",dataLength=101,nullAble="Y",comment="")
	private String DEF9 = "def9";
	/**
	* DR 
	*/
	@Column(columnName="dr",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String DR = "dr";
	/**
	* ENABLESTATE 
	*/
	@Column(columnName="enablestate",dataType="NUMBER",dataLength=22,nullAble="Y",comment="")
	private String ENABLESTATE = "enablestate";
	/**
	* ENTITYTYPE 
	*/
	@Column(columnName="entitytype",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String ENTITYTYPE = "entitytype";
	/**
	* INNERCODE 
	*/
	@Column(columnName="innercode",dataType="VARCHAR2",dataLength=200,nullAble="Y",comment="")
	private String INNERCODE = "innercode";
	/**
	* ISBUSINESSUNIT 
	*/
	@Column(columnName="isbusinessunit",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ISBUSINESSUNIT = "isbusinessunit";
	/**
	* ISLASTVERSION 
	*/
	@Column(columnName="islastversion",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ISLASTVERSION = "islastversion";
	/**
	* ISRETAIL 
	*/
	@Column(columnName="isretail",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ISRETAIL = "isretail";
	/**
	* MEMO 
	*/
	@Column(columnName="memo",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String MEMO = "memo";
	/**
	* MNECODE 
	*/
	@Column(columnName="mnecode",dataType="VARCHAR2",dataLength=75,nullAble="Y",comment="")
	private String MNECODE = "mnecode";
	/**
	* MODIFIEDTIME 
	*/
	@Column(columnName="modifiedtime",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String MODIFIEDTIME = "modifiedtime";
	/**
	* MODIFIER 
	*/
	@Column(columnName="modifier",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String MODIFIER = "modifier";
	/**
	* NAME 
	*/
	@Column(columnName="name",dataType="VARCHAR2",dataLength=300,nullAble="N",comment="")
	private String NAME = "name";
	/**
	* NAME2 
	*/
	@Column(columnName="name2",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String NAME2 = "name2";
	/**
	* NAME3 
	*/
	@Column(columnName="name3",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String NAME3 = "name3";
	/**
	* NAME4 
	*/
	@Column(columnName="name4",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String NAME4 = "name4";
	/**
	* NAME5 
	*/
	@Column(columnName="name5",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String NAME5 = "name5";
	/**
	* NAME6 
	*/
	@Column(columnName="name6",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String NAME6 = "name6";
	/**
	* NCINDUSTRY 
	*/
	@Column(columnName="ncindustry",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String NCINDUSTRY = "ncindustry";
	/**
	* ORGANIZATIONCODE 
	*/
	@Column(columnName="organizationcode",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String ORGANIZATIONCODE = "organizationcode";
	/**
	* ORGTYPE1 
	*/
	@Column(columnName="orgtype1",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE1 = "orgtype1";
	/**
	* ORGTYPE10 
	*/
	@Column(columnName="orgtype10",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE10 = "orgtype10";
	/**
	* ORGTYPE11 
	*/
	@Column(columnName="orgtype11",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE11 = "orgtype11";
	/**
	* ORGTYPE12 
	*/
	@Column(columnName="orgtype12",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE12 = "orgtype12";
	/**
	* ORGTYPE13 
	*/
	@Column(columnName="orgtype13",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE13 = "orgtype13";
	/**
	* ORGTYPE14 
	*/
	@Column(columnName="orgtype14",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE14 = "orgtype14";
	/**
	* ORGTYPE15 
	*/
	@Column(columnName="orgtype15",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE15 = "orgtype15";
	/**
	* ORGTYPE16 
	*/
	@Column(columnName="orgtype16",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE16 = "orgtype16";
	/**
	* ORGTYPE17 
	*/
	@Column(columnName="orgtype17",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE17 = "orgtype17";
	/**
	* ORGTYPE18 
	*/
	@Column(columnName="orgtype18",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE18 = "orgtype18";
	/**
	* ORGTYPE19 
	*/
	@Column(columnName="orgtype19",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE19 = "orgtype19";
	/**
	* ORGTYPE2 
	*/
	@Column(columnName="orgtype2",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE2 = "orgtype2";
	/**
	* ORGTYPE20 
	*/
	@Column(columnName="orgtype20",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE20 = "orgtype20";
	/**
	* ORGTYPE21 
	*/
	@Column(columnName="orgtype21",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE21 = "orgtype21";
	/**
	* ORGTYPE22 
	*/
	@Column(columnName="orgtype22",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE22 = "orgtype22";
	/**
	* ORGTYPE23 
	*/
	@Column(columnName="orgtype23",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE23 = "orgtype23";
	/**
	* ORGTYPE24 
	*/
	@Column(columnName="orgtype24",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE24 = "orgtype24";
	/**
	* ORGTYPE25 
	*/
	@Column(columnName="orgtype25",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE25 = "orgtype25";
	/**
	* ORGTYPE26 
	*/
	@Column(columnName="orgtype26",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE26 = "orgtype26";
	/**
	* ORGTYPE27 
	*/
	@Column(columnName="orgtype27",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE27 = "orgtype27";
	/**
	* ORGTYPE28 
	*/
	@Column(columnName="orgtype28",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE28 = "orgtype28";
	/**
	* ORGTYPE29 
	*/
	@Column(columnName="orgtype29",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE29 = "orgtype29";
	/**
	* ORGTYPE3 
	*/
	@Column(columnName="orgtype3",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE3 = "orgtype3";
	/**
	* ORGTYPE30 
	*/
	@Column(columnName="orgtype30",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE30 = "orgtype30";
	/**
	* ORGTYPE31 
	*/
	@Column(columnName="orgtype31",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE31 = "orgtype31";
	/**
	* ORGTYPE32 
	*/
	@Column(columnName="orgtype32",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE32 = "orgtype32";
	/**
	* ORGTYPE33 
	*/
	@Column(columnName="orgtype33",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE33 = "orgtype33";
	/**
	* ORGTYPE34 
	*/
	@Column(columnName="orgtype34",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE34 = "orgtype34";
	/**
	* ORGTYPE35 
	*/
	@Column(columnName="orgtype35",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE35 = "orgtype35";
	/**
	* ORGTYPE36 
	*/
	@Column(columnName="orgtype36",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE36 = "orgtype36";
	/**
	* ORGTYPE37 
	*/
	@Column(columnName="orgtype37",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE37 = "orgtype37";
	/**
	* ORGTYPE38 
	*/
	@Column(columnName="orgtype38",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE38 = "orgtype38";
	/**
	* ORGTYPE39 
	*/
	@Column(columnName="orgtype39",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE39 = "orgtype39";
	/**
	* ORGTYPE4 
	*/
	@Column(columnName="orgtype4",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE4 = "orgtype4";
	/**
	* ORGTYPE40 
	*/
	@Column(columnName="orgtype40",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE40 = "orgtype40";
	/**
	* ORGTYPE5 
	*/
	@Column(columnName="orgtype5",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE5 = "orgtype5";
	/**
	* ORGTYPE6 
	*/
	@Column(columnName="orgtype6",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE6 = "orgtype6";
	/**
	* ORGTYPE7 
	*/
	@Column(columnName="orgtype7",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE7 = "orgtype7";
	/**
	* ORGTYPE8 
	*/
	@Column(columnName="orgtype8",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE8 = "orgtype8";
	/**
	* ORGTYPE9 
	*/
	@Column(columnName="orgtype9",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String ORGTYPE9 = "orgtype9";
	/**
	* PK_ACCPERIODSCHEME 
	*/
	@Column(columnName="pk_accperiodscheme",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_ACCPERIODSCHEME = "pk_accperiodscheme";
	/**
	* PK_CONTROLAREA 
	*/
	@Column(columnName="pk_controlarea",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_CONTROLAREA = "pk_controlarea";
	/**
	* PK_CORP 
	*/
	@Column(columnName="pk_corp",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_CORP = "pk_corp";
	/**
	* PK_CURRTYPE 
	*/
	@Column(columnName="pk_currtype",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_CURRTYPE = "pk_currtype";
	/**
	* PK_EXRATESCHEME 
	*/
	@Column(columnName="pk_exratescheme",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_EXRATESCHEME = "pk_exratescheme";
	/**
	* PK_FATHERORG 
	*/
	@Column(columnName="pk_fatherorg",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_FATHERORG = "pk_fatherorg";
	/**
	* PK_FORMAT 
	*/
	@Column(columnName="pk_format",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_FORMAT = "pk_format";
	/**
	* PK_GROUP 
	*/
	@Column(columnName="pk_group",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_GROUP = "pk_group";
	/**
	* PK_ORG 
	*/
	@Column(columnName="pk_org",dataType="CHAR",dataLength=20,nullAble="N",comment="")
	private String PK_ORG = "pk_org";
	/**
	* PK_TIMEZONE 
	*/
	@Column(columnName="pk_timezone",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PK_TIMEZONE = "pk_timezone";
	/**
	* PK_VID 
	*/
	@Column(columnName="pk_vid",dataType="CHAR",dataLength=20,nullAble="N",comment="")
	private String PK_VID = "pk_vid";
	/**
	* PRINCIPAL 
	*/
	@Column(columnName="principal",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String PRINCIPAL = "principal";
	/**
	* REPORTCONFIRM 
	*/
	@Column(columnName="reportconfirm",dataType="CHAR",dataLength=1,nullAble="Y",comment="")
	private String REPORTCONFIRM = "reportconfirm";
	/**
	* SHORTNAME 
	*/
	@Column(columnName="shortname",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String SHORTNAME = "shortname";
	/**
	* SHORTNAME2 
	*/
	@Column(columnName="shortname2",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String SHORTNAME2 = "shortname2";
	/**
	* SHORTNAME3 
	*/
	@Column(columnName="shortname3",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String SHORTNAME3 = "shortname3";
	/**
	* SHORTNAME4 
	*/
	@Column(columnName="shortname4",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String SHORTNAME4 = "shortname4";
	/**
	* SHORTNAME5 
	*/
	@Column(columnName="shortname5",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String SHORTNAME5 = "shortname5";
	/**
	* SHORTNAME6 
	*/
	@Column(columnName="shortname6",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String SHORTNAME6 = "shortname6";
	/**
	* TEL 
	*/
	@Column(columnName="tel",dataType="VARCHAR2",dataLength=100,nullAble="Y",comment="")
	private String TEL = "tel";
	/**
	* TS 
	*/
	@Column(columnName="ts",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String TS = "ts";
	/**
	* VENDDATE 
	*/
	@Column(columnName="venddate",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String VENDDATE = "venddate";
	/**
	* VNAME 
	*/
	@Column(columnName="vname",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String VNAME = "vname";
	/**
	* VNAME2 
	*/
	@Column(columnName="vname2",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String VNAME2 = "vname2";
	/**
	* VNAME3 
	*/
	@Column(columnName="vname3",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String VNAME3 = "vname3";
	/**
	* VNAME4 
	*/
	@Column(columnName="vname4",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String VNAME4 = "vname4";
	/**
	* VNAME5 
	*/
	@Column(columnName="vname5",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String VNAME5 = "vname5";
	/**
	* VNAME6 
	*/
	@Column(columnName="vname6",dataType="VARCHAR2",dataLength=300,nullAble="Y",comment="")
	private String VNAME6 = "vname6";
	/**
	* VNO 
	*/
	@Column(columnName="vno",dataType="VARCHAR2",dataLength=50,nullAble="Y",comment="")
	private String VNO = "vno";
	/**
	* VSTARTDATE 
	*/
	@Column(columnName="vstartdate",dataType="CHAR",dataLength=19,nullAble="Y",comment="")
	private String VSTARTDATE = "vstartdate";
	/**
	* WORKCALENDAR 
	*/
	@Column(columnName="workcalendar",dataType="VARCHAR2",dataLength=20,nullAble="Y",comment="")
	private String WORKCALENDAR = "workcalendar";
	/**
	* getAddress(void) 
	*/
	public String getAddress(){
		return this.ADDRESS;
	}
	/**
	*setAddress(java.lang.String)
	*/
	public void setAddress(String address){
		this.ADDRESS=address;
	}
	/**
	* getCode(void) 
	*/
	public String getCode(){
		return this.CODE;
	}
	/**
	*setCode(java.lang.String)
	*/
	public void setCode(String code){
		this.CODE=code;
	}
	/**
	* getCountryzone(void) 
	*/
	public String getCountryzone(){
		return this.COUNTRYZONE;
	}
	/**
	*setCountryzone(java.lang.String)
	*/
	public void setCountryzone(String countryzone){
		this.COUNTRYZONE=countryzone;
	}
	/**
	* getCreationtime(void) 
	*/
	public String getCreationtime(){
		return this.CREATIONTIME;
	}
	/**
	*setCreationtime(java.lang.String)
	*/
	public void setCreationtime(String creationtime){
		this.CREATIONTIME=creationtime;
	}
	/**
	* getCreator(void) 
	*/
	public String getCreator(){
		return this.CREATOR;
	}
	/**
	*setCreator(java.lang.String)
	*/
	public void setCreator(String creator){
		this.CREATOR=creator;
	}
	/**
	* getDataoriginflag(void) 
	*/
	public String getDataoriginflag(){
		return this.DATAORIGINFLAG;
	}
	/**
	*setDataoriginflag(java.lang.String)
	*/
	public void setDataoriginflag(String dataoriginflag){
		this.DATAORIGINFLAG=dataoriginflag;
	}
	/**
	* getDef1(void) 
	*/
	public String getDef1(){
		return this.DEF1;
	}
	/**
	*setDef1(java.lang.String)
	*/
	public void setDef1(String def1){
		this.DEF1=def1;
	}
	/**
	* getDef10(void) 
	*/
	public String getDef10(){
		return this.DEF10;
	}
	/**
	*setDef10(java.lang.String)
	*/
	public void setDef10(String def10){
		this.DEF10=def10;
	}
	/**
	* getDef11(void) 
	*/
	public String getDef11(){
		return this.DEF11;
	}
	/**
	*setDef11(java.lang.String)
	*/
	public void setDef11(String def11){
		this.DEF11=def11;
	}
	/**
	* getDef12(void) 
	*/
	public String getDef12(){
		return this.DEF12;
	}
	/**
	*setDef12(java.lang.String)
	*/
	public void setDef12(String def12){
		this.DEF12=def12;
	}
	/**
	* getDef13(void) 
	*/
	public String getDef13(){
		return this.DEF13;
	}
	/**
	*setDef13(java.lang.String)
	*/
	public void setDef13(String def13){
		this.DEF13=def13;
	}
	/**
	* getDef14(void) 
	*/
	public String getDef14(){
		return this.DEF14;
	}
	/**
	*setDef14(java.lang.String)
	*/
	public void setDef14(String def14){
		this.DEF14=def14;
	}
	/**
	* getDef15(void) 
	*/
	public String getDef15(){
		return this.DEF15;
	}
	/**
	*setDef15(java.lang.String)
	*/
	public void setDef15(String def15){
		this.DEF15=def15;
	}
	/**
	* getDef16(void) 
	*/
	public String getDef16(){
		return this.DEF16;
	}
	/**
	*setDef16(java.lang.String)
	*/
	public void setDef16(String def16){
		this.DEF16=def16;
	}
	/**
	* getDef17(void) 
	*/
	public String getDef17(){
		return this.DEF17;
	}
	/**
	*setDef17(java.lang.String)
	*/
	public void setDef17(String def17){
		this.DEF17=def17;
	}
	/**
	* getDef18(void) 
	*/
	public String getDef18(){
		return this.DEF18;
	}
	/**
	*setDef18(java.lang.String)
	*/
	public void setDef18(String def18){
		this.DEF18=def18;
	}
	/**
	* getDef19(void) 
	*/
	public String getDef19(){
		return this.DEF19;
	}
	/**
	*setDef19(java.lang.String)
	*/
	public void setDef19(String def19){
		this.DEF19=def19;
	}
	/**
	* getDef2(void) 
	*/
	public String getDef2(){
		return this.DEF2;
	}
	/**
	*setDef2(java.lang.String)
	*/
	public void setDef2(String def2){
		this.DEF2=def2;
	}
	/**
	* getDef20(void) 
	*/
	public String getDef20(){
		return this.DEF20;
	}
	/**
	*setDef20(java.lang.String)
	*/
	public void setDef20(String def20){
		this.DEF20=def20;
	}
	/**
	* getDef3(void) 
	*/
	public String getDef3(){
		return this.DEF3;
	}
	/**
	*setDef3(java.lang.String)
	*/
	public void setDef3(String def3){
		this.DEF3=def3;
	}
	/**
	* getDef4(void) 
	*/
	public String getDef4(){
		return this.DEF4;
	}
	/**
	*setDef4(java.lang.String)
	*/
	public void setDef4(String def4){
		this.DEF4=def4;
	}
	/**
	* getDef5(void) 
	*/
	public String getDef5(){
		return this.DEF5;
	}
	/**
	*setDef5(java.lang.String)
	*/
	public void setDef5(String def5){
		this.DEF5=def5;
	}
	/**
	* getDef6(void) 
	*/
	public String getDef6(){
		return this.DEF6;
	}
	/**
	*setDef6(java.lang.String)
	*/
	public void setDef6(String def6){
		this.DEF6=def6;
	}
	/**
	* getDef7(void) 
	*/
	public String getDef7(){
		return this.DEF7;
	}
	/**
	*setDef7(java.lang.String)
	*/
	public void setDef7(String def7){
		this.DEF7=def7;
	}
	/**
	* getDef8(void) 
	*/
	public String getDef8(){
		return this.DEF8;
	}
	/**
	*setDef8(java.lang.String)
	*/
	public void setDef8(String def8){
		this.DEF8=def8;
	}
	/**
	* getDef9(void) 
	*/
	public String getDef9(){
		return this.DEF9;
	}
	/**
	*setDef9(java.lang.String)
	*/
	public void setDef9(String def9){
		this.DEF9=def9;
	}
	/**
	* getDr(void) 
	*/
	public String getDr(){
		return this.DR;
	}
	/**
	*setDr(java.lang.String)
	*/
	public void setDr(String dr){
		this.DR=dr;
	}
	/**
	* getEnablestate(void) 
	*/
	public String getEnablestate(){
		return this.ENABLESTATE;
	}
	/**
	*setEnablestate(java.lang.String)
	*/
	public void setEnablestate(String enablestate){
		this.ENABLESTATE=enablestate;
	}
	/**
	* getEntitytype(void) 
	*/
	public String getEntitytype(){
		return this.ENTITYTYPE;
	}
	/**
	*setEntitytype(java.lang.String)
	*/
	public void setEntitytype(String entitytype){
		this.ENTITYTYPE=entitytype;
	}
	/**
	* getInnercode(void) 
	*/
	public String getInnercode(){
		return this.INNERCODE;
	}
	/**
	*setInnercode(java.lang.String)
	*/
	public void setInnercode(String innercode){
		this.INNERCODE=innercode;
	}
	/**
	* getIsbusinessunit(void) 
	*/
	public String getIsbusinessunit(){
		return this.ISBUSINESSUNIT;
	}
	/**
	*setIsbusinessunit(java.lang.String)
	*/
	public void setIsbusinessunit(String isbusinessunit){
		this.ISBUSINESSUNIT=isbusinessunit;
	}
	/**
	* getIslastversion(void) 
	*/
	public String getIslastversion(){
		return this.ISLASTVERSION;
	}
	/**
	*setIslastversion(java.lang.String)
	*/
	public void setIslastversion(String islastversion){
		this.ISLASTVERSION=islastversion;
	}
	/**
	* getIsretail(void) 
	*/
	public String getIsretail(){
		return this.ISRETAIL;
	}
	/**
	*setIsretail(java.lang.String)
	*/
	public void setIsretail(String isretail){
		this.ISRETAIL=isretail;
	}
	/**
	* getMemo(void) 
	*/
	public String getMemo(){
		return this.MEMO;
	}
	/**
	*setMemo(java.lang.String)
	*/
	public void setMemo(String memo){
		this.MEMO=memo;
	}
	/**
	* getMnecode(void) 
	*/
	public String getMnecode(){
		return this.MNECODE;
	}
	/**
	*setMnecode(java.lang.String)
	*/
	public void setMnecode(String mnecode){
		this.MNECODE=mnecode;
	}
	/**
	* getModifiedtime(void) 
	*/
	public String getModifiedtime(){
		return this.MODIFIEDTIME;
	}
	/**
	*setModifiedtime(java.lang.String)
	*/
	public void setModifiedtime(String modifiedtime){
		this.MODIFIEDTIME=modifiedtime;
	}
	/**
	* getModifier(void) 
	*/
	public String getModifier(){
		return this.MODIFIER;
	}
	/**
	*setModifier(java.lang.String)
	*/
	public void setModifier(String modifier){
		this.MODIFIER=modifier;
	}
	/**
	* getName(void) 
	*/
	public String getName(){
		return this.NAME;
	}
	/**
	*setName(java.lang.String)
	*/
	public void setName(String name){
		this.NAME=name;
	}
	/**
	* getName2(void) 
	*/
	public String getName2(){
		return this.NAME2;
	}
	/**
	*setName2(java.lang.String)
	*/
	public void setName2(String name2){
		this.NAME2=name2;
	}
	/**
	* getName3(void) 
	*/
	public String getName3(){
		return this.NAME3;
	}
	/**
	*setName3(java.lang.String)
	*/
	public void setName3(String name3){
		this.NAME3=name3;
	}
	/**
	* getName4(void) 
	*/
	public String getName4(){
		return this.NAME4;
	}
	/**
	*setName4(java.lang.String)
	*/
	public void setName4(String name4){
		this.NAME4=name4;
	}
	/**
	* getName5(void) 
	*/
	public String getName5(){
		return this.NAME5;
	}
	/**
	*setName5(java.lang.String)
	*/
	public void setName5(String name5){
		this.NAME5=name5;
	}
	/**
	* getName6(void) 
	*/
	public String getName6(){
		return this.NAME6;
	}
	/**
	*setName6(java.lang.String)
	*/
	public void setName6(String name6){
		this.NAME6=name6;
	}
	/**
	* getNcindustry(void) 
	*/
	public String getNcindustry(){
		return this.NCINDUSTRY;
	}
	/**
	*setNcindustry(java.lang.String)
	*/
	public void setNcindustry(String ncindustry){
		this.NCINDUSTRY=ncindustry;
	}
	/**
	* getOrganizationcode(void) 
	*/
	public String getOrganizationcode(){
		return this.ORGANIZATIONCODE;
	}
	/**
	*setOrganizationcode(java.lang.String)
	*/
	public void setOrganizationcode(String organizationcode){
		this.ORGANIZATIONCODE=organizationcode;
	}
	/**
	* getOrgtype1(void) 
	*/
	public String getOrgtype1(){
		return this.ORGTYPE1;
	}
	/**
	*setOrgtype1(java.lang.String)
	*/
	public void setOrgtype1(String orgtype1){
		this.ORGTYPE1=orgtype1;
	}
	/**
	* getOrgtype10(void) 
	*/
	public String getOrgtype10(){
		return this.ORGTYPE10;
	}
	/**
	*setOrgtype10(java.lang.String)
	*/
	public void setOrgtype10(String orgtype10){
		this.ORGTYPE10=orgtype10;
	}
	/**
	* getOrgtype11(void) 
	*/
	public String getOrgtype11(){
		return this.ORGTYPE11;
	}
	/**
	*setOrgtype11(java.lang.String)
	*/
	public void setOrgtype11(String orgtype11){
		this.ORGTYPE11=orgtype11;
	}
	/**
	* getOrgtype12(void) 
	*/
	public String getOrgtype12(){
		return this.ORGTYPE12;
	}
	/**
	*setOrgtype12(java.lang.String)
	*/
	public void setOrgtype12(String orgtype12){
		this.ORGTYPE12=orgtype12;
	}
	/**
	* getOrgtype13(void) 
	*/
	public String getOrgtype13(){
		return this.ORGTYPE13;
	}
	/**
	*setOrgtype13(java.lang.String)
	*/
	public void setOrgtype13(String orgtype13){
		this.ORGTYPE13=orgtype13;
	}
	/**
	* getOrgtype14(void) 
	*/
	public String getOrgtype14(){
		return this.ORGTYPE14;
	}
	/**
	*setOrgtype14(java.lang.String)
	*/
	public void setOrgtype14(String orgtype14){
		this.ORGTYPE14=orgtype14;
	}
	/**
	* getOrgtype15(void) 
	*/
	public String getOrgtype15(){
		return this.ORGTYPE15;
	}
	/**
	*setOrgtype15(java.lang.String)
	*/
	public void setOrgtype15(String orgtype15){
		this.ORGTYPE15=orgtype15;
	}
	/**
	* getOrgtype16(void) 
	*/
	public String getOrgtype16(){
		return this.ORGTYPE16;
	}
	/**
	*setOrgtype16(java.lang.String)
	*/
	public void setOrgtype16(String orgtype16){
		this.ORGTYPE16=orgtype16;
	}
	/**
	* getOrgtype17(void) 
	*/
	public String getOrgtype17(){
		return this.ORGTYPE17;
	}
	/**
	*setOrgtype17(java.lang.String)
	*/
	public void setOrgtype17(String orgtype17){
		this.ORGTYPE17=orgtype17;
	}
	/**
	* getOrgtype18(void) 
	*/
	public String getOrgtype18(){
		return this.ORGTYPE18;
	}
	/**
	*setOrgtype18(java.lang.String)
	*/
	public void setOrgtype18(String orgtype18){
		this.ORGTYPE18=orgtype18;
	}
	/**
	* getOrgtype19(void) 
	*/
	public String getOrgtype19(){
		return this.ORGTYPE19;
	}
	/**
	*setOrgtype19(java.lang.String)
	*/
	public void setOrgtype19(String orgtype19){
		this.ORGTYPE19=orgtype19;
	}
	/**
	* getOrgtype2(void) 
	*/
	public String getOrgtype2(){
		return this.ORGTYPE2;
	}
	/**
	*setOrgtype2(java.lang.String)
	*/
	public void setOrgtype2(String orgtype2){
		this.ORGTYPE2=orgtype2;
	}
	/**
	* getOrgtype20(void) 
	*/
	public String getOrgtype20(){
		return this.ORGTYPE20;
	}
	/**
	*setOrgtype20(java.lang.String)
	*/
	public void setOrgtype20(String orgtype20){
		this.ORGTYPE20=orgtype20;
	}
	/**
	* getOrgtype21(void) 
	*/
	public String getOrgtype21(){
		return this.ORGTYPE21;
	}
	/**
	*setOrgtype21(java.lang.String)
	*/
	public void setOrgtype21(String orgtype21){
		this.ORGTYPE21=orgtype21;
	}
	/**
	* getOrgtype22(void) 
	*/
	public String getOrgtype22(){
		return this.ORGTYPE22;
	}
	/**
	*setOrgtype22(java.lang.String)
	*/
	public void setOrgtype22(String orgtype22){
		this.ORGTYPE22=orgtype22;
	}
	/**
	* getOrgtype23(void) 
	*/
	public String getOrgtype23(){
		return this.ORGTYPE23;
	}
	/**
	*setOrgtype23(java.lang.String)
	*/
	public void setOrgtype23(String orgtype23){
		this.ORGTYPE23=orgtype23;
	}
	/**
	* getOrgtype24(void) 
	*/
	public String getOrgtype24(){
		return this.ORGTYPE24;
	}
	/**
	*setOrgtype24(java.lang.String)
	*/
	public void setOrgtype24(String orgtype24){
		this.ORGTYPE24=orgtype24;
	}
	/**
	* getOrgtype25(void) 
	*/
	public String getOrgtype25(){
		return this.ORGTYPE25;
	}
	/**
	*setOrgtype25(java.lang.String)
	*/
	public void setOrgtype25(String orgtype25){
		this.ORGTYPE25=orgtype25;
	}
	/**
	* getOrgtype26(void) 
	*/
	public String getOrgtype26(){
		return this.ORGTYPE26;
	}
	/**
	*setOrgtype26(java.lang.String)
	*/
	public void setOrgtype26(String orgtype26){
		this.ORGTYPE26=orgtype26;
	}
	/**
	* getOrgtype27(void) 
	*/
	public String getOrgtype27(){
		return this.ORGTYPE27;
	}
	/**
	*setOrgtype27(java.lang.String)
	*/
	public void setOrgtype27(String orgtype27){
		this.ORGTYPE27=orgtype27;
	}
	/**
	* getOrgtype28(void) 
	*/
	public String getOrgtype28(){
		return this.ORGTYPE28;
	}
	/**
	*setOrgtype28(java.lang.String)
	*/
	public void setOrgtype28(String orgtype28){
		this.ORGTYPE28=orgtype28;
	}
	/**
	* getOrgtype29(void) 
	*/
	public String getOrgtype29(){
		return this.ORGTYPE29;
	}
	/**
	*setOrgtype29(java.lang.String)
	*/
	public void setOrgtype29(String orgtype29){
		this.ORGTYPE29=orgtype29;
	}
	/**
	* getOrgtype3(void) 
	*/
	public String getOrgtype3(){
		return this.ORGTYPE3;
	}
	/**
	*setOrgtype3(java.lang.String)
	*/
	public void setOrgtype3(String orgtype3){
		this.ORGTYPE3=orgtype3;
	}
	/**
	* getOrgtype30(void) 
	*/
	public String getOrgtype30(){
		return this.ORGTYPE30;
	}
	/**
	*setOrgtype30(java.lang.String)
	*/
	public void setOrgtype30(String orgtype30){
		this.ORGTYPE30=orgtype30;
	}
	/**
	* getOrgtype31(void) 
	*/
	public String getOrgtype31(){
		return this.ORGTYPE31;
	}
	/**
	*setOrgtype31(java.lang.String)
	*/
	public void setOrgtype31(String orgtype31){
		this.ORGTYPE31=orgtype31;
	}
	/**
	* getOrgtype32(void) 
	*/
	public String getOrgtype32(){
		return this.ORGTYPE32;
	}
	/**
	*setOrgtype32(java.lang.String)
	*/
	public void setOrgtype32(String orgtype32){
		this.ORGTYPE32=orgtype32;
	}
	/**
	* getOrgtype33(void) 
	*/
	public String getOrgtype33(){
		return this.ORGTYPE33;
	}
	/**
	*setOrgtype33(java.lang.String)
	*/
	public void setOrgtype33(String orgtype33){
		this.ORGTYPE33=orgtype33;
	}
	/**
	* getOrgtype34(void) 
	*/
	public String getOrgtype34(){
		return this.ORGTYPE34;
	}
	/**
	*setOrgtype34(java.lang.String)
	*/
	public void setOrgtype34(String orgtype34){
		this.ORGTYPE34=orgtype34;
	}
	/**
	* getOrgtype35(void) 
	*/
	public String getOrgtype35(){
		return this.ORGTYPE35;
	}
	/**
	*setOrgtype35(java.lang.String)
	*/
	public void setOrgtype35(String orgtype35){
		this.ORGTYPE35=orgtype35;
	}
	/**
	* getOrgtype36(void) 
	*/
	public String getOrgtype36(){
		return this.ORGTYPE36;
	}
	/**
	*setOrgtype36(java.lang.String)
	*/
	public void setOrgtype36(String orgtype36){
		this.ORGTYPE36=orgtype36;
	}
	/**
	* getOrgtype37(void) 
	*/
	public String getOrgtype37(){
		return this.ORGTYPE37;
	}
	/**
	*setOrgtype37(java.lang.String)
	*/
	public void setOrgtype37(String orgtype37){
		this.ORGTYPE37=orgtype37;
	}
	/**
	* getOrgtype38(void) 
	*/
	public String getOrgtype38(){
		return this.ORGTYPE38;
	}
	/**
	*setOrgtype38(java.lang.String)
	*/
	public void setOrgtype38(String orgtype38){
		this.ORGTYPE38=orgtype38;
	}
	/**
	* getOrgtype39(void) 
	*/
	public String getOrgtype39(){
		return this.ORGTYPE39;
	}
	/**
	*setOrgtype39(java.lang.String)
	*/
	public void setOrgtype39(String orgtype39){
		this.ORGTYPE39=orgtype39;
	}
	/**
	* getOrgtype4(void) 
	*/
	public String getOrgtype4(){
		return this.ORGTYPE4;
	}
	/**
	*setOrgtype4(java.lang.String)
	*/
	public void setOrgtype4(String orgtype4){
		this.ORGTYPE4=orgtype4;
	}
	/**
	* getOrgtype40(void) 
	*/
	public String getOrgtype40(){
		return this.ORGTYPE40;
	}
	/**
	*setOrgtype40(java.lang.String)
	*/
	public void setOrgtype40(String orgtype40){
		this.ORGTYPE40=orgtype40;
	}
	/**
	* getOrgtype5(void) 
	*/
	public String getOrgtype5(){
		return this.ORGTYPE5;
	}
	/**
	*setOrgtype5(java.lang.String)
	*/
	public void setOrgtype5(String orgtype5){
		this.ORGTYPE5=orgtype5;
	}
	/**
	* getOrgtype6(void) 
	*/
	public String getOrgtype6(){
		return this.ORGTYPE6;
	}
	/**
	*setOrgtype6(java.lang.String)
	*/
	public void setOrgtype6(String orgtype6){
		this.ORGTYPE6=orgtype6;
	}
	/**
	* getOrgtype7(void) 
	*/
	public String getOrgtype7(){
		return this.ORGTYPE7;
	}
	/**
	*setOrgtype7(java.lang.String)
	*/
	public void setOrgtype7(String orgtype7){
		this.ORGTYPE7=orgtype7;
	}
	/**
	* getOrgtype8(void) 
	*/
	public String getOrgtype8(){
		return this.ORGTYPE8;
	}
	/**
	*setOrgtype8(java.lang.String)
	*/
	public void setOrgtype8(String orgtype8){
		this.ORGTYPE8=orgtype8;
	}
	/**
	* getOrgtype9(void) 
	*/
	public String getOrgtype9(){
		return this.ORGTYPE9;
	}
	/**
	*setOrgtype9(java.lang.String)
	*/
	public void setOrgtype9(String orgtype9){
		this.ORGTYPE9=orgtype9;
	}
	/**
	* getPk_accperiodscheme(void) 
	*/
	public String getPk_accperiodscheme(){
		return this.PK_ACCPERIODSCHEME;
	}
	/**
	*setPk_accperiodscheme(java.lang.String)
	*/
	public void setPk_accperiodscheme(String pk_accperiodscheme){
		this.PK_ACCPERIODSCHEME=pk_accperiodscheme;
	}
	/**
	* getPk_controlarea(void) 
	*/
	public String getPk_controlarea(){
		return this.PK_CONTROLAREA;
	}
	/**
	*setPk_controlarea(java.lang.String)
	*/
	public void setPk_controlarea(String pk_controlarea){
		this.PK_CONTROLAREA=pk_controlarea;
	}
	/**
	* getPk_corp(void) 
	*/
	public String getPk_corp(){
		return this.PK_CORP;
	}
	/**
	*setPk_corp(java.lang.String)
	*/
	public void setPk_corp(String pk_corp){
		this.PK_CORP=pk_corp;
	}
	/**
	* getPk_currtype(void) 
	*/
	public String getPk_currtype(){
		return this.PK_CURRTYPE;
	}
	/**
	*setPk_currtype(java.lang.String)
	*/
	public void setPk_currtype(String pk_currtype){
		this.PK_CURRTYPE=pk_currtype;
	}
	/**
	* getPk_exratescheme(void) 
	*/
	public String getPk_exratescheme(){
		return this.PK_EXRATESCHEME;
	}
	/**
	*setPk_exratescheme(java.lang.String)
	*/
	public void setPk_exratescheme(String pk_exratescheme){
		this.PK_EXRATESCHEME=pk_exratescheme;
	}
	/**
	* getPk_fatherorg(void) 
	*/
	public String getPk_fatherorg(){
		return this.PK_FATHERORG;
	}
	/**
	*setPk_fatherorg(java.lang.String)
	*/
	public void setPk_fatherorg(String pk_fatherorg){
		this.PK_FATHERORG=pk_fatherorg;
	}
	/**
	* getPk_format(void) 
	*/
	public String getPk_format(){
		return this.PK_FORMAT;
	}
	/**
	*setPk_format(java.lang.String)
	*/
	public void setPk_format(String pk_format){
		this.PK_FORMAT=pk_format;
	}
	/**
	* getPk_group(void) 
	*/
	public String getPk_group(){
		return this.PK_GROUP;
	}
	/**
	*setPk_group(java.lang.String)
	*/
	public void setPk_group(String pk_group){
		this.PK_GROUP=pk_group;
	}
	/**
	* getPk_org(void) 
	*/
	public String getPk_org(){
		return this.PK_ORG;
	}
	/**
	*setPk_org(java.lang.String)
	*/
	public void setPk_org(String pk_org){
		this.PK_ORG=pk_org;
	}
	/**
	* getPk_timezone(void) 
	*/
	public String getPk_timezone(){
		return this.PK_TIMEZONE;
	}
	/**
	*setPk_timezone(java.lang.String)
	*/
	public void setPk_timezone(String pk_timezone){
		this.PK_TIMEZONE=pk_timezone;
	}
	/**
	* getPk_vid(void) 
	*/
	public String getPk_vid(){
		return this.PK_VID;
	}
	/**
	*setPk_vid(java.lang.String)
	*/
	public void setPk_vid(String pk_vid){
		this.PK_VID=pk_vid;
	}
	/**
	* getPrincipal(void) 
	*/
	public String getPrincipal(){
		return this.PRINCIPAL;
	}
	/**
	*setPrincipal(java.lang.String)
	*/
	public void setPrincipal(String principal){
		this.PRINCIPAL=principal;
	}
	/**
	* getReportconfirm(void) 
	*/
	public String getReportconfirm(){
		return this.REPORTCONFIRM;
	}
	/**
	*setReportconfirm(java.lang.String)
	*/
	public void setReportconfirm(String reportconfirm){
		this.REPORTCONFIRM=reportconfirm;
	}
	/**
	* getShortname(void) 
	*/
	public String getShortname(){
		return this.SHORTNAME;
	}
	/**
	*setShortname(java.lang.String)
	*/
	public void setShortname(String shortname){
		this.SHORTNAME=shortname;
	}
	/**
	* getShortname2(void) 
	*/
	public String getShortname2(){
		return this.SHORTNAME2;
	}
	/**
	*setShortname2(java.lang.String)
	*/
	public void setShortname2(String shortname2){
		this.SHORTNAME2=shortname2;
	}
	/**
	* getShortname3(void) 
	*/
	public String getShortname3(){
		return this.SHORTNAME3;
	}
	/**
	*setShortname3(java.lang.String)
	*/
	public void setShortname3(String shortname3){
		this.SHORTNAME3=shortname3;
	}
	/**
	* getShortname4(void) 
	*/
	public String getShortname4(){
		return this.SHORTNAME4;
	}
	/**
	*setShortname4(java.lang.String)
	*/
	public void setShortname4(String shortname4){
		this.SHORTNAME4=shortname4;
	}
	/**
	* getShortname5(void) 
	*/
	public String getShortname5(){
		return this.SHORTNAME5;
	}
	/**
	*setShortname5(java.lang.String)
	*/
	public void setShortname5(String shortname5){
		this.SHORTNAME5=shortname5;
	}
	/**
	* getShortname6(void) 
	*/
	public String getShortname6(){
		return this.SHORTNAME6;
	}
	/**
	*setShortname6(java.lang.String)
	*/
	public void setShortname6(String shortname6){
		this.SHORTNAME6=shortname6;
	}
	/**
	* getTel(void) 
	*/
	public String getTel(){
		return this.TEL;
	}
	/**
	*setTel(java.lang.String)
	*/
	public void setTel(String tel){
		this.TEL=tel;
	}
	/**
	* getTs(void) 
	*/
	public String getTs(){
		return this.TS;
	}
	/**
	*setTs(java.lang.String)
	*/
	public void setTs(String ts){
		this.TS=ts;
	}
	/**
	* getVenddate(void) 
	*/
	public String getVenddate(){
		return this.VENDDATE;
	}
	/**
	*setVenddate(java.lang.String)
	*/
	public void setVenddate(String venddate){
		this.VENDDATE=venddate;
	}
	/**
	* getVname(void) 
	*/
	public String getVname(){
		return this.VNAME;
	}
	/**
	*setVname(java.lang.String)
	*/
	public void setVname(String vname){
		this.VNAME=vname;
	}
	/**
	* getVname2(void) 
	*/
	public String getVname2(){
		return this.VNAME2;
	}
	/**
	*setVname2(java.lang.String)
	*/
	public void setVname2(String vname2){
		this.VNAME2=vname2;
	}
	/**
	* getVname3(void) 
	*/
	public String getVname3(){
		return this.VNAME3;
	}
	/**
	*setVname3(java.lang.String)
	*/
	public void setVname3(String vname3){
		this.VNAME3=vname3;
	}
	/**
	* getVname4(void) 
	*/
	public String getVname4(){
		return this.VNAME4;
	}
	/**
	*setVname4(java.lang.String)
	*/
	public void setVname4(String vname4){
		this.VNAME4=vname4;
	}
	/**
	* getVname5(void) 
	*/
	public String getVname5(){
		return this.VNAME5;
	}
	/**
	*setVname5(java.lang.String)
	*/
	public void setVname5(String vname5){
		this.VNAME5=vname5;
	}
	/**
	* getVname6(void) 
	*/
	public String getVname6(){
		return this.VNAME6;
	}
	/**
	*setVname6(java.lang.String)
	*/
	public void setVname6(String vname6){
		this.VNAME6=vname6;
	}
	/**
	* getVno(void) 
	*/
	public String getVno(){
		return this.VNO;
	}
	/**
	*setVno(java.lang.String)
	*/
	public void setVno(String vno){
		this.VNO=vno;
	}
	/**
	* getVstartdate(void) 
	*/
	public String getVstartdate(){
		return this.VSTARTDATE;
	}
	/**
	*setVstartdate(java.lang.String)
	*/
	public void setVstartdate(String vstartdate){
		this.VSTARTDATE=vstartdate;
	}
	/**
	* getWorkcalendar(void) 
	*/
	public String getWorkcalendar(){
		return this.WORKCALENDAR;
	}
	/**
	*setWorkcalendar(java.lang.String)
	*/
	public void setWorkcalendar(String workcalendar){
		this.WORKCALENDAR=workcalendar;
	}


}