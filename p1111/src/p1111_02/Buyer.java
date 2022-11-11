package p1111_02;

public class Buyer {

	int myMoney;
	int bonusPoint;

	Buyer() {
	} // 기본생성자

	Buyer(int myMoney, int bonusPoint) { // 생성자
		this.myMoney = myMoney;
		this.bonusPoint = bonusPoint;
	}

	// p가 Tv, 컴, 세탁기일 수 있. 다형성
	void buy(Product p) {
		myMoney -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("주소가 입력되었습니다.");
		System.out.println(p.productName+"를(을) 구매했습니다.");
		System.out.println("현재잔액 : " + myMoney);
	}

}// class
