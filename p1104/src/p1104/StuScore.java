package p1104;

import java.util.Scanner;

public class StuScore {

	public static void main(String[] args) {
		// 성적 처리 프로그램

		// 변수 선언
		Scanner scan = new Scanner(System.in);
		String check = "";
		int choice = 0;
		int count = 0;
		int flag = 0;
		int rankNum = 0;
		int checkNum = 0;
		String[] name = new String[10];
		String[] title = { "이름", "국어", "영어", "수학", "총합", "평균", "등수" };
		int[] rank = new int[10];
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];

		// 무한반복while
		loop: while (true) {

			// 메인메뉴 출력
			System.out.println(" [[성적 처리 프로그램]] ");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 계산");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>>");
			choice = scan.nextInt();

			// 메인메뉴 선택
			switch (choice) {
			case 1: // 1. 성적 입력

				System.out.println("[[ 성적 입력 ]]");
				// 최대 10번 학생정보 입력 while
				while (count < 10) {
					System.out.println((count + 1) + "번째 학생 이름을 입력하세요. (0.이전 화면으로 돌아가기)>> ");
					check = scan.next();

					// 0을 눌렀다면 뒤로 돌아가기
					if (check.equals("0")) {
						System.out.println("이전 화면으로 돌아갑니다..");
						break;
					}

					// 0을 안눌렀으면 그대로 정보 입력 진행
					name[count] = check;

					for (int i = 0; i < 3; i++) { // 3개 과목이니까 3번 반복 점수 입력
						System.out.printf("%s학생의 %s 점수를 입력하세요.>>", name[count], title[i + 1]);
						score[count][i] = scan.nextInt();
					}

					// 합계, 평균 계산
					for (int j = 0; j < 3; j++) {
						total[count] += score[count][j];
					}
					avg[count] = total[count] / 3.0;

					count++; // 학생 수 1추가
				} // while

				break;

			case 2: // 2. 성적 출력
				System.out.println("   [[ 성적 출력 ]]");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("----------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i], rank[i]);
				}
				System.out.println();
				break;
			case 3: // 3. 성적 수정
				System.out.println("수정을 원하는 학생의 이름을 입력하세요.>>");
				check = scan.next();

				// 원하는 학생이름 조회
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) { // 학생 조회
						checkNum = i; // 해당 학생의 인덱스 저장
						flag = 1;
					} 
				}
				
				if(flag ==0) {
					System.out.println("해당 학생이 조회되지 않습니다. 다시 시도하세요.");
					break;
				}
				
				flag = 0;

				// 학생 조회 됐을 때
				System.out.printf("%s 학생 조회 완료.\n\n", name[checkNum]);
				System.out.printf("[[ %s 학생 성적 수정 ]]\n\n", name[checkNum]);

				for (int j = 0; j < 3; j++) { // 과목 3개니까 3번 반복
					System.out.printf("%d. %s성적 수정\n", (j + 1), title[j + 1]);
				}
				System.out.println("0. 이전 페이지로 돌아가기");
				System.out.println("----------------------------");
				System.out.println("원하는 번호를 입력하세요.>>>");
				choice = scan.nextInt();

				if (choice == 0) {
					System.out.println("이전 페이지로 돌아갑니다.");
					break;
				}

				// 점수 수정
				System.out.printf("[[%s 점수 수정]]\n", title[choice]);
				System.out.printf("현재 %s 학생의 %s 점수 : %d\n", name[checkNum], title[choice], score[checkNum][choice - 1]);
				System.out.println("수정할 점수를 입력하세요 : ");
				score[checkNum][choice - 1] = scan.nextInt();
				System.out.printf("%s 학생의 %s 점수가 %d점으로 변경되었습니다.\n\n", name[checkNum], title[choice],
						score[checkNum][choice - 1]);

				// 합계,평균 수정
				total[checkNum] = 0;
				for (int j = 0; j < 3; j++) {
					total[checkNum] += score[checkNum][j];
				}
				avg[checkNum] = total[checkNum] / 3.0;

				break;
			case 4: // 4. 등수 계산
				for (int i = 0; i < count; i++) {
					rankNum = 1;
					for (int j = 0; j < count; j++) {
						if (total[i] < total[j]) {
							rankNum++;
						}
					}
					rank[i] = rankNum;
				}
				System.out.println("등수 계산이 완료되었습니다.");
				System.out.println();
				break;
			case 0: //
				System.out.println("프로그램을 종료합니다..");
				break loop;
			}// 메인메뉴 선택 switch

		} // while

	}// main

}// class
