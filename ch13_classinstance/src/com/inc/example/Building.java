package com.inc.example;

	// 설계도 작성 = 클래스 선언

public class Building {
	String name; // 건물의 이름
	
	int year; // 건물의 연식
	
	public void getInfo() {
		System.out.printf("건물명 : %s\t연식 : %d\n", name, year);
	}
}
