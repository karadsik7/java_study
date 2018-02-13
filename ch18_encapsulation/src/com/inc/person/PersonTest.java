package com.inc.person;

public class PersonTest {

	public static void main(String[] args) {
		//Person me = new Person();
		//me.getInfo(); // 사용할 수 있는 변수 및 메서드가 getInfo()밖에 없음 (나머지는 프라이빗이므로)
		
		//그러나 이름과 나이를 입력해야하므로 변수를 받아오기는 해야함
		//1. 첫 번째 방법으로 생성자를 사용할 수 있다.
		
		//Person me = new Person("장진수", 27);
		//me.getInfo();
		
		//그러나 이럴경우 생성자는 최초 단 한번 실행인데다가 값이 변화하면 인스턴스를 재생성해야하기 때문에 불완전하다.
		
		//2. Setter와 Getter를 만드는 방법
		
		Person me = new Person();
		me.setName("장진수");
		me.setAge(27);
		me.getInfo();
		
		
		
		
		

	}

}
