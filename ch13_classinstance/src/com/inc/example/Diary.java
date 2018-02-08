package com.inc.example;

import java.util.Scanner;

public class Diary {
	//다이어리 만들기
	
	String[] pages = new String[5]; // 5페이지 정도의 크기 설정
	//new (배열)은 생성할 때 데이터형의 기본값으로 생성함
	//String[] 의 기본값 : {null, null, null, null, null}
	//int[]의 기본값 : {0, 0, 0, 0, 0}
	//boolean[]의 기본값 : {false, false, false, false, false}
	
	Scanner scanner = new Scanner(System.in); // 사용자의 입력을 받기 위함
	

	
	
	

	void write(String memo) { //쓰기 기능 메서드 (memo라는 스트링을 받아와서 넘겨줌)
		//1페이지가 사용중이라면 2페이지를 사용하고... 덮어쓰기를 하면 안됨
		for(int i = 0; i < pages.length; i++) {
			//System.out.println(pages[i]);
			if(pages[i] == null) {
				pages[i] = memo;
				System.out.printf("%d페이지에 저장했습니다.\n", i + 1);
				break; //다음페이지에 접근못하도록 중지
			}
		}
	}
	

	void view(int page) {
		if(page < 1 || page > pages.length) {
			System.out.println("없는 페이지입니다.");
			return;
		}
		if(pages[page - 1] == null){
			System.out.println("빈 페이지");
			return;
		}
		else{
		System.out.println(pages[page-1]);}
	}
	
	void run() {
		while(true) { //사용자가 계속 읽고싶을 수 있으므로
			int choice = getChoice();
			switch(choice) { // 선택했을 때 행동을 설정
			case 0 : 
				System.out.println("프로그램을 종료합니다.");
				return; //return은 메서드종료 break면 while문만 탈출
			case 1 : 
				System.out.println("저장할 메모를 입력하세요.");
				scanner.skip("[\\r\\n]+");//개행문자 비우기
				write(scanner.next()); break;
			case 2 :
				System.out.println("열람할 페이지를 입력하세요.");
				view(scanner.nextInt()); break;
			default : System.out.println("잘못된 번호입니다.");
			}
			
			
		}
	
	}
	
	// 실습 : getChoice 메서드를 선언하세요.
	// 기능 : 1. 쓰기 2. 읽기 3. 종료
	
	int getChoice() { //선택값 출력 및 설정
		
		System.out.println("원하시는 기능의 숫자를 입력하세요.");
		System.out.println("1. 다이어리 쓰기\t2. 다이어리 읽기\t0. 다이어리 종료");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		Diary diary = new Diary();
		
		diary.run();
	}
	
	
	
	
	
}
