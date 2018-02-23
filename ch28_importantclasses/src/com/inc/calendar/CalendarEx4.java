package com.inc.calendar;

import java.util.Calendar;

public class CalendarEx4 {
	
	public static void main(String[] args) {
		
		//날짜가 빠른지 느린지 비교
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal1.after(cal2));
		System.out.println(cal1.before(cal2));
		
		//1000일 뒤 날짜를 알고싶다면
		
		cal1.add(Calendar.DATE, 1000);
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH));
		System.out.println(cal1.get(Calendar.DATE));
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK));
		
		
	}
	
}
