package cn.gaily.xchange;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.UUID;

/**
 * <p>Title: PubUtils</P>
 * <p>Description:公共工具类 </p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-3
 */
public class PubUtils {

	public static final String PROPERTY_FILEPATH ="config.properties";
	
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
	/**
	 * <p>方法名称：getSequence</p>
	 * <p>方法描述：获取随机序列</p>
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	public static String getSequence(){
		String sequence = UUID.randomUUID().toString().replace("-", "");
		return sequence.substring(sequence.length()-20);
	}
	
	/**
	 * <p>方法名称：isEmpty</p>
	 * <p>方法描述：字符串判空</p>
	 * @author xiaoh
	 * @since  2014-9-3
	 * <p> history 2014-9-3 xiaoh  创建   <p>
	 */
	public static boolean isEmpty(String str){
		return str==null||"".equals(str)?true: false;
	}
}
