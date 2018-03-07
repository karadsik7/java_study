package com.inc.file;

import java.io.File;

public class FileEX {

	public static void main(String[] args) {
		
		//File은 해당 파일에 대한 정보만 저장 (데이터 저장X = 주소값 링크)
		//파일객체 생성
		File memo = new File("memo.txt");
		
		File memo1 = new File("memo1.txt");
		
		File text = new File("src/com/inc/file/text.txt");
		//결과는 같음
		File text1 = new File("src/com/inc/file", "text.txt");
		
		//exist() 메서드 : 실제 파일이 존재하는지 체크
		
		System.out.println(memo.exists());
		System.out.println(memo1.exists());
		System.out.println(text.exists());
		System.out.println(text1.exists());
		System.out.println("----------");
		//getAbsoulutePath() : 절대경로 반환
		System.out.println(memo.getAbsolutePath());
		System.out.println(text.getAbsolutePath());
		System.out.println("---------------");
		//모드변경 : 읽기 쓰기 모드
		memo1.setReadable(false);
		System.out.println(memo1.canRead());
		
		
		System.out.println("-----------");
		//폴더 
		
		File inc = new File("src/com/inc");
		System.out.println(inc.exists());
		System.out.println(inc.isDirectory());
		System.out.println(inc.isFile());
		
		
		
	}

}
