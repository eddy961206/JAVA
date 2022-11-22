package p1122_02;

public class J1122_05 {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		System.out.println(t1); //Tank
		t1.hitPoint -= 10; // 10만큼 탱크에 데미지 줌
		t1.hitPoint -= 10; // 10만큼 탱크에 데미지 줌
		t1.hitPoint -= 10; // 10만큼 탱크에 데미지 줌
		t1.hitPoint -= 10; // 10만큼 탱크에 데미지 줌
		System.out.println(t1);
		
		SCV s1 = new SCV();
		s1.repair(t1);
		System.out.println(t1);
		
		// 마린생성
		Marine m1 = new Marine();
		System.out.println(m1);
		m1.hitPoint -= 10;
		m1.hitPoint -= 10;
		m1.hitPoint -= 10;
		System.out.println(m1);
//		s1.repair(m1); // scv로는 마린 치료 불가. - scv가 Marine클릭하면 경고메세지 띄우면 됨.
		System.out.println(m1);
		
	}
}
