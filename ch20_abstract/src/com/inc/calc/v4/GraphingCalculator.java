package com.inc.calc.v4;

public class GraphingCalculator extends Calculator{

	
	
	
	private void graphing() {
		System.out.println("그래프 생성중...");
	}

	
	@Override
	public void view() {
		graphing();
		System.out.printf("****%f****\n", result);
	}
	
	

	
	
	
}
