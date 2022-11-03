package p1102;

import java.util.Scanner;

public class J1102_04_성적연습2_혼자집가기전 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int count = 0;
		int checkNo = 0;
		int flag = 0;
		String check = "";
		String[] name = new String[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];

		// 무한반복
		loop: while (true) {
			System.out.println(" [[ 성적처리 프로그램 ]]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();

			switch (choice) {
			case 1: // 1.성적 입력
				System.out.println("[[ 성적 입력 ]]");
				while (count < name.length) { // 최대 10번 반복입력
					System.out.printf("%d 번째 학생 이름을 입력하세요. (0. 이전 페이지로 이동)>>", count + 1);
					check = scan.next();
					if (check.equals("0")) {
						System.out.println("성적 입력을 취소합니다. 이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}
					name[count] = check;

					// 점수 입력
					for (int i = 0; i < 3; i++) {
						System.out.printf("%s 점수를 입력하세요 >>", title[i + 1]);
						score[count][i] = scan.nextInt();
					} // for

					// 합,평균 구하기
					for (int i = 0; i < 3; i++) {
						total[count] += score[count][i];
					}
					avg[count] = total[count] / 3.0;

					count++;

				} // 성적입력while 끝
				break;

			case 2: // 2.성적 출력
				System.out.println("[[ 성적 출력 ]]");
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("----------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i]);
				}
				break;

			case 3: // 3.성적 수정
				System.out.println("[[ 성적 수정 ]]");
				System.out.println("수정할 학생 이름을 입력하세요 >> ");
				check = scan.next();

				// 학생이 검색되는 경우
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) {
						System.out.println(name[i] + "학생이 검색되었습니다.");
						checkNo = i;
						flag = 1;
					} // if
				} // for

				// 학생이 검색 안되는 경우
				if (flag == 0) {
					System.out.println("해당 학생이 조회되지 않습니다. 다시 시도하세요");
					break;
				}

				flag = 0; // 학생 검색되고 다시 flag리셋

				System.out.println("1. 국어 점수 수정");
				System.out.println("2. 영어 점수 수정");
				System.out.println("3. 수학 점수 수정");
				System.out.println("0. 뒤로 돌아가기");
				System.out.println("------------------------");
				System.out.println("원하는 번호를 입력하세요.>>>\n");

				choice = scan.nextInt();

				System.out.printf("현재 %s 점수 : %d \n", title[choice], score[checkNo][choice - 1]);
				System.out.printf("수정할 %s 점수 : ", title[choice]);
				score[checkNo][choice - 1] = scan.nextInt();
				System.out.printf("%s의 점수가 %d점으로 변경되었습니다.", name[checkNo], score[checkNo][choice - 1]);
				total[checkNo] = score[checkNo][0] + score[checkNo][1] + score[checkNo][2];
				avg[checkNo] = total[checkNo] / 3.0;

				break;

			case 0: // 0.프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break loop;

			}// 메인매뉴 선택 switch

		} // 무한반복 while

	}// main

}// class
