package com.inc.jcomp.jbutton;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame{
	
	//멤버변수로 선언하는 이유 : 나중에 다른 클래스에서 쓸거라 메서드 지역변수로 선언하지 않음.
	JRadioButton rbtn1;
	JRadioButton rbtn2;
	
	JRadioButton age1;
	JRadioButton age2;
	JRadioButton age3;
	
	
	
	public RadioButtonFrame() {
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
		rbtn1 = new JRadioButton("male");
		rbtn2 = new JRadioButton("female");
		//라디오박스의 특징 : 하나만 선택가능, 먼저 하나가 선택되어있음.
		rbtn1.setSelected(true); // rbtn1을 먼저 선택해두는 것
		
		//rbtn1과 2를 같은 그룹으로 묶기
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rbtn1);
		btnGroup.add(rbtn2);
		
		add(rbtn1);
		add(rbtn2);
		
		//실습 : 성인, 미성년자, 모름 세개의 라디오버튼을 활성화하시오.
		//조건1. '모름' 버튼은 비활성화
		//조건2. 그룹으로 묶어서 셋중에 하나만 선택하도록 함
		//조건3. 기본값은 미성년자이도록 함
		
		age1 = new JRadioButton("성인");
		age2 = new JRadioButton("미성년자");
		age3 = new JRadioButton("모름");
		
		age3.setEnabled(false);
		
		ButtonGroup ageGroup = new ButtonGroup();
		ageGroup.add(age1);
		ageGroup.add(age2);
		ageGroup.add(age3);
		
		age2.setSelected(true);
		
		add(age1);
		add(age2);
		add(age3);
		
	}
	
	

	public static void main(String[] args) {
		new RadioButtonFrame();
	}

}
