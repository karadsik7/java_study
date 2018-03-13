package com.inc.tetris.block;

import java.awt.Color;
import java.awt.Point;

public class Block {
	//모양을 그릴 포인트를 저장할 배열
	private Point[] shape;
	//블럭의 모양타입 저장
	private int shapeType;
	//회전시 모양타입 4가지 저장
	private int rotation;
	//블록이 실제로 칠해질 포인트지점
	public Point blockPoint;
	//블록의 컬러
	private Color c;
	
	
	public Block(int shapeType, Color c) {
		blockPoint = new Point(0, 3);
		this.shapeType = shapeType;
		this.c = c;
		
		initShape();
	}
	
	private void initShape() {
		shape = new Point[4];
		int i = 0;
		for(int row = 0; row < 4; row++) {
			for(int col = 0; col < 4; col++) {
				if(Shape.SHAPE[shapeType][rotation][row][col] == 1) {
					shape[i] = new Point(row, col);
					i++;
					if(i > 4) {
						break;
					}
				}
			}
		}
		
	}

	public Point[] getShape() {
		return shape;
	}

	public void setShape(Point[] shape) {
		this.shape = shape;
	}

	public int getShapeType() {
		return shapeType;
	}

	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}
	
	
	
	
	
}
