package com.inc.example;

public class NumberEx2 {

	public static void main(String[] args) {
		
		//float의 경우 부동소숫점 방식이라는 숫자 저장 방식을 사용하고 있기 때문에
		//더 큰 숫자도 저장 가능
		
		float f1 = 2147483648f;
		//2147483560
		System.out.println(f1);
		
		float f2 = 12345678901234567890123456789.123456789f;
		System.out.println(f2);
		//12345678900000000000000000000000
		
		double d1 = 12345678901234567890123456789.123456789;
		System.out.println(d1);
		//12345678901234560000000000000000
		
		
		
		//부동소숫점 방식의 장점은 큰 숫자와 실수를 저장할 수 있다는 장점이 있지만
		//정확도가 떨어질 수 있다는 단점이 있다.
		
		
		

	}

}
