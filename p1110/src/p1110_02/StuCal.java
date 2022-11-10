package p1110_02;

import java.util.Scanner;

public class StuCal {
	Scanner scan = new Scanner(System.in);
	Student[] s = new Student[10];
	int choice;
	String check;
	int checkNum;
	int count;
	int flag;
	String name;
	int kor, eng, math, total, rank;
	double avg;

	int screen_print() {
		System.out.println("\n [ 성적처리 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 등수 처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------------------");
		System.out.println("원하는 번호를 입력하세요. >>");
		choice = scan.nextInt();
		return choice;
	}

	void score_input() {
		System.out.println("[[ 성적 입력 ]]");
		System.out.printf("%d번째 학생의 이름을 입력하세요 : (0. 뒤로가기)", count + 1);
		name = scan.next();
		if (name.equals("0")) {
			System.out.println("이전페이지로 이동합니다.");
			return;
		}
		System.out.println("국어 점수를 입력하세요 : ");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math = scan.nextInt();
		s[count] = new Student(name, kor, eng, math);
		System.out.printf("총 %d명 입력이 완료됐습니다\n", count + 1);
		count++;
	}

	void score_print() {
		System.out.println("                  [[ 성적 출력 ]]");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total,
					s[i].avg, s[i].rank);

		}
	}

	void score_modify() {
		System.out.println(" [[ 성적 수정 ]]");
		System.out.println("수정을 원하는 학생의 이름을 입력하세요 : ");
		check = scan.next();
		for (int i = 0; i < count; i++) {
			if (check.equals(s[i].name)) {
				System.out.printf("%d 학생을 찾았습니다.\n", s[i].name);
				checkNum = i;
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.printf("%d 학생이 조회되지 않습니다. 다시 입력하세요.\n\n", check);
		}

		flag = 0;

	}// 수정 메소드

}
