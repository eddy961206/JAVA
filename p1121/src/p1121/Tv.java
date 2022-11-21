package p1121;

public class Tv extends Product {
	
	Tv(){
		this("75인치 스마트Tv",100,10);
	}
	
	Tv(String ProductName, int price, int bonusPoint){
		this.ProductName = ProductName; 
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
