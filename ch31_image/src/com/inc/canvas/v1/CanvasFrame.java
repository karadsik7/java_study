package com.inc.canvas.v1;

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
				//g는 그림을 그리는 붓과 같은 존재다.
				g.drawRect(50, 50, 100, 200);
				g.drawRect(50, 50, 200, 100);
				
				//붓 색깔
				g.setColor(Color.RED);
				g.fillRect(60, 60, 80, 80);
				
				g.setColor(Color.BLUE);
				g.fillRect(160, 60, 80, 80);
				
				g.setColor(Color.GREEN);
				g.fillRect(60, 160, 80, 80);
				
				//호 그리기
				g.fillArc(160, 160, 80, 80, 180, 180);
				
				g.setFont(Font.getFont("견고딕"));
				g.setColor(Color.gray);
				g.drawString("연습만이 살길이다", 60, 30);
				
				g.fill3DRect(210, 160, 80, 80, true);
				
				
			}
		};
		add(canvas);
	}

	public static void main(String[] args) {
		new CanvasFrame();
	}
	
}
