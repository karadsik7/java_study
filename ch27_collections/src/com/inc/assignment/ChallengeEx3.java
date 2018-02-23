package com.inc.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeEx3 {
	public static void main(String[] args) {
		Character[] increpas = {'I', 'N', 'C', 'R', 'E', 'P', 'A', 'S'};
		
		//문자 한 개를 입력받아 위 배열에서의 위치를 출력하는 
		//프로그램을 작성하시오.
		//첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 
		//"none" 라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("확인할 문자를 입력해주세요.");
		char userChar = scanner.nextLine().charAt(0);
		int index = Arrays.asList(increpas).indexOf(userChar);
		
		if(index != -1) {
			System.out.println(index);	
		}else {
			System.out.println("none");
		}
		scanner.close();
		
				
		
	}
}
