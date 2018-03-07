package com.inc.down.assignment;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DownFrame extends JFrame{
	//과제 : 사람을 키보드로 왼쪽오른쪽 조작해서 움직이게 하고 스레드로 눈내리게 만들고 그걸 피하는것과 유사한
		//프로그램을 만드세요
	
	JPanel canvas;
	Image manImg;
	Point manPoint;
	Vector<Point> pointList;
	long startTime = System.currentTimeMillis();
	
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
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void init() {
		
		initComponent();
		initThread();
		initEvent();
	}
	

	private void initEvent() {
		
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					manPoint.x += 50;
					canvas.repaint();
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					manPoint.x -= 50;
					canvas.repaint();
				}
			}
		});
		
		
		
	}

	public void initComponent() {
		pointList = new Vector<>();
		ImageIcon i = new ImageIcon("src/com/inc/images/man.png");
		manImg = i.getImage();
		manPoint = new Point(30, getSize().height - 100);
		
		
		canvas = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
					g.clearRect(0, 0, getSize().width, getSize().height);
					synchronized (pointList) {
						for(Point p : pointList) {
							double distance = Point.distance(p.x, p.y, manPoint.x, manPoint.y);
							if(distance < 10) {
								System.exit(0);
							}
							g.fillOval(p.x, p.y, 30, 30);
						}
						g.drawImage(manImg, manPoint.x, manPoint.y, this);
						double time = System.currentTimeMillis() - startTime;
						g.drawString("시간: " + time /1000, 300, 100);
					}
					
			}
		};
		
		add(canvas);

	}
	
	private void initThread() {
		Point p = new Point();
		p.x = (int)(Math.random() * getSize().width);
		
			pointList.add(p);	
		
		
		
		new Thread(new Runnable() {
			public void run() {
				
				while(true) {
					if(p.y == getSize().height) {
						
							pointList.remove(p);
							return;
						
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
