package p1121;


public class Cond extends Product{

	Cond(){
		this("무풍 에어컨", 120, 12);
	}

	
	Cond(String ProductName, int price, int bonusPoint){
		this.ProductName = ProductName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
}
