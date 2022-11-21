package p1121_03_학생성적_ArrayList활용;

import java.util.ArrayList;
import java.util.Scanner;

public class StuCal_동명이인_추가 {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	ArrayList<Integer> sameNameList = new ArrayList<Integer>();
	String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	String stuNum, name, checkName;
	int kor, eng, math, total, rank;
	double avg;
	int choice, count, r_count, checkNo, flag;

	// 화면출력메소드
	int screen_print() {
		System.out.println("\n [ 성적 처리 프로그램 ] ");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 학생 검색");
		System.out.println("5. 등수 계산");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		return choice;
	}// screen_print

	// 성적입력메소드
	void score_input() {
		while (true) {
			System.out.println("\n[성적 입력]");
			System.out.println((list.size() + 1) + "번째 학생 이름을 입력하세요.(0. 이전페이지 이동)");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				break;
			}
			System.out.println("국어점수를 입력하세요 >>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요 >>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요 >>");
			math = scan.nextInt();

			// 입력받은 데이터들로 객체 만들기
			list.add(new Student(name, kor, eng, math)); // list.size()로 학생 수 알면됨
			System.out.println(name + "학생의 성적 입력이 완료됐습니다.");
		} // while

	}// score_input()

	// 성적출력메소드
	void score_print() {
		System.out.println("\n [[ 성적 출력 ]]");
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
					list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
					list.get(i).rank);
		} // for
		System.out.println();
	}// score_print()

	// 성적수정메소드(1)
	// 집가서 동명이인 있을 때도 한번 만들어봐
	void score_modify() {
		System.out.println("\n[[ 성적 수정 ]]");
		System.out.println("수정할 학생 이름을 입력하세요 : (0.뒤로가기)");
		name = scan.next();
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).name)) {
				sameNameList.add(i);
				checkNo = i;
				flag = 1;
			} // 입력받은 이름이 존재하는지 확인 if
		} // for 입력받은 이름이 존재하는지 확인 위한 for문
		if (sameNameList.size() > 1) { // 동명이인 존재하는 경우
			System.out.printf("%d명의 %s 학생이 검색됐습니다.\n",sameNameList.size(), name);
			for (int j = 0; j < sameNameList.size(); j++) {
				System.out.printf("%d. 학번 - %s, 이름 - %s\n", j + 1, list.get(sameNameList.get(j)).stuNum, name);
			}
			System.out.println("어느 학생을 선택하시겠습니까? >> ");
			int temp = scan.nextInt();
			checkNo = sameNameList.get(temp - 1);
			System.out.printf("학번이 %s인 %s학생을 선택하셨습니다.\n", list.get(checkNo).stuNum, name);
			sameNameList.clear();
		} else if (sameNameList.size() == 1) {
			System.out.println(name + "학생이 검색됐습니다.");
			sameNameList.clear();
		}

		// 학생이 검색되지 않는 경우
		if (flag == 0) {
			System.out.println("해당 학생이 검색되지 않습니다");
			return;
		}

		flag = 0; // 검색 리셋

		modify_print(checkNo); // 수정하는 건 메소드 또 따로 분리함

	} // score_modify()

	// 점수수정부분(2)
	void modify_print(int checkNo) {
		System.out.println("\n[[ 점수 수정 ]]");
		System.out.println("1. 국어점수 수정");
		System.out.println("2. 영어점수 수정");
		System.out.println("3. 수학점수 수정");
		System.out.println("---------------------------------");
		System.out.println("원하는 번호를 입력하세요 : >>");

		choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("현재 국어점수 : " + list.get(checkNo).kor);
			System.out.println("원하는 국어점수를 입력하세요 : ");
			int score = scan.nextInt();
			list.get(checkNo).kor = score; // 변수에 직접수정(안전하지 않음)
			System.out.printf("%s의 국어점수가 %d점으로 변경됐습니다.", list.get(checkNo).name, list.get(checkNo).kor);
			break;
		case 2:
			System.out.println("현재 영어점수 : " + list.get(checkNo).eng);
			System.out.println("원하는 영어점수를 입력하세요 : ");
			list.get(checkNo).eng = scan.nextInt();
			System.out.printf("%s의 영어점수가 %d점으로 변경됐습니다.", list.get(checkNo).name, list.get(checkNo).eng);
			break;
		case 3:
			System.out.println("현재 수학점수 : " + list.get(checkNo).math);
			System.out.println("원하는 수학점수를 입력하세요 : ");
			list.get(checkNo).math = scan.nextInt();
			System.out.printf("%s의 수학점수가 %d점으로 변경됐습니다.", list.get(checkNo).name, list.get(checkNo).math);
			break;
		} // switch

		list.get(checkNo).total = list.get(checkNo).kor + list.get(checkNo).eng + list.get(checkNo).math;
		list.get(checkNo).avg = list.get(checkNo).total / 3.0;

	}// modify_print()

	void rank() {
		for (int i = 0; i < list.size(); i++) {
			rank = 1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).total < list.get(j).total) {
					rank++;
				}
			}
			list.get(i).rank = rank;
		}
		System.out.println("등수계산이 완료됐습니다.");
	}

}
