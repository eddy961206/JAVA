package p1028;

import java.util.Scanner;

public class J1028_04_for_업다운겜 {

	public static void main(String[] args) {
		//
		// 1-100 랜덤숫자
		Scanner scan = new Scanner(System.in);
		
		int input = '0';
		int r_num = '0';
		r_num = (int)(Math.random()*100)+1;
//		System.out.println("랜덤숫자 : "+r_num);
		for(int i=1; i<=10; i++) {
			System.out.println("1-100까지 숫자 맞추시오");
			System.out.println("남은 횟수 : "+ (11-i));
			input = scan.nextInt(); // 입력
			if(r_num==input) { //비교확인하는 if
				System.out.println("정답입니다 끝");
				break;
			} else if(r_num>input) {
				System.out.println("오답입니다. 그거보다 더 큽니다");
			} else { //r_num<input
				System.out.println("오답입니다. 그거보다 작습니다");
			}
		}//for
		System.out.println("정답 : "+r_num); // 열 번 안에 맞추든 못 맞추든 마지막에 정답 알려주기
		
		
		
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3; j++) {
//				for (int k = 1; k <= 3; k++) {
//					System.out.println("" + i + j + k);
//				}
//			}
//		}
	}//main

}//class
