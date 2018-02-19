package com.inc.seats;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		String[] seats = {"박태환", "김연아", "손연재", "윤성빈"};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 입력해주세요");
			char alphabet = scanner.nextLine().charAt(0);
			System.out.println("해당 좌석에 앉은 고객은");
			
			//예외가 발생하면
			//1. 사용자가 이해불가능한 에러문구가 콘솔에 뜬다.
			//2. 프로그램이 종료된다.
			System.out.println(seats[alphabet-65] + "님 입니다."); //알파벳 대문자로 A~D까지만 정확히 입력하지
			//않으면 예외가 발생
			
			
		}
		
		
		
		
		
	}
}
