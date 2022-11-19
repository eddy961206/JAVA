package p1110;

import java.util.Scanner;

public class J1110_02_카드_혼자연습 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		String name = "";
		Deck2[] deck2 = new Deck2[3]; // 최대 참가자 3명 배열 
		
		System.out.println("당신의 이름을 입력하세요 : ");
		name = scan.next();
		for (int i = 0; i < deck2.length; i++) {
			deck2[i] = new Deck2(name);
		}
		Deck2 d = new Deck2(name);
		
		
		// 무한반복 메뉴 보여주기
		while (true) {
			choice = d.show_menu();

			switch (choice) {
			case 0: // 참가자 추가
				d.player_add();
				break;
			case 1: // 카드 섞기
				d.shuffle();
				System.out.println("카드가 섞였습니다.");
				break;
			case 2: // 카드 1장 받기
				d.shuffle(); //안 섞었을 거 대비해서 자동으로 섞이게
				d.pick1();
				break;
			case 3: // 카드 5장 받기
				d.shuffle();
				d.pick5();
				break;
			case 4:
				d.see_my_card();
				break;

			}// switch
		} // while

	}// main

}// class
