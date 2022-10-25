package p1025;

import java.util.Scanner;

public class J1025_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = scan.nextLine();
		System.out.println("패스워드를 입력하세요>>");
		String pw = scan.nextLine();
		
		
		// id, pw 가 맞으면 로그인, 안맞으면 다시 로그인 요청
		// 제어문 if , 반복문
		if(id.equals("admin")) {
			System.out.println("로그인 성공!");
			
		} else {
			System.out.println("로그인 실패. 다시 입력하세요");
		}
		
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
	}

}
