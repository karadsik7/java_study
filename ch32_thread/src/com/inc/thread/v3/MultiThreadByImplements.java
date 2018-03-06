package com.inc.thread.v3;

public class MultiThreadByImplements implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
