package com.inc.seats;

import java.util.Scanner;

public class ExceptionEx4 {
	public static void main(String[] args) {
		
		String[] seats = {"박태환", "김연아", "손연재", "윤성빈"};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 입력해주세요");
			char alphabet = scanner.nextLine().charAt(0);
			
			//예외처리의 정석은 예외가 발생할만한 코드를 try catch로 가독성을 높이고
			//사용자에겐 이해할 수 있을만한 경고문을 날리는 것
			System.out.println("해당 좌석에 앉은 고객은");
			try {
			System.out.println(seats[alphabet-65] + "님 입니다."); 
			}
			catch(ArrayIndexOutOfBoundsException e) 
			//{e.printStackTrace();}
			{
				System.out.println("잘못된 좌석을 입력하셨습니다." + alphabet);
				}
		}
		
		
		
		
	}
			
		
		
		
		
		
		
	}

