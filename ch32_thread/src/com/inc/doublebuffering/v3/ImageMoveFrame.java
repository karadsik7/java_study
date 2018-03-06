package com.inc.doublebuffering.v3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageMoveFrame extends JFrame{
	//JPanel에는 더블버퍼링이 자동지원
	
	Image manImg;
	JPanel canvasPanel;
	Point p;
	
	public ImageMoveFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(true);

		init();

		setVisible(true);
		initThread();

	}

	public void init() {
		initComponent();
	}
	
	void initThread() {
		new Thread(()->{
			while(true) {
				p.x++;
				canvasPanel.repaint();
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
	}


	public void initComponent() {
		
		ImageIcon i = new ImageIcon("src/com/inc/images/man.png");
		manImg = i.getImage();
		p = new Point(0, 200);
		canvasPanel = new JPanel() {
			public void paintComponent(Graphics g) {
				g.clearRect(0, 0, canvasPanel.getWidth(), canvasPanel.getHeight());
				g.drawImage(manImg, p.x, p.y, this);
			}
		};
		
		add(canvasPanel);

	}

	public static void main(String[] args) {
		new ImageMoveFrame();
	}
}
