package p1026;

import java.util.Scanner;

public class J1026_07_중첩if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String grade = "";
		System.out.println("점수 입력하시오");
		int score = scan.nextInt();

		if (score >= 90) {
			grade = "A";
			if(score>=98) {
				grade += "+";
			} else if(score<=92) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if(score>=88) {
				grade += "+";
			} else if(score<=82) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if(score>=78) {
				grade += "+";
			} else if(score<=72) {
				grade += "-";
			}
		} else if (score > 60) {
			grade = "D";
			if(score>=68) {
				grade += "+";
			} else if(score<=62) {
				grade += "-";
			}
		} else {
			grade = "F";
		}

		System.out.printf("학점 : %s", grade);
	}

}
