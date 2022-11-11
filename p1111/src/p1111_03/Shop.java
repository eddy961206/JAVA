package p1111_03;

public class Shop {
	public static void main(String[] args) {
		
		System.out.println("1. 머니충전");
		System.out.println("2. TV 구매");
		System.out.println("3. 컴퓨터 구매");
		System.out.println("4. 세탁기 구매");
		System.out.println("7. 보너스사용");
		System.out.println("8. 구매내역");
		System.out.println("9. 잔액확인");
		
		Buyer ryu = new Buyer("류승택",10000);
		
		Tv tv = new Tv();
		ryu.buy(tv);
		
	}
}
