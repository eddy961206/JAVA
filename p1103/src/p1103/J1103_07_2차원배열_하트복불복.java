package p1103;

import java.util.Scanner;

public class J1103_07_2차원배열_하트복불복 {

	public static void main(String[] args) {
		// 변수 선언
		int x = 0;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		int[] num = new int[25];
		int[][] score = new int[5][5];
		String[][] score2 = new String[5][5];

		// num 배열에 번호넣기 0:20개, 1:5개
		for (int i = 0; i < num.length; i++) {
			if (i < 20) {
				num[i] = 0;
			} else {
				num[i] = 1;
			}
//			num[i] = i + 1; //1~25까지 순서대로 숫자넣기
		} // for

		// 번호 랜덤 섞기
		int temp = 0;
		int r_num = 0;
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		} // for

		// score 배열에 num 배열 번호 넣기
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = num[5 * i + j];
				score2[i][j] = "♥";
			}
		} // for

		// 무한반복 시작-------->
		while(true) {
//			// 출력
//			System.out.println("            [ 숫자 확인 ]");
//			System.out.printf("X|\t0\t1\t2\t3\t4\n");
//			System.out.println("-----------------------------------------");
//			for (int i = 0; i < score.length; i++) {
//				System.out.printf("%d|\t", i);
//				for (int j = 0; j < score[i].length; j++) {
//					System.out.printf("%d\t", score[i][j]);
//				}
//				System.out.println();
//			} // for

			// ------------------------------------------------------
			System.out.println();
			// 하트 화면 출력
			System.out.println("            [ 하트 복불복 ]");
			System.out.printf("X|\t0\t1\t2\t3\t4\n");
			System.out.println("-----------------------------------------");
			for (int i = 0; i < score.length; i++) {
				System.out.printf("%d|\t", i);
				for (int j = 0; j < score[i].length; j++) {
					System.out.printf("%s\t", score2[i][j]);
				}
				System.out.println();
			} // for

			// 좌표입력
			System.out.println("x 좌표를 입력하세요 (0~4) >>>>>");
			x = scan.nextInt();
			System.out.println("y 좌표를 입력하세요 (0~4) >>>>>");
			y = scan.nextInt();

			//프로그램 구성   
			if (score[x][y] == 1) {
				score2[x][y] = "당첨";
			} else {
				score2[x][y]= "꽝";
			}//if
			
			
		}//while
		// 무한반복 끝 ---------------------------

	}// main

}// class
