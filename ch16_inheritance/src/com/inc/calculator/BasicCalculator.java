package com.inc.calculator;

public class BasicCalculator {
	
	double memory1, memory2;
	
	void setMemory(double memory1, double memory2) {
		this.memory1 = memory1;
		this.memory2 = memory2;
	}
	
	double sum() {
		return this.memory1 + this.memory2;
	}
	
	double sub() {
		return this.memory1 - this.memory2;
	}

}
