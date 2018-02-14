package com.inc.animal;

public class Chicken extends Animal{

	Chicken(String name, int age){
		super(name, age);
	}
	
	@Override
	public void crying() {
		System.out.println(name + " : 꼬꼬");
	}
	
	
}
