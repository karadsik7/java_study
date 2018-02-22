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
		p3.setAge(new Age(30, 29)); //오브젝트로 Age클래스객체가 형변환
		
		int manAge = ((Age)p3.getAge()).man; //오브젝트에서 Age 객체를 다시 사용가능하도록 Age로 형변환
		//그러나 처리우선순위가 .이 더 높으므로 형변환을 먼저 처리하도록 괄호로 우선순위를 부여함
		System.out.println(manAge);
		
		
		
		
		
		
		
		
		
		
	}

}
