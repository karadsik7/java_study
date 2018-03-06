package com.inc.thread.v2;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		//메인스레드가 워킹스레드를 생성한다.
		
		/*Thread workingThread = new Thread();
		
		workingThread.start();*/
		
		//그러나 스레드의 클래스는 비어있으므로 오버라이딩을 해야 작동함
		
		MultiThreadByExtends workingThread = new MultiThreadByExtends();
		
		workingThread.start();
		
		for(int i = 65; i < 165; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//사용시 주의점 : 스레드 스타트를 메인메서드의 코드 뒤에 넣어버리면 메인메서드가 모두 작업을 마치고
		//스타트를 만나서야 서브스레드가 작동시작하므로 서브스레드의 작동시점을 잘 잡아야됨
		
	}

}
