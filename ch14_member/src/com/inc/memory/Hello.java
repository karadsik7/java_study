package com.inc.memory;

public class Hello {
	static String hello = "hi";
	String bye = "good bye";
	
	public static void sayHello() {
		System.out.println(hello);
		//System.out.println(bye);
		Hello hello = new Hello();
		hello.sayBye();
		
	}
	public void sayBye() {
		System.out.println(bye);
		System.out.println(hello);
		sayHello();
	}
}
