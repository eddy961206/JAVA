package p1101;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class J1101_05_2차원배열_좌표사용_0으로바꾸기 {

	public static void main(String[] args) {
		// 5,5배열 - 랜덤숫자 넣고 출력
		int[][] score = new int[5][5];
		String[][] score2 = new String[5][5];
		int[] arr = new int[25];
		int temp = 0, r_num = 0, choice = 0, choice2 =0;
		
		String choice3 = "";

		// 1~25 순서대로 들어간 arr배열 생성
		for (int i = 0; i < 25; i++) {
			arr[i] = i + 1;
		}

		// 1~25 들어간 arr배열 랜덤으로 섞기
		for (int i = 0; i < 100; i++) {
			r_num = (int) (Math.random() * 25);
			temp = arr[0];
			arr[0] = arr[r_num];
			arr[r_num] = temp;
		}

//		// 섞은 25개 arr배열 출력
//		for(int i =0; i<25; i++) {
//			System.out.printf("%d ",arr[i]);
//		}

//		// 5X5배열 1~25 순서대로 집어넣기
//		for(int i =0; i<5; i++) {
//			for(int j =0; j<5; j++) {
//				score[i][j] = 5*i+j+1;
//			}
//		}

		// 5X5 배열 섞기 (섞어 놓은 25개짜리 배열을 순서대로 집어넣)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = arr[5 * i + j];
				score2[i][j] = arr[5 * i + j]+"";
			}
		} // 5X5 배열 섞기
		

		// 무한루프 (int로 받아서 같은 수 0으로 만들기) 
		while (true) {
			// 5X5 배열 출력
			System.out.printf("0|\t0\t1\t2\t3\t4\n");
			System.out.printf("------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.printf("\n%d|\t",i);
				for (int j = 0; j < 5; j++) {
					System.out.printf("%d\t", score[i][j]);
				}
				System.out.println();
			} // 5X5 배열 출력
			System.out.println("---------------------------------------");

			//좌표 넣으면 0으로 표시
			Scanner scan = new Scanner(System.in);
			System.out.println("원하는 xy좌표 입력하세요 : ");
			int number = scan.nextInt();
			choice = number/10;
			choice2 = number%10;
			
//			String str = scan.next();
//			choice = str.charAt(0)-'0'; // x좌표
//			choice2 = str.charAt(1)-'0'; // y좌표
			
//			choice2 = scan.nextInt();
			
			loop:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
						score[choice][choice2] = 0;
				}
			}
		} // 무한루프while (int로 받아서 같은 수 0으로 만들기) 
		
		
		// 무한루프 (String으로 받아서 같은 수 X로 만들기) 
//		while (true) {
//			// 5X5 배열 출력
//			System.out.printf("0|\t0\t1\t2\t3\t4\n");
//			System.out.printf("------------------------------------------");
//			for (int i = 0; i < 5; i++) {
//				System.out.printf("\n%d|\t",i);
//				for (int j = 0; j < 5; j++) {
//					System.out.printf("%s\t", score2[i][j]);
//				}
//				System.out.println();
//			} // 5X5 배열 출력
//			System.out.println("---------------------------------------");
//			
//			Scanner scan = new Scanner(System.in);
//			System.out.println("원하는 좌표 입력하세요 : ");
//			choice3 = scan.next();
//			
//			loop:
//			for (int i = 0; i < 5; i++) {
//				for (int j = 0; j < 5; j++) {
//					if (score2[i][j].equals(choice3)) {
//						score2[i][j] = "X";
//						break loop;
//					}
//				}
//			}
//		} // 무한루프while (String으로 받아서 같은 수 X로 만들기) 

		
		
		
	}// main

}// class
