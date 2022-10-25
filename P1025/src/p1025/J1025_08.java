package p1025;

import java.util.Scanner;

public class J1025_08 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int a = scan.nextInt();		
//		if(a%2 == 0) {
//			System.out.println("2의 배수입니다");
//		}else {
//			System.out.println("2의 배수가 아닙니다");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 앞 2자리 입력하세요"); //1900년대 가정
		int a = scan.nextInt();
		int result = 122-a; //2022-88 안됨
		if(result>=18) {
			System.out.printf("나이:%d, 성인입니다\n", result);
		}else {
			System.out.println("미성년자 입니다");
		}	
		
//		int share = 10/8;	//1
//		int remain = 10%8; 	//2
//		System.out.println(share);
//		System.out.println(remain);
	}

}
