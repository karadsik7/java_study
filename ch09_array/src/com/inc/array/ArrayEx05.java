package com.inc.array;

public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[] twos = {2, 4, 8, 16};
		int[] threes = {3, 9, 27, 81, 243};
		
		//배열을 담는 배열(2차원 배열)
		int[][] numbers = {twos, threes};
			
		
		System.out.println(twos);
		System.out.println(numbers[0]);
		System.out.println(twos[0]);
		System.out.println(numbers[0][0]);
		
		//실습 : 8, 9, 81을 위와 같이 출력
		
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][3]);
		
		System.out.println("----------------");
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println("****");
		
		
		
		
		/*for(int[] i : numbers) {
			for(int j : twos) {
				System.out.println(j);
			}
		
			for(int k : threes) {
				System.out.println(k);
			}
		
		}*/
		
		
		
		
		
		
	}

}
