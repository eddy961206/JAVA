package p1111_03_쇼핑혼자연습;

import java.util.Scanner;

public class Buyer {
	static Scanner scan = new Scanner(System.in);
	String name;
	int myMoney;
	int point;

	Buyer() {
	}

	Buyer(String name, int myMoney, int point) {
		this.name = name;
		this.myMoney = myMoney;
		this.point = point;
	}

	void buy(Product p) {
		if (p.price > this.myMoney) {
			System.out.printf("잔액이 %d원 부족합니다.\n\n", p.price - myMoney);
			return;
		} else {
			System.out.println(p.productName + " 구매가 완료됐습니다 (-" + p.price + ")");
			this.myMoney -= p.price;
			this.point += p.point;
			System.out.println(this.name + "님의 남은 잔액 : " + this.myMoney);
			System.out.println("현재 포인트 : \n" + this.point);
		}
	} // 구매 메소드

	void recharge() {
		System.out.println("현재 잔액 : " + myMoney + "원");
		System.out.println("충전을 원하는 금액을 입력하세요 : ");
		int money = scan.nextInt();
		this.myMoney += money;
		System.out.printf("%d원 충전이 완료됐습니다.\n", money);
		System.out.printf("잔액 : %d원\n\n", this.myMoney);
	} // 충전메소드

	void bonusUse() {
		System.out.printf("보너스 보유액 : %d \n", this.point);
		System.out.println("보너스를 돈으로 전환하시겠습니까? 1)예 2)아니오");
		int choice = scan.nextInt();
		if (choice == 1) {
			myMoney += point;
			point = 0;
			System.out.println("포인트 전환이 완료됐습니다.\n");
			System.out.printf("현재 잔액 : %d\n", myMoney);
		} else if (choice == 2) {
			System.out.println("포인트 전환을 취소합니다.");
			return;
		} else {
			System.out.println("잘못된 입력입니다. 이전 페이지로 돌아갑니다.");
			return;
		}
	}

	void remain() {
		System.out.printf("%s님의 잔액 : %d\n", name, myMoney);
		System.out.printf("%s님의 포인트 : %d\n\n", name, point);
	}

}// class
