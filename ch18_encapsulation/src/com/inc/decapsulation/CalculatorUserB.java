package com.inc.decapsulation;

public class CalculatorUserB {

	public static void main(String[] args) {
		
		//잘못된 사용자
		
		/*IntCalculator cc = new IntCalculator();
		cc.memory1 = 10;
		cc.memory2 = 20;
		int result = cc.sum();
		System.out.println(result);*/
		
		DoubleCalculator dCalc = new DoubleCalculator();
		dCalc.memory1 = 10;
		dCalc.memory2 = 20.5;
		double result = dCalc.sub(); // 사용자의 입장에선 더블로 바뀐것을 모를 수 있음.
		System.out.println(result);
		
		//결과적으로 Calculator라는 프로그램이 변경됐을 때, UserB라는 현재 클래스의 코드까지 변경해야하고
		//복잡한 프로그램이라했을 때 현재 클래스를 사용하는 다른 클래스에까지 변경해야하므로
		//좋은 사용법이 아니다. (결합도 증가 응집도 하락) => 버그 발생 원인
		
		//왜 이런 결과가 나왔느냐 하는 것은 굳이 UserB가 접근하지 않아야 할 변수와 메서드에 접근했기 때문에
		//발생한 문제이다. run();만 돌려도 똑같은 결과로 작동하고 사용도 간편하며 코드의 중복 또한 일어나지 않는다.
		
		//때문에 Calculator 프로그램에서 접근제한자를 통해서 run()을 제외하고 프라이빗으로 제한을 걸어두면
		//사용자는 run() 메서드만 사용하여 추후 유지보수가 간편해지고 응집도가 올라간다.

	}

}
