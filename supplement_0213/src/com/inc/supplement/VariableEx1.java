package com.inc.supplement;

public class VariableEx1 {

	public static void main(String[] args) {
		
		//변수의 기본자료형, 참조자료형
		
		byte b = 127;
		short s = 32767;
		int i = 214748364;
		long l = 92233720368547758L; //롱형인걸 알기위해 대문자L을 붙임
		long ln = Long.MAX_VALUE;
		System.out.println(ln);
		float f = 3.14f; //f를 붙이는 이유 소수는 기본형이 더블이기때문
		double d = Double.MAX_VALUE;
		System.out.println(d); //굉장히 큰 수를 저장할 수 있지만 정확도가 떨어짐
		//이유 : 부동소숫점 방식
		
		char c = 'A';
		boolean bool = false;
		
		
		String str = "abcd"; //변수형의 색깔만 봐도 기본자료형이 아닌 것을 알 수 있음. => 참조자료형
		
		
		
		
		
		

	}

}
