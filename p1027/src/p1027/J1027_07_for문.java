package p1027;

public class J1027_07_for문 {

	public static void main(String[] args) {
		
		//1~100까지 합 출력
		//1~100 홀수의 합, 회수 출력
		//1~100 까지의 합에서 sum이 100 넘어가는 시점의 i,sum을 출력하시오
		
		int sum = 0;
		int i = 0;
		for (i=1; i<=100; i++) {
			sum += i;
			if(sum>100) {//1 2 3 4 5
				break;	// 1 3 6 10 15
			}
		}
		System.out.printf("i: %d, sum: %d\n", i, sum);
		
		
//		int sum = 0;
//		int i = 0;
//		int count = 0;
//		for (i=1; i<=100; i++) {  //i+=2로만 해도 홀수만 가능
//			if(i%7==0) {
//				sum += i;
//				count++; //몇 번 실행하는지
//			}
//		}
//		System.out.printf("count: %d, i: %d, sum: %d \n",count, i-1,sum);
//		System.out.println(sum);
		
//		long sum = 0;
//		int i = 0;
//		for (i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.printf("i: %d, sum: %d \n",i,sum);
//		} 
//		System.out.printf("i: %d, sum: %d \n",i,sum); //for 밖에 있으면 i가 11로. i++마지막에 10이 11로 되니까.
	}

} 
