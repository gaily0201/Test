package cn.gaily.syn.pub.entity;

import java.io.Serializable;

/**
 * <p>Title: TabConfigVO</P>
 * <p>Description:表配置信息 </p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class TabConfigVO implements Serializable {

	private static final long serialVersionUID = 4430413419192466833L;

	public static String PK = "pk";
	
	/**
	 * 对应DBConfigVO的pk
	 */
	public static String PPK = "ppk";
	
	public static String TabName = "tabname";
	
	public static String TabDesc = "tabdesc";
	
	public static String TS = "ts";

	public static String getPK() {
		return PK;
	}

	public static void setPK(String pK) {
		PK = pK;
	}

	public static String getPPK() {
		return PPK;
	}

	public static void setPPK(String pPK) {
		PPK = pPK;
	}

	public static String getTabName() {
		return TabName;
	}

	public static void setTabName(String tabName) {
		TabName = tabName;
	}

	public static String getTabDesc() {
		return TabDesc;
	}

	public static void setTabDesc(String tabDesc) {
		TabDesc = tabDesc;
	}

	public static String getTS() {
		return TS;
	}

	public static void setTS(String tS) {
		TS = tS;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(this.PK).append("->").append(getPK()).append(",");
		sb.append(this.TabName).append("->").append(getTabName()).append(",");
		sb.append(this.TabDesc).append("->").append(getTabDesc()).append(",");
		sb.append(this.PPK).append("->").append(getPPK()).append(",");
		return super.toString();
	}
}
