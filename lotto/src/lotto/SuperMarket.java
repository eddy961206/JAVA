package lotto;

import java.util.Scanner;

public class SuperMarket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LottoManager lottoManager = new LottoManager();
		int total = 0, manual_count = 0;
		Lotto lotto = new Lotto();

		// 몇 장 어떻게 살건지 물어보기
		System.out.println("몇 장의 로또를 구매하시겠습니까?");
		total = scan.nextInt();
		System.out.println("그 중 몇 장을 수동으로 하시겠습니까?");
		manual_count = scan.nextInt();

		// 로또 수동 구매CQ
		lottoManager.buy_manual(manual_count);

		// 나머진 자동 로또 구매
		lottoManager.buy_auto(total - manual_count);

		// 내가 산 로또들 전부 출력
//		lottoManager.print_mine(total);

		// 당첨번호 출력
		lottoManager.print_win();

		// 로또 한 줄당 동일번호와 갯수, 등수 출력
		lottoManager.print_result(total);
	}// main
}// class
