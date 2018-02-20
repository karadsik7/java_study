package com.inc.coop.v3;

import java.util.Scanner;

public class Calculator {
	// 0으로 나눌 때 못나눈다고 에러를 발생시키고싶다면?
	// 1. Operator에서 조건문을 만들어 0으로 나눌 때 throw로 예외를 야기시키고 그걸 다시 야기한쪽으로 던짐
	// 2. 그러나 자식클래스는 부모인 인터페이스가 던지지않으면 못던지므로 인터페이스에서도 던짐
	// 3. calculate 메서드에서 처리
	
	private IOperator operator;
	private Scanner scanner;
	Calculator(){
		operator = new Operator();
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		while(true) {
			int choice = printInfo();
			if(choice == 0) {
				System.out.println("종료합니다.");
				return;
			}
			else if(choice > 5 && choice < 1) {
				System.out.println("잘못된 숫자를 입력했습니다.");
				continue;
			}
			else {
				calculate(choice);
			}
		}
	}
	
	private int printInfo() {
		System.out.println("기능을 선택해주세요.");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
		System.out.println("0. 종료");
		return scanner.nextInt();
	}
	
	private void calculate(int choice) {
		System.out.println("첫 번째 숫자를 입력해 주세요.");
		double a = scanner.nextDouble();
		System.out.println("두 번째 숫자를 입력해 주세요.");
		double b = scanner.nextDouble();
		switch(choice) {
			case 1 : System.out.println(operator.sum(a, b)); break;
			case 2 : System.out.println(operator.sub(a, b)); break;
			case 3 : System.out.println(operator.mul(a, b)); break;
			case 4 : 
				try {
				System.out.println(operator.div(a, b)); 
				}catch(Exception e) {
					//Opeator 클래스에서 지정한대로 예외처리 하고싶다면 e.getmessage 쓰면 되지만
					System.out.println(e.getMessage());
					//다르게 하고싶다면 여기서 바꾸면 된다.
				}
				break;
		}
	}
	
	

}
