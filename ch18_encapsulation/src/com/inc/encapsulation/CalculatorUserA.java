package com.inc.encapsulation;

public class CalculatorUserA {

	public static void main(String[] args) {
		
		//올바른 사용자
		
		IntCalculator iCalc = new IntCalculator();
		iCalc.run(); // IntCalculator에서 제공하는 함수가 run()밖에 없음.
		//따라서 사용자는 run()밖에 못돌리니 이것만 쓰게 유도할 수 있음.
		
		/*DoubleCalculator dCalc = new DoubleCalculator();
		dCalc.run();
*/
	}

}
