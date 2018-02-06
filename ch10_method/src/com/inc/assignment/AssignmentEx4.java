package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx4 {
	public static void main(String[] args) {
		//과제
		//1.사용자로부터 두개의 정수를 입력받는다.
		//2.큰 수의 제곱에서 작은 수의 제곱을 뺀 결과를 리턴하는
		//  메소드를 정의한다.
		//3.사용자로부터 입력받은 두개의 정수로 방금만든 메소드를 호출한다.
		//ex) 
		//(입력)
		//  10, 20
		//(출력)
		//  300
		
		//hint1 : 파라미터 int, int
		//hint2 : 리턴 int
		
		//일단 정수를 두번 입력받아야 하니 반복문으로 입력받자
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int number1 = scanner.nextInt();
		System.out.println("숫자를 입력해주세요.");
		int number2 = scanner.nextInt();
		
		//메서드를 활용하여 출력한다
		System.out.println(multiple(number1, number2));
		
		
	}
	
	//큰수의 제곱에서 작은수의 제곱을 뺀 결과를 리턴하는 메서드를 정의한다.
	
	public static int multiple(int number1, int number2) {
		//큰수와 작은수를 일단 비교해야 뺄수 있으니 비교문부터 만든다
		if(number1>=number2) {
			//m이 크면 그냥 제곱해서 빼면될것
			return (number1*number1)-(number2*number2);
		}
		else {
			//n이크면 n부터 제곱해서 뺀다
			return (number2*number2)-(number1*number1);
		}
	}

}
