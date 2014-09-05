package cn.gaily.orm.pub;

/**
 * <p>Title: NamingStrategy</P>
 * <p>Description: 命名策略</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public interface NamingStrategy {

	public String naming(String value);
	
	/**
	 * 不修改策略
	 */
	public static NamingStrategy NOCHANGE = new NamingStrategyNoChange();
	/**
	 * 将首字母和下划线后一字母大写
	 */
	public static NamingStrategy UPPERFIRST = new NamingStrategyUpperFirst();
	/**
	 * 将大写字母小写并在之前添加下划线
	 */
	public static NamingStrategy LOWERUPPER = new NamingStrategyLowerUpper();
	
}
