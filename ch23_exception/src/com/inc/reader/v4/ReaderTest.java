package com.inc.reader.v4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) {
		
		//throw를 통해서 에러를 야기한 호출한 메서드로 책임을 돌림
		
		//메인메서드에서 컴파일에러가 걸리므로 여기서 예외처리
		
		Reader reader = new Reader();
		System.out.println("파일 읽기를 시작합니다.");
		//reader.run("memo.txt");
		try {
			reader.run("memo1.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("파일 읽기가 완료됐습니다.");

	}

}
