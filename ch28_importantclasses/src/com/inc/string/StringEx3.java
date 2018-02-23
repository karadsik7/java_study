package com.inc.string;

import java.util.Scanner;

public class StringEx3 {
	
	public static void main(String[] args) {
		
		//스트링의 길이를 알려주는 메서드
		
		String str = "hello";
		System.out.println(str.length());
		
		//사용자의 입력을 제한하는 곳에 활용가능 (유효성 검사)
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("아이디를 입력해주세요.");
		String id = scanner.next();
		System.out.println("비밀번호를 입력하세요.");
		String pass = scanner.next();
		
		loginAlert(id, pass);
		*/
		System.out.println("==========================");
		
		
		//charAt 사용하기
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		for(int i = 3; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("**********");
		
		//실습 : 사용자로부터 문자열을 입력받은 뒤 맨 마지막 문자만 출력하세요.
		
		System.out.println("마지막 글자를 출력할 문자열을 입력하세요");
		String userString = scanner.next();
		System.out.println(userString.charAt(userString.length() - 1));
		
		
	}
	
	private static void alert(String id) {
		if(id.length() >= 5 && id.length() <= 10) {
			System.out.println("사용할 수 있습니다.");
		}else {
			System.out.println("5글자 이상 10글자 이하로 입력하세요.");	
		}
	}
	
	private static void loginAlert(String id, String pass) {
		if(id.length() < 5 || id.length() > 10) {
			System.out.println("아이디 사용불가능.");
		}
		else {
			System.out.println("아이디 사용 가능");
		}
		if(pass.length() >= 8 && pass.length() < 13) {
			System.out.println("패스워드 사용가능");
		}
		else {
			System.out.println("패스워드 사용불가능");
		}
		
	}
	
	
}
