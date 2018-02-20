package com.inc.reader.v5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderTest {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		//여기서도 예외처리하기 싫다면?
		//jvm이 처리함 => 언체크 예외일 경우 자동으로 jvm이 처리하지만
		//체크 예외일 경우에도 jvm까지 throw하게되면 jvm이 e.printstackTrace로 처리함
		
		//그렇다면 예외를 호출한 곳으로 던져서 처리를 강제하는 이유가 무엇인가?
		//1. 귀찮아서? 처리할줄 몰라서? => 초급개발자
		//2. 호출한 쪽에서 예외 처리를 해야 한다고 생각했기 때문
		//  => 호출한 쪽에서 원하는 예외처리가 가능하다. 미룬게 아님
		
		Reader reader = new Reader();
		System.out.println("파일 읽기를 시작합니다.");
		//reader.run("memo.txt");
		
			reader.run("memo1.txt");
		
		
		System.out.println("파일 읽기가 완료됐습니다.");

	}

}
