package p1123;

import java.util.ArrayList;

public class J1123_08_StringBuffer {

	public static void main(String[] args) {
		int a = 10;
		double b = 10.0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		
		
//		//3.567894;
//		// 숫자를 입력받아 소수점 3자리에서 반올림후 출력하시오
//		double input = 0.0;
//		Scanner scan = new Scanner(System.in);
//												
//		System.out.println("소숫점 숫자를 입력하세요 : ");
//		input = scan.nextDouble();
//		
//		double roundNum = Math.round(input*100)/100.0;
//		
//		System.out.println(roundNum);

//		// 15,10,5
//		Scanner scan = new Scanner(System.in);
//		int[] num = new int[3];
//		System.out.println("숫자 3개를 입력하세요 >> ");
//		for (int i = 0; i < num.length; i++) {
//			num[i] = scan.nextInt();
//		}
//		int maxNum = Math.max(num[0], Math.max(num[1], num[2]));
//		int minNum = Math.min(num[0], Math.min(num[1], num[2]));
//		int total = num[0] + num[1] + num[2];
//		System.out.printf("순서 : %d,%d,%d \n", minNum, total - minNum - maxNum, maxNum);

//		StringBuffer sb = new StringBuffer("01234567");
//		sb.append("890");
//		System.out.println(sb);
//		StringBuffer sb2 = sb.delete(1, 2);
//		System.out.println(sb);
//		System.out.println(sb2);
//		
//		sb.insert(2, "."); // 중간에 추가
//		System.out.println(sb);

//		String str = "abc";
//		str = "abc" + "d";
//		System.out.println("str : " + str);
//
//		StringBuffer sb = new StringBuffer("abc");
//		sb.append("d");
//		System.out.println("sb : " + sb);
//		//StringBuffer는 String과는 달리 새로 메모리를 만드는 게 아님. mutable함.
	}

}
