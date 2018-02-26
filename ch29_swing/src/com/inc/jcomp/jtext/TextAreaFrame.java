package com.inc.jcomp.jtext;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame{
	//여러줄 쓸수있는 텍스트에어리어
	
	JTextArea textArea;
	
	public TextAreaFrame() {
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
		textArea = new JTextArea();
		textArea.setBackground(Color.GRAY);
		textArea.setRows(5); //세로 크기 설정
		textArea.setColumns(20); //가로 크기 설정
		//그러나 이렇게 해도 엔터치거나 많이치면 계속 커짐
		textArea.setLineWrap(true); // 가로로 늘어나는것 방지함
		JScrollPane scrollPane = new JScrollPane(textArea); //스크롤페인과 합침
		add(scrollPane);
		//add(textArea);
		
	}

	public static void main(String[] args) {
		new TextAreaFrame();
	}

}
