package com.inc.vehicle;

public class Bus extends Vehicle{


	@Override
	public void arrive() {
		System.out.println("이번 정거장은 ~~입니다.");
	}
	
	@Override
	public void pay() {
		System.out.println("요금은 1200원입니다.");
	}
	
	

}
