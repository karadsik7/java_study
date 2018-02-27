package com.inc.assignment;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class AssignmentEx3Frame extends JFrame {
	//EventListener중에 ItemListener라는 이벤트감지자가 있다. 
	//주로 JComboBox와 함께 활용이되는데 ItemListener라는 이벤트감지자를
	//공부한 뒤 이를 설명할 수 있는 ComboBox예제를 만들어보세요.
	JComboBox<String> box;
	String[] fruits = {"Apple", "Banana", "Coconut"};
	
	public AssignmentEx3Frame() {
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
		initEvent();
	}
	
	public void initEvent() {
		box.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				switch(e.getStateChange()) {
					case 1 : System.out.println(e.getItem() + " 선택"); break;
					case 2 : System.out.println(e.getItem() + " 해제"); break;
				}
				
			}
		});
	}

	public void initComponent() {
		
		box = new JComboBox<>(fruits);
		
		
		
		add(box);
	}

	public static void main(String[] args) {
		new AssignmentEx3Frame();
	}
}
