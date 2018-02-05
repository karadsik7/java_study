package com.inc.io;

import java.util.Scanner;

public class InputEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		
		int age = scanner.nextInt();
		//System.out.println(age);
		if(age >= 20) {
			System.out.println("관람 가능합니다");
		}
		else {
			System.out.println("관람 불가합니다");
		}
		
		
		
		
		
	}

}
