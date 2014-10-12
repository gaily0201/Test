package cn.gaily.ktl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandUtil {

	public static void executeCMD(String cmd){
//		cmd.exe /c ipconfig /all
		BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            br = new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	public static void main(String[] args) {
//		executeCMD("cmd.exe /c ipconfig /all");
//		executeCMD("d:\\test.bat");
		System.out.println("aaaa");
		new Runnable() {
			@Override
			public void run() {
				executeCMD("d:\\test.bat");
			}
		}.run();
	}
}
