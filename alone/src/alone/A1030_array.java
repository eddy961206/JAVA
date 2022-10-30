package alone;

import java.util.Arrays;

public class A1030_array {

	public static void main(String[] args) {
//		int[] ball = new int[45];
//		for (int i = 0; i < ball.length; i++) {
//			ball[i] = i + 1;
//		}
//		int j = 0;
//		int temp = 0;
//		for (int i = 0; i < 100; i++) {
//			j = (int) (Math.random() * 44) + 1;
//			temp = ball[0];
//			ball[0] = ball[j];
//			ball[j] = temp;
//		}
//		for(int i =0; i<6; i++) {
//			System.out.print(ball[i]+" ");
//		}

//		// 다차원배열
//		int[][] score = new int[5][3]; 
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				score[i][j] = i + j;
//			}
//		}
//		// 다차원배열 출력
//		for (int i = 0; i < score.length; i++) {
//			int[] inScore = score[i];
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print(inScore[j]);
//			}
//			System.out.println();
//		}
//		
//		// for없이 일반 배열 출력할 때. 다차원 배열은 toString()으로 하면
//		// 주소값만 나오므로 deepToString() 사용해야.
//		System.out.println(Arrays.toString(score));
//		System.out.println(Arrays.deepToString(score));
////		int[][] score = {
////							{1,2,3},
////							{1,2,3},
////							{1,2,3},
////							{1,2,3},
////							{1,2,3},
////						};

		int[] arr1 = {1,2,3,4,5};
		int[] newarr = new int[10];
		System.arraycopy(arr1, 0, newarr, 0, arr1.length);
//		System.out.println(arr)
		
		
		
		
		
		
	} // main

}// class
