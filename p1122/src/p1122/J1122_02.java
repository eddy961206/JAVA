package p1122;

import java.util.ArrayList;

public class J1122_02 {

	public static void main(String[] args) {
		
		Marine[] m = new Marine[3];
		for(int i = 0; i<m.length; i++) {
			m[i] = new Marine();
			m[i].move(50, 50);
		} //같은 마린끼리만 묶어서 이동가능.
		// 마린,탱크,드랍쉽 한꺼번에 이동은 불가.
		// 이 문제를 해결하려면 추상클래스 상속받아서 다형성 활용해야.
		
		Marine m1 = new Marine();
		Tank t1 = new Tank();
		Dropship d1 = new Dropship();
		
		m1.move(50, 50);
		t1.move(50, 50);
		d1.move(50, 50);
		
		
	}//main

}//class
