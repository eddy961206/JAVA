package p1111_02;

public class Shop {
	public static void main(String[] args) {
		// 소비자 1명 생성
		System.out.println("1. 머니충전");
		System.out.println("2. TV 구매");
		System.out.println("3. 컴퓨터 구매");
		System.out.println("4. 세탁기 구매");
		System.out.println("7. 보너스사용");
		System.out.println("8. 구매 내역 ");
		System.out.println("9. 잔액확인");

		Buyer ryu = new Buyer(10000, 0);

		Product tv = new Tv(); // 객체선언, 다형성 변경
//		Tv tv = new Tv(); // 이렇게도 가능. buy메소드의 매개변수로 넘겨주면 알아서 형변환 됨.
		ryu.buy(tv); // tv 구매
		ryu.buy(tv); // tv 구매
		ryu.buy(tv); // tv 구매
		
		Product com = new Computer();
		ryu.buy(com);
		ryu.buy(com);
		
		Product wash = new Wash();
		ryu.buy(wash);
		ryu.buy(wash);
		ryu.buy(wash);
		ryu.buy(wash);
		// 오버로딩 - 이름 같, 매개변수 달라 - 다른 메소드
		
		
		
	}
}
