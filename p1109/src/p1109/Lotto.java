package p1109;

import java.util.Scanner;

public class Lotto {

	static Scanner scan = new Scanner(System.in);

	int lotto_input(int count, int[] input) {
		// 입력
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d번째 숫자 입력하세요 : \n", i + 1);
			input[i] = scan.nextInt();
			count++;
		}
		return count;
	}

}
