package com.inc.hello;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("테스트");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		frame.add(new JLabel("Hello Swing")); //라벨지정
		frame.add(new JButton("ok")); //버튼
		frame.add(new JButton("cancel"));
		
		frame.setSize(300, 150); //창 크기 지정 (지정안하면 최소크기)
		frame.setVisible(true); //true안하면 창안띄워줌
		
	}
}
