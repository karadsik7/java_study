package com.inc.seats;

import java.util.Scanner;

public class ExceptionEx2 {
	public static void main(String[] args) {
		
		String[] seats = {"박태환", "김연아", "손연재", "윤성빈"};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 입력해주세요");
			char alphabet = scanner.nextLine().charAt(0);
			
			
			//코드로 예외를 막는것의 문제점
			/*1. 코드가 많아질 우려가 있다.(가독성 해침)
			2. 예외에 대한 책임을 분산할 수 없다.*/
			if(alphabet < 'A' || alphabet > 'D') {
				System.out.println(alphabet + "은 잘못된 좌석입니다.");
				continue;
			}
			
			System.out.println("해당 좌석에 앉은 고객은");
			
			System.out.println(seats[alphabet-65] + "님 입니다."); 
			
			
		}
		
		
		
		
		
	}
}
