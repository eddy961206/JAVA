package p1111_02_쇼핑;

public class Wash extends Product {
	Wash() { // 기본생성자
		this("세탁기",150, 15); // 같은 클래스의 다른 생성자 호출
	}

	Wash(String name, int price, int bonusPoint) { // 생성자
		this.productName = name;
		this.price = price; // this해도 price가 없으니 부모의 것을 가져옴.
		this.bonusPoint = bonusPoint;
	}
}
