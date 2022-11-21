package p1121_02;

import java.util.ArrayList;

public class Member {
	String id; // ryu
	String name; // 류승택
	int money; // 보유금앧
	int bonusPoint;// 보너스포인트
	// 구매차량 담기
	ArrayList<Car> list = new ArrayList<Car>();

	Member() {

	}

	Member(String id, String name, int money, int bonusPoint) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}

	// 구매메소드
	void buy(Car c) {
		// 보유금액과 차량금액비교
		if (money < c.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		money -= c.price;
		bonusPoint += c.bonusPoint;
		System.out.println(c.name + " 1대를 구매했습니다.");
		System.out.printf("남은 돈 : %,d %n\n", money);

		// 차량구매후 list 추거
		list.add(c);

	}
}
