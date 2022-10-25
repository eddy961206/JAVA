package p1021;

public class J1021_08 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		b = a++;
		System.out.println("b : " + b); //5
		System.out.println("a : " + a); //6
		
		int a2 = 5;
		int b2 = 0;
		b2 = ++a2;
		System.out.println("b2 : "+b2);
		System.out.println("a2 : "+a2);
	}

}
