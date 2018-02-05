package com.inc.array;

public class ArrayEx09 {

	public static void main(String[] args) {
		
		//배열의 단점: 처음 선언할 때는 배열의 크기를 수정할 수 있지만 이후 코드부터는 값이 변할 수 없다.
		
		String[] singers = new String[4]; //[4]는 배열의 크기
		//{null, null, null, null}의 배열이 만들어짐
		singers[0] = "윤종신";
		singers[1] = "윤하";
		singers[2] = "김동률";
		singers[3] = "아이유";
		// singers[4] = "문문"; // 컴파일에서는 에러 안뜨지만 실행시 인덱스 크기 초과 에러 뜸 
		
		String[] singersCopy = new String[4];
		for(int i = 0; i < singers.length; i++) {
			singersCopy[i] = singers[i];
		}// singers에 있는 데이터를 singersCopy로 복사
		
		/*singers = new String[5]; // 이렇게만 다시 늘리면 기존 데이터가 날아감 */		
		
		singers = new String[5];
		for(int i = 0; i < singersCopy.length; i++) {
			//배열복사
			singers[i] = singersCopy[i];
		}
		
		singers[4] = "문문";
		
		//출력
		
		System.out.println(singers[4]);
		
		//그러나 이렇게 하면 비효율적
		
		
		
	}

}
