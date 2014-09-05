package cn.gaily.orm.pub;

/**
 * <p>Title: NamingStrategyNoChange</P>
 * <p>Description: 不修改命名策略</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public class NamingStrategyNoChange implements NamingStrategy {

	@Override
	public String naming(String value) {
		return value;
	}

}
