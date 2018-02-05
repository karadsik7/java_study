package com.inc.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		String[] sportStars = {"박태환", "김연아", "손연제"};
		String[] singers = {"윤종신", "윤하", "김동률"};
		
		System.out.println(sportStars[0]);
		System.out.println(singers[2]);
		
		System.out.println("------------");
		
		for(String name : sportStars)
		{
			System.out.println(name);
		}
		//이런 개선된 for문은 편리하지만 i와 같은 특정한 인덱스값을 사용하지 못함 
			
		System.out.println("-----------------");
		
		//실습: 아래 반복문을 foreach로 바꿔보세요.
		
		for(String name1 : singers) {
			System.out.println(name1 + "가(이) 노래를 부릅니다.");
		}
		

	}

}
