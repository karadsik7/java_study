package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx4 {
	public static void main(String[] args) {
		//과제 6개의 번호를 저장할 수 있는 balls라는 배열이있다.
		int[] balls = {45, 20, 14, 2, 32, 0};
		
		//사용자로부터 숫자를 입력받아 
		//balls의 6번째 숫자(5번 인덱스)에 저장하세요.
		
		//만약 이미 저장되어있는 숫자를 입력했다면
		//"이미 입력된 숫자입니다."
		//새로운 숫자를 입력했다면.
		//"입력이 완료되었습니다."를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int press = scanner.nextInt();
		
		for(int i = 0; i < balls.length; i++) {
			int num = balls[i];
			if(press != num) {
				balls = new int[6];
				balls[0] = 45;
				balls[1] = 20;
				balls[2] = 14;
				balls[3] = 2;
				balls[4] = 32;
				balls[5] = press;
				System.out.println("입력이 완료됐습니다.");
				
			}
			else {
				System.out.println("이미 입력된 숫자입니다.");
				break;
			}
			
		}
		
		
	}
}
