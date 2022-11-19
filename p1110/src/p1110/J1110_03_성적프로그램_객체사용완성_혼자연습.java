package p1110;

import java.util.Scanner;

public class J1110_03_성적프로그램_객체사용완성_혼자연습 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		StuCal2 stuCal = new StuCal2();

		loop: while (true) {
			choice = stuCal.screen_print();
			
			switch (choice) {
			case 1: // 성적입력
				stuCal.score_input();
				break;
			case 2:// 성적출력
				stuCal.score_print();
				break;
			case 3:// 성적 수정
				stuCal.modify();
				break;
			case 4:// 등수계산
				stuCal.rank();
				break;
			case 0:
				System.out.println("프로그램 종료합니다.");
				break loop;
			}
			
		}

	}// main

}// class
