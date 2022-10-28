package p1028;

public class J1028_02_이중for_구구단 {
	// 원하는 줄 수에 더블클릭해서 break point만들고
	// 디버그 눌러서 f6누르면 하나씩 실행
	public static void main(String[] args) {
//		for문 continue -> i 스킵
//		break는 for문 완전히 빠져나옴


		// 구구단 홀수단만 출력
		for (int i = 2; i <= 9; i++) {  //또는 그냥 증감식 i+=2으로도.
			if (i % 2 == 0) {
				continue; // i가 짝수면 스킵하겠다
			}
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		} // 구구단for

//		//구구단
//		for(int i = 2; i<=9; i++) {
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d * %d = %d \t", i, j, i*j);
//			}
//			System.out.println();
//		}//구구단for

	}// main

}// class
