package p1123;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class J1123_06_substring_나이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 880101-1101111
		// 생일이 12,1,2 - 겨울에 태어났습니다.
		// 3,4,5 - 봄 6,7,8 - 여름 9,10,11 - 가을

		String input = "";
		int year = 0;
		int age = 0;
		while (true) {
			System.out.println("주민번호를 입력하세요 >> ");
			input = scan.next();
			
			String birthYear = input.substring(0,2);
			char ch = input.charAt(7);
			System.out.println("출생년도 : "+birthYear);
			
			// 8자리 1,2 -> 1900년대생  3,4 -> 2000년대생
			
			LocalDate now = LocalDate.now();
//			LocalDateTime now2 = LocalDateTime.now();
			year = now.getYear();
			System.out.println("현재 연도 : "+ year);
			
			switch(ch) {
			
			case '1':
				age = year - (Integer.parseInt("19" + birthYear));
				System.out.println("당신은 남자이며 ");
				System.out.printf("나이는 [ %d ] 입니다",age);
				break;
			case '2':
				age = year - (Integer.parseInt("19" + birthYear));
				System.out.println("당신은 여자이며 ");
				System.out.printf("나이는 [ %d ] 입니다",age);
				break;
			case '3':
				age = year - (Integer.parseInt("20" + birthYear));
				System.out.println("당신은 남자이며 ");
				System.out.printf("나이는 [ %d ] 입니다",age);
			case '4':
				age = year - (Integer.parseInt("20" + birthYear));
				System.out.println("당신은 여자이며 ");
				System.out.printf("나이는 [ %d ] 입니다",age);
				
			}// switch
//			
//			int birthYearInt = Integer.parseInt(birthYear);
//			
//			// 주민번호
//			
//			String birth = input.substring(2, 4);
//			int birthInt = Integer.parseInt(birth);
//			System.out.println(birthInt);
//
//			if (3 <= birthInt && birthInt <= 5) {
//				System.out.println("봄에 태어났습니다.");
//			} else if (6 <= birthInt && birthInt <= 8) {
//				System.out.println("여름에 태어났습니다.");
//			} else if (9 <= birthInt && birthInt <= 11) {
//				System.out.println("가을에 태어났습니다.");
//			} else if (birthInt == 12 || birthInt >= 1 && birthInt <= 2) {
//				System.out.println("겨울에 태어났습니다.");
//			}
//			
//			
//			int old = 122 - birthYearInt;
//			System.out.println("나이 : "+(old+1));
//			
//			String genderString = "";
//			if(gender == 1) {
//				genderString = "남자";
//			} else if(gender == 2) {
//				genderString = "여자";
//			} else {
//				System.out.println("입력한 형식이 올바르지 않습니다.");
//			}
//			System.out.printf("당신은 %s이며, 나이는 %d 입니다.\n",genderString,(old+1));
//			
			
		}

//		String name = "Hello! How are you?";
//		String input = name.substring(7, 14);
//		System.out.println(input);
//		System.out.println(input.length());
	}

}
