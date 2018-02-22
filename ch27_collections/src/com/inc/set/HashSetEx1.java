package com.inc.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		//셋의 가장 큰 특징 : 중복을 허용하지 않는다.
		// 집합과 유사한 개념
		
		//그러나 정렬을 못하고 순서를 보장하지 않는다.
		
		HashSet<String> trainee = new HashSet<>();
		
		trainee.add("장하진");
		trainee.add("스텔라");
		trainee.add("소연");
		trainee.add("태연");
		trainee.add("서현");
		trainee.add("수영");
		trainee.add("효연");
		
		for(String i : trainee) {
			System.out.println(i);
		}
		
		System.out.println("******************");
		
		HashSet<String> member = new HashSet<>();
		
		member.add("태연");
		member.add("서현");
		member.add("수영");
		member.add("효연");
		member.add("써니");
		
		System.out.println(member);
		
		System.out.println("***************");
		
		//foreach 출력과 똑같은 기능
		Iterator it = member.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		//for로 바꾸면 이런 방식
		for(Iterator it2 = member.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
		
	}

}
