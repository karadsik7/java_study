package com.inc.paramecium;

public class ParameciumTest {
	
	public static void main(String[] args) {
		
		ParameciumChild child = new ParameciumChild();
		System.out.println(child.name);
		child.eat();
		child.move();
		
		ParameciumMutation mut = new ParameciumMutation();
		System.out.println(mut.name);
		mut.eat();
		
		
		
		
	}

}
