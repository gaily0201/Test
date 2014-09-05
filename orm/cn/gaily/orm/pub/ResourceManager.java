package cn.gaily.orm.pub;


public class ResourceManager {
	
	//DB
//	public static String 	DRIVER 		= "oracle.jdbc.driver.OracleDriver";
//	public static String 	URL 		= "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static String 	DB_USERNAME 	= "uap63";
	public static String 	DB_PASSWORD 	= "1";
	public static String 	DB_IP 			= "192.168.1.100";
	
	//sql
	public static String standardqueryFiledSql = "SELECT A.COLUMN_NAME, A.DATA_TYPE, A.DATA_LENGTH, A.NULLABLE, B.COMMENTS FROM USER_TAB_COLUMNS A LEFT JOIN USER_COL_COMMENTS B ON A.TABLE_NAME = B.TABLE_NAME AND A.COLUMN_NAME = B.COLUMN_NAME WHERE A.TABLE_NAME=? ORDER BY A.COLUMN_ID ASC";
	public static String realqueryFiledSql = "SELECT A.NAME, A.SQLDATETYPE,  A.COLUMNLENGTH, A.NULLABLE, A.DISPLAYNAME FROM MD_COLUMN A WHERE A.TABLEID=?";
	
	
	
	public static String VO_SAVEPATH = "\\orm\\cn\\gaily\\orm\\vos\\";
	//velocity
	public static String VE_CHARACTER = "UTF-8";
	
}
