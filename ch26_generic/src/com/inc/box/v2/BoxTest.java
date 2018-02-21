package com.inc.box.v2;

public class BoxTest {

	public static void main(String[] args) {
		StringBox box = new StringBox(3);
		box.add("apple");
		box.add("banana");
		box.add("coconut");
		box.add("hi");
		System.out.println(box.get(3));
		
		

	}

}
