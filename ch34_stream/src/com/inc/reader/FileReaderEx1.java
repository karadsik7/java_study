package com.inc.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
	
	public static void main(String[] args) {
		
		//FileReader와 누수처리
		
		FileReader fr = null;
		try {
			fr = new FileReader("src/com/inc/file/text.txt");
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
