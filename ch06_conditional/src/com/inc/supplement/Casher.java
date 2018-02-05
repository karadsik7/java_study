package com.inc.supplement;

import java.util.Scanner;

public class Casher {

	public static void main(String[] args) {
		
		//산 물건의 가격을 입력하면 물건 가격과 적립 포인트를 알려주는 프로그램이다.
		/*적립 포인트 규정 : 1000원 이하 : 1%
						1000원 초과 10000원 이하 : 2%
						10000원 초과 100000원 이하 : 5%
						100000원 초과 : 10%*/
		
		// 요령 1. 산 물건의 가격을 입력하면 물건 가격을 출력하는 프로그램만 생각
		// 1-1. 사용자가 물건의 가격을 입력할 것이다. 이것을 변수에 저장을 해야 될까?
		// =>사용자가 입력한 물건의 가격을 나중에 출력하려면 일단 저장하고 본다.
		int price = 0;
		
		// 1-2. 사용자로부터 데이터르르 입력 받으려면 scanner가 필요하다.
		Scanner scanner = new Scanner(System.in);
		
		//데이터를 입력 받기 전 사용자한테 데이터를 입력해달라는 메세지를 출력해야한다.
		System.out.println("물건 가격을 입력해주세요.");
		
		//사용자로부터 가격을 입력받고 그 가격을 저장한다.
		price = scanner.nextInt();
		
		//출력하자
		System.out.printf("가격은 %d원 입니다.", price);
		
		
		

	}

}
