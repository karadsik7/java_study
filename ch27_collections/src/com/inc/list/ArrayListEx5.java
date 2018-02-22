package com.inc.list;

import java.util.ArrayList;

public class ArrayListEx5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		seats.add("윤성빈");
		seats.add("박태환");
		
		
		//어레이리스트 기능을 이용한 데이터 복제방법 2
		//그러나 이것도 완전한 방법은 아님
		
		ArrayList<String> seatsCopy = (ArrayList<String>)seats.clone();
		
		for(String i : seatsCopy) {
			System.out.println(i);
		}
		
		System.out.println("************");
		
		//방법3 : 가장 간단한 방법
		
		ArrayList<String> seatsCopy2 = new ArrayList<>(seats);
		//원리는 콜렉션 인터페이스를 구현한 모든 객체를 파라미터로 받아서 값을 가져올 수 있음.
		seats.remove(0); //원본데이터를 삭제했으나 영향을 미치지 않음
		
		for(String i : seatsCopy2) {
			System.out.println(i);
		}
		
		
		
	}

}
