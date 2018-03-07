package com.inc.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx1 {
	
	public static void main(String[] args) {
		
		//FileInputStream = 파일 입출력하는 수단 (파일과 프로그램간의 연결고리)
		
		File file2 = new File("memo.txt");
		
		File file = new File("src/com/inc/file/text.txt");
		//없는 파일에 스트림할 수 없으므로
		try {
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			//.read는 숫자형태로 형변환해서 가져오므로 인트에넣고 돌리는데 -1의 의미는 아무것도 데이터가 없는 의미이므로
			//데이터가 끝나는 순간 반복문 끝
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
				
			}
			
			//영어는 정상출력하지만 한글은 2바이트구조이기 때문에 깨짐 => FileReader사용
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			//입출력 예외 잡기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

	
	
	
	

}
