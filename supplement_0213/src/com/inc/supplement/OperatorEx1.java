package com.inc.supplement;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 연산자
		
		//증감연산자 (++ --)
		
		int i = 0;
		
		
		++i; // 먼저 더해라 그리고 i를 사용
		i--; // i를 먼저 사용한뒤 i를 감소
		
		System.out.println(i++);
		i++;
		System.out.println(i++);
		System.out.println(++i);
		
		int j = 0;
		j = j++; //j의 값이 증가되지 않는다.
		System.out.println(j);
		
		//실습
		
		int x = 10;
		System.out.println(x--);
		System.out.println(--x);
		
		
		

	}

}
