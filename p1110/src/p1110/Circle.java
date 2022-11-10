package p1110;

public class Circle extends Shape {
	Point p; //원의 중심 //객체의 구성요소들 (원의 구성요소)
	int r; // 원의 반지름
	
	Circle() {
		Point p = new Point(0,0);
		this.p = p;
		this.r = 100;
//		this(new Point(0,0), 100);
	} //기본생성자. 매개변수에 암것도 안넣으면 중심(0,0) 반지름100으로 설정
	
	Circle(Point p, int r){
		this.p = p;
		this.r = r;
	}// 점 하나와 반지름을 요구하는 생성자
	
}
