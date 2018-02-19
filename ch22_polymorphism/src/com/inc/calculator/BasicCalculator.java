package com.inc.calculator;

public class BasicCalculator {
	
	private double memory1, memory2;
	
	public void setMemory(double memory1, double memory2) {
		this.memory1 = memory1;
		this.memory2 = memory2;
	}
	
	public double sum() {
		return this.memory1 + this.memory2;
	}
	
	public double sub() {
		return this.memory1 - this.memory2;
	}

}
