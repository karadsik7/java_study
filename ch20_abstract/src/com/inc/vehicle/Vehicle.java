package com.inc.vehicle;

public abstract class Vehicle {
	
	
	public void board() {
		System.out.println("탑승한다.");
	}
	
	public abstract void arrive();
	
	public abstract void pay();
	

}
