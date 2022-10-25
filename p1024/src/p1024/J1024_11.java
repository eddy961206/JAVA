package p1024;

import java.util.Scanner;

public class J1024_11 {

	public static void main(String[] args) {
		// 문자열을 2개 입력받아, 숫자로 변환 후 두 수를 더해서 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력 : ");
		System.out.println("두 번째 숫자 입력 : ");
		String input1 = scan.next(); // 입력받은 걸 String으로 저장
		String input2 = scan.next();
		int num1 = Integer.parseInt(input1); // String을 int로 변환
		int num2 = Integer.parseInt(input2);
		int sum = num1 + num2; 
		System.out.println("첫째 수 : " + num1);
		System.out.println("둘째 수 : " + num2);
		System.out.println("더한 수 : " +sum);
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("첫 번째 숫자 입력 : ");
//		int num1 = scan.nextInt();
//		System.out.println("두 번째 숫자 입력 : ");
//		int num2 = scan.nextInt();
//		int sum = num1 + num2;
//		System.out.println("첫째 수 : " + num1);
//		System.out.println("둘째 수 : " + num2);
//		System.out.println("더한 수 : " +sum);
		
		
		
	}

}
