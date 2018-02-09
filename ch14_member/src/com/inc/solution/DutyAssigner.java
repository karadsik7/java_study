package com.inc.solution;

import java.util.Scanner;

public class DutyAssigner {
	//0이면 그대로, 1이면 제외
	int[] days = new int[5];
	
	//Scanner같은 경우는 객체별로 다른 값을 가질필요가
	//없기 때문에 클래스변수로 만드는게 효율적이다.
	static Scanner scanner = new Scanner(System.in);
	
	void createDays() {
		//random한 days만들기
		for(int i = 0; i < this.days.length; i++) {
			days[i] = (int)(Math.random()*5);
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
	
	void run() {
		createDays();
		for(int daynum : this.days) {
			System.out.println("이름을 입력해 주세요");
			String name = scanner.nextLine();
			char day = intToDay(daynum);
			System.out.printf("%s : %c\n", name, day);
		}
	}
	
	//intToDay의 경우 멤버변수에 접근하지 않기 때문에
	//클래스메소드로 만들어 두는게 효율적이다.
	//1.추후에 변경될시 멤버변수에 접근하는 것을 방지
	//2.외부에서 클래스의 이름으로 바로 접근;
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
