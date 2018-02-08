package com.inc.example;

import java.util.Scanner;

public class SmartPhone {

	
	//스마트폰에 필요한 기능 : 전화, 다이어리, 계산기
	
	Calculator calc = new Calculator();
	Diary diary = new Diary();
	Phone phone = new Phone();
	Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		SmartPhone sphone = new SmartPhone();
		sphone.run();
		

	}
	
	void run() {
		while(true) {
			int choice = showInfo();
			switch(choice) {
				case 0 : System.out.println("종료합니다."); return;
				case 1 : phone.call(); break;
				case 2 : calc.run(); break;
				case 3 : diary.run(); break;
				default : System.out.println("잘못된 입력입니다."); break;	
			}
			}
		}
	
	
	int showInfo() {
		System.out.println("어떤 기능을 사용하시겠습니까?");
		System.out.println("1. 전화");
		System.out.println("2. 계산기");
		System.out.println("3. 다이어리");
		System.out.println("0. 종료");
		
		return scanner.nextInt();
		
	}

}
