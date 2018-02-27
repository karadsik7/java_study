package com.inc.event.v2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickEventFrame extends JFrame{
	JButton btn;
	
	public ClickEventFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
		initEvent();
	}

	private void initEvent() {
		btn.addMouseListener(new MyMouseListener(this));
		
		
		
	}

	public void initComponent() {
		btn = new JButton("click me!");
		
		add(btn);
		
	}

	public static void main(String[] args) {
		new ClickEventFrame();
	}
	
}
