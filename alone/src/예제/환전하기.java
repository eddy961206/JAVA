package 예제;

import java.util.Scanner;

class Exchange {

	static final double WONEURO = 1320.48026;
	static final double WONDOLLAR = 1063.82979;
	int euro;
	int dollar;
	int won;

	Exchange() {
	}

	Exchange(int euro, int dollar) {
		this.euro = euro;
		this.dollar = dollar;
	}

	int changeToWon() {
		won = (int) ((euro * WONEURO) + (dollar * WONDOLLAR));
		return won;
	}

}

public class 환전하기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("유로 입력하세요 : ");
		int euro = scan.nextInt();
		System.out.println("달러 입력하세요 : ");
		int dollar = scan.nextInt();

		Exchange e = new Exchange(euro, dollar);
		int won = e.changeToWon();
		System.out.println(euro + "유로" + " + " + dollar + "달러 = " + won + " 원");

	}
}
