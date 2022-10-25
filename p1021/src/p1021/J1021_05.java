package p1021;

public class J1021_05 {

	public static void main(String[] args) {
		byte b = 127;
//		byte c = 128; 에러
		int a = 2147483647; //int의 양의 한계치
		int num = a + 1;
		System.out.println(num); //2147483648이어야 하는데 오버플로우 현상땜에 int의 최솟값인 -2147483648로 넘어감
		
		System.out.println("-------------");
		int n1 = 1000000; 
		int n2 = 1000000;
		int n3 = 1000000;
		int result = n1*n2; 
		System.out.println(n1*n2/n3);  // 오버플로우 발생한 이후에 나눴기 때문에 -값 나옴
	}

}
