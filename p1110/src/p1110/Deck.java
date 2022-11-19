package p1110;

public class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM]; // 배열선언
	  
	Deck() { // 생성자
		// 객체 생성하면 카드 52개 알아서 생성되게.
		for (int i = 0; i < c.length; i++) { // 1~10/JQK/1~10....
			c[i] = new Card(); // 객체 선언. !!!!!!!!!잊지 마!!!!!!!!!!

			if (i % 13 == 10) {
				c[i].number = "J";
			} else if (i % 13 == 11) {
				c[i].number = "Q";
			} else if (i % 13 == 12) {
				c[i].number = "K";
			} else {
				c[i].number = ((i % 13) + 1) + "";
			} // if

			if (i / 13 == 0) {
				c[i].kind = "Spade";
			} else if (i / 13 == 1) {
				c[i].kind = "Diamond";
			} else if (i / 13 == 2) {
				c[i].kind = "Heart";
			} else {
				c[i].kind = "Clover";
			}
		} // for
	}// 생성자Deck()

	// 카드 1개 뽑는 메소드
	Card pick(int index) {
		return c[index%52]; // 52 넘는거 알아서 처리
	} // pick

	// 카드 52개 섞는 메소드
	void shuffle() {
		Card temp = null;
		int r_num;
		for (int i = 0; i < 2000; i++) {
			r_num = (int) (Math.random() * 52); // 0~51까지.
			temp = c[0];
			c[0] = c[r_num];
			c[r_num] = temp;
		}
	}// shuffle

	// 카드 5개 뽑는 메소드
	Card[] fivePick(Card[] c) {

		return c;
	}

}
