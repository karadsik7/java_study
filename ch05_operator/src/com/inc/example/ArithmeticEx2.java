package com.inc.example;

public class ArithmeticEx2 {

	public static void main(String[] args) {
		//빼기(substract)
		//곱하기(multiply)
		//나누기(devide)
		//나머지(modular)
		
		System.out.println(10/3);
		System.out.println(10.0/3);
		/*산술연산의 경우 좌항의 자료형과 우항의 자료형이 다르다면
		둘 중 하나를 자료형이 더 큰 쪽으로 자동으로 캐스팅하고 연산한다.*/
		
		//몫과 나머지에 대한 개념을 혼동하지 말 것
		System.out.println(10 % 3);//결과는 1 (나머지)
		
		//나머지 값이 실수가 나올 수도 있음
		System.out.println(10.9 % 10);
		System.out.println(1.23456 % 1);
		
		//실습 : 통장 잔고가 5,416원일 경우 전부 이체하게 되면
		//원단위는 올림을 해서 5,420원을 준다.
		//이 경우 은행에서 손해보는 금액을 저장해야 한다고 하면
		
		int balance = 5416;
		double lessThanOne = (double)balance / 10 % 1;
		System.out.println(lessThanOne);
		
		double loss = (1 - lessThanOne) * 10;
		System.out.println("손실금액 : " + loss + "원");
		System.out.println("손실금액 : " + (int)loss + "원");
		//정확하진 않음 (부동소숫점 특성상)
		
		//실습2 : 출력 결과를 예측 (hint: 결합방향 오른쪽)
		System.out.println(3 + 2 % 1.5 * 4 - 2); //3
		System.out.println(6 / 2 + 10 % 2 - 3 * 2); //-3
		System.out.println(1 + 3 * 2 - (4 - 2) % 3 / 2); //6
		
		
	}

}
