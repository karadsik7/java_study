package com.inc.classdesign.v5;

public class OracleConnector implements DBConnector{
	
	
	
	@Override
	public void connect() {
		//oracle에 연결하는 로직
		System.out.println("oracle에 접속했습니다.");
	}
	
	@Override
	public void insert(String data) {
		//oracle에 데이터를 입력
		System.out.println("데이터를 저장했습니다.");
	}

}
