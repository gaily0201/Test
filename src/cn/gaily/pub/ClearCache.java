package cn.gaily.pub;

import java.io.File;

public class ClearCache {

	public static void main(String[] args) {
		String path = System.getProperty("user.home")+File.separator+"NCCACHE";
		File ff = new File(path);
	}
	
	private static void deleteFile(File f) {
		 
        if (f.isFile()) {
            f.delete();
            return;
        }
        File[] fs = f.listFiles();
        for (File file : fs) {
            deleteFile(file);
        }
        f.delete();
    }
}
