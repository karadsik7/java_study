package com.inc.calendar;

import java.util.Calendar;

public class CalendarEx2 {
	
	public static void main(String[] args) {
		
		//10년 뒤의 날짜를 알고싶다면?
		
		Calendar today = Calendar.getInstance();
		
		/*today.add(Calendar.YEAR, 10);
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		*/
		
		//실습 : 2달 뒤 오늘이 무슨 요일인지 출력하세요.
		
		today.add(Calendar.MONTH, 2);
		
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		
		switch(today.get(Calendar.DAY_OF_WEEK)) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
	}
		
		
	}
	
}
