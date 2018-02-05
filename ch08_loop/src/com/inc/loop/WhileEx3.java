package com.inc.loop;

public class WhileEx3 {

	public static void main(String[] args) {
		
		//2단부터 9단까지의 구구단
		
		int i = 2;
		
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
