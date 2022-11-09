package p1109;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.print.DocFlavor.INPUT_STREAM;

public class J1109_06_객체활용로또 {

	public static void main(String[] args) {
		// 로또 맞추기
		// 객체선언
		Lotto2 lo = new Lotto2();

		Scanner scan = new Scanner(System.in);
		int temp = 0;
		int r_num = 0;
		int sameCount = 0;
		int[] same = new int[6];
		int[] lotto = new int[45];
		int[] myNum = new int[6];

		// 1~45배열 만들기
		lo.lotto_input(lotto);

		// 배열 섞기
		lo.lotto_shuffle(lotto);

		// 6번 입력받기
		lo.my_input(myNum);

		// 로또번호 6개 출력
		lo.lotto_print(lotto);

		// 내 번호 6개 출력
		lo.my_print(myNum);

		// 비교
		sameCount = lo.lotto_count(lotto, myNum, same);

		//출력
		lo.lotto_no(sameCount, same);
		

		

		switch (sameCount) {
		case 0:
		case 1:
		case 2:
			System.out.println("꽝ㅋ");
			break;
		case 3:
			System.out.println("4등");
			break;
		case 4:
			System.out.println("3등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 6:
			System.out.println("1등 축하합니다");
			break;
		}

	}

}
