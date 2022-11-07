package p1107;

import java.util.Scanner;

public class J1107_03_객체배열 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Time[] t = new Time[3]; // (객체가 들어가는) 배열 선언 -- 주소 3개 생성

		for (int i = 0; i < t.length; i++) {
			t[i] = new Time(); // 객체 선언
			System.out.println("시간을 입력하세요. : ");
			t[i].hour = scan.nextInt();
			System.out.println("분을 입력하세요. : ");
			t[i].minute = scan.nextInt();
			System.out.println("초를 입력하세요. : ");
			t[i].second = scan.nextInt();
		}

		for (int i = 0; i < t.length; i++) {
			System.out.printf("%d:%d:%d\n", t[i].hour, t[i].minute, t[i].second);
		}

		//t[1],t[0],t[2]
		
	}

}
