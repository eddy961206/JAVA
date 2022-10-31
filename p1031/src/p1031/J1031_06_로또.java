package p1031;

public class J1031_06_로또 {

	public static void main(String[] args) {

		// 45개 배열생성 후 숫자입력
		int[] lotto = new int[45];
		for (int i = 0; i < 45; i++) {
			lotto[i] = i + 1;
		}

		// 로또섞기
		int temp = 0;
		int r_num = 0;
		for (int i = 0; i < 2000; i++) {
			r_num = (int) (Math.random() * 45); // 배열 인덱스 0~44.
			temp = lotto[0];
			lotto[0] = lotto[r_num];
			lotto[r_num] = temp;
		}

//		// 로또 전체 출력
//		System.out.println("[로또 총 번호]");
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.printf("%d ", lotto[i]);
//		}
//		System.out.println();

		// 로또 6개 번호 추첨
		System.out.print("로또번호 6개 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto[i]);
		}
		System.out.println();

//		//자바 컴파일언어. 보안 좋.
//		//score : 주소값
//		int[] score = new int[5];
//		int [] num;
//		score[0]=1;
//		score[2]=2;
//		score[3]=3;
//		score[4]=4;
//		score[5]=5;
//		
//		//배열 이렇게 복사하면 안됨. 배열은 주소값이 복사됨. 주의.
//		num = score;

	}// main

}// class
