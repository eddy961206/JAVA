package p1027;

import java.util.Scanner;

public class J1027_02 {

	public static void main(String[] args) {
		int num7 = 0;
		boolean b = true; //false
		char c = ' '; //공백문자. 아스키코드 32. ' '대신 32 넣어도 똑같음
		// '0'->48, 'A' -> 65, 'a' -> 92.....
		byte by = 1; // -128 ~ 127  오버플로우 조심
		double d = 1.21; 
		float f = 12.23f;
		long o = 1000; // 뒤에 L안붙여도 가능. int 21억 이하는 알아서 큰 long으로 변환됨
		System.out.println((int)c);
		
		// 타입 변경 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// int/char -> String :   8 + "" = "8"
		// 12345 숫자를 String으로 바꾸면 몇자리인지 str.length()사용해서 알기 쉬움. .
		// String -> int :   Integer.parseInt(str)
		// 숫자char('3') -> int : 숫자char - '0'
		// String -> char : charAt(0);
		
		char ch = ' ';
		
		
		int sum = 0; // 웬만하면 초기화 해놔( =0;)
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str1 = scan.next();
		String str2 = scan.next();
		// 두 수의 합?
		int num1 = Integer.parseInt(str1);  
		// String을 int로 변환 : Integer.parseInt()사용
		int num2 = Integer.parseInt(str2); 
		// int c = (int)str1 이건 안 됨. 기본형타입인 int를 참조형타입인 String으로 형변환하는건 불가능.
		// 기본형은 기본형끼리, 참조형은 참조형끼리만 ( ) 사용해서 형변환 가능.
		sum = num1 + num2;
		System.out.println("두 수의 합: " + sum);
		
		
//		 String str = ""; 
//		 Scanner scan = new Scanner(System.in); // Scanner에 ctrl + shft + o (알파벳오) 누르면 바로 import. 
//		 System.out.println("숫자를 입력하세요"); 
//		 str = str+" "+ scan.nextInt(); 
//		 System.out.println("숫자를 입력하세요"); 
//		 str = str+" " +scan.nextInt(); 
//		 System.out.println("숫자를 입력하세요"); 
//		 str += " " + scan.nextInt();
//		 System.out.println("숫자를 입력하세요"); 
//	  	 str += " " + scan.nextInt();
//		 System.out.println("숫자를 입력하세요"); 
//		 str += " " + scan.nextInt();
//		 System.out.printf("%s\n", str); //" 1 2 3 4 5"
		 
		
		
		
	}

}
