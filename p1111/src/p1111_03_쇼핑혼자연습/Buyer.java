package p1111_03_쇼핑혼자연습;

import java.util.Scanner;

public class Buyer {
	static Scanner scan = new Scanner(System.in);
	int count,choice;
	String name;
	int myMoney;
	int point;
	int totalMoney;
	int totalPoint;
	Product[] cart = new Product[10];

	Buyer() {
	}

	Buyer(String name, int myMoney, int point) {
		this.name = name;
		this.myMoney = myMoney;
		this.point = point;
	}
	
	int menu() {
		System.out.printf("[환영합니다, %s 고객님]\n",this.name);
		System.out.println("1. 머니충전");
		System.out.println("2. TV 구매");
		System.out.println("3. 컴퓨터 구매");
		System.out.println("4. 세탁기 구매");
		System.out.println("7. 보너스사용");
		System.out.println("8. 구매내역");
		System.out.println("9. 잔액확인");
		
		choice = scan.nextInt();
		return choice;
	}
	
	

	void buy(Product p) {
		if(count<10) { //10개 이상 못 삼
			if (p.price > this.myMoney) {
				System.out.printf("구매 실패 : 잔액이 %d원 부족합니다.\n\n", p.price - myMoney);
				return;
			} else {
				System.out.println(p.productName + " 구매가 완료됐습니다 (-" + p.price + ")");
				this.myMoney -= p.price;
				this.point += p.point;
				cart[count] = p;
				count++;
				System.out.println(this.name + "님의 남은 잔액 : " + this.myMoney);
				System.out.println("현재 포인트 : \n" + this.point);
				System.out.println();
			}//if
		} else {
			System.out.println("너무 많이 사셨습니다. 그만 사세요");
		}//if
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
			System.out.println("포인트 전환이 완료됐습니다.");
			System.out.printf("현재 잔액 : %d\n\n", myMoney);
		} else if (choice == 2) {
			System.out.println("포인트 전환을 취소합니다.");
			return;
		} else {
			System.out.println("잘못된 입력입니다. 이전 페이지로 돌아갑니다.\n");
			return;
		}
	}

	void cart() {
		System.out.printf("[[ %s님의 구매 목록 ]]\n", name);
		for (int i = 0; i < count; i++) {
			System.out.printf("%d. %s - %d원 / 포인트 %d 적립\n", 
					i + 1, cart[i].productName, cart[i].price, cart[i].point);
			totalMoney += cart[i].price; 
			totalPoint += cart[i].point; 
		}
		System.out.printf("\n총 사용 금액 : %d\n",totalMoney);
		System.out.printf("총 누적 포인트 : %d\n\n",totalPoint);
	}

	void remain() {
		System.out.printf("%s님의 잔액 : %d\n", name, myMoney);
		System.out.printf("%s님의 보유 포인트 : %d\n\n", name, point);
	}

}// class
