package p1102;

import java.util.Scanner;

public class J1102_01_성적출력_2차원배열활용 {

	public static void main(String[] args) {
		// 성적출력 프로그램
		// 1. 변수 선언
		// 2. 화면 출력
		// 3. 성적 입력
		// 4. 성적 출력

		// 1. 변수 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0; // switch 선택

		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] name = new String[10];
		int[][] score = new int[10][3]; // 10명x3과목
		int[] total = new int[10];
		double[] avg = new double[10];
		
		String check = ""; // 이전페이지 이동때
		int checkNo = 0; // 성적 수정 시 해당되는 학생의 index번호
		int flag = 0; // 성적 수정 시 이름 검색할 때 사용
		int count = 0; // 입력된 학생 수 (0,1,2..)

		// 무한반복
		loop: while (true) {
			// 2. 화면 출력
			System.out.println("   [성적처리 프로그램]     ");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 종료");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요 >> ");
			choice = scan.nextInt();

			// 2-1.메인화면 번호 선택
			switch (choice) {
			case 1: // 3. 성적 입력
				System.out.println("     [[ 성적 입력 ]]");
				// 성적 입력에 대한 프로그램 구성

				// 10번 반복
				while (count < 10) {
					System.out.println("이름을 입력하세요. (0. 이전페이지 이동) >> ");
					check = scan.next();
					if (check.equals("0")) { // 이름 입력받은 값이 0이니? 그럼 뒤로 돌아가
						System.out.println("이전 페이지로 이동합니다.\n");
						break; // 3번 성적 입력하는 while을 빠져나감
					} // if
					name[count] = check;

					// 점수 입력
					for (int i = 0; i < 3; i++) { // 3 과목이니까 3 까지
						System.out.printf("%s 점수를 입력하세요 >>\n", title[i + 1]);
						score[count][i] = scan.nextInt();
					} // for

					total[count] = score[count][0] + score[count][1] + score[count][2];
					avg[count] = total[count] / 3.0;

					System.out.println("성적 입력이 완료되었습니다.");

					count++;
				} // 성적입력 while

				break; // case1의 break.

			case 2: // 4. 성적 출력
				System.out.println("   [[ 성적 출력 ]]");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", title[0], title[1], title[2], title[3], title[4],
						title[5]);
				System.out.println("--------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i]);
				} // 출력 3번 반복 for
				break;

			case 3: // 5. 성적 수정

				System.out.println("   [[ 성적 수정 ]]  ");
				// 여러명 들어가 있으면 1.누구거 수정? - 2.어느 과목?
				System.out.println("수정할 학생의 이름을 입력하세요. >> ");
				check = scan.next();
				// name배열 ->10 ->count까지만 찾아
				for (int i = 0; i < count; i++) {
					if (check.equals(name[i])) { // 해당되는 학생이 있을 때 (flag를 1로 지정)
						checkNo = i;
						flag = 1;
						System.out.println("'" + name[i] + "'" + " 학생이 검색되었습니다.");
						break; // for문 break.
					}
				} // for

				// 해당되는 학생이 없을 때
				if (flag == 0) {
					System.out.println("해당되는 학생이 없습니다. 다시 검색하세요.>>");
					break;
				} // if

				// 국영수 점수 수정
				System.out.println("1. 국어 점수 수정");
				System.out.println("2. 영어 점수 수정");
				System.out.println("3. 수학 점수 수정");
				System.out.println("0. 취소");
				System.out.println("-------------------------------");
				System.out.println("수정할 과목을 선택하세요 >>");
				choice = scan.nextInt();
				flag = 0; // 검색 flag 0으로 다시 리셋
				// 수정할 프로그램 작성

				// 수정 취소
				if (choice == 0) {
					System.out.println("점수 수정이 취소되었습니다.\n");
					break; // switch case 3 나오는 break.
				}

				// 국어점수 choice = 1, 영어choice = 2, 수학choice = 3
				System.out.printf("현재 %s 점수 : %d \n", title[choice], score[checkNo][choice - 1]);
				System.out.printf("수정할 %s 점수 : ", title[choice]);
				score[checkNo][choice - 1] = scan.nextInt();
				total[checkNo] = score[checkNo][0] + score[checkNo][1] + score[checkNo][2];
				avg[checkNo] = total[checkNo] / 3.0;
				System.out.printf("%d 점으로 %s점수가 변경되었습니다!!\n", score[checkNo][choice - 1], title[choice]);

				break; // 메인 switch case 3의 break.

			case 0: // 시스템 종료
				System.out.println("  [[ 프로그램 종료 ]]  ");
				break loop;

			}// 메인화면 선택 switch

		} // 무한반복while

	}// main

}
// class
