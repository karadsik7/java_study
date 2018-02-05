package com.inc.example;

public class CastingEx6 {

	public static void main(String[] args) {
		//형변환을 왜 알아야 하는가?
		//1. 데이터 간에 연산 도중 의도치 않은 결과(데이터의 손실)을 방지하기 위해
		
		//int형 데이터를 서로 연산하면 결과는 int다.
		int int1 = 5/2;
		System.out.println(int1);
		
		double double1 = 5/2;
		System.out.println(double1);
		
		double double2 = (double).05/2;
		System.out.println(double2);
		
		//2. 객체의 형변환 - 이것은 해당 챕터에서
		

	}

}
