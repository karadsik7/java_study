package com.inc.supplement;

import java.util.Scanner;

public class Casher3 {

	public static void main(String[] args) {
		
		//산 물건의 가격을 입력하면 물건 가격과 적립 포인트를 알려주는 프로그램이다.
		/*적립 포인트 규정 : 1000원 이하 : 1%
						1000원 초과 10000원 이하 : 2%
						10000원 초과 100000원 이하 : 5%
						100000원 초과 : 10%*/
	
		
		//3. 유지보수 할건데 적립포인트 제도가 사라지고 기존 포인트 효율만큼 즉시할인을 해주는 프로그램으로 변경하시오.
		// 그냥 뭐 넣을것도 없이 기존 포인트를 원가에서 빼기만 하면됨
		
		int price = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("물건 가격을 입력해주세요.");
		
		price = scanner.nextInt();
		
		
		int discount = 0;
		
		
		if(price<=1000) {
			 discount = (int)(price * 0.01);
		}
		else if(price <= 10000)
		{
			discount = (int)(price * 0.02);
		}
		else if(price <= 100000) {
			discount = (int)(price * 0.05);
		}
		else {
			discount = (int)(price * 0.1);
		}
		
		System.out.printf("가격은 %d원 할인되어 %d입니다.\n", discount, price-discount);

		
		

	}

}
