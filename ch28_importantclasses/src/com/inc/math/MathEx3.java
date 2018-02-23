package com.inc.math;

public class MathEx3 {
	public static void main(String[] args) {
		//floor - 내림 (작은 정수값)
		System.out.println(Math.floor(10.5));
		System.out.println(Math.floor(10.9999));
		System.out.println(Math.floor(10.1));
		System.out.println(Math.floor(-1.9));
		
		
		//ceil - 올림 (큰 정수값)
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(10.5));
		System.out.println(Math.ceil(-1.2));
		
		System.out.println("---------------");
		
		//round - 반올림
		
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.4999));
		System.out.println(Math.round(10.1));
		System.out.println(Math.round(-10.5));
		System.out.println(Math.round(-10.51));
		System.out.println(Math.round(-10.49));
		
		//max, min
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(-10, -20));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.min(-10, -20));
		
		
		
		
	}
}
