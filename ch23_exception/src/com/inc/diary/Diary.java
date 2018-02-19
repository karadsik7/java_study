package com.inc.diary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diary {
	
	private String[] pages = new String[5]; 
	
	private Scanner scanner = new Scanner(System.in); 
	private int choice;
	

	//과제 1. 캡슐화
	//과제2. 예외처리
	
	

	private void write(String memo) { 
		for(int i = 0; i < pages.length; i++) {
			if(pages[i] == null) {
				pages[i] = memo;
				System.out.printf("%d페이지에 저장했습니다.\n", i + 1);
				break; 
			}
		}
	}
	

	private void view(int page) {
		//예외처리1. 숫자가 인덱스범위를 벗어났을 때 발생하는 예외 처리
		
		
		/*if(page < 1 || page > pages.length) {
			System.out.println("없는 페이지입니다.");
			return;
		}*/
		
		try {
			if(pages[page - 1] == null){
				System.out.println("빈 페이지");
				return;
			}
			else{
			System.out.println(pages[page-1]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 페이지를 입력했습니다.");
			}
		
		
		
		
		}
		
	
	public void run() {
		while(true) { 
			choice = getChoice();
			switch(choice) { 
			case 0 : 
				System.out.println("프로그램을 종료합니다.");
				return; 
			case 1 : 
				System.out.println("저장할 메모를 입력하세요.");
				scanner.skip("[\\r\\n]+");
				write(scanner.next()); break;
			case 2 :
				System.out.println("열람할 페이지를 입력하세요.");
				try {
					view(scanner.nextInt());
				}
				catch(InputMismatchException e) {
					System.out.println("숫자로 입력하세요.");
				}
				break;
				
			default : System.out.println("잘못된 번호입니다.");
			}
			
			
		}
	
	}
	
	
	private int getChoice() { 
		System.out.println("원하시는 기능의 숫자를 입력하세요.");
		System.out.println("1. 다이어리 쓰기\t2. 다이어리 읽기\t0. 다이어리 종료");
		
		
		try {
			choice = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			
			System.out.println("숫자로 입력하세요.");
			scanner = new Scanner(System.in);
			getChoice();
		}
		
		return choice;
		
		//예외처리 2. 문자를 입력했을 때 발생하는 예외
		
		
		
	}
	
	
}
