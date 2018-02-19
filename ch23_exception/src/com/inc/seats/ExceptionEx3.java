package com.inc.seats;

import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {
		
		String[] seats = {"박태환", "김연아", "손연재", "윤성빈"};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 입력해주세요");
			char alphabet = scanner.nextLine().charAt(0);
			
			
			//모든 예외를 미리 막는 것이 불가능하다면 예외가 발생했을 때 처리하는 방법이 기본
			//try와 catch
			//try안에 예외 발생가능 코드를 집어넣고 catch의 괄호안에 발생가능한 예외를 파라미터로 받음
			System.out.println("해당 좌석에 앉은 고객은");
			try {
			System.out.println(seats[alphabet-65] + "님 입니다."); 
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{e.printStackTrace();}
		
		}
		
		
		
		
	}
			
		
		
		
		
		
		
	}

