package com.inc.example;

public class WrapperEx3 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("박태환");
		p1.setAge(30);
		
		Person p2 = new Person();
		p2.setName("김연아");
		p2.setAge("30"); //스트링도 담을 수 있음. (오브젝트 클래스를 이용한 다형성)
		
		Person p3 = new Person();
		p3.setName("윤성빈");
		p3.setAge(new Age(30, 29));
		
		int manAge = ((Age)p3.getAge()).man;
		System.out.println(manAge);
		
		
		
		
		
		
		
		
		
		
	}

}
