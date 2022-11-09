package p1109;

import java.util.Scanner;

public class Method1 {
	
	Scanner scan = new Scanner(System.in);
	// 메소드 정의 - 숫자1개 입력받는 메소드
	int input() {
		System.out.println("숫자 입력하세요 : ");
		int input = scan.nextInt();
		return input;
	}
	
	
	
	
	
//	int[] num = new int[6];
//
//	// 6개 랜덤숫자를 뽑고 그 합을 리턴
//	int sum() {
//		int r_num = 0;
//		int total = 0;
//		for (int i = 0; i < num.length; i++) {
//			r_num = (int) (Math.random() * 45) + 1;
//			num[i] = r_num;
//			total += num[i];
//		}
//		return total;
//	}
//
//}

//	//1~45랜덤이 되는 메소드
//	int random() {
//		int num = (int)(Math.random()*45)+1;
//		return num;
//	}
}