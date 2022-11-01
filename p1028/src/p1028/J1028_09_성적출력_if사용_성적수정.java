package p1028;

import java.util.Scanner;

public class J1028_09_성적출력_if사용_성적수정 {

	public static void main(String[] args) {

		// 성적처리프로그램 다시 만들어봐
//		1. 변수선언
//		2. 반복문
//		3. 메인화면 출력
//		4. switch문 작성
//		5. 각각 번호대로 케이스 작성

		Scanner scan = new Scanner(System.in);

		int choice = 0, score = 0;
		int kor = 0, eng = 0, math = 0, total = 0;
		double avg = 0;
		String name = "";

		// 무한반복

		loop: while (true) {
			// 메인화면 출력
			System.out.println("       [성적처리 프로그램]      ");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요>>>");
			choice = scan.nextInt();
			scan.nextLine();

			// switch문 작성
			switch (choice) {
			case 1: //성적 입력
				System.out.println("[[성적 입력]]");
				System.out.println("");
				System.out.println("이름? : ");
				name = scan.nextLine();
				System.out.println("국어 점수? : ");
				kor = scan.nextInt();
				System.out.println("영어 점수? : ");
				eng = scan.nextInt();
				System.out.println("수학 점수? : ");
				math = scan.nextInt();
				total = kor + eng + math;
				avg = total / 3.0;
				break;
			case 2: //성적 출력
				System.out.println("[[성적 출력]]");
				System.out.println("------------------------------");
				System.out.printf("이름\t국어\t영어\t수학\t총합\t평균\n");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, math, total, avg);
				System.out.println("");
				break;
			case 3: //성적 수정
				System.out.println("[[성적 수정]]");
				System.out.println("----------------------");
				System.out.println("1.국어점수 수정");
				System.out.println("2.수학점수 수정");
				System.out.println("3.영어점수 수정");
				System.out.println("0.이전 화면으로 이동");
				System.out.println("원하는 번호를 입력하세요");
				choice = scan.nextInt();
				// 수정할 때의 if
				if (choice == 1) {
					System.out.println("현재 국어점수 : " + kor);
					System.out.println("변경할 점수 입력하세요 : ");
					kor = scan.nextInt();
					System.out.println("변경된 점수 : " + kor);
					System.out.println("나가기");
					total = kor + eng + math;
					avg = total/3.0;
				} else if (choice == 2) {
					System.out.println("현재 영어점수 : " + eng);
					System.out.println("변경할 점수 입력하세요 : ");
					eng = scan.nextInt();
					System.out.println("변경된 점수 : " + eng);
					System.out.println("나가기");
					total = kor + eng + math;
					avg = total/3.0;
				} else if (choice == 3) {
					System.out.println("현재 수학점수 : " + math);
					System.out.println("변경할 점수 입력하세요 : ");
					math = scan.nextInt();
					System.out.println("변경된 점수 : " + math);
					System.out.println("나가기");
					total = kor + eng + math;
					avg = total/3.0;
				} else {
					System.out.println("이전 페이지로 이동합니다");
					break;
				}
				break;
			case 4:

				break;
			case 5:

				break;
			case 0:
				System.out.println("[[프로그램 종료]]");
				System.out.println();
				break loop;
			}// switch
		} // while

	}// main

}// class
