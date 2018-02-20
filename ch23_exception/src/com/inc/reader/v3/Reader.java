package com.inc.reader.v3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	//예외를 하나로 합치자
	//이래도 문제가 없는 이유는 try의 첫줄에서 예외가 발생하면 try의 2번째줄부턴 실행될 의미가 없기 때문에
	//바로 뒷줄은 실행조차안하고 캐치로넘어감
	
	public void run(String filename) {
		BufferedReader bReader = null; 
		try {
			bReader = new BufferedReader(new FileReader(filename));
			String input = bReader.readLine();
			System.out.println(input);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage()); 
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		//항상 자식예외를 먼저쓰고 부모예외를 아랫줄로 쓰자.
		
	}

}
