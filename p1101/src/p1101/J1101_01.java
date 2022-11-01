package p1101;

import java.util.Scanner;

import javax.naming.AuthenticationException;

public class J1101_01 {

	public static void main(String[] args) {
		// 1. 1~45까지 갖고있는 45개짜리 배열 만들기
		int[] lotto = new int[45];
		for (int i = 0; i < 45; i++)
			lotto[i] = i + 1;

		// 2. 로또 배열 섞기
		int temp = 0, r_num = 0;
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}

		
		
		// 3. 6개 내 번호 입력
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];

		for (int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "번째 번호 입력하세요.");
			input[i] = scan.nextInt();
		}

		// 5. 내가 입력했던 숫자 6개 출력
		System.out.print("내가 입력한 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", input[i]);
		}
		System.out.println();

		// 4. 로또 번호 6개 출력
				System.out.print("로또 당첨번호 : ");
				for (int i = 0; i < 6; i++) {
					System.out.printf("%d ", lotto[i]);
				}
				System.out.println();

		// 6. 맞는 개수 확인
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == input[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("당첨된 번호 갯수 : "+count);

	}// main

}// class
