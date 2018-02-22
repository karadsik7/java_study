package com.inc.map;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		//맵은 기본적으로 키와 밸류를 묶어서 만드는 리스트
		//보통 객체를 저장하는데 쓰인다.
		
		HashMap<String, Person> members = new HashMap<>();
		
		members.put("park", new Person("박태환", "수영 선수", 30));
		members.put("kim", new Person("김연아", "피겨 선수", 28));
		members.put("yoon", new Person("윤성빈", "스켈레톤 선수", 25));
		
		Person yoon = members.get("yoon");
		System.out.println(yoon.getJob());
		
		
		
	}

}
