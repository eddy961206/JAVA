package p1108;

public class J1108_12 {

	public static void main(String[] args) {
		// 오버로딩 - 매개변수의 타입 or 갯수 달라야
		
		String str = "love";
		int a = 1;
		Long l = 100000000000L;
		Double d = 0.25;
		System.out.println(str); // 메소드
		System.out.println(a); // 메소드
		System.out.println(l); // 메소드
		System.out.println(d); // 메소드
		// System.out.println()에 뭘 집어넣어도 다 되는 이유가 오버로딩 덕분. 
		// 다 다른 메소드임. 이름만 같.
		

	}

}
