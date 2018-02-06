package com.inc.example;

public class MethodEx7 {

	public static void main(String[] args) {

		
		String[] sportStars = {"박태환", "김연아", "손연재"};
		String[] singers = {"윤종신", "윤하", "김동률"};
		
		helloMembers(sportStars);
		helloMembers(singers); //재사용
		
		
		
		
	}
	
	public static void helloMembers(String[] members) {
		
		for(int i = 0; i < members.length; i++) {
			System.out.println("hello " + members[i]);
			
		}
	}

}
