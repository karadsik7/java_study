package com.inc.canvas.v3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class CanvasFrame extends JFrame{
	
	Canvas canvas1;
	Canvas canvas2;
	
	Point startPoint;
	Point endPoint;
	
	
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
		initEvent();
	}
	
	private void initEvent() {
		canvas1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				startPoint.x = e.getX();
				startPoint.y = e.getY();
				canvas1.repaint();
			}
		});
		
		canvas2.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				startPoint.x = e.getX();
				startPoint.y = e.getY();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				endPoint.x = e.getX();
				endPoint.y = e.getY();
				canvas2.repaint();
			}
			
		});
		
	}

	public void initComponent() {
		startPoint = new Point();
		endPoint = new Point();
		canvas1 = new Canvas() {
			public void paint(Graphics g) {
				g.drawString(String.format("%d : %d", startPoint.x, startPoint.y), startPoint.x, startPoint.y);
				
			}
		};
		canvas2 = new Canvas() {

			@Override
			public void paint(Graphics g) {
				g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
			}
			
		};
		
		add(canvas1);
		add(canvas2);
		
	}

	public static void main(String[] args) {
		new CanvasFrame();
	}
	
}
