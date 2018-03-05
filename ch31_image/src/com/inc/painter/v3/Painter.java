package com.inc.painter.v3;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painter extends JFrame{
	//상단 패널에 색깔을 지정하는 4개의 버튼을 만들고 버튼을 누르면 색깔이 바뀌도록
	
	Canvas canvas;
	Point startPoint;
	Point endPoint;
	
	JPanel colorPanel;
	
	JButton blackBtn;
	JButton redBtn;
	JButton greenBtn;
	JButton blueBtn;
	
	Color setColor = Color.BLACK;
	
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
		initColorPanel();
		initEvent();
	}
	
	private void initColorPanel() {
		
		colorPanel = new JPanel(new GridLayout(1, 4));
		colorPanel.setPreferredSize(new Dimension(getContentPane().getWidth(), 50));
		blackBtn = new JButton();
		redBtn = new JButton();
		greenBtn = new JButton();
		blueBtn = new JButton();
		blackBtn.setBackground(Color.BLACK);
		redBtn.setBackground(Color.RED);
		greenBtn.setBackground(Color.GREEN);
		blueBtn.setBackground(Color.BLUE);
		
		colorPanel.add(blackBtn);
		colorPanel.add(redBtn);
		colorPanel.add(greenBtn);
		colorPanel.add(blueBtn);
		
		add(colorPanel, BorderLayout.NORTH);
		
		
		
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
		
		MouseAdapter ma = new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				setColor = e.getComponent().getBackground();
			}
		};
		
		blackBtn.addMouseListener(ma);
		redBtn.addMouseListener(ma);
		greenBtn.addMouseListener(ma);
		blueBtn.addMouseListener(ma);
		
		
	}

	public void initComponent() {
		startPoint = new Point(-10, -10);
		endPoint = new Point(-10, -10);
		
		canvas = new Canvas() {
			public void paint(Graphics g) {
				g.setColor(setColor);
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
