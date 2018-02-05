package com.inc.supplement;

import java.util.Scanner;

public class Casher2 {

	public static void main(String[] args) {
		
		//산 물건의 가격을 입력하면 물건 가격과 적립 포인트를 알려주는 프로그램이다.
		/*적립 포인트 규정 : 1000원 이하 : 1%
						1000원 초과 10000원 이하 : 2%
						10000원 초과 100000원 이하 : 5%
						100000원 초과 : 10%*/
	
		//요령 2. 적립 포인트를 계산하고 출력하자
		
		int price = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("물건 가격을 입력해주세요.");
		
		price = scanner.nextInt();
		
		//적립 포인트를 구하려면 사용자가 입력한 가격을 알아야하므로 이줄부터 써야한다.
		//적립 포인트를 계산한 뒤 나중에 출력해야 되므로 적립 포인트를 저장한 변수가 선언되야함.
		
		int point = 0;
		
		//적립 포인트를 계산할건데 가격 구간에 따라서 포인트 적립율이 달라지므로 조건문을 사용하자.
		
		if(price<=1000) {
			 point = (int)(price * 0.01);
		}
		else if(price <= 10000)//else if기 때문에 1000보다 작은 값은 오지 않으므로 n>1000 && n<=10000 ㄴㄴ
		{
			point = (int)(price * 0.02);
		}
		else if(price <= 100000) {
			point = (int)(price * 0.05);
		}
		else {
			point = (int)(price * 0.1);
		}
		
		System.out.printf("가격은 %d원 입니다.\n", price);
		System.out.printf("적립 포인트는 %d원 입니다.", point);

		
		

	}

}
