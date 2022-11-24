package exam_prc;

import java.util.Scanner;

public class Exam_prc_1108_성적출력재연습 {

	public static void main(String[] args) {
		// 성적출력
		// 변수선언
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		int choice = 0;
		int checkNum = 0;
		String check = "";
		int count = 0;
		int rankNum = 0;
		int[] rank = new int[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		String[] name = new String[10];
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];

		// 무한반복
		loop: while (true) {

			System.out.println("[[ 성적 출력 프로그램 ]]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 계산");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			choice = scan.nextInt();

			switch (choice) {
			case 1: // 1. 성적 입력
				System.out.println("[[ 성적 입력 ]]");
				// 최대 10명 입력
				for (int i = 0; i < name.length; i++) {
					System.out.printf("%d번째 학생 이름을 입력하세요 : (0.뒤로가기)\n", count + 1);
					check = scan.next();

					// 0 누른경우 뒤로 이동
					if (check.equals("0")) {
						System.out.println("이전 페이지로 이동합니다.\n");
						break;
					}
					// 0 안누르고 이름 입력한 경우
					name[count] = check;
					for (int j = 0; j < 3; j++) { // 국영수
						System.out.printf("%s점수를 입력하세요 : \n", title[j + 1]);
						score[count][j] = scan.nextInt();
					}

					// 합계, 평균 구하기
					for (int j = 0; j < 3; j++) {
						total[count] += score[count][j];
					}
					avg[count] = total[count] / 3.0;
					System.out.printf("%s 학생 성적 입력이 완료됐습니다.\n\n", name[count]);
					count++;
				} // 정보입력 for반복문
				break;
			case 2:// 2. 성적 출력
				System.out.println("[[ 성적 출력 ]]");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("-------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i], rank[i]);
				}

				break;
			case 3:// 3. 성적 수정
				System.out.println("[[ 성적 수정 ]]");
				System.out.println("수정을 원하는 학생의 이름을 입력하세요 : ");
				check = scan.next();
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) {
						checkNum = i;
						flag = 1;
					}
				}

				if (flag == 0) {
					System.out.printf("%s 학생을 조회할 수 없습니다. 다시 시도하세요.\n\n",check);
					break;
				}

				flag = 0;

				System.out.printf("[[ %s 성적 수정 ]]\n", name[checkNum]);
				System.out.println("1. 국어 성적 수정");
				System.out.println("2. 영어 성적 수정");
				System.out.println("3. 수학 성적 수정");
				System.out.println("0. 뒤로 돌아가기");
				System.out.println("------------------------");
				System.out.println("원하는 번호를 입력하세요 : ");
				choice = scan.nextInt();

				if (choice == 0) {
					System.out.println("이전 페이지로 이동합니다.");
					break;
				}
				System.out.printf("현재 %s학생의 %s성적 : %d점\n", name[checkNum], title[choice], score[checkNum][choice - 1]);
				System.out.println("원하는 점수 입력하세요 : ");
				score[checkNum][choice - 1] = scan.nextInt();
				System.out.printf("%s학생의 %s점수가 %d점으로 변경되었습니다.\n\n", name[checkNum], title[choice],
						score[checkNum][choice - 1]);

				// 합계, 평균 구하기
				total[checkNum] = 0;
				for (int j = 0; j < 3; j++) {
					total[checkNum] += score[checkNum][j];
				}
				avg[checkNum] = total[checkNum] / 3.0;

				break;
			case 4:// 4. 등수 계산
				for (int i = 0; i < count; i++) {
					rankNum = 1;
					for (int j = 0; j < count; j++) {
						if (total[i] < total[j]) {
							rankNum++;
						}
					}
					rank[i] = rankNum;
				}
				System.out.println("등수 계산이 완료됐습니다.");
				break;

			case 0:// 0. 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break loop;

			}

		} // 무한반복while

	}

}
