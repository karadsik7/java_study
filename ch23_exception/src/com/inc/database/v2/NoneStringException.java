package com.inc.database.v2;

public class NoneStringException extends Exception {
	//throw 뒤에다가 썼기 때문에 이클립스가 자동으로 Exception을 상속받아준다.
	//스트링을 생성자로 받기 때문에 만들어준다.
	//사용자 정의 예외를 만들자
	
	public NoneStringException(String msg) {
		super(msg); //지금 만든 메서드의 생성자대로 부모의 생성자를 호출하지 않으면
		//부모인 Exception의 기본 생성자가 호출되므로 아무것도 출력되지 않게된다. 따라서
		//사용자 정의 메서드의 형태로 부모의 메서드를 호출해서 값을 넣어줘야한다.
	}
}
