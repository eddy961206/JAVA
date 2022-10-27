package p1027;

import java.util.Scanner;

public class J1027_08 {

	public static void main(String[] args) {
		//랜덤 숫자 맞추기 게임
		//1~10까지 숫자
		//10번 할 수 있게 프로그램 구성. 정답입니다 오답입니다 랜덤숫자:3
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int rd = 0;
		for(i=0; i<=10; i++) {
			System.out.println("숫자 입력하세요");
			int input = scan.nextInt();
			rd = (int)(Math.random()*10)+1;
			if (1<= input && input <= 10) {
				if(input == rd) {
					System.out.println("정답입니다");
				} else {
					System.out.println("오답입니다. 랜덤숫자 : "+ rd );
				}
			} else {
				System.out.println("1~10사이 숫자 넣으세요");
			}
			
		}
		
	}

}
