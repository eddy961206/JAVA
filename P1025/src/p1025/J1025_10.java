package p1025;

import java.util.Scanner;

public class J1025_10 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.println("알파벳 입력하세요");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch >= 'a' && ch <= 'z') {
//			System.out.println("소문자 입니다");
//		}else {
//			System.out.println("소문자 아닙니다");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("바꿀 알파벳 입력하세요"); //대->소 or 소->대
		String str = scan.next();
		char ch = str.charAt(0);
		char toUC = (char)(ch-32);
		if (ch >= 'a' && ch <= 'z') {               // 소문자니?
			System.out.println((char)(ch-32));		// (ch-32)로 묶어줘야. '대문자로 바꿔'
		}else {
			System.out.println((char)(ch+32));		// (아니면) '소문자로 바꿔'
		}
		
		
		
	}

}
