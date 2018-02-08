package com.inc.example;

import java.util.Scanner;

public class Assignment {
	
	//태블릿 PC 만들기
	// 계산기, 다이어리, 사용자기능1, 사용자기능2 를 조합해서 만들고 테스트 해보세요.
	
	// 계산기, 다이어리, 야구게임, 전화를 넣기로했다.
	Calculator calc = new Calculator();
	Diary diary = new Diary();
	Baseball bb = new Baseball();
	Phone phone = new Phone();
	Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Assignment ass = new Assignment();
		ass.run();
		
	}
	
	void run() {
		//사용자에게 값을 받고 기능으로 들어가야함
		//사용자에게 값을 받는 부분을 분리
		
		while(true) {
			int choice = choice();
		switch(choice) {
			case 0 : System.out.println("종료합니다."); return;
			case 1 : phone.call();break;
			case 2 : calc.run();break;
			case 3 : diary.run();break;
			case 4 : bb.run();break;
				
		}
		}
	}
	
	int choice() {
		System.out.println("원하시는 태블릿 pc의 기능을 입력하세요.");
		System.out.println("1. 전화");
		System.out.println("2. 계산기");
		System.out.println("3. 다이어리");
		System.out.println("4. 야구게임");
		System.out.println("0. 종료");
		
		return scanner.nextInt();
	}

}
