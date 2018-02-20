package com.inc.coop.v3;

public class Operator implements IOperator {

	@Override
	public double sum(double a, double b) {
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}

	@Override
	public double mul(double a, double b) {
		return a * b;
	}

	@Override
	public double div(double a, double b) throws Exception{
		if(b == 0) {
			//예외를 발생시킨 쪽으로 책임 전가함.
			throw new Exception("0으로 나눌 수 없습니다.");
		}
		return a / b;
	}

}
