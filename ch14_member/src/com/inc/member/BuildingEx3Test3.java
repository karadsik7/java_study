package com.inc.member;

public class BuildingEx3Test3 {

	
	//층을 10으로 바꿔야한다면 모든 ex3의 floor의 값을 10으로 개발자가 직접 변경해야함.
	
	public static void main(String[] args) {
		BuildingEx3 sc = new BuildingEx3();
		sc.name = "석천빌딩";
		sc.year = 2003;
		sc.floor = 10;
			
		BuildingEx3 home = new BuildingEx3();
		home.name = "현대아파트";
		home.year = 2000;
		home.floor = 10;
		
		sc.getInfo();
		home.getInfo();
		
	}

}
