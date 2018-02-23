package com.inc.assignment;

import java.util.Scanner;
import java.util.TreeSet;

public class ChallengeEx2 {
	public static void main(String[] args) {
		//세 자리 이하의 정수를 차례로 입력 받다가 
		//999가 입력되면 프로그램을 종료하고 
		//그 때까지 입력된 최대값과 최소값을 출력하는 
		//프로그램을 작성하시오.
		//ex)입력 : 1, 3, 100, 50, 500, 200, 999
		//	출력 : 최댓값 : 500, 최솟값 : 1
		
		
		Scanner scanner = new Scanner(System.in);
		TreeSet<Integer> tree = new TreeSet<>();
		while(true) {
			System.out.println("숫자를 입력해주세요.");
			int userNum = scanner.nextInt();
			if(userNum == 999) {
				break;	
			}
			tree.add(userNum);
		}
		
		System.out.printf("최솟값 : %d, 최댓값 : %d", tree.first(), tree.last());
		scanner.close();
		
		System.out.println();
		//역정렬 방법
		tree = (TreeSet<Integer>)tree.descendingSet();
		System.out.printf("최솟값 : %d, 최댓값 : %d", tree.first(), tree.last());
		
		
		
	}
}
