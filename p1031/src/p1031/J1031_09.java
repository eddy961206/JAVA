package p1031;

import java.util.Scanner;

public class J1031_09 {

	public static void main(String[] args) {
		// 1. 1~45까지 갖고있는 45개짜리 배열 만들기
		// 2. 로또 배열 섞기
		// -temp,r_num 변수 선언
		// -반복문 500번 실행해서 섞기
		// -r_num : 0~44까지 랜덤으로 숫자 생성(index로 써야하니까)
		// -temp 사용해서 index0과 랜덤 index의 원소 교환(섞)
		// 3. 6개 번호입력
		// - 6개 배열 생성후 scan 입력받기(6번 반복문)
		// 4. 섞어놓은 로또 번호 중 6개만 출력
		// 5. 내가 입력했던 숫자 6개 출력

		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] input = new int[6];
		int temp = 0;
		int r_num = 0;
		int count = 0;

		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 로또 1~45 랜덤 배열 섞기
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}
		//보너스번호
		int bonus = lotto[6];
		int bo = 0;

		System.out.printf("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
		
		// 내 로또 번호 입력받아서 배열 생성
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 번호 입력하세요");
			input[i] = scan.nextInt();
			if (0 >= input[i] || input[i] > 45) {
				System.out.println("1이상 45이하의 수를 입력하세요");
				System.out.println();
				i--;
			}
//			for (int k = 0; k < 6; k++) {
//				for (int j = k + 1; j < 6; j++) {
//					if (input[k]==input[j]) {
//						System.out.println("숫자 중복입니다. 다른 숫자 입력하세요");
//						i--;
//					}
//				}
//			}
		}

		// 내 로또 번호 출력
		System.out.printf("내 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", input[i]);
		}
		System.out.printf("\n");

		// 로또 6개 출력
		System.out.printf("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
		System.out.printf("\n 보너스 번호 : %d ",lotto[6]);

		

		// 당첨 갯수
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 6; j++) {
				if (lotto[i] == input[j]) {
					count++;
				}
			}

		}
		System.out.printf("\n 일반 번호 맞은 갯수 : %d \n", count);

		for (int i = 0; i < 6; i++) {
			if (input[i] == bonus) {
				bo = 1;
			}
		}
		System.out.printf("\n 보너스 포함 맞은 갯수 : %d \n", count + bo);

		if (count < 3) {
			System.out.println("꽝 ㅋ");
		} else if (count == 3) {
			System.out.println("5등");
			System.out.println("상금 : 5,000원");
		} else if (count == 4) {
			System.out.println("4등");
			System.out.println("상금 : 50,000원");
		} else if (count == 5 && bo == 0 ) {
			System.out.println("3등");
			System.out.println("상금 : 1,524,241원");
		} else if (count == 5 && bo == 1) {
			System.out.println("2등");
			System.out.println("상금 : 52,833,990원");
		} else if (count == 6) {
			System.out.println("1등");
			System.out.println("상금 : 11,585,019,672원");
		}

		

	} // main

}// class
