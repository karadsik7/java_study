package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx6 {
	public static void main(String[] args) {
		//과제
		//1.사용자로부터 다섯개의 정수를 입력 받는다.
		//2.정수를 입력받으면 절대값을 리턴하는 메소드를 정의한다.
		//3.방금 만든 메소드를 사용하여 사용자가 입력한 5개의 숫자의
		//  절대값을 출력한다.
		//ex) 
		//(입력)
		//   -10 15 -2 10 -100
		//(출력)
		//   10 15 2 10 100
		
		//hint1 : int
		//hint2 : int
		
		//1. 사용자로부터 다섯개의 정수를 입력받는다.
		
		
		Scanner scanner = new Scanner(System.in);
		
		int[] number = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요.");
			number[i] = scanner.nextInt();
		}
		
		for(int i : absol(number)) {
			System.out.println(i);
		}
		
	}
	// 절대값으로 환원하는 메서드
	public static int[] absol(int[] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				numbers[i] = -numbers[i];
			}
		}
		return numbers;
		
	}
	
}
