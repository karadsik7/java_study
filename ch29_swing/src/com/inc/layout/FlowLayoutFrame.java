package com.inc.layout;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutFrame extends JFrame{

	public FlowLayoutFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.RIGHT));

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
	}

	public void initComponent() {
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		
	}

	public static void main(String[] args) {
		new FlowLayoutFrame();
	}
}
