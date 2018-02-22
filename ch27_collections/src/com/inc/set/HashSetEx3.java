package com.inc.set;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		
		//로또
		
		HashSet<Integer> balls = new HashSet<>();
		
		while(balls.size() != 6) {
			int ball = (int)(Math.random() * 45) + 1;
			balls.add(ball);
		}
		
		System.out.println(balls);
		
		
		
	}

}
