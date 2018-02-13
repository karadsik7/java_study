package com.inc.decapsulation;

import java.util.Scanner;

public class IntCalculator {
	public char operator;
	public int memory1;
	public int memory2;
	public int result;
	public static final Scanner scanner = new Scanner(System.in);
	
	public void init() {
		System.out.println("연산의 종류를 입력해주세요.");
		operator = scanner.nextLine().charAt(0);
		
		System.out.println("첫 번째 숫자를 입력해주세요.");
		memory1 = scanner.nextInt();
		
		System.out.println("두 번째 숫자를 입력해주세요.");
		memory2 = scanner.nextInt();
		
	}
	
	
	public void run() {
		init();
		
		if(operator == '+') {
			result = sum();
		}
		else if(operator == '-') {
			result = sub();
		} 
		else {
			System.out.println("잘못된 입력입니다.\n프로그램을 종료합니다.");
			return;
		}
		print();
	}
	
	public int sum() {
		return memory1 + memory2;
	}
	
	public int sub() {
		return memory1 - memory2;
	}
	
	public void print() {
		System.out.printf("결과 : %d\n", result);
	}
	
	
	
	
	
}
