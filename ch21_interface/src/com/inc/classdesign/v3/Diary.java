package com.inc.classdesign.v3;

public class Diary {
	
	//mysql로 db가 바뀐경우
	
	
	
	//OracleConnector oConnect = new OracleConnector();
	MysqlConnector mConnect = new MysqlConnector();
	
	
	public void write(String memo) {
		mConnect.connecting();
		mConnect.add(memo);
	}
	

	
	

}
