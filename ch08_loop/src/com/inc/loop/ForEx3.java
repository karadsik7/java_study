package com.inc.loop;

public class ForEx3 {

	public static void main(String[] args) {
		
		//별찍기
		//5x1
		
		for(int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		
		System.out.println("-----------");
		//1x5
		
		for(int j = 0; j < 5; j++) {
			System.out.print("*");
			
		}
		System.out.println();
		System.out.println("-----------------");
		
		//5x5 별찍기
		
		for(int i = 0; i < 5;i++) {
			
			System.out.println();
			
			for(int j = 0; j < 5; j++) {
			
			System.out.print("*");	
		    }
		}
		
		
		System.out.println("-------------------------");
		
		
		// 계단형 별찍기
		
			for(int i = 0; i < 5; i++) {
			
			System.out.println();
			
			for(int j = 0; j < i+1; j++) {
			
			System.out.print("*");	
		    }
		}
		System.out.println();
		System.out.println("-------------");
			
		//역계단형 별찍기
			
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j <= 4-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
	}

}
