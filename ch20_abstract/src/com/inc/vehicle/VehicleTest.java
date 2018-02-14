package com.inc.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		
		Taxi tax = new Taxi();
		tax.board();
		tax.arrive();
		tax.pay();
		
		Bus bus = new Bus();
		bus.board();
		bus.pay();
		bus.arrive();
		

	}

}
