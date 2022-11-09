package p1109;

import java.util.Scanner;

public class Lotto2 {

	static Scanner scan = new Scanner(System.in);

	// 1~45까지 순서대로 입력 메소드
	void lotto_input(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
	}// lotto_input

	// 배열 섞기 메소드
	void lotto_shuffle(int[] lotto) {
		int r_num = 0;
		int temp = 0;
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}
	}// lotto_shuffle

	// 6번 입력받기
	void my_input(int[] input) {
		
		int count = 0;
		while (count < 6) {
			System.out.println("로또 번호를 입력하세요 : ");
			input[count] = scan.nextInt();
			count++;
		}
	}
	
	
	// 로또번호 6개 출력
	void lotto_print(int[] lotto) {
		System.out.println();
		System.out.println();
		System.out.printf("로또번호 : \n");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}//method
 	
	// 내 번호 6개 출력
	void my_print(int[] input) {
		System.out.printf("\n내 번호 : \n");
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d ", input[i]);
		}
	}// method
	
	
	// 비교
	int lotto_count(int[] lotto, int[]my_num, int[] same) {
		int sameCount = 0;

		for(int i = 0; i<6; i++) {
			for (int j = 0; j < 6; j++) {
				if(lotto[i]==my_num[j]) {
					same[sameCount] = my_num[j];
					sameCount++;
				}
			}
		}
		
		return sameCount;
	}// method
	
	// 출력
	void lotto_no(int sameCount, int[] same) {
		for (int i = 0; i < sameCount; i++) {
			System.out.printf("\n\n당첨된 숫자 : ",same[i]);
		}
		if (sameCount == 0) {
			System.out.println("당첨된 숫자가 없습니다.");
		} else {
			for (int i = 0; i < sameCount; i++) {
				System.out.printf("%d ", same[i]);
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
