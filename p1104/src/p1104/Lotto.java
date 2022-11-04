package p1104;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 로또

		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		int r_num = 0;
		int sameCount = 0;
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] same = new int[6];

		// 1~45를 순서대로 lotto 배열에 입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		// lotto배열 랜덤으로 500번 섞기
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}

		//실험용 로또 번호 출력
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
		System.out.println();
		
		// 내 번호 6번 입력받기
		for (int i = 0; i < myNum.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요 : ");
			myNum[i] = scan.nextInt();
			if (myNum[i] < 1 || myNum[i] > 45) {
				System.out.println("오류! 1과 45 사이의 숫자를 다시 입력하세요");
				i--;
			}
		}

		// 내 번호와 로또번호 비교
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (myNum[i] == lotto[j]) {
					same[sameCount] = lotto[j];
					sameCount++;
					break;
				} // if
			} // for
		} // for

		// 내 번호 6개 출력
		System.out.println();
		System.out.printf("내 번호 : ");
		for (int i = 0; i < myNum.length; i++) {
			System.out.printf("%d ", myNum[i]);
		}
		System.out.println();

		// lotto배열 6개만 출력
		System.out.println("---------------------------------");
		System.out.printf("로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}

		// 당첨된 번호 갯수
		System.out.println();
		System.out.println("---------------------------------");
		System.out.printf("당첨된 번호 갯수 : %d\n", sameCount);
		System.out.println("---------------------------------");
		System.out.printf("당첨된 번호들 : ");
		for (int i = 0; i < sameCount; i++) {
			System.out.printf("%d ", same[i]);
		}
		if (sameCount == 0) {
			System.out.println("당첨된 번호가 없습니다. 꽝");
		}

		System.out.println();
		
		switch(sameCount) {
		case 1: case 2: case 3:
			System.out.println("꽝ㅋ");
			break;
		case 4:
			System.out.println("3등입니다.");
			break;
		case 5:
			System.out.println("2등입니다.");
			break;
		case 6:
			System.out.println("축하합니다 1등입니다.");
			break;
		}
		
		
	}// main

}// class
