package com.inc.baseball;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Vector;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BaseBall extends JFrame{
	
	//야구게임 필요한것 
	//1. 숫자 세개를 입력받을 세개의 텍스트필드 (상단부 좌측)
	//2. 확인버튼, 리스타트버튼 (상단부 우측)
	//3. 결과출력필드 (중앙)
	//4. 상단부를 엮을 패널
	
	private JTextField firstField, secondField, thirdField;
	private JButton predictBtn, restartBtn;
	private JTextArea area;
	private JPanel userPanel;
	private ArrayList<Integer> predicts;
	private ArrayList<Integer> answers = new ArrayList<>();
	private int strike, ball;
	
	
	
	
	public BaseBall() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		init();

		setVisible(true);

	}

	private void init() {
		initComponent();
		initPanel();
		getAnswers();
		initEvent();
		
		
		
	}
	
	private void initEvent() {
		//2개 이상의 글자 못오게 막기(숫자만 오게 하는건 정규식을 안배워서 아직 불가)
		
		KeyAdapter ka = new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String text = ((JTextField)e.getComponent()).getText();
				if(text.length() > 1) {
					((JTextField)e.getComponent()).setText(text.charAt(text.length() - 1) + "");
				}
			}
		};
		
		firstField.addKeyListener(ka);
		secondField.addKeyListener(ka);
		thirdField.addKeyListener(ka);
		
		
		//커서 옮기기
		firstField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				secondField.requestFocus();
			}
		});
		secondField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				thirdField.requestFocus();
			}
		});
		
		//predict 버튼 눌렀을 시
		
		predictBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent arg0) {
				try {
					getPredicts();
					compare();
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "숫자만 입력하세요");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "중복되지 않는 숫자를 입력하세요");
				}
			}
		});
		
		restartBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent arg0) {
				getAnswers();
			}
			
		});
		
	}
	
	private void getPredicts() throws Exception{
		
		int first, second, third;
		
		first = Integer.parseInt(firstField.getText());
		second = Integer.parseInt(secondField.getText());
		third = Integer.parseInt(thirdField.getText());
		
		//중복체크를 위해 링크드해쉬셋을 이용
		
		LinkedHashSet<Integer> predictSet = new LinkedHashSet<>();
		
		predictSet.add(first);
		predictSet.add(second);
		predictSet.add(third);
		//중복일 경우엔 사이즈가 3이 안되므로 강제로 예외를 던짐
		if(predictSet.size() != 3) {
			throw new Exception();
		}
		
		//내려왔을 때 배열비교를 위해 어레이리스트로 작성
		
		predicts = new ArrayList<>(predictSet);
		
	}
		
	private void getAnswers() {
		//받아온 배열값과 정답 배열값 비교
		//먼저 컴퓨터의 랜덤값 생성
		
		LinkedHashSet<Integer> answerSet = new LinkedHashSet<>();
			while(answerSet.size() != 3) {
				answerSet.add((int)(Math.random() * 10));
			}
			//System.out.println(answerSet); 디버깅용
			
			answers = new ArrayList<>(answerSet);
	}
	
	private void compare() {
		
		for(int i = 0; i < answers.size(); i++) {
			if(answers.get(i) == predicts.get(i)) {
				strike++;
			}else{
				for(int j = 0; j < answers.size(); j++) {
					if(answers.get(i) == predicts.get(j)) {
						ball++;
					}
				}
			}
		}
		
		print();
	}
	
	private void print() {
		if(strike == 3) {
			JOptionPane.showMessageDialog(null, "3 strike out!");
			strike = 0;
			getAnswers();
			area.setText(null);
		}else if(strike == 0 && ball == 0) {
			//3아웃입니다
			area.append("3 OUT" + "\n");
		}else {
			//x스트라이크 x볼입니다.
			area.append(strike + "Strike, " + ball + "ball" + "\n");
			strike = 0;
			ball = 0;
		}
		
	}
	
	
	
	private void initPanel() {
		userPanel = new JPanel();
		
		userPanel.add(firstField);
		userPanel.add(secondField);
		userPanel.add(thirdField);
		userPanel.add(predictBtn);
		userPanel.add(restartBtn);
		
		add(userPanel, BorderLayout.NORTH);
		
	}

	private void initComponent() {
		firstField = new JTextField(3);
		secondField = new JTextField(3); 
		thirdField = new JTextField(3);
		
		predictBtn = new JButton("Predict!");
		restartBtn = new JButton("Restart T_T");
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBackground(Color.BLACK);
		area.setForeground(Color.WHITE);
		
		add(area);
		
		
		

	}

	public static void main(String[] args) {
		new BaseBall();
	}
	
}
