package com.inc.assignment;

public class AssignmentEx2 {

	public static void main(String[] args) {
		//과제2 : 아래와 같은 형태의 별을 출력해 보세요.
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		
		for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(i<=j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				
				
				}
		
				System.out.println();
		
	}
}
}
