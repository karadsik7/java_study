package com.inc.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> odds = new LinkedList<>();
		odds.add(1);
		odds.add(3);
		odds.add(5);
		odds.add(7);
		odds.add(9);
		
		ArrayList<Integer> evens = new ArrayList<>();
		evens.add(2);
		evens.add(4);
		evens.add(6);
		evens.add(8);

		System.out.println(odds);
		System.out.println(evens);
		
		//출력이 해시코드로 나오지 않는 것은 오브젝트 클래스의 toString 메서드를 오버라이딩했기 때문임
		
		
		
		
	}

}
