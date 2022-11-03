package p1103;



public class J1103_05_2차원배열_01만 {

	public static void main(String[] args) {
		int[] num = new int[100];
		int temp = 0;
		int r_num = 0;
		int [][] score = new int[10][10];
		// 0:50개, 1:50개를 입력해서 출력해.
		//그걸 랜덤으로 500번 섞어서 출력
		
		
		// 0x50,1x50 배열 넣기
		for (int i = 0; i < num.length; i++) {
			if (i < 50) {
				num[i] = 0;
			} else {
				num[i] = 1;
			}
		}

		//섞기
		for(int i = 0; i<500; i++) {
			r_num = (int)(Math.random()*100);
			temp = num[0];
			num[0] = num[r_num];
			num[r_num] = temp;
		}//for
		
		
//		//num배열 출력
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(i + 1 + "번째 : " + num[i]);
//		}
		
//		for(int i = 0; i<num.length; i++) {
//			System.out.printf("%d",num[i]);
//		}

		// num배열 수를 2차원 score배열에 넣으시오
		for(int i = 0; i<10; i++)	{
			for(int j = 0; j<10; j++) {
				score[i][j] = num[10*i+j];
			}
		}
		
		//10x10 score배열 출력
		System.out.println("X\t0|\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("----------------------------------------------------------------------------------");
		for(int i = 0; i<10; i++) {
			System.out.printf("%d|\t",i);
			for(int j =0; j<10; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
