package test;

import java.io.File;

public class changge {
	
	public static void main(String[] args) {
		
		
		String url = "D:\\Ó¢ÐÛÊ±¿Ì\\799635929\\VideoData\\1466613396722";
		for(int i = 0;i<10;i++) {
			String url1 = url+"/"+i;
			File fi = new File(url1);
			File f2 = new File(url+"/"+i+".ts");
			fi.renameTo(f2);
			
			
			
			
		}
		
	}

}
