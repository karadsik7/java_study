package com.inc.assignment;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AssignmentEx1Frame extends JFrame {
	//1.버튼 세개를 추가하시오.
	//2.버튼의 글씨색을 빨강, 파랑, 초록으로 변경하시오.
	//3.버튼을 눌렀을 때 해당버튼의 글씨색으로 JFrame 배경색을 변경하시오.
	
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	public AssignmentEx1Frame() {
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

	public void initEvent() {
		
		btn1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				getContentPane().setBackground(Color.RED);
			}
			
		});
		
		btn2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				getContentPane().setBackground(Color.BLUE);
			}
			
		});
		
		btn3.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				getContentPane().setBackground(Color.GREEN);
			}
			
		});
		
	
	}
	
	public void initComponent() {
		btn1 = new JButton("빨강");
		btn2 = new JButton("파랑");
		btn3 = new JButton("초록");
		
		btn1.setForeground(Color.RED);
		btn2.setForeground(Color.BLUE);
		btn3.setForeground(Color.GREEN);
		
		add(btn1);
		add(btn2);
		add(btn3);
	}

	public static void main(String[] args) {
		new AssignmentEx1Frame();
	}
}
