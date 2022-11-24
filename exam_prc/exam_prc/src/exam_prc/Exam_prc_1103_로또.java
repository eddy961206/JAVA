package exam_prc;

import java.util.Scanner;

public class Exam_prc_1103_로또 {

	public static void main(String[] args) {
		// 로또
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		int r_num = 0;
		int sameCount = 0;
		int[] same = new int[6];
		int[] lotto = new int[45];
		int[] myNum = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}

		for (int i = 0; i < myNum.length; i++) {
			System.out.printf((i + 1) + "번째 숫자를 입력하세요");
			myNum[i] = scan.nextInt();
			if (myNum[i] < 1 || myNum[i] > 45) {
				System.out.println("오류) 1과 45사이의 숫자만 입력하세요.");
				i--;
			}
		}

		for (int i = 0; i < myNum.length; i++) {
			for (int j = 0; j < myNum.length; j++) {
				if (myNum[i] == lotto[j]) {
					same[sameCount] = lotto[j];
					sameCount++;
				}
			}
		}

		System.out.printf("내 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", myNum[i]);
		}
		System.out.println("--------------------------------");

		System.out.printf("로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
		System.out.println("--------------------------------");

		System.out.println("당첨된 번호 갯수 : " + sameCount);
		System.out.printf("당첨된 번호들 : ");
		for (int j = 0; j < sameCount; j++) {
			System.out.printf("%d ",same[j]);
		}

	}// main

}// class
