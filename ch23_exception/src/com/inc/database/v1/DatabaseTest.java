package com.inc.database.v1;

import java.util.Scanner;

public class DatabaseTest {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("텍스트를 입력해 주세요.");
		String input = scanner.nextLine();
		
		Database db = new Database();
		db.insert(input);
		db.read();
		
		

	}

}
