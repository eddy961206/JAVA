package alone;

public class A1029 {

	public static void main(String[] args) {
		
		Print p1 = new Print("@@@@");
		p1.A();
		Print p2 = new Print("----");
		p2.B();

		
//		인스턴스(static X) -> 
//		인스턴스 변수,인스턴스 메소드,
//		클래스변수,클래스메소드 모두 다
//		조회/변경 가능.
//		
//		그러나 웬만하면 클래스변수와 메소드는 변경하지 마. 
//		설계도 변경하는 꼴. 다른 인스턴스들도 다 변경됨. 
//		변경하고 싶으면 애초에 클래스에 있는 
//		멤버(변수,메소드)들을 static 빼서
//		인스턴스 변수, 인스턴스 메소드로 만들어.
//		
//		클래스(static) -> 
//		인스턴스변수, 인스턴스메소드 조회/변경 불가능.
//		클래스 변수, 클래스 메소드끼리만 조회/변경 가능.
		
		
	}


}
