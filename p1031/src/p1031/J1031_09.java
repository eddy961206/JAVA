package p1031;

import java.util.Scanner;

public class J1031_09 {

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
		
		Scanner scan = new Scanner(System.in);
		int [] lotto = new int[45];
		int [] input = new int[6];
		int temp = 0;
		int r_num = 0;
		int count = 0;
		
		for (int i = 0; i < 45; i++) {
			lotto[i] = i+1;
		}
		
		// 로또 1~45 랜덤 배열 섞기
		for(int i = 0; i<500; i++) {
			r_num = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}
		int bonus = lotto[6];
		System.out.println(lotto[6]);
		
		// 내 로또 번호 생성
		for(int i = 0; i<6; i++) {
			System.out.println((i+1)+"번째 번호 입력하세요");
			input[i]= scan.nextInt();
		}

		
		// 내 로또 번호 출력
		System.out.printf("내 번호 : ");
		for(int i = 0; i<6; i++) {
			System.out.printf("%d ", input[i]);
		}
		System.out.printf("\n");
		
		
		// 로또 6개 출력
		System.out.printf("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ",lotto[i]);
		}
		
		
		// 당첨 갯수
		for(int i = 0; i<6; i++) {
			
			for(int j = 0; j<6; j++) {
				if(lotto[i]==input[j]) {
					count++;
				}
			}
			
		}
		System.out.printf("\n 일반 번호 맞은 갯수 : %d \n",count);
		
		
		for (int i = 0; i < 6; i++) {
			if(input[i] == bonus) {
				count++;
			}
		}
		System.out.printf("\n 보너스 포함 맞은 갯수 : %d \n",count);
		
		
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
		case 7: 
			System.out.println("1등");
			System.out.println("상금 : 1,585,019,672원");
			break;	
		} //이거 아님
		
		
		
		
	} //main

}//class
