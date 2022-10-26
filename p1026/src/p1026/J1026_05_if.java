package p1026;

import java.util.Scanner;

public class J1026_05_if {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
        String str = "abc";
        String str3 = "abc";  // str == str3 하면 true나옴. 하지만 이렇게 하진 마. 애초에 String은 ""로 선언하는게 아닌데 예외로 둔거.
        String str2 = new String("abc");
        String str4 = new String("abc");  // str2 ==str4 하면 false 나옴. 주솟값이 저장
        
        if(str.equals(str2)) {      // String == String 안됨. String은 참조형변수. str.equals(str2)이렇게 해야. 
        	System.out.println("같습니다");
        } else {
        	System.out.println("다릅니다");
        }
        
        if(str.equalsIgnoreCase(str2)) {      // .equalsIgnoreCase() : 대소문자 구분없이 비교
        	System.out.println("같습니다");
        } else {
        	System.out.println("다릅니다");
        }
        
        
        System.out.println(str);
        System.out.println(str2);
		
		
//		System.out.println("프로그램을 종료하려면 x 또는 X를 입력하세요");
//		String input = scan.next();
//		char ch = input.charAt(0);      
//		if (ch == 'x' || ch == 'X') {
//			System.out.println("프로그램을 종료합니다");
//		} else {
//			System.out.println("프로그램 계속 실행합니다");
//		}
		

	}// main

}// class
