package p1111_02;

public class Tv extends Product {

	Tv() { // 기본생성자
		this("Tv",100, 10); // 같은 클래스의 다른 생성자 호출
	}

	Tv(String name, int price, int bonusPoint) { // 생성자
		this.productName = name;
		this.price = price; // this해도 price가 없으니 부모의 것을 가져옴.
		this.bonusPoint = bonusPoint;
	}
}
