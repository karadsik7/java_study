package com.inc.example;

public class Person {
	
	String name;
	int age;
	int height;
	
	//변수는 기본적으로 사용하지 않으면 값이 증발하므로
	//저장해놓고 쓰기 위해서
	
	//기본생성자
	/*Person() {}*/
	
	//특징2 : 만약 파라미터를 받는 다른 형태의 생성자가 존재할 경우 기본 생성자를 따로 규정하지 않으면 기본 생성자의 형태인
	//클래스명 변수명 = new 클래스명(); 으로 인스턴스 생성이 불가능하다.
	
	// 파라미터 두개를 받는 생성자 
	Person(String name, int age){ //  생성자도 오버로딩이 가능하다.
								// 강제로 실행되기 때문에 개발자가 신경안써도 된다.
		this.name = name;
		this.age = age;
	}
	
	Person(String name, int age, int height){  //생성자 오버로딩
		
		// 실습 : 파라미터가 3개인 생성자를 만들고 만든 생성자로 본인의 정보를 담는 인스턴스를 생성해보세요.
		
		this.name = name;
		this.age = age;
		this.height = height;
		
		
	}
	
	/*void init(String name, int age) {
		//실습 : 파라미터로 받아온 데이터를 인스턴스 변수 name과 age에 저장하세요.
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age);
	}*/
	
	
	
	
	
	
}
