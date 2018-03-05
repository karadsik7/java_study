package com.inc.canvas.v2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class CanvasFrame extends JFrame{
	
	Canvas canvas;
	
	
	public CanvasFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
	}

	public void initComponent() {
		canvas = new Canvas() {
			@Override
			public void paint(Graphics g) {
				//원
				g.drawOval(200, 200, 100, 100);
				g.fillOval(202, 202, 96, 96);
				
				//다각형
				int[] xArr = {100, 200, 200, 100};
				int[] yArr = {100, 200, 100, 200};
				
				g.drawPolygon(xArr, yArr, xArr.length);
				
				//선
				g.drawLine(10, 10, 100, 200);
				
			}
		};
		add(canvas);
	}

	public static void main(String[] args) {
		new CanvasFrame();
	}
	
}
