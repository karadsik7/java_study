package com.inc.animal;

public class AnimalTest {

	public static void main(String[] args) {
		Dog myDog = new Dog("dog" ,5);
		myDog.crying();
		myDog.eat();
		myDog.move();
		Cat myCat = new Cat("cat", 3);
		myCat.crying();
		myCat.eat();
		myCat.move();
		Chicken myCkn = new Chicken("chicken", 2);
		myCkn.crying();
		myCkn.eat();
		myCkn.move();
	}

}
