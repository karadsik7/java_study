package com.inc.calculator;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println(add(10, 20));
		System.out.println(minus(10, 20));
		System.out.println(multiply(10, 20));
		System.out.println(divide(10, 20));
		System.out.println(remain(10, 20));
		System.out.println(factorial(5));
		

	}

	
	public static double add(double left, double right) {
		return left + right;
	}
	
	// 실습 : 사칙연산 메서드 정의
	
	// 빼기
	
	public static double minus(double left, double right) {
		return left - right;
	}
	
	//곱하기
	
	public static double multiply(double left, double right) {
		return left * right;
	}
	
	//나누기
	
	public static double divide(double left, double right) {
		return left / right;
	}
	
	//나머지
	
	public static double remain(double left, double right) {
		return left % right;
	}
	
	//팩토리얼
	
	public static int factorial(int fac) {
	
		int facSum = 1;
		for(int i = fac; i <= 1; i--) {
			 facSum *= fac;
			 
		}
		
		return facSum;
		
		}

		
		
	}
	
	

