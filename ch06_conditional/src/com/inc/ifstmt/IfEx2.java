package com.inc.ifstmt;

public class IfEx2 {

	public static void main(String[] args) {
		
		System.out.println("나이를 입력해주세요.");
		int age = 19;
		
		/*if(age >= 20) {
			System.out.println("관람 가능 합니다.");
		}
		
		if(age < 20) {
			System.out.println("관람 불가 합니다.");
		}*/
		
		if(age >= 20)//if문 뒤 괄호 안에는 true나 false값만 들어감.
		{	System.out.println("관람 가능 합니다.");
		} else {
			System.out.println("관람 불가 합니다.");
		}
		
		//실습 1
		System.out.println("성별을 입력해주세요");
		
		char gender = 'm';
		
		//성별이 남성이면 "멋지세요"
		//성별이 여성이면 "아름다우세요"
		//성별에 상관없이 "감사합니다"를 출력하세요.
		
		if(gender == 'm') {
			System.out.println("멋지세요");
		} 
		else {
			System.out.println("아름다우세요");
		}
		System.out.println("감사합니다");
		
		//실습2
		//강사입장에서 조건문 예제를 만들어보세요.
		//학생입장에서 그 예제를 풀어보세요
		
		//매장에 고객이 들어오면 "어서오세요"를 평상시에는 "OO매장입니다"를 출력하세요.
		
		boolean customerIn = false;
		
		if(customerIn) {
			System.out.println("어서오세요");
		}
		else {
			System.out.println("OO매장입니다.");
			
		}

	}

}
