package com.inc.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		String[] sportStars = {"박태환", "김연아", "손연제"};
		String[] singers = {"윤종신", "윤하", "김동률"};
		
		System.out.println(sportStars[0]);
		System.out.println(singers[2]);
		
		System.out.println("------------");
		
		for(int i = 0; i < sportStars.length; i++) {
			System.out.println(sportStars[i]);
		}
			
		System.out.println("-----------------");
		//실습: 반복문을 활용해서  ~~가(이) 노래를 부릅니다.를 출력하세요
		
		for(int i = 0; i < singers.length; i++) {
			System.out.println(singers[i] + "가(이) 노래를 부릅니다.");
		}
		
		//실습2: while문을 사용해서 출력해보세요.
		System.out.println("--------");
		int j = 0;
		while(j < singers.length) {
			System.out.println(singers[j] + "가(이) 노래를 부릅니다.");
			j++;
		}

	}

}
