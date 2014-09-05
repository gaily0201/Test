package cn.gaily.orm.pub;

/**
 * <p>Title: NamingStrategyUpperFirst</P>
 * <p>Description: 去除下划线，并将首字母和下划线后一个字母大写</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public class NamingStrategyUpperFirst implements NamingStrategy {

	@Override
	public String naming(String value) {
		if(PubUtils.isEmpty(value)){
			return "";
		}
		char[] chars = value.toCharArray();
		for(int i=0;i<chars.length;i++){
			if(i==0){
				chars[0]=Character.toUpperCase(chars[0]);
				continue;
			}
			if("_".equals(String.valueOf(chars[i]))&&(i+1)<=chars.length){
				chars[i+1] = Character.toUpperCase(chars[i+1]);
			}
		}
		String result = String.valueOf(chars);
		result = result.replaceAll("_","");
		return result;
	}

	
	public static void main(String[] args) {
		NamingStrategyUpperFirst name = new NamingStrategyUpperFirst();
		System.out.println(name.naming("crpas_baobu_h"));
		
	}
}
