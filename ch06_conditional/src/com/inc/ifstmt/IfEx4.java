package com.inc.ifstmt;

public class IfEx4 {

	public static void main(String[] args) {
		
		char gender = 'm';
		
		if(gender == 'm') {
			System.out.println("멋지십니다");
			System.out.println("감사합니다");
		}
		else if(gender == 'f') {
			System.out.println("아름다우십니다");
			System.out.println("감사합니다");
		}
		else {
			System.out.println("?");
		}
		
		
		//실습 : 정수를 입력받아서 0이면 zero, 0보다 크면 plus, 0보다 작으면 minus를 출력하는
		//프로그램을 작성해보세요.
		
		int score = 101;
		
		if(score > 0) {
			System.out.println("plus");
		}
		else if(score == 0) {
			System.out.println("zero");
		}
		else {
			System.out.println("minus");
		}
		
		// 실습2
		
		int score2 = -80;
		
		if(score2 < 60 && score2 > 0) {
			System.out.println("탈락입니다");
		}
		else if(score2 == 60) {
			System.out.println("턱걸이입니다.");
		}
		else if(score2 > 60 && score2 <= 80) {
			System.out.println("축하드립니다");
		}
		else if(score2 > 80 && score2 <= 100) {
			System.out.println("올");
		}
		else {
			System.out.println("?");
		}
		
		//실습3 : 점수를 입력하면 학점을 알려주는 프로그램을 작성하시오.
		/* 91 ~ 100 : A
		   81 ~ 90 : B
		   71 ~ 80 : C
		   60 ~ 70 : D
		   00 ~ 59 : F
		      이외: ?*/
		
		double s = 80.7;
		
		if(s <= 100 && s >= 91) {
			System.out.println("A");
		}
		else if(s < 91 && s >= 81) {
			System.out.println("B");
		}
		else if(s < 81 && s >= 71) {
			System.out.println("C");
		}
		else if(s < 71 && s >= 60) {
			System.out.println("D");
		}
		else if(s < 60 && s >= 00) {
			System.out.println("F");
		}
		else {
			System.out.println("?");
		}
		
		

	}

}
