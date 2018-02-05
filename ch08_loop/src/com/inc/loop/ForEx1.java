package com.inc.loop;

public class ForEx1 {

	public static void main(String[] args) {
		// for는 while을 조금이나마 더 편하게 쓰고자 만든 반복문이다.
		/*int grade = 1;*/
		// 여기에 100줄의 코드가 들어가있다면?? => 응집도가 떨어짐
		for(int grade = 1;grade <= 6;grade++) {
			System.out.println("학교에 간다");
			System.out.println("집에 돌아온다");
			
		}// 실행순서 : int grade = 1; grade<=6, 본문, grade++, 본문, ~~반복, grade++, false값 반환, 종료
		// ()안의 구조 : 초기화;조건;변화값
		
		
		//grade는 어떻게 보면 반복을 위한 변수인데
		//반복문 밖에 존재하기 때문에 응집도가 떨어진다.
		//for문은 while문의 이러한 단점을 보완하기 위해
		//반복문에 필요한 코드를()안에 적을 수 있도록 해놓음.
		//또한 반복문의 특징 중 하나가 반복문 내에서 조건에 사용되는 변수에 대한 변화조치가 필요하다는 점인데
		//사실 이러한 작업은 반복하려는 코드와 크게 관련이 없고 이를 분리하기 위해 ()안에 별도의 공간을 마련했다.(;)를 통해
		
		
		
		
		
	}

}
