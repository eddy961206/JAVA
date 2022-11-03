package exam_prc;

import java.util.Scanner;

public class Exam_prc_1103_업다운 {

	public static void main(String[] args) {
		// 업다운 게임
		int count = 0;
		int r_num = 0;
		int input = 0;

		r_num = (int) (Math.random() * 100) + 1;
		Scanner scan = new Scanner(System.in);

		// 10번 반복
		while (count < 10) {
			System.out.println("1~100 사이의 숫자를 입력하세요 : ");
			System.out.printf("(남은기회 : %d번)", 10 - count);
			input = scan.nextInt();
			if (input < 1 || input > 100) {
				System.out.println("오류 : 1과 100사이의 값을 입력해주세요.");
				count--;
			} else {
				if (input == r_num) {
					System.out.println("정답입니다!");
					break;
				} else if (input > r_num) {
					System.out.printf("오답입니다. %d보다 작습니다.\n\n", input);
				} else {
					System.out.printf("오답입니다. %d보다 큽니다.\n\n", input);
				}
			}
			count++;
		} // while
		System.out.printf("정답은 %d 입니다", r_num);

	}// main

}// class
