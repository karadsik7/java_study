package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx5 {
	public static void main(String[] args) {
		//과제 6개의 번호를 저장할 수 있는 balls라는 배열이있다.
		int[] balls = new int[6];
		
		//사용자로부터 숫자를 입력받아 balls에 저장하고 저장이 끝나면
		//사용자가 입력한 숫자를 차례대로 출력하는 프로그램을 만들어 보세요
		//단, 중복을 허용하지 않기 때문에 이미 입력한 숫자를 다시 입력했다면
		//"이미 입력하신 숫자입니다"라고 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		//사용자 입력을 6번 받아야하므로 반복을 돌림
		for(int i = 0; i < balls.length ; i++) {
			System.out.println(i + 1 + "번째 숫자를 입력하세요.");
			balls[i] = scanner.nextInt();
			//중복을 허용하지 않아야 하므로 입력한 숫자를 다시 입력했을 때 입력하지 않고 다시 돌아와야함
			//돌아오는 것은 i++로 진행되는 반복이므로 i--로 돌리면 될것
			//기존까지의 입력숫자를 전부 비교해야 하므로 포문으로 돌리며
			//일단 인덱스 값에는 음수가 들어갈 수 없으므로 비교시에 양수가 되도록 잡는다
			  for(int j = 0; i-j > 0; j++) {
				if(balls[i] == balls[j]) {
					System.out.println("이 값은 이미 입력했습니다. 다시 입력하세요.");
					i--;
					break;
				}
				
			}
			
		}
		// 입력한 값들을 출력한다.
		for(int i : balls) {
			System.out.printf("값 : %d ",  i);
		}
		
		
		
		
		
		
	}
}
