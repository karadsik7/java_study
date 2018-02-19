package com.inc.calculator;

public class DivideCalculator extends BasicCalculator{

	private double memory1, memory2;
	
	public void setMemory(double memory1, double memory2) {
		this.memory1 = memory1;
		this.memory2 = memory2;
	}
	
	
	public double div(){
		return this.memory1 / this.memory2;
	}
	
	
}
