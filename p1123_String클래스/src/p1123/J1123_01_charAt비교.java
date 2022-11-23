package p1123;

import java.util.Iterator;
import java.util.Scanner;

public class J1123_01_charAt비교 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		// 1조000000 ~ 9조999999
		// 랜덤으로 숫자를 생성 1~9 + "조" + (0~999999 랜덤번호)
		// 랜덤번호 생성후 출력 한번 해보세요.
		
		int ranNum = 0;
		ranNum = (int)(Math.random()*9+1);
		System.out.println(ranNum);
		String ranNum3 = String.format("%06d", (int)(Math.random()*1000000));
		
		//마지막 두 개 숫자만 입력을 해서 맞는 개수를 출력하시오
		System.out.println("숫자 6자리 입력하세요 : ");
		String input = scan.next();
		System.out.println("입력한 숫자 : "+input);
		System.out.printf("랜덤숫자 : %s \n", ranNum3);
		
		for(int i = 0; i<6; i++) {
			if(input.charAt(i)==ranNum3.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("맞은 갯수 : "+count);
		
		
//		System.out.println(ranNum3);
		
		
		
	}
}
