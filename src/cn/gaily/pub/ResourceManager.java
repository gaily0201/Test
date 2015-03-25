package cn.gaily.pub;

import java.io.File;

import org.apache.lucene.search.Collector;

public interface ResourceManager {
	
	
	public static final String DISK = "C:";
	public static final String PATH = "luceneIndex";
	public static final String INDEX_PATH = DISK+File.separator+PubUtils.getProperty("PATH");
	public static final String savePath = "C:\\prop.properties";

	public static final String SYS_FILE_INDEX = "c:\\sys_index\\";
	
	//默认设置，不能修改
	public static final String FIELD_NAME = "name";
	public static final String FIELD_COMMENT = "comment";
	public static final String FIELD_TYPE = "type";
	public static final String FIELD_TABLENAME = "tableName";
	public static final String FIELD_META = "meta";
	public static final String QUERY_COMMENT_SQL = "SELECT DISTINCT A.NAME, A.DISPLAYNAME, A.SQLDATETYPE||'('||A.COLUMNLENGTH||')', A.TABLEID, B.DISPLAYNAME FROM MD_COLUMN A, MD_TABLE B WHERE A.TABLEID=B.ID";
	public static final String COMMENT_TABLENAMES="序号,字段名,显示名,类型,表名,元数据名称";
	public static final String[] QUERY_FIELDS=new String[]{"序号",FIELD_NAME,FIELD_COMMENT,FIELD_TYPE,FIELD_TABLENAME,FIELD_META};
	public static final String SPLIT_PREFIX = ",";

	
	public static final String DEFAULT_USERNAME = "uap63";
	public static final String DEFAULT_PASSWORD = "1";
	public static final String DEFAULT_IP = "127.0.0.1";
	
	public static final int QUERY_SIZE = 300;
	public static final String DEFAULT_DBNAME = "ORCL";
	
	/**
	 * SELECT A.CODE,A.PK_ORG,B.PK_ORG, A.NAME, B.NAME father FROM ORG_ORGS A, ORG_ORGS B WHERE A.PK_FATHERORG = B.PK_ORG
	 * 序号,编码,Pk_org,父类pk_org,名称,父类名称
	 * 
	 */
}
