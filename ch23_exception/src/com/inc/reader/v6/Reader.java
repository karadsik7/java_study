package com.inc.reader.v6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	//예외 처리에 대한 책임은 run에 있다고 생각
	
	public void run(String filename){
		
			BufferedReader bReader = null;
			
			//만약 파일이 없다고 가정할 때 생성자인 FileReader()에서 예외를 처리한다면
			//항상 memo1.txt (No such file or directory)로 밖에 처리하지 못할 것이다.
			//하지만 호출한 쪽인 run()에서 예외처리를 할 수 있다면 더욱 적합한 예외 처리가 가능하다.
			try {
				bReader = new BufferedReader(new FileReader(filename));
				String input = bReader.readLine();
				System.out.println(input);
			}
			catch(FileNotFoundException e){
				//System.out.println(e.getMessage());
				System.out.println("존재하지 않는 파일명입니다.");
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
