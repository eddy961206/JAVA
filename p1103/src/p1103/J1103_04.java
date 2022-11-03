package p1103;

public class J1103_04 {

	public static void main(String[] args) {
		int[] score = { 100, 88, 91, 95, 90, 85, 77, 93, 80, 65 };
		// score 배열의 모든 수의 합, 평균 구해
		int total = 0;
		double avg = 0;

		// 배열 합계
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		
		// 평균
		avg = (double) total / score.length;

		System.out.println("총 합 : " + total);
		System.out.printf("평균 : %.2f\n", avg);

	}

}
