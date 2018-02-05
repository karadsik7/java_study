package com.inc.array;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		//8명으로 늘어나면 2열의 A석이아닌 E F G H로 컴퓨터는 이해한다
		String[] seats = {"박태환", "김연아", "손연재", "이상화", 
				          "윤종신", "윤하", "김동률", "아이유"};
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("좌석을 입력해주세요.");
		
		char alpha = scanner.next().charAt(0);
		
		System.out.printf("해당 좌석에는 %s님이 앉아계십니다.", seats[alpha-65]);
		
		
		
		
		
	}

}
