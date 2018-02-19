package com.inc.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//자식 인스턴스 -> 부모 인스턴스 (암시적 형변환)
		Object obj = new SuperiorCalculator();
		BasicCalculator bc = new SuperiorCalculator();
		DivideCalculator dc = new SuperiorCalculator();
		//MultiplyCalculator mc = new SuperiorCalculator(); 상속관계가 아니기때문
		
		
		//명시적 캐스팅은 되나 실행 불가능
		/*SuperiorCalculator sc2 = (SuperiorCalculator)new Object();
		sc2.setMemory(1, 2);
		System.out.println(sc2.div());
		sc2.setMemory(5);
		System.out.println(sc2.areaOfCircle());*/
		
		
		DivideCalculator dc1 = new DivideCalculator();
		dc1.setMemory(10, 20);
		System.out.println(dc1.div());
		
		BasicCalculator dc2 = new DivideCalculator();
		dc2.setMemory(10, 20);
		//System.out.println(dc2.div());
		//BasicCalculator에 div라는 기능이 없기 때문에 형변환해도 사용이 불가능함
		
		DivideCalculator dc3 = (DivideCalculator)dc2;
		dc3.setMemory(5, 1);
		System.out.println(dc3.div());
		System.out.println("**");
		//다시 원래 클래스로 형변환하면 객체가 활성화됨
		
		SuperiorCalculator cal = new SuperiorCalculator();
		
		cal.setMemory(1, 2);
		System.out.println(cal.sub());
		cal.setMemory(5);
		System.out.println(cal.areaOfCircle());
		

	}

}
