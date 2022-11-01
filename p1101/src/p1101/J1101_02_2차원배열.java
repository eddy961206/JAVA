package p1101;

import java.util.Arrays;

public class J1101_02_2차원배열 {

	public static void main(String[] args) {

//		int[][] score = new int[5][3]; // 5행3열 배열 만들기
//		// 입력
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 3; j++) {
//				score[i][j] = (3*i)+j+1; 	// 1~15 넣기
//			}
//		}
//
//		// 출력
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		

		//2진법으로 변환
		char[] hex = {'B', 'A', 'F', 'E'};
		String[] binary = { "0000","0001","0010","0011" //3
							,"0100","0101","0110","0111" //7
							,"1000","1001","1010","1011" //11
							,"1100","1101","1110","1111" 
							};
		String [] result = new String[4];
		
		for (int i = 0; i < hex.length; i++) {
			if('0'<hex[i]&&hex[i]<'9') { //숫자char니?
				result[i] = binary[hex[i]-'0'];  //'2'-'0'=0
			}else { //char니?
				result[i] = binary[hex[i]-'A'+10]; //'C'-'A'=2
			}
		}
		for (int i = 0; i < hex.length; i++) {
			System.out.println(result[i]);
		}
		
		
		
	}//main

}//class
