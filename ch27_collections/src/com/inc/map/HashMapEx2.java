package com.inc.map;

import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, Person> members = new HashMap<>();
		
		members.put("park", new Person("박태환", "수영 선수", 30));
		members.put("kim", new Person("김연아", "피겨 선수", 28));
		members.put("yoon", new Person("윤성빈", "스켈레톤 선수", 25));
		
		members.put("kim", new Person("김연우", "가수", 45));
		
		Person kim = members.get("kim");
		System.out.println(kim.getName());
		
		//키값이 중복이면 덮어써버림
		
		
		
		
		
	}

}
