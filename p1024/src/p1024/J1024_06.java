package p1024;

import java.util.Scanner;

public class J1024_06 {
	public static void main(String[] args) {
		// 소수점을 입력받아 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점을 입력하세요");
//		double input = scan.nextDouble();
//		System.out.println("넣은 소수점 : " + input);
		
		//퀴즈: 소수점 2자리에서 반올림해서 출력하시오
		Scanner scan2 = new Scanner(System.in);
		System.out.println("반올림할 소수점 입력하시오");
		double input = scan2.nextDouble();
		input = Math.round(input*10)/10.0;   // 난 Math.round((input*10)/10.0)로 했었음. 틀림.
		System.out.println("둘째자리에서 반올림한 값 : " + input);
		
		Scanner scan = new Scanner(System.in);
		
		
//		//혼자: 소수점 n번째 자리에서 반올림해서 출력하시오
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 입력하시오 : ");
//		double input = scan.nextDouble();
//		System.out.println("몇 번째 자리에서 반올림할거? : ");
//		int n = scan.nextInt();
//		double jari = Math.pow(10, n-1); // 10의 n-1제곱
//
//		System.out.println(Math.round(input*jari)/jari);
		
		
		
//		System.out.println("숫자를 입력하세요");
//		int num = scan.nextInt();
//		System.out.println("입력한 숫자 : "+ num);
		
		
//		System.out.println("소수점 입력하시오");
//		Double d = scan.nextDouble();
//		System.out.println("넣은 소수점 : "+ d);
		
		// 문자열을 입력받아 출력하시오.
//		System.out.println("문자열을 입력하시오");
//		String s = scan.nextLine();
//		System.out.println("입력한 문자열 : "+ s);
	
		
	}
}
