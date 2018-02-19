package com.inc.classdesign.v6;

public class DiaryTest {

	public static void main(String[] args) {
		
		Diary diary = new Diary(new MysqlConnector());
		
		diary.write("hi");
		
		

	}

}
