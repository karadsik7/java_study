package com.inc.calculator;

public class Calculator {
	
	static final double PI = 3.14; //모든 인스턴스가 공유해야하는 값, 그리고 불변해야함
	// final 변수는 관례상 대문자로
	
	
	
	static double add(double a, double b) {
		return a + b;
	}
	
	static double sub(double a, double b) {
		return a - b;
	}
	
	static double mul(double a, double b) {
		return a * b;
	}
	
	static double div(double a, double b) {
		return a / b;
	}
	
	static double lengCircle(double r) {
		return 2 * PI * r;
	}
	
	static double areaCircle(double r) {
		return PI * r * r;
	}
	
	
	
	
	
}
