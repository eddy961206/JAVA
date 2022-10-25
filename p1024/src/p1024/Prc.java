package p1024;

import java.util.Scanner;

public class Prc {
	public static void main(String[] args) {
		// 72 -> 7 + 2 = 9,  85 -> 8 +5 = 13 출력되게
//		Scanner scan = new Scanner(System.in);
//		String input1 = scan.next();
//		String input2 = scan.next();
//		
//		char first = input1.charAt(0);
//		char second = input2.charAt(0);
//		int a = first - '0';
//		int b = second - '0';
//		System.out.println("ss" +(a+b));
		
		
		//퀴즈: 소수점 n번째 자리에서 반올림해서 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("소수점 입력하시오 : ");
		double input = scan.nextDouble();
		System.out.println("몇 번째 자리에서 반올림할거? : ");
		int n = scan.nextInt();
		double jari = Math.pow(10, n-1); // 10의 n-1제곱

		System.out.println(Math.round(input*jari)/jari);
		
	}
}
