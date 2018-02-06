package com.inc.example;

public class MethodEx6 {

	public static void main(String[] args) {
		
		
		//3. 메서드 사용
		// 메서드의 사용 목적은 코드의 재활용이다.
		// 값에 따라 코드를 새로 만드는 것이 아니라 호출하여 값을 지정하여 그 코드를 그대로 돌려쓰므로 응집도 증가
		
		
		// 메서드의 이름은 같지만 파라미터의 종류, 갯수가 다르면 서로 다른 메서드이다.
		// (이름이 똑같은 두명의 직원으로 생각)
		sum(10);
		System.out.println("운동한다");
		sum(20);
		System.out.println("밥먹는다");
		sum(30);
		System.out.println("잔다");
		
		sum(1, 11);
		sum("donald", "trump");
		sum(10);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100);
		

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
	
	// 메서드의 Overloading(오버로딩, 중복선언)
	// 메인에서 파라미터를 한개만 넘기면 위의 코드가, 두개를 넘기면 아래 코드가 실행됨
	// 기능이 비슷한데 변수명이 많아지면 기억의 부담이 오기 때문
	public static void sum(int start, int end) {
		
		int total = 0;
		for(int i = start; i <= end; i++) {
			total += i;
		}
		System.out.println(total);
	}
		
		public static void sum(String first, String last) {
			System.out.printf("당신의 이름은 %s %s\n", first, last);
		}
		
		//variable arguments
		//갯수가 가변적인 파라미터 (... + 변수명)
		/*public static void sum(int ... numbers) //numbers는 배열
		{
			int total = 0;
			for(int number : numbers) {
				total += number;
			}
			System.out.println(total);
		}*/
		//단일 파라미터로 쓰든지 파라미터가 여러개라면 무조건 맨 마지막에 위치해야함. (마지막 아닐시 에러)
		//오버로딩 시에 다른쪽 파라미터의 조건에도 부합하면 에러남(int a, int ... x 와 int ... y 때를 생각)
		public static void sum(int test, int ... numbers) //numbers는 배열
		{
			System.out.println(test);
			
			int total = 0;
			for(int number : numbers) {
				total += number;
			}
			System.out.println(total);
		}
		
		
		
		
		
		
		
		
		
	}
	
	

