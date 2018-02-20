package com.inc.grades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx6 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 100};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("과목 코드를 입력해주세요.");
			System.out.println("1.국어\n2.수학\n3.영어");
			
			//예외를 막는 것보다 발생 후 처리가 쉽다.
			
			int choice = 0;
			try {
				choice = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				scanner = new Scanner(System.in);
				continue;
			}
			
			try {
				System.out.printf("선택하신 과목의 점수는 %d점 입니다.\n", scores[choice-1]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("1~3까지의 과목 번호만 입력하세요.");
			}
			
			
		}
		

	}

}
