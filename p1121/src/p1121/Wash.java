package p1121;

public class Wash extends Product{
	
	public Wash() {
		this("그랑데 세탁기", 90,9);
	}	
	
	Wash(String ProductName, int price, int bonusPoint){
		this.ProductName = ProductName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	

}
