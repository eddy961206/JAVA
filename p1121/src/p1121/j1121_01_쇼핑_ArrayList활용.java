package p1121;

import java.util.Iterator;
import java.util.Scanner;

public class j1121_01_쇼핑_ArrayList활용 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		System.out.println("류승택님이 로그인하셨습니다.");
		Buyer ryu = new Buyer("류승택", 5000, 0);

		while (true) {
			System.out.println("\n[ 삼성프라자 ]");
			System.out.println("인기추천 상품 빅세일");
			System.out.println("1. 75인치 smartTV"); // 100,10
			System.out.println("2. 비스포크 냉장고"); // ref 150,15
			System.out.println("3. 그랑데 세탁기"); // wash 90,9
			System.out.println("4. 무풍 에어컨"); // cond 120,12
			System.out.println("5. 보너스포인트 현금 전환");
			System.out.println("7. 금액충전");
			System.out.println("8. 구매 상품리스트");
			System.out.println("9. 현재 보유금액 및 보너스포인트");
			System.out.println("------------------------------");
			System.out.println("구매하고 싶은 물건을 선택하세요>>");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				ryu.buy(new Tv()); // tv 1대 구매!
				System.out.println("75인치 스마트티비 1대가 구매 완료됐습니다.");
				break;
			case 2:
				ryu.buy(new Ref());
				System.out.println("비스포크 냉장고 1대가 구매 완료됐습니다.");
				break;
			case 3:
				ryu.buy(new Wash());
				System.out.println("그랑데 세탁기 1대가 구매 완료됐습니다.");
				break;
			case 4:
				ryu.buy(new Cond());
				System.out.println("무풍 에어컨 1대가 구매 완료됐습니다.");
				break;

			case 5:
				if(ryu.bonusPoint<50) {
					System.out.println("보유포인트 50만 이상부터 현금으로 전환가능합니다.");
				} else {
					System.out.println("현재 포인트 : " + ryu.bonusPoint);
					System.out.println("변경할 포인트를 입력하세요 >> ");
					choice = scan.nextInt();
					if (ryu.bonusPoint < choice) {
						System.out.println("입력한 포인트가 더 많습니다. 다시 입력하세요.");
						break;
					}
					ryu.bonusPoint -= choice;
					ryu.money += choice;
					System.out.println("전환이 완료되었습니다.");	
					System.out.println("현재 보유금액 : " + ryu.money);
					System.out.println("현재 포인트 : " + ryu.bonusPoint);
				}
				break;
			case 7:
				System.out.println("현재 잔액 : " + ryu.money);
				System.out.println("충전금액을 입력하세요 >>");
				choice = scan.nextInt();
				ryu.money += choice;
				System.out.println(choice + "원 충전이 완료됐습니다.");
				System.out.println("현재 보유금액 : " + ryu.money);
				break;
			case 8:
				System.out.println("[ 구매상품 리스트 ]");
				System.out.println("총 구매상품 갯수 : " + ryu.list.size());
				System.out.println("구매상품 리스트 : ");
				for (int i = 0; i < ryu.list.size(); i++) {
					System.out.println(ryu.list.get(i).ProductName);
				}
				break;
			case 9:
				System.out.println("보유금액 : " + ryu.money);
				System.out.println("보너스포인트 : " + ryu.bonusPoint);
				break;
			}// switch

		} // while
		
		
		
		
		
	}// main
}// class
