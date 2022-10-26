package p1026;

import java.util.Scanner;

public class J1026_04_if_성적처리예시 {

	public static void main(String[] args) {

		// 이름,국,영,수, 입력받고 합계,평균,학점 한 줄로 출력하시오
		Scanner scan = new Scanner(System.in); 
		System.out.println("이름? : ");
		String name = scan.next();
		System.out.println("국어 점수? : ");
		int kor = scan.nextInt();
		System.out.println("영어 점수? : ");
		int eng = scan.nextInt();
		System.out.println("수학 점수? : ");
		int math = scan.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;
		String grade = "";
		int score = (int) avg;
		if (score >= 90) {
			grade = "참 잘했어요";
		} else if (score >= 80) {
			grade = "잘했어요";
		} else if (score >= 70) {
			grade = "적당해요";
		} else if (score >= 60) {
			grade = "나쁘지 않아요";
		} else {
			grade = "앵간";
		}
		System.out.println("              [성적처리 프로그램]               ");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t학점");
		System.out.println("---------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s", name, kor, eng, math, sum, avg, grade);
		System.out.printf("fjo");
		
	}

}
