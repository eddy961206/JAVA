package p1108;

import java.util.Scanner;

public class J1108_08 {

	public static void main(String[] args) {
		// 두 수를 더하는 메소드 선언
		int[] result = new int[3]; // result에 주소 담겨져있음
		Cal cal = new Cal();
		for (int i : result) {
			System.out.println(i); // 0,0,0 (암것도 안넣었으니까)
		}

		cal.c(result);
		
		System.out.println("----------------------");
		for (int i : result) {
			System.out.println(i); // 100,200,300 (암것도 안넣었으니까)
		}

	}// main

}// class

class Cal {
	void c(int[] result) { // 주소를 받아왔기 때문에 바라보는 곳이 같아서 값이 수정됨. return 안돼도 저장.
		result[0] = 100;
		result[1] = 200;
		result[2] = 300;
	}
}