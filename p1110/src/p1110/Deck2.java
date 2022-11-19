package p1110;

import java.util.Scanner;

public class Deck2 {
	static Scanner scan = new Scanner(System.in);
	final static int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];
	Card[] myCard = new Card[5]; // 내 카드 5개배열
	Card temp = null;
	int choice, r_num, card_count, player_count;
	String name;

	Deck2(String name) { // 기본생성자 카드 52개 생성
		
		this.name = name;
		for (int i = 0; i < CARD_NUM; i++) {
			c[i] = new Card();
			if (i < 13) {
				c[i].kind = "Heart";
			} else if (i < 26) {
				c[i].kind = "Spade";
			} else if (i < 39) {
				c[i].kind = "Clover";
			} else {
				c[i].kind = "Diamond";
			}
			if (i % 13 == 9) {
				c[i].number = "A";
			} else if (i % 13 == 10) {
				c[i].number = "J";
			} else if (i % 13 == 11) {
				c[i].number = "Q";
			} else if (i % 13 == 12) {
				c[i].number = "K";
			} else {
				c[i].number = i % 13 + 1 + "";
			}
		} // 52개 카드 만드는 for

		for (int i = 0; i < 5; i++) {
			myCard[i] = new Card();
		} // 내 카드 5개 넣을 배열의 객체 선언 for
	}// 기본생성자

	int show_menu() {
		// 무한반복
		while (true) {
			System.out.printf("\n[[ 환영합니다, %s님 ]]\n", this.name);
			System.out.println("0. 참여자 추가");
			System.out.println("1. 카드섞기");
			System.out.println("2. 카드 1장 받기");
			System.out.println("3. 카드 5장 받기");
			System.out.println("4. 내 카드 보기 ");
			System.out.println("5. 참여자 보기");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			choice = scan.nextInt();
			return choice;
		} // while
	}

	void player_add() {
		System.out.println("추가할 사람의 이름을 입력하세요 : (현재" + name + "님 포함 총" + (player_count+1) + "명)");
		String name = scan.next();
		Deck2 d = new Deck2(name);
		System.out.println(name+"님이 추가되었습니다.");
	}
	

	void shuffle() {
		for (int i = 0; i < 20000; i++) {
			r_num = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[r_num];
			c[r_num] = temp;
		}
	}// shuffle 메소드

	void pick1() {
		if (card_count < 5) {
			int r_num = (int) (Math.random() * 52);
			while (c[r_num] == myCard[0] || c[r_num] == myCard[1] || c[r_num] == myCard[2] || c[r_num] == myCard[3]
					|| c[r_num] == myCard[4]) {
				r_num = (int) (Math.random() * 52);
			}
			myCard[card_count] = c[r_num];
			System.out.printf("%s %s 카드를 받았습니다. 총%d개\n", myCard[card_count].kind, myCard[card_count].number,
					card_count + 1);
			card_count++;
		} else {
			System.out.println("이미 5장의 카드를 받아 더 이상 카드를 뽑을 수 없습니다.");
			return;
		} // if
	}// pick1메소드

	void pick5() {
		if (card_count > 0) {
			System.out.println("이미 1장 이상의 카드가 있어서 5장을 한꺼번에 뽑을 수 없습니다. 1장씩 뽑아주세요/");
		} else {
			for (int i = 0; i < 5; i++) {
				myCard[i] = c[i];
				System.out.printf("%s, %s \n", myCard[i].kind, myCard[i].number);
			}
			System.out.println("의 카드를 받았습니다.");
		} // if
	}// pick5메소드

	void see_my_card() {
		System.out.println(this.name + "님의 카드 : ");
		for (int i = 0; i < myCard.length; i++) {
			System.out.printf("%s, %s \n", myCard[i].kind, myCard[i].number);
		}
	}

	
	void see_player() {
		System.out.println();
	}
}// class
