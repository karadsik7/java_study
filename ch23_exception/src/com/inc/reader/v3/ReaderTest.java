package com.inc.reader.v3;

public class ReaderTest {

	public static void main(String[] args) {
		Reader reader = new Reader();
		System.out.println("파일 읽기를 시작합니다.");
		//reader.run("memo.txt");
		reader.run("memo1.txt");
		System.out.println("파일 읽기가 완료됐습니다.");

	}

}
