package com.inc.person.v1;

public class Person {
	
	private String name;
	private Object gender;
	
	public Person(String name, Object gender) {
		this.name = name;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(Object gender) {
		this.gender = gender;
	}
	
	void getInfo() {
		System.out.printf("이름 : %s, 성별 : %s\n", name, gender);
	}
	

}
