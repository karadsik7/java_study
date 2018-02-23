package com.inc.string;

import java.util.Scanner;

public class StringEx6 {
	public static void main(String[] args) {
		// 문자에서 인덱스를 이용해 문자열 잘라내기
		String phoneNumber = "010-1234-5678";
		System.out.println(phoneNumber.substring(4));
		System.out.println(phoneNumber.substring(4, 8));
		System.out.println(phoneNumber.substring(2, 5));
		
		//포함된 문자열을 이용해 잘라내기
		System.out.println(phoneNumber.substring(0, phoneNumber.indexOf("-")));
		System.out.println(phoneNumber.substring(phoneNumber.indexOf("-"), phoneNumber.lastIndexOf("-")));
		System.out.println(phoneNumber.substring(phoneNumber.lastIndexOf("-") + 1));
		
		
		//실습 : 어떤 길이의 핸드폰 번호가 입력되더라도 가운데 번호만
		//출력하는 프로그램을 작성하시오.
		//조건 : '-'은 두개밖에 없다고 가정함 ex) xxxx-xxxx-xxxx
		Scanner scanner = new Scanner(System.in);
		System.out.println("폰번호를 입력하세요.");
		String number = scanner.nextLine();
		System.out.println(number.substring(number.indexOf("-") + 1, number.lastIndexOf("-")));
		
		//실습1 : 사용자로부터 이메일을 입력받고 @ 이전까지를 출력하세요.
		System.out.println("이메일을 입력하세요.");
		String email = scanner.nextLine();
		System.out.println(email.substring(0, email.lastIndexOf("@")));
		
		//실습2 : @뒤의 도메인만 출력
		
		System.out.println(email.substring(email.indexOf("@") + 1));
		
		
	}
}
