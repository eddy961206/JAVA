package p1024;

import java.util.Scanner;

public class J1024_08 {
	public static void main(String[] args) {
		// 대문자를 입력하면 소문자 1개 나오게 하쇼ㅇ
		Scanner scan = new Scanner(System.in);
		
		System.out.println("대문자 입력하시오");
		String input = scan.next();
		char ch = input.charAt(0);
		char ch2 = (char)(ch + 32);
		
		System.out.println("입력했던 대문자 : " + input);
		System.out.println("바꾼 소문자 : " + ch2);
		
//		String input = scan.next();
//		if (((char)input)%2 == 0) {
//			char ch = input.charAt(0);
//			char ch2 = (char)(ch + 32);
//		}
		
	}
}
