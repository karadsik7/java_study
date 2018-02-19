package com.inc.classdesign.v1;

public class Diary {
	
	//다이어리 기능을 만든다고 가정
	//오라클이나 sql과 같은 db를 이용한다고 가정, 실제 연결은 나중에
	
	private void oracleConnect() {
		//오라클에 연결하는 로직
		System.out.println("오라클 데이터베이스에 연결됐습니다."); //디버깅용
	}
	
	private void oracleInsert(String data) {
		//오라클에 데이터를 저장하는 로직
		System.out.println("저장이 완료됐습니다.");
	}
	
	//mysql을 쓰는걸로 바뀜
	
	private void mysqlConnect() {
		//mysql에 연결
		System.out.println("mysql에 연결됐습니다.");
	}
	
	private void mysqlInsert(String data) {
		//mysql에 저장
		System.out.println("mysql에 저장이 완료됐습니다.");
	}
	
	
	
	
	public void write(String memo) {
		//oracleConnect();
		//oracleInsert(memo);
		mysqlConnect();
		mysqlInsert(memo);
	}
	

	
	

}
