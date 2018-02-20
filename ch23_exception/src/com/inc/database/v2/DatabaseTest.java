package com.inc.database.v2;

import java.util.Scanner;

public class DatabaseTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("텍스트를 입력해 주세요.");
		String input = scanner.nextLine();
		
		Database db = new Database();
		
		//insert가 실행이 안됐을 시 리드를 실행 안시키는게 목적이므로 예외처리
		
		try {
		db.insert(input);
		db.read();
		}
		catch(NoneStringException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
