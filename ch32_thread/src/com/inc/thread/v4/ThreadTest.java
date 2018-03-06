package com.inc.thread.v4;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		//별도의 클래스 없이 내부 클래스로 작성
		
		//람다식 : 자바는 함수를 파라미터에 함수를 집어넣을 수 없지만 ()->{함수의 바디}를 통해서 제한적으로 가능
		//조건 : 구현하는 인터페이스의 추상메서드가 1개만 있어야함
		
		
		//방법1. 객체생성하자마자 실행 (보편적)
		//장점 : 코드를 줄일 수 있음
		//단점 : 외부에서 코드를 멈춘다거나 하는 외부 작업 불가능
		new Thread(new Runnable(){
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
	}).start();
		
		
		
		
		//방법2. 객체 생성
		Thread workingThread = new Thread(new Runnable(){
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
	});
		
		//방법3. 람다식
		Thread workingThread2 = new Thread(()->{
				for(int i = 0; i < 100; i++) {
					System.out.println("\t" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		});
		
		workingThread.start();
		workingThread2.start();
		
		//메인스레드 실행부
		
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
