package com.inc.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame{
	public BorderLayoutFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		//setLayout(new BorderLayout());
		//보더레이아웃이 기본값이므로 지정안해도됨
		

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
	}

	public void initComponent() {
		JButton btn1 = new JButton("Apple");
		JButton btn2 = new JButton("Banana");
		JButton btn3 = new JButton("Coconut");
		JButton btn4 = new JButton("Durian");
		JButton btn5 = new JButton("Eggflant");
		
		add(btn1);
		add(btn2, BorderLayout.EAST);
		add(btn3, BorderLayout.WEST);
		add(btn4, BorderLayout.NORTH);
		add(btn5, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		new BorderLayoutFrame();
	}
}
