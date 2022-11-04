package p1104;

import java.util.Scanner;


public class J1104_01_객체시작 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.next();
		
		Tv t = new Tv();
		t.color = "white";
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		System.out.println(t.channel);
		
		
		
		
//	    Scanner는 클래스, 
//	    		scan은 객체변수 or 참조변수.
		int[] arr = new int[3];
		String str = new String("");
		//클래스는 new를 사용해야함(String은 예외)

		int ar2;
		
		// 8개 기본형 타입 - new 사용하지 않아도 사용가능
		int a = 0;
		double b = 0;
		
		
	}//main

}//class
