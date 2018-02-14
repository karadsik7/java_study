package com.inc.animal;
//추상메서드를 가지는 클래스는 추상클래스만 가능하다.
//class 선언부에 abstract라는 키워드를 적는다.
public abstract class Animal {
	//프로그램에 동물 객체들이 필요하다.
	
	//동물의 공통적인 속성
	// 이름, 나이
	
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//공통적인 메서드
	
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void move() {
		System.out.println("움직인다.");
	}
	
	
	//추상메서드는 abstract라는 키워드가 붙는다.
	//만약 Animal 클래스를 상속받는 클래스는 아래의 메서드를 반드시 오버라이딩 해야 한다.
	public abstract void crying();
	
	
	
	
	
	
}
