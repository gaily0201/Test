package cn.gaily.charcter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

/**
 * <p>Title: ChangeFileChracter</P>
 * <p>Description: 改变目录下所有文件的编码</p>
 * @author xiaoh
 * @version 1.0
 * @since 2014-10-10
 */
public class ChangeFileChracter {

	/**
	 * <p>方法名称：testRead</p>
	 * <p>方法描述：批量修改文件的编码</p>
	 * @param filePath
	 * @throws IOException
	 * @author xiaoh
	 * @since  2014-10-10
	 * <p> history 2014-10-10 xiaoh  创建   <p>
	 */
	public void testRead(String  filePath) throws IOException{
		Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(filePath), new String[]{"java"}, true); 
		        
		for (File javaGbkFile : javaGbkFileCol) { 
		      String newFilePath = filePath+javaGbkFile.getAbsolutePath().substring(filePath.length()); 
		      /**
		       * 
		       */
		      FileUtils.writeLines(new File(newFilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));        
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		new ChangeFileChracter().testRead("D:\\testFile");
//		new ChangeFileChracter().changeCharacter(testFile, "UTF-8");
	}
}
