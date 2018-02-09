package com.inc.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		//Calculator calc = new Calculator();
		//System.out.println(calc.add(10, 20)); 
		//위와 같은 방법은 객체를 생성하기 때문에 메모리를 차지함
		
		System.out.println(Calculator.add(10, 20));
		System.out.println(Calculator.areaCircle(5));
		
		//객체를 생성하지 않고 클래스에 접근해 연산
	}

}
