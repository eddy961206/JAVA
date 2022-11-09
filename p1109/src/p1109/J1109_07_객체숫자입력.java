package p1109;

import java.util.Scanner;

public class J1109_07_객체숫자입력 {

	public static void main(String[] args) {

		// 숫자 1개 입력받아 출력받는 프로그램
		Scanner scan = new Scanner(System.in);
		Method1 m = new Method1();
		int result = 0;

		// 메소드호출
		int num = m.input();
		int num2 = m.input();
		int num3 = m.input();
		int num4 = m.input();
		// 결과값 출력
		System.out.println(num + num2 + num3 + num4);
		
		

//		Method1 m = new Method1();
//		int num = 0;
//		int [] j = new int[6];
//		// 메소드 호출
//		
//		
//		num = m.sum();
//	
//		for (int i = 0; i < 6; i++) {
//			System.out.printf("%d ",m.num[i]);
//		}
//		System.out.println();
//		System.out.println("합계 : "+ num);

//		num = m.random();
//		System.out.println("랜덤숫자 : "+num);

	}

}
