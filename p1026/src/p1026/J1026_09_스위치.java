package p1026;

import java.util.Scanner;

public class J1026_09_스위치 {
	//switch문은 int, string, char만 1대1대응 가능할 때만 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("휴대폰 앞번호를 입력해주세요");
		//010 011 016 017 018 019
		String str = scan.next();
		char ch = str.charAt(2); // String -> char
		int num = ch - '0';    // char -> int
		// 1,7 -> SK  6,8 -> KT  9 -> LG
		switch(num) {
		case 1:  
		case 7:
			System.out.println("SK");
			break;
		case 6: case 8:
			System.out.println("KT");
			break;
		case 9: 
			System.out.println("LG");
			break;
		default :
			System.out.println("다시 입력하세요");
		}
		
//		switch(num) {
//		
//		case 1 : 
//			System.out.println("1이 입력되었습니다");
//			break;		//break 없으면 그 아래로 쭉 다 실행됨. 
//						//switch는 if와 달리 맨 위에서부터 아래로 쭉 가는게 아니라 바로 그 자리로 감.
//		case 2 :
//			System.out.println("2가 입력되었습니다");
//			break;
//		case 3 :
//			System.out.println("3이 입력되었습니다");
//			break;
//		case 4 :
//			System.out.println("4가 입력되었습니다");
//			break;
//		case 5 :
//			System.out.println("5가 입력되었습니다");
//			break;
//		default:
//			System.out.println("6이상의 숫자입니다");
//			break;
//		}//switch
		
	}//main

}//class
