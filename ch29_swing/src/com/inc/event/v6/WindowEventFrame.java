package com.inc.event.v6;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEventFrame extends JFrame {
	public WindowEventFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());

		init();
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				//암기해야됨 컨펌다이얼로그 파라미터 (null, 메세지, 메세지창 제목, 옵션값)
				int choice = JOptionPane.showConfirmDialog(null , "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if(choice == 0) {
					System.exit(0);
				}
				System.out.println(choice);
			}
			
		});

		setVisible(true);

	}

	public void init() {
		initComponent();
	}

	public void initComponent() {

	}

	public static void main(String[] args) {
		new WindowEventFrame();
	}
}
