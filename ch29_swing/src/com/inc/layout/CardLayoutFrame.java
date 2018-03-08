package com.inc.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutFrame extends JFrame{

	//카드레이아웃은 밖에서 계속 접근해야하므로 따로 객체생성해둠
	
	CardLayout cl;
	JButton firstNextBtn, firstPrevBtn, secondNextBtn, secondPrevBtn, thirdNextBtn, thirdPrevBtn;
	JButton moveThirdBtn, moveFirstBtn;
	JPanel firstPanel, secondPanel, thirdPanel;
	
	
	public CardLayoutFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 100, 1000, 700);
		setResizable(false);
		
		cl = new CardLayout();
		
		setLayout(cl);

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
		initEvent();
	}
	
	private void initEvent() {
		
		MouseAdapter prevNextMa = new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				String text = ((JButton)e.getComponent()).getText();
				if(text.equals("NEXT")) {
					cl.next(getContentPane());
				}else if(text.equals("PREV")) {
					cl.previous(getContentPane());
				}else if(text.equals("go Third")){
					cl.show(getContentPane(), "third");
				}else if(text.equals("go First")) {
					cl.show(getContentPane(), "first");
				}
			}
		};
		
		firstNextBtn.addMouseListener(prevNextMa);
		secondNextBtn.addMouseListener(prevNextMa);
		thirdNextBtn.addMouseListener(prevNextMa);
		firstPrevBtn.addMouseListener(prevNextMa);
		secondPrevBtn.addMouseListener(prevNextMa);
		thirdPrevBtn.addMouseListener(prevNextMa);
		moveThirdBtn.addMouseListener(prevNextMa);
		moveFirstBtn.addMouseListener(prevNextMa);
		
		
	}

	public void initComponent() {
		
		firstNextBtn = new JButton("NEXT");
		firstPrevBtn = new JButton("PREV");
		secondNextBtn = new JButton("NEXT");
		secondPrevBtn = new JButton("PREV");
		thirdNextBtn = new JButton("NEXT");
		thirdPrevBtn = new JButton("PREV");
		
		moveThirdBtn = new JButton("go Third");
		moveFirstBtn = new JButton("go First");
		
		firstPanel = new JPanel();
		firstPanel.setBackground(Color.RED);
		secondPanel = new JPanel();
		secondPanel.setBackground(Color.ORANGE);
		thirdPanel = new JPanel();
		thirdPanel.setBackground(Color.GREEN);
		
		firstPanel.add(firstPrevBtn);
		firstPanel.add(moveThirdBtn);
		firstPanel.add(firstNextBtn);
		secondPanel.add(secondPrevBtn);
		secondPanel.add(secondNextBtn);
		thirdPanel.add(thirdPrevBtn);
		thirdPanel.add(moveFirstBtn);
		thirdPanel.add(thirdNextBtn);
		
		
		
		add(firstPanel, "first");
		add(secondPanel);
		add(thirdPanel, "third");
		

	}

	public static void main(String[] args) {
		new CardLayoutFrame();
	}
	
}
