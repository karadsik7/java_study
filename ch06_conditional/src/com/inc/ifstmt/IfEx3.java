package com.inc.ifstmt;

public class IfEx3 {

	public static void main(String[] args) {
		System.out.println("성별을 입력해주세요");
		//char gender = 'm';
		
		char gender = 'm';
		
		if(gender == 'm') {
			System.out.println("멋지십니다");
		}
		else {
			System.out.println("아름다우십니다");
		}
		System.out.println("감사합니다");
		
		// 더 정확한 정답
		
		if(gender == 'm') {
			System.out.println("멋지십니다");
			}
		if(gender == 'f') {
			System.out.println("아름다우십니다");
		}
		
		System.out.println("감사합니다");
		System.out.println("---------------");
		
		//'m' 또는 'f'가 아닐 때 "정체를 밝히시오"라는 조건이 추가되었다.
		if(gender == 'm') {
			System.out.println("멋지십니다.");
			System.out.println("감사합니다.");
		}
		if(gender == 'f') {
			System.out.println("아름다우십니다.");
			System.out.println("감사합니다.");
		}
		System.out.println("---------------");
		
		//gender가 'm'도 아니고 'f도 아닐 때 실행할 if문 선언
		if(gender != 'm' && gender != 'f') {
			System.out.println("정체를 밝히시오");
		}
		

		//다른 방식
		if(gender == 'm' || gender == 'f')//남자이거나 여자이거나를 만족
		{
			if(gender == 'm') {
				System.out.println("멋지십니다.");
			}
			else {
				System.out.println("아름다우십니다.");
			}
				System.out.println("감사합니다.");
		}
		else {
			System.out.println("?");
		}

	
	
	
	
	}
	

}
