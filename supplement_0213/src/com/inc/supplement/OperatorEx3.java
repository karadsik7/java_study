package com.inc.supplement;

public class OperatorEx3 {

	public static void main(String[] args) {
		//논리연산자 && || !
		
		boolean and1 = true && true; //좌항과 우항이 모두 boolean이어야함
		boolean and2 = true && false;
		boolean and3 = and1 && and2;
		
		boolean or1 = true || true;
		boolean or2 = true || false;
		boolean or3 = and3 || and2;
		
		//실습 : 결과값은?
		
		boolean mix = false || false || false && false && true && true;
		System.out.println(mix);
		
		
		
		
		
		
		
		
		
	}

}
