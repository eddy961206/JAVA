package p1026;

import java.util.Scanner;

public class J1026_10 {

	public static void main(String[] args) {
		//주민번호 입력받아 남녀 출력 880101-1111111
		//1 3 남 2 4 여
		Scanner scan = new Scanner(System.in);
//		System.out.println("주민번호 입력하세요(-포함)");
//		String input = scan.next();
//		char ch = input.charAt(7);
//		switch(ch) {
//		case '1' : 
//		case '3' :
//			System.out.println("남자입니다");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자입니다");
//			break;
//		}
		
		int a=10;
		int b= 2;
		
		System.out.println("10과2의 숫자를 사칙연산을 합니다. 원하는 사칙연산을 입력하시오");
		System.out.println("(예:+, -, *, /중 한 개 입력)");
		String str = scan.next();
		char ch = str.charAt(0);  
		switch(ch) {
		case '+':
			System.out.printf("%d + %d = %d", a,b,a+b);
			break;
		case '-':
			System.out.printf("%d - %d = %d", a,b,a-b);
			break;
		case '*':
			System.out.printf("%d * %d = %d", a,b,a*b);
			break;
		case '/':
			System.out.printf("%d / %d = %d", a,b,a/b);
			break;
		}
		
		
		
//		break없는거 응용
//		int level = 3;
//		switch(level) {
//		case 3:
//			grantDelete(); //삭제권한 준다 -> 레벨3이면 삭제,쓰기,읽기 권한 다 줌.
//		case 2:
//			grantWrite(); //쓰기권한 준다
//		case 1:
//			grantRead();  //읽기권한 준다	
//		}
		
	}
	
}
