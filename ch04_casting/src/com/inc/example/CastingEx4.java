package com.inc.example;

public class CastingEx4 {

	public static void main(String[] args) {
		// 2. 형변환은 명시적 형변환과 암(묵)시적 형변환이 있으며
		//형변환을 거치게 되면 데이터의 손실이 발생할 수도 있다.
		
		//명시적 형변환은 형변환 코드를 적어야만 컴파일이 가능하다
		//더 작은 범위를 표현할 수 있는 자료형으로 '데이터를' 형변환
		
		double double1 = 123456789.123456789;
		System.out.println(double1);
		
		float float1 = (float)double1;
		System.out.println(float1);
		//데이터의 손실을 감안하더라도 강제로 데이터가 작은 float으로 형변환
		
		long long1 = (long)float1;
		System.out.println(long1);
		//이 경우에는 데이터의 손실이 발생하지 않았지만 운좋게 발생하지 않은 것
		
		float float2 = 123456789000000000000000000f;
		long long2 = (long)float2;
		System.out.println(long2);
		//확연히 데이터의 손실이 발생
		
		long long3 = 2147483648L;
		int int1 = (int)long3;
		System.out.println(int1);
		
		short short1 = (short)int1;
		System.out.println(short1);
		
		
		short short2 = 128;
		byte byte1 = (byte)short2;
		System.out.println(byte1);
		
				
	}

}
