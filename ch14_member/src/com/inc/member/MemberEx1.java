package com.inc.member;

public class MemberEx1 {
	//필드영역 (로컬영역을 제외한 영역이 필드영역)
	//여기에서 선언되는 변수는 멤버변수와 멤버메서드 (클래스 변수, 인스턴스 변수, 클래스 메서드, 인스턴스 메서드)

	String name = "JJS"; //멤버변수 (인스턴스 변수)//필드영역
	
	static String job = "학생"; //멤버변수 (클래스 변수)(static)//필드영역
	
	
	public static void main(String[] args) //파리미터의 변수도 지역변수
	{ //멤버 메서드 (클래스 메서드)(static)
		// 로컬영역(지역)
		//여기에서 선언되는 변수는 지역변수
		int number = 1; //지역변수 // 로컬영역
		MemberEx1 ex1 = new MemberEx1();
		ex1.getInfo(); //멤버메서드
		System.out.println(ex1.name);//name은 로컬안에 있다고 지역변수가 되는 것이 아니라 위에 있는
		//멤버변수를 호출한 것이기 때문에 멤버변수가 되는것
	}
	
	void getInfo() { //멤버 메서드 (인스턴스 메서드)
		System.out.printf("이름 : %s, 직업 :%s", name, job);
	}

}
