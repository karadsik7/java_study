package com.inc.painter.v2;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;

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
		
		canvas.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				startPoint = e.getPoint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				startPoint = null;
			}
			
		});
		
		
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				endPoint = e.getPoint();
				canvas.repaint();
			}
		});
		
	}

	public void initComponent() {
		startPoint = new Point(-10, -10);
		endPoint = new Point(-10, -10);
		
		canvas = new Canvas() {
			public void paint(Graphics g) {
				//붓을 업그레이드
				if(startPoint != null) { 
					Graphics2D g2 = (Graphics2D)g;
					//굵기 설정
					g2.setStroke(new BasicStroke(3));
					//그리기
					g2.draw(new Line2D.Float(startPoint, endPoint));
					//끝난 지점에서 시작해야하므로
					startPoint = endPoint;
					
				}
			}
			//업데이트는 기존에 그린 그림 유지
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
