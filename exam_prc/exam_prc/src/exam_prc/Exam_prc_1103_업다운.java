package exam_prc;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Exam_prc_1103_업다운 {

	public static void main(String[] args) {
		// 업다운 게임
		Scanner scan = new Scanner(System.in);
		int r_num = 0;
		int count = 0;
		int myInput = 0;
		r_num = (int) (Math.random() * 100) + 1;

		// 최대 10번 반복 (맞출 때까지)
		System.out.println("[[ 업다운 게임 (1~100)]]");
		for (int i = 0; i < 10; i++) {
			System.out.printf((i+1)+ "번째 번호를 입력하세요 : (남은 횟수 : %d번)\n", 10-i);
			myInput = scan.nextInt();
			if (myInput == r_num) {
				System.out.println("정답입니다!");
				count = i;
				break;
			} else if (myInput<r_num) {
				System.out.printf("땡! %d보다 큽니다\n\n",myInput);
			} else {
				System.out.printf("땡! %d보다 작습니다.\n\n",myInput);
			}//if
		}//for
		System.out.println("정답은 "+r_num+" 입니다.");
		System.out.println("시도 횟수 : " + count);
		
		
	}// main

}// class
