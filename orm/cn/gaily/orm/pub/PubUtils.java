package cn.gaily.orm.pub;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PubUtils {

	public static final String PROPERTY_FILEPATH ="config.properties";
	
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
	
	/**
	 * <p>方法名称：getProperty</p>
	 * <p>方法描述：获取配置文件属性</p>
	 * @param key	属性文件的key
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	public static String getProperty(String key){
		Properties prop = new Properties();
		InputStream fis =null;
		String value = "";
        try {
//        	fis = new FileInputStream(PROPERTY_FILEPATH);
        	fis = PubUtils.class.getResourceAsStream(PROPERTY_FILEPATH);
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return value;
	}
}
