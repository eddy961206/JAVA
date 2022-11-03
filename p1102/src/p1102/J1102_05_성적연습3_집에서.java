package p1102;

import java.util.Scanner;

public class J1102_05_성적연습3_집에서 {

	public static void main(String[] args) {

		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int flag = 0;
		String check = "";
		int checkNo = 0;
		int choice = 0;
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] name = new String[10];
		int[][] score = new int[10][10];
		int[] total = new int[10];
		double[] avg = new double[10];

		// 무한반복
		mainLoop: while (true) {
			System.out.println("  [[ 성적확인 프로그램 ]]  ");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			choice = scan.nextInt();

			// 메인화면에서 메뉴 고르기 switch
			switch (choice) {
			case 1: // 1. 성적 입력
				System.out.println("   [[ 성적 입력 ]]  ");
				while (count < name.length) { // name배열의 갯수만큼만 정보 입력가능

					System.out.printf("%d번째 이름을 입력하세요 : (0.이전 페이지 이동)\n", count + 1);
					check = scan.next();

					if (check.equals("0")) {
						System.out.println("성적 입력을 취소합니다. 이전 페이지로 이동합니다.\n\n");
						break;
					} // 0 눌렀다면 이전페이지 이동

					// 0 안눌렀으면 그대로 입력 진행
					name[count] = check;

					for (int i = 0; i < 3; i++) { // 인당 3번 점수입력 반복
						System.out.printf("%s 점수를 입력하세요 : \n", title[i + 1]);
						score[count][i] = scan.nextInt();
					} 
						// 합,평균 구하기
					for (int i = 0; i < 3; i++) {
						total[count] += score[count][i];
					}
					avg[count] = total[count] / 3.0;
					System.out.printf("%s 의 성적입력이 완료되었습니다.\n", name[count]);
					count++;
				} // 성적 반복입력 while
				break;

			case 2: // 2. 성적 출력
				System.out.println("   [[ 성적 출력 ]]  ");
				System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
				System.out.println("----------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i]);
				}

				System.out.println();

				break;
			case 3: // 3. 성적 수정
				System.out.println("   [[ 성적 수정 ]]  ");
				System.out.println("수정할 학생의 이름을 입력하세요 : ");
				check = scan.next();

				// 입력한 이름이 조회되는지 확인위한 반복
				for (int i = 0; i < count; i++) {
					// 조회되면 해당 인덱스넘버 가져옴
					if (check.equals(name[i])) {
						checkNo = i;
						flag = 1; // 조회 되면 flag를 0->1로 바꿈
						break; // 해당 인덱스 얻고 빠져나와
					} // if

				} // for

				if (flag == 0) { // 이름이 조회가 안된다면
					System.out.println("해당 이름이 존재하지 않습니다. 다시 시도하세요\n");
					break; // 이전단계로.
				}

				flag = 0; // 조회 됐든 안됐든 다음번 다시 사용하기위해 리셋.

				System.out.printf("%s 학생이 조회되었습니다\n", name[checkNo]);
				System.out.printf("[[ %s 학생 성적 수정 ]]\n", name[checkNo]);
				for (int i = 0; i < 3; i++) {
					System.out.printf((i + 1) + ". %s점수 수정\n", title[i + 1]);
				}
				System.out.println("0. 뒤로가기");
				System.out.println("----------------------------");
				System.out.println("원하는 번호를 입력하세요 : ");
				choice = scan.nextInt();

				// 성적수정 취소
				if (choice == 0) {
					System.out.println("수정을 취소합니다. 이전 페이지로 이동합니다.\n\n");
					break;
				}
				
				System.out.printf("현재 %s학생의 %s점수 : %d점 \n", name[checkNo], title[choice], score[checkNo][choice - 1]);

				System.out.println("변경 점수를 입력하세요 : ");
				score[checkNo][choice - 1] = scan.nextInt();
				System.out.printf("%s학생의 %s점수가 %d점으로 변경되었습니다.\n", name[checkNo], title[choice],
						score[checkNo][choice - 1]);
				//합계, 평균도 수정
				total[checkNo]=0;
				for (int i = 0; i < 3; i++) {
					total[checkNo] += score[checkNo][i];
				}
				avg[checkNo] = total[checkNo] / 3.0;
				
				

				break;
			case 0: // 0. 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break mainLoop;
			}// 메인화면에서 메뉴 고르기 switch

		} // 무한반복 while

	}// main

}// class