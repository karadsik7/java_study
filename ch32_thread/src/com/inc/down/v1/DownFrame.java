package com.inc.down.v1;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

public class DownFrame extends JFrame{
	
	Canvas canvas;
	Point p;
	
	
	public DownFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);

		init();

		setVisible(true);
		boolean check = true;
		
		while(true) {
			if(p.y == getSize().height - 60) {
				check = false;
			}
			if(p.y == 0) {
				check = true;
			}
			if(check) {
				p.y++;
			}else {
				p.y--;
			}
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			canvas.repaint();
		}

	}

	public void init() {
		initComponent();
	}

	public void initComponent() {
		p = new Point((getSize().width / 2) - 15, 0);
		
		canvas = new Canvas() {
			public void paint(Graphics g) {
				g.fillOval(p.x, p.y, 30, 30);
			}
		};
		
		add(canvas);
		

	}

	public static void main(String[] args) {
		new DownFrame();
	}
	
}
