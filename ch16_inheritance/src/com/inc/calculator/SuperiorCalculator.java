package com.inc.calculator;

public class SuperiorCalculator extends DivideCalculator{
	
	static final double PI = 3.14;
	
	double mul() {
		return memory1 * memory2;
	}
	
	double lengthOfCircle() {
		return 2 * PI * memory1;
	}
	
	double areaOfCircle() {
		return PI * memory1 * memory1;
	}
	
}
