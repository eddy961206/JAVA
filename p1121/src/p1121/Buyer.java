package p1121;

import java.util.ArrayList;

public class Buyer {
	String name; // 구매자
	int money; // 보유금액(만원)
	int bonusPoint; // 보너스포인트
	int i = 0;
//	Product[] cart = new Product[10]; // 구매배열(이젠 안쓸거야)
	ArrayList<Product> list = new ArrayList<Product>(); //제네릭 덕에 형변환 안해도.
	// Object클래스를 담을 수 있음
	// 객체배열의 장점 : 선언을 하면 자동으로 10개가 만들어짐.
	// 11개째에 자동으로 10개 추가됨 삭제시 1칸씩 앞으로 당겨짐.
	
	Buyer() {
	}

	Buyer(String name, int money, int bonusPoint) {
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다. 금액을 충전하세요");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		list.add(p); // 구매한 상품을 list에 저장
		i++;
	}

}
