package com.inc.calendar;

import java.util.Calendar;

public class CalendarEx3 {
	
	public static void main(String[] args) {
		
		//특정일자의 정보 확인 => set
		
		Calendar worldCup = Calendar.getInstance();
		
		worldCup.set(Calendar.YEAR, 2002);
		worldCup.set(Calendar.MONTH, 4);
		worldCup.set(Calendar.DATE, 31);
		System.out.println(worldCup.get(Calendar.DAY_OF_WEEK));
		
		
		//이것도 같은 기능
		Calendar worldCup2 = Calendar.getInstance();
		
		worldCup2.set(2002, 4, 31);
		System.out.println(worldCup2.get(Calendar.DAY_OF_WEEK));
		
		
		//본인이 태어난 날짜의 요일을 알아내시오.
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(1992, 1, 17);
		
		System.out.println(birthday.get(Calendar.DAY_OF_WEEK));
		
		
	}
	
}
