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

	private void initEvent() {
		
		/*btn1.addMouseListener(new MouseAdapter() {

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
			
		}); 이렇게 하면 코드의 중복*/
		
		//그렇다면 중복을 막고 컴포넌트의 값을 가져온다
		
		MouseAdapter ma = new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) { // 매개변수가 이벤트를 발생시킨 컴포넌트를 가져올 수 있음
				
				getContentPane().setBackground(e.getComponent().getForeground());
				
			}
			
		};
		
		btn1.addMouseListener(ma);
		btn2.addMouseListener(ma);
		btn3.addMouseListener(ma);
		
	
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
