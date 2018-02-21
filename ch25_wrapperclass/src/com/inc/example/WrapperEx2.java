package com.inc.example;

public class WrapperEx2 {

	public static void main(String[] args) {
		
		//wrapper class를 사용하는 이유
		
		//1. Wrapper 클래스가 제공해주는 다양한 메서드를 활용
		
		Integer i = 128;
		System.out.println(i.intValue());
		System.out.println(i.byteValue()); //자동형변환
		
		System.out.println(i.BYTES); //차지하는 메모리 출력
		
		System.out.println("********************");
		
		//숫자 형태의 문자열 -> 숫자
		//Parse = 추출하다
		Integer number = Integer.parseInt("100");
		System.out.println(number + 10);
		
		//숫자를 문자열로
		
		String str = Integer.toString(100);
		System.out.println(str + 10);
		//또는
		System.out.println(number + "");
		
		
		
		
		
	}

}
