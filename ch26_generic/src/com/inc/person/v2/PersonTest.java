package com.inc.person.v2;

public class PersonTest {

	public static void main(String[] args) {
		//제네릭을 넣지 않으면 자동으로 오브젝트형으로 형변환
		
		Person<Character> me = new Person<Character>("장진수", 'm');
		me.getInfo();
		
		Person<String> you = new Person<String>("아이유", "여자");
		you.getInfo();
		
		/*me.setGender("m");
		you.setGender('f');*/
		
		me.setGender('남');
		you.setGender("woman");
		
		//사용한 쪽에서 데이터 타입을 특정지을 수 있음.
		
		me.getInfo();
		you.getInfo();
		

	}

}
