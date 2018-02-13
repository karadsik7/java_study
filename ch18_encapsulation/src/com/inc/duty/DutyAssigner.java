package com.inc.duty;

import java.util.Scanner;

public class DutyAssigner {
	
	//접근제한자를 통해서 리팩토링
	
	
	int[] days;
	
	static Scanner scanner;
	
	DutyAssigner(){
		this.days = new int[5];
		scanner = new Scanner(System.in);
	}
	
	
	
	
	void createDays() {
		for(int i = 0; i < this.days.length; i++) {
			this.days[i] = (int)(Math.random()*5);
			for(int j = 0; j < i; j++) {
				if(days[i] == days[j]) {
					i--;
					break;
				}
			}
		}
		for(int daynum : this.days) {
			System.out.println(daynum);
		}
	}
	
	public void run() {
		createDays();
		for(int daynum : this.days) {
			System.out.println("이름을 입력해 주세요");
			String name = scanner.nextLine();
			char day = intToDay(daynum);
			System.out.printf("%s : %c\n", name, day);
		}
	}
	
	static char intToDay(int daynum) {
		char day = '월';
		switch(daynum) {
			case 0: day = '월'; break;
			case 1: day = '화'; break;
			case 2: day = '수'; break;
			case 3: day = '목'; break;
			case 4: day = '금'; break;
			default : System.out.println("잘못된 입력입니다.");
		}
		return day;
	}
}
