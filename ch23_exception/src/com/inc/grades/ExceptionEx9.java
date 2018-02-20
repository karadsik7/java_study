package com.inc.grades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx9 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 100};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("과목 코드를 입력해주세요.");
			System.out.println("1.국어\n2.수학\n3.영어");
			//다형성을 통한 예외처리 최상위 예외인 Exception으로 쉽고 깔끔하게 처리
			int choice = 0;
			try {
				choice = scanner.nextInt();
				System.out.printf("선택하신 과목의 점수는 %d점 입니다.\n", scores[choice-1]);
			}
			catch(Exception e) {
				System.out.println("제대로 입력하세요.");
				scanner = new Scanner(System.in);
			}
		

		}

		
		
	}

}