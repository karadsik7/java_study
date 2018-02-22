package com.inc.list;

import java.util.ArrayList;

public class ArrayListEx4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		seats.add("윤성빈");
		
		//indexOf 활용2
		ArrayList<String> seatsCopy = seats;
		seatsCopy.remove(seatsCopy.indexOf("박태환"));
		
		for(String i : seatsCopy) {
			System.out.println(i);
		}
		System.out.println("-------");
		//그러나 이렇게 하는게 더 편함
		seatsCopy.remove("박태환");
		for(String i : seatsCopy) {
			System.out.println(i);
		}
		
		System.out.println("*******");
		
		//그러나 참조자료형이므로 Copy로 복사해봤자 같은 주소값을 참조해서 원본 데이터의 변형이 일어난다.
		//복사해오고 싶다면 새 인스턴스를 만들어서 복사해야함
		
		ArrayList<String> seatsCopy2 = new ArrayList<>();
		
		for(int i = 0; i < seats.size(); i++) {
			seatsCopy2.add(seats.get(i));
		}
		for(String i : seatsCopy2) {
			System.out.println(i);
		}
		
		System.out.println("0000000000000000");
		//위의 copy2는 원본의 seat와 전혀 별개의 인스턴스임
		
		seatsCopy2.remove("김연아");
		
		for(String i : seatsCopy2) {
			System.out.println(i);
		}
		
		System.out.println("위는 카피2");
		
		for(String i : seats) {
			System.out.println(i);
		}
		
		
		
		
	}

}
