package p1027;

import java.util.Scanner;


public class J1027_06_성적처리심화 {

	public static void main(String[] args) {
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0;
		String name = "", grade ="";
		
		System.out.println("         [성적처리 프로그램]     ");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 종료");
		System.out.println("-----------------");
		System.out.println("원하는 번호를 입력하세요");
		choice = scan.nextInt(); // 여기서 엔터 치면
		scan.nextLine(); //여기로 엔터가 입력됨
		System.out.println("");
		
		switch(choice) {
		case 1:
			System.out.println("[[ 성적입력 ]]");
			System.out.println();
			// 성적입력
			System.out.println("이름? : ");
			name = scan.nextLine(); // 띄어쓰기, 엔터를 입력받기위해 scan.nextLine()을 쓰려면 
								    //직전에 빈 scan.nextLine()으로 엔터를 흡수해버려야.
			System.out.println("국어? : ");
			kor = scan.nextInt();
			System.out.println("영어? : ");
			eng = scan.nextInt();
			System.out.println("수학? : ");
			math = scan.nextInt();
			sum = kor + eng + math;
			avg = sum/3.0;
			// 학점비교
			if(avg>=90) {
				grade = "A";
				if(avg>=98) {
					grade += "+";
				} else if (avg<=92) {
					grade += "-";
				}
			} else if(avg>=80) {
				grade = "B";
				if(avg>=88) {
					grade += "+";
				} else if (avg<=82) {
					grade += "-";
				}
			} else if(avg>=70) {
				grade = "C";
				if(avg>=78) {
					grade += "+";
				} else if (avg<=72) {
					grade += "-";
				}
			} else if(avg>=60) {
				grade = "D";
				if(avg>=68) {
					grade += "+";
				} else if (avg<=62) {
					grade += "-";
				}
			} else {
				grade = "F";
			} //if
			//성적입력 끝
			break;
		case 2:
			System.out.println("[[ 성적출력 ]]	");
			System.out.println();
			//출력부분
			System.out.println("          [성적처리 프로그램]        ");
			System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t학점\n");
			System.out.println("----------------------------------------------------");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s", name, kor, eng, math, sum, avg, grade);
			//출력부분 끝
			break;
		case 3:
			System.out.println("");
			break;
		}//switch
		
	
		
		
		
		
		
		
		
		
		
	} //main

} //class
