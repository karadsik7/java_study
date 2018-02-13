package com.inc.supplement;

public class ArrayEx1 {

	public static void main(String[] args) {
		String[] seats = {"박태환", "김연아", "손연재"};
		
		String[] seat2 = new String[3];
		
		seat2[0] = "박태환";
		seat2[1] = seats[1];
		seat2[2] = seats[2];
		
		for(String i : seat2) {
			System.out.println(i);
		}
		
		for(int i = 0; i < seat2.length; i++) {
			System.out.println(seats[i]);
		}
		
		

	}

}
