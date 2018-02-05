package com.inc.assignment;

public class AssignmentEx3 {
	public static void main(String[] args) {
	//Assignment2에서 만든 반복문 중
	//일반 for문의 경우에는 다음과 같이
	//호차, 열, 알파벳 까지 함께 출력하도록
	//기능을 업그레이드 하시오.
	//ex) ...
	//    2호차 1열 A석 : 고양이
	//    2호차 2열 B석 : 강아지
	//    ...
	
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
							
							System.out.printf("%d호차 %d열 %s석 : %s\t", i+1, j+1, (char)(k+65), seats[i][j][k]);
						}
						System.out.println();
					}
			
					System.out.println();
				}

	
	
	}
}