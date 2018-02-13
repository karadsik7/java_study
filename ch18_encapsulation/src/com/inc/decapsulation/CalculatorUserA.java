package com.inc.decapsulation;

public class CalculatorUserA {

	public static void main(String[] args) {
		
		//올바른 사용자
		
		IntCalculator iCalc = new IntCalculator();
		iCalc.run();
		
		DoubleCalculator dCalc = new DoubleCalculator();
		dCalc.run();

	}

}
