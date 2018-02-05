package com.inc.array;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		
		//2차원배열을 통해 열을 인식하게하고 ABCD석을 반환하는 프로그램
		
		
		String[][] seats = {
							{"박태환", "김연아", "손연재", "이상화"}, 
							{"윤종신", "윤하", "김동률", "아이유"},
							{"김OO", "이OO", "최OO", "장OO"}
							};
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("열을 입력해주세요.");
		int row = scanner.nextInt() - 1;
		System.out.println("좌석을 입력해주세요.");
		int alpha = scanner.next().charAt(0) - 65;
		
		
		System.out.printf("해당 좌석에는 %s님이 앉아계십니다.", seats[row][alpha]);
		
		//실습 : 3열에 좋아하는 배우 4명을 추가하고 3열에 배우들이 잘 저장이 되어있는지 확인해보세요.
		
		
		
		
		//실습2 : 반복문을 이용하여 모든 승객에게 "~님 안녕히가세요"라고 출력하세요.
		//ex ) 박태환님 안녕히가세요.
		//		...님 안녕히가세요.
		//		...님 안녕히가세요.
		
		
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++)
			System.out.printf("%s님 안녕히가세요.\n", seats[i][j]);
		}
		
		
	}

}
