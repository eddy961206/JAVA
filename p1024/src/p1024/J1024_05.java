package p1024;

import java.util.Scanner;

public class J1024_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //console창으로 입력을 받을 수 있는 객체 생성 
		System.out.println("문자열을 입력하세요");
		String str = scan.next(); // 문자열 입력. space, enter키 입력받지 않음.
		scan.nextLine();
		System.out.println("2번째 문자열을 입력하세요");
		
		String str2 = scan.nextLine();
//		scan.nextLine(); // 문자열 입력. space, enter키 입력받음
//		
		System.out.println("숫자 입력해");
		int num = scan.nextInt(); // 정수형입력 nextLong()
//		
		System.out.println("소수점 입력가능해");
		double d = scan.nextDouble(); // 실수형입력 nextFloat()
		
		System.out.println("출력 : " + str);
		System.out.println("출력2 : "+ str2);
		System.out.println("출력3 : " + num);
		System.out.println("출력4 : " + d);
	}
}