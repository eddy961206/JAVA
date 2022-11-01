package p1101;

public class J1101_03 {

	public static void main(String[] args) {
		
		// 7,6 배열 1~42집어넣어
		int[][] score = new int[7][6];
		
		for(int i =0; i<7; i++) {
			for(int j =0; j<6; j++) {
				score[i][j]=6*i+j+1;
			}
		}
		for(int i =0; i<7; i++) {
			for(int j =0; j<6; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
//		// 5,5 배열 만들고 1~25숫자넣고 출력하시오
//		int[][] score = new int[5][5];
//		
//		for(int i=0; i<5; i++) {
//			for(int j =0; j<5; j++) {
//				score[i][j] = 5*i+j+1;
//			}
//		}
//
//		for(int i =0; i<5; i++) {
//			for(int j =0; j<5; j++) {
//				System.out.print(+score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
	}

}
