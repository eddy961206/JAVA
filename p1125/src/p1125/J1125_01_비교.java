package p1125;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J1125_01_비교 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과Apple", 2000));
		list.add(new Fruit("오렌지Orange", 3000));
		list.add(new Fruit("바나나Banana", 1000));
		list.add(new Fruit("멜론Melon", 2500));

		loop: while (true) {
			System.out.println("\n[ 승택네 과일가게 ]");
			System.out.println("1. 과일명,가격 입력");
			System.out.println("2. 과일가격표 출력");
			System.out.println("3. 과일가격표 순차정렬");
			System.out.println("4. 과일가격표 역순정렬");
			System.out.println("5. 과일명 순차정렬");
			System.out.println("6. 과일명 역순정렬");
			System.out.println("0. 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 선택하세요. >> ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("[[ 과일명,가격 입력]]");
				break;
			case 2:
				System.out.println("[ 과일 상점 가격표 ]");
				System.out.println("과일명\t금액");
				System.out.println("-------------------------------");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("%s\t%d\n", list.get(i).name, list.get(i).price);
				}
			case 3:
				System.out.println("[[ 과일 가격 순차정렬 ]]");
				Collections.sort(list,new FruitPrice()); //비교대상,비교기준(Comparator)
				System.out.println("가격 순차정렬이 완료됐습니다.");
				break;
			case 4:
				System.out.println("[[ 과일 가격 역순정렬 ]]");
				Collections.sort(list,new FruitPrice().reversed()); //비교대상,비교기준(Comparator)
				System.out.println("가격 역순정렬이 완료됐습니다.");
				break;
			case 5:
				System.out.println("[[ 과일명 순차정렬 ]]");
				Collections.sort(list,new FruitName());
				System.out.println("과일명 순차정렬이 완료됐습니다.");
				break;
			case 6:
				System.out.println("[[ 과일명 역순정렬 ]]");
				Collections.sort(list,new FruitName().reversed());
				System.out.println("과일명 역순정렬이 완료됐습니다.");
				break;
			case 0:
				System.out.println("프로그램 종료합니다...");
				break loop;
			}//switch

		}//while
	}// main

}// class
