package p1028;

import java.util.Scanner;

public class J1028_10 {

	public static void main(String[] args) {
		//입력한 구구단부터 9단까지 출력하시오 5->56789단
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력하시오");
		int input = scan.nextInt();
		int j = '0';
	
		for(int i=2;i<10;i++) {
			if(i>=input) {
				for(j<10) {
					System.out.printf("%d * %d = %d	\n",i,j,i*j);
				}
			}
			
		}
	}

}
