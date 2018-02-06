package com.inc.example;

public class MethodEx9 {

	public static void main(String[] args) {
		
		//호출과 복귀
		
		a(); // 아래 주석의 과정을 밟고 복귀함
		// recursion(); 무한반복 
		System.out.println(factorial(4));

	}
	
	public static void a() {
		b(); // 1. b메서드가 끝나기 전까지 a를 출력하지 않고 b메서드로 넘어감
			 // 5. a를 출력함
		System.out.println("a");
	}
	
	public static void b() {
		c(); // 2. c메서드가 끝나기 전까지 넘어가지 않음
			 // 4. b를 출력함
		System.out.println("b");
	}
	
	public static void c() {
			// 3. c를 출력함
		System.out.println("c");
	}
	
	// 재귀 메서드
	
	public static void recursion() {
		System.out.println("재귀");
		recursion();
	}
	
	// 재귀 메서드를 이용한 팩토리얼 메서드
	
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		
	}

}
