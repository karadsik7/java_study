package com.inc.math;

public class MathEx1 {
	public static void main(String[] args) {
		//Math는 모든 생성자가 스태틱이고 프라이빗이라 인스턴스생성으로 사용불가능
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println((int)(Math.random() * 6) + 1); 
		//random은 0부터 0.999999999999...까지의 랜덤한 실수를 반환
		//그러므로 정수를받기위해선 인트로 캐스팅하고 1부터받고싶으면 1을 더하기
		
		
	}
}
