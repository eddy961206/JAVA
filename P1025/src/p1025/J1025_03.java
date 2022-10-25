package p1025;

import java.util.Scanner;

public class J1025_03 {

	public static void main(String[] args) {
		// 입력:이름-name, 국어점수-kor, 영어점수-eng, 수학점수-math, 
		// name, kor, eng, math, total, avg까지 출력해
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름? : ");
		String name = scan.next();
		System.out.println("국어점수? : ");
		int kor = scan.nextInt();
		System.out.println("영어점수? : ");
		int eng = scan.nextInt();
		System.out.println("수학점수? : ");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
	
		System.out.printf("이름 : %s\t", name);
		System.out.printf("점수 합계 : %d\t",total);
		System.out.printf("평균 : %.2f\n",avg);
		
		
		
		
	}

}
