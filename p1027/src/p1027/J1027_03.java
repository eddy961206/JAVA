package p1027;

import java.util.Scanner;

public class J1027_03 {

	public static void main(String[] args) {
		
		int num = 7;
		
		switch(num) {   // switch 안에 switch 넣지 마
		case 1: case 7:
			System.out.println("SK");
			if(num==1) {
				System.out.println("번호 : 011");
			} else {
				System.out.println("번호 : 017");
			}
			break;
		case 6: case 8:
			System.out.println("KT");
			break;
		case 9:
			System.out.println("LG");
			break;
		}
		
		
		
//		// 두 수를 입력받아 +-/* 출력?
//		Scanner scan = new Scanner(System.in);
//		int num1 = 0, num2 = 0;
//		System.out.println("첫 수를 입력하게요");
//		num1 = scan.nextInt();
//		System.out.println("두 번째 숫자 입력하시오");
//		num2 = scan.nextInt();
//		System.out.printf("%d + %d = %d \n", num1,num2,num1+num2);
//		System.out.printf("%d - %d = %d \n", num1,num2,num1-num2);
//		System.out.printf("%d * %d = %d \n", num1,num2,num1*num2);
//		System.out.printf("%d / %d = %.2f \n", num1,num2,(double)num1/num2);

		
		
//		int a = 65;
//		char ch = 65; //숫자로 넣으면 가능. a를 ch에 직접 넣는건 안돼.
//		char ch2 = (char)a;
//		long lo = a; //(L안써도)
//		System.out.println(ch);
//		int a = (true)?10:5;
//		System.out.println(a);
//		int b = (a%2==0)?100:200;
//		System.out.println(b);
		
	}

}
