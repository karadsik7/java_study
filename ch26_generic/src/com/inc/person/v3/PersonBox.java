package com.inc.person.v3;

public class PersonBox {
	
	private Person[] persons;
	
	public PersonBox(int size) {
		try {
			persons = new Person[size];
		}catch(NegativeArraySizeException e) {
			System.out.println("잘못된 사이즈 입니다.");
			persons = new Person[10];
		}
	}
	
	public void add(Person p) {
		for(int i = 0; i < persons.length; i++) {
			if(persons[i] == null) {
				persons[i] = p;
				break;
			}
		}
		if(persons[persons.length - 1] != null) {
		Person[] personsCopy = persons;
		persons = new Person[persons.length +1];
		for(int i = 0; i < personsCopy.length; i++) {
			persons[i] = personsCopy[i];
			}
		}
	}
	
	public Person getPerson(int i) {
		try {
			return persons[i];
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public void print() {
		for(int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
	}
	
	
	

}
