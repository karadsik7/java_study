package com.inc.list;

import java.util.ArrayList;

public class ArrayListEx6 {
	
	public static void main(String[] args) {
		
		ArrayList<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		seats.add("윤성빈");
		seats.add("박태환");
		
		
		System.out.println(seats.indexOf("박태환") != -1);
		System.out.println(seats.contains("박태환")); //같은 효과
		
		
		
	}

}
