package com.inc.jcomp.jcombobox;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxFrame extends JFrame {
	//콤보박스 만들기
	
	JComboBox<String> fruitBox;
	
	JComboBox<Integer> scoreBox;
	
	public ComboBoxFrame() {
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
		String[] fruits = {"Apple", "Banana", "Coconut"};
		fruitBox = new JComboBox<>(fruits);
		fruitBox.addItem("Durian"); //배열에 아이템 추가하기, 그냥 배열에 추가해도됨
		add(fruitBox);
		
		//실습 : 인티저배열로 스코어박스 만들고 100점 삭제
		//Integer[] scores = {100, 90, 80, 70}; <= 이것도 가능
		Vector<Integer> scores = new Vector<>();
		scores.add(100);
		scores.add(90);
		scores.add(80);
		scores.add(70);
		
		
		scoreBox = new JComboBox<>(scores);
		scoreBox.removeItem(100);
		add(scoreBox);
		
	}

	public static void main(String[] args) {
		new ComboBoxFrame();
	}
}
