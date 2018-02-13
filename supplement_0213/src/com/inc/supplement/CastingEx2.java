package com.inc.supplement;

public class CastingEx2 {

	public static void main(String[] args) {
			//명시적 캐스팅
		
		// 큰 자료형 데이터를 작은 변수형으로 형변환 => 데이터의 손실 가능성 존재
		
		double d = 12314143113515135135.789789789798798;
		System.out.println(d);
		float f = (float)d; //손실을 감안하고 강제 캐스팅
		System.out.println(f); //자료의 손실 발생
		
		long l = (long)f;
		System.out.println(l);
		
		int i = (int)l;
		System.out.println(i);
		
		i = 214748364;
		
		short s = (short)i;
		System.out.println(s);
		
		byte b = (byte)s;
		System.out.println(b);
		
		char c = (char)i;
		System.out.println(c);
		
		char c1 = (char)65;
		System.out.println(c1);
		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
