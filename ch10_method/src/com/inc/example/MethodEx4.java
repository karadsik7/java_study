package com.inc.example;

public class MethodEx4 {

	public static void main(String[] args) {
		
		
		//3. 메서드 사용
		// 메서드의 사용 목적은 코드의 재활용이다.
		// 값에 따라 코드를 새로 만드는 것이 아니라 호출하여 값을 지정하여 그 코드를 그대로 돌려쓰므로 응집도 증가
		
		sum(10);
		System.out.println("운동한다");
		sum(20);
		System.out.println("밥먹는다");
		sum(30);
		System.out.println("잔다");
		
		lengthOfCircle(20);
		areaOfCircle(5);
		
		
		
		

	}

	/* 파라미터는 호출하는 쪽(main, 고참)에서 호출당하는 쪽 (sum, 신참)에게 전달하는 데이터(지시사항)이다.
*/
	
	public static void sum(int n) {
		
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total += i;
			}
	System.out.println(total);
				
				
	}
	
	
	//실습 1 : 반지름을 입력하면 원의 둘레를 출력하는 lengthOfCircle이라는 이름의 메서드를 선언하고
	// main 메서드에서 호출하시오.
	//hint1 : 파라미터로 int 데이터를 받는다.
	//hint2 : 원의 둘레를 구하는 공식 : 2*3.14*반지름
	
		public static void lengthOfCircle(int r) {
			
			System.out.println(2*3.14*r);
			
		}
	
	//실습 2 : 반지름을 입력하면 원의 넓이를 출력하는 araeaOfCircle이라는 이름의 메서드를 선언하고
	// main 메서드에서 호출하시오.
	//hint1 : 파라미터로 int데이터를 받는다.
	//hint2 : 원의 넓이를 구하는 공식 : 3.14*반지름*반지름
	
		public static void areaOfCircle(int r) {
			System.out.println(3.14*r*r);
		}
}
