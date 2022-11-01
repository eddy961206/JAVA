package p1101;

import java.util.Scanner;

public class J1101_04_2차원배열_빙고 {

	public static void main(String[] args) {
		// 5x5 배열 -> 랜덤으로 섞어서 1~25 숫자 넣고
		int[][] score = new int[5][5];
		String[][] score2 = new String[5][5];
		Scanner scan = new Scanner(System.in);
		String choice = "";

		// 랜덤(1~25) 배열 새로 만들고 순서대로 입력
		int[] num = new int[25];
		for (int i = 0; i < 25; i++) {
			num[i] = i + 1;
		}

		int temp = 0, r_num = 0;

		// 랜덤(1~25) 배열 섞기
		for (int i = 0; i < 1000; i++) {
			r_num = (int) (Math.random() * 25); // 0~24!!!!!!!!!!!!!!!!!!!!!!!!!
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		}

		// 섞어놓은 num 배열 요소를 5x5배열에 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = num[5 * i + j]; // 5*i+j+1 은 1~25임.!!!!!!!!!!!!!!!!!
				score2[i][j] = "" + num[5 * i + j];
			}
		}

		// 무한반복
		while (true) {
			// 출력
			System.out.println("           [  배열 확인  ]    ");
			System.out.printf("0|\t0\t1\t2\t3\t4\n");
			System.out.println("-----------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(i+"|\t");
				for (int j = 0; j < 5; j++) {
					System.out.printf("%s\t", score2[i][j]);
				}
				System.out.println();
			} // for
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호 입력하세요 : (1~25)");
			choice = scan.next();

			// 입력한 숫자를 5x5배열에서 찾아서 0으로 바꾸기
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (score2[i][j].equals(choice) ) {
						score2[i][j] = "X";
						break loop; // 바깥 for까지 다 빠져나가야.
					}
				}
			}

		} // 출력 무한루프 while

	}// main

}// class
