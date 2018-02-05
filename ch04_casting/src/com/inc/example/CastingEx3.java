package com.inc.example;

public class CastingEx3 {

	public static void main(String[] args) {
		// 2. 형변환은 명시적 형변환과 암(묵)시적 형변환이 있으며
		//형변환을 거치게 되면 데이터의 손실이 발생할 수도 있다.
		
		//암시적 형변환(형변환 코드를 적어주지 않아도 jvm이 자동으로 형변환
		//더 큰 범위를 표현할 수 있는 자료형으로 데이터를 형변환
		byte byte1 = 100; // 암시적 형변환 (int -> byte)
		System.out.println(byte1);
		
		short short1 = byte1;
		System.out.println(short1);
		int int1 = short1; 
		System.out.println(int1);
		// byte < short < int 크기므로
		// byte -> short -> int로 jvm에 의해 암시적 형변환이 일어남
		
		long long1 = int1; // int < long 이므로 데이터손실 없이 형변환
		System.out.println(long1);
		
		//----------------------------
		
		float float1 = long1;
		System.out.println(float1);
		//float이 4바이트 long이 8바이트지만 데이터 자체는 
		//float이 더 큰 수를 저장가능하므로 에러가 안뜸
		
		long long2 = 1234567890123456789L;
		
		float float2 = long2;
		System.out.println(float2);
		
		double double1 = float1;
		System.out.println(double1);
		
		double double2 = long2;
		System.out.println(double2);
		
		
		

	}

}
