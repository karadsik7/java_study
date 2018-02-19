package com.inc.seats;

import java.util.Scanner;

public class ExceptionEx5 {
	public static void main(String[] args) {
		
		String[] seats = {"박태환", "김연아", "손연재", "윤성빈"};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 입력해주세요");
			char alphabet = scanner.nextLine().charAt(0);
			
			System.out.println("해당 좌석에 앉은 고객은");
			try {
			System.out.println(seats[alphabet-65] + "님 입니다."); 
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e.getMessage()); //번지수 표시
				System.out.println("-----------");
				System.out.println(e.toString()); //예외의 간단한 정보
				}
		}
		
		
		
		
	}
			
		
		
		
		
		
		
	}

