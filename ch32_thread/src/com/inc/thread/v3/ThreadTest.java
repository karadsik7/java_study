package com.inc.thread.v3;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		
		//MultiThreadByImplements workingThread = new MultiThreadByImplements();
		
		Thread workingThread = new Thread(new MultiThreadByImplements());
		
		workingThread.start();
		
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
