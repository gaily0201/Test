package cn.gaily.syn.pub;

/**
 * <p>Title: PubConstant</P>
 * <p>Description: 公共常量类</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class PubConstant {

	/**
	 * <p>Title: DBType</P>
	 * <p>Description: 数据库类型常量</p>
	 * @author xiaoh
	 * @version 1.0
	 * @since 2015-1-29
	 */
	public static interface DBType{
		/**
		 * oracle数据库类型
		 */
		public static final int ORACLE = 0;
		/**
		 * mysql数据库类型
		 */
		public static final int MYSQL  = 1;
		/**
		 * sql server数据库类型
		 */
		public static final int MSSQL = 2;
	}
	
	/**
	 * <p>Title: SynType</P>
	 * <p>Description: 同步类型</p>
	 * @author xiaoh
	 * @version 1.0
	 * @since 2015-1-29
	 */
	public static interface SynType{
		/**
		 * 源库到目标库
		 */
		public static final int SRC_DESC = 0;
		/**
		 * 目标库到源库
		 */
		public static final int DESC_SRC = 1;
		/**
		 * 双向同步
		 */
		public static final int BOTH_SYN = 2;
	}
	
	public static final int THREAD_POOL_SIZE = 10;
	
	
	public static final String TEMP_PREFIX = "XFL_";


	public static final int BATCH_SIZE = 500;
	
}
