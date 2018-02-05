package com.inc.assignment;

public class Assignment2 {
	public static void main(String[] args) {
		//과제2
		//정수 a, b를 받아서 (a > b) 
		//b가 a의 약수이면 "약수입니다."
		//아니면 "약수가 아닙니다"를 출력하는
		//프로그램을 작성하세요.
		
		int a = 10;
		int b = -5;
		boolean y = a % b == 0;
		
		if(a <= b) {
			System.out.println("a는 b보다 커야합니다");
		}
		else if(y) {
			System.out.println("약수입니다");	
		}
		else {
			System.out.println("약수가 아닙니다");
		}
		
			
		
		
		
	}
}
