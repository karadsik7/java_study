package com.inc.member;

public class BuildingEx4Test4 {

	
	
	
	public static void main(String[] args) {
		BuildingEx4 sc = new BuildingEx4();
		sc.name = "석천빌딩";
		sc.year = 2003;
		
			
		BuildingEx4 home = new BuildingEx4();
		home.name = "현대아파트";
		home.year = 2000;
		home.floor = 5;
		
		//만약 실수로 10으로해야하는데 다른 값으로 초기화를 해버리면 바뀌어버림.
		
		
		sc.getInfo();
		home.getInfo();
		
	}

}
