package p1108;

import java.util.Iterator;

public class J1108_07 {

	public static void main(String[] args) {

		// 크기 5인 배열을 num1, num2 만들어서 
		// num1 - 1,2,3,4,5 / num2 - 10,20,30,40,50 입력출력해
		
		int[] num1 = new int[5];
		int[] num2 =new int[5];
		
		for(int i = 0; i<num1.length; i++) {
			num1[i] = i+1; 
			num2[i] = (i+1)*10;
		}

		// num2 주소를 num1에 입력하고
		num1 = num2;
		
		// num1의 값을 100,200,300,400,500 으로 바꾸고
		for (int i = 0; i < num2.length; i++) {
			num1[i] = (i+1)*100;
		}
		
//		// num1,num2 모두 출력해.
//		for (int i = 0; i < 2; i++) {
//			System.out.printf("num%d : ");
//			for (int j = 0; j < num1.length; j++) {
//				System.out.printf("%d ",num1[j]);
//			}
//		}
//		
		
		
		System.out.printf("num1 :");
		for (int i = 0; i < num1.length; i++) {
			System.out.printf("%d ",num1[i]);
		}
		System.out.println();
		System.out.printf("num2 :");
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("%d ",num2[i]);
		}
		
		
		
	}

}
