package com.inc.solution;

public class ExcludableDutyAssigner extends DutyAssigner {

	//상속을 이용해서
	//특정일자 제외한 당직 선정 프로그램
	
	private int excludedDay = -1;
	
	private void exclude() {
		System.out.println("제외할 날짜를 선택해 주세요.\n(월 ~ 금, 없으면 x)");
		char day = scanner.nextLine().charAt(0); //charAt(0)은 문자열을 배열로 변환해서 0번지에 있는 문자열을 가져옴
		switch(day) {
			case '월' : excludedDay = 0; break;
			case '화' : excludedDay = 1; break;
			case '수' : excludedDay = 2; break;
			case '목' : excludedDay = 3; break;
			case '금' : excludedDay = 4; break;
			case 'x' : break;
			default : System.out.println("잘못된 문자를 입력하셨습니다.");
		}
		
	}
	
	@Override
	void run() { //오버라이딩
		exclude();
		createDays();
		for(int day : this.days) {
			if(day == excludedDay) {
				continue;
			}
			System.out.println("이름을 입력해 주세요.");
			String name = scanner.nextLine();
			char charDay = intToDay(day);
			System.out.printf("%s : %c요일\n", name, charDay);
		}
	}
	

}
