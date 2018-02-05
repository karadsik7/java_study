package com.inc.supplement;

import java.util.Scanner;

public class Casher4 {

	public static void main(String[] args) {
		
		/*적립 포인트 규정 : 1000원 이하 : 1%
						1000원 초과 10000원 이하 : 2%
						10000원 초과 100000원 이하 : 5%
						100000원 초과 : 10%*/
		//산 물건의 가격을 하나씩 차례대로 입력하면 가격의 총합과 적립 포인트를 알려주는 프로그램
		//단, 포인트 계산시 물건의 총합을 기준 
		
		// 요령1. 물건의 값을 여러번 입력받아 그것의 합을 구한다.
		
		
		int price = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		//가격을 반복해서 입력받아야 하므로 와일문을 써본다.
		//가격을 입력받을 때마다 가격이 초기화되므로 이것을 총합하는 변수가 하나 더 필요하겠다.
		//사용자가 0을 입력했을 때 반복문을 빠져나오는 코드를 작성해보세요.
		
		int totalPrice = 0;
		
		
		while(true) {
		System.out.println("물건 가격을 입력해주세요.");
		price = scanner.nextInt();
		totalPrice += price;
			if(price == 0) {
				break;
	//boolean go = true; 를 사용할거면 나중에 break; 대신 go=false 시키면되고 break;만 써서 반복문 탈출해도된다.
			}
		
		}
		
		
		int point = 0;
		
		
		if(totalPrice<=1000) {
			 point = (int)(totalPrice * 0.01);
		}
		else if(totalPrice <= 10000)
		{
			point = (int)(totalPrice * 0.02);
		}
		else if(totalPrice <= 100000) {
			point = (int)(totalPrice * 0.05);
		}
		else {
			point = (int)(totalPrice * 0.1);
		}
		
		System.out.printf("가격은 %d원 입니다.\n", totalPrice);
		System.out.printf("적립 포인트는 %d원 입니다.", point);

		
		

	
		
		

	}

}
