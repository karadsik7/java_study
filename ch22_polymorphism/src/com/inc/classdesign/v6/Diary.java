package com.inc.classdesign.v6;

public class Diary {
	
	//다형성 활용
	DBConnector connector;
	
	public Diary(DBConnector connector) {
		this.connector = connector;
	}
	
	
	public void write(String memo) {
		connector.connect();
		connector.insert(memo);
	}
	

	
	

}
