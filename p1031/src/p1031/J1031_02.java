package p1031;

import java.util.Scanner;

public class J1031_02 {

	public static void main(String[] args) {
		// 1-10까지의 랜덤 숫자 맞추시오
		Scanner scan = new Scanner(System.in);
		// 1. 랜덤숫자 생성
		int input = 0;
		int r_num = 0;
		int i = 0;
		r_num = (int) (Math.random() * 100) + 1;

		// 10번 반복
		while (i < 10) {
			// 2. 숫자입력
			System.out.println("숫자 입력하세요.");
			input = scan.nextInt();

			if (r_num == input) {
				System.out.println("정답입니다");
				break;
			} else if(r_num>input) {
				System.out.println("오답입니다.");
				System.out.println("그거보다 큽니다");
			} else {
				System.out.println("오답입니다.");
				System.out.println("그거보다 작습니다.");
			}
			i++;
		}//while

		for (i = 0; i < 10; i++) {
			System.out.println("숫자 입력하세요.");
			input = scan.nextInt();

			if (r_num == input) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("오답입니다");
			}//for
		}
		System.out.println("정답 : " + r_num);

	}//main

}//class
