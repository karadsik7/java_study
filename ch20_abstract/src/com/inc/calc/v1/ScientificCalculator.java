package com.inc.calc.v1;

public class ScientificCalculator {

	private static final double PI = 3.14;
	
	private int left, right, radius;
	
	private double result;
	
	
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
	
	public void root() {
		result = Math.sqrt(this.radius);
	}
	
	public void view() {
		System.out.printf("결과 : %f\n", result);
	}
	
	
	
	
}
