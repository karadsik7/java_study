package com.inc.painter.v1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class Painter extends JFrame{
	
	Canvas canvas;
	Point startPoint;
	Point endPoint;
	
	
	public Painter() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
		initEvent();
	}
	
	private void initEvent() {
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				startPoint = e.getPoint();
				canvas.repaint();
			}
		});
		
	}

	public void initComponent() {
		startPoint = new Point(-10, -10);
		endPoint = new Point();
		
		canvas = new Canvas() {
			public void paint(Graphics g) {
				g.fillOval(startPoint.x, startPoint.y, 10, 10);
			}
			
			public void update(Graphics g) {
				paint(g);
			}
			
			
		};
		
		add(canvas);
		
	}

	public static void main(String[] args) {
		new Painter();
	}
	
}
