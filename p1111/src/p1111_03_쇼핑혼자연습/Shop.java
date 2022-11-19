package p1111_03_쇼핑혼자연습;

import java.awt.Menu;
import java.util.Scanner;


public class Shop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int money = 0;
		int choice = 0;
		
		System.out.println("고객님의 이름을 입력하세요 : ");
		name = scan.next();
		System.out.println(name+"고객님의 충전금액을 입력하세요 : ");
		money = scan.nextInt();
		Buyer b1 = new Buyer(name,money,0);
		Tv t = new Tv();
		Computer c = new Computer();
		Wash w = new Wash();
	
		while(true) {
			choice = b1.menu();
			
			switch (choice) {
			case 1: // 1.머니충전
				b1.recharge();
				break;
			case 2:// 2.TV 구매
				b1.buy(t);
				break;
			case 3:// 3.컴퓨터 구매
				b1.buy(c);				
				break;
			case 4:// 4. 세탁기 구매
				b1.buy(w);
				break;
			case 7:// 7. 보너스 사용
				b1.bonusUse();
				break;
			case 8:// 8. 구매내역
				b1.cart();
				break;
			case 9:// 9. 잔액확인
				b1.remain();
				break;
			}
			
			
		}// while

	}// main
}//class
