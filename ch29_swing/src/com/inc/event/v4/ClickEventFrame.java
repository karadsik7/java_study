package com.inc.event.v4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickEventFrame extends JFrame{
	JButton btn;
	JButton btn2;
	
	
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
		//마우스 어댑터 클래스는 마우스리스너 인터페이스를 구현하면 낭비되는 메서드를 방지해줌
	private void initEvent() {
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseExited(MouseEvent arg0) {
				System.out.println("마우스 나감");
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("마우스 눌림");
			}
			
		}
			
		);
		//실습 : btn2를 클릭했을 때 btn의 사이즈를 변경하시오.
		
		btn2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btn.setSize(new Dimension(300, 300));
				
			}
		});
		
		
	}

	public void initComponent() {
		btn = new JButton("click me!");
		btn2 = new JButton("버튼");
		
		add(btn);
		add(btn2);
	}

	public static void main(String[] args) {
		new ClickEventFrame();
	}
	
}
