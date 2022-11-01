package p1101;

import java.util.Arrays;
import java.util.Scanner;

public class J1101_09 {

	public static void main(String[] args) {
		// 1~100까지 랜덤숫자 맞추기 게임
		// user 입력한 값도 출력을 하시오.
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int[] score = new int[10]; //입력받을 배열변수
		int r_num = (int)(Math.random()*100)+1; // 1~100 랜덤숫자
		
		//10번 반복
		int i = 0;
		System.out.println(r_num);
		while(i<10) {
			System.out.println("1~100사이의 숫자 입력하세요.>>");
			score[i] = scan.nextInt();
			if(score[i]==r_num) {
				System.out.println("정답입니다");
				i++;
				break; 
			} else if (score[i]<r_num) {
				System.out.println("입력한 숫자보다 더 큽니다");
			} else {
				System.out.println("입력한 숫자보다 작습니다.");
			}
			i++;
			
		}//while
		
		// 출력
		// 1. 랜덤숫자 : 3. 총 도전횟수:  2. 입력한 숫자 
		System.out.println(" [ 숫자 맞추기 요약 ] ");
		System.out.println("1. 랜덤숫자 : " + r_num);
		System.out.println("2. 총 도전횟수 : " + i);
		System.out.printf("3. 입력한 숫자 : ");
		for(i =0; i<score.length; i++) {
			System.out.printf("%d, ",score[i]);
		}
//		System.out.println(Arrays.toString(score));
		
	}//main

}//class
