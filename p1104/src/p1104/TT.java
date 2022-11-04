package p1104;

public class TT {

	public static void main(String[] args) {

		int sum = 0;
		for(int num = 0; sum<100; num++) {
			sum += num;
		}
		
		
		int[]num = {1,2,3,4,5};
		for(int i: num) { //단순for문
			System.out.println(i);
		}
		
		
		int[] a = new int[3];
		int[] b = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		b = a;
		b[0] = 100;
		
		
		for(int i = 0; i<a.length; i++)
			System.out.println(a[i]);  //1,2,3
		
		for(int i = 0; i<b.length; i++)
			System.out.println(b[i]);  //100,2,3 !!!!!!!!!!!주소 중요
		
	}
		
		
	}


