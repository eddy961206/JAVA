package p1027;

import java.util.Scanner;

public class J1027_01_스위치넓이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 넓이 구하는 프로그램
		int length1 = 0, length2 = 0;  // 같은 타입 변수 지정할때만 ','사용가능
		System.out.println("[넓이 구하는 프로그램]");
		System.out.println("1.정사각형 넓이	");
		System.out.println("2.삼각형 넓이");
		System.out.println("3.마름모 넓이");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("가로 길이를 입력하세요");
			length1 = scan.nextInt();
			System.out.println("세로 길이를 입력하세요");
			length2 = scan.nextInt();
			System.out.printf("정사각형 넓이 : %d ㎠ ", length1*length2);    
			break;
		case 2:
			System.out.println("밑변 길이를 입력하세요");
			length1 = scan.nextInt();
			System.out.println("높이를 입력하세요");
			length2 = scan.nextInt();
			System.out.printf("삼각형 넓이 : %.2f ㎠ ", length1*length2/2.0);
			break;
		case 3:
			System.out.println("가로대각선 길이를 입력하세요");
			length1 = scan.nextInt();
			System.out.println("세로대각선 길이를 입력하세요");
			length2 = scan.nextInt();
			System.out.printf("마름모 넓이 : %.2f ㎠", length1*length2*0.5);
			break;
		}
		
//		System.out.println("두 수를 입력하세요");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("사칙연산 부호 입력하세요(+,-,*,/)");
//		char ch = scan.next().charAt(0); // String 받아서 첫 글자 char로 변환.
//		switch(ch) {
//		case '+':
//			System.out.printf("%d + %d = %d\n", a,b,a+b);
//			break;
//		case '-':
//			System.out.printf("%d - %d = %d\n", a,b,a-b);
//			break;
//		case '*':
//			System.out.printf("%d * %d = %d\n", a,b,a*b);
//			break;
//		case '/':
//			System.out.printf("%d / %d = %.1f\n", a,b,(double)a/b); 
//			//그냥 a/b하면 int/int=int므로 double로 변환해야 소수점 나옴
//			break;
//		default:
//			System.out.println("잘못 입력했습니다. 다시 입력하세요");
//			break;
//		}
	}

}
