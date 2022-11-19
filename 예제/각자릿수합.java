package 예제;

import java.util.Scanner;

public class 각자릿수합 {

	public static void main(String[] args) {
		int input = 0;
		int result = 0;
		int ones_place, tens_place, hundreds_place = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("세자리 정수 입력하세요 : ");
		input = scan.nextInt();

		if (input < 100 || input > 999) {
			System.out.println("100~999사이의 세자리 정수만 입력하세요.");
		} else {
			ones_place = input % 10; // 10으로 나눈 나머지
			tens_place = input % 100 / 10; // 100으로 나눴을 때의 나머지를 10으로 나눈 몫
			hundreds_place = input / 100; // 100으로 나눴을 때의 몫

			result = ones_place + tens_place + hundreds_place;
			System.out.printf("%d => %d + %d + %d : %d", 
					input, hundreds_place, tens_place, ones_place, result);

		} // if
		
		
//		int num = 0;
//		   int sum = 0;
//		   System.out.println("세자리의 정수의 각 자리 숫자들의 합계 :");
//		   Scanner input = new Scanner(System.in);
//		   num = input.nextInt();
//		   // num = 254
//		   //1 - s:4,n:25
//		   //2 - s:9,n:2
//		   //3 - s:11, n:0 끝. s인 11이 정답
//		   while(num!= 0){
//		     sum = sum + (num%10);
//		     num = num/10;
//		   }
//		  System.out.println(sum);

	}

}
