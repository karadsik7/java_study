package com.inc.assignment;

public class Assignment1 {
	public static void main(String[] args) {
		//과제 1
		//월을 입력하면 계절을 출력하세요
		//봄 : 3 ~ 5
		//여름 : 6 ~ 8
		//가을 : 9 ~ 11
		//겨울 : 12 ~ 2
		
		//switch, if버전 두가지로 해보세요.
		
		//switch 버전
		
		int month = 9;
			switch(month) {
			case 12 :
			case 1 :
			case 2 : System.out.println("겨울입니다."); break;
			case 3 :
			case 4 :
			case 5 : System.out.println("봄입니다."); break;
			case 6 :
			case 7 :
			case 8 : System.out.println("여름입니다."); break;
			case 9 :
			case 10 :
			case 11 : System.out.println("가을입니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");	
			}
			
		// if 버전
			
		int mon = 1;
			if(mon == 12) {
				System.out.println("겨울입니다.");
			}
			else if(mon >= 1 && mon <= 2) {
				System.out.println("겨울입니다.");
			}
			else if(mon >= 3 && mon <= 5) {
				System.out.println("봄입니다.");
			}
			else if(mon >= 6 && mon <= 8) {
				System.out.println("여름입니다.");
			}
			else if(mon >= 9 && mon <= 11) {
				System.out.println("가을입니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		
	}
}
