package com.inc.set;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		//셋의 가장 큰 특징 : 중복을 허용하지 않는다.
		// 집합과 유사한 개념
		
		HashSet<String> trainee = new HashSet<>();
		
		trainee.add("장하진");
		trainee.add("스텔라");
		trainee.add("소연");
		trainee.add("태연");
		trainee.add("서현");
		trainee.add("수영");
		trainee.add("효연");

		HashSet<String> member = new HashSet<>();
		
		member.add("태연");
		member.add("서현");
		member.add("수영");
		member.add("효연");
		member.add("써니");
		
		//차집합
		
		//멤버가 되지 못한 연습생들
		
		trainee.removeAll(member);
		
		System.out.println(trainee); 
		
		//연습생을 제외한 멤버
		
		member.removeAll(trainee);
		System.out.println(member);
		
		
		//교집합
		
		//연습생출신 멤버
		member.retainAll(trainee);
		System.out.println(member);
		
		
		//합집합
		//연습생+멤버 모두
		
		trainee.addAll(member);
		System.out.println(trainee);
		
	}

}
