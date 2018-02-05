package com.inc.loop;

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		
		//break는 특정한 조건에서 반복을 멈추는 기능이라면
		//continue는 특정한 조건에서 다음 반복으로 가는 기능이다.
		for(int day = 1; day <= 31; day++) {
			System.out.println("학원에 갑니다");
			if(day % 2 == 0) {
				continue;//이하의 문장을 실행하지 않고  day++로 이동
			}
			System.out.println("집으로 돌아옵니다");
		}
		
		System.out.println("------------------");
		
		//continue는 더 이상 이하의 문장을 실행하지 않아도 될 때 유용함
		
		Scanner scanner = new Scanner(System.in);
		for(;true;) {
			System.out.println("다음 분~!");
			System.out.println("최근에 수술한 적이 있나요? (y/n)");
			char answer = scanner.next().charAt(0);
			if(answer == 'y') {
				continue;
			}
			
			System.out.println("최근에 중동여행 다녀오신 적 있나요? (y/n)");
			answer = scanner.next().charAt(0);
			if(answer == 'y') {
				continue;
			}
			
			System.out.println("혈액형을 알려주세요");
			String bloodType = scanner.next();
			
			System.out.printf("헌혈을 시작하겠습니다. 혈액형 : %s형\n", bloodType);
			
		}

	}

}
