package p1111_03;

public class Buyer {
	String name;
	int myMoney;
	int bonusPoint;
	
	
	Buyer() {}
	
	Buyer(String name, int myMoney){
		this.name = name;
		this.myMoney = myMoney;
	}
	
	
	void buy(Product p) {
		System.out.println(p.productName+"구매를 완료했습니다");
		myMoney -= p.price;
		System.out.println("남은 돈 : "+ myMoney);
	}
	
	

}// class
