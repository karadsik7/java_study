package com.inc.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("memo2.txt");
			String str = "동해물과 백두산이 마르고 닳도록";
			byte[] strToByte = str.getBytes();
			for(byte i : strToByte) {
				fos.write(i);
			}
			//똑같은 기능 (파라미터로 바이트배열도 받아옴)
			fos.write(strToByte);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	
	
	
	

}
