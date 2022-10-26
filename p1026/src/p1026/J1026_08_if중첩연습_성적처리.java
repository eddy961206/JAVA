package p1026;

import java.util.Scanner;

public class J1026_08_if중첩연습_성적처리 {

	public static void main(String[] args) {
		// 이름,국,영,수 점수 입력받아 이름,국,영,수,합계,평균,학점 출력하시오
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
		double avg = sum/3.0;
		String grade = "";
		
		if(avg>=90) {
			grade = "A";
			if(avg>=98) {
				grade += "+";
			} else if (avg<=92) {
				grade += "-";
			}
		} else if(avg>=80) {
			grade = "B";
			if(avg>=88) {
				grade += "+";
			} else if (avg<=82) {
				grade += "-";
			}
		} else if(avg>=70) {
			grade = "C";
			if(avg>=78) {
				grade += "+";
			} else if (avg<=72) {
				grade += "-";
			}
		} else if(avg>=60) {
			grade = "D";
			if(avg>=68) {
				grade += "+";
			} else if (avg<=62) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t학점\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s",name,kor,eng,math,sum,avg,grade);
		}
	}


