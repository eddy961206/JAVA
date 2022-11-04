package p1104;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		// 랜덤 넘버 맞추기 게임
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int r_num = 0;
		int count = 0;
		int[] input = new int[10];

		// 1~100중 랜덤 숫자 만들기
		r_num = (int) (Math.random() * 100) + 1;
		System.out.println(" [[ 랜덤 숫자 맞추기 게임 ]]");
		
		// 입출력 10번 반복
		while (i < 10) {
			System.out.printf("1~100사이 숫자를 입력하세요 : (남은 횟수 : %d)\n", (10 - i));
			input[i] = scan.nextInt();

			//입력받은 값과 랜덤숫자 비교
			if (input[i] == r_num) {
				System.out.println("정답입니다!\n");
				i++;
				break;
			} else if (input[i] < r_num) {
				System.out.printf("땡! %d 보다 더 큽니다.\n\n", input[i]);
			} else {
				System.out.printf("땡! %d 보다 더 작습니다.\n\n", input[i]);
			}
			
			//도전횟수 1회 증가시키기
			i++;
		} // 최대 10번 반복 while 끝
		
		// 결과 출력
		System.out.printf("정답은 %d 입니다.\n", r_num);
		System.out.printf("시도 횟수 : %d\n", i);
		System.out.println("시도했던 숫자들 : ");
		for (int j = 0; j < i; j++) {
			System.out.printf("%d, ", input[j]);
		}

	}// main

}// class
