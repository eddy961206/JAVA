package p1111;

import java.util.*;

public class J1111_02_다형성정의 extends Object {

	public static void main(String[] args) {
		CaptionTv ctv1 = new CaptionTv();
		CaptionTv ctv2 = new CaptionTv();
		
		Tv t1 = new Tv();
		
		// 다형성 - 조상의 참조변수로(t2) 자손의 객체를(new CaptionTv()) 다루는 것
		Tv t2 = new CaptionTv(); 
//		CaptionTv t3 = new Tv(); // 반대로는 안돼.
		
		
		
	}

}
