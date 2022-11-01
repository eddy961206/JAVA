package p1101;

import java.util.Scanner;

public class J1101_10_성적출력_배열활용_집에서 {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][3];
		String[] name = new String[3];
		String[] title = { "이름", "국어", "영어", "수학", "총합", "평균" };
		int[] total = new int[3];
		double[] avg = new double[3];
		int choice = 0, count = 0;

		// 무한반복
		loop:
		while (true) {
			System.out.println("[[성적 처리 프로그램]]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 종료");
			System.out.println("---------------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			choice = scan.nextInt();

			scoreloop: switch (choice) {

			case 1: // 성적 입력
				if (count < 3) { // 3명 이하까지만 성적입력 가능. count가 0,1,2 즉 2까지만.
					System.out.println("[[ 성적 입력 ]]");
					System.out.println();
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요 : (0. 이전페이지 이동)");
					name[count] = scan.next();
					if (name[count].equals("0")) {
						System.out.println("이전 페이지로 돌아갑니다.");
						System.out.println();
						break;
					}
					// 이름 한 번 입력했을 때 점수 3개 입력하는 for문
					for (int i = 0; i < 3; i++) {
						System.out.println(title[i + 1] + "과목의 점수를 입력하세요 : (0. 이전페이지 이동)");
						score[count][i] = scan.nextInt();
						if (score[count][i] == 0) {
							System.out.println("이전 페이지로 돌아갑니다.");
							System.out.println();
							break scoreloop;
						}
						System.out.println();
						total[count] += score[count][i];
					}
					avg[count] = total[count] / 3.0;
					System.out.printf("%s의 성적 입력이 완료됐습니다. 총 %d명 \n\n", name[count], count + 1);
					count++;
					break;
				} else {
					System.out.println("4명 이상 성적을 입력할 순 없습니다.");
					System.out.printf("이전 화면으로 돌아갑니다.\n\n");
					break;
				}

			case 2: // 성적 출력
				System.out.println();
				for (int i = 0; i < title.length; i++) {
					System.out.printf("%s\t", title[i]); // 표 제목 나란히 출력(이름 국어 영어 ...)
				}
				System.out.println();
				System.out.println("--------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t", name[i]); // 이름 출력
					for (int j = 0; j < 3; j++) {
						System.out.printf("%d\t", score[i][j]); // 국영수 점수 출력
					}
					System.out.printf("%d\t%.2f", total[i], avg[i]); // 총합,평균 따로 출력
					System.out.println();
				}
				System.out.println();
				break;

			case 3: // 성적 수정
				System.out.println("[[성적 수정]]");
				System.out.println();
				System.out.println("수정할 학생의 이름을 입력하세요 : ");
				String nameInput = scan.next();
				for (int i = 0; i < name.length; i++) {
					if (nameInput.equals(name[i])) {
						System.out.println("1.국어점수 수정");
						System.out.println("2.영어점수 수정");
						System.out.println("3.수학점수 수정");
						System.out.println("0.이전 화면으로 이동");
						System.out.println("----------------------");
						System.out.println("원하는 번호를 입력하세요");
						choice = scan.nextInt();
						switch (choice) {
						case 1:
							System.out.println("원하는 국어 점수를 입력하세요 : ");
							int editScore = scan.nextInt();
							score[i][0] = editScore;
							System.out.printf("'%s'의 국어점수가 '%d'로 변경됐습니다.", name[i], score[i][0]);
							total[i] = 0;
							for (int j = 0; j < score[i].length; j++) {
								total[i] += score[i][j];
							}
							avg[i] = total[i] / 3.0;
							break;
						case 2:
							System.out.println("원하는 영어 점수를 입력하세요 : ");
							editScore = scan.nextInt();
							score[i][1] = editScore;
							System.out.printf("'%s'의 영어점수가 '%d'로 변경됐습니다.", name[i], score[i][1]);
							total[i] = 0;
							for (int j = 0; j < score[i].length; j++) {
								total[i] += score[i][j];
							}
							avg[i] = total[i] / 3.0;
							break;
						case 3:
							System.out.println("원하는 수학 점수를 입력하세요 : ");
							editScore = scan.nextInt();
							score[i][2] = editScore;
							System.out.printf("'%s'의 수학점수가 '%d'로 변경됐습니다.", name[i], score[i][2]);
							total[i] = 0;
							for (int j = 0; j < score[i].length; j++) {
								total[i] += score[i][j];
							}
							avg[i] = total[i] / 3.0;
							break;
						case 0:
							System.out.println("이전 화면으로 돌아갑니다.>>");
							break;
						}
					}
				}
//				if (choice == 1) {
//
//				} else if (choice == 2) {
//
//				} else if (choice == 3) {
//
//				}
				break;
			case 0: // 나가기
				System.out.println(" [[  프로그램 종료  ]] ");
				break loop;
			}// 메인에서 고른 choice활용 switch문

		} // 무한반복 while끝

	}// main

}// class
