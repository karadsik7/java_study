package com.inc.assignment;

public class AssignmentEx2 {
	public static void main(String[] args) {
	//Assignment1에서 만든 seats라는 배열에 담긴
	//모든 승객을 차례대로 출력하는 3차원 for문을 만드시오.
	//ex) 박태환
	//    김연아
	//조건 : 일반 for문버전, 개선된 for문버전 두가지로 만드시오.
	
		String[][][] seats = {
				 {
					{"박태환", "김연아", "손연재", "이상화"}, 
					{"윤종신", "윤하", "김동률", "아이유"},
					{"김OO", "이OO", "최OO", "장OO"}
				 },// 1호차
				 {
						{"박태환2", "김연아2", "손연재2", "이상화2"}, 
						{"윤종신2", "윤하2", "김동률2", "아이유2"},
						{"김OO2", "이OO2", "최OO2", "장OO2"}
					 }// 2호차
				 
					}; //배열 초기화
		
		//일반 for문

		for(int i = 0; i < seats.length;i++) {
			for(int j = 0; j < seats[i].length; j++) {
				for(int k = 0; k < seats[i][j].length; k++) {
					System.out.printf("%s\t", seats[i][j][k]);
				}
				System.out.println();
			}
			System.out.printf("%d호차", i+1);
			System.out.println();
		}
	
	//개선 for문
	
		for(String[][] ho : seats) {
			for(String[] row : ho) {
				for(String alpha : row) {
					System.out.printf("%s\t", alpha);
				}
				System.out.println();
			}
			System.out.println();
		}
	
	
	
	}
	
	
	
}
