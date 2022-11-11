package p1111_03;

public class Wash extends Product{
	Wash() {
		this("Wash",150,15);
	}
	
	Wash(String name, int price, int bonusPoint){
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
