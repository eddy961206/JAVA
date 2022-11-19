package p1110;

public class Triangle extends Shape {
	Point[] p; // 객체의 구성요소. 삼각형이므로 3개의 꼭짓점이 담긴 배열을 필요로.

	Triangle() {
	} // 기본생성자

	Triangle(Point[] p) {
		this.p = p;
		super.id = "꼭짓점이 (" + p[0].x + "," + p[0].y + "), (" + p[1].x + "," + p[1].y + "), (" + p[2].x + "," + p[2].y
				+ ") 인 삼각형원을 그립니다.";

	} // 3개의 꼭짓점이 담긴 '배열'을 필요로 하는 생성자

	Triangle(Point p1, Point p2, Point p3) {
		Point[] p = { p1, p2, p3 }; // 방법1) 받은 3개의 꼭짓점을 배열에 집어넣
//		Point[] p = new Point[] { p1, p2, p3 }; // 방법2) 
//		Point[] p = new Point[3]; // 방법3)
//		p[0] = p1;
//		p[1] = p2;
//		p[2] = p3;
		super.id = "꼭짓점이 (" + p1.x + "," + p1.y + "), (" + p2.x + "," + p2.y + "), (" + p3.x + "," + p3.y
				+ ") 인 삼각형원을 그립니다.";

		this.p = p;
	} // 3개의 꼭짓점을 하나하나 입력받아야만 하는 생성자

}
