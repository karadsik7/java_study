package com.inc.calc.v3;

public class ScientificCalculator extends Calculator{

	
	
	public void root() {
		result = Math.sqrt(this.radius);
	}
	
	@Override
	public void view() {
		System.out.printf("결과 : %f\n", result);
	}
	
	
	
}
