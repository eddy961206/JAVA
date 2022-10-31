package p1031;

public class J1031_03_랜덤숫자2개출력 {

	public static void main(String[] args) {
		// 1-10 랜덤숫자 2개 생성해서 출력하시오
		int r_num = 0, r_num2 = 0, r_num3;

		for (int i = 0; i < 10000; i++) {
			r_num = (int) (Math.random() * 3) + 1;
			r_num2 = (int) (Math.random() * 3) + 1;
			r_num3 = (int) (Math.random() * 3) + 1;
			
			while (r_num == r_num2 || r_num == r_num3 || r_num2 == r_num3) {
				r_num2 = (int) (Math.random() * 3) + 1;
				r_num3 = (int) (Math.random() * 3) + 1;
			}
			
			System.out.println(r_num);
			System.out.println(r_num2);
			System.out.println(r_num3);
			System.out.println("--------------------------------");
		}
		

//		do {
//			r_num2 = (int)(Math.random()*10)+1;
//		}while(r_num==r_num2);
//			System.out.println(r_num);
//			System.out.println(r_num2);
//		do {
//			r_num2 = (int) (Math.random() * 10) + 1;
//		} while (r_num != r_num2);
//		System.out.println(r_num);
//		System.out.println(r_num2);

//		while (r_num==r_num2) {
//			r_num2 = (int)(Math.random()*2)+1;
//			System.out.println("재실행됨");
//		}

	}

}
