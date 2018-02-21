package com.inc.list;

import java.util.ArrayList;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		seats.add("윤성빈");
		System.out.println(seats.get(0));
		for(int i = 0; i < seats.size(); i++) {
			System.out.printf("%s\t", seats.get(i));
		}
		 
		
		
		
		
	}

}
