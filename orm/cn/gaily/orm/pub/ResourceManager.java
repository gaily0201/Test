package cn.gaily.orm.pub;


public class ResourceManager {
	
	//DB
//	public static String 	DRIVER 		= "oracle.jdbc.driver.OracleDriver";
//	public static String 	URL 		= "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static String 	DB_USERNAME 	= "uap63_test";
	public static String 	DB_PASSWORD 	= "1";
	public static String 	DB_IP 			= "192.168.1.100";
	
	//标准oracle查询sql
	public static String standardqueryFiledSql = "SELECT A.COLUMN_NAME, A.DATA_TYPE,  A.DATA_LENGTH, A.NULLABLE, B.COMMENTS, CASE WHEN a.column_name=D.column_name THEN 'Y' ELSE 'N' END FROM USER_TAB_COLUMNS A LEFT JOIN USER_COL_COMMENTS B ON A.TABLE_NAME = B.TABLE_NAME AND A.COLUMN_NAME = B.COLUMN_NAME LEFT JOIN USER_CONSTRAINTS C ON A.TABLE_NAME = C.TABLE_NAME LEFT JOIN USER_CONS_COLUMNS D  ON C.constraint_name=D.constraint_name WHERE A.TABLE_NAME =? AND C.CONSTRAINT_TYPE = 'P' ORDER BY A.COLUMN_ID ASC";
	//实际查询sql(可能为uap查元数据的sql,注意程序中使用的是这条实际的sql)
	public static String realqueryFiledSql = "SELECT A.NAME, A.SQLDATETYPE,  A.COLUMNLENGTH, A.NULLABLE, A.DISPLAYNAME,A.PKEY FROM MD_COLUMN A WHERE A.TABLEID=?";
//	public static String realqueryFiledSql = "SELECT A.COLUMN_NAME, A.DATA_TYPE,  A.DATA_LENGTH, A.NULLABLE, B.COMMENTS, CASE WHEN a.column_name=D.column_name THEN 'Y' ELSE 'N' END FROM USER_TAB_COLUMNS A LEFT JOIN USER_COL_COMMENTS B ON A.TABLE_NAME = B.TABLE_NAME AND A.COLUMN_NAME = B.COLUMN_NAME LEFT JOIN USER_CONSTRAINTS C ON A.TABLE_NAME = C.TABLE_NAME LEFT JOIN USER_CONS_COLUMNS D  ON C.constraint_name=D.constraint_name WHERE A.TABLE_NAME =? AND C.CONSTRAINT_TYPE = 'P' ORDER BY A.COLUMN_ID ASC";

	public static String VO_SAVEPATH = "\\orm\\cn\\gaily\\orm\\vos\\";
	//velocity
	public static String VE_CHARACTER = "UTF-8";
	public static String entityTempletPath = "orm/cn/gaily/orm/templet/Entity.vm";
	public static String createTableTempletPath = "orm/cn/gaily/orm/templet/CreateTable.vm";
	
	public static String checkTableExistSql="SELECT COUNT(1) FROM USER_TABLES WHERE TABLE_NAME=?";
	public static String dropTableSql="DROP TABLE ?";
}
