package p1108;

public class J1108_06 {

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;

		int[] a = new int[3];
		a[0] = 111;
		a[1] = 112;
		a[2] = 113;
		
		a = num; // a에게 num의 주솟값을 넘겨줌. num의 것을 같이 바라보게 됨.
		a[0] = 1000;
		System.out.println(num[0]); //10
		
//		num[0] = a[0];
//		System.out.println(a[0]); //10

	}

}
