package com.inc.tetris.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.inc.tetris.block.Block;
import com.inc.tetris.block.BlockTransformer;
import com.inc.tetris.block.Shape;
import com.inc.tetris.cell.Cell;

public class TetrisFrame extends JFrame{

	private JPanel mainPanel;
	private JButton startBtn;
	
	//가로길이, 세로길이, 열, 행
	
	public static final int W = 480;
	public static final int H = 640;
	public static final int ROWS = 24;
	public static final int COLS = 10;
	
	//셀의 배열 : 배열로 쓰는 이유는 크기의 변경이 없기 때문에 리스트를 쓸 필요가 없으며 가장 빠른 속도를 보장
	private Cell[][] cells = new Cell[ROWS][COLS];
	
	//현재 블록
	Block curBlock;
	
	//블록변경자
	
	BlockTransformer transformer;
	
	
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
		transformer = new BlockTransformer(cells);
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
							g2.setColor(cell.getC());
							g2.fillRect(cell.p.x, cell.p.y,
								Cell.CELL_SIZE, Cell.CELL_SIZE);
						}
						
						g2.setColor(Color.gray);
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
		requestFocus();
		initKeyEvent();
	}
	
	private void initKeyEvent() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				transformer.move(e.getKeyCode());
				mainPanel.repaint();
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					process();
					return;
				}else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					
				}
			}
		});
	}
	
	
	//다운스레드
	Thread downThread = new Thread() {
		public void run() {
			while(true) {
				process();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	};
	
	
	private void process() {
		if(transformer.canDown()) {
			transformer.down();
		}else {
			addBlock();
		}
		mainPanel.repaint();
	}
	
	private void addBlock() {
		int ranNum = (int)(Math.random()* Shape.SHAPE.length);
		curBlock = new Block(ranNum, Shape.colors[ranNum]);
		transformer.setblock(curBlock);
		
		for(Point p : curBlock.getShape()) {
			p.y += 2;
			//p.x += 10;
			cells[p.x][p.y].setVisible(true);
			cells[p.x][p.y].setC(curBlock.getC());
		}
		mainPanel.repaint();
		
	}
	
	
	
	public static void main(String[] args) {
		new TetrisFrame();
	}
}
