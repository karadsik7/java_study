package com.inc.array;

public class ArrayEx04 {

	public static void main(String[] args) {
		//구구단 출력
		int[] dans = {2, 4, 7, 8};
		
		for(int dan : dans) {
			for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		
		
		
		
	}

}
