package com.inc.database.v1;

public class Database {
	//실제 데이터베이스에 접근하는 것은 아니고 예외처리법을 중심으로
	
	private String memory;
	
	public void insert(String input) {
		//memory에는 ""또는 null이 저장될 수 없어야만 한다면?
		//1. 예외를 직접 처리
		if(input == null || " ".equals(input) /*스트링값 이퀄비교할땐 고정된값을 먼저주고 
		거기서 변화될 수 있는 값을 처리한다.*/){
			System.out.println("공백은 입력할 수 없습니다.");
			return;
		}
		memory = input;
		System.out.println("저장 완료 :" + input);
	}
	
	//그러나 문제는 멤버변수로 초기화한 memory의 기본값이 null이라 insert를 중지한다고해도 null이 출력되고
	//read마저 실행되기 때문에 의미가 없어보인다.
	
	public void read() {
		System.out.println("불러오기 완료 :"+ this.memory);
	}

}
