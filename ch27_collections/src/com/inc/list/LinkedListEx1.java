package com.inc.list;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		
		//LinkedList와 ArrayList와의 차이점
		//1. 특성상 수정에 걸리는 시간이 짧다.
		//2. 대신 접근에 걸리는 시간이 느리다. (처음부터 읽어야하므로)
		
		LinkedList<Integer> odds = new LinkedList<>();
		odds.add(1);
		odds.add(3);
		odds.add(5);
		odds.add(7);
		odds.add(9);
		
		for(int i : odds) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		odds.remove(1); // 1이라는 데이터가 아닌 1번지를 삭제해버림
		odds.remove(new Integer(1)); //1이라는 데이터값을 삭제함
		
		for(int i : odds) {
			System.out.println(i);
		}
	}

}
