package com.inc.classdesign.v5;

public class Diary {
	
	//다시 오라클로 돌아갈 때 어떤 부분을 수정해야하는가?
	
	DBConnector connector = new OracleConnector();
	//인스턴스 생성부만 수정하면 끝
	
	//인터페이스의 장점
	//결합도가 낮아지고 코드 수정의 부담이 적어짐 => 유지보수 효율성 증가
	
	public void write(String memo) {
		connector.connect();
		connector.insert(memo);
	}
	

	
	

}
