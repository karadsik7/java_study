package com.inc.calc.v1;

public class GraphingCalculator {

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
	
	private void graphing() {
		System.out.println("그래프 생성중...");
	}
	
	public void view() {
		graphing();
		System.out.printf("*** %f ***\n", result);
	}
	
	
	
	
}
