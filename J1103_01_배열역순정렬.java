package p1103;

import java.util.Arrays;
import java.util.Comparator;

public class J1103_01_배열역순정렬 {

	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 }; // 기본형
		int[] n_score = new int[score.length];
		Integer[] score2 = { 79, 88, 91, 33, 100, 55, 95 }; // 객체
		int max = score[0];
		int min = score[0];
		System.out.println(Arrays.toString(score));
		System.out.println("정렬 전");
		System.out.println("-----------------------");
		System.out.println("정렬 후");

		// 순차정렬 Arrays.sort!!
		Arrays.sort(score); // 순차정렬. 1,2,3...
		System.out.println("순차정렬 : " + Arrays.toString(score));

		// 역순정렬
		for (int i = 0; i < score.length; i++) {
			n_score[score.length - (i + 1)] = score[i];
		}

		
		
		
		System.out.println("역순정렬 : " + Arrays.toString(n_score));

//		//객체 활용 역순 정렬		
//		Arrays.sort(score2,new Comparator<Integer>() {
//
//			@Override 
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2-o1; //양수가 되면 자리바꿈
//			}
//		});
//		
//		System.out.println(Arrays.toString(score2)); //객체,메소드사용 역순정렬.

		
		
//		//최댓값 최솟값 구하는 식
//		for (int i = 0; i < score.length; i++) {
//			if (max < score[i]) { //최댓값 구하기
//				max = score[i]; // max랑 요소랑 비교해서 max보다 요소가 더 크면 그 요소값을 max에 넣어놓기.
//			} 
//			
//			if (min > score[i]) { //최솟값 구하기
//				min = score[i]; // min랑 요소랑 비교해서 min보다 요소가 더 작으면 그 요소값을 min에 넣어놓기.
//			}
//		} // for
//		System.out.println("최댓값: " + max);
//		System.out.println("최솟값: " + min);

	}// main

}// class
