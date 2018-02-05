package com.inc.loop;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		
		int number = 1;
		
		while(number <= 9) {
			//System.out.println("2 x "+ number + " = " + 2*number);
			System.out.printf("2 x %d = %d\n", number, number*2);
			++number;
			
		}
		
		number = 1;
		//실습 : 5단을 출력해보세요.
		
		while(number <= 9) {
			System.out.printf("5 x %d = %d\n", number, number*5);
			++number;
		}
		
		number = 1;
		
		
		//실습2 : 5단을 출력하되 5 x 9 = 45가 아닌 5 x 6 = 30까지만 출력하세요.
		
		while(number <= 6) {
			System.out.printf("5 x %d = %d\n", number, number*5);
			++number;
		}
		
		System.out.println("-----------------");
		
		//실습3 : 2단부터 9단까지 출력하되 3과의 곱만 출력하시오.
		
		number = 2;
		
		while(number <= 9) {
			System.out.printf("%d x 3 = %d\n", number, number*3);
			++number;
		}
		

		System.out.println("-----------------");
		
		//실습 4 : 사용자로부터 몇단을 출력할지 입력 받은 뒤 해당 단을 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("몇단을 출력할지 입력하세요.");
		
			int level = scanner.nextInt();
			int num = 1;
			while(num <= 9) {
				System.out.printf("%d x %d = %d\n", level, num, num*level);
				num++;
			}
		
		
		
		
		
	}

	private static void charAt(int i) {
		// TODO Auto-generated method stub
		
	}

}
