package p1024;

import java.util.Scanner;

public class J1024_09_형변환_중요 {

	public static void main(String[] args) {
		// int -> String   7+"" = "7" 빈 문자열 더하면 숫자가 문자열로 바뀜
		// 숫자char -> int  '1' - '0' = 1 빼기 영하면 됨
		// String -> char  charAt();
        // String -> int 변경 : Integer.parseInt()
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력하세요");
		String input = scan.next();
		
		// !!!!!!!!!!!!!!!!! String -> int 변경 : Integer.parseInt() 사용.!!!!!!!!!!!!!!!!!!!!!
		int num = Integer.parseInt(input);
//		String input = scan.next(); 
		System.out.println("두 번째 숫자 입력하세요");
		int input2 = scan.nextInt();
		System.out.println("두 수의 합 : " + (num + input2));
	}

}
