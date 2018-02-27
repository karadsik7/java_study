package com.inc.assignment;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AssignmentEx2Frame extends JFrame {
	//1.JTextField한개 JTextArea한개를 선언하시오.
	//2.JTextArea를 수정하지 못하게 막으시오(setEditable)
	//3.JTextField에서 텍스트를 입력하고 엔터를 쳤을 때
	//  JTextField의 내용이 JTextArea로 이동하게하고
	//  JTextField의 내용은 삭제하시오.(채팅처럼)
	
	JTextField textField;
	JTextArea textArea;
	
	public AssignmentEx2Frame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		

		init();

		setVisible(true);
	}

	public void init() {
		initComponent();
		initEvent();
	}
	
	public void initEvent() {
		textField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String buff = textField.getText();
					textArea.append(buff + "\n");
					textField.setText("");
					
				}
			}
			
		});
	}

	public void initComponent() {
		
		textField = new JTextField(10);
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
		
		textArea.setEditable(false);
		
		add(textField, BorderLayout.SOUTH);
		
		add(scroll, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		new AssignmentEx2Frame();
	}
}
