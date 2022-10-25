package p1024;

import java.util.Scanner;

public class J1024_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String input = scan.next(); 
		char ch = input.charAt(0); //1번째 string을 char로 변환
		
		//영문소문자 1개를 입력하면 대문자가 출력되도록 하시오
		char ch2 = (char)(ch - 32);  //a97 A65
		System.out.println("입력문자 : " + input);
		System.out.println("대문자 : "+ ch2);
		
		
	}
}
