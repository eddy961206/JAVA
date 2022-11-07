package p1107;

public class J1107_01 {

	public static void main(String[] args) {

		Tv t = new Tv(); // 객체 선언(인스턴스선언)
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		t.channel = 7;
		t2 = t;
		System.out.println(t2.channel);//7
		t2.channel = 80;
		System.out.println(t.channel);//80
		
		t3.channel = 5;
		System.out.println(t2.channel);//80
		t3.channel = t2.channel;
		System.out.println(t3.channel);//80
		t3.channel = 5;
		System.out.println(t2.channel); //80
		
//		t.color = null; // 원랜 null 들어가있음.
//		t.color = "white";
//		t.power = true;
//		t.channel = 7;
//		t.power(); //false 
//		t.channelUp(); // 8 됨
//		System.out.println(t.channel); //8
	}

}
