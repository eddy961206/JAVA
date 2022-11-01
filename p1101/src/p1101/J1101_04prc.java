package p1101;

public class J1101_04prc {

	public static void main(String[] args) {
		// 5,5배열 - 랜덤숫자 넣고 출력
				int[][] score = new int[5][5];
				int []	arr = new int[25];
				int temp =0, r_num =0;
				
				// 1~25 순서대로 들어간 배열 생성
				for(int i = 0; i<25; i++) {
					arr[i] = i+1;
				}
				
				// 1~25 들어간 배열 랜덤으로 섞기
				for(int i =0; i<100; i++) {
					r_num = (int)(Math.random()*25);
					temp = arr[0];
					arr[0] = arr[r_num];
					arr[r_num] = temp;
				}
				
//				// 섞은 25개 배열 출력
//				for(int i =0; i<25; i++) {
//					System.out.printf("%d ",arr[i]);
//				}
				
//				// 5X5배열 1~25 순서대로 집어넣기
//				for(int i =0; i<5; i++) {
//					for(int j =0; j<5; j++) {
//						score[i][j] = 5*i+j+1;
//					}
//				}
				
				//5X5 배열 섞기 (섞어 놓은 25개짜리 배열을 순서대로 집어넣)
				for(int i = 0; i<5; i++) {
					for(int j =0; j<5; j++) {
						score[i][j] = arr[5*i+j];
					}
				}//5X5 배열 섞기
				
				
				//5X5 배열 출력
				for(int i = 0; i<5; i++) {
					for(int j=0; j<5; j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.println();
				}//5X5 배열 출력
}

}
