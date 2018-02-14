package com.inc.animal;

public class Dog extends Animal{

	Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void crying() {
		System.out.println(super.name + super.age + " : 멍멍");
	}

	//추상 클래스를 상속받으려면 해당 추상클래스에서 선언한 추상메서드를 자식클래스가 오버라이딩해야한다.
	
	
}
