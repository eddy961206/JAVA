package p1025;

import java.util.Scanner;

public class J1025_02 {

	public static void main(String[] args) {
		
		// 점수 score1, score2, score3 3개를 입력받아 합계 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >>");
		int score1 = scan.nextInt();
		System.out.println("점수를 입력하세요 >>");
		int score2 = scan.nextInt();	
		System.out.println("점수를 입력하세요 >>");
		int score3 = scan.nextInt();
		int sum = score1 + score2 + score3;
		double average = sum/3.0;   // int/double이므로 결괏값이 double되서 소수점 제대로 표현됨 
		System.out.print("점수 합계 : " + sum + "\t");     // "\t"는 탭, "\n"은 줄바꿈. 
		System.out.println("평균 : " + average);
//		System.out.printf("점수 합계 : %d\t",sum);
		System.out.printf("평균 : %.2f\n",average); // printf 사용하면 소수점 n자리까지 표현가능 
//		System.out.println(average); 			   // println은 소수점 15자리까지 다 나옴		
		
		
//		int a = 1000000;
//		int result1 = a * a / a;
//		int result2 = a / a * a;
//		
//		System.out.println(result1);  // 오버플로우 땨문에27
//		System.out.println(result2); // 10000000
//		
	}

}
