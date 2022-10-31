package p1031;

import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class J1031_05_배열2 {

	public static void main(String[] args) {

		// 점수 3개를 입력받아 score배열에 저장 후 출력하셔
		Scanner scan = new Scanner(System.in);

		// 국영수
		int[] score = new int[3];
		String name = "";
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		int total = 0;
		double avg = 0;
		
		
		//성적입력
		System.out.println(title[0] + "을 입력하세요>>");
		name = scan.nextLine();

		for (int i = 0; i < score.length; i++) {
			System.out.println(title[i + 1] + "점수를 입력하시오 : ");
			score[i] = scan.nextInt();
			total += score[i];
		}
		avg = total / 3.0;

		//성적출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-----------------------------------");
		System.out.printf("%s\t",name);
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", score[i]);
		}
		System.out.printf("%d\t%.2f\n", total, avg);

//		// score 50개 배열만들고 1,3,5,7,9 홀수 값 넣어
//		int[] score = new int[50];
//		for (int i = 0; i < score.length; i++) {
//			score[i] = (2 * i) + 1;
//			System.out.println(score[i]);
//		}

//		// 100개 score배열 만들고 0~99값을 입력
//		int[] score = new int[100];
//		for (int i = 0; i < 100; i++) {
//			score[i] = i;
//			System.out.println(score[i]);
//		}
//
//		// num 5개짜리 배열 생성 후 1,2,3,4,5 값 입력하고 출력
//		int[]num = {1,2,3,4,5};
//		for (int i = 0; i < num.length; i++) {
//			num[i] = i + 1;
//			System.out.println(num[i]);
//		}

//		// 50개의 int score 배열을 생성하시오
//		int[] score = new int[50];
//		// 0번, 1번 자리에 10, 20 넣으시오
//		score[0] = 10;
//
//		for (int i = 0; i < 50; i++) {
//			score[i] = i + 1;
//		}
//		
//		for (int i = 0; i < 50; i++) {
//			System.out.println(score[i]);
//		}

	}// main

}// class
