package com.inc.calc.v3;

public class Calculator {
	
	static final double PI = 3.14;

	int left, right, radius;

	double result;
	
	public void setOperand(int radius) {
		this.radius = radius;
	}
	
	public void SetOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		result = this.left + this.right;
	}
	
	public void sub() {
		result = this.left - this.right;
	}
	
	public void view() {//데드코드
	};

}
