package com.inc.example;

public class LogicalEx2 {

	public static void main(String[] args) {
		// &&와 ||가 섞여있다면?
		System.out.println(true || false && true || true);
		// &&연산자가 ||연산자보다 우선순위가 높다
		
		//실습 : 출력 예측
		System.out.println(
				true && (!true || true) && true || (false || !false) && false
				);
		
		
		
		
	}

}
