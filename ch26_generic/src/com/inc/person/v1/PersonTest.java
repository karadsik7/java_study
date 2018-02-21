package com.inc.person.v1;

public class PersonTest {

	public static void main(String[] args) {
		Person me = new Person("장진수", 'm');
		me.getInfo();
		
		Person you = new Person("아이유", "여자");
		you.getInfo();
		
		me.setGender("m");
		you.setGender('f'); 
		//데이터 타입이 중구난방해짐.
		
		me.getInfo();
		you.getInfo();
		

	}

}
