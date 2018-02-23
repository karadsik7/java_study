package com.inc.calendar;

import java.util.Calendar;

public class CalendarEx1 {
	
	public static void main(String[] args) {
		
		//Calendar today = new Calendar();
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR) + "년");
		System.out.println(today.get(Calendar.MONTH) + 1 + "월");
		//MONTH는 1월이 0으로 출력되므로 주의
		System.out.println(today.get(Calendar.DATE) + "일");
		//System.out.println(today.get(Calendar.DAY_OF_WEEK));
		//DayOfWeek은 1 - 일요일 7 - 토요일
		switch(today.get(Calendar.DAY_OF_WEEK)) {
			case 1 : System.out.println("일요일"); break;
			case 2 : System.out.println("월요일"); break;
			case 3 : System.out.println("화요일"); break;
			case 4 : System.out.println("수요일"); break;
			case 5 : System.out.println("목요일"); break;
			case 6 : System.out.println("금요일"); break;
			case 7 : System.out.println("토요일"); break;
		}
		
		System.out.println(today.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println(today.get(Calendar.MINUTE) + "분");
		System.out.println(today.get(Calendar.SECOND) + "초");
		
		//초시계의 경우 소수점값까지 반환해야한다.
		System.out.println(today.get(Calendar.MILLISECOND) + "초");
		
		
		
	}
	
}
