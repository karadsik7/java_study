package com.inc.example;

public class CastingEx2 {

	public static void main(String[] args) {
		//형변환의 규칙
		// 1. byte변수에 int형 데이터를 저장할 때 데이터의 크기가 -128 ~ 127이면
		//데이터를 자동으로 byte로 형변환한다.(short도 같은 원리로 동작)
		byte b1 = 100;
		//byte b2 = 128;
		
		short s1 = 32767;
		//short s2 = 32768;
		
		//그러나 int형 변수에 들어있는 범위 내의 숫자는 자동으로 형변환하지 않는다.
		int i1= 20;
		//byte b3 = i1;
		
		

	}

}
