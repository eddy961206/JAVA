package p1110;

import java.util.Scanner;

public class StuCal {
	Scanner scan = new Scanner(System.in);
	Student[] s = new Student[10]; // 배열 선언. 나중에 객체 선언 따로 해야 //포함
	String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	String name, checkName;
	int kor, eng, math, total, rank;
	double avg;
	int choice, count, r_count, checkNo, flag;

	// 화면 출력
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

	// 성적 입력 메소드
	void score_input() {
		System.out.println("[[ 성적 입력 ]]");
		System.out.printf("%d번째 학생의 이름을 입력하세요 (0.이전페이지 이동) : ", count + 1);
		name = scan.next();
		if (name.equals("0")) {
			System.out.println("이전페이지로 이동합니다.");
			System.out.println();
			return; // 메소드 빠져나가기
		}
		System.out.println("국어점수를 입력하세요 : ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		math = scan.nextInt();
		// Student s배열에다가 Student객체 선언
		s[count] = new Student(name, kor, eng, math);
		
		System.out.printf("총 %d명 입력이 완료되었습니다.\n", count + 1);
		count++;
	}

	// 성적 출력 메소드
	void score_print() {
		// 상단 title
		System.out.println("                  [[ 성적 출력 ]]");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------------------");
		// 학생출력
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n", s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total,
					s[i].avg, s[i].rank);
		}
	}// 성적 출력 메소드

	// 성적 수정 메소드
	void score_modify() {
		System.out.println("[[ 성적 수정 ]]");
		System.out.println("수정할 학생의 이름을 입력하세요 >>");
		checkName = scan.next();
		for (int i = 0; i < count; i++) {
			if (checkName.equals(s[i].name)) {
				System.out.printf("%s 학생이 검색됐습니다\n\n", s[i].name);
				checkNo = i;
				flag = 1;
				break;
			} // if
		} // for

		if (flag == 0) {
			System.out.println("해당 학생이 조회되지 않습니다. 다시 확인하세요");
			return;
		} // if

		flag = 0;

		// 점수 수정화면 출력
		System.out.printf("[ %s 학생의 성적 수정 ]\n", s[checkNo].name);
		System.out.println("1. 국어점수 수정");
		System.out.println("2. 영어점수 수정");
		System.out.println("3. 수학점수 수정");
		System.out.println("0. 수정 취소");
		System.out.println("----------------------------");
		System.out.println("수정할 과목을 선택하세요.>>");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			// 국어 성적 수정
			System.out.printf("현재 국어점수 : %d\n", s[checkNo].kor);
			System.out.printf("수정할 국어점수 입력 : \n");
			s[checkNo].kor = scan.nextInt();
			break;
		case 2:
			// 성적 수정
			System.out.printf("현재 영어점수 : %d\n", s[checkNo].eng);
			System.out.printf("수정할 영어점수 입력 : \n");
			s[checkNo].eng = scan.nextInt();
			break;
		case 3:
			// 성적 수정
			System.out.printf("현재 수학점수 : %d\n", s[checkNo].math);
			System.out.printf("수정할 수학점수 입력 : \n");
			s[checkNo].math = scan.nextInt();
			break;
		case 0:
			System.out.println("성적 수정이 취소되었습니다.");
			System.out.println();
			return;
		}// switch

		s[checkNo].total = s[checkNo].kor + s[checkNo].eng + s[checkNo].math;
		s[checkNo].avg = s[checkNo].total / 3.0;
		
		System.out.println("점수 수정이 완료됐습니다.\n");
		
		
	}// 성적수정 메소드

	// 등수처리 메소드
	void score_rank() {
		for (int i = 0; i < count; i++) {
			r_count = 1; // 등수 초기화
			for (int j = 0; j < count; j++) {
				if (s[i].total < s[j].total) { // 비교해서.
					r_count++;
				} // if
			} // 작은for
			s[i].rank = r_count; // 등수를 등수배열에 입력
		} // 큰for (등수처리 끝)
	}// 등수처리 메소드
 
}
