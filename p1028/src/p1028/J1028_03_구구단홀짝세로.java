package p1028;

public class J1028_03_구구단홀짝세로 {

	public static void main(String[] args) {
		
		//구구단 세로 한줄당 한 단 표시
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d \t", j,i,i*j);
			}
			System.out.println();
		}
		
		
		
		
//		//뒷 자리가 짝수만 나오는 구구단
//		for(int i=2; i<=9;i++) {
//			System.out.println("["+i+"단]");
//			for(int j=1; j<=9;j++) {
////				if(j%2==1) {
////					continue;
////				}
////				System.out.printf("%d * %d = %d \n", i,j,i*j);
//				if(j%2==0) {
//					System.out.printf("%d * %d = %d \n", i,j,i*j);
//				}
//			}
//		}
	}

}
