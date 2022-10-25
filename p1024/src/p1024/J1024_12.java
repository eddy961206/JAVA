package p1024;

import java.util.Scanner;

public class J1024_12 {

	public static void main(String[] args) {
		// 숫자 3개를 입력받아 합을 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개 입력하시오"); 
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();
		int sum = input1 + input2 + input3; 
		
		System.out.println("숫자 3개 합 : " + sum);
		
	}

}
