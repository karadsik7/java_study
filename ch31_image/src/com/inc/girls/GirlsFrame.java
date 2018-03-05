package com.inc.girls;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;

public class GirlsFrame extends JFrame{
	
	private ArrayList<Member> memberList;
	
	
	//center
	
	private JLabel imageLabel;
	
	//bottom
	
	private JPanel southPanel;
	
	private JLabel questionLabel;
	private JTextField answerField;
	private JButton enterBtn;
	
	int randomNumber;
	
	
	public GirlsFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);

		init();

		setVisible(true);

	}

	public void init() {
		initMembers();
		initComponent();
		initEvent();
	}
	
	private void initEvent() {
		enterBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if(memberList.get(randomNumber).getName().equals(answerField.getText())) {
					JOptionPane.showMessageDialog(null, "정답!");
					randomNumber = (int)(Math.random() * memberList.size());
					imageLabel.setIcon(memberList.get(randomNumber).getImg());
				}else {
					JOptionPane.showMessageDialog(null, "오답!");
				}
				
			}
			
		});
	}

	private void initMembers() {
		memberList = new ArrayList<>();
		memberList.add(new Member("효연", "src/com/inc/images/hyoyeon.png"));
		memberList.add(new Member("제시카", "src/com/inc/images/jessica.png"));
		memberList.add(new Member("써니", "src/com/inc/images/sunny.png"));
		memberList.add(new Member("태연", "src/com/inc/images/taeyeon.png"));
		memberList.add(new Member("윤아", "src/com/inc/images/yunah.png"));
		memberList.add(new Member("유리", "src/com/inc/images/yuri.png"));
		
	}

	public void initComponent() {
		//랜덤 인덱스 구현
		randomNumber = (int)(Math.random() * memberList.size());
		//센터 이미지 출력
		imageLabel = new JLabel(memberList.get(randomNumber).getImg());
		//바텀 패널 설정
		southPanel = new JPanel(new FlowLayout());
		
		questionLabel = new JLabel("맞는 이름을 적으세요.");
		answerField = new JTextField(5);
		enterBtn = new JButton("enter");
		
		
		southPanel.add(questionLabel);
		southPanel.add(answerField);
		southPanel.add(enterBtn);
		
		add(imageLabel);
		add(southPanel, BorderLayout.SOUTH);
		
	
	}

	public static void main(String[] args) {
		new GirlsFrame();
	}

}
