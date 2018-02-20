package com.inc.reference;

public class ReferenceEx3 {
	
	public static void main(String[] args) {
		
		int i = 0;
		changer(i);
		System.out.println(i); //0
		
		
	}
	
	public static void changer(int i) {
		i++;
		System.out.println(i); //1
	}

}
