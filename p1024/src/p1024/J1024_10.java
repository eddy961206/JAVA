package p1024;

import java.util.Scanner;

public class J1024_10 {
	public static void main(String[] args) {
		//퀴즈
		// 문자열 입력받아 문자열 출력하시오
		// 72 -> 7 + 2 = 9,  85 -> 8 +5 = 13 출력되게
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열 입력해 : ");
//		String input = scan.next();
//		System.out.println("입력한 문자열 : " + input);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫 숫자 입력해 : ");
//		String input1 = scan.next();
//		System.out.println("두 번째 숫자 입력해 : ");
//		String input2 = scan.next();
//		char ch1 = input1.charAt(0);
//		char ch2 = input2.charAt(0);
//		System.out.println("첫 숫자 : " + ch1 + " 두번째 숫자 : " + ch2);

		Scanner scan = new Scanner(System.in);
		System.out.println("두 자리 숫자 입력해 : ");
		String input = scan.next();
//		for (int i = 0; i<input.length; i++) {
//			ch[i] = input.charAt(i);
//		}
		
		char ch1 = input.charAt(0); // String을 char로 분리
		char ch2 = input.charAt(1);
		int int1 = ch1 - '0';       // char숫자를 int로 변환.
		int int2 = ch2 - '0';
		System.out.println("첫 숫자 : " + int1 + " 두 번째 숫자 : " + int2 + " 합 : " + (int1 +int2));

//		Scanner scan = new Scanner(System.in);
//		System.out.println("두 자리 숫자 입력해 : ");
//		int input = scan.nextInt();
//		int first = input/10; 
//		int second = input%10;
//		System.out.println("첫 숫자 : " + first + " 두 번째 숫자 : " + second + " 합 : " + (first +second));

		
		
		
		
		}
}
