package com.inc.person.v3;

public class PersonTest {

	public static void main(String[] args) {
		PersonBox box = new PersonBox(1);
		Person ps = new Person();

		ps.setAge(10);
		ps.setName("철수");
		
		box.add(ps);
		
		Person chul = box.getPerson(0);
		System.out.println(chul.getName());
		System.out.println(chul.getAge());
		
		Person p2 = new Person();
		p2.setAge(20);
		p2.setName("영희");
		
		box.add(p2);
		
		Person young = box.getPerson(1);
		System.out.println(young.getName());
		System.out.println(young.getAge());

	}

}
