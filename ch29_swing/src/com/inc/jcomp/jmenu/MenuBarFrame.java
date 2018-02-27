package com.inc.jcomp.jmenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBarFrame extends JFrame{
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	//파일에 들어갈 아이템
	JMenuItem newItem;
	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem saveAsItem;

	//에딧에 들어갈 아이템
	JMenuItem copyItem;
	JMenuItem pasteItem;
	
	//헬프에 들어갈 아이템
	JMenuItem webItem;
	JMenuItem callItem;

	
	
	
	public MenuBarFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		//setLayout(new FlowLayout());

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
		initMenu();
	}

	public void initComponent() {
		
	}
	
	public void initMenu() {
		//초기화
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		newItem = new JMenuItem("new");
		openItem = new JMenuItem("open");
		saveItem = new JMenuItem("save");
		saveAsItem = new JMenuItem("save as...");

		copyItem = new JMenuItem("copy");
		pasteItem = new JMenuItem("paste");
		
		webItem = new JMenuItem("web");
		callItem = new JMenuItem("call");
		
		//메뉴 단축키 설정(setMnemonic)
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		//메뉴 아이템 단축키 설정(setAccelerator)
		
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		
		//실습 : Help의 단축키를 H, web과 call사이에 구분선넣기 web에 컨트롤 W call에 컨트롤L
		
				//Help의 단축키
				
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
				//아이템 단축키
		
		webItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK));
		callItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK));
		
		
		//뉴아이템 이벤트 설정
		
		//newItem.addActionListener(new NewActionListener()); 다른 클래스로 만들면 결합도가 높음
		//인터페이스를 구현한 내부 익명 클래스로 생성
		newItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//JFrame의 모양과 색깔 변경
				getContentPane().setBackground(Color.RED);
				
			}
		});
		
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().setBackground(Color.WHITE);
				
			}
		});
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator(); //구분선
		fileMenu.add(saveAsItem);
		
		editMenu.add(copyItem);
		editMenu.add(pasteItem);

		helpMenu.add(webItem);
		helpMenu.addSeparator();
		helpMenu.add(callItem);
		
		//메뉴에 메뉴집어넣기
		editMenu.add(helpMenu);
		
		
		
		
		
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		//menuBar.add(helpMenu);
		//BorderLayout은 동,서,남,북,센터 경계로 레이아웃의 위치를 조정가능
		add(menuBar, BorderLayout.NORTH);
		
		
		
		
	}

	public static void main(String[] args) {
		new MenuBarFrame();
	}
		
}
