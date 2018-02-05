package com.inc.switchstmt;

public class SwitchEx1 {

	public static void main(String[] args) {
		// A ~ F 중 하나를 입력하면
		
		char grade = 'A';
		switch(grade) {
			case 'A' : System.out.println("91~100");
			break;
			case 'B' : System.out.println("81~90");
			break;
			case 'C' : System.out.println("71~80");
			break;
			case 'D' : System.out.println("60~70");
			break;
			case 'F' : System.out.println("0~59");
			break;
			default : System.out.println("?");
		}
		
		
		
		//실습 : 학년을 입력하면 담당교사를 출력하는 프로그램을 작성하시오.
		//1학년 : 임꺽정, 2학년 : 홍길동, 3학년 : 이세돌, 4학년 : 이창호
		//5학년 : 정도전, 6학년 : 이방원
		int schoolYear = 1;

		switch(schoolYear) {
			case 1 : System.out.println("임꺽정");
			break;
			case 2 : System.out.println("홍길동");
			break;
			case 3 : System.out.println("이세돌");
			break;
			case 4 : System.out.println("이창호");
			break;
			case 5 : System.out.println("정도전");
			break;
			case 6 : System.out.println("이방원");
			break;
			default : System.out.println("잘못된 입력입니다");
			
		}
		
		
		
		
		
	}

}
