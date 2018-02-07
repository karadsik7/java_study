package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx2 {

	public static void main(String[] args) {
		//선택1 UpAndDown이라는 게임을 만들어 본 뒤 정답과 비교해 보세요.
		//선택2 UpAndDwon이라는 게임을 분석 후 만들어 보세요.

		//1. 컴퓨터가 1부터 100까지의 랜덤한 숫자를 선정함
		//2. 내가 1부터 100까지의 양수를 하나 선정함
		//3. 컴이 비교해서 작은지 큰지 알려줌
		//4. 맞추면 종료하고 점수를 반환
		
		//1.
		
		int answer = (int)(Math.random() * 100 + 1);
		System.out.println(answer); //디버깅용
		
		//2.
		
		Scanner scanner = new Scanner(System.in);
		
		//3. 틀리면 다시 반복해야하므로 반복문으로
		//3-1. 플레이어 초이스와 조건을 비교해서 정답이면 축하합니다 출력후 브레이크걸어 종료하고
		// 정답이 더 크면 up 낮으면 down을 출력하고 숫자입력부터 반복시킨다.
		int score = 10;
		
		while(true) {
		System.out.println("숫자를 입력하세요");
		int choice = scanner.nextInt();
			if(choice == answer) {
				System.out.printf("정답입니다! 점수 : %d점", score);
				break;
				
			}
			else if(choice < answer) {
				System.out.println("up");
				score--;
			}
			else {
				System.out.println("down");
				score--;
			}
		
		
		}
		scanner.close();
	}

}
