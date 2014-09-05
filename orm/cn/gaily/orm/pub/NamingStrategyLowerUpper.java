package cn.gaily.orm.pub;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: NamingStrategyLowerUpper</P>
 * <p>Description: 将大写字母变小写并在该字母前添加下划线</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public class NamingStrategyLowerUpper implements NamingStrategy {

	@Override
	public String naming(String value) {
		if(PubUtils.isEmpty(value)){
			return "";
		}
		List<Character> resultList = new ArrayList<Character>();
		char[] chars = value.toCharArray();
		for(int i=0;i<chars.length;i++){
			if(i==0){
				chars[0] = Character.toLowerCase(chars[0]);
				resultList.add(chars[0]);
				continue;
			}
			if(Character.isUpperCase(chars[i])){
				resultList.add('_');
				resultList.add(Character.toLowerCase(chars[i]));
			}
		}
		char[] result = new char[resultList.size()];
		for(int i=0;i<result.length;i++){
			result[i]=resultList.get(i);
		}
		return String.valueOf(result);
	}
}
