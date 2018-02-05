package com.inc.example;

public class AssignmentEx1 {

	public static void main(String[] args) {
		//대입연산자 (결합방향 오른쪽에서 왼쪽으로)
		//arg = data : 변수에 데이터를 대입 (할당)
		String msg = "java is fun";
		
		int num1;
		
		//int num2 = num1;
		//변수를 초기화하지 않은 상태에서 사용하면 에러발생
		
		int num2 = num1 = 10; // 우측에서 좌측 순서로 대입
		System.out.println(num2);
		
		//복합대입연산자, 복합연산자
		//+=, -=, /=, *=, %=
		System.out.println(num1);
		
		num1 += 1; // num1 = num1 + 1;
		System.out.println(num1);
		
		num1 += 2;
		System.out.println(num1);
		
		num1 -= 1;
		System.out.println(num1);
		
		num1 -= 10;
		System.out.println(num1);
		
		num1 *= 5;
		System.out.println(num1);
		
		//실습 : 다음 출력 결과를 예상
		
		int x = 10;
		x %= 2.5;
		System.out.println(x); //0
		
		
		

	}

}
