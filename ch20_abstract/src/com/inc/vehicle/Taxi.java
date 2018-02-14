package com.inc.vehicle;

public class Taxi extends Vehicle{
	

	@Override
	public void arrive() {
		System.out.println("목적지에 도착했습니다.");
	}
	
	@Override
	public void pay() {
		System.out.println("요금은 10000원입니다.");
	}
	
	

}
