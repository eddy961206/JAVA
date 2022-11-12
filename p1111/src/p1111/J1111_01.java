package p1111;

import java.util.Scanner;

public class J1111_01 {
		public static void main(String[] args) {
			
			Child c = new Child();
			System.out.println(c.x); //자기 것부터 찾아보고 없으면 부모 거 뒤짐.
			c.method(); // 지역변수 -> 자기 인스턴스 변수 -> 조상 인스턴스 변수 순으로 찾음.
			
			Scanner scan = new Scanner(System.in);
			
		}
}
