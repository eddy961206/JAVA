package p1108;

import java.util.Scanner;

public class J1108_09 {

	public static void main(String[] args) {
		// 두 수를 입력받아 두 수의 합곱차 계산 후 출력하시오
		// 두 수 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요 : ");
		int[] result = new int[3];
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println("------------------");
		
		Cal2 c = new Cal2();
		c.cal(a,b,result);
		
		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}
		
	}

}

class Cal2 {
	void cal(int a, int b, int[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		
//		return a+b, a-b, a*b // return값은 하나만 있어야 하니까 이건 안됨.
//							// 하지만 배열로 하는거는 주솟값 통해서 바뀌니까 리턴 없어도 됨.
	}
}

