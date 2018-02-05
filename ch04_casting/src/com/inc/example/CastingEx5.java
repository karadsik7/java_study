package com.inc.example;

public class CastingEx5 {

	public static void main(String[] args) {
		//3. boolean을 제외한 나머지 자료형 간에는 형변환이 가능하다.
		// byte, short, int, long, float, double, char => 가능
		// (char도 내부적으로 숫자로 저장되기 때문)
		
		char char1 = 'A';
		
		double double1 = char1;
		System.out.println(double1);
		float float1 = char1;
		System.out.println(float1);
		long long1 = char1;
		System.out.println(long1);
		int int1 = char1;
		System.out.println(int1);
		short short1 = (short)char1;
		System.out.println(short1);
		byte byte1 = (byte)char1;
		System.out.println(byte1);
		
		//byte는 1바이트 char는 2바이트 이지만
		//char는 0~65535, byte는 -128 ~ 128까지를 저장하기 때문에
		//의도치 않은 결과 방지를 위해 명시적 형변환을 진행한다.
		
		char charFromByte = (char)byte1;
		System.out.println(charFromByte);
		System.out.println((char)short1);
		System.out.println((char)int1);
		System.out.println((char)long1);
		System.out.println((char)float1);
		System.out.println((char)double1);

		

	}

}
