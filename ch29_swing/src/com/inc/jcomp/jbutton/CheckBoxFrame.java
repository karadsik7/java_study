package com.inc.jcomp.jbutton;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxFrame extends JFrame{
	
	public CheckBoxFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());
		
		init();

		setVisible(true);

	}
	
	private void init() {
		initComponent();
	}
	
	private void initComponent() {
		JCheckBox chkBox1 = new JCheckBox("영화");
		JCheckBox chkBox2 = new JCheckBox("독서");
		JCheckBox chkBox3 = new JCheckBox("게임");
		JCheckBox chkBox4 = new JCheckBox("여행");
		chkBox4.setEnabled(false); //체크박스 비활성화
		
		add(chkBox1);
		add(chkBox2);
		add(chkBox3);
		add(chkBox4);
		
		//실습 : 성주, 부산, 속초, 순천 4개의 체크박스를 만들어 추가해보세요
		
		JCheckBox travel1 = new JCheckBox("성주");
		JCheckBox travel2 = new JCheckBox("부산");
		JCheckBox travel3 = new JCheckBox("속초");
		JCheckBox travel4 = new JCheckBox("순천");
		travel1.setEnabled(false);
		travel4.setEnabled(false);
		
		
		add(travel1);
		add(travel2);
		add(travel3);
		add(travel4);
		
		
	}

	public static void main(String[] args) {
		new CheckBoxFrame();
	}
	
}
