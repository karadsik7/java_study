package com.inc.supplement;

public class CastingEx1 {

	public static void main(String[] args) {
		
		// 캐스팅
		
		// 암시적 캐스팅(묵시적 캐스팅)
		// 작은 자료형을 큰 자료형에 담을 때 데이터의 손실이 없으므로 자동으로 캐스팅한다.
		
		byte b = 10; // 인트인 10은  127보다 작은 수이므로 10을 자동으로 바이트로 캐스팅함
		short s = b; // 바이트이므로 쇼트안에 무조건 들어가므로 암시적 캐스팅
		
		int i = s;
		long l = i;
		
		float f = l;
		double d = f;
		
		
		char c = 'A';
		int i2 = c; //문자의 경우도 숫자로 저장되므로 들어가짐
		
		// short s2 = c; // 자료를 저장하는 방식이 쇼트는 첫번째가 부호비트이므로 그릇이 더 작아서 못들어감
		
		
		
		
		
		

	}

}
