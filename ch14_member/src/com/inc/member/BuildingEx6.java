package com.inc.member;

public class BuildingEx6 {

	//floor의 값을 고정시키고 절대 바꾸고 싶지 않을 경우엔?
	
	//방법 1. 일단 class의 floor값을 10으로 초기화해보자.
	
	//방법 2. 인스턴스의 사용중에 변하는 일이 없도록 클래스 변수인 final을 사용해서 고정해본다.
	
	//방법 3. 클래스 변수 = 모든 객체들이 공유하는 변수 
	//클래스 변수의 장점
		// 인스턴스는 메모리를 차지하는데 반해서 클래스는 그렇지 않음
	
	String name; 
	int year; 
	static int floor = 10; // 클래스 변수인 floor의 값을 10이라는 기본값을 줌
	
	void getInfo() { //멤버, 인스턴스 메서드
		System.out.printf("건물명 : %s, 준공년도 : %d, 층 : %d\n", name, year, floor);
	}
	
	
	
	
	
}
