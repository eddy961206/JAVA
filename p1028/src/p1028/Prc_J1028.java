package p1028;

import java.awt.Choice;
import java.nio.file.FileSystemLoopException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Result {
	public int kor = 0;
	public int eng = 0;
	public int math = 0;

	public Result(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int sum() {
		int sum = this.kor + this.eng + this.math;
		return sum;
	}

	public double avg() {
		double avg = sum() / 3.0;
		return avg;
	}
}

public class Prc_J1028 {

	public static void main(String[] args) {
		// ------------------------------------------------------------------------------------------------//
//		// 구구단 홀수단만 (아래로 출력)
//		for (int i = 2; i <= 9; i++) {
////			if(i%2==0) {
////				continue;
////			}
////			System.out.println(" [" + i+ "]단 ");
//			for (int j = 2; j <= 9; j++) {
//				if (j % 2 == 0) {
//					continue;
//				}
//				System.out.printf("%d * %d = %d \t", j, i, i * j);
//			}
//			System.out.println();
//		}
		// ------------------------------------------------------------------------------------------------//

//		// 1~100 업다운겜
//		Scanner scan = new Scanner(System.in);
//		System.out.println("업다운겜");
//		int random = (int) (Math.random() * 100) + 1;
//		String wrong = "틀렸습니다!!";
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("숫자 1~100 사이 입력 : ");
//			int input = scan.nextInt();
//			if (random == input) {
//				System.out.println(input + " 정답입니다~");
//				break;
//			} else if (random > input && i != 10) {
//				System.out.println(wrong + " " + input + "보다 큽니다");
//			} else if (random < input && i != 10) {
//				System.out.println(wrong + " " + input + "보다 작습니다");
//			} else if (i == 10) {
//				System.out.println(wrong);
//				System.out.println("정답은 " + random + " 였습니다");
//			}
//			if (i != 10) {
//				System.out.println("남은 횟수 : " + (10 - i) + "번");
//			}
//		} // 1~100 업다운겜 끝
		// ------------------------------------------------------------------------------------------------/

//		//별만들기1
//		for(int i = 1; i<=11; i++) {
//			for(int j = 0; j<i; j++) {
//				System.out.print("*");		
//			}
//			System.out.println();
//		}
//		//별만들기2
//		for(int i = 0; i<=11; i++) {
//			for(int j = 0; j<=10-i; j++) {
//				System.out.print("*");		
//			}
//			System.out.println();
//		}
//		// 별만들기3(피라미드) 미완성
//		int i = 4;
//		int j = 3;
//		int n = 0;
//
//		for (i = 1; i <= 5; i++) {
//			for (j = 1; j <= 6 - i; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			System.out.println();
//		}

		// ------------------------------------------------------------------------------------------------//

//		//while 사용 10~1 출력
//		int i = 10;
//		while(i > 0) {
//			System.out.println(i);
//			i--;
//		}
//		//while 사용 1~10 출력
//		int j = 1;
//		while(j<=10) {
//			System.out.println(j);
//			j++;
//		}
		// ------------------------------------------------------------------------------------------------//

//		// 1~100까지 더할때 50넘기는 시점의 숫자와 그 합은?
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1부터 100까지 차례대로 더할 때 얼마 넘을 때를 알길 원해? : ");
//		int input = scan.nextInt();
//		int i = 0;
//		int sum = 0;
//		for (i = 1; i <= 20; i++) {
//			sum += i;
//			if (sum > input) {
//				System.out.println(input+ "이 넘어가기 직전의 합: " + (sum-i));
//				System.out.println(input+ "이 넘어가기 직전에 더해졌었던 수: " + (i-1));
//				System.out.println(input+"이 넘어갈 때 더해지는 수: " + i);
//				System.out.println(input + "이 넘어갔을 때의 합: " + sum);
//				break;
//			}
//		}

//		// 홀수만 더해서 200넘는 시점의 i,sum 출력
//		int i = 1;
//		int sum = 0;
//		while (i < 100) {
//			if (i % 2 == 1) {
//				if (sum > 200) {
//					break;
//				}
//				sum += i;
//			}
//			i++; 
//		}
//		System.out.printf("i:%d sum:%d \n",i-2,sum);   //i:29 sum:225 

//		// 1~10까지 3배수 빼고 출력
//		for (int i = 1; i <= 10; i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}

//		// 3,6,9단 제외한 구구단
//		for (int i = 2; i <= 9; i++) {
//			if(i%3==0) {
//				continue;
//			}
//			for (int j = 1; j < 9; j++) {
//				System.out.printf("%d * %d = %d\n", i,j,i*j);
//			}
//		}

		Scanner scan = new Scanner(System.in);

		String name = "";
		int kor = 0, eng = 0, math = 0, total = 0;
		double avg = 0.0;
		int choice = 0;

		loop: while (true) {
			System.out.println("         [성적처리 프로그램]     ");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 종료");
			System.out.println("-----------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 1: // 성적입력
				System.out.println("[[성적입력]]");
				System.out.println();
				System.out.println("이름을 입력하세요 : ");
				name = scan.next();
				System.out.println("국어 점수 입력하세요 : ");
				kor = scan.nextInt();
				System.out.println("영어 점수 입력하세요 : ");
				eng = scan.nextInt();
				System.out.println("수학 점수 입력하세요 : ");
				math = scan.nextInt();
				
				Result score = new Result(kor, eng, math);
				score.sum();
				score.avg();
				System.out.println("입력이 완료되었습니다.");
				System.out.println();
				break;
			case 2: // 성적출력
				Result score2 = new Result(kor, eng, math);
				System.out.println("        [[성적 출력]]        ");
				System.out.printf("이름\t국어\t영어\t수학\t총합\t평균\n");
				System.out.println("----------------------------------------------------");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", 
						name, kor, eng, math, score2.sum(), score2.avg());
				System.out.println();
				break;
			case 3: // 성적 수정
				System.out.println("        [[성적 수정]]        ");
				System.out.println("1. 국어 점수 수정");
				System.out.println("2. 영어 점수 수정");
				System.out.println("3. 수학 점수 수정");
				System.out.println("0. 이전 페이지로 돌아가기");
				System.out.println("--------------------");
				System.out.println("원하는 번호 선택하세요");
				choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("현재 국어 점수 : " + kor);
					System.out.println("변경할 점수 입력하세요 : ");
					kor = scan.nextInt();
					System.out.println("국어 점수가 "+kor+"(으)로 변경되었습니다");
					Result score3 = new Result(kor, eng, math);
					score3.sum();
					score3.avg();
					break;
				case 2:
					System.out.println("현재 영어 점수 : " + eng);
					System.out.println("변경할 점수 입력하세요 : ");
					eng = scan.nextInt();
					System.out.println("영어 점수가 "+eng+"(으)로  변경되었습니다");
					Result score4 = new Result(kor, eng, math);
					score4.sum();
					score4.avg();
					break;
				case 3:
					System.out.println("현재 수학 점수 : " + math);
					System.out.println("변경할 점수 입력하세요 : ");
					math = scan.nextInt();
					System.out.println("수학 점수가 "+math+"(으)로 변경되었습니다");
					Result score5 = new Result(kor, eng, math);
					score5.sum();
					score5.avg();
					break;
				case 0:
					System.out.println("이전 페이지로 돌아갑니다");
					System.out.println();
					break;
				}// case3 안의 성적수정 switch문 끝
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("[[프로그램 종료]]");
				break loop; 
			}
		}

	}// main

}// class
