package p1110;

import java.util.Scanner;

public class J1110_02_카드 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choice = 0;

		Deck d = new Deck();

		while (true) {
			System.out.println("\n[  포커 카드게임  ]");
			System.out.println("1. 카드 섞기");
			System.out.println("2. 카드 1장 받기");
			System.out.println("3. 카드 5장 받기");
			System.out.println("4. 내 카드 보기");
			System.out.println("9. 게임 리셋");
			System.out.println("10. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 선택하세요.");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				d.shuffle();
				System.out.println("카드를 섞었습니다!");
				break;
			case 2:
				System.out.println("\n원하는 카드를 뽑아주세요 (0~51)");
				choice = scan.nextInt();
				Card c = d.pick(choice); // 내가 뽑은 카드 -> 저장시켜야함
				
				System.out.printf("뽑은 카드 : %s,%s\n\n", c.kind, c.number);
				break;
			case 3:

				break;
			case 4:
				System.out.println("게임을 종료합니다.");
				break;

			}// switch

		} // 무한반복 while

//		System.out.println("원하는 카드를 뽑아주세요 : (0~51)");
//		int choice = scan.nextInt();
//		Card c = d.pick(choice);
//		
//		System.out.printf("%s,%s\n",c.kind,c.number);
//		
//		for (int i = 0; i < d.c.length; i++) {
//			System.out.printf("카드 %s,%s \n", d.c[i].kind, d.c[i].number);
//		}

	}

}
