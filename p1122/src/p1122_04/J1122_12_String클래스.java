package p1122_04;

import java.util.Scanner;

public class J1122_12_String클래스 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = { " 홍 길동 ", "홍 길자", " 홍길순", "홍 길단", "결명 자", "길 ", " 동명 이", "순 대 " };
		String[] file = { "a.txt", "b.hwp", "c.doc", "d.txt", "e.txt", "f.psd", "g.pwp"};
		int flag = 0;
		int count = 0;

		
		for (int i = 0; i < file.length; i++) {
			if(file[i].endsWith("txt")) {
				System.out.println(file[i]);
				count++;
			}
		}
		
		System.out.println("txt 파일 개수 : "+count);
		
		
		
		
//		while (true) {
//			System.out.println("\n찾고자 하는 이름을 검색하세요.>>");
//			String search = scan.nextLine();
//
//			System.out.println("[ 검색된 이름 ]");
//			for (int i = 0; i < name.length; i++) {
//				if (name[i].contains(search)) {
//					System.out.println(name[i]);
//					flag = 1;
//				}
//			} // for
//			if (flag == 0) {
//				System.out.println("찾는 이름이 없습니다..");
//			}
//
//			flag = 0;
//		} // while

//		String str1 = "abc";
//		String str2 = "abc";
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		str1 += "c";
//		
//		System.out.println(str1); //abcc
//		System.out.println(str2); //abc
//		System.out.println(str1==str2); // 더하지 않았다면 true
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println(str3==str4); //false
	}
}
