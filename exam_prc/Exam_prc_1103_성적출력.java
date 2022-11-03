package exam_prc;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.print.DocFlavor.INPUT_STREAM;

public class Exam_prc_1103_성적출력 {

	public static void main(String[] args) {
		// 성적 출력
		Scanner scan = new Scanner(System.in);
		int choice = 0; // 메뉴 고를 용도로 switch 활용시 입력받은 값
		int count = 0; // 입력된 사람 수
		int rankNum = 0; // 등수
		int checkNo = 0;
		int flag = 0;
		String check = "";
		String[] name = new String[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];
		int[] rank = new int[10];

		// 무한반복
		loop: while (true) {

			System.out.println("[[ 성적 처리 프로그램 ]]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 계산");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();

			switch (choice) {
			case 1: // 1. 성적 입력
				System.out.println("[[ 성적 입력 ]]");
				while (count < 10) { // 최대 10명까지 반복입력
					System.out.println((count + 1) + "번째 학생 이름을 입력하세요 : (0.입력 취소)");
					check = scan.next();
					// 0 입력취소 눌렀는지 체크
					if (check.equals("0")) {
						System.out.println("성적 입력을 종료합니다.\n");
						break;
					}
					// 이름 입력
					name[count] = check;

					// 점수들 입력
					for (int i = 0; i < 3; i++) { // 과목 3개니까 3번 반복
						System.out.printf("%s 점수 입력하세요 : ", title[i + 1]);
						score[count][i] = scan.nextInt();
					}

					// 합계, 평균 계산
					for (int i = 0; i < 3; i++) { // 과목 3개니까 3번 반복
						total[count] += score[count][i];
						avg[count] = total[count] / 3.0;
					} // for

					System.out.printf("%s 학생의 점수 입력이 완료되었습니다.\n\n", name[count]);
					count++;
				} // while

				break;
			case 2: // 2. 성적 출력
				System.out.println("[[ 성적 출력 ]]");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
				System.out.println("-------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i], rank[i]);
				}
				System.out.println();
				break;
			case 3: // 3. 성적 수정
				System.out.println("[[ 성적 수정 ]]");
				System.out.println("수정할 학생의 이름을 입력하세요 : ");
				check = scan.next();

				// 조회되면
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) {
						checkNo = i;
						flag = 1;
					}
				} // for

				// 조회 안되면
				if (flag == 0) {
					System.out.println("해당 학생을 칮을 수 없습니다. 다시 시도하세요.");
					break;
				}

				flag = 0;

				System.out.printf("        [[%s 학생 성적 수정]]\n", name[checkNo]);
				System.out.println("1. 국어점수 수정");
				System.out.println("2. 영어점수 수정");
				System.out.println("3. 수학점수 수정");
				System.out.println("-----------------------");
				System.out.println("0. 수정 취소\n\n");
				System.out.println("원하는 번호를 입력하세요.");
				choice = scan.nextInt();

				if (choice == 0) {
					System.out.println("성적 수정을 취소합니다.");
					break;
				}

				// 점수 수정
				System.out.printf("현재 %s점수 : %d\n", title[choice], score[checkNo][choice - 1]);
				System.out.println("원하는 점수를 입력하세요 : ");
				score[checkNo][choice - 1] = scan.nextInt();
				System.out.printf("%s 학생의 %s 점수가 %d점으로 변경되었습니다.\n\n", name[checkNo], title[choice],
						score[checkNo][choice - 1]);

				// 합계, 평균 계산
				total[checkNo] = 0;
				for (int i = 0; i < 3; i++) { // 과목 3개니까 3번 반복
					total[checkNo] += score[checkNo][i];
					avg[checkNo] = total[checkNo] / 3.0;
				} // for

				break;// 성적 수정 자체 취소break
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
				break;
			case 0: // 0. 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}// 메인메뉴 선택 switch

		} // 무한반복 while

	}// main

}
// class
