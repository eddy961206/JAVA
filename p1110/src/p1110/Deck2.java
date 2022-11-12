package p1110;

import java.util.Scanner;

public class Deck2 {
	final static int CARD_NUM = 52;
	static Scanner scan = new Scanner(System.in);
	Card[] c = new Card[CARD_NUM];

	// 기본생성자. 카드 1~52까지 4*13종류 생성
	Deck2() {
		for (int i = 0; i < CARD_NUM; i++) {
			c[i] = new Card();
			if (i < 13) {
				c[i].kind = "Heart";
			} else if (i < 26) {
				c[i].kind = "Spade";
			} else if (i < 39) {
				c[i].kind = "Diamond";
			} else {
				c[i].kind = "Clover";
			}
			if (i % 13 == 10) {
				c[i].number = "J";
			} else if (i % 13 == 11) {
				c[i].number = "Q";
			} else if (i % 13 == 12) {
				c[i].number = "K";
			} else {
				c[i].number = (i % 13 + 1) + "";
			}
		} // for
	}// 기본생성자

	// 카드 섞기
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int r_num = (int) (Math.random() * 52);
			Card temp;
			temp = c[0];
			c[0] = c[r_num];
			c[r_num] = temp;
		} // for
	}// 섞는 메소드

	// 카드 1장 받는 메소드
	Card pick(int index) {
		return c[index%52];
	}

}// class
