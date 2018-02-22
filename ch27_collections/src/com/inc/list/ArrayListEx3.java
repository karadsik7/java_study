package com.inc.list;

import java.util.ArrayList;

public class ArrayListEx3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		seats.add("윤성빈");
		
		//리스트의 특징
		//1. 데이터를 순서대로 저장한다. (정렬기능)
		//2. 똑같은 데이터를 또 저장할 수 있다. (데이터의 중복이 가능하다.)
		
		seats.add("박태환");
		
		for(String i : seats) {
			System.out.printf("%s\t", i);
		}
		System.out.println();
		
		//3. 데이터의 값을 입력하면 데이터가 위치한 인덱스도 알아낼 수 있다.
		
		System.out.println(seats.indexOf("김연아"));
		System.out.println(seats.indexOf("박태환"));
		System.out.println(seats.lastIndexOf("박태환"));
		System.out.println(seats.indexOf("park")); //없으면 -1을 반환
		
		if(seats.indexOf("으아악") != -1) { //indexOf를 응용해서 조건문에 활용하면 좋다.
			//list에 해당 값이 있는지 확인하기에 좋음
			System.out.println("으아악이 있습니다.");
		}else {
			System.out.println("으아악은 없습니다.");
		}
		
	}

}
