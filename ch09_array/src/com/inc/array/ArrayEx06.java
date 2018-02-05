package com.inc.array;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		//좌석 ABCD를 치면 누가 앉아있는지 알려주는 프로그램
		String[] seats = {"박태환", "김연아", "손연재", "이상화"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("좌석을 입력해주세요.");
		
		char alpha = scanner.next().charAt(0);
		
		System.out.printf("해당 좌석에는 %s님이 앉아계십니다.", seats[alpha-65]);
		
		
		
	}

}
