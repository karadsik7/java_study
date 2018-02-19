package com.inc.calculator;

public class SuperiorCalculator extends DivideCalculator{

	private double memory1, memory2;
	
	private static final double PI = 3.14;
	
	public void setMemory(double memory1, double memory2) {
		this.memory1 = memory1;
		this.memory2 = memory2;
	}
	
	public double mul(){
		return this.memory1 + this.memory2;
	}
	
	
	public void setMemory(double memory1) {
		this.memory1 = memory1;
	}
	
	public double lengthOfCircle() {
		return 2 * PI * this.memory1;
	}
	
	public double areaOfCircle() {
		return PI * this.memory1 * this.memory1;
	}
	
}
