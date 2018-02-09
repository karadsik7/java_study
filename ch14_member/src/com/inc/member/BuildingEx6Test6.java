package com.inc.member;

public class BuildingEx6Test6 {

	
	
	
	public static void main(String[] args) {
		
		BuildingEx6.floor = 99;
		BuildingEx6 sc = new BuildingEx6();
		sc.name = "석천빌딩";
		sc.year = 2003;
		sc.getInfo();
		
			
		BuildingEx6 home = new BuildingEx6();
		home.name = "현대아파트";
		home.year = 2000;
		home.floor = 5;
		home.getInfo();
		
		
		
		
		
	}
	
	

}
