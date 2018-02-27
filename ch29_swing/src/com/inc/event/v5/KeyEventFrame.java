package com.inc.event.v5;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventFrame extends JFrame{
	
	JTextField field;
	
	public KeyEventFrame() {
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
	}

	public void initComponent() {
		
		field = new JTextField(10);
		field.addKeyListener(new KeyListener() {
			int count = 0;
			@Override
			public void keyTyped(KeyEvent arg0) {
				// OS에서 누름을 감지해야 작동하기 때문에 가끔 버그걸릴 때가 있어서 잘 안씀
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//실습 : ESC를 두번연속 입력하면 프로그램을 종료
				if(count == 2) {
					System.exit(0);
				}
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					count++;
				}else {
					count = 0;
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				
			}
		});
		
		add(field);
	}

	public static void main(String[] args) {
		new KeyEventFrame();
	}
	
}
