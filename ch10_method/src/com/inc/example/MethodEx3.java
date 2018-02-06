package com.inc.example;

public class MethodEx3 {

	public static void main(String[] args) {
		
		
		//3. 메서드 사용
		
		//메인 메서드가 상사고 sum();과 같은 메서드는 부하직원의 포지션이라고 보면된다.
		//직원에게 일을 시키고 상사는 처리된 일을 호출하여 사용하기만 함.
		// 기능의 분리
		// main() : 기능 호출만 담당
		// sum() : 대기하다가 호출하면 작동
		// => 응집도(성질이 비슷한 기능끼리 묶는 것)를 up, 결합도(성질이 다른 기능끼리 묶은 것)를 down (긍정적)
		
		
		sum();
		System.out.println("운동한다");
		sum();
		System.out.println("밥먹는다");
		sum();
		System.out.println("잔다");
		
		
		

	}

	/* 함수(메서드)의 장점 
	1. 코드의 반복을 없앤다. (가독성 증가, 유지보수성 증가)
	2. 필요할 때 메서드를 호출해서 사용한다.
	3. 메서드 간의 기능을 분리한다.*/
	
		public static void sum() {
		
			int total = 0;
			for(int i = 1; i <= 10; i++) {
				total += i;
				}
		System.out.println(total);
				
				
				
	}
	
	
}
