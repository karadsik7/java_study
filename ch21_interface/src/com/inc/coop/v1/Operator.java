package com.inc.coop.v1;

import java.util.Scanner;

public class Operator {
	//그러나 B개발자는 약속한 내용을 실수로 잊어버리고 Operator에서 직접 사용자로부터 입력을 받는다고
	//생각하고 실수하는 중이다.
	
	private Scanner scanner = new Scanner(System.in);
	
	public double sum() {
		return input() + input();
	}
	
	public double sub() {
		return input() - input();
	}
	
	public double mul() {
		return input() * input();
	}
	
	public double div() {
		return input() / input();
	}
	
	private double input() {
		System.out.println("숫자를 입력해주세요.");
		return scanner.nextDouble();
	}
	
	

}
