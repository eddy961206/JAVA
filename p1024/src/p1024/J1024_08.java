package p1024;

import java.util.Scanner;

public class J1024_08 {
	public static void main(String[] args) {
		// 대문자를 입력하면 소문자 1개 나오게 하쇼ㅇ  --> String을 char로
		Scanner scan = new Scanner(System.in);
		
		System.out.println("대문자 입력하시오");
		String input = scan.next(); // String 받아서
		char ch = input.charAt(0);  // 받은 String을 char로 변환해서 
		char ch2 = (char)(ch + 32); // char + 32 는 int 이므로 다시 char로 변환
		
		System.out.println("입력했던 대문자 : " + input);
		System.out.println("바꾼 소문자 : " + ch2);
		
//		String input = scan.next();
//		if (((char)input)%2 == 0) {
//			char ch = input.charAt(0);
//			char ch2 = (char)(ch + 32);
//		}
		
	}
}
