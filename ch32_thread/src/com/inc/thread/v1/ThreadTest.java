package com.inc.thread.v1;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		//JVM의 스레드는 메인스레드
		
		for(int i = 65; i < 165; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
