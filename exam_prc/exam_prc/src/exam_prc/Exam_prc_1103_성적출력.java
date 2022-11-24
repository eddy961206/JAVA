package exam_prc;

import java.util.Scanner;

public class Exam_prc_1103_성적출력 {

	public static void main(String[] args) {
		// 성적 출력
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String check = "";
		int checkNum = 0;
		int choice = 0;
		int flag = 0;
		int rankNo = 0;
		String[] name = new String[10];
		String[] title = { "이름", "국어", "영어", "수학", "총합", "평균", "등수" };
		int[][] score = new int[10][3];
		int[] rank = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];

		// 무한반복
		loop: while (true) {
			System.out.println("  [[ 성적 처리 프로그램 ]]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("-------------------------------");
			System.out.println("0. 시스템 종료");
			System.out.println("원하는 번호를 입력하세요 >>");
			choice = scan.nextInt();

			// 메뉴 선택 switch
			switch (choice) {
			case 1: // 성적 입력
				System.out.println("  [[ 성적 입력 ]]");
				for (int i = 0; i < 10; i++) { // 최대 10번 까지만 반복해서 입력받기
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요. (0. 이전페이지 이동) >>");
					check = scan.next();

					if (check.equals("0")) {
						System.out.println("이전 페이지로 이동합니다.");
						break;
					} else {
						name[count] = check;

						for (int j = 0; j < 3; j++) { // i로만 하면 안됨.
							System.out.printf("%s성적 입력 : ", title[j + 1]);
							score[count][j] = scan.nextInt();
						}

						// 합계,평균 구하기
						for (int j = 0; j < 3; j++) {
							total[count] += score[count][j];
						}
						avg[count] = total[count] / 3.0;

						System.out.printf("%s 학생의 성적입력이 완료되었습니다.\n", name[count]);
					} // for


					count++;
					
					// 등수처리
					for (int k = 0; k < count; k++) {
						rankNo = 1;
						for (int j = 0; j < count; j++) {
							if (total[k] < total[j]) {
								rankNo++;
							}
						}
						rank[k] = rankNo;
					}
					System.out.println("등수 처리도 완료됐습니다.");
				} // for

				break;
			case 2: // 성적 출력
				System.out.println("  [[ 성적 출력 ]]");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
				System.out.println("----------------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i], rank[i]);
				}
				break;

			case 3: // 성적 수정
				System.out.println("  [[ 성적 수정 ]]");
				System.out.println("수정을 원하는 학생의 이름을 입력하세요 : ");
				check = scan.next();

				// 저장돼있는 학생수만큼 반복. 방금 입력받은 이름과 일치하는지 알기위한 반복.
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) { // 조회 되면 flag를 1로.
						checkNum = i; // 해당 이름의 index를 checkNum에 저장.
						flag = 1;
					}
				}

				if (flag == 0) {
					System.out.println("해당 이름의 학생이 조회되지 않습니다. 다시 시도하세요.");
					break;
				}

				// flag 0으로 리셋
				flag = 0;

				System.out.printf("[[ %s 학생 성적 수정 ]]\n", name[checkNum]);
				for (int i = 0; i < 3; i++) {
					System.out.printf("%d. %s성적 수정\n", i + 1, title[i + 1]);
				}
				System.out.println("0. 이전 페이지로 이동");
				System.out.println("-----------------------------------");
				System.out.println("원하는 번호를 입력하세요>>");
				choice = scan.nextInt();

				if (choice == 0) {
					System.out.println("이전 페이지로 이동합니다..\n");
					break;
				} else {
					System.out.printf("현재 %s 학생의 %s 점수 : %d\n", name[checkNum], title[choice],
							score[checkNum][choice - 1]);
					System.out.printf("원하는 %s 점수를 입력하세요 : \n", title[choice]);
					score[checkNum][choice - 1] = scan.nextInt();
					System.out.printf("%s 학생의 %s 점수가 %d점으로 변경 완료됐습니다.\n", name[checkNum], title[choice],
							score[checkNum][choice - 1]);

					// 합계,평균 다시 구하기
					total[checkNum] = 0;
					for (int j = 0; j < 3; j++) {
						total[checkNum] += score[checkNum][j];
					}
					avg[checkNum] = total[checkNum] / 3.0;

				}
				
				// 등수처리
				for (int k = 0; k < count; k++) {
					rankNo = 1;
					for (int j = 0; j < count; j++) {
						if (total[k] < total[j]) {
							rankNo++;
						}
					}
					rank[k] = rankNo;
				}
				System.out.println("등수 처리도 완료됐습니다.");
				break;
				
			case 0:
				System.out.println("시스템을 종료합니다.");
				break loop;

			}// switch

		} // while

	}// main

}
// class
