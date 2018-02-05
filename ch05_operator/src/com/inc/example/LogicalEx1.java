package com.inc.example;

public class LogicalEx1 {

	public static void main(String[] args) {
		// 논리연산자 -> 
		// && : 좌항과 우항이 모두 true이면 true를 반환, 하나라도 false면 false를 반환
		// || : 좌항과 우항중 하나라도 true면 true 둘다 false여야만 false
		// !  : true면 false, false면 true를 반환(단항 연산자)
		
		boolean and1 = true && true;
		boolean and2 = true && false;
		boolean and3 = false && true; //&&연산자기 때문에 뒤의 true와 false는 데드코드
		boolean and4 = false && false;
		System.out.println(and1);
		System.out.println(and2);
		System.out.println(and3);
		System.out.println(and4);
		
		
		System.out.println("-----------");
		
		boolean or1 = true || true;
		boolean or2 = true || false;
		boolean or3 = false || true ;
		boolean or4 = false || false;
		
		System.out.println(or1);
		System.out.println(or2);
		System.out.println(or3);
		System.out.println(or4);
		
		System.out.println("----------------");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println("----------------");
		// 연산자가 두 개 이상일 경우
		System.out.println(true && true && false);
		System.out.println(true && false && true);
		System.out.println(false && true && true);
		
		System.out.println(true || false || false);
		System.out.println(false || true || false);
		System.out.println(false || false || true);
		
		//실습 : 결과를 예측
		System.out.println(true && true && !true && true);
		System.out.println(false || false || !false || true);
		

	}

}
