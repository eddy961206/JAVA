package exam_prc;

import java.util.Scanner;

public class Exam_prc_1103_로또 {

	public static void main(String[] args) {
		// 로또
		Scanner scan = new Scanner(System.in);
		int r_num = 0;
		int temp = 0;
		int count = 0; // 맞는 갯수용
		int[] myNum = new int[6];
		int[] lotto = new int[45];
		int[] same = new int[6];

		// 1~45 순서대로 넣기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		// 순서 섞기
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}

		// 내 번호 6개 배열에 입력
		System.out.println("[[ 로또 게임 ]]");
		for (int i = 0; i < 6; i++) {
			System.out.println(i + 1 + "번째 번호를 입력하세요 : ");
			myNum[i] = scan.nextInt();
			if (myNum[i] < 1 || myNum[i] > 45) {
				System.out.println("1과 45사이의 숫자만 입력하세요");
				i--;
			}
		}

		// 내 번호 출력
		System.out.println();
		System.out.printf("내 번호 : ");
		for (int i = 0; i < myNum.length; i++) {
			System.out.printf("%d ", myNum[i]);
		}
		System.out.println();
		System.out.println("-----------------------------");

		// 로또 번호 6개 출력
		System.out.printf("로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
		System.out.println();
		System.out.println("-----------------------------");

		// 맞는 번호들 찾기
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == myNum[j]) {
					same[count] = lotto[i];
					count++;
					break;
				}
			}
		}

		// 맞은 번호의 갯수, 번호들 출력
		System.out.printf("당첨 번호 갯수 : %d개\n", count);
		System.out.println("--------------------");
		System.out.printf("당첨 번호 : ");
		if (count == 0) {
			System.out.println("당첨된 번호가 없습니다.");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.printf("%d ", same[i]);
			}
		}
		System.out.println();

		
		switch (count) {
		case 1:
		case 2:
		case 3:
			System.out.println("꽝입니다");
			break;
		case 4:
			System.out.println("3등입니다");
			break;
		case 5:
			System.out.println("2등입니다");
			break;
		case 6:
			System.out.println("1등입니다");
			break;
		}

	}// main

}// class
