package com.inc.loop;

public class WhileEx1 {

	public static void main(String[] args) {
		
		
		
		boolean isStudent = true;
				
		/*while(isStudent) {
			System.out.println("학교에 간다");
			System.out.println("집으로 돌아온다");
		}*/
		
		// 학생은 언젠가 졸업을 하게 된다
		
		int grade = 1;
		
		/*while(isStudent) {
			System.out.println("학교에 간다");
			System.out.printf("집으로 돌아온다. 학년:%d\n", grade);
			
			//grade = grade + 1;
			//grade += 1;
			grade++;
			
			//졸업 가능?
			if(grade > 6) {
				isStudent = false;
			}
		}*/
		
		while(grade <= 6) {
			System.out.println("학교에 간다");
			System.out.printf("집으로 돌아온다. 학년:%d\n", grade);
			grade++;
		}
		

	}

}
