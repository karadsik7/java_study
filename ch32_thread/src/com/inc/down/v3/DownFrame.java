package com.inc.down.v3;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;

public class DownFrame extends JFrame{
	
	//synchronized : 동기화 => 멀티스레드 환경에서 동시에 값에 접근하는 것을 제한함
	//Vector : 어레이리스트와 동일하나 멀티스레드 환경에서 동시에 접근을 허용하지 않아 무결성을 보장
	
	Canvas canvas;
	Vector<Point> pointList;
	
	
	public DownFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);

		init();

		setVisible(true);
		
		while(true) {
			initThread();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void init() {
		pointList = new Vector<>();
		initComponent();
		initThread();
	}

	public void initComponent() {
		
		canvas = new Canvas() {
			public void paint(Graphics g) {
				synchronized (pointList) {
					for(Point p : pointList) {
						g.fillOval(p.x, p.y, 30, 30);
					}
				}
				
			}
		};
		
		add(canvas);

	}
	
	private void initThread() {
		Point p = new Point();
		p.x = (int)(Math.random() * getSize().width);
		synchronized (pointList) {
			pointList.add(p);	
		}
		
		
		new Thread(new Runnable() {
			public void run() {
				
				boolean check = true;
				
				while(true) {
					if(p.y == getSize().height) {
						synchronized (pointList) {
							pointList.remove(p);
							return;
						}
					}
					p.y++;
					
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
