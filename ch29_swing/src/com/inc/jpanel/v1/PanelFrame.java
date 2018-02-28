package com.inc.jpanel.v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelFrame extends JFrame{
	
	private JMenuBar menuBar;
	
	private JMenu fileMenu;
	private JMenu editMenu;
	
	private JPanel westPanel;
	private JPanel southPanel;
	private JPanel centerPanel;
	
	//west
	
	private JButton redBtn;
	private JButton blueBtn;
	private JButton yellowBtn;
	private JButton greenBtn;
	
	//south
	
	private JTextField field;
	private JTextArea area;
	private JButton sendBtn;
	
	//center
	
	
	public PanelFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(true);

		init();

		setVisible(true);

	}

	public void init() {
		
		initComponent();
		initMenu();
		initPanel();
	}
	
	private void initMenu() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		add(menuBar, BorderLayout.NORTH);
		
	}
	
	private void initPanel() {
		 //패널 파라미터의 기본레이아웃값 : 플로우 레이아웃
		westPanel = new JPanel(new GridLayout(2, 2));
		southPanel = new JPanel();
		//이방법으로도 파라미터 안쓰고 레이아웃값 설정 가능
		southPanel.setLayout(new BorderLayout());
		centerPanel = new JPanel();
		
		westPanel.setPreferredSize(new Dimension(100, 100));
		southPanel.setPreferredSize(new Dimension(getSize().width, 100));
		centerPanel.setBackground(Color.BLACK);
		
		westPanel.add(redBtn);
		westPanel.add(blueBtn);
		westPanel.add(greenBtn);
		westPanel.add(yellowBtn);
		
		southPanel.add(area);
		southPanel.add(field, BorderLayout.SOUTH);
		southPanel.add(sendBtn, BorderLayout.EAST);
		
		add(centerPanel);
		add(westPanel, BorderLayout.WEST);
		add(southPanel, BorderLayout.SOUTH);
		
	}
	

	public void initComponent() {
		redBtn = new JButton();
		blueBtn = new JButton();
		yellowBtn = new JButton();
		greenBtn = new JButton();
		
		redBtn.setBackground(Color.RED);
		blueBtn.setBackground(Color.BLUE);
		yellowBtn.setBackground(Color.YELLOW);
		greenBtn.setBackground(Color.GREEN);
		
		field = new JTextField(15);
		area = new JTextArea(5, 20);
		area.setEditable(false);
		sendBtn = new JButton("보내기");
		
		
		
		
	}

	public static void main(String[] args) {
		new PanelFrame();
	}
}
