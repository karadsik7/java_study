package com.inc.supplement;

public class OperatorEx2 {

	public static void main(String[] args) {
		//연산자
		
		//복합대입 연산자 +=, -=, *=, /=, %=
		// 연산 우선순위는 5개 모두 동일함 왜? 어차피 자기자신을 연산하는 것이므로
		int i = 0;
		i += 1;
		// i = i + 1; 과 같음
		
		//실습
		
		int a = 10;
		
		a -= a;
		
		a += a;
		
		System.out.println(a);
		
		//실습
		int b = 10;
		b %= 5; // b를 5로 나눈 나머지
		System.out.println(b);
		
		b %= b; // b를 b로 나눈 나머지
		
		
	}

}
