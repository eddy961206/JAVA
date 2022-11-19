package p1110;

import java.util.Scanner;

public class J1110_03_성적프로그램_객체사용완성 {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		// 객체선언
		StuCal stuCal = new StuCal();

		loop: while (true) {
			// 1. 화면 출력
			choice = stuCal.screen_print();

			switch (choice) {
			case 1: // 성적입력
				stuCal.score_input();
				break;

			case 2: // 성적 출력
				stuCal.score_print();
				break;

			case 3: // 성적 수정
				stuCal.score_modify();
				break;

			case 4: // 등수 계산
				stuCal.score_rank();
				break;

			case 0:
				System.out.println("프로그램 종료");
				break loop;

			} // switch

		} // 무한반복while

	}// main

}// class
