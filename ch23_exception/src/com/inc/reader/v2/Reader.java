package com.inc.reader.v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	//에러 생성과정 
	//1. bReader가 null임.
	//2. 첫 트라이캐치문을 실행하다가 파일낫파운드에 걸려서 캐치로 넘어감 => 에러검출
	//3. 다음 트라이문으로 넘어갔으나 bReader가 null로 초기화된 상태 그대로이기 때문에 nullPointer에러 발생
	
	
	public void run(String filename) {
		BufferedReader bReader = null; //try문 안에서 선언하면 bReader를 못찾음
		try {
			bReader = new BufferedReader(new FileReader(filename));
		}catch(FileNotFoundException e) {
			//e.printStackTrace(); //개발자에게 어떤 방식으로 예외가 발생했는지 알려주는 코드
			System.out.println(e.getMessage()); //코드2
		}
		
		try {
		String input = bReader.readLine();
		System.out.println(input);
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
