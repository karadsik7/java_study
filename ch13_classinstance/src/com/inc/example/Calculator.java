package com.inc.example;

import java.util.Scanner;

public class Calculator {
	//계산기는 다른 클래스에서도 사용할 수 있으므로 따로 계산기 객체를 생성해본다.
	
	double pi = 3.14; //1. 파이는 고정이므로 미리 값을 지정해둔다.
	
	
	Scanner scanner = new Scanner(System.in); // 2. 사용자에게 값을 받기 위한 스캐너
	
	
	
	double memory1;
	
	double memory2; //3. 사용자가 입력하는 값은 가변적이므로 변수만 선언해둔다.

	
	
	
	// 연산 기능 코딩 (메서드)
	
		void add() {
			System.out.println(memory1 + memory2);
	}
		void sub() {
			System.out.println(memory1 - memory2);
		}
		
	// 실습 : 곱하기와 나누기 추가
		
		void mul() {
			System.out.println(memory1 * memory2);
		}
		
		void div() {
			System.out.println(memory1 / memory2);
		}
		
	// 실습 : lengthOfCircle 메서드와 areaOfCircle이라는 메서드를 추가하시오
	// 실존하는 계산기에 없는 기능이라도 필요하면 만들면 된다.
		
		void lengthOfCircle() {
			System.out.println(2 * memory1 * pi);
		}
		
		void areaOfCircle() {
			System.out.println(pi * memory1 * memory1);
		}
		
		void printInfo() {
			System.out.println("연산의 종류를 입력해주세요.");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 원의 둘레");
			System.out.println("6. 원의 넓이");
			System.out.println("0. 종료");
		}
		
		void run() { // 프로그램 작동
			int choice;
			
			do {
				choice = getChoice(); //사용자 값을 받는 메서드를 실행
				if(choice == 0) {
					return;
				}
				operate(choice); // 계산하는 메서드 실행
			}
			while(true);
			}
		
		
		int getChoice() { //사용자가 연산값을 지정하는 부분
			printInfo();
			int choice = scanner.nextInt();
			if(choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				}
			else if(choice >= 5) {
				System.out.println("반지름을 입력해주세요.");
				memory1 = scanner.nextDouble();
			} 
			else {
				System.out.println("연산할 첫 번째 값을 입력하세요.");
				memory1 = scanner.nextDouble();
				System.out.println("연산할 두 번째 값을 입력하세요.");
				memory2 = scanner.nextDouble();
			}
			
			return choice;
		}
		
		void operate(int a) { //실제 계산부
			
			switch(a) {
			case 1 : add(); break;
			case 2 : sub(); break;
			case 3 : mul(); break;
			case 4 : div(); break;
			case 5 : lengthOfCircle(); break;
			case 6 : areaOfCircle(); break;
		}
		}

}
