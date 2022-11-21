package p1121;

public class Ref extends Product{
	
	public Ref() {
		this("비스포크 냉장고", 150, 15);
	}
	
	Ref(String ProductName, int price, int bonustPoint){
		this.ProductName = ProductName;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
	
}
