package com.inc.map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx5 {

	public static void main(String[] args) {
		
		
		//arraylist 2개 만들어서 hashmap안에 담기
		
		ArrayList<String> sportStars = new ArrayList<>();
		sportStars.add("박태환");
		sportStars.add("김연아");
		sportStars.add("손연재");
		sportStars.add("이상화");
		ArrayList<String> singers = new ArrayList<>();
		singers.add("김연우");
		singers.add("아이유");
		singers.add("윤종신");
		
		
		HashMap<String, ArrayList<String>> sb = new HashMap<>();
		
		sb.put("스포츠 스타", sportStars);
		sb.put("가수", singers);
		
		System.out.println(sb.get("스포츠 스타"));
		System.out.println(sb.get("가수"));
		
		System.out.println(sb);
		
		
		
		HashMap<String, String> sportStars1 = new HashMap<>();
		sportStars1.put("park", "박태환");
		sportStars1.put("kim", "김연아");
		sportStars1.put("son", "손연재");
		sportStars1.put("lee", "이상화");
		HashMap<String, String> singers1 = new HashMap<>();
		singers1.put("kim1", "김연우");
		singers1.put("iu", "아이유");
		singers1.put("yoon", "윤종신");
		
		ArrayList<HashMap<String, String>> ar = new ArrayList<>();
		
		ar.add(sportStars1);
		ar.add(singers1);
		
		System.out.println(ar);
		System.out.println("******");
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		
		
		
		
	}

}
