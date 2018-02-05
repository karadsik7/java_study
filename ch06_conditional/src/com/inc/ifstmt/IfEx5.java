package com.inc.ifstmt;

public class IfEx5 {

	public static void main(String[] args) {
		
		char gender = 'm';
		
		if(gender == 'm') {
			System.out.println("멋지십니다");
		}
		else if(gender == 109) {
			System.out.println("역시 멋지십니다");
		}
		
		int e = gender;
				System.out.println(e);
		
				
		//실습 : 예제를 리팩토링
				
		int sc = 71;
		
		if(sc > 100 || sc < 0) {
			System.out.println("?");
		}
		else if(sc > 90) {
			System.out.println("A");
		}
		else if(sc > 80) {
			System.out.println("B");
		}
		else if(sc > 70) {
			System.out.println("C");
		}
		else if(sc >= 60) {
			System.out.println("D");
		}
		else if(sc >= 0 && sc < 60) {
			System.out.println("F");
		}
		else {
		}
				
		
		
	}

}
