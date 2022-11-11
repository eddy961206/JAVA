package p1111_03;

public class Tv extends Product {
	
	Tv() {
		this("Tv",100,10);
	}
	
	Tv(String name, int price, int bonusPoint){
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}
