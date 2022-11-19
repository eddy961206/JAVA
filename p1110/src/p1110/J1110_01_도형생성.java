package p1110;


public class J1110_01_도형생성 {

	public static void main(String[] args) {
		Shape s = new Shape();
		
		// 객체 선언
		Circle c1 = new Circle();
		s.draw(c1); // 중심 0,0 반지름100인 기본원 그려짐. 기본생성자를 그렇게 설정했기 때문.
		//"중심 (0,0), 반지름 100인 원 입니다."로 출력.
		
		// 객체 선언
		Point p = new Point(150,150);
		Circle c2 = new Circle(p,50);
		s.draw(c2);
		
		// 점 3개 생성
		Point p1 = new Point(100,100);
		Point p2 = new Point(140,50);
		Point p3 = new Point(200,100);
		Point[] pp = {p1,p2,p3};
		
		Triangle t1 = new Triangle(pp);
		s.draw(t1);
		Triangle t2 = new Triangle(p1,p2,p3);
		s.draw(t2);
		//"꼭짓점이 (100,100), (140,50), (200,100) 인 삼각형입니다."로 출력됨

//		Point[] pp = new Point[3]; // 배열선언
//		pp[0] = new Point(100,100); // 객체선언
//		pp[1] = new Point(140,50);
//		pp[2] = new Point(200,100);
		
		
		
		
		
		
	}

}
