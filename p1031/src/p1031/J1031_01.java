package p1031;

import java.util.Scanner;

public class J1031_01 {

	public static void main(String[] args) {
		
		//두 수를 입력받아 작은 수 , 큰 수로 출력하시오
		int a = 0;
		int b = 0;
		int temp = 0;
		int temp2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.>>");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("작은 수: "+a);
		System.out.println("큰 수: "+b);
		
		//round(), ceil(), floor(),max(),min()
		temp = Math.min(a, b); //최솟값
		temp2 = Math.max(a, b); //최댓값
		
		System.out.println("작은 수: "+ temp);
		System.out.println("큰 수: "+ temp2);
		
		
		
//		int[] arr = { 1, 2, 3, 4, 5, 6 };
//		int sum = 0;
//		int multi = 1;
//		double avg = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//			multi *= arr[i];
//		}
//		avg = (double)sum/arr.length;
//
//		System.out.println(sum);
//		System.out.println(multi);
//		System.out.println(avg);
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
		
		
	}//main

}//class
