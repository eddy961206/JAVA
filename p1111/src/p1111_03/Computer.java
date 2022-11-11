package p1111_03;

public class Computer extends Product{
	
	Computer() {
		this("Computer",200,20);
	}
	
	Computer(String name, int price, int bonusPoint){
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
}
