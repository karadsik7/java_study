package com.inc.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {

	public static void main(String[] args) {
		
		//링크드해쉬셋 : 입력한 순서를 유지한다.
		
		LinkedHashSet<String> trainee = new LinkedHashSet<>();
		
		trainee.add("장하진");
		trainee.add("스텔라");
		trainee.add("소연");
		trainee.add("태연");
		trainee.add("서현");
		trainee.add("수영");
		trainee.add("효연");

		LinkedHashSet<String> member = new LinkedHashSet<>();
		
		member.add("태연");
		member.add("서현");
		member.add("수영");
		member.add("효연");
		member.add("써니");
		
		System.out.println(trainee);
		System.out.println(member);
		
		//가나다순으로 정렬이 됐음
		
		
	}

}
