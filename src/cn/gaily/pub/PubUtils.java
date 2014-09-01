package cn.gaily.pub;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Properties;

public class PubUtils {

//	public static final String savePath = "C:\\prop.properties";
	public static final String oldPath = "prop.properties";
	public static InputStream in = null;
	
	
	public PubUtils(){
		in = this.getClass().getResourceAsStream(oldPath);
	}
	
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
	
	public static String getProperty(String key){
		Properties prop = new Properties();
		InputStream fis =null;
		String value = "";
        try {
        	fis = new FileInputStream(ResourceManager.savePath);
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
	
	public static void setProperty(String key, String value){
		Properties prop = new Properties();   
        FileInputStream fis = null;
        FileOutputStream fos = null;
		try {
			fis = new FileInputStream(ResourceManager.savePath);
			prop.load(fis);
			fos = new FileOutputStream(ResourceManager.savePath);
			prop.setProperty(key, value);
			prop.store(fos, "success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
      
	}
	
	
	 public static void copyFile(String oldPath, String newPath) { 
	       try { 
	           int bytesum = 0; 
	           int byteread = 0; 
	               InputStream inStream = in; //读入原文件
	               File newFile = new File(newPath);
	               if(!newFile.exists()){
	            	   newFile.createNewFile();
	               }
	               FileOutputStream fs = new FileOutputStream(newPath); 
	               byte[] buffer = new byte[1444]; 
	               while ( (byteread = inStream.read(buffer)) != -1) { 
	                   bytesum += byteread; //字节数 文件大小 
	                   fs.write(buffer, 0, byteread); 
	               } 
	               inStream.close(); 
	       } 
	       catch (Exception e) { 
	           System.out.println("复制单个文件操作出错"); 
	           e.printStackTrace(); 

	       } 

	   } 
	 
	 public static void copyPropFileToLocal(){
		 new PubUtils().copyFile(oldPath, ResourceManager.savePath);
	 }
}
