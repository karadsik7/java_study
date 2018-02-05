package com.inc.example;

public class Comparison {

	public static void main(String[] args) {
		// 비교 연산자 
		// > : 크다
		// < : 작다
		// >= : 크거나 같다
		// <= : 작거나 같다
		// == : 같다
		// != : 같지 않다
		
		int age = 15;
		
		boolean isAdult = age >= 20;
		System.out.println(isAdult);
		
		boolean is20 = age == 20;
		System.out.println(is20);
		
		boolean is15 = age == 15;
		System.out.println(is15);
		
		boolean not15 = age != 15;
		System.out.println(not15);
		
		System.out.println(true != true);
		System.out.println('m' == 'm');
		
		
		//실습 : 다음 출력 결과를 예측

		System.out.println(age == 15 == true);
		System.out.println(age == 20 == true);
		System.out.println(age >= 15 == age < 20);
		
		//문자열도 비교할 수 있다.
		System.out.println("flynn" == "flynn");

	}

}
