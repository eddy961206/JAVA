package p1031;

import java.util.Scanner;

public class J1031_08 {

	public static void main(String[] args) {
		// 1. 1~45까지 갖고있는 45개짜리 배열 만들기
		// 2. 로또 배열 섞기
		// -temp,r_num 변수 선언
		// -반복문 500번 실행해서 섞기
		// -r_num : 0~44까지 랜덤으로 숫자 생성(index로 써야하니까)
		// -temp 사용해서 index0과 랜덤 index의 원소 교환(섞)
		// 3. 6개 번호입력
		// - 6개 배열 생성후 scan 입력받기(6번 반복문)
		// 4. 섞어놓은 로또 번호 중 6개만 출력 
		// 5. 내가 입력했던 숫자 6개 출력

		// 로또, 입력 배열 만들기
		int[] lotto = new int[45];
		int[] input = new int[6];
		int count = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 섞기
		int temp = 0;
		int r_num = 0;
		for (int i = 0; i < 500; i++) {
			r_num = (int) (Math.random() * 45); // 0~44. 인덱스로 들어가야하기 때문.
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}

		// 내 로또 번호 입력
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 로또번호 입력 하세요 : ");
			System.out.println();
			input[i] = scan.nextInt();
			
			if (0 >= input[i] || input[i] > 45) {
				System.out.println("1이상 45이하의 수를 입력하세요");
				System.out.println();
				i--;
			}
			
			for (int k = 0; k < 6; k++) {
				for (int j = k + 1; j < 6; j++) {
					if (input[k]==input[j]) {
						System.out.println("숫자 중복입니다. 다른 숫자 입력하세요");
					}
				}
			}
			

		}

		// 내 번호 출력
		System.out.println("내가 넣은 당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", input[i]);
		}
		System.out.println();
		System.out.println();

		// 로또 당첨번호 출력
		System.out.println("   [로또 게임]    ");
		System.out.println("로또 당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}

		// 맞는 개수 확인
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(lotto[i]==input[j]){
					count++;
					break;
				}
			}
		}
		
		// 맞는 개수 출력
		System.out.printf("\n  [ 당첨결과 ] \n");
		System.out.printf("맞은 개수 %d 개\n",count);
		
		switch(count) {
		case 0 : case 1: case 2:
			System.out.println("꽝 ㅋ");
			break;
		case 3: 
			System.out.println("5등");
			System.out.println("상금 : 5,000원");
			break;
		case 4: 
			System.out.println("4등");
			System.out.println("상금 : 50,000원");
			break;
		case 5: 
			System.out.println("3등");
			System.out.println("상금 : 1,524,241원");
			break;
		case 6: 
			System.out.println("1등");
			System.out.println("상금 : 1,585,019,672원");
			break;
			
		}
		
		
		
//		// 공통 번호 관련 출력
//		System.out.println();
//		System.out.println();
//		System.out.printf("맞은 번호 : ");
//		int[] same = new int[6];
//		for (int i = 0; i < input.length; i++) {
//			for (int j = 0; j < 6; j++) {
//				if (input[i] == lotto[j]) {
//					same[i] = lotto[j];
//				}
//			}
//			System.out.printf("%d ", same[i]);
//		}
//		System.out.println();
//		System.out.println();
//		System.out.println("당첨된 숫자 갯수 : " + same.length);

		
		
		
	}

}
