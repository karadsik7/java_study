package com.inc.member;

public class BuildingEx4 {

	//floor의 값을 고정시키고 절대 바꾸고 싶지 않을 경우엔?
	
	//1. 일단 class의 floor값을 10으로 초기화해보자.
	
	String name; 
	int year; 
	int floor = 10; // 층의 값을 10을 기본값으로 초기화
	
	void getInfo() { //멤버, 인스턴스 메서드
		System.out.printf("건물명 : %s, 준공년도 : %d, 층 : %d\n", name, year, floor);
	}
	
	
	
	
	
}
