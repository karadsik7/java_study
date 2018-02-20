package com.inc.coop.v3;

public interface IOperator {
	
	// 최근 패치로 디폴트 메서드도 생성할 수 있지만 대부분 추상 메서드만 생성한다.
	
	double sum(double a, double b); // abstract를 안붙여도 자동으로 jvm이 집어넣어줌.
	//인터페이스는 기본적으로 외부에서 사용하는 메서드이기 때문에 public이 강제되기 때문에 public을 안적어도 public이다.
	
	double sub(double a, double b);
	
	double mul(double a, double b);
	
	double div(double a, double b) throws Exception;
	

}
