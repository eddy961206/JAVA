package p1103;

import java.util.Arrays;

public class J1103_03 {

	public static void main(String[] args) {
		int[] score = new int[100];
		int[] score2 = new int[100];

		// 1~100까지 숫자를 score배열에 넣어
		for (int i = 0; i < 100; i++) {
			score[i] = i + 1;
		}

//		// score 배열 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.println(score[i]);
//		}

		// score들어가 있는 숫자를 역순으로 score2배열에 넣어

		for (int i = 0; i < score.length; i++) {
			score2[score.length - (i + 1)] = score[i];
		}
		
		// score2 배열 출력
		for(int i = 0; i<score2.length; i++) {
			System.out.println(score2[i]);
		}

	}

}
