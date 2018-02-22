package com.inc.map;

import java.util.HashMap;

public class HashMapEx3 {

	public static void main(String[] args) {
		//데이터는 중복이 가능하다.
		
		HashMap<String, Person> members = new HashMap<>();
		
		members.put("park", new Person("박태환", "수영 선수", 30));
		members.put("kim", new Person("김연아", "피겨 선수", 28));
		members.put("yoon", new Person("윤성빈", "스켈레톤 선수", 25));
		
		members.put("yun", new Person("윤성빈", "스켈레톤 선수", 25));
		
		System.out.println(members.get("yoon").getName());
		System.out.println(members.get("yun").getName());
		
		//존재하지 않는 키로 접근을하면 null을 반환한다.
		System.out.println(members.get("yoooooooon").getJob());
		
		
		
		
		
	}

}
