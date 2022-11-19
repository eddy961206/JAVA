package p1111_03_쇼핑혼자연습;

public class Wash extends Product{
	Wash() {
		this(300, 30, "세탁기");
	}

	Wash(int price, int point, String productName) {
		super(price, point, productName);
	}
}
