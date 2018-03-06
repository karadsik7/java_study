package com.inc.smart;

import java.awt.Toolkit;
import java.util.Scanner;

public class SmartPhone {
	
	Scanner scanner = new Scanner(System.in);
	
	boolean isPlaying = false;
	
	public void run() {
		while(true) {
			System.out.println("기능을 선택하세요.");
			System.out.println("1. 음악 재생");
			System.out.println("2. 계산기");
			System.out.println("0. 종료");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				//음악이 재생중이라면 실행시키면 안됨
				if(isPlaying) {
					System.out.println("이미 실행중입니다.");
				}else {
					playMusic();
				}
			}else if(choice == 2) {
				sum();
			}else {
				return;
			}
		}
	}
	
	public void playMusic() {
		isPlaying = true;
		new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 50; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				isPlaying = false;
			}
		}).start();
	}
	
	private void sum() {
		System.out.println("첫 번째 숫자를 입력하세요.");
		int a = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = scanner.nextInt();
		
		System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
		new SmartPhone().run();
	}
}
