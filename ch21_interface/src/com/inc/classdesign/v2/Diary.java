package com.inc.classdesign.v2;

public class Diary {
	
	//v1은 db 커넥트하는 메서드가 다이어리 자체의 기능과 무관하므로 분리한다.
	
	//일단 상속은 1개의 클래스에만 할 수 있으므로 상속보다는 인스턴스 생성으로 한다.
	
	
	
	
	OracleConnector oConnect = new OracleConnector();
	
	
	public void write(String memo) {
		oConnect.connect();
		oConnect.insert(memo);
	}
	

	
	

}
