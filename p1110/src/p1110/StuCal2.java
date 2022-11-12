package p1110;

import java.util.Scanner;

public class StuCal2 {
	Student2[] s = new Student2[10];
	Scanner scan = new Scanner(System.in);
	String check;
	String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	int choice, count, total, rank, checkNo, flag, r_count;
	double avg;

	// 메인메뉴 출력
	int screen_print() {
		System.out.println(" [ 성적처리 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 등수 처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------------------");
		System.out.println("원하는 번호를 입력하세요. >>");
		choice = scan.nextInt();
		return choice;
	}// 메인메뉴 출력 메서드

	// 성적입력 메소드
	void score_input() {
		// 객체 선언
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student2();
		}

		System.out.println("[[ 성적 입력 ]]");
		// 10명 학생 확인
		while (count < s.length) {
			// 이름 입력
			System.out.printf("%d번째 이름을 입력하세요 (0.이전 페이지로 이동)>> \n", (count + 1));
			check = scan.next();
			if (check.equals("0")) {
				System.out.println("이전 페이지로 이동합니다");
				System.out.println();
				return; // while 성적입력 빠져나감
			} // if

			s[count].name = check;

			// 점수 입력
			System.out.printf("국어 점수를 입력하세요 >> \n");
			s[count].kor = scan.nextInt();
			System.out.printf("영어 점수를 입력하세요 >> \n");
			s[count].eng = scan.nextInt();
			System.out.printf("수학 점수를 입력하세요 >> \n");
			s[count].math = scan.nextInt();

			// 합계,평균
			s[count].total = s[count].kor + s[count].eng + s[count].math;
			s[count].avg = s[count].total / 3.0;

			System.out.printf("%d명의 성적입력이 완료되었습니다.\n", count + 1);
			count++; // 인원수 1증가
		} // while count가 3미만인 동안 반복
	}// 성적입력 메소드

	// 성적 출력 메소드
	void score_print() {
		// 상단 title
		System.out.println("[[ 성적 출력 ]]");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("-----------------------------------------------------");
		// 학생출력
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n", s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total,
					s[i].avg, s[i].rank);
		}
	}// 성적 출력 메소드

	// 성적 수정 메소드
	void modify() {
		System.out.println("[[ 성적 수정 ]]");
		System.out.println("수정할 학생의 이름을 입력하세요 >>");
		check = scan.next();

		// 수정하려는 학생 검색
		for (int i = 0; i < count; i++) {
			if (check.equals(s[i].name)) {
				System.out.printf("%s 학생이 검색되었습니다", s[i].name);
				System.out.println();
				checkNo = i;
				flag = 1; // 검색되는 경우
				break;
			} // if
		} // for

		// 수정하려는 학생이 없어서 검색되지 않을 경우
		if (flag == 0) {
			System.out.println("해당 학생이 조회되지 않습니다. 다시 확인하세요");
			return;
		} // if

		flag = 0; // 학생이 검색되는 경우 다시 리셋

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
			// 합계,평균
		s[checkNo].total = s[checkNo].kor + s[checkNo].eng + s[checkNo].math;
		s[checkNo].avg = s[checkNo].total / 3.0;
	}// 성적 수정 메소드

	// 등수계산 메소드
	void rank() {
		// 등수처리 입력
		for (int i = 0; i < count; i++) {
			r_count = 1; // 등수 초기화
			for (int j = 0; j < count; j++) {
				if (s[i].total < s[j].total) { // 비교해서.
					r_count++;
				} // if
			} // 작은for
			s[i].rank = r_count; // 등수를 등수배열에 입력
		} // 큰for (등수처리 끝)

		System.out.println("등수 처리가 완료되었습니다.");
		System.out.println();
	}

}
