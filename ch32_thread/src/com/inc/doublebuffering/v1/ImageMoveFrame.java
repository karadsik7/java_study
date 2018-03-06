package com.inc.doublebuffering.v1;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ImageMoveFrame extends JFrame{
	//더블버퍼링을 이용해 깜빡임을 없애기
	//원리 : 화면에 보이기 전에 드로우를 마친 이후에 화면으로 출력
	//더블버퍼링 미적용
	
	Image manImg;
	Canvas canvas;
	Point p;
	
	public ImageMoveFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(true);

		init();

		setVisible(true);

	}

	public void init() {
		initComponent();
		initThread();
	}
	
	void initThread() {
		new Thread(()->{
			while(true) {
				p.x++;
				canvas.repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}

	public void initComponent() {
		
		ImageIcon i = new ImageIcon("src/com/inc/images/man.gif");
		manImg = i.getImage();
		p = new Point(0, 200);
		canvas = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(manImg, p.x, p.y, this);
			}
		};
		
		add(canvas);

	}

	public static void main(String[] args) {
		new ImageMoveFrame();
	}
}
