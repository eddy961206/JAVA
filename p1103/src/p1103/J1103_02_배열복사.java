package p1103;

import java.util.Arrays;

public class J1103_02_배열복사 {

	public static void main(String[] args) {
		int[] score = { 100, 67, 55, 89, 24, 10, 70 };
		int[] score2 = new int[10];
		
		// score -> score2로 복사
		for(int i =0; i<score.length; i++) {
			score2[i] = score[i];
		}
		
//		System.out.println(Arrays.toString(score2));
		
		// for문 출력
		for (int i = 0; i < score2.length; i++) {
			System.out.printf("%d, ",score2[i]);
		}

	}

}
