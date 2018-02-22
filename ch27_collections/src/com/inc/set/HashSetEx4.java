package com.inc.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx4 {

	public static void main(String[] args) {
		
		//사용자에게 겹치지 않는 숫자를 받아내기
		
		Scanner scanner = new Scanner(System.in);
		
		HashSet<Integer> predicts = new HashSet<>();
		
		
		while(predicts.size() != 5) {
			System.out.println("숫자를 입력해 주세요.");
			int user = scanner.nextInt();
			if(predicts.add(user)){
				predicts.add(user);	
			}else {
				System.out.println("중복입니다. 다시 입력하세요");
			}
		}
		System.out.println(predicts);
	
	}

}
