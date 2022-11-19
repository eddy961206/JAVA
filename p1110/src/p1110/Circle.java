package p1110;

public class Circle extends Shape {
	// 객체의 구성요소들 선언하기(원의 구성요소 - 원의 중심, 반지름)
	Point p; // 원의 중심
	int r; // 원의 반지름
	

	Circle() {
		this(new Point(0,0), 100);
//		Point p = new Point(0, 0);
//		this.p = p;
//		this.r = 100;
	} // 기본생성자. 매개변수에 암것도 안넣으면 중심(0,0) 반지름100으로 설정

	Circle(Point p, int r) {
		this.p = p;
		this.r = r;
		super.id = "중심 (" + p.x +","+p.y+")"+ ", 반지름 " + r + "인 원을 그립니다.";
	}// 점 하나와 반지름을 요구하는 생성자

}
