package p1028;

public class J1028_07 {

	public static void main(String[] args) {

//		홀수만 더해서 200넘는 시점의 i,sum 출력
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 == 1) {
				if (sum > 200) {
					break;
				}
				sum += i; // 위치조심
//				System.out.printf("i:%d sum:%d \n",i,sum);   // 위치조심 //i:29 sum:225 
			}
			i++;
		}
		System.out.printf("i:%d sum:%d \n",i-2,sum);   // 위치조심 //i:29 sum:225 

////		while -> sum 200넘는 시점의 i,sum 출력
//		int i = 1;
//		int sum = 0;
//		while(i<=100) {
//			if(sum>200) {
//				break;
//			}
//			sum += i;
//			System.out.printf("i: %d, sum:%d\n",i,sum);
//			i++;
//		}
//		System.out.println(i-1);
//		System.out.println(sum);

//		int sum = 0;
//		int i = 0;
//		//50을 넘기기 전의 i sum?
//		for(i=1;i<=100;i++) {
//			if(sum>50) {
//				break;
//			}
//			sum += i;
//		}//for
//		System.out.println("i : "+(i-1-1)); //sum이 50을 넘기 직전 시점. 즉 9까지하면 45, 10까지 하면 55.
//		System.out.println("sum : "+(sum-(i-1))); //10->55 9->45니까 55-10.

//		for(i=1;i<=100;i++) {
//			if(sum>100) {
//				break;
//			}
//			sum += i;
//		}//for
//		System.out.println("i : "+(i-1));
//		System.out.println("sum : "+sum);
	}

}
