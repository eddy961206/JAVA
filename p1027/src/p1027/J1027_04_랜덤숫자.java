package p1027;

public class J1027_04_랜덤숫자 {

	public static void main(String[] args) {
		// 0.0 <= 		Math.random() 		< 1.0
		// 0.0 <= 		Math.random()*10 	< 10.0 
		// 0   <= (int)(Math.random()*10) 	< 10
		// 1   <= (int)(Math.random()*10)+1 < 11     ----> 1~10
		
		Math.random();
		System.out.println(Math.random()); 				// 0.0<= x <1.0
		System.out.println(Math.random()*10); 			// 0.0<= x <10.0
		System.out.println((int)(Math.random()*10)); 	// 0 <= x < 10 
		System.out.println((int)(Math.random()*10)+1);  // 1 <= x < 11
		System.out.println((int)(Math.random()*45)+1);  // 로또 1~45까지.
		
		
	}

}
