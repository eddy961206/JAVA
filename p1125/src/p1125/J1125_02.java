package p1125;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J1125_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		ArrayList<Stu> list = new ArrayList<>();
		list.add(new Stu("홍길동", 284));
		list.add(new Stu("유관순", 290));
		list.add(new Stu("이순신", 295));
		list.add(new Stu("김구", 300));
		list.add(new Stu("김유신", 286));

		loop:
		while(true) {
			System.out.println("\n[[학생 학생 학생]]");
			System.out.println("1. 학생 출력");
			System.out.println("2. 학생 정렬");
			System.out.println("0.나가기");
			System.out.println("원하는 거 고르세요 : ");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1: 
				for(int i = 0; i<list.size(); i++) {
					System.out.printf("%s\t%d\n",list.get(i).name,list.get(i).total);
				}
				break;
			case 2:
				System.out.println("1. 이름 순차정렬");
				System.out.println("2. 이름 역순정렬");
				System.out.println("3. 합계 순차정렬");
				System.out.println("4. 합계 역순정렬");
				System.out.println("0.나가기");
				System.out.println("원하는 거 고르세요 : ");
				choice = scan.nextInt();
				
					switch(choice) {
					case 1 : 
						Collections.sort(list,new StuName());
						System.out.println("이름 순차정렬이 완료됐습니다.");
						break;
					case 2 : 
						Collections.sort(list,new StuName().reversed());
						System.out.println("이름 역순정렬이 완료됐습니다.");
						break;
					case 3 : 
						Collections.sort(list,new StuTotal());
						System.out.println("합계 순차정렬이 완료됐습니다.");
						break;
					case 4 : 
						Collections.sort(list,new StuTotal().reversed());
						System.out.println("합계 역순정렬이 완료됐습니다.");
						break;
					} // 내부 스위치
				break;
			case 0:
				System.out.println("프로그램 종료합니다...");
				break loop;
			}//switch
			
			
		}
		
		
		
		
		
	}

}
