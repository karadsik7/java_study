package com.inc.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame{

	public GridLayoutFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		//setResizable(false);
		setLayout(new GridLayout(3, 2, 10, 50));

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
	}

	public void initComponent() {
		add(new JButton("Apple"));
		add(new JButton("Banana"));
		add(new JButton("CoConut"));
		add(new JButton("Apple"));
		add(new JButton("Banana"));
		//add(new JButton("CoConut"));
		add(new JButton("Apple"));
		add(new JButton("Banana"));
		add(new JButton("CoConut"));
		add(new JButton("Durian"));
	}

	public static void main(String[] args) {
		new GridLayoutFrame();
	}
}
