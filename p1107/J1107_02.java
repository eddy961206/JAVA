package p1107;

import java.util.Scanner;

public class J1107_02 {

	public static void main(String[] args) {

		int[] hour = new int[3];
		int[] minute = new int[3];
		int[] second = new int[3];

		
		// 시분초를 직접입력해서 출력하시오
		// 12:20:35, 1:40:20, 3:15:59
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < hour.length; i++) {
			System.out.println((i+1)+"번째 시간을 입력하세요 : ");
			hour[i] = scan.nextInt();
			System.out.println((i+1)+"번째 분을 입력하세요 : ");
			minute[i]= scan.nextInt();
			System.out.println((i+1)+"번째 초를 입력하세요 : ");
			second[i]= scan.nextInt();
			System.out.println("--------------------------");
		}
		for(int i = 0; i<3; i++) {
			System.out.printf("%d:%d:%d\n",hour[i],minute[i],second[i]);
		}

		
//		Time t1 = new Time();
//		Time t2 = new Time();
//		Time t3 = new Time();
//		
//		t1.print();
//		
		
		
		
		
		
//		hour[0] = 12;
//		minute[0] = 20;
//		second[0] = 35;
//		hour[1] = 1;
//		minute[1] = 40;
//		second[1] = 20;
//		System.out.printf("%d:%d:%d\n", hour[0], minute[0], second[0]);
//		System.out.printf("%d:%d:%d\n", hour[1], minute[1], second[1]);

	}

}
