package com.inc.coop.v1;

import java.util.Scanner;

public class Calculator {
	
	//1. 양쪽 개발자가 협업을 하는데 Calculator는 사용자의 입력을 받고 Operator로 넘겨주면 Operator가 계산하여 리턴해준다고
	// 약속했다.
	
	//2. Operator가 개발중이기 때문에 mock객체를 만들어서 사용한다.
	
	//private OperatorMock operator;
	
	private Operator operator;
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
			/*case 1 : System.out.println(operator.sum(a, b)); break;
			case 2 : System.out.println(operator.sub(a, b)); break;
			case 3 : System.out.println(operator.mul(a, b)); break;
			case 4 : System.out.println(operator.div(a, b)); break;*/
		//개발자 간에 약속이 지켜지지 않아 코드 사용이 불가능
		}
	}
	
	

}
