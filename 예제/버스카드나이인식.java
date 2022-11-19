package 예제;

import java.util.Scanner;

public class 버스카드나이인식 {

	public static String getRole(int age) {
		if (age <= 5) {
			return  "유아";
		} else if (age < 13) {
			return  "어린이";
		} else if (age < 18) {
			return  "청소년";
		} else {
			return  "성인";
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = input.nextInt();
		String role = getRole(age);
		System.out.println(role);
	}
}
