package com.inc.reader.v5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	//throw를 이용해서 예외 처리
	//throw를 통해서 에러를 야기한 호출한 메서드로 책임을 돌림
	public void run(String filename) throws FileNotFoundException, IOException{
			BufferedReader bReader = new BufferedReader(new FileReader(filename));
			String input = bReader.readLine();
			System.out.println(input);
		
		
		
	}

}
