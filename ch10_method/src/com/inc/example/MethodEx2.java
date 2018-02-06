package com.inc.example;

public class MethodEx2 {

	public static void main(String[] args) {
		
		
		//2. 반복문을 사용
		
		//단점 : 반복하는 코드 중간에 다른 코드를 집어넣을 수 없다.
		
		for(int j = 0; j < 5; j++) {
		int total = 0;
			for(int i = 1; i <= 100; i++) {
				total += i;
				}
		System.out.println(total);
		System.out.println("운동한다");
		 }
		
		
		
		
		
		
		
		
		

	}

}
