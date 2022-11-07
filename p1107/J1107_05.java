package p1107;

public class J1107_05 {
	public static void main(String[] args) {

		// 52장 : 1~10 + J,Q,K 13장 *
		// 4하트스페이드다이아몬드클로바 = 52장

		// 13장 카드 만들어서, kind = Heart, number 1~13
		// 숫자를 넣고 출력하시오

		Card[] c = new Card[13]; // 배열선언

		// 입력
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(); // 객체선언
			c[i].kind = "Heart";

			if (i < 10) {
				c[i].number = "" + (i + 1);
			} else if (i == 10) {
				c[i].number = "J";
			} else if (i == 11) {
				c[i].number = "Q";
			} else if (i == 12) {
				c[i].number = "K";
			}

			// 출력
//			System.out.println(c[i].kind + " : " + c[i].number);
		} // for

		// 26장 카드 1~K, 종류는 하트,클로버로

		Card[] c2 = new Card[52]; // 배열선언

		// 입력
		for (int i = 0; i < c2.length; i++) {
			c2[i] = new Card(); // 객체선언
			if (i < 13) {
				c2[i].kind = "Heart";
			} else if (i < 26) {
				c2[i].kind = "Clover";
			} else if (i < 39) {
				c2[i].kind = "Spade";
			} else {
				c2[i].kind = "Diamond";
			}

			if (i % 13 < 10) {
				c2[i].number = "" + (i % 13 + 1);
			} else if (i % 13 == 10) {
				c2[i].number = "J";
			} else if (i % 13 == 11) {
				c2[i].number = "Q";
			} else if (i % 13 == 12) {
				c2[i].number = "K";
			}

			// 출력
			System.out.println(c2[i].kind + " : " + c2[i].number);
		} // for

//		Card c = new Card();
//		c.kind = "Heart";
//		c.number = 1;
//
//		Card c2 = new Card();
//		c2.kind = "Clover";
//		c2.number = 13;
//
//		System.out.printf("%s : %d \n", c.kind, c.number);
//		System.out.printf("%s : %d \n", c2.kind, c2.number);

	}
}
