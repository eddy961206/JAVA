package p1109;

import java.util.Scanner;

public class J1109_05_지정한숫자범위합계 {

	public static void main(String[] args) {
		int input1 = 0, input2 = 0;
		int result = 0;
		// 1. 숫자 2개 입력
		Scanner scan = new Scanner(System.in);

		System.out.println("1번째 숫자를 입력하세요 : ");
		input1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요 : ");
		input2 = scan.nextInt();

		SumCal sc = new SumCal();
		// input1, input2를 매개변수로 하는 메서드 호출
		result = sc.sum(input1, input2);
		System.out.printf("%d부터 %d까지 합계 : %d", input1,input2,result);

		
	}

}
