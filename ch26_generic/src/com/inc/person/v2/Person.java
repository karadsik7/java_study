package com.inc.person.v2;
//규약상 타입때문에 제네릭을쓰면 대문자T로 표시
public class Person<T> {
	
	private String name;
	private T gender;
	
	public Person(String name, T gender) {
		this.name = name;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(T gender) {
		this.gender = gender;
	}
	
	void getInfo() {
		System.out.printf("이름 : %s, 성별 : %s\n", name, gender);
	}
	

}
