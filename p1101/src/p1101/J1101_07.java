package p1101;

import java.util.Arrays;

public class J1101_07 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int[] num2 = new int[10];
		// for 이용한 복사
		for(int i = 0; i<num.length; i++) {
			num2[i] = num[i];
		}
		
		// System.arraycopy() 를 이용한 복사
		int[] arr = {1,2,3,4,5};
		int[] arr2 = new int[10];
		arr2[0]=100;
		System.arraycopy(arr, 0, arr2, 1, arr.length);

		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
	}
	
}


