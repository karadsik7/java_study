package com.inc.person.v4;

public class BoxTest {

	public static void main(String[] args) {
		Box<Person> pbox = new Box<Person>(1);
		Person p1 = new Person();
		p1.setName("철수");
		p1.setAge(10);
		pbox.add(p1);
		System.out.println(pbox.get(0).getAge());
		System.out.println(pbox.get(0).getName());
		System.out.println("***********");
		
		Box<String> fruits = new Box<String>(2);
		fruits.add("사과");
		fruits.add("메론");
		fruits.add("감");
		fruits.add("배");
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		System.out.println("---------------");
		fruits.print();
		
		
	}

}
