package p1027;

import java.util.Iterator;
import java.util.Scanner;

public class J1027_05_가위바위보 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("[가위바위보 게임]");
		System.out.println("1.가위");
		System.out.println("2.바위");
		System.out.println("3.보");
		System.out.println("가위 바위 보 게임을 합니다. 원하는 번호를 입력하세요");
		int input = scan.nextInt();
		// 컴퓨터가 정한 가위바위보 숫자
		int r_num = (int) (Math.random() * 3) + 1;
		
//		String me = "";
//		if(input==1) {
//			me = "가위";
//		} else if(input ==2) {
//			me = "바위";
//		} else {
//			me = "보";
//		}
//		
//		String com = "";
//		if(r_num==1) {
//			com = "가위";
//		} else if(r_num ==2) {
//			com = "바위";
//		} else {
//			com = "보";
//		}
//		
//		switch(r_num - input) {
//		case -1: case 2:
//			System.out.println("이겼습니다.\n내가 낸 것은 " + me + ", \n상대가 낸 것은 "+ com + "입니다");
//			break;
//		case 0:
//			System.out.println("비겼습니다.\n내가 낸 것은 " + me + ", \n상대가 낸 것은 "+ com + "입니다");
//			break;
//		case -2: case 1:
//			System.out.println("졌습니다.\n내가 낸 것은 " + me + ", \n상대가 낸 것은 "+ com + "입니다");
//			break;
//		default :
//			System.out.println("1 2 3 중 하나를 입력하세요");  
			//이렇게 하면 4입력하고 r_num이 3됐을 때 -1 나와서 이긴걸로 뜸.
			//변수 식으로 하면 switch 안됨
//		}
			
		
		if(input == 1) {
			System.out.println("나 : 가위");
		} else if(input ==2) {
			System.out.println("나 : 바위");
		} else if(input ==3) {
			System.out.println("나 : 보");
		} else {
			System.out.println("1~3 사이 숫자 입력하세요");			
		}
		
		if(r_num == 1) {
			System.out.println("컴 : 가위");
		} else if(r_num ==2) {
			System.out.println("컴 : 바위");
		} else {
			System.out.println("컴 : 보");
		} 
		
		// 승 : -1, 2
		// 무 : 0
		// 패 : -2, 1
		// 컴 나  
		// 1->2 승 -1
		// 1->1 무 0
		// 1->3 패 -2

		// 2->3 승 -1
		// 2->2 무 0
		// 2->1 패 1

		// 3->1 승 2
		// 3->3 무 0
		// 3->2 패 1

//		// 랜덤 나오는 숫자와 같으면 당첨입니다. 다르면 다음기회에
//		System.out.println("숫자를 입력하세요(1-3)");
//		int a = scan.nextInt();
//		int b = (int)(Math.random()*3)+1;
//		if(1<=a && a<=3) {
//			if (a==b) {
//				System.out.println("당첨입니다. 상품증정!");
//			} else {
//				System.out.println("다음기회에 다시 도전하세요 (나온 숫자: "+ b + ")");
//			}
//		} else {
//			System.out.println("1과 3사이의 숫자를 입력해주세요");			
//		}

	}

}
