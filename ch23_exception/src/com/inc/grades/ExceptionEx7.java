package com.inc.grades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx7 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 100};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("과목 코드를 입력해주세요.");
			System.out.println("1.국어\n2.수학\n3.영어");
			
			//두개로 나눠진 trycatch문을 합치자.
			//1. 위의 try로 묶음
			//2. ArrayIndexOutOfBoundsException을 잡아야함
			//3. catch를 하나더만듬
			int choice = 0;
			try {
				choice = scanner.nextInt();
				System.out.printf("선택하신 과목의 점수는 %d점 입니다.\n", scores[choice-1]);
			}
			catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요.");
				scanner = new Scanner(System.in);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("1~3까지의 과목 번호만 입력하세요."); 
			}
			
			/*try {
				System.out.printf("선택하신 과목의 점수는 %d점 입니다.\n", scores[choice-1]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("1~3까지의 과목 번호만 입력하세요.");
			}*/
			
			
		}
		

	}

}
