package p1111_03_쇼핑혼자연습;


public class Computer extends Product{
	
	Computer() {
		this(200, 20, "컴퓨터");
	}

	
	Computer(int price, int point, String productName) {
		super(price, point, productName);
	}
	
}
