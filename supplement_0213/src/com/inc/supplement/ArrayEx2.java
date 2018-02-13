package com.inc.supplement;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		String[][] gugudan = new String[8][9];
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				 gugudan[i-2][j-1] = String.format("%d x %d = %d\t", i, j, i * j);
			}
			
		}
		
		/*for(String[] dan : gugudan) {
			for(String gugu : dan) {
				System.out.print(gugu);
			}
			System.out.println();
		}*/
			Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("단을 입력해주세요.");
			int dan = scanner.nextInt();
			if(dan > 9 || dan < 2) {
				System.out.println("잘못된 숫자를 입력하셨습니다."); continue;
			}
			for(String str : gugudan[dan-2]) {
				System.out.println(str);
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
