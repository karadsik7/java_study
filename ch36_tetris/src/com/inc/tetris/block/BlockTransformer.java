package com.inc.tetris.block;

import java.awt.Point;
import java.awt.event.KeyEvent;

import com.inc.tetris.cell.Cell;
import com.inc.tetris.frame.TetrisFrame;

public class BlockTransformer {
	private Block curBlock;
	private Cell[][] cells;
	
	public BlockTransformer(Cell[][] cells) {
		this.cells = cells;
	}
	
	public void setblock(Block block) {
		this.curBlock = block;
	}
	
	private void fix() {
		for(Point p : curBlock.getShape()) {
			cells[p.x][p.y].setFixed(true);
		}
	}
	
	public boolean canDown() {
		for(Point p : curBlock.getShape()) {
			if(p.x >= TetrisFrame.ROWS - 1) {
				fix();
				return false;
			}
			
			if(cells[p.x + 1][p.y].isFixed()) {
				fix();
				return false;
			}
		}
		return true;
	}
	
	public void move(int keyCode) {
		switch(keyCode) {
			case KeyEvent.VK_LEFT : moveLeft(); break;
			case KeyEvent.VK_RIGHT : moveRight(); break;
		}
	}
	
	private boolean canMove() {
		//왼쪽 또는 오른쪽으로 이동할 수 없다면 false 있다면 true
		for(Point p : curBlock.getShape()) {
			if(p.y == 0 || p.y == TetrisFrame.COLS - 1) {
				return false;
			}
		}
		return true;
	}

	private void moveLeft() {
		for(Point p : curBlock.getShape()) {
			if(p.y == 0 || cells[p.x][p.y - 1].isFixed()) {
				return;
			}
		}
		for(Point p : curBlock.getShape()) {
			cells[p.x][p.y].setVisible(false);
		}
		
		for(Point p : curBlock.getShape()) {
			p.y--;
			cells[p.x][p.y].setVisible(true);
			cells[p.x][p.y].setC(curBlock.getC());
		}
	}
	
	private void moveRight() {
		for(Point p : curBlock.getShape()) {
			if(p.y == TetrisFrame.COLS - 1 || cells[p.x][p.y + 1].isFixed()) {
				return;
			}
		}
		for(Point p : curBlock.getShape()) {
			cells[p.x][p.y].setVisible(false);
		}
		
		for(Point p : curBlock.getShape()) {
			p.y++;
			cells[p.x][p.y].setVisible(true);
			cells[p.x][p.y].setC(curBlock.getC());
		}
	}

	public void down() {
		for(Point p : curBlock.getShape()) {
			cells[p.x][p.y].setVisible(false);
		}
		
		for(Point p : curBlock.getShape()) {
			p.x++;
			cells[p.x][p.y].setVisible(true);
			cells[p.x][p.y].setC(curBlock.getC());
		}
	}
	
	
}
