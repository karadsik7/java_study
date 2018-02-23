package com.inc.string;

import java.util.Scanner;

public class StringEx5 {
	public static void main(String[] args) {
		
		//실습 : 사용자로부터 이메일을 입력받되 @가 없으면 다시 입력받아라
		Scanner scanner = new Scanner(System.in);
		System.out.println("이메일을 입력하세요.");
		String email = scanner.nextLine();
		while(email.indexOf("@") == -1) {
				System.out.println("올바른 이메일을 입력하세요.");
				email = scanner.nextLine();
		}
		System.out.println(email);
		System.out.println("****************");
		
		//스트링에 실수로 앞뒤로 공백을 넣었다거나 하는경우 공백을 제외하고 반환하기
		
		String msg = "            app    le  ";
		System.out.println(msg);
		msg = msg.trim();
		System.out.println(msg);
		
		
	}
}
