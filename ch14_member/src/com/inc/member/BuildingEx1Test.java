package com.inc.member;

public class BuildingEx1Test {

	
	
	
	public static void main(String[] args) {
		BuildingEx1 sc = new BuildingEx1();
		sc.name = "석천빌딩";
		sc.year = 2003;
		
			
		BuildingEx1 home = new BuildingEx1();
		home.name = "현대아파트";
		home.year = 2000;
		
		
		sc.getInfo();
		home.getInfo();
		
	}

}
