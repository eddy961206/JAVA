package p1028;

import java.util.Scanner;

public class J1028_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		System.out.println("컴퓨터를 켭니다");
		
		do { 
			System.out.println("오피스 프로그램을 실행합니다");
			System.out.println("프로그램을 종료할까요? (1.아니요:계속 실행 0.프로그램 종료)");
			input = scan.nextInt();
		}while(input!=0);
		
		
		
		
//		int i = 10;
//		while(i<=9) {
//			System.out.println("ee");
//		}
//		do {
//			System.out.println(i);
//		}while(i<=9);
		
		
////		while 10~1 출력
//		int i = 10;
//		while(i>=1) {
//			System.out.println(i);
//			i--;
//		}
		
////		while 1~10 출력
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		
		
////		while 사용 구구단 
//		int i = 2;
//		while(i<=9) {
//			System.out.printf("[ %d 단]\n",i);
//			int j = 1;
//			while(j<=9) {
//				System.out.printf("%d * %d = %d \n", i,j,i*j);
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
		
		//for 사용 구구단
//		for(int i = 2; i<=9; i++) {
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d * %d = %d \t", i, j, i*j);
//			}
//			System.out.println();
		
//		while 사용 1~100까지 출력
//		int i = 1;
//		while(i<=100) {
//			System.out.println(i);
//			i++;
//		}
		
		
//		while 사용 1~100까지 출력
//		int i = 1;
//		for(i=1; i<=100; i++) {
//			System.out.println(i);
//		}
		
//		int j =1;
//		while(j<=9) {
//			System.out.printf("%d * %d = %d \n",i,j,i*j);
//			j++;
//		}
		
//		// while 예시
//		int sum = 0;   //초기화
//		int i = 1;     //초기화
//		while (i <= 10) {
//			sum += i;  //조건식
//			i++;       //증감식
//		}
//		System.out.println("합계 : "+sum);

		
//		//for 예시
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("합계 : " + sum);

	}

}
