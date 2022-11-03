package p1103;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class J1103_06 {

	public static void main(String[] args) {
		// 빙고

		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int[] num = new int[25];
		int[][] score = new int[5][5];
		String[][] score2 = new String[5][5];
		int temp = 0;
		int r_num = 0;

		// 1~25까지 num 배열에 숫자를 넣기. // 0:12개 1:13개
		for (int i = 0; i < num.length; i++) {
			if (i < 12) {
				num[i] = 0;
			} else {
				num[i] = 1;
			}
		}
//		"♥"

		// num 배열 섞기
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		}

		// num 배열의 원소들을 2차원 score, score2 배열에 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = num[5 * i + j];
				score2[i][j] = "♥";
			}
		}

		// 무한반복 시작 -------------------->
		while (true) {

			// score 배열 출력
			System.out.println("             [score 배열 확인]  ");
			System.out.print("X\t0\t1\t2\t3\t4\n");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d|\t", i);
				for (int j = 0; j < 5; j++) {
					System.out.printf("%d\t", score[i][j]);
				}
				System.out.println();
			} // score 배열 출력

			// score 2 배열 출력
			System.out.println();
			System.out.println("             [score2 배열 확인]  ");
			System.out.print("X\t0\t1\t2\t3\t4\n");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d|\t", i);
				for (int j = 0; j < 5; j++) {
					System.out.printf("%s\t", score2[i][j]);
				}
				System.out.println();
			} // score 2 배열 출력

			System.out.println("x좌표를 입력하세요>> (0~4)");
			x = scan.nextInt();
			System.out.println("y좌표를 입력하세요>> (0~4)");
			y = scan.nextInt();

			// 프로그램 구성
			if(score[x][y]==1) {
				score2[x][y] = "당첨!";
			} else {
				score2[x][y] = "꽝";
			}

		} // while
			// 무한반복 끝-------------------

	}// main

}// class
