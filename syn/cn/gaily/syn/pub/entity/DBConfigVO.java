package cn.gaily.syn.pub.entity;

import java.io.Serializable;

/**
 * <p>Title: ConfigVO</P>
 * <p>Description: 数据库配置信息</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class DBConfigVO implements Serializable {
	private static final long serialVersionUID = -4035575786341455986L;

	public static String PK = "pk";
	
	public static String SRCIP = "srcip";
	
	public static String SRCDBNAME = "srcdbname";
	
	public static String SRCPORT  = "srcport";
	
	public static String SRCUSERNAME = "srcusername";
	
	public static String SRCPASSWORD = "srcpassword";
	
	public static int SRCDBTYPE = -1;
	
	public static String DESCIP = "descip";
	
	public static String DESCDBNAME = "descdbname";
	
	public static String DESCPORT  = "descport";
	
	public static String DESCUSERNAME = "descusername";
	
	public static String DESCPASSWORD = "descpassword";
	
	public static int DESCDBTYPE = -1;
	
	/**
	 * 同步类型,对应PubConstant.SynType
	 */
	public static int SYNTYPE = -1;
	
	public static String TS = "ts";

	public static int DR = 0;

	public static String getPK() {
		return PK;
	}

	public static void setPK(String pK) {
		PK = pK;
	}

	public static String getSRCIP() {
		return SRCIP;
	}

	public static void setSRCIP(String sRCIP) {
		SRCIP = sRCIP;
	}

	public static String getSRCDBNAME() {
		return SRCDBNAME;
	}

	public static void setSRCDBNAME(String sRCDBNAME) {
		SRCDBNAME = sRCDBNAME;
	}

	public static String getSRCPORT() {
		return SRCPORT;
	}

	public static void setSRCPORT(String sRCPORT) {
		SRCPORT = sRCPORT;
	}

	public static String getSRCUSERNAME() {
		return SRCUSERNAME;
	}

	public static void setSRCUSERNAME(String sRCUSERNAME) {
		SRCUSERNAME = sRCUSERNAME;
	}

	public static String getSRCPASSWORD() {
		return SRCPASSWORD;
	}

	public static void setSRCPASSWORD(String sRCPASSWORD) {
		SRCPASSWORD = sRCPASSWORD;
	}

	public static String getDESCIP() {
		return DESCIP;
	}

	public static void setDESCIP(String dESCIP) {
		DESCIP = dESCIP;
	}

	public static String getDESCDBNAME() {
		return DESCDBNAME;
	}

	public static void setDESCDBNAME(String dESCDBNAME) {
		DESCDBNAME = dESCDBNAME;
	}

	public static String getDESCPORT() {
		return DESCPORT;
	}

	public static void setDESCPORT(String dESCPORT) {
		DESCPORT = dESCPORT;
	}

	public static String getDESCUSERNAME() {
		return DESCUSERNAME;
	}

	public static void setDESCUSERNAME(String dESCUSERNAME) {
		DESCUSERNAME = dESCUSERNAME;
	}

	public static String getDESCPASSWORD() {
		return DESCPASSWORD;
	}

	public static void setDESCPASSWORD(String dESCPASSWORD) {
		DESCPASSWORD = dESCPASSWORD;
	}
	
	public static int getSYNTYPE() {
		return SYNTYPE;
	}

	public static void setSYNTYPE(int sYNTYPE) {
		SYNTYPE = sYNTYPE;
	}
	public static String getTS() {
		return TS;
	}

	public static void setTS(String tS) {
		TS = tS;
	}

	public static int getDR() {
		return DR;
	}

	public static void setDR(int dR) {
		DR = dR;
	}
	
	public static int getSRCDBTYPE() {
		return SRCDBTYPE;
	}

	public static void setSRCDBTYPE(int sRCDBTYPE) {
		SRCDBTYPE = sRCDBTYPE;
	}

	public static int getDESCDBTYPE() {
		return DESCDBTYPE;
	}

	public static void setDESCDBTYPE(int dESCDBTYPE) {
		DESCDBTYPE = dESCDBTYPE;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(this.PK).append("->").append(getPK()).append(",");
		sb.append(this.SRCDBNAME).append("->").append(getSRCDBNAME()).append(",");
		sb.append(this.SRCDBTYPE).append("->").append(getSRCDBTYPE()).append(",");
		sb.append(this.SRCIP).append("->").append(getSRCIP()).append(",");
		sb.append(this.SRCPASSWORD).append("->").append(getSRCPASSWORD()).append(",");
		sb.append(this.SRCPORT).append("->").append(getSRCPORT()).append(",");
		sb.append(this.SRCUSERNAME).append("->").append(getSRCUSERNAME()).append(",");
		sb.append(this.DESCDBNAME).append("->").append(getDESCDBNAME()).append(",");
		sb.append(this.DESCDBTYPE).append("->").append(getDESCDBTYPE()).append(",");
		sb.append(this.DESCIP).append("->").append(getDESCIP()).append(",");
		sb.append(this.DESCPASSWORD).append("->").append(getDESCPASSWORD()).append(",");
		sb.append(this.DESCPORT).append("->").append(getDESCPORT()).append(",");
		sb.append(this.DESCUSERNAME).append("->").append(getDESCUSERNAME()).append(",");
		sb.append(this.SYNTYPE).append("->").append(getSYNTYPE()).append("]");
		return sb.toString();
	}
	
}
