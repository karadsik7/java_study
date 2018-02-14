package com.inc.calc.v3;

public class CalculatorTest {

	public static void main(String[] args) {
		ScientificCalculator sCalc = new ScientificCalculator();
		sCalc.SetOperand(1, 2);
		sCalc.sum();
		sCalc.view();
		sCalc.setOperand(2);
		sCalc.root();
		sCalc.view();
		
		GraphingCalculator gCalc = new GraphingCalculator();
		
		gCalc.SetOperand(5, 3);
		gCalc.sub();
		gCalc.view();

	}

}
