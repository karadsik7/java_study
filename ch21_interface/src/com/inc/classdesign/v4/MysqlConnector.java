package com.inc.classdesign.v4;

public class MysqlConnector implements DBConnector{
	
	@Override
	public void connect() {
		//mysql에 연결하는 로직
		System.out.println("mysql에 접속했습니다.");
	}
	
	@Override
	public void insert(String data) {
		//mysql에 데이터를 입력
		System.out.println("데이터를 저장했습니다.");
	}


	
	

}
