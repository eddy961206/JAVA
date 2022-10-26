package p1026;

import java.util.Scanner;

public class J1026_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 국어,영어,수학점수 입력받아 평균을 이용해서 학점 출력하시오
		System.out.println("국어점수? : ");
		int kor = scan.nextInt();
		System.out.println("영어점수? : ");
		int eng = scan.nextInt();
		System.out.println("수학점수? : ");
		int math = scan.nextInt();
		int sum = kor + eng + math;
		double avg = sum/3.0;
		System.out.println(avg);
//		int score = (int)avg;   // avg를 바로 if (avg>=90)이렇게 써버리면 90.0, 80.0 ... 이렇게 바꿔야하니까 귀찮아서 이렇게

		if (avg>=90) {
			System.out.println("학점 : A");
		} else if (avg>=80) {
			System.out.println("학점 : B");
		} else if (avg>=70)	{
			System.out.println("학점 : C");
		} else if (avg>=60)	{
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
		
//		if (score>=90) {
//			System.out.println("학점 : A");
//		} else if (score>=80) {
//			System.out.println("학점 : B");
//		} else if (score>=70)	{
//			System.out.println("학점 : C");
//		} else if (score>=60)	{
//			System.out.println("학점 : D");
//		} else {
//			System.out.println("학점 : F");
//		}
		
		
		
//		int score = 70;
//		
//		if(score>=90) {
//			System.out.println("학점 : A");
//		} else if (score >= 80) {
//			System.out.println("학점 : B");
//		} else if(score >= 70)	{
//			System.out.println("학점 : C");
//		} else if(score >= 60) {
//			System.out.println("학점 : D");
//		} else {
//			System.out.println("학점 : F");
//		}
		
	}
}
