package com.inc.example;

public class ClassEx1 {

	public static void main(String[] args) {
		// Building 클래스를 객체화
		
		// new Building(); => 인스턴스
		System.out.println(new Building()); //값이 나오는 것이 아닌 해시코드(주소)값 출력
		
		Building increpas = new Building(); //변수에 데이터를 담을땐 데이터 타입이 같아야하므로 Building이라는
		//데이터 종류에 Building이라는 타입의 값을 넣은 것이라 생각
		
		increpas.name = "석천빌딩";
		increpas.year = 15;
		increpas.getInfo();
		System.out.println(increpas.name);
		System.out.println(increpas.year);
		
		//설계도는 재활용 할 수 있다는 장점이 있다. (장점1)
		
		Building myHome = new Building();
		
		myHome.name = "현대아파트";
		myHome.year = 18;
		myHome.getInfo();
		
		//실습 : 사람이라는 객체를 만들어보자
		// 1. Person이라는 클래스를 선언한다
		// 2. name, job이라는 두개의 변수와 getInfo()라는 메서드를 추가한다.
		// 3. Person이라는 클래스로부터 인스턴스를 세개 생성해보자 (1. 본인 2. 좋아하는 가수 3. 옆친구)
		
		
		Person me = new Person();
		Person favoriteSinger = new Person();
		Person friend = new Person();
		
		me.name = "장진수";
		me.job = "니트";
		
		favoriteSinger.name = "Twice";
		favoriteSinger.job = "가수";
		
		friend.name = "홍길동";
		friend.job = "학생";
		
		me.getInfo();
		favoriteSinger.getInfo();
		friend.getInfo();
		
		
	}

}
