package com.inc.tetris.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.inc.tetris.block.Block;
import com.inc.tetris.block.Shape;
import com.inc.tetris.cell.Cell;

public class TetrisFrame extends JFrame{

	private JPanel mainPanel;
	private JButton startBtn;
	
	//가로길이, 세로길이, 열, 행
	
	public static final int W = 480;
	public static final int H = 640;
	private final int ROWS = 24;
	private final int COLS = 10;
	
	//셀의 배열 : 배열로 쓰는 이유는 크기의 변경이 없기 때문에 리스트를 쓸 필요가 없으며 가장 빠른 속도를 보장
	private Cell[][] cells = new Cell[ROWS][COLS];
	
	//현재 블록
	Block curBlock;
	
	public TetrisFrame() {
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 50, W, H);
		setResizable(false);
		
		init();
		
		setVisible(true);
	}
	
	
	private void init() {
		initCells();
		initComponent();
		initPanel();
		initEvent();
	}
	
	private void initCells() {
		for(int row = 0; row < ROWS; row++) {
			for(int col = 0; col < COLS; col++) {
				cells[row][col] = new Cell(new Point(col * Cell.CELL_SIZE, (row - 4) * Cell.CELL_SIZE), Color.GRAY);
			}
		}
	}
	
	private void initComponent() {
		startBtn = new JButton("START");
		startBtn.setBounds(320, 550, 140, 40);
	}
	
	private void initPanel() {
		mainPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;
				g2.clearRect(0, 0, W, H);
				for(int row = 4; row < ROWS; row++) {
					for(int col = 0; col < COLS; col++) {
						Cell cell = cells[row][col];
						
						if(cell.isVisible()) {
							g2.fillRect(cell.p.x, cell.p.y,
								Cell.CELL_SIZE, Cell.CELL_SIZE);
						}
						
						g2.setColor(cell.getC());
						g2.drawRect(cell.p.x, cell.p.y, 
								Cell.CELL_SIZE, Cell.CELL_SIZE);
					}
				}
			}
		};
		mainPanel.setLayout(null);
		mainPanel.add(startBtn);
		add(mainPanel);
	}
	
	private void initEvent() {
		startBtn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				gameStart();
			}
		});
	}
	
	private void gameStart() {
		addBlock();
		downThread.start();
	}
	
	//다운스레드
	Thread downThread = new Thread() {
		public void run() {
			while(true) {
				process();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	};
	
	
	private void process() {
		for(Point p : curBlock.getShape()) {
			cells[p.x][p.y].setVisible(false);
		}
		
		for(Point p : curBlock.getShape()) {
			p.x++;
			cells[p.x][p.y].setVisible(true);
		}
		mainPanel.repaint();
	}
	
	private void addBlock() {
		int ranNum = (int)(Math.random()* Shape.SHAPE.length);
		curBlock = new Block(ranNum, Color.red);
		
		for(Point p : curBlock.getShape()) {
			p.y += 2;
			//p.x += 10;
			cells[p.x][p.y].setVisible(true);
		}
		mainPanel.repaint();
		
	}
	
	
	
	public static void main(String[] args) {
		new TetrisFrame();
	}
}
