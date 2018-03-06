package com.inc.painter.v4;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Painter extends JFrame{
	// 사이즈 조절버튼, 지우기 버튼
	
	Canvas canvas;
	Point startPoint;
	Point endPoint;
	
	JPanel colorPanel;
	JPanel sizePanel;
	
	JButton blackBtn;
	JButton redBtn;
	JButton greenBtn;
	JButton blueBtn;
	
	Color setColor = Color.BLACK;
	
	//
	JButton eraseBtn;
	JRadioButton size1Btn, size3Btn, size5Btn;
	
	int stroke = 3;
	
	
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
		initSizePanel();
		initEvent();
	}
	
	private void initColorPanel() {
		
		colorPanel = new JPanel(new GridLayout(2, 3));
		colorPanel.setPreferredSize(new Dimension(getContentPane().getWidth(), 70));
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
	
	private void initSizePanel() {
		
		sizePanel = new JPanel(new GridLayout(1, 3));
		size1Btn = new JRadioButton("1");
		size3Btn = new JRadioButton("3");
		size5Btn = new JRadioButton("5");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(size1Btn);
		bg.add(size3Btn);
		bg.add(size5Btn);
		size3Btn.setSelected(true);
		
		sizePanel.add(size1Btn);
		sizePanel.add(size3Btn);
		sizePanel.add(size5Btn);
		
		//이미 추가한 위쪽영역에 추가하고 싶으므로 컬러패널의 인덱스값을 계산해서 끼워넣는다.
		colorPanel.add(eraseBtn, 0);
		colorPanel.add(sizePanel, 3);
		
	
		
		
		
		
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
		
		//지우개 이벤트
		
		eraseBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent arg0) {
				canvas.getGraphics().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
			}
		});
		
		//붓 굵기 이벤트
		
		ItemListener sizeListener = new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String str = ((JRadioButton)e.getItem()).getText();
				stroke = Integer.parseInt(str);
			}
		};
		
		size1Btn.addItemListener(sizeListener);
		size3Btn.addItemListener(sizeListener);
		size5Btn.addItemListener(sizeListener);
		
		
		
		
		
		
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
					g2.setStroke(new BasicStroke(stroke));
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
		
		//지우개
		eraseBtn = new JButton("지우기");
		
		add(canvas);
		
	}

	public static void main(String[] args) {
		new Painter();
	}
	
}
