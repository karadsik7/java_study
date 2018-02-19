package com.inc.classdesign.v4;

public class Diary {
	
	//구현 클래스에 의존하는 것이 아니라 인터페이스에 의존한다.
	DBConnector connector = new MysqlConnector();
	
	
	public void write(String memo) {
		connector.connect();
		connector.insert(memo);
	}
	

	
	

}
