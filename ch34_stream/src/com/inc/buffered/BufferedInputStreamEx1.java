package com.inc.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx1 {
	
	public static void main(String[] args) {
		
		//버퍼스트림 => 한번에 가져오는 양 증가 => 읽기쓰기 횟수 감소 => 속도 증가
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream("memo.txt");
			bis = new BufferedInputStream(fis);
			StringBuffer sb = new StringBuffer();
			while(bis.available() > 0) {
				sb.append((char)bis.read());
			}
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
