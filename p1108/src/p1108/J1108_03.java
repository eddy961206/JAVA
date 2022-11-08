package p1108;

public class J1108_03 {

	public static void main(String[] args) {
		// 3개의 수의 더하기 메소드를 만들어서
		// 3개의 수의 결괏값을 출력하시오.

		// 메소드 호출해서 결괏값 출력
		Method m = new Method();

//		m.input(m);
//		int result = m.add(m);
//		System.out.println("총 합: "+ result);

		int add = m.add(3, 6, 9);
		System.out.println("합: " + add);

		int substract = m.sub(3, 6, 9);
		System.out.println("차: " + substract);

		int multiply = m.multi(3, 6, 9);
		System.out.println("곱: " + multiply);

		double divide = m.div(3, 6, 9);
		System.out.println("나눗셈 : " + divide);

	}

}
