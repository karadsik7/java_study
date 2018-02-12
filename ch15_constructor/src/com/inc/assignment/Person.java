package com.inc.assignment;

public class Person {
	
	//임무1 - com.inc.assignment패키지에 Person이라는 클래스를 생성하시오.
    //인스턴스변수 : name, age, job
	
	//임무2 - 생성자들을 선언하시오.
	//1. name을 파라미터로 받아서 인스턴스 변수인 name을 초기화
	//2. name과 age를 파라미터로 받아서 인스턴스 변수인 name과 age를 초기화
	//(com.inc.example.Person클래스의 생성자와 동일)
	//3. name과 age와 job을 파라미터로 받아서 인스턴스 변수인 name, age, job을 초기화
	
	//임무3 - getInfo라는 메서드를 선언하시오(파라미터X, 리턴X)
	//ex) "성명 : 홍길동, 나이 : 26세, 직업 : 의적"
	
	String name;
	int age;
	String job = "무직";
	
	Person(String name){
		this.name = name;
		
	}
	
	
	Person(String name, int age){
		this(name); // 현재 생성자의 name스트링 변수를 받아서 파라미터가 String형 하나만 받는 생성자(바로위 생성자)
		//를 호출하는 명령어
		this.age = age;
		
	}
	
	Person(String name, int age, String job){
		/*this.name = name;
		this.age = age;*/
		this(name, age); // 현재 생성자의 name, age 값을 받아
		//바로 위 생성자인 스트링형과 인트형을 받는 생성자를 호출하는 명령어
		this.job = job;
	}
	
	void getInfo() {
		System.out.printf("성명 : %s, 나이 : %d세, 직업 : %s\n", this.name, this.age, this.job);
	}
	
	

}
