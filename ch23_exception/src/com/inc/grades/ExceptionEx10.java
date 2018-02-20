package com.inc.grades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx10 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 100};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("과목 코드를 입력해주세요.");
			System.out.println("1.국어\n2.수학\n3.영어");
			
			int choice = 0;
			try {
				choice = scanner.nextInt();
				System.out.printf("선택하신 과목의 점수는 %d점 입니다.\n", scores[choice-1]);
			}
			catch(Exception e) {
				System.out.println("제대로 입력하세요.");
				scanner = new Scanner(System.in);
				return; //설령 리턴당해서 아래 구문을 실행안하고 반복문을 탈출하더라도 파이널리는 무조건 실행되고
				//종료됨.
			}
			finally {
				System.out.println("무조건 실행되는 코드");
				//예외처리와 관계없이 무조건 실행되야 한다면 finally를 쓰면 됨.
			}
		

		}

		
		
	}

}