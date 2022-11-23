package p1123;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class J1123_07_순차정렬 {

	public static void main(String[] args) {

		String str = "abc";
		String str2 = String.valueOf("a");
		System.out.println(str);
		System.out.println(str2);
		
		
		Integer[] arr = {5,7,13,11,9,4,3,1};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		// 역순정렬
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		// 숫자 3개 입력받아 오름차순 순차정렬 해보세요
		// 15,10,5

//		Scanner scan = new Scanner(System.in);
//		int[] input = new int[3];
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("숫자 입력하세요 : ");
//			input[i] = scan.nextInt();
//		}
//
//		int maxNum = input[0] > input[1] ? input[0] : ((input[1] > input[2]) ? input[1] : input[2]);
//		System.out.println("최댓값 : " + maxNum);
//		int minNum = input[0]>input[1]?(input[1]>input[2]?input[2]:input[1]):input[1]; //이상함
//		System.out.println("최솟값 : " + minNum);
//		int total = input[0] + input[1] + input[2];
//		System.out.printf("%d,%d,%d \n",minNum, total -minNum-maxNum, maxNum);
//		
//		Arrays.sort(input);
//		for(int i = 0; i<input.length; i++) {
//			System.out.println(input[i]);
//		}
		
		
//		String name = "Rollins,81,91,99";
//		System.out.println(name);
//		System.out.println(name.replace(",","/"));

//		String name = "lee JungHo";
//		System.out.println(name);
//		System.out.println(name.trim());
//		System.out.println(name.replace(" ",""));

	}

}
