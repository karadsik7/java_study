package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx1 {
	
	
	public static void main(String[] args) {
	//열차에 호차라는 개념이 추가되었다.
	//조건
	//1호차의 1열에는 스포츠스타 ex)박태환
	//1호차의 2열에는 가수 ex)윤종신
	//1호차의 3열에는 배우 ex)원빈
	//2호차의 1열에는 포유류 ex)고양이
	//2호차의 2열에는 어류 ex)고등어
	//2호차의 3열에는 조류 ex)독수리
	//2호차의 4열에는 파충류 ex)거북이
	//가 타고있다.
	//호차는 총2개, 열은 3 또는 4개, 알파벳은 4개(A~D)
	
	//위 조건을 만족하는 seats라는 3차원배열을
	//만들고 호차, 열, 알파벳을 차례대로 입력하면
	//해당 좌석에 앉아있는 객체의 이름을 출력하시오.
	//ex) 2, 3, A -> 독수리
	
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("호차를 입력하세요.");
	 int ho = scanner.nextInt() - 1;
	 
	 System.out.println("열을 입력하세요.");
	 int row = scanner.nextInt() - 1;
	 
	 System.out.println("좌석을 입력하세요.");
	 int alpha = scanner.next().charAt(0) - 65;
	 
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
	 
	 	System.out.printf("해당 좌석에는 %s님이 앉아계십니다.", seats[ho][row][alpha]);
	 
	
	}
}
