package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx7 {
	public static void main(String[] args) {
		//과제
		//배열과제 AssignmentEx5의 경우 
		//사용자로부터 6개의 숫자를 중복되지 않게 받았다.
		//이번에는 배열에 6개의 랜덤한 숫자를 저장하세요.
		
		Scanner scanner = new Scanner(System.in);
		int[] balls = new int[6];
		
		//1.중복이랑 상관없이 6개의 랜덤한 숫자를 배열에 저장하세요.
		
		for(int i = 0; i < 6; i++) {
		int randomNumber =  (int)(Math.random() * 45);
		balls[i] = randomNumber;
			for(int j = 0; j < i; j++) {
				if(balls[i] == balls[j]) {
					System.out.println("중복된 값이므로 다시 배정합니다.");
					i--;
				}
			}
		}
		for(int i : balls) {
			System.out.println(i);
		}
		
		//2.1에서 중복되었을 경우 숫자를 다시받는 코드를 추가해 보세요.
		
		
		
		//hint1 : int randomNumber =  (int)(Math.random() * 45)
	}
}
