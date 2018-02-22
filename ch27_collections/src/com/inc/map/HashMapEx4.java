package com.inc.map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx4 {

	public static void main(String[] args) {
		HashMap<String, Object> yoon = new HashMap<>();
		yoon.put("name", "윤성빈");
		yoon.put("age", 25);
		yoon.put("job", "스켈레톤 선수");
		

		System.out.println(yoon.get("name"));
		System.out.println(yoon.get("age"));
		System.out.println(yoon.get("job"));
		
		HashMap<String, Object> kim = new HashMap<>();
		
		kim.put("name", "김연아");
		kim.put("age", 28);
		kim.put("job", "피겨 선수");
		
		System.out.println(kim.get("name"));
		System.out.println(kim.get("age"));
		System.out.println(kim.get("job"));
		
		
		ArrayList<HashMap<String, Object>> members = new ArrayList<>();
		
		//어레이리스트에 다 담고
		//윤성빈 나이 출력
		//김연아 직업 출력
		
		members.add(yoon);
		members.add(kim);
		System.out.println(members);
		System.out.println(members.get(0).get("age"));
		System.out.println(members.get(1).get("job"));
	}

}
