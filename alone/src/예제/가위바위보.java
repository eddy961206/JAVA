package 예제;

import java.util.ArrayList;
import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String check = "";
		int r_num = 0, win = 0, draw = 0, lose = 0, total = 0;
		int[] score = new int[3]; // 승 무 패
		while (true) {
			r_num = (int) (Math.random() * 3); // 컴터가 내는 거. 0-가위 1-바위 2-보
			System.out.println("가위 바위 보 중 하나를 내세요 : (0.그만하기)");
			check = scan.nextLine();
			if (check.equals("0")) {
				System.out.println("게임 종료");
				break;
			}
			
			if (check.equals("가위")) {
				switch (r_num) {
				case 0:
					System.out.println("비겼습니다.");
					score[1]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				case 1:
					System.out.println("졌습니다.");
					score[2]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				case 2:
					System.out.println("이겼습니다.");
					score[0]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				}
			} else if (check.equals("바위")) {
				switch (r_num) {
				case 0:
					System.out.println("이겼습니다.");
					score[0]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				case 1:
					System.out.println("비겼습니다.");
					score[1]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				case 2:
					System.out.println("졌습니다.");
					score[2]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				}
			} else if (check.equals("보")) {
				switch (r_num) {
				case 0:
					System.out.println("졌습니다.");
					score[2]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				case 1:
					System.out.println("이겼습니다.");
					score[0]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, score[0], score[1], score[2]);
					break;
				case 2:
					System.out.println("비겼습니다.");
					score[1]++;
					total++;
					System.out.printf("총%d판 - %d승 %d무 %d패\n", total, win, draw, lose);
					break;
				}
			} else {
				System.out.println("입력이 올바르지 않습니다.");
			}

		} // while
	}// main
}// class
