package com.inc.supplement;

import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		// 주사위의 숫자를 예측하는 게임
		// 사용자로부터 값을 입력받은 뒤
		// 주사위를 굴립니다. (1 ~ 6 사이의 랜덤한 정수를 구한다)
		
		
		
		//사용자의 예측 숫자와 주사위의 값이 일치하면
		//축하합니다를 출력하면서 게임을 종료하고 못맞출 경우 프로그램을 재시작한다.
		
		//1. 사용자로부터 값을 입력받는다.
		
		Scanner scanner = new Scanner(System.in);
		
		//사용자의 예측 숫자와 주사위의 값을 비교한다.
		//실패하면 재시작해야하므로 반복문 안에 출력문을 넣고 사용자값을 받는다
		//성공하면 반복문을 정지해야하므로 break문을 사용한다.
		// 심화 : 실패할때마다 점수가 1점 감소하는 프로그램을 만들고 끝났을 때 점수를 출력해보세요.
		// 점수에 대한 변수를 밖에 선언해두고 맞췄을 때 스코어를 출력하고 꽝일때 점수를 1점씩 깎으면 된다.
		
		
		int score = 10;
		
		for(int i = 0;true; i++) {
			int randomNumber = (int)(Math.random()*6 + 1);
			System.out.println("주사위 숫자를 입력하세요.");
			int custom = scanner.nextInt();
		if(randomNumber == custom) {
			System.out.println("축하합니다."); 
			System.out.printf("점수는 %d점 입니다.", score);
			break;
		}
		else {
			System.out.println("꽝입니다.");
			 if(score > 0) {--score;} //0점이하일땐 음수점수는 존재하지 않으므로 조건문을 달아둔다.
		}
		}

	}

}
