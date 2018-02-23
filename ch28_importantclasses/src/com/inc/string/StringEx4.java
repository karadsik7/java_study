package com.inc.string;

import java.util.Scanner;

public class StringEx4 {
	public static void main(String[] args) {
		//indexOf
		
		String str = "apple banana coconut";
		System.out.println(str.indexOf("p"));
		System.out.println(str.indexOf("z") != -1);
		System.out.println(str.indexOf(" "));
		System.out.println(str.lastIndexOf(" "));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String input = scanner.nextLine();
		//실습 : if문을 활용해서 공백을 입력했으면 "공백을 입력했습니다"
		//아니면 "감사합니다"를 출력하세요.
		
		if(input.indexOf(" ") != -1) {
			System.out.println("공백을 입력했습니다.");
		}else {
			System.out.println("감사합니다");
		}
		
		
		
	}
}
