package com.inc.calc.v4;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//Calculator cc = new Calculator(); // 추상클래스는 인스턴스 선언이 불가능
		
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
