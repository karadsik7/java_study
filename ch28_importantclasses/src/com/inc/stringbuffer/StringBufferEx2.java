package com.inc.stringbuffer;

import java.util.Scanner;

public class StringBufferEx2 {

	public static void main(String[] args) {
		//사용자로부터 단어를 입력받는데 x를 입력할 때까지 계속 단어를 잇는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		StringBuffer input = new StringBuffer();
		while(true) {
			System.out.println("단어를 입력해주세요. x를 누르면 종료");
			String tmp = scanner.nextLine();
			if("x".equals(tmp)) {
				break;
			}
			input.append(tmp + "\n");
		}
		
		System.out.println(input);
		//메모리 절약가능
		
		
	}

}
