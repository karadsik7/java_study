package com.inc.down.v2;

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

	}

	public void init() {
		initComponent();
		initThread();
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
	
	private void initThread() {
		
		new Thread(new Runnable() {
			public void run() {
				boolean check = true;
				
				while(true) {
					if(p.y == getSize().height - 60) {
						check = false;
						p.x += 10;
					}
					if(p.y == 0) {
						check = true;
						p.x += 10;
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
		}).start();
		
		
		
	}

	public static void main(String[] args) {
		new DownFrame();
	}
	
}
