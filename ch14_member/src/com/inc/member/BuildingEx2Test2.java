package com.inc.member;

public class BuildingEx2Test2 {

	//층을 추가
	
	
	public static void main(String[] args) {
		BuildingEx2 sc = new BuildingEx2();
		sc.name = "석천빌딩";
		sc.year = 2003;
		sc.floor = 7;
			
		BuildingEx2 home = new BuildingEx2();
		home.name = "현대아파트";
		home.year = 2000;
		home.floor = 5;
		
		sc.getInfo();
		home.getInfo();
		
	}

}
