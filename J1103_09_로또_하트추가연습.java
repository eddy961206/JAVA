package p1103;

import java.util.Scanner;

public class J1103_09_로또_하트추가연습 {

	public static void main(String[] args) {

		// 1. 45개 배열 생성
		Scanner scan = new Scanner(System.in);
		String[] lotto_output = new String[45]; // 화면출력 로또번호배열
		int[] lotto = new int[45]; // 당첨 로또번호배열
		int[] input = new int[6]; // 내가 입력한 로또번호
		int[] l_no = new int[6]; // 당첨된 번호
		int count = 0; // 입력한 횟수
		int num = 0; // 당첨된 번호 갯수

		// 2. 1~45 lotto 배열에 넣
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
			lotto_output[i] = ""+(i+1);
		} // for

		// 3. lotto 배열 랜덤으로 섞 (lotto_output은 안섞음)
		int temp = 0;
		int r_num = 0;
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		} // for
		
	
		
		// 4. 번호 6개 입력받기.
		while (count < 6) {
			// lotto_output (String배열) 출력
			for (int i = 0; i < lotto_output.length; i++) {
				if(i%5==0 && i!=0) {
					System.out.println();
				}
				System.out.printf("%s\t",i+1);
			}
			System.out.println();
			
			System.out.println("로또번호를 입력하세요. (1~45) >>");
			input[count] = scan.nextInt();
			count++;
		} // while
		
		
		// 5. 당첨번호 6개 숫자 출력
		System.out.println("       [ 로또 추첨 ]");
		System.out.printf("로또 당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d  ", lotto[i]);
		}
		System.out.println();
		System.out.println("-------------------------------------");

		// 6. 내가 넣은 번호 6개 출력
		System.out.printf("나의 로또번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d  ", input[i]);
		}
		System.out.println();
		System.out.println("-------------------------------------");

		// 7. 당첨번호 갯수 확인
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == input[j]) {
					l_no[num] = input[j]; // 당첨된 번호를 l_no에 넣기
					num++; // 당첨된 번호 갯수
					break;
				} // if
			} // for
		} // for

		// 8. 당첨번호 갯수, 번호 출력
		System.out.printf("당첨번호 개수 : %d \n", num);
		System.out.println("-------------------------------");
		System.out.printf("당첨번호 : ");
		if (num == 0) {
			System.out.printf("당첨번호가 없습니다.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.printf("%d  ", l_no[i]);
			} // for
		}
		System.out.println();
		
		
		
	}// main

}// class
