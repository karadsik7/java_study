package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx4 {
	public static void main(String[] args) {
		//10개의 정수를 입력받아 입력받은 수들 중 
		//짝수의 개수와 홀수의 개수를 각각 구하여 
		//출력하는 프로그램을 작성하시오.
		
		
		Scanner scanner = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		for(int i = 1; i < 11; i++) {
		System.out.println("정수를 입력해주세요.");
		
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			odd++;
			//짝수를 저장하는 변수++
		}
		else {
			even++;
			//홀수를 저장하는 변수++
		}
		}
		
		System.out.printf("홀수 : %d개, 짝수 : %d개\n", even, odd);
		
		
		
		
		
		
		
	}
}
