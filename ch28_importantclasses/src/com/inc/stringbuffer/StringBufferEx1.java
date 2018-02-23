package com.inc.stringbuffer;

import java.util.Scanner;

public class StringBufferEx1 {

	public static void main(String[] args) {
		//사용자로부터 단어를 입력받는데 x를 입력할 때까지 계속 단어를 잇는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		while(true) {
			System.out.println("단어를 입력해주세요. x를 누르면 종료");
			String tmp = scanner.nextLine();
			if("x".equals(tmp)) {
				break;
			}
			input += tmp + "\n";
		}
		
		System.out.println(input);
		
		//이렇게하면 input에 계속 그전의 객체가 쌓이게 되어 메모리가 위험해질 수 있음.
		
		
		
	}

}
