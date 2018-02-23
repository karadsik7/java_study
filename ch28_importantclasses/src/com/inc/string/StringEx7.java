package com.inc.string;

import java.util.Scanner;

public class StringEx7 {
	public static void main(String[] args) {
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(String i : phoneArr) {
			System.out.println(i);
		}
		
		//실습 : 이메일을 @를 기준으로 쪼개서 배열을 만드세요.
		
		String email = "apple@banana.com";
		String[] ex = email.split("@");
		for(String i : ex) {
			System.out.println(i);
		}
		
		//String replaced = phoneNumber.replace('-', ' ');
		
		
		String replaced = phoneNumber.replace("-", "");
		System.out.println(replaced);
		
		//실습
		String date = "2018-02-23";
		//1. 2018/02/23
		//2. 18/02/23
		
		//1.
		System.out.println(date.replace("-", "/"));
		
		//2.
		System.out.println(date.substring(date.indexOf("-") - 2).replace("-", "/"));
		
		
		
		
		
	}
}
