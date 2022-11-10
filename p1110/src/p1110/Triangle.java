package p1110;

public class Triangle extends Shape {
	Point[] p; // 객체의 구성요소. 삼각형이므로 3개의 꼭짓점이 담긴 배열을 필요로.

	Triangle() {
	} // 기본생성자

	Triangle(Point[] p) {
		this.p = p;
	} // 3개의 꼭짓점이 담긴 '배열'을 필요로 하는 생성자

	Triangle(Point p1, Point p2, Point p3) {
		Point[] p = { p1, p2, p3 }; // 방법1) 받은 3개의 꼭짓점을 배열에 집어넣
//		Point[] p = new Point[] { p1, p2, p3 }; // 방법2) 
//		Point[] p = new Point[3]; // 방법3)
//		p[0] = p1;
//		p[1] = p2;
//		p[2] = p3;

		this.p = p;
	} // 3개의 꼭짓점을 하나하나 입력받아야만 하는 생성자

}
