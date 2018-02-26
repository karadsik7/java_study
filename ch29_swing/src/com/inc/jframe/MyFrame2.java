package com.inc.jframe;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	//실습 : 
	//1. 제목 "실습1"
	//2. X눌렀을 때 무시
	//3. 200,150위치에 300x400 사이즈
	public MyFrame2() {
		setTitle("실습1");
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		setBounds(200, 150, 300, 400);
		
		setVisible(true);
	}
}
