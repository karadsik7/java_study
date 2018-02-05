package com.inc.example;

public class CastingEx1 {

	public static void main(String[] args) {
		//상수 = 변하지 않는 수 = 데이터
		//변수에도 자료형이 있지만 상수에도 자료형이 있다.
		//'A'라는 데이터의 자료형은? char
		//"flynn"이라는 데이터의 자료형은? String
		//100이라는 데이터의 자료형은? int
		//100L이라는 데이터의 자료형은? long
		//100F라는 데이터의 자료형은? float
		//99.99라는 데이터의 자료형은? double
		
		byte b1 = 100;
		System.out.println(b1);
		//b1 변수의 자료형은 byte이고, 100이라는 데이터(상수)의 자료형은 int임에도
		//불구하고 문제 없이 저장됨.
		
		int i1 = b1;
		System.out.println(i1);
		//마찬가지로 b1에 들어있는 데이터는 byte이고
		//이를 int형 변수인 i1에 저장하더라도 저장 및 출력이 됨.
		
		//이는 형변환(casting)때문이다.
		
	}

}
