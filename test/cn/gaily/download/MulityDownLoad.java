package cn.gaily.download;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MulityDownLoad {
	
	public static final int threadCount = 5;
	public static final String fileName = "wrar520sc_setup.1418806135.exe";
	
	
	public static void main(String[] args) throws IOException {
		
		String path = "http://dlsw.baidu.com/sw-search-sp/soft/2e/10849/wrar520sc_setup.1418806135.exe";
//		String path = "http://img2sw.baidu.com/www/soft//1422979200/1423016822.jpg";
//		String path = "http://localhost:8080/baidu.exe";
//		downLoadFromUrl(path, "d:\\temp.png");
		
		mulityDownload(path);
		
//		dowLoadFile("c:\\temp.png", "d:\\temp.png");
	}
	
	
	
	@SuppressWarnings("unused")
	private static String getPageSource(String page,String encoding) {    
	        StringBuffer sb = new StringBuffer();    
	        try {
	            URL url = new URL(page);    
	            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), encoding));    
	            String line;    
	            while ((line = in.readLine()) != null) {    
	                sb.append(line);    
	                sb.append("\n");  
	            }    
	            in.close();    
	        } catch (Exception ex) {    
	            System.err.println(ex);    
	        }    
	        return sb.toString();    
	    }
	
	
	@SuppressWarnings("unused")
	private static void downLoadFromUrl(String path, String savePath){
		try {
			URL url = new URL(path);
			HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setReadTimeout(5000);
			int code = connection.getResponseCode();
			System.out.println("response code:"+code);
			
			InputStream input = connection.getInputStream();
			RandomAccessFile raf  = new RandomAccessFile(savePath,"rwd");
			
			int len =0;
			byte[] buffer = new byte[1024];
			while((len=input.read(buffer))!=-1){
				raf.write(buffer, 0, len);
			}
			raf.close();
			input.close();
			connection.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private static void dowLoadFile(String path, String savepath) throws IOException{
		File file = new File(path);
		RandomAccessFile raf = new RandomAccessFile(savepath, "rwd");
		raf.setLength(file.length());
		InputStream is = new FileInputStream(file);
		int len = 0;
		byte[] buffer = new byte[1024];
		while((len=is.read(buffer))!=-1){
			raf.write(buffer, 0, len);
		}
		raf.close();
		is.close();
	}
	
	@SuppressWarnings("unused")
	private static void mulityDownload(String path) throws IOException {
//		String fileName = path.substring(path.lastIndexOf("/")+1, path.length());
		URL url  = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		int code = conn.getResponseCode();
		if(code==200){
			System.out.println("connection successful");
			int length = conn.getContentLength();
			int perLength = length/ threadCount;
			System.out.println("File length:"+ length);
			
			RandomAccessFile raf  = new RandomAccessFile(fileName,"rwd");
			raf.setLength(length);
			raf.close();
			
			int startLength = 0;
			int endLength   = 0;
			for(int threadId=1; threadId<=threadCount;threadId++){
				startLength = (threadId-1) * perLength;
				endLength   = threadId*perLength -1;
				if(threadId==threadCount){
					endLength = length;
				}
				System.out.println(threadId+":"+startLength+"-"+endLength);
				new MulityDownLoad.DownLoadThrad(path,threadId,startLength,endLength).start();
			}
			
		}else{
			System.out.println("connection failed");
		}
		
		conn.disconnect();
	}
	 
	private static class DownLoadThrad extends Thread{
		String path = null;
		int threadId = 0;
		int startLength = 0;
		int endLength = 0;
		
		public DownLoadThrad(String path, int threadId, int startLength, int endLength){
			this.path = path;
			this.threadId = threadId;
			this.startLength = startLength;
			this.endLength = endLength;
		}
		
		@Override
		public void run() {
//			String fileName = path.substring(path.lastIndexOf("/"), path.length());
			long startTime = System.currentTimeMillis();
			try {
				URL url = new URL(path);
				HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Range", "bytes="+startLength+"-"+endLength);
				connection.setReadTimeout(5000);
				int code = connection.getResponseCode();
				System.out.println("response code:"+code);
				
				InputStream input = connection.getInputStream();
				RandomAccessFile raf  = new RandomAccessFile(fileName,"rwd");
				raf.seek(startLength);
				
				int len =0;
				byte[] buffer = new byte[1024];
				int total = 0;
				while((len=input.read(buffer))!=-1){
					raf.write(buffer, 0, len);
					total = total+len;
					System.out.println("thread "+threadId+" download: "+ total);
				}
				raf.close();
				input.close();
				connection.disconnect();
				System.out.println("thrad "+threadId+" download complete.");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			long endTime  = System.currentTimeMillis();
			System.out.println("thread "+threadId+" costs:"+ (endTime-startTime)/1000+"s");
		}
	}
	
}




