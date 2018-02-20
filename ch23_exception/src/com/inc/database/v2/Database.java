package com.inc.database.v2;

public class Database {
	//실제 데이터베이스에 접근하는 것은 아니고 예외처리법을 중심으로
	
	private String memory;
	
	
	//예외를 강제로 발생해 Test로 넘긴다.
	
	public void insert(String input) throws NoneStringException{
		if(input == null || " ".equals(input) ){
			throw new NoneStringException("Spaces or null not allowed");
		}
		memory = input;
		System.out.println("저장 완료 :" + input);
	}
	
	
	public void read() {
		System.out.println("불러오기 완료 :"+ this.memory);
	}

}
