package com.inc.string;

public class StringEx2 {
	
	public static void main(String[] args) {
		
		System.out.println(login1("flynn", "1111"));
		System.out.println(login1("flynn", "2222"));
		System.out.println(login2("flynn", null));
		//널일경우 예외발생
		
		System.out.println(login2("flynn", "1111"));
		System.out.println(login2("flynn", "2222"));
		System.out.println(login2("flynn", null));
		//고정된 값을 먼저 체크하므로 널이어도 예외가 발생 XX
		//원리는 null.equals는 존재하지 않기 때문
	}
	
	private static boolean login1(String id, String pass) {
		
		if(id.equals("flynn") && pass.equals("1111")) {
			return true;
		}
		return false;
	}
	
	private static boolean login2(String id, String pass) {
			
			if("flynn".equals(id) && "1111".equals(pass)) {
			return true;
		}
		return false;
	}

	
}
