package cn.gaily.orm.pub;


public class PubUtils {

	public static boolean isEmpty(String value){
		return value!=null&&!"".equals(value.trim())?false:true;
	}
	
	public static boolean isNotEmpty(String value){
		return !isEmpty(value);
	}
	
	public static String setString(Object obj){
		if(obj==null){
			return "";
		}
		return obj.toString();
	}
	
	public static String getString(String value){
		if(isEmpty(value)){
			return "";
		}
		return value;
	}
}
