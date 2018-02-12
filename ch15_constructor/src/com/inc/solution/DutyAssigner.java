package com.inc.solution;

import java.util.Scanner;

public class DutyAssigner {
	
	//생성자 활용
	
	
	int[] days;
	
	static Scanner scanner;
	
	
	DutyAssigner(){ //요령 : 초기화는 생성자에서 한다.
		//위에서 초기화하나 별차이는 없는데 가독성측면에서 유리할 수도 있다.
		days = new int[5];
		scanner = new Scanner(System.in);
	}
	
	
	
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
