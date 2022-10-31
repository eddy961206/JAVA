package p1031;

public class J1031_04_배열 {

	public static void main(String[] args) {
		// 배열. 같은 타입만. 메모리에 할당될 때 변수는 위치를 랜덤으로 저장하는데 반해
		// 배열로 한꺼번에 변수들 저장하면 위치도 연속적으로.
		
		int num = 0;

		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		num = score[2];

		int[] score2 = { 10, 20, 30, 40, 50 };
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score);
		System.out.println(num);
		

		int a = 0;
		int[] aa = new int[10];

		int[] k = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 추천
		int[] s = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 비추천.
	}

}
