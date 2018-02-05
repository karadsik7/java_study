package com.inc.io;

import java.util.Scanner;

public class InputEx3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학점을 입력해 주세요.");
		
		char grade = scanner.next().charAt(0);
		
		
		switch(grade) {
			case 'A' : System.out.println("91~100");
			break;
			case 'B' : System.out.println("81~90");
			break;
			case 'C' : System.out.println("71~80");
			break;
			case 'D' : System.out.println("60~70");
			break;
			case 'F' : System.out.println("0~59");
			break;
			default : System.out.println("?");
		}
		
		
		
		
	}

}
