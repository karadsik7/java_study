package com.inc.switchstmt;

public class SwitchEx2 {

	public static void main(String[] args) {
		//break의 응용
		/*실습 : 어떤 헬스장이 있는데 헬스장의 사은품이 다음과 같다.
		1개월 : 없음
		2개월 : 락커룸
		3개월 : 헬스복
		4개월 : 러닝화
		
		개월 수를 입력하면 사은품을 출력하는 프로그램을 작성하시오.*/
		
		int join = 4;
				
			switch(join) {
				case 1 : 
					System.out.println("없음"); break;
				case 4 : 
					System.out.println("러닝화"); 
				case 3 : 
					System.out.println("헬스복"); 
				case 2 : 
					System.out.println("락커룸"); break;
				
				default : System.out.println("?");
			}
			
		
		
			// 실습  : 월의 수를  입력하면 해당 월의 마지막 날을 출력하는 프로그램을 작성하시오.
			// 1 3 5 7 8 10 12 월은 -> 31일까지 있음
			// 4 6 9 11 월은 -> 30일까지
			// 2월은 28일까지
			
			int month = 1;
			
			switch(month) {
				case 2 : System.out.println("28일"); break;
				case 4 : 
				case 6 : 
				case 9 : 
				case 11 : System.out.println("30일"); break;
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10 :
				case 12 : System.out.println("31일"); break;	
				default : System.out.println("?");
			}
			
			
			
			
	}

}
