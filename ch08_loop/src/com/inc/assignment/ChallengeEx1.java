package com.inc.assignment;

public class ChallengeEx1 {
	public static void main(String[] args) {
		//도전1 : 아래와 같은 형태의 별을 출력해 보세요.
		//    *    
		//   ***
		//  *****
		// *******
		//*********
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				
					System.out.print(" ");	  
				
			}
			for(int j=0;j<2*i+1;j++) {
				
					System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}
}
