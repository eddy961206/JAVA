package p1025;

import java.util.Scanner;

public class J1025_05 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학을 입력받아 각 과목점수와 합계,평균 출력해
		
		Scanner scan = new Scanner(System.in);
		
		//사람1 데이터 입력
		System.out.println("이름? : ");
		String name1 = scan.next();
		System.out.println("국어? : ");
		int kor1 = scan.nextInt();
		System.out.println("영어? : ");
		int eng1 = scan.nextInt();
		System.out.println("수학? : ");
		int math1 = scan.nextInt();
		
		//사람2 데이터 입력
		System.out.println("이름? : ");
		String name2 = scan.next();
		System.out.println("국어? : ");
		int kor2 = scan.nextInt();
		System.out.println("영어? : ");
		int eng2 = scan.nextInt();
		System.out.println("수학? : ");
		int math2 = scan.nextInt();
				
		int sum1 = kor1 + eng1 + math1;
		int sum2 = kor2 + eng2 + math2;
		double avg1 = sum1/3.0;
		double avg2 = sum2/3.0;
		
		System.out.println("   [학생성적처리 프로그램]    ");
		System.out.printf("이름\t 국어\t 영어\t 수학\t 합계\t 평균\n");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.1f\n", name1, kor1, eng1, math1, sum1, avg1);
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.1f\n", name2, kor2, eng2, math2, sum2, avg2);
		
	}
}
