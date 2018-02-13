package com.inc.supplement;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[4];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
		System.out.println("숫자를 입력해주세요.");
		int number = scanner.nextInt();
		
		//실습 : numbers배열과 겹치지 않게 숫자를 받아서 10 20 30 40에 해당하면 겹칩니다 라고 출력하세요.
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == number) {
				System.out.println("겹칩니다.");
				break;
			}
		}
		
		
		
		
	}

}
