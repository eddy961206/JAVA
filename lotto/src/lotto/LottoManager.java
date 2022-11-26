package lotto;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoManager {
	Scanner scan = new Scanner(System.in);
	ArrayList<Lotto> lottos = new ArrayList<>();
	ArrayList<Integer> sameList = new ArrayList<>();
	int[] temp_num = new int[6];

	LottoManager() {
	}

	// 로또 수동 구매 메소드
	void buy_manual(int manual_count) {
		for (int i = 0; i < manual_count; i++) {
			System.out.printf("\n[ %d 번째 수동 로또 ]\n", i + 1);
			for (int j = 0; j < 6; j++) {
				System.out.println(j + 1 + "번째 숫자를 입력하세요 : ");
				temp_num[j] = scan.nextInt();
			}
			lottos.add(new Lotto(temp_num)); // 로또 객체 만들어서 lottos에 넣기
			lottos.get(i).type = "수동";
		}
	}// buy_manual 메소드

	// 로또 자동 구매 메소드
	void buy_auto(int auto) {
		int[] temp_arr = new int[45];
		int temp;
		for (int i = 0; i < auto; i++) {
			for (int j = 0; j < 45; j++) {
				temp_arr[j] = j + 1;
			} // 1~45배열 만들
			for (int k = 0; k < 2000; k++) {
				int r_num = (int) (Math.random() * 45);
				temp = temp_arr[0];
				temp_arr[0] = temp_arr[r_num];
				temp_arr[r_num] = temp;
			} // 그 배열 섞기
			for (int j = 0; j < 6; j++) {
				temp_num[j] = temp_arr[j];
			} // 그 배열값들을 인자로 전달해줄 배열에 넣기
			lottos.add(new Lotto(temp_num)); // 로또 객체 만들어서 lottos에 넣기
			lottos.get(Lotto.count - 1).type = "자동";
		} // 자동으로 구입한 횟수만큼 반복for
	}// buy_auto 메소드

	// 내가 산 로또들 전부 출력 메소드
	void print_mine(int total) {
		for (int i = 0; i < total; i++) {
			System.out.println();
			System.out.printf(i + 1 + "번째(%s) : ", lottos.get(i).type);
			for (int j = 0; j < 6; j++) {
				System.out.printf("%d\t", lottos.get(i).lotto_num_list.get(j));
			}
		} // 구매한 총 로또 갯수만큼 반복for
	}// print_mine 메소드

	// 당첨번호 출력(lottos의 마지막번째 Lotto객체에 담김)
	void print_win() {
		buy_auto(1); // 마지막번째에 Lotto객체 만들어 넣어.
		Lotto.count--; // count가 내가 산것보다 하나 많아지니까 갯수만 다시 빼. lottos의 갯수는 달라지지않음 주의)
		System.out.print("\n\n당첨번호 :  ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", lottos.get(lottos.size() - 1).lotto_num_list.get(i));
		}
		System.out.println();
	}// print_win메소드

	void print_result(int total) {
		for (int i = 0; i < total; i++) {
			sameList.clear();
			System.out.println();
			System.out.printf(i + 1 + "번째(%s) : ", lottos.get(i).type);
			for (int j = 0; j < 6; j++) {
				System.out.printf("%d\t", lottos.get(i).lotto_num_list.get(j));
			}

			match(i);

			System.out.println("\n당첨된 번호 갯수 : " + sameList.size());
			System.out.printf("당첨된 번호들 : ");
			for (int k = 0; k < sameList.size(); k++) {
				System.out.printf("%d, ", sameList.get(k));
			}
			System.out.println();
		} // 구매한 총 로또 갯수만큼 반복for
	}// print_result메소드

	// 비교 
	void match(int i) {
		for (int j = 0; j < 6; j++) {
			for (int k = 0; k < 6; k++) {
				if (lottos.get(i).lotto_num_list.get(j) == lottos.get(lottos.size() - 1).lotto_num_list.get(k)) {
					sameList.add(lottos.get(lottos.size() - 1).lotto_num_list.get(k));
					break;
				}
			}
		}
	}// match메소드

}// class
