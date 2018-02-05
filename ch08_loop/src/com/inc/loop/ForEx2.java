package com.inc.loop;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		
		//while을 for로
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 단을 입력해주세요");
		int dan = scanner.nextInt();
		
		for(int i = 1;i <= 9;i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		
		}*/
		
		//실습 while문을 이용해서 작성한 구구단 전체 출력을 for문으로 변환하시오.
		
		
		
		
		for(int dan = 2;dan <= 9;dan++) {
			for(int i = 1;i <= 9;i++) {
			System.out.printf("%d x %d = %d\t", dan, i, dan*i);	
		}
			System.out.println();
			}
		
		
		
	}

}
